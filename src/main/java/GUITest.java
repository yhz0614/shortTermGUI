import javax.swing.*;
import java.awt.*;

public class GUITest {
    public static void main(String[] args) {
        JFrame frame = new loginSpace("登录界面");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//窗口关闭退出程序
        frame.setSize(500, 600);//设置大小
        frame.setVisible(true);//显示窗口

    }
}

