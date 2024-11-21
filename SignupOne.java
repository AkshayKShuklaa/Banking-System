import java.awt.*;
import javax.swing.*;
public class SignupOne extends JFrame
{
    SignupOne()
    {
        setLayout(null);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);

        getContentPane().setBackground(Color.WHITE);

        
        JLabel formName=new JLabel("APPLICATION FORM NO. "+(int)(Math.random()*1000));
        formName.setBounds(120,20,800,50);
        formName.setFont(new Font("Ostwald",Font.BOLD,40));

        JLabel name=new JLabel("Name: ");
        name.setBounds(10,200,300,20);
        name.setFont(new Font("Ostwald",Font.BOLD,20));
        add(name);

        JLabel phone=new JLabel("Father's Name: ");
        phone.setBounds(10,240,300,20);
        phone.setFont(new Font("Ostwald",Font.BOLD,20));
        add(phone);

        JLabel dob=new JLabel("Date of Birth: ");
        dob.setBounds(10,280,300,20);
        dob.setFont(new Font("Ostwald",Font.BOLD,20));
        add(dob);

        JLabel gender=new JLabel("Gender: ");
        gender.setBounds(10,320,300,20);
        gender.setFont(new Font("Ostwald",Font.BOLD,20));
        add(gender);

        JLabel email=new JLabel("Email Address");
        email.setBounds(10,360,300,20);
        email.setFont(new Font("Ostwald",Font.BOLD,20));
        add(email);

        JLabel maritial=new JLabel("Maritial Status");
        maritial.setBounds(10,400,300,20);
        maritial.setFont(new Font("Ostwald",Font.BOLD,20));
        add(maritial);

        JLabel address=new JLabel("Address : ");
        address.setBounds(10,440,300,20);
        address.setFont(new Font("Ostwald",Font.BOLD,20));
        add(address);

        JLabel city=new JLabel("City: ");
        city.setBounds(10,480,300,20);
        city.setFont(new Font("Ostwald",Font.BOLD,20));
        add(city);
        
        JLabel pincode=new JLabel("Pincode : ");
        pincode.setBounds(10,520,300,20);
        pincode.setFont(new Font("Ostwald",Font.BOLD,20));
        add(pincode);

        JLabel state=new JLabel("State: ");
        state.setBounds(10,560,300,20);
        state.setFont(new Font("Ostwald",Font.BOLD,20));
        add(state);
        

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("logo.jpg"));
        Image i2=i1.getImage().getScaledInstance(10, 10, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel logolabel=new JLabel(i3);
        logolabel.setBounds(50,50,10,10);
        add(logolabel);


        add(formName);
        

    }
    public static void main(String[] args) {
        new SignupOne();
    }
}
