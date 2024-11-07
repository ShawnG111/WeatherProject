package excelNew;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.read.listener.ReadListener;

import java.util.ArrayList;
import java.util.List;

public class MyListenerNew implements ReadListener<ExcelData> {
    private List<ExcelData> dataList = new ArrayList<>();
    private int i=1;

    public void invoke(ExcelData data, AnalysisContext context){
        dataList.add(data);
        if(dataList.size() >= 100){
            List<ExcelData> d = new ArrayList<>();
            d.addAll(dataList);
            new Thread(new MyThreadNew(String.valueOf(i), d)).start();
            i++;
            dataList.clear();
        }
    }

    public void doAfterAllAnalysed(AnalysisContext context){
        List<ExcelData> d = new ArrayList<>();
        d.addAll(dataList);
        new Thread(new MyThreadNew(String.valueOf(i), d)).start();
    }
}
