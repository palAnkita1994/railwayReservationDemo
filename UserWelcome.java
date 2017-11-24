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

public class UserWelcome {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserWelcome window = new UserWelcome();
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
	public UserWelcome() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 547, 399);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblWelcomeUser = new JLabel("Welcome User");
		lblWelcomeUser.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeUser.setForeground(Color.BLACK);
		lblWelcomeUser.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblWelcomeUser.setBounds(10, 11, 520, 64);
		frame.getContentPane().add(lblWelcomeUser);
		
		JButton button = new JButton("LOGIN");
		button.setFont(new Font("Tahoma", Font.BOLD, 12));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
					new LoginNew();
					frame.dispose();
				}
		});
		button.setBounds(284, 198, 188, 43);
		frame.getContentPane().add(button);
		
		JButton button_2 = new JButton("REGISTER");
		button_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Registration();
				frame.dispose();
				frame.dispose();
			}
		});
		button_2.setBounds(43, 198, 195, 43);
		frame.getContentPane().add(button_2);
		
		JLabel label_1 = new JLabel("(For New Users..)");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(78, 252, 122, 27);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("(For already registered users)");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(308, 252, 144, 27);
		frame.getContentPane().add(label_2);
		frame.setVisible(true);
	}

}
