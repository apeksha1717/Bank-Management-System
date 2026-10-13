package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {

    JRadioButton r1,r2, m1,m2,m3;
    JButton next;
    JTextField textName, textFname, textEmail, textMs, textAdd, textCity, textPincode, textState;

    JDateChooser dateChooser;

    Random ran = new Random();

    long first4 = (ran.nextLong() % 9000L) + 1000L;

    String first = " " + Math.abs(first4);

    Signup(){

        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(80,80,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,80,80);
        add(image);

        JLabel label1 = new JLabel ("APPLICATION NO."+first);
        label1.setBounds(140,20,600,40);
        label1.setFont(new Font("Ralway",Font.BOLD,32));
        add(label1);

        JLabel label2 = new JLabel ("Page 1");
        label2.setBounds(330,65,600,30);
        label2.setFont(new Font("Ralway",Font.BOLD,20));
        add(label2);

        JLabel label3 = new JLabel ("Personal Details");
        label3.setBounds(285,90,600,30);
        label3.setFont(new Font("Ralway",Font.BOLD,20));
        add(label3);

        JLabel labelName = new JLabel ("Name:");
        labelName.setBounds(80,130,150,30);
        labelName.setFont(new Font("Ralway",Font.BOLD,18));
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Raleway", Font.BOLD,14));
        textName.setBounds(280,130,400,30);
        add(textName);

        JLabel labelfName = new JLabel ("Father's Name:");
        labelfName.setBounds(80,175,200,30);
        labelfName.setFont(new Font("Ralway",Font.BOLD,18));
        add(labelfName);

        textFname = new JTextField();
        textFname.setFont(new Font("Raleway", Font.BOLD,14));
        textFname.setBounds(280,175,400,30);
        add(textFname);

        JLabel DOB = new JLabel ("Date Of Birth:");
        DOB.setBounds(80,265,200,30);
        DOB.setFont(new Font("Ralway",Font.BOLD,18));
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(280,265,400,30);
        add(dateChooser);

        JLabel labelG = new JLabel("Gender");
        labelG.setBounds(80,220,200,30);
        labelG.setFont(new Font("Ralway",Font.BOLD,20));
        add(labelG);


        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway", Font.BOLD,14));
        r1.setBackground(new Color(222,255,228));
        r1.setBounds(280,220,70,30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway", Font.BOLD,14));
        r2.setBackground(new Color(222,255,228));
        r2.setBounds(400,220,90,30);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel labelEmail = new JLabel("Email address:");
        labelEmail.setBounds(80,310,200,30);
        labelEmail.setFont(new Font("Ralway",Font.BOLD,18));
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway", Font.BOLD,14));
        textEmail.setBounds(280,310,400,30);
        add(textEmail);

        JLabel labelMs = new JLabel("Married Status:");
        labelMs.setBounds(80,355,200,30);
        labelMs.setFont(new Font("Ralway",Font.BOLD,18));
        add(labelMs);

        m1 = new JRadioButton("Married");
        m1.setBounds(280,355,100,30);
        m1.setBackground(new Color(222,255,228));
        m1.setFont(new Font("Raleway", Font.BOLD,14));
        add(m1);

        m2 = new JRadioButton("Unmarried");
        m2.setBackground(new Color(222,255,228));
        m2.setBounds(400,355,100,30);
        m2.setFont(new Font("Raleway", Font.BOLD,14));
        add(m2);

        m3 = new JRadioButton("Other");
        m3.setBackground(new Color(222,255,228));
        m3.setBounds(530,355,100,30);
        m3.setFont(new Font("Raleway", Font.BOLD,14));
        add(m3);



        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(m1);
        buttonGroup1.add(m2);
        buttonGroup1.add(m3);


        JLabel labelAdd = new JLabel("Address:");
        labelAdd.setBounds(80,400,200,30);
        labelAdd.setFont(new Font("Ralway",Font.BOLD,18));
        add(labelAdd);

        textAdd = new JTextField();
        textAdd.setFont(new Font("Raleway", Font.BOLD,14));
        textAdd.setBounds(280,400,400,30);
        add(textAdd);

        JLabel labelCity = new JLabel("City:");
        labelCity.setBounds(80,445,200,30);
        labelCity.setFont(new Font("Ralway",Font.BOLD,18));
        add(labelCity);

        textCity = new JTextField();
        textCity.setFont(new Font("Raleway", Font.BOLD,14));
        textCity.setBounds(280,445,400,30);
        add(textCity);

        JLabel labelPincode = new JLabel("Pin Code:");
        labelPincode.setBounds(80,490,200,30);
        labelPincode.setFont(new Font("Ralway",Font.BOLD,18));
        add(labelPincode);

        textPincode = new JTextField();
        textPincode.setFont(new Font("Raleway", Font.BOLD,14));
        textPincode.setBounds(280,490,400,30);
        add(textPincode);

        JLabel labelState = new JLabel("State:");
        labelState.setBounds(80,535,200,30);
        labelState.setFont(new Font("Ralway",Font.BOLD,18));
        add(labelState);

        textState = new JTextField();
        textState.setFont(new Font("Raleway", Font.BOLD,14));
        textState.setBounds(280,535,400,30);
        add(textState);

        next = new JButton("Next");
        next.setBounds(580,590,100,35);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Ralway",Font.BOLD,16));
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(new Color(222,255, 228));
        setLayout(null);
        setSize(750,680);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {


        String formno = first;
        String name = textName.getText();
        String fname = textFname.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(r1.isSelected()) {
            gender = "male";
        }else if(r2.isSelected()){
            gender = "female";
        }
        String email = textEmail.getText();
        String marital = null;
        if(m1.isSelected()) {
            marital = "married";
        }else if(m2.isSelected()){
            marital = "unmarried";
        }else if(m3.isSelected()){
            marital = "other";
        }
        String address = textAdd.getText();
        String city = textCity.getText();
        String pincode = textPincode.getText();
        String state = textState.getText();

        try{
            if(textName.getText().equals("")){
                JOptionPane.showMessageDialog(null,"fill all the fields");
            }else{
                Conn con1 = new Conn();
                String q = "insert into signup values('"+formno+"' , '"+name+"', '"+fname+"', '"+dob+"', '"+gender+"' , '"+email+"', '"+marital+"', '"+address+"', '"+city+"', '"+pincode+"', '"+state+"')";
                con1.statement.executeUpdate(q);
                new Signup2(first);
                setVisible(false);
            }

        }catch(Exception E){
            E.printStackTrace();
        }


    }

    public static void main(String[]args){
        new Signup();
    }
}
