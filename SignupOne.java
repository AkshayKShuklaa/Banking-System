import java.awt.*;

import java.util.Random;
import javax.swing.*;
import java.awt.event.*;
import com.toedter.calendar.JDateChooser;
import java.awt.font.FontRenderContext;
import javax.lang.model.util.ElementScanner14;
public class SignupOne extends JFrame implements ActionListener
{
    JTextField nameTextField,fnameTextField,emailTextField,addressTextField,cityTextField,stateTextField,pincodeTextField;
    JDateChooser dateChooser;
    JRadioButton male,female,married,unmarried,others;
    JButton nextButton,resetButton;
    Long formnumber=0L;

    SignupOne()
    {
        setLayout(null);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);

        getContentPane().setBackground(Color.WHITE);

        Random ran =new Random();
        //JLabel formName=new JLabel("APPLICATION FORM NO. "+(int)(Math.random()*1000));
        formnumber=Math.abs((ran.nextLong()%9000L)+1000);
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
        dateChooser=new JDateChooser();
        dateChooser.setBounds(300,240,400,30);
        dateChooser.setForeground(new Color(105,105,105));
        add(dateChooser);
        


        JLabel gender=new JLabel("Gender: ");
        gender.setBounds(100,290,200,30);
        gender.setFont(new Font("Ostwald",Font.BOLD,20));
        add(gender);
        male=new JRadioButton("Male");
        female=new JRadioButton("Female");
        male.setBounds(300,290,60,30);
        female.setBounds(410,290,120,30);
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
        unmarried=new JRadioButton("Unmarried");
        others=new JRadioButton("Other");
        married.setBackground(Color.white);
        unmarried.setBackground(Color.white);
        others.setBackground(Color.white);
        married.setBounds(300,390,100,30);
        unmarried.setBounds(450,390,100,30);
        others.setBounds(630,390,100,30);
        add(married);
        add(unmarried);
        add(others);

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
        cityTextField.setBounds(300,490,400,30);
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

        
        System.out.println("Running till here");

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("logo.jpg"));
        Image i2=i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel logolabel=new JLabel(i3);
        logolabel.setBounds(20,10,200,200);
        add(logolabel);

        nextButton=new JButton("Next");
        nextButton.setBounds(510,650,190,30);
        nextButton.setBackground(Color.white);
        nextButton.setForeground(Color.black);
        nextButton.setFont(new Font("Raleway",Font.BOLD,14));
        //nextButton.addActionListener(this);
        
        add(nextButton);
        
        resetButton=new JButton("Reset");
        resetButton.setForeground(Color.black);
        resetButton.setBackground(Color.white);
        resetButton.setBounds(300,650,190,30);
        resetButton.setFont(new Font("Raleway",Font.BOLD,14));
        add(resetButton);

        nextButton.addActionListener(this);
        resetButton.addActionListener(this);

    }
    public void actionPerformed(ActionEvent ae)
    {
        String formno=formnumber.toString();
        String name=nameTextField.getText();
        String fname=fnameTextField.getText();
        String dob= dateChooser.getDateFormatString();
        //String dob=((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender="";
        if(male.isSelected()) gender="Male";
        else gender="Female";
        String email=emailTextField.getText();
        String marital="";
        if(married.isSelected()) marital="Married";
        else if(unmarried.isSelected()) marital="Unmarried";
        else marital="Others";
        String address=addressTextField.getText();
        String city=cityTextField.getText();
        String state=stateTextField.getText();
        String pin=pincodeTextField.getText();
        if(ae.getSource()==nextButton)
        {
        try {
            //while(name.equals("")||fname.equals("")||dob.equals("")||gender.equals(null)||email.equals("")||marital.equals("")||address.equals("")||city.equals("")||state.equals("")||pin.equals(""))
            //{
                if(name.equals(""))
                JOptionPane.showMessageDialog(null, "Name is required");
                else if(fname.equals(""))
                JOptionPane.showMessageDialog(null, "Father's name is required");
                else if(dob.equals(""))
                JOptionPane.showMessageDialog(null, "DOB is required");
                else if(gender.equals(""))
                JOptionPane.showMessageDialog(null, "Gender is required");
                else if(email.equals(""))
                JOptionPane.showMessageDialog(null, "Email is required");
                else if(marital.equals(""))
                JOptionPane.showMessageDialog(null, "Marital Status is required");
                else if(address.equals(""))
                JOptionPane.showMessageDialog(null, "Address is required");
                else if(city.equals(""))
                JOptionPane.showMessageDialog(null, "City is required");
                else if(state.equals(""))
                JOptionPane.showMessageDialog(null, "State is required");
                else if(pin.equals(""))
                JOptionPane.showMessageDialog(null, "PIN is required");
                else
                {
                    Conn c=new Conn();
                    String query="INSERT INTO SIGNUP VALUES('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pin+"','"+state+"')";
                    //create table signup(formno varchar(20), name varchar(20),father_name varchar(20), dob varchar(20), gender varchar(20), email varchar(30), marital varchar(20), address varchar(50), city varchar(25), pincode varchar(20), state varchar(25));
                    c.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "Data inserted successfully");
                    c.s.close();
                    setVisible(false);

                    new SignupTwo(formno).setVisible(true);
                }

            //}
            
            } 
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
        if(ae.getSource()==resetButton)
        {
            nameTextField.setText("");
            fnameTextField.setText("");
            emailTextField.setText("");
            addressTextField.setText("");
            cityTextField.setText("");
            stateTextField.setText("");
            pincodeTextField.setText("");
            married.setSelected(false);
            unmarried.setSelected(false);
            others.setSelected(false);
            male.setSelected(false);
            female.setSelected(false);
            others.setSelected(false);
        }
        
    }
    public static void main(String[] args) {
        new SignupOne();
    }
}
