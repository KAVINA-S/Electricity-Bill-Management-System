package swing;
import java.sql.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class NewCustomerDetails extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JPasswordField passwordField;
	private JLabel warning;
	private JTextField textField_1;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewCustomerDetails frame = new NewCustomerDetails();
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
	public NewCustomerDetails() {
		setTitle("New Customer Details");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 844, 735);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(143, 235, 239));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel lblNewLabel = new JLabel("New Customer");
		lblNewLabel.setForeground(Color.CYAN);
		lblNewLabel.setBounds(293, 29, 253, 35);
		lblNewLabel.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 30));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("User Name");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1.setBounds(170, 112, 162, 30);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1_1.setBounds(170, 165, 162, 30);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Address");
		lblNewLabel_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_2.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1_2.setBounds(170, 219, 162, 30);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("City");
		lblNewLabel_1_3.setForeground(Color.BLACK);
		lblNewLabel_1_3.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1_3.setBounds(170, 330, 162, 30);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("State");
		lblNewLabel_1_4.setForeground(Color.BLACK);
		lblNewLabel_1_4.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1_4.setBounds(170, 384, 162, 30);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Contact Number");
		lblNewLabel_1_5.setForeground(Color.BLACK);
		lblNewLabel_1_5.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1_5.setBounds(170, 433, 162, 30);
		contentPane.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("Email Id");
		lblNewLabel_1_6.setForeground(Color.BLACK);
		lblNewLabel_1_6.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1_6.setBounds(170, 489, 162, 30);
		contentPane.add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_2 = new JLabel(":");
		lblNewLabel_2.setFont(new Font("Century Schoolbook", Font.BOLD, 17));
		lblNewLabel_2.setBounds(360, 120, 17, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel(":");
		lblNewLabel_2_1.setFont(new Font("Century Schoolbook", Font.BOLD, 17));
		lblNewLabel_2_1.setBounds(360, 173, 17, 14);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel(":");
		lblNewLabel_2_2.setFont(new Font("Century Schoolbook", Font.BOLD, 17));
		lblNewLabel_2_2.setBounds(360, 228, 17, 14);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel(":");
		lblNewLabel_2_3.setFont(new Font("Century Schoolbook", Font.BOLD, 17));
		lblNewLabel_2_3.setBounds(360, 338, 17, 14);
		contentPane.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel(":");
		lblNewLabel_2_4.setFont(new Font("Century Schoolbook", Font.BOLD, 17));
		lblNewLabel_2_4.setBounds(360, 389, 17, 20);
		contentPane.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_5 = new JLabel(":");
		lblNewLabel_2_5.setFont(new Font("Century Schoolbook", Font.BOLD, 17));
		lblNewLabel_2_5.setBounds(360, 441, 17, 14);
		contentPane.add(lblNewLabel_2_5);
		
		JLabel lblNewLabel_2_6 = new JLabel(":");
		lblNewLabel_2_6.setFont(new Font("Century Schoolbook", Font.BOLD, 17));
		lblNewLabel_2_6.setBounds(360, 497, 17, 14);
		contentPane.add(lblNewLabel_2_6);
		
		textField = new JTextField();
		textField.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 18));
		textField.setBounds(393, 113, 253, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 18));
		textField_3.setColumns(10);
		textField_3.setBounds(393, 332, 253, 30);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 18));
		textField_4.setColumns(10);
		textField_4.setBounds(393, 382, 253, 30);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 18));
		textField_5.setColumns(10);
		textField_5.setBounds(393, 434, 253, 30);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 18));
		textField_6.setColumns(10);
		textField_6.setBounds(393, 490, 253, 30);
		contentPane.add(textField_6);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 18));
		btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/electricity_bill_management_system","root","Kavina112286");
					String query ="insert into newcustomerdetails(UserName,Password,Address,City,State,ContactNumber,EmailId,MeterNumber) values(?,?,?,?,?,?,?,?)";
					PreparedStatement ps = con.prepareStatement(query);
					ps.setString(1,textField.getText());
					ps.setString(2,passwordField.getText());
					ps.setString(3,textField_1.getText());
					ps.setString(4,textField_3.getText());
					ps.setString(5,textField_4.getText());
					ps.setString(6,textField_5.getText());
					ps.setString(7,textField_6.getText());
					ps.setInt(8,Integer.parseInt(textField_7.getText()));
					int rs=ps.executeUpdate();	
					
					String loginpagequery ="insert into loginpage(UserName,Password,MeterNumber) values(?,?,?)";
					PreparedStatement ps1 = con.prepareStatement(loginpagequery);
					ps1.setString(1,textField.getText());
					ps1.setString(2,passwordField.getText());
					ps1.setInt(3,Integer.parseInt(textField_7.getText()));
					int rs1=ps1.executeUpdate();	
					
					if(rs>0 && rs1>0)
					{
						showSuccessMessage();
						dispose();
						BillGenerating bill = new BillGenerating();
						bill.show();
					}
					else
					{
						warningMessage();
						textField_1.setText("");
						passwordField.setText("");
					}
					ps.close();
					con.close();
					} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
				
			}
		});
		btnNewButton.setBounds(262, 628, 115, 35);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1_6_1 = new JLabel("Meter Number");
		lblNewLabel_1_6_1.setForeground(Color.BLACK);
		lblNewLabel_1_6_1.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1_6_1.setBounds(170, 545, 162, 30);
		contentPane.add(lblNewLabel_1_6_1);
		
		JLabel lblNewLabel_2_6_1 = new JLabel(":");
		lblNewLabel_2_6_1.setFont(new Font("Century Schoolbook", Font.BOLD, 17));
		lblNewLabel_2_6_1.setBounds(360, 553, 17, 14);
		contentPane.add(lblNewLabel_2_6_1);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 18));
		textField_7.setColumns(10);
		textField_7.setBounds(393, 544, 253, 30);
		contentPane.add(textField_7);
		
		JButton btnCancel = new JButton("Back");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				  dispose();
				  Home a = new Home();
				  a.show();
			}
		});
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 18));
		btnCancel.setBackground(Color.BLACK);
		btnCancel.setBounds(430, 628, 115, 35);
		contentPane.add(btnCancel);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 18));
		passwordField.setBounds(393, 165, 253, 30);
		contentPane.add(passwordField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 18));
		textField_1.setBounds(393, 227, 253, 71);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\admin\\Downloads\\R.jpg"));
		lblNewLabel_3.setBounds(0, -83, 826, 779);
		contentPane.add(lblNewLabel_3);
			
}
	private void showSuccessMessage() {
        JOptionPane.showMessageDialog(this, "Login successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
    }
    private void warningMessage() {
        JOptionPane.showMessageDialog(this, "Please Enter The Valid Credenteails", "Warning", JOptionPane.ERROR_MESSAGE);
    }
}