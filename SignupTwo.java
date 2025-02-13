import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class SignupTwo extends JFrame implements ActionListener
{
    JTextField nameTextField,categoryTextField,panTextField,aadharTextField,seniorCitizenTextField;
    
    JRadioButton sYes,sNo,eYes,eNo,married,unmarried;
    JButton nextButton,resetButton;
    JComboBox religionComboBox, categoryComboBox , incomeComboBox, educationComboBox, occupationComboBox;
    String formno;

    SignupTwo(String formno)
    {
        this.formno=formno;
        setTitle("NEW APPLICATION FORM - PAGE 2");
        setLayout(null);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);

        getContentPane().setBackground(Color.WHITE);

        JLabel additionalDetails=new JLabel("Page 2: Additional Details");
        additionalDetails.setBounds(290,80,400,30);
        additionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        add(additionalDetails);

        
        JLabel religion=new JLabel("Religion: ");
        religion.setBounds(100,140,200,30);
        religion.setFont(new Font("Ostwald",Font.BOLD,20));
        add(religion);
        religionComboBox=new JComboBox(new String[]{"Hindu","Muslim","Christian","Sikh","Jain","Buddhist","Other"});
        religionComboBox.setBounds(300,140,400,30);
        religionComboBox.setBackground(Color.white);
        add(religionComboBox);
        


        JLabel category=new JLabel("Category: ");
        category.setBounds(100,190,200,30);
        category.setFont(new Font("Ostwald",Font.BOLD,20));
        add(category);
        categoryComboBox=new JComboBox(new String[]{"General","OBC","SC","ST","Other"});
        categoryComboBox.setFont(new Font("Raleway", Font.BOLD,14 ));
        categoryComboBox.setBounds(300,190,400,30);
        categoryComboBox.setBackground(Color.white);
        add(categoryComboBox);


        JLabel income=new JLabel("Income: ");
        income.setBounds(100,240,200,30);
        income.setFont(new Font("Ostwald",Font.BOLD,20));
        add(income);
        incomeComboBox=new JComboBox(new String[]{"<1,50,000","<2,50,000","<5,00,000","<10,00,000",">=10,00,000"});
        incomeComboBox.setBounds(300,240,400,30);
        incomeComboBox.setForeground(new Color(105,105,105));
        add(incomeComboBox);
        


        JLabel educational=new JLabel("Educational");
        educational.setBounds(100,290,200,30);
        educational.setFont(new Font("Ostwald",Font.BOLD,20));
        add(educational);

        JLabel qualification=new JLabel("Qualifications: ");
        qualification.setBounds(100,315,200,30);
        qualification.setFont(new Font("Ostwald",Font.BOLD,20));
        add(qualification);

        educationComboBox=new JComboBox(new String[]{"Non-Graduate","Graduate","Post-Graduation","Doctrate","Others"});
        educationComboBox.setBounds(300,315,400,30);
        add(educationComboBox);


        JLabel occupation=new JLabel("Occupation: ");
        occupation.setBounds(100,390,200,30);
        occupation.setFont(new Font("Ostwald",Font.BOLD,20));
        add(occupation);
        
        occupationComboBox=new JComboBox(new String[]{"Salaried", "Self-Employed", "Businessman", "Student", "Retired", "Others"});
        occupationComboBox.setBounds(300, 390, 200, 30);
        occupation.setBackground(Color.WHITE);
        add(occupationComboBox);

        JLabel pan=new JLabel("PAN Number: ");
        pan.setBounds(100,440,200,30);
        pan.setFont(new Font("Ostwald",Font.BOLD,20));
        add(pan);
        panTextField=new JTextField();
        panTextField.setFont(new Font("Raleway", Font.BOLD,14 ));
        panTextField.setBounds(300,440,400,30);
        add(panTextField);
        

        JLabel aadhar=new JLabel("Aadhar Number: ");
        aadhar.setBounds(100,490,200,30);
        aadhar.setFont(new Font("Ostwald",Font.BOLD,20));
        add(aadhar);
        aadharTextField=new JTextField();
        aadharTextField.setFont(new Font("Raleway", Font.BOLD,14 ));
        aadharTextField.setBounds(300,490,400,30);
        add(aadharTextField);


        JLabel seniorCitizen=new JLabel("Senior Citizen: ");
        seniorCitizen.setBounds(100,540,200,30);
        seniorCitizen.setFont(new Font("Ostwald",Font.BOLD,20));
        add(seniorCitizen);
        
        sYes=new JRadioButton("Yes");
        sYes.setBounds(300, 540, 100, 30);
        sYes.setBackground(Color.WHITE);
        add(sYes);

        sNo=new JRadioButton("No");
        sNo.setBounds(500, 540, 100, 30);
        sNo.setBackground(Color.WHITE);
        add(sNo);

        ButtonGroup seniorCitizenGroup = new ButtonGroup();
        seniorCitizenGroup.add(sYes);
        seniorCitizenGroup.add(sNo);

        
        JLabel pincode=new JLabel("Existing Account: ");
        pincode.setBounds(100,590,200,30);
        pincode.setFont(new Font("Ostwald",Font.BOLD,20));
        add(pincode);


        eYes=new JRadioButton("Yes");
        eYes.setBounds(300, 590, 100, 30);
        eYes.setBackground(Color.WHITE);
        add(eYes);

        eNo=new JRadioButton("No");
        eNo.setBounds(500, 590, 100, 30);
        eNo.setBackground(Color.WHITE);
        add(eNo);

        ButtonGroup eAccountGroup=new ButtonGroup();
        eAccountGroup.add(eYes);
        eAccountGroup.add(eNo);

        
        

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
        
        String sReligion=religionComboBox.getSelectedItem().toString();
        String sCategory=categoryComboBox.getSelectedItem().toString();
        String sIncome= incomeComboBox.getSelectedItem().toString();
        
        String sEducation=educationComboBox.getSelectedItem().toString();
        String sOccupation=occupationComboBox.getSelectedItem().toString();
        
        String sSeniorCitizen=null;
        if(sYes.isSelected()){
            sSeniorCitizen="Yes";
        }
        else if(sNo.isSelected()){
            sSeniorCitizen="No";
        }
        String sExistingAccount=null;
        if(eYes.isSelected()){
            sExistingAccount="Yes";
        }
        else if(eNo.isSelected()){
            sExistingAccount="No";
        }   
        String sPan=panTextField.getText();
        String sAadhar=aadharTextField.getText();
        
        try {
            //while(name.equals("")||category.equals("")||income.equals("")||educational.equals(null)||education.equals("")||occupation.equals("")||pan.equals("")||aadhar.equals("")||seniorCitizen.equals("")||pin.equals(""))
            //{
               /*  if(name.equals(""))
                JOptionPane.showMessageDialog(null, "Name is required");
                else if(category.equals(""))
                JOptionPane.showMessageDialog(null, "Father's name is required");
                else if(income.equals(""))
                JOptionPane.showMessageDialog(null, "DOB is required");
                else if(educational.equals(""))
                JOptionPane.showMessageDialog(null, "Gender is required");
                else if(education.equals(""))
                JOptionPane.showMessageDialog(null, "Email is required");
                else if(occupation.equals(""))
                JOptionPane.showMessageDialog(null, "Marital Status is required");
                else if(pan.equals(""))
                JOptionPane.showMessageDialog(null, "Address is required");
                else if(aadhar.equals(""))
                JOptionPane.showMessageDialog(null, "City is required");
                else if(seniorCitizen.equals(""))
                JOptionPane.showMessageDialog(null, "State is required");
                else if(pin.equals(""))
                JOptionPane.showMessageDialog(null, "PIN is required");
                else
                {*/
                    Conn c=new Conn();
                    String query="INSERT INTO SIGNUPTWO VALUES('"+formno+"','"+sReligion+"','"+sCategory+"','"+sIncome+"','"+sEducation+"','"+sOccupation+"','"+sPan+"','"+sAadhar+"','"+sSeniorCitizen+"','"+sExistingAccount+"')";
                    
                    c.s.executeUpdate(query);

                    //SignupThree s=new SignupThree(formno);
                    JOptionPane.showMessageDialog(null, "Data inserted successfully");
                    c.s.close();
                    
               /*  }*/

            //}
            
        } catch (Exception e) {
            System.out.println(e);
        }
        if(ae.getSource()==resetButton)
        {
            nameTextField.setText("");
            categoryTextField.setText("");
            educationComboBox.setSelectedItem("pan"); 
            panTextField.setText("");
            aadharTextField.setText("");
            seniorCitizenTextField.setText("");
            eYes.setSelected(false);
            eNo.setSelected(false);
            sYes.setSelected(false);
            sNo.setSelected(false);
        }
        else if(ae.getSource()==nextButton)
        {

        }
    }
    public static void main(String[] args) {
        new SignupTwo("");
    }
}
