package skillBuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Demo2 {

	private JFrame frame;
	private JTextField fnt;
	private JTextField lnt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Demo2 window = new Demo2();
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
	public Demo2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
	
		ImageIcon cres = new ImageIcon("C:\\Users\\77132002\\git\\CS30P3F2024\\Chapter10\\src\\img\\chhs.png");
		ImageIcon fowl = new ImageIcon("C:\\Users\\77132002\\git\\CS30P3F2024\\Chapter10\\src\\img\\Fowler.png");
		ImageIcon nel = new ImageIcon("C:\\Users\\77132002\\git\\CS30P3F2024\\Chapter10\\src\\img\\Nelson.png");
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 446, 434);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		
			
		panel_1.setBounds(0, 0, 430, 395);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		
		
		lnt = new JTextField();
		lnt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				lnt.setText(" ");
				
				
			}
		});
		
		JComboBox school = new JComboBox();
		school.setFont(new Font("Verdana", Font.PLAIN, 16));
		school.setModel(new DefaultComboBoxModel(new String[] {"Select School:", "CHHS", "Nelson Mandela", "Fowler"}));
		school.setBounds(222, 133, 185, 34);
		panel_1.add(school);
		
		
		
		JComboBox grades = new JComboBox();
		grades.setModel(new DefaultComboBoxModel(new String[] {"Select Grade:", "10", "11", "12"}));
		grades.setFont(new Font("Verdana", Font.PLAIN, 16));
		grades.setModel(new DefaultComboBoxModel(new String[] {"Select Grade:", "10", "11", "12"}));
		grades.setBounds(222, 88, 185, 34);
		panel_1.add(grades);
		
		
		fnt = new JTextField();
		fnt.setBounds(10, 37, 185, 34);
		fnt.setForeground(new Color(128, 128, 128));
		fnt.setFont(new Font("Tahoma", Font.PLAIN, 16));
		fnt.setText("First Name: ");
		panel_1.add(fnt);
		fnt.setColumns(10);
		
		lnt.setBounds(222, 37, 185, 34);
		lnt.setForeground(new Color(128, 128, 128));
		lnt.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lnt.setText("Last Name: ");
		lnt.setColumns(10);
		panel_1.add(lnt);
	
		fnt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				fnt.setText(" ");
			}
			
			
		});
				
		
		JLabel img = new JLabel("");
		img.setBounds(10, 261, 185, 123);
		panel_1.add(img);
		
		
		JTextArea disp = new JTextArea();
		disp.setBounds(222, 178, 185, 72);
		panel_1.add(disp);
		
		JButton sBtn = new JButton("Submit");
		sBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String grade = " ";
				String schools = " ";
				String fN = fnt.getText();
				String lN = lnt.getText();
				
				if(grades.getSelectedItem().equals("10"))
				{
					grade = "10";
				}
				else if(grades.getSelectedItem().equals("11"))
				{
					grade = "11";
				}
				else
				{
					grade = "12";
				}
				
				
				if(school.getSelectedItem().equals("CHHS"))
				{
					schools = "Crescent Heights";
					img.setIcon(cres);
				
				}
				else if(school.getSelectedItem().equals("Fowler"))
				{
					schools = "Fowler";
					img.setIcon(fowl);
				}
				else
				{
					schools = "Nelson Mandela";
					img.setIcon(nel);
				}
				
				
				//Display the information
				
				disp.setText
				(
				fN + " " 
				+ lN + " Is in Grade: " 
				+ grade + " and goes to: " 
				+ schools	
				
						);
				
			}});
	
		
		
		
		sBtn.setBounds(10, 82, 185, 168);
		sBtn.setFont(new Font("Verdana", Font.PLAIN, 20));
		panel_1.add(sBtn);
	
		
	
	}
}
