package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Font;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Home extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setTitle("Home Page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 792, 504);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Main  Menu");
		mnNewMenu.setForeground(new Color(128, 0, 0));
		mnNewMenu.setFont(new Font("Bodoni MT Black", Font.BOLD | Font.ITALIC, 32));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Exsist User");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
	        	LoginPage a = new LoginPage();
				a.show();
			}
		});
		mntmNewMenuItem.setForeground(Color.MAGENTA);
		mntmNewMenuItem.setFont(new Font("Bodoni MT Black", Font.BOLD | Font.ITALIC, 24));
		mnNewMenu.add(mntmNewMenuItem);
		
		JSeparator separator = new JSeparator();
		mnNewMenu.add(separator);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("New User");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				NewCustomerDetails b = new NewCustomerDetails();
				b.show();
			}
		});
		mntmNewMenuItem_2.setForeground(Color.MAGENTA);
		mntmNewMenuItem_2.setFont(new Font("Bodoni MT Black", Font.BOLD | Font.ITALIC, 24));
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JSeparator separator_1 = new JSeparator();
		mnNewMenu.add(separator_1);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Update User");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				UpdateCustomer c= new UpdateCustomer();
				c.show();
			}
		});
		mntmNewMenuItem_1.setForeground(Color.MAGENTA);
		mntmNewMenuItem_1.setFont(new Font("Bodoni MT Black", Font.BOLD | Font.ITALIC, 24));
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JSeparator separator_2 = new JSeparator();
		mnNewMenu.add(separator_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Remove User");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				RemoveCustomer d = new RemoveCustomer();
				d.show();
			
			}
		});
		mntmNewMenuItem_3.setForeground(Color.MAGENTA);
		mntmNewMenuItem_3.setFont(new Font("Bodoni MT Black", Font.BOLD | Font.ITALIC, 24));
		mnNewMenu.add(mntmNewMenuItem_3);
		
		JSeparator separator_3 = new JSeparator();
		mnNewMenu.add(separator_3);
		
		JMenuItem mntmNewMenuItem_3_1 = new JMenuItem("Close");
		mntmNewMenuItem_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.exit(0);
			}
		});
		mntmNewMenuItem_3_1.setForeground(Color.MAGENTA);
		mntmNewMenuItem_3_1.setFont(new Font("Bodoni MT Black", Font.BOLD | Font.ITALIC, 24));
		mnNewMenu.add(mntmNewMenuItem_3_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\admin\\Downloads\\R.jpg"));
		lblNewLabel.setBounds(0, -36, 776, 465);
		contentPane.add(lblNewLabel);
		
		
	}

}
