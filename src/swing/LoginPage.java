package swing;

import java.sql.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class LoginPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_1;
	private JLabel lblPassword;
	private JPasswordField passwordField;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage frame = new LoginPage();
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
	public LoginPage() {
		setTitle("LoginPage");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 854, 511);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(143, 235, 239));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User Name");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setBounds(250, 154, 120, 24);
		contentPane.add(lblNewLabel);

		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 18));
		textField_1.setBounds(413, 152, 211, 30);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		lblPassword = new JLabel("Password   ");
		lblPassword.setForeground(new Color(0, 0, 0));
		lblPassword.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 18));
		lblPassword.setBounds(250, 207, 120, 24);
		contentPane.add(lblPassword);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)  {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/electricity_bill_management_system","root","Kavina112286");
					Statement stmt=con.createStatement();
					String UserName = textField_1.getText();
					String Password = passwordField.getText();
					String query ="Select * from loginpage WHERE UserName ='"+UserName+"'and Password ='"+Password+"'";
					ResultSet rs= stmt.executeQuery(query);
					if(rs.next())
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
					
					con.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		btnNewButton.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 18));
		btnNewButton.setBounds(288, 276, 100, 30);
		contentPane.add(btnNewButton);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				  dispose();
				  Home a = new Home();
				  a.show();
				
			}
		});
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setBackground(Color.BLACK);
		btnCancel.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 18));
		btnCancel.setBounds(455, 276, 107, 30);
		contentPane.add(btnCancel);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 18));
		passwordField.setBounds(413, 207, 211, 30);
		contentPane.add(passwordField);
		
		lblNewLabel_1 = new JLabel(":");
		lblNewLabel_1.setFont(new Font("Century Schoolbook", Font.BOLD, 17));
		lblNewLabel_1.setBounds(378, 159, 25, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel(":");
		lblNewLabel_2.setFont(new Font("Century Schoolbook", Font.BOLD, 17));
		lblNewLabel_2.setBounds(378, 212, 25, 14);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Login Page");
		lblNewLabel_3.setForeground(Color.CYAN);
		lblNewLabel_3.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_3.setBounds(324, 63, 218, 37);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\admin\\Downloads\\R.jpg"));
		lblNewLabel_4.setBounds(0, 0, 864, 483);
		contentPane.add(lblNewLabel_4);
	}

    private void showSuccessMessage() {
        JOptionPane.showMessageDialog(this, "Login successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
    }
    private void warningMessage() {
        JOptionPane.showMessageDialog(this, "Please Enter The Valid Credenteails", "Warning", JOptionPane.ERROR_MESSAGE);
    }
}
