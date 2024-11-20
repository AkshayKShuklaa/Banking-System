import java.awt.Color;
import javax.swing.*;
public class SignupOne extends JFrame
{
    SignupOne()
    {
        setSize(850,800);
        setLocation(350,11);
        setVisible(true);

        getContentPane().setBackground(Color.WHITE);
    }
    public static void main(String[] args) {
        new SignupOne();
    }
}
