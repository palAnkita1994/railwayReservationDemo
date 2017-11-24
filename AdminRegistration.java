package railwaypack;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import com.mysql.jdbc.PreparedStatement;

import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.awt.event.ActionEvent;

public class AdminRegistration {

	private JFrame frame;
	private JPasswordField passwordField;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	java.sql.Connection con;
	java.sql.PreparedStatement ps;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminRegistration window = new AdminRegistration();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AdminRegistration() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost/Railways","root","");
			ps=(PreparedStatement) con.prepareStatement("INSERT INTO `Admin`"
					+"(`First Name`, `Last Name`, `D.O.B`, `Email id`, `Username`, `Password`, `Date`)"
					+"VALUES (?,?,?,?,?,?,?)");
			
			
		}
		catch(Exception e){
			System.out.print(e.toString());
			System.out.println("Cannot insert data");
		}
		
		
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 12));
		frame.setBounds(100, 100, 473, 504);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUserRegistration = new JLabel("ADMIN REGISTRATION");
		lblUserRegistration.setHorizontalAlignment(SwingConstants.CENTER);
		lblUserRegistration.setFont(new Font("Constantia", Font.BOLD, 18));
		lblUserRegistration.setBounds(10, 24, 437, 39);
		frame.getContentPane().add(lblUserRegistration);
		
		JLabel lblNewLabel = new JLabel("First Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(35, 120, 119, 24);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblDob = new JLabel("D.O.B");
		lblDob.setHorizontalAlignment(SwingConstants.CENTER);
		lblDob.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDob.setBounds(60, 191, 65, 24);
		frame.getContentPane().add(lblDob);
		
		JLabel lblEmailId = new JLabel("Email id");
		lblEmailId.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmailId.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEmailId.setBounds(47, 226, 95, 24);
		frame.getContentPane().add(lblEmailId);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPassword.setBounds(57, 297, 85, 24);
		frame.getContentPane().add(lblPassword);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblUsername.setBounds(57, 261, 85, 25);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setHorizontalAlignment(SwingConstants.CENTER);
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDate.setBounds(57, 332, 85, 24);
		frame.getContentPane().add(lblDate);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setHorizontalAlignment(SwingConstants.CENTER);
		lblLastName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblLastName.setBounds(44, 155, 95, 25);
		frame.getContentPane().add(lblLastName);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(202, 301, 214, 20);
		frame.getContentPane().add(passwordField);
		
		textField = new JTextField();
		textField.setBounds(202, 124, 214, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(202, 159, 214, 20);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(202, 195, 214, 20);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(202, 230, 214, 20);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(202, 265, 214, 20);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setBounds(202, 336, 214, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				 String tf =textField.getText();
				 String pw =passwordField.getText();
				 String tf1=textField_1.getText();
				 String tf2=textField_2.getText();
				 String tf3=textField_3.getText();
				 String tf4=textField_4.getText();
				 String tf5=textField_5.getText();
				 
				 try{
						Class.forName("com.mysql.jdbc.Driver");
						Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Railways","root","");
						PreparedStatement ps = (PreparedStatement) con.prepareStatement("INSERT INTO `Admin`"
								+"(`First Name`, `Last Name`, `D.O.B`, `Email id`, `Username`, `Password`, `Date`)"
								+ "VALUES (?,?,?,?,?,?,?)");
						ps.setString(1,pw);
						ps.setString(2,tf);
						ps.setString(3,tf1);
						ps.setString(4,tf2);
						ps.setString(5,tf3);
						ps.setString(6,tf4);
						ps.setString(7,tf5);
						
						ps.executeUpdate();
						System.out.println("Registration successful");
									
				}	catch(Exception e){
					e.printStackTrace();
				}
			}
			
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(35, 385, 164, 50);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new AdminWelcome();
				frame.dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1.setBounds(252, 385, 164, 50);
		frame.getContentPane().add(btnNewButton_1);
		frame.setVisible(true);
	}
}
