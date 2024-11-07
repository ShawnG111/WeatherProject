package excelNew;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.read.listener.ReadListener;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyListenerNew implements ReadListener<ExcelData> {
    private List<ExcelData> dataList = new ArrayList<>();
    private int i=1;

    ExecutorService threadPool = Executors.newFixedThreadPool(4);

    public void invoke(ExcelData data, AnalysisContext context){
        dataList.add(data);
        if(dataList.size() >= 100){
            List<ExcelData> d = new ArrayList<>();
            d.addAll(dataList);
            threadPool.execute(new Runnable(){
                public void run(){
                    for(ExcelData excelData :d){
                        CityJdbc.insert(excelData);
                    }
                }
            });
            i++;
            dataList.clear();
        }
    }

    public void doAfterAllAnalysed(AnalysisContext context){
        List<ExcelData> d = new ArrayList<>();
        d.addAll(dataList);
        threadPool.execute(new Runnable(){
            public void run(){
                for(ExcelData excelData :d){
                    CityJdbc.insert(excelData);
                }
            }
        });
    }
}
