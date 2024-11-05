package excel;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.read.listener.ReadListener;
import com.alibaba.excel.util.ListUtils;

import java.util.List;


public class MyListener implements ReadListener<ExcelData> {
    private static final int BATCH_COUNT=100;
    private List<ExcelData> catchedDataList=ListUtils.newArrayListWithExpectedSize(BATCH_COUNT);

    public MyListener(){}

    public void invoke(ExcelData data, AnalysisContext context){
        catchedDataList.add(data);
        if(catchedDataList.size()>=BATCH_COUNT){
            System.out.println(catchedDataList);
            catchedDataList=ListUtils.newArrayListWithExpectedSize(BATCH_COUNT);
        }
    }

    public void doAfterAllAnalysed(AnalysisContext context){
        System.out.println(catchedDataList);
    }
}
