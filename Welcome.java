package railwaypack;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Welcome {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcome window = new Welcome();
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
	public Welcome() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 386);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblWelcomeToIndian = new JLabel("Welcome to Indian Railways");
		lblWelcomeToIndian.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblWelcomeToIndian.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeToIndian.setBounds(10, 11, 414, 55);
		frame.getContentPane().add(lblWelcomeToIndian);
		
		JButton btnUser = new JButton("USER");
		btnUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new UserWelcome();
				frame.dispose();
			}
		});
		btnUser.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnUser.setBounds(157, 139, 111, 39);
		frame.getContentPane().add(btnUser);
		
		JButton btnNewButton = new JButton("ADMIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new AdminWelcome();
				frame.dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(157, 234, 111, 39);
		frame.getContentPane().add(btnNewButton);
	}
}
