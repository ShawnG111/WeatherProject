package excelNew;

import java.util.ArrayList;
import java.util.List;

public class MyThreadNew implements Runnable {
    private Thread thread;
    private String threadName;
    private List<ExcelData> dataList = new ArrayList<>();

    MyThreadNew(String threadName, List<ExcelData> dataList) {
        this.threadName = threadName;
        this.dataList = dataList;
    }

    public synchronized void run() {
        for(ExcelData data : dataList){
            CityJdbc.insert(data);
        }
    }
}
