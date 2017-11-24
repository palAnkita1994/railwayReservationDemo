package railwaypack;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminLogin {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLogin window = new AdminLogin();
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
	public AdminLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 357, 364);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("User Name");
		label.setBounds(27, 78, 100, 30);
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Tahoma", Font.BOLD, 12));
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("Password");
		label_1.setBounds(27, 132, 100, 30);
		label_1.setForeground(Color.BLACK);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		frame.getContentPane().add(label_1);
		
		textField = new JTextField(10);
		textField.setBounds(137, 79, 194, 30);
		textField.setForeground(Color.BLUE);
		frame.getContentPane().add(textField);
		
		passwordField = new JPasswordField(10);
		passwordField.setBounds(137, 133, 194, 30);
		passwordField.setForeground(Color.BLUE);
		passwordField.setEchoChar('*');
		frame.getContentPane().add(passwordField);
		
		JButton button = new JButton("Ok");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Main();
				frame.dispose();
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 12));
		button.setBounds(93, 232, 153, 58);
		button.setMnemonic('O');
		button.setForeground(Color.BLACK);
		frame.getContentPane().add(button);
		
		JLabel lblUserLogin = new JLabel("ADMIN LOGIN");
		lblUserLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblUserLogin.setBounds(10, 11, 321, 30);
		lblUserLogin.setForeground(Color.BLACK);
		lblUserLogin.setFont(new Font("Tahoma", Font.BOLD, 14));
		frame.getContentPane().add(lblUserLogin);
	
		frame.setVisible(true);
	}
	
}
