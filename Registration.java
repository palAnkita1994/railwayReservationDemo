package railwaypack;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;

import com.mysql.jdbc.PreparedStatement;

import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.awt.event.ActionEvent;

public class Registration {

	private JFrame frame;
	private JPasswordField passwordField;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration window = new Registration();
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
	public Registration() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 12));
		frame.setBounds(100, 100, 497, 521);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUserRegistration = new JLabel("USER REGISTRATION");
		lblUserRegistration.setHorizontalAlignment(SwingConstants.CENTER);
		lblUserRegistration.setFont(new Font("Constantia", Font.BOLD, 18));
		lblUserRegistration.setBounds(10, 25, 461, 39);
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
				String fname=textField.getText();
				String lname=textField_1.getText();
				String dob=textField_2.getText();
				String email=textField_3.getText();
				String username =textField_4.getText();
				String password=passwordField.getText();
				String date=textField_5.getText();
				
				try{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost/railways","root","");
					PreparedStatement ps=(PreparedStatement) con.prepareStatement("INSERT INTO `user`(`First_Name`, `Last_Name`, `D_O_B`, `Email_id`, `Username`, `Password`, `Date`) VALUES (?,?,?,?,?,?,?)");
					ps.setString(1, fname);
					ps.setString(2, lname);
					ps.setString(3, dob);
					ps.setString(4, email);
					ps.setString(5, username);
					ps.setString(6, password);
					ps.setString(7, date);
					
					int i=ps.executeUpdate();
					if(i>0){
						JOptionPane.showMessageDialog(null, "successfull");
						new Welcome();
						
					}
				}catch(Exception e){System.out.println(e);}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(60, 400, 139, 50);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new UserWelcome();
				frame.dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1.setBounds(277, 400, 139, 50);
		frame.getContentPane().add(btnNewButton_1);
		frame.setVisible(true);
	}
}
