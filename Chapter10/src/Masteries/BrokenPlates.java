package Masteries;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font; 

public class BrokenPlates {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BrokenPlates window = new BrokenPlates();
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
	public BrokenPlates() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		ImageIcon tPl = new ImageIcon("C:\\Users\\77132002\\git\\CS30P3F2024\\Chapter10\\src\\img\\plates_two_broken.png");
		ImageIcon aPl = new ImageIcon("C:\\Users\\77132002\\git\\CS30P3F2024\\Chapter10\\src\\img\\plates_all_broken.png");
		ImageIcon pl = new ImageIcon("C:\\Users\\77132002\\git\\CS30P3F2024\\Chapter10\\src\\img\\plates.png");
		ImageIcon tP = new ImageIcon("C:\\Users\\77132002\\git\\CS30P3F2024\\Chapter10\\src\\img\\tiger_plush.png");
		ImageIcon sT = new ImageIcon("C:\\Users\\77132002\\git\\CS30P3F2024\\Chapter10\\src\\img\\sticker.png");
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lBl = new JLabel("");
		lBl.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lBl.setHorizontalAlignment(SwingConstants.CENTER);
		lBl.setBounds(77, 157, 279, 93);
		panel.add(lBl);
		
		JLabel lbLp = new JLabel("");
		lbLp.setBounds(77, 11, 279, 92);
		panel.add(lbLp);
		
		
		Random rand = new Random();
		
		lbLp.setIcon(pl);
		lBl.setText("Prize sector");
		
		JButton bTn = new JButton("Play!");
		bTn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Plates = " ";
				String Prizes = " ";
				
				
				bTn.setText(" Play Again? ");
				
				
				int rand1 = rand.nextInt(2);
				
				if (rand1 == 0) {
					lbLp.setIcon(tPl);
					lBl.setIcon(sT);
					lBl.setText("You won: Sticker!");
				}
				else if (rand1 == 1) {
					lbLp.setIcon(aPl);
					lBl.setIcon(tP);
					lBl.setText("You won: Tiger Plush!");
				}
				
				
			}
		});
		bTn.setBounds(161, 114, 112, 32);
		panel.add(bTn);
		
		
	
		
		
		
		
	}
}
