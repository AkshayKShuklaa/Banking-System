import java.awt.*;
import java.util.Random;
import javax.swing.*;

public class SignupOne extends JFrame
{
    JTextField nameTextField,fnameTextField,emailTextField,addressTextField,cityTextField,stateTextField,pincodeTextField;
    //JDateChooser dateChooser;
    JRadioButton male,female,married,unmarried,others;
    SignupOne()
    {
        setLayout(null);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);

        getContentPane().setBackground(Color.WHITE);

        Random ran =new Random();
        //JLabel formName=new JLabel("APPLICATION FORM NO. "+(int)(Math.random()*1000));
        Long formnumber=Math.abs((ran.nextLong()%9000L)+1000);
        JLabel formName=new JLabel("APPLICATION FORM NO. "+formnumber);
        formName.setBounds(140,20,600,40);
        formName.setFont(new Font("Raleway",Font.BOLD,38));
        add(formName);

        JLabel personalDetails=new JLabel("Page 1: Personal Details");
        personalDetails.setBounds(290,80,400,30);
        personalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        add(personalDetails);

        
        JLabel name=new JLabel("Name: ");
        name.setBounds(100,140,100,30);
        name.setFont(new Font("Ostwald",Font.BOLD,20));
        add(name);
        nameTextField=new JTextField();
        nameTextField.setFont(new Font("Raleway", Font.BOLD,14 ));
        nameTextField.setBounds(300,140,400,30);
        add(nameTextField);


        JLabel fname=new JLabel("Father's Name: ");
        fname.setBounds(100,190,200,30);
        fname.setFont(new Font("Ostwald",Font.BOLD,20));
        add(fname);
        fnameTextField=new JTextField();
        fnameTextField.setFont(new Font("Raleway", Font.BOLD,14 ));
        fnameTextField.setBounds(300,190,400,30);
        add(fnameTextField);


        JLabel dob=new JLabel("Date of Birth: ");
        dob.setBounds(100,240,200,30);
        dob.setFont(new Font("Ostwald",Font.BOLD,20));
        add(dob);
        /*dateChooser=new JDateChooser();
        dateChooser.setBounds(300,240,200,30);
        dateChooser.setForeground(new Color(105,105,105));
        add(dateChooser);*/


        JLabel gender=new JLabel("Gender: ");
        gender.setBounds(100,290,200,30);
        gender.setFont(new Font("Ostwald",Font.BOLD,20));
        add(gender);
        male=new JRadioButton("Male");
        female=new JRadioButton("Female");
        male.setBounds(300,290,60,30);
        female.setBounds(390,290,120,30);
        male.setBackground(Color.white);
        female.setBackground(Color.white);
        add(male);
        add(female);
        ButtonGroup genderGroup=new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

        JLabel email=new JLabel("Email Address");
        email.setBounds(100,340,200,30);
        email.setFont(new Font("Ostwald",Font.BOLD,20));
        add(email);
        emailTextField=new JTextField();
        emailTextField.setFont(new Font("Raleway", Font.BOLD,14 ));
        emailTextField.setBounds(300,340,400,30);
        add(emailTextField);


        JLabel marital=new JLabel("Marital Status");
        marital.setBounds(100,390,200,30);
        marital.setFont(new Font("Ostwald",Font.BOLD,20));
        add(marital);
        married=new JRadioButton("Married");
        married.setBounds(300,390,100,30);
        unmarried.setBounds(450,390,100,30);
        others.setBounds(630,390,100,30);
        unmarried=new JRadioButton("Unmarried");
        others=new JRadioButton("Other");
        ButtonGroup maritalButtonGroup=new ButtonGroup();
        maritalButtonGroup.add(married);
        maritalButtonGroup.add(unmarried);
        maritalButtonGroup.add(others);

        JLabel address=new JLabel("Address : ");
        address.setBounds(100,440,200,30);
        address.setFont(new Font("Ostwald",Font.BOLD,20));
        add(address);
        addressTextField=new JTextField();
        addressTextField.setFont(new Font("Raleway", Font.BOLD,14 ));
        addressTextField.setBounds(300,440,400,30);
        add(addressTextField);
        

        JLabel city=new JLabel("City: ");
        city.setBounds(100,490,200,30);
        city.setFont(new Font("Ostwald",Font.BOLD,20));
        add(city);
        cityTextField=new JTextField();
        cityTextField.setFont(new Font("Raleway", Font.BOLD,14 ));
        cityTextField.setBounds(300,490,200,30);
        add(cityTextField);

        JLabel state=new JLabel("State: ");
        state.setBounds(100,540,200,30);
        state.setFont(new Font("Ostwald",Font.BOLD,20));
        add(state);
        stateTextField=new JTextField();
        stateTextField.setFont(new Font("Raleway", Font.BOLD,14 ));
        stateTextField.setBounds(300,540,400,30);
        add(stateTextField);
        
        JLabel pincode=new JLabel("Pincode : ");
        pincode.setBounds(100,590,200,30);
        pincode.setFont(new Font("Ostwald",Font.BOLD,20));
        add(pincode);
        pincodeTextField=new JTextField();
        pincodeTextField.setFont(new Font("Raleway", Font.BOLD,14 ));
        pincodeTextField.setBounds(300,590,400,30);
        add(pincodeTextField);

        
        

        /*ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("logo.jpg"));
        Image i2=i1.getImage().getScaledInstance(10, 10, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel logolabel=new JLabel(i3);
        logolabel.setBounds(50,50,10,10);
        add(logolabel);*/


        
        

    }
    public static void main(String[] args) {
        new SignupOne();
    }
}
