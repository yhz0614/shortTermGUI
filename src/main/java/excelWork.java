import com.csvreader.CsvReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
public class excelWork {
    public static char separator=',';//分隔符
    public static  void main(String[] args) throws Exception{
        String filePath="E:\\IntelliJ IDEA\\shortTerm\\GUI\\persons.csv";
        List<String[]> dataList= new ArrayList<String[]>();
        //
        //dataList.add(new String[]{"账号","姓名","年龄","性别","身份证号","行程记录","疫苗接种情况","健康码颜色","核酸情况"});

    readCSV(filePath);
    }


    //读取CSV文件
    public static List<String[]> readCSV(String filePath) throws Exception {
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
}
