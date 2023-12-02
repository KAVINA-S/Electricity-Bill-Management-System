package swing;

import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BillGenerating extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_3;
    private JLabel Success;
    private JLabel Warning;
    private JPasswordField passwordField;
    private JComboBox<String> comboBox;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    BillGenerating frame = new BillGenerating();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public BillGenerating() {
        setTitle("Bill Generator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 890, 671);
        contentPane = new JPanel();
        contentPane.setForeground(Color.BLACK);
        contentPane.setBackground(new Color(143, 235, 239));

        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Calculate Electricity Bill");
        lblNewLabel.setForeground(Color.CYAN);
        lblNewLabel.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 30));
        lblNewLabel.setBounds(212, 40, 414, 42);
        contentPane.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Meter Number");
        lblNewLabel_1.setForeground(new Color(0, 0, 0));
        lblNewLabel_1.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 17));
        lblNewLabel_1.setBounds(181, 210, 152, 25);
        contentPane.add(lblNewLabel_1);

        JLabel lblNewLabel_1_1 = new JLabel("User Name");
        lblNewLabel_1_1.setForeground(new Color(0, 0, 0));
        lblNewLabel_1_1.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 17));
        lblNewLabel_1_1.setBounds(181, 253, 152, 25);
        contentPane.add(lblNewLabel_1_1);

        JLabel lblNewLabel_1_2 = new JLabel("Password");
        lblNewLabel_1_2.setForeground(new Color(0, 0, 0));
        lblNewLabel_1_2.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 17));
        lblNewLabel_1_2.setBounds(181, 308, 152, 25);
        contentPane.add(lblNewLabel_1_2);

        JLabel lblNewLabel_1_3 = new JLabel("Units Consumed");
        lblNewLabel_1_3.setForeground(new Color(0, 0, 0));
        lblNewLabel_1_3.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 17));
        lblNewLabel_1_3.setBounds(181, 360, 152, 32);
        contentPane.add(lblNewLabel_1_3);

        JLabel lblNewLabel_1_4 = new JLabel("Month");
        lblNewLabel_1_4.setForeground(new Color(0, 0, 0));
        lblNewLabel_1_4.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 17));
        lblNewLabel_1_4.setBounds(181, 413, 152, 25);
        contentPane.add(lblNewLabel_1_4);

        JLabel lblNewLabel_2 = new JLabel(":");
        lblNewLabel_2.setForeground(Color.BLACK);
        lblNewLabel_2.setFont(new Font("Century Schoolbook", Font.BOLD, 17));
        lblNewLabel_2.setBounds(350, 210, 15, 14);
        contentPane.add(lblNewLabel_2);

        JLabel lblNewLabel_2_2 = new JLabel(":");
        lblNewLabel_2_2.setForeground(Color.BLACK);
        lblNewLabel_2_2.setFont(new Font("Century Schoolbook", Font.BOLD, 17));
        lblNewLabel_2_2.setBounds(350, 313, 15, 14);
        contentPane.add(lblNewLabel_2_2);

        JLabel lblNewLabel_2_3 = new JLabel(":");
        lblNewLabel_2_3.setForeground(Color.BLACK);
        lblNewLabel_2_3.setFont(new Font("Century Schoolbook", Font.BOLD, 17));
        lblNewLabel_2_3.setBounds(350, 362, 15, 28);
        contentPane.add(lblNewLabel_2_3);

        JLabel lblNewLabel_2_4 = new JLabel(":");
        lblNewLabel_2_4.setForeground(Color.BLACK);
        lblNewLabel_2_4.setFont(new Font("Century Schoolbook", Font.BOLD, 17));
        lblNewLabel_2_4.setBounds(357, 417, 15, 14);
        contentPane.add(lblNewLabel_2_4);

        textField = new JTextField();
        textField.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 17));
        textField.setBounds(377, 203, 256, 32);
        contentPane.add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 17));
        textField_1.setBounds(377, 253, 256, 32);
        contentPane.add(textField_1);
        textField_1.setColumns(10);

        textField_3 = new JTextField();
        textField_3.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 17));
        textField_3.setColumns(10);
        textField_3.setBounds(376, 362, 257, 30);
        contentPane.add(textField_3);

        comboBox = new JComboBox<>();
        comboBox.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 17));
        comboBox.setModel(new DefaultComboBoxModel<>(new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));
        comboBox.setBounds(377, 410, 256, 31);
        contentPane.add(comboBox);

        Success = new JLabel("");
        Success.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 23));
        Success.setForeground(new Color(0, 0, 0));
        Success.setBounds(155, 117, 513, 42);
        contentPane.add(Success);

        Warning = new JLabel("");
        Warning.setForeground(Color.RED);
        Warning.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 23));
        Warning.setBounds(203, 117, 513, 42);
        contentPane.add(Warning);

        passwordField = new JPasswordField();
        passwordField.setBounds(377, 308, 256, 30);
        contentPane.add(passwordField);

        JButton btnNewButton = new JButton("Submit");
        btnNewButton.setBackground(Color.black);
        btnNewButton.setForeground(Color.white);
        btnNewButton.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 17));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                generateBill();
            }
        });
        btnNewButton.setBounds(396, 474, 111, 30);
        contentPane.add(btnNewButton);

        JButton btnCancel = new JButton("Clear");
        btnCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                clearFields();
            }
        });
        btnCancel.setForeground(Color.WHITE);
        btnCancel.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 17));
        btnCancel.setBackground(Color.BLACK);
        btnCancel.setBounds(560, 474, 111, 30);
        contentPane.add(btnCancel);

        JButton btnCancel_1 = new JButton("Back");
        btnCancel_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                dispose();
                Home b = new Home();
                b.show();
            }
        });
        btnCancel_1.setForeground(Color.WHITE);
        btnCancel_1.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 17));
        btnCancel_1.setBackground(Color.BLACK);
        btnCancel_1.setBounds(489, 536, 111, 30);
        contentPane.add(btnCancel_1);

        JLabel lblNewLabel_3 = new JLabel("New label");
        lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\admin\\Downloads\\R.jpg"));
        lblNewLabel_3.setBounds(0, 0, 874, 632);
        contentPane.add(lblNewLabel_3);
    }

    private double calculateTotalAmount(int unitsConsumed) {
        double totalAmount = 0;

        if (unitsConsumed <= 100) {
            totalAmount = unitsConsumed * 5.0;
        } else if (unitsConsumed <= 200) {
            totalAmount = 100 * 5.0 + (unitsConsumed - 100) * 7.0;
        } else {
            totalAmount = 100 * 5.0 + 100 * 7.0 + (unitsConsumed - 200) * 10.0;
        }

        return totalAmount;
    }

    private void saveToDatabase(int MeterNumber, int unitsConsumed, double totalAmount) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/electricity_bill_management_system";
        String user = "root";
        String password = "Kavina112286";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            String query = "INSERT INTO GeneratingBill (MeterNumber, UserName, Password, UnitsConsumed, Month) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setInt(1, Integer.parseInt(textField.getText()));
                preparedStatement.setString(2, textField_1.getText());
                preparedStatement.setString(3, passwordField.getText());
                preparedStatement.setInt(4, Integer.parseInt(textField_3.getText()));
                preparedStatement.setString(5, comboBox.getSelectedItem().toString());
                preparedStatement.executeUpdate();
            }
        }
    }

    private void showBillReceipt(int consumerId, int unitsConsumed, double totalAmount) {
        String receipt = "Electricity Bill Receipt\n\n" +
                "Consumer ID: " + consumerId + "\n" +
                "Units Consumed: " + unitsConsumed + "\n" +
                "Total Amount: Rs. " + totalAmount;

        JOptionPane.showMessageDialog(this, receipt, "Bill Receipt", JOptionPane.INFORMATION_MESSAGE);
    }

    private void generateBill() {
        try {
            int MeterNumber = Integer.parseInt(textField.getText());
            int UnitsConsumed = Integer.parseInt(textField_3.getText());

            // Calculate total amount based on Indian government rules
            double TotalAmount = calculateTotalAmount(UnitsConsumed);

            // Save data to the database
            saveToDatabase(MeterNumber, UnitsConsumed, TotalAmount);

            // Display the bill receipt
            showBillReceipt(MeterNumber, UnitsConsumed, TotalAmount);
        } catch (NumberFormatException | SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Invalid input or database error", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void clearFields() {
        textField.setText("");
        textField_1.setText("");
        passwordField.setText("");
        textField_3.setText("");
        comboBox.setSelectedIndex(0);
    }
}
