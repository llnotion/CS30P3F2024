package skillBuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LatinPlant {

	JFrame fr;
	private JTextField ptN;
	private JTextField txt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LatinPlant window = new LatinPlant();
					window.fr.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LatinPlant() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		fr = new JFrame();
		fr.setBounds(100, 100, 262, 226);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Select Plant name:");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 16));
		lblNewLabel.setBounds(41, 47, 163, 14);
		fr.getContentPane().add(lblNewLabel);
		
		 
		
		JComboBox pN = new JComboBox();
		pN.setModel(new DefaultComboBoxModel(new String[] {"basil", "lavender", "parsley", "peppermint", "saffron", "sage"}));
		pN.setFont(new Font("Verdana", Font.ITALIC, 11));
		pN.setEditable(true);
		pN.setBounds(72, 72, 101, 20);
		fr.getContentPane().add(pN);
		
		txt = new JTextField();
		txt.setBounds(53, 103, 151, 48);
		fr.getContentPane().add(txt);
		txt.setColumns(10);
		
		
		
		pN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String ptN = " ";

				if(pN.getSelectedItem().equals("basil"))
				{
					ptN = "Ocimum";
				}
				else if(pN.getSelectedItem().equals("lavender"))
				{
					ptN = "Lavandula spica";
				}
				else if(pN.getSelectedItem().equals("parsley"))
				{
					ptN = "Apium";
				}
				else if(pN.getSelectedItem().equals("peppermint"))
				{
					ptN = "Mentha piperita";
				}
				else if(pN.getSelectedItem().equals("saffron"))
				{
					ptN = "Crocus";
				}
				else if(pN.getSelectedItem().equals("sage"))
				{
					ptN = "Salvia";
				}
				
				
				txt.setText
				(ptN);				
				
			}
		});
		
		
		
	}
	
	
	
}

