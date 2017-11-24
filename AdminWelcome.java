package railwaypack;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminWelcome {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminWelcome window = new AdminWelcome();
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
	public AdminWelcome() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 510, 369);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblWelcomeUser = new JLabel("Welcome Admin");
		lblWelcomeUser.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeUser.setForeground(Color.BLACK);
		lblWelcomeUser.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblWelcomeUser.setBounds(10, 26, 474, 64);
		frame.getContentPane().add(lblWelcomeUser);
		
		JButton button = new JButton("LOGIN");
		button.setFont(new Font("Tahoma", Font.BOLD, 12));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
					new LoginNew();
					frame.dispose();
					
					new AdminLogin();
					frame.dispose();	
				
					
				}
		});
		button.setBounds(281, 198, 188, 43);
		frame.getContentPane().add(button);
		
		JButton button_2 = new JButton("REGISTER");
		button_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new AdminRegistration();
				frame.dispose();
				
			}
		});
		button_2.setBounds(36, 198, 195, 43);
		frame.getContentPane().add(button_2);
		
		JLabel lblforNewAdmin = new JLabel("(For New Admin..)");
		lblforNewAdmin.setHorizontalAlignment(SwingConstants.CENTER);
		lblforNewAdmin.setBounds(78, 252, 122, 27);
		frame.getContentPane().add(lblforNewAdmin);
		
		JLabel lblforAlreadyRegistered = new JLabel("(For already registered Admins)");
		lblforAlreadyRegistered.setHorizontalAlignment(SwingConstants.CENTER);
		lblforAlreadyRegistered.setBounds(294, 252, 175, 27);
		frame.getContentPane().add(lblforAlreadyRegistered);
		frame.setVisible(true);
		
	}

}
