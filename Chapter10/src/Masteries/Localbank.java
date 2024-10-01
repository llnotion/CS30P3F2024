package Masteries;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Localbank {

	private JFrame frame;
	private JTextField fName;
	private JTextField lName;
	private JTextField amt;
	private JTextField acctNum;
	private JTextField bgb;
	
	Bank easySave = new Bank();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Localbank window = new Localbank();
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
	public Localbank() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 478, 434);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 460, 395);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JComboBox bankActivities = new JComboBox();
		
	
		
		fName = new JTextField();
		fName.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				fName.setText(null);
			}
			
		});
		fName.setToolTipText("Last Name: ");
		fName.setText("First Name: ");
		fName.setBounds(10, 186, 285, 32);
		panel.add(fName);
		fName.setColumns(10);
		
		lName = new JTextField();
		lName.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lName.setText(null);
			}
			
		});
		lName.setText("Last Name: ");
		lName.setBounds(10, 240, 285, 32);
		panel.add(lName);
		lName.setColumns(10);
		
		amt = new JTextField();
		amt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				amt.setText(null);
			}
			
		});
		amt.setText("Enter Amount: ");
		amt.setBounds(10, 132, 285, 32);
		panel.add(amt);
		amt.setColumns(10);
		
	
		
		
		
		acctNum = new JTextField();
		acctNum.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				acctNum.setText(null);
			}
			
		});
		acctNum.setText("Enter Account ID:  ");
		acctNum.setBounds(10, 78, 285, 32);
		panel.add(acctNum);
		acctNum.setColumns(10);
		
		JLabel acctI = new JLabel("");
		acctI.setBounds(10, 328, 342, 56);
		panel.add(acctI);
		
		bgb = new JTextField();
		bgb.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				bgb.setText(null);
			}
			
		});
		bgb.setText("Beginning value: ");
		bgb.setBounds(10, 294, 285, 32);
		panel.add(bgb);
		bgb.setColumns(10);
		
		bankActivities.setModel(new DefaultComboBoxModel(new String[] {"Select an Option...", "Add an Account", "Remove an Account", "Check Balance", "Withdrawal", "Deposit"}));
		bankActivities.setBounds(10, 11, 414, 32);
		panel.add(bankActivities);
		
		
		JLabel lbl1 = new JLabel("Enter Account ID:");
		lbl1.setBounds(10, 54, 119, 23);
		panel.add(lbl1);
		
		JLabel lbl2 = new JLabel("Enter Amount:");
		lbl2.setBounds(10, 108, 95, 23);
		panel.add(lbl2);
		
		JLabel lbl3 = new JLabel("First Name:");
		lbl3.setBounds(10, 165, 95, 23);
		panel.add(lbl3);
		
		JLabel lbl4 = new JLabel("Last Name:");
		lbl4.setBounds(10, 218, 95, 23);
		panel.add(lbl4);
		
		JLabel lbl5 = new JLabel("Beginning Value:");
		lbl5.setBounds(10, 273, 95, 23);
		panel.add(lbl5);
		
		
		bankActivities.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				if (bankActivities.getSelectedItem().equals("Add an Account")) {
					lbl1.setForeground(Color.black);
					lbl2.setForeground(Color.black);
					lbl3.setForeground(Color.red);
					lbl4.setForeground(Color.red);
					lbl5.setForeground(Color.red);
				}
				else if (bankActivities.getSelectedItem().equals("Remove an Account")) {
					lbl1.setForeground(Color.red);
					lbl2.setForeground(Color.black);
					lbl3.setForeground(Color.black);
					lbl4.setForeground(Color.black);
					lbl5.setForeground(Color.black);
				}
				else if (bankActivities.getSelectedItem().equals("Check Balance")) {
					lbl1.setForeground(Color.red);
					lbl2.setForeground(Color.black);
					lbl3.setForeground(Color.black);
					lbl4.setForeground(Color.black);
					lbl5.setForeground(Color.black);
				}
				else if (bankActivities.getSelectedItem().equals("Withdrawal")) {
					lbl1.setForeground(Color.red);
					lbl2.setForeground(Color.red);
					lbl3.setForeground(Color.black);
					lbl4.setForeground(Color.black);
					lbl5.setForeground(Color.black);
				}
				else if (bankActivities.getSelectedItem().equals("Deposit")) {
					lbl1.setForeground(Color.red);
					lbl2.setForeground(Color.red);
					lbl3.setForeground(Color.black);
					lbl4.setForeground(Color.black);
					lbl5.setForeground(Color.black);
				}
				
			}
		});
		

		JButton sBt = new JButton("Submit");
		sBt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String amount, message;
				
				
				if (bankActivities.getSelectedItem().equals("Deposit")) {
					amount = amt.getText();
					message = easySave.transaction(1, acctNum.getText(), Double.parseDouble(amount));
					acctI.setText(message);
				}
				else if(bankActivities.getSelectedItem().equals("Withdrawal")) {
					amount = amt.getText();
					message = easySave.transaction(2, acctNum.getText(), Double.parseDouble(amount));
					acctI.setText(message);
				}
				else if(bankActivities.getSelectedItem().equals("Check Balance")) {
					message = easySave.checkBalance(acctNum.getText());
					acctI.setText(message);
				}
				else if(bankActivities.getSelectedItem().equals("Remove an Account")) {
					amount = bgb.getText();
					message = easySave.deleteAccount(acctNum.getText());
					acctI.setText("Deleted Account ID: " + acctNum.getText());
				}
				else if(bankActivities.getSelectedItem().equals("Add an Account")) {
					amount = bgb.getText();
					message = easySave.addAccount(Double.parseDouble(amount), fName.getText(), lName.getText());
					acctI.setText("New Account ID: " + message);
				}
				
				acctNum.setText("");
				amt.setText("");
				fName.setText("");
				lName.setText("");
				bgb.setText("");
				
			}
		});
		sBt.setBounds(318, 78, 119, 248);
		panel.add(sBt);
	
		
	}
}
