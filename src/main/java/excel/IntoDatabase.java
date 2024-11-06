package excel;
import com.alibaba.excel.EasyExcel;

public class IntoDatabase {

    public static void main(String[] args) {
        String fileName = "C:\\华博\\AMap_adcode_citycode.xlsx";
        EasyExcel.read(fileName,ExcelData.class,new MyListenerNew()).sheet().doRead();
    }

}
