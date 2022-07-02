import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class loginSpace extends JFrame{
    static String filepath_administrator="E:\\C++\\short_term\\administrator.csv";//administrator文件存放位置
    public loginSpace (String title){
        super(title);
        this.setLayout(null);
        JPanel jPanel1=new JPanel();
        JPanel jPanel2=new JPanel();
        JPanel jPanel4=new JPanel();
        JTextField account =new JTextField(100);
        JTextField password=new JTextField(100);
        JLabel countText=new JLabel();
        JLabel passText=new JLabel();
        countText.setText("账号");
        passText.setText("密码");
        JButton button =new JButton("登录");
        jPanel1.add(button);
        jPanel1.setBounds(160,230,30,30);
        jPanel2.add(countText);
        jPanel2.setBounds(120,170,30,30);
        account.setBounds(150,175,70,20);
        jPanel4.add(passText);
        jPanel4.setBounds(120,200,30,30);
        password.setBounds(150,205,70,20);
        this.add(jPanel1);
        this.add(jPanel2);
        this.add(account);
        this.add(jPanel4);
        this.add(password);
        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                List<String[]> dataList= new ArrayList<String[]>();
                boolean result=false;
                String ac=account.getText();//获取输入的账户
                String pa=password.getText();//获取输入的密码
                try {
                    dataList=excelWork.readAdministrator(filepath_administrator);//对账户密码进行匹配
                    for (String[] string : dataList) {
                        if(string[0].equals(ac) && string[1].equals(pa)){
                            result=true;
                            break;
                        }
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                if (result==true)
                    System.out.println("登录成功");
                else
                    System.out.println("用户名或密码错误");
            }
        });
        //JComboBox<String> province=new JComboBox<>();
        //frame.setBounds(800,300,400,500);
    }
}
