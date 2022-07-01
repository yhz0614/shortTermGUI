import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUITest {
    public static JTextField textField=new JTextField(20);
    public static void main(String[] args){
        JFrame frame=new JFrame("GUI example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//窗口关闭退出程序
        frame.setSize(400,500);//窗口大小
        frame.setLayout(new BorderLayout());//设置边框布局管理器
        JPanel panel =new JPanel();
        //frame.setContentPane(panel);
        frame.add(textField);
        textField.setText("请输入 ");
        JButton button =new JButton("111");
        frame.setLayout(null);
        panel.add(button);
        frame.add(panel);
        panel.setBounds(0,0,100,200);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                get();
            }
        });

        frame.setBounds(800,300,400,500);
        frame.setVisible(true);
    }
    public static void get(){
        String str=textField.getText();
        System.out.println(str);
    }
}
