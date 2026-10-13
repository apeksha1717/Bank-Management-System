package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Mini extends JFrame implements ActionListener {

    String pin;
    JButton button;

    Mini(String pin) {
        this.pin = pin;

        getContentPane().setBackground(new Color(255, 204, 204));
        setSize(400, 600);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel label1 = new JLabel();
        label1.setBounds(20, 140, 350, 240);
        label1.setFont(new Font("Monospaced", Font.PLAIN, 12));
        add(label1);

        JLabel label2 = new JLabel("TechCoder A.V");
        label2.setFont(new Font("System", Font.BOLD, 15));
        label2.setBounds(120, 20, 200, 20);
        add(label2);

        JLabel label3 = new JLabel();
        label3.setBounds(20, 80, 350, 20);
        add(label3);

        JLabel label4 = new JLabel();
        label4.setBounds(20, 400, 350, 20);
        label4.setFont(new Font("System", Font.BOLD, 14));
        add(label4);

        try {
            Conn c = new Conn();

            ResultSet resultSet = c.statement.executeQuery(
                    "SELECT * FROM login WHERE pin = '" + pin + "'"
            );

            while (resultSet.next()) {
                String cardNumber = resultSet.getString("card_number");

                if (cardNumber != null && cardNumber.length() >= 16) {
                    label3.setText("Card Number: "
                            + cardNumber.substring(0, 4)
                            + "XXXXXXXX"
                            + cardNumber.substring(12));
                } else {
                    label3.setText("Card Number: " + cardNumber);
                }
            }

            resultSet.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            int balance = 0;

            Conn c = new Conn();

            ResultSet resultSet = c.statement.executeQuery(
                    "SELECT * FROM bank WHERE pin = '" + pin + "'"
            );

            StringBuilder statement = new StringBuilder("<html>");

            while (resultSet.next()) {

                String date = resultSet.getString("date");
                String type = resultSet.getString("type");
                int amount = Integer.parseInt(resultSet.getString("amount"));

                statement.append(date)
                        .append("&nbsp;&nbsp;")
                        .append(type)
                        .append("&nbsp;&nbsp;Rs.")
                        .append(amount)
                        .append("<br><br>");

                if (type.equalsIgnoreCase("Deposit")) {
                    balance += amount;
                } else {
                    balance -= amount;
                }
            }

            statement.append("</html>");
            label1.setText(statement.toString());

            resultSet.close();

            label4.setText("Your Total Balance is Rs. " + balance);

        } catch (Exception e) {
            e.printStackTrace();
        }

        button = new JButton("Exit");
        button.setBounds(20, 500, 100, 25);
        button.addActionListener(this);
        button.setBackground(Color.BLACK);
        button.setForeground(Color.WHITE);
        add(button);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            setVisible(false);
            dispose();
        }
    }

    public static void main(String[] args) {
        new Mini("");
    }
}

