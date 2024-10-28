package skillBuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import java.awt.BorderLayout;
import javax.swing.JScrollBar;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.JProgressBar;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class SemAverage {

	private JFrame frame;
	private JTextField gr1;
	private JTextField gr2;
	private JTextField gr3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SemAverage window = new SemAverage();
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
	public SemAverage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel disp = new JLabel("");
		disp.setBounds(239, 47, 126, 102);
		frame.getContentPane().add(disp);
		
		JButton btnNewButton = new JButton("Calculate Average");
		btnNewButton.setFont(new Font("Verdana", Font.PLAIN, 11));
		btnNewButton.addActionListener(new ActionListener() {
			/**
			 *
			 */
			public void actionPerformed(ActionEvent e) {
				
				DecimalFormat dc = new DecimalFormat("");
				
				double grTx1 = Double.parseDouble(gr1.getText());
				double grTx2 = Double.parseDouble(gr2.getText());
				double grTx3 = Double.parseDouble(gr3.getText());
				
				double average = (grTx1 + grTx2 + grTx3)/3;
				
				disp.setText(dc.format(average));
			}
		});
		btnNewButton.setBounds(63, 128, 137, 32);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Grade #1");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel.setBounds(10, 16, 69, 14);
		frame.getContentPane().add(lblNewLabel);
		
		gr1 = new JTextField();
		gr1.setBounds(89, 14, 86, 20);
		frame.getContentPane().add(gr1);
		gr1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Grade #2");
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(10, 47, 69, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Grade #3");
		lblNewLabel_2.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(10, 78, 69, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		gr2 = new JTextField();
		gr2.setBounds(89, 45, 86, 20);
		frame.getContentPane().add(gr2);
		gr2.setColumns(10);
		
		gr3 = new JTextField();
		gr3.setBounds(89, 76, 86, 20);
		frame.getContentPane().add(gr3);
		gr3.setColumns(10);
	}
}
