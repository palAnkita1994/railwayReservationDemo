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

public class LoginNew {

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
					LoginNew window = new LoginNew();
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
	public LoginNew() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 397, 344);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("User Name");
		label.setBounds(80, 78, 100, 30);
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Tahoma", Font.BOLD, 12));
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("Password");
		label_1.setBounds(80, 132, 100, 30);
		label_1.setForeground(Color.BLACK);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		frame.getContentPane().add(label_1);
		
		textField = new JTextField(10);
		textField.setBounds(190, 79, 133, 30);
		textField.setForeground(Color.BLUE);
		frame.getContentPane().add(textField);
		
		passwordField = new JPasswordField(10);
		passwordField.setBounds(190, 133, 133, 30);
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
		button.setBounds(107, 225, 163, 43);
		button.setMnemonic('O');
		button.setForeground(Color.BLACK);
		frame.getContentPane().add(button);
		
		JLabel lblUserLogin = new JLabel("USER LOGIN");
		lblUserLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblUserLogin.setBounds(10, 11, 361, 30);
		lblUserLogin.setForeground(Color.BLACK);
		lblUserLogin.setFont(new Font("Tahoma", Font.BOLD, 14));
		frame.getContentPane().add(lblUserLogin);
	
		frame.setVisible(true);
	}
	
}
