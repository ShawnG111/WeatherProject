package excel;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.read.listener.ReadListener;

public class MyListenerNew implements ReadListener<ExcelData> {
    public void invoke(ExcelData data, AnalysisContext context){
        CityJdbc.insert(data);
    }

    public void doAfterAllAnalysed(AnalysisContext context){}
}
