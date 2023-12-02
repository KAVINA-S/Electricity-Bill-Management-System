package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class RemoveCustomer extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RemoveCustomer frame = new RemoveCustomer();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RemoveCustomer() {
		setTitle("Remove The Customer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 738, 490);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User Name");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBounds(155, 147, 155, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(":");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Century Schoolbook", Font.BOLD, 18));
		lblNewLabel_1.setBounds(320, 147, 29, 27);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setForeground(Color.BLACK);
		textField.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 20));
		textField.setBounds(359, 147, 194, 27);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.BLACK);
		lblPassword.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 20));
		lblPassword.setBounds(155, 205, 155, 27);
		contentPane.add(lblPassword);
		
		JLabel lblNewLabel_1_1 = new JLabel(":");
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Century Schoolbook", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(320, 205, 29, 27);
		contentPane.add(lblNewLabel_1_1);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 20));
		passwordField.setBounds(360, 205, 193, 27);
		contentPane.add(passwordField);
		
		JLabel lblMeterNumber = new JLabel("Meter Number");
		lblMeterNumber.setForeground(Color.BLACK);
		lblMeterNumber.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 20));
		lblMeterNumber.setBounds(155, 262, 155, 27);
		contentPane.add(lblMeterNumber);
		
		JLabel lblNewLabel_1_2 = new JLabel(":");
		lblNewLabel_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_2.setFont(new Font("Century Schoolbook", Font.BOLD, 18));
		lblNewLabel_1_2.setBounds(320, 262, 29, 27);
		contentPane.add(lblNewLabel_1_2);
		
		textField_1 = new JTextField();
		textField_1.setForeground(Color.BLACK);
		textField_1.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(359, 262, 194, 27);
		contentPane.add(textField_1);
		
		JLabel lblRemoverCustomer = new JLabel("Remove Customer");
		lblRemoverCustomer.setForeground(new Color(0, 255, 255));
		lblRemoverCustomer.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 29));
		lblRemoverCustomer.setBounds(207, 71, 292, 27);
		contentPane.add(lblRemoverCustomer);
		
		JButton btnNewButton = new JButton("Remove");
		btnNewButton.addActionListener(new ActionListener() {
			

			

			public void actionPerformed(ActionEvent arg0) {

				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/electricity_bill_management_system","root","Kavina112286");
					String GeneratingBillquery ="delete from GeneratingBill where MeterNumber=? and Password=? and UserName=?";
					PreparedStatement ps = con.prepareStatement(GeneratingBillquery);
					ps.setString(1,textField_1.getText());
					ps.setString(2,passwordField.getText());
					ps.setString(3,textField.getText());
					int rs=ps.executeUpdate();	
					
					String loginpagequery ="delete from loginpage where MeterNumber=? and Password=? and UserName=?";
					PreparedStatement ps1 = con.prepareStatement(loginpagequery);
					ps1.setString(1,textField_1.getText());
					ps1.setString(2,passwordField.getText());
					ps1.setString(3,textField.getText());
					int rs1=ps1.executeUpdate();	
					
					String newCustomerDetailsquery ="delete from newCustomerDetails where MeterNumber=? and Password=? and UserName=?";
					PreparedStatement ps2 = con.prepareStatement(newCustomerDetailsquery);
					ps2.setString(1,textField_1.getText());
					ps2.setString(2,passwordField.getText());
					ps2.setString(3,textField.getText());
					int rs2=ps2.executeUpdate();	
					
					if(rs>0 && rs1>0 && rs2>0)
					{
						showSuccessMessage();
						 dispose();
						  Home a = new Home();
						  a.show();
						
						
					}
					else
					{
						 warningMessage();
						textField.setText("");
						passwordField.setText("");
						textField_1.setText("");
						
					}
					ps.close();
					con.close();
					} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
				
			
				
			}
		});
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 20));
		btnNewButton.setBounds(207, 337, 118, 33);
		contentPane.add(btnNewButton);
		
		JButton btnCancel = new JButton("Back");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Home b = new Home();
				b.show();  
				}
		});
		btnCancel.setForeground(Color.BLACK);
		btnCancel.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 20));
		btnCancel.setBounds(368, 337, 118, 33);
		contentPane.add(btnCancel);
		
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\admin\\Downloads\\R.jpg"));
		lblNewLabel_2.setBounds(0, 0, 712, 440);
		contentPane.add(lblNewLabel_2);
		
		
	}
	private void showSuccessMessage() {
        JOptionPane.showMessageDialog(this, "The Customer Details Was Successfully Removed ...", "Success", JOptionPane.INFORMATION_MESSAGE);
    }
    private void warningMessage() {
        JOptionPane.showMessageDialog(this, "Please Enter The Valid Credenteails", "Warning", JOptionPane.ERROR_MESSAGE);
    }
}
