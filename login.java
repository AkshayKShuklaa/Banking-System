
import java.awt.Image;
import javax.swing.*;
class login extends JFrame
{
    login()
    {
        setSize(800,300);
        setTitle("Automatic Teller Machine");
        setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("logo.jpg"));
        Image i2=i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);

        ImageIcon i3=new ImageIcon(i2);
        JLabel label=new JLabel(i3);

        setBounds(70,   10, 100, 100);

        add(label);
        setVisible(true);
        setLocation(350, 200);

    }
    public static void main(String[] args)
    {
        System.out.println("HELLO JAVA FSD");
        login ob=new login();
    }    
}