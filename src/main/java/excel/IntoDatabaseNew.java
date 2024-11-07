package excel;
import com.alibaba.excel.EasyExcel;

import java.util.concurrent.atomic.AtomicInteger;

public class IntoDatabaseNew {

    public static AtomicInteger count = new AtomicInteger(0);

    public static void main(String[] args) {
        String fileName = "C:\\华博\\AMap_adcode_citycode.xlsx";
        EasyExcel.read(fileName,ExcelData.class,new MyListenerNew()).sheet().doRead();

        long l1 = System.currentTimeMillis();
        for(int i=0; i<3; i++){
            new Thread(new MyThread(String.valueOf(i))).start();
        }
        while(Thread.activeCount() > 3){
            Thread.yield();
        }
        long l2 = System.currentTimeMillis();
        System.out.println("写入用时"+(l2-l1)/1000.0+"秒");

    }

}
