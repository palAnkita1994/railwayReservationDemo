package railwaypack;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class AdminMain {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminMain window = new AdminMain();
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
	public AdminMain() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 660, 471);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnAddmodifyremoveTrains = new JButton("Add/Modify/Remove Trains");
		btnAddmodifyremoveTrains.setMnemonic('R');
		btnAddmodifyremoveTrains.setForeground(Color.BLACK);
		btnAddmodifyremoveTrains.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAddmodifyremoveTrains.setBackground(new Color(211, 211, 211));
		btnAddmodifyremoveTrains.setBounds(59, 110, 210, 60);
		frame.getContentPane().add(btnAddmodifyremoveTrains);
		
		JLabel lblMainPageadmin = new JLabel("MAIN PAGE(ADMIN)");
		lblMainPageadmin.setHorizontalAlignment(SwingConstants.CENTER);
		lblMainPageadmin.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMainPageadmin.setBackground(new Color(255, 255, 240));
		lblMainPageadmin.setBounds(10, 11, 624, 60);
		frame.getContentPane().add(lblMainPageadmin);
		
		JButton button_1 = new JButton("Cancellation Form");
		button_1.setMnemonic('C');
		button_1.setForeground(Color.BLACK);
		button_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_1.setBackground(Color.LIGHT_GRAY);
		button_1.setBounds(388, 110, 210, 60);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("PNR-enquiry");
		button_2.setMnemonic('P');
		button_2.setForeground(Color.BLACK);
		button_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_2.setBackground(new Color(211, 211, 211));
		button_2.setBounds(59, 214, 210, 60);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("Exit");
		button_3.setMnemonic('E');
		button_3.setForeground(Color.BLACK);
		button_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_3.setBackground(Color.LIGHT_GRAY);
		button_3.setBounds(388, 214, 210, 60);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("PNR-enquiry");
		button_4.setMnemonic('P');
		button_4.setForeground(Color.BLACK);
		button_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_4.setBackground(new Color(211, 211, 211));
		button_4.setBounds(59, 320, 210, 60);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("Exit");
		button_5.setMnemonic('E');
		button_5.setForeground(Color.BLACK);
		button_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_5.setBackground(Color.LIGHT_GRAY);
		button_5.setBounds(388, 320, 210, 60);
		frame.getContentPane().add(button_5);
	}

}
