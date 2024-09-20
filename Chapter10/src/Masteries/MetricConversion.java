package Masteries;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MetricConversion {

	private JFrame bG;
	private JTextField txt1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MetricConversion window = new MetricConversion();
					window.bG.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @wbp.parser.entryPoint
	 */
	public MetricConversion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		bG = new JFrame();
		bG.setBounds(100, 100, 262, 226);
		bG.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bG.getContentPane().setLayout(null);
		
		JLabel lbl2 = new JLabel("Select Conversion:");
		lbl2.setFont(new Font("Verdana", Font.BOLD, 16));
		lbl2.setBounds(41, 47, 163, 14);
		bG.getContentPane().add(lbl2);
		
		 
		
		JComboBox pN1 = new JComboBox();
		pN1.setModel(new DefaultComboBoxModel(new String[] {"feet to meters", "inch to cm", "gallon to liter", "pound to kg"}));
		pN1.setFont(new Font("Verdana", Font.ITALIC, 11));
		pN1.setEditable(true);
		pN1.setBounds(51, 72, 132, 20);
		bG.getContentPane().add(pN1);
		
		txt1 = new JTextField();
		txt1.setText("1 foot = 0.3048 meters");
		txt1.setBounds(41, 103, 151, 48);
		bG.getContentPane().add(txt1);
		txt1.setColumns(10);
		
		
		
		pN1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String txt2 = "";

				

				if(pN1.getSelectedItem().equals("feet to meters"))
				{
					txt2 = "1 foot = 0.3048 meters";
				}
				else if(pN1.getSelectedItem().equals("inch to cm"))
				{
					txt2 = "1 inch = 2.54 cm";
				}
				else if(pN1.getSelectedItem().equals("gallon to liter"))
				{
					txt2 = "1 gallon = 4.5461 liters";
				}
				else if(pN1.getSelectedItem().equals("pound to kg"))
				{
					txt2 = "1 pound = 0.4536 kg";
				}
				
				
				txt1.setText
				(txt2);
				
				
				
			}
		});
		
	}

}
