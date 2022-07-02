import com.csvreader.CsvReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
public class excelWork {
    public static char separator=',';//分隔符
    public static  void main(String[] args) throws Exception{
        String filePath_persons="E:\\IntelliJ IDEA\\shortTerm\\GUI\\persons.csv";//人员数据
        String filepath_administrator="E:\\C++\\short_term\\administrator.csv";//管理员账户
        List<String[]> dataList= new ArrayList<String[]>();

    readPersonsCSV(filePath_persons);
    dataList=readAdministrator(filepath_administrator);

    }


    //读取CSV文件
    public static List<String[]> readPersonsCSV(String filePath) throws Exception {
        CsvReader read = null;
        List<String[]> dataList = new ArrayList<String[]>();
        try {
            read = new CsvReader(filePath, separator, Charset.forName("GBK"));
            //读表头
            read.readHeaders();
            String[] headArray = read.getHeaders();
            for(int i =0;i<9;i++){
            System.out.print(headArray[i]+" ");
            }
            System.out.println(" ");
            //读取数据
            while (read.readRecord()) {
                //System.out.println(read.getRawRecord());
                System.out.print(read.get(0)+"\t");
                System.out.print(read.get(1)+"\t");
                System.out.print(read.get(2)+"\t");
                System.out.print(read.get(3)+"\t");
                System.out.print(read.get(4)+"\t");
                System.out.print(read.get(5)+"\t");
                System.out.print(read.get(6)+"\t");
                System.out.print(read.get(7)+"\t");
                System.out.println(read.get(8));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if (read != null) {
                read.close();
            }
        }
    return dataList;

    }
    public static List<String[]> readAdministrator(String filePath) throws Exception {
        CsvReader read = null;
        List<String[]> AdministratorList = new ArrayList<String[]>();//存放账户
        try {
            read = new CsvReader(filePath, separator, Charset.forName("GBK"));
            //读表头
            read.readHeaders();
            //String[] headArray = read.getHeaders();
            System.out.println(" ");
            //读取数据
            while (read.readRecord()) {
                //System.out.println(read.getRawRecord());
                //System.out.print(read.get(0)+"\t");
                //AdministratorList.add(read.getValues());
                //System.out.print(read.get(1)+"\t\n");
                AdministratorList.add(read.getValues());
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if (read != null) {
                read.close();
            }
        }
        return AdministratorList;
}

}
