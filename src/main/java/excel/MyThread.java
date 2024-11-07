package excel;

import static excel.MyListener.dataList;

public class MyThread implements Runnable {
    private Thread thread;
    private String threadName;

    MyThread(String threadName) {
        this.threadName = threadName;
    }

    public synchronized void run() {
        while(true){
            int num = IntoDatabase.count.getAndIncrement();
            if(num >= dataList.size()){
                break;
            }
            CityJdbc.insert(dataList.get(num));
        }
    }
}
