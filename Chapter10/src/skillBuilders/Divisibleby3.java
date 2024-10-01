package skillBuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;

public class Divisibleby3 {

	private JFrame frame;
	private JTextField txt;
	private JTextField disp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Divisibleby3 window = new Divisibleby3();
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
	public Divisibleby3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		DecimalFormat dc = new DecimalFormat("");
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel pN = new JPanel();
		pN.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(pN);
		pN.setLayout(null);
		
		txt = new JTextField();
		txt.setText(" ");
		txt.setBounds(41, 38, 117, 20);
		pN.add(txt);
		txt.setColumns(10);
		
		JButton acT = new JButton("Click!");
		acT.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				int grTxt = Integer.parseInt(txt.getText());
				
				int div = grTxt / 3;
			
			}
		});
		acT.setBounds(41, 81, 117, 65);
		pN.add(acT);
		
		disp = new JTextField();
		disp.setBounds(196, 38, 193, 108);
		pN.add(disp);
		disp.setColumns(10);
	}
}
