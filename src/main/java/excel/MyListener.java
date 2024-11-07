package excel;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.read.listener.ReadListener;

import java.util.ArrayList;
import java.util.List;

public class MyListener implements ReadListener<ExcelData> {
    public static List<ExcelData> dataList = new ArrayList<ExcelData>();

    public void invoke(ExcelData data, AnalysisContext context){
        dataList.add(data);
    }

    public void doAfterAllAnalysed(AnalysisContext context){}
}
