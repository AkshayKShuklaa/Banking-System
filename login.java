
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class login extends JFrame implements ActionListener
{
    JButton loginButton, clearButton, signupButton;
    JTextField cardTextField;
    JPasswordField pinTextField;
    login()
    {
        
        setTitle("Automatic Teller Machine");

        setLayout(null);
        setSize(800,400);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("logo.jpg"));
        Image i2=i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);

        ImageIcon i3=new ImageIcon(i2);
        JLabel label=new JLabel(i3);
        label.setBounds(70,   10, 100, 100);
        add(label);

        JLabel text=new JLabel("WELCOME TO ATM");
        text.setFont(new Font("Osward",Font.BOLD,40));
        text.setBounds(200,40,400,40);
        add(text);

        JLabel cardno=new JLabel("Card Number:");
        cardno.setFont(new Font("Osward",Font.BOLD,28));
        cardno.setBounds(120,150,200,30);
        add(cardno);

        cardTextField=new JTextField();
        cardTextField.setBounds(320,150,250,30);
        cardTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(cardTextField);

        JLabel pin=new JLabel("Enter pin:");
        pin.setFont(new Font("Osward",Font.BOLD,28));
        pin.setBounds(120,220,400,30);
        add(pin);
        
        
        pinTextField=new JPasswordField();
        pinTextField.setBounds(320,220,250,30);
        pinTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(pinTextField);

        loginButton=new JButton("LOGIN");
        loginButton.setBounds(320,260,100,40);
        loginButton.setBackground(Color.BLACK);
        loginButton.setForeground(Color.WHITE);
        add(loginButton);
        loginButton.addActionListener(this);

        clearButton=new JButton("CLEAR");
        clearButton.setBounds(470,260,100,40);
        clearButton.setBackground(Color.BLACK);
        clearButton.setForeground(Color.WHITE);
        add(clearButton);
        clearButton.addActionListener(this);

        signupButton=new JButton("SIGN UP");
        signupButton.setBounds(320,310,250,40);
        signupButton.setBackground(Color.BLACK);
        signupButton.setForeground(Color.WHITE);
        add(signupButton);
        signupButton.addActionListener(this);

        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
        setLocation(350, 200);

    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==clearButton)
        {
            cardTextField.setText("");
            pinTextField.setText("");
        }
        else if(ae.getSource()==loginButton)
        {

        }
        else if(ae.getSource()==signupButton)
        {
            setVisible(false);
            new SignupOne().setVisible(true);
        }
    }
    public static void main(String[] args)
    {
        System.out.println("HELLO JAVA FSD");
        new login();
    }    
}