import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class versuche1 {

	private JFrame frame;
	private JTextField textFieldNum1;
	private JTextField textFieldNum2;
	private JTextField textFieldAns;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					versuche1 window = new versuche1();
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
	public versuche1() {
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
		
		textFieldNum1 = new JTextField();
		textFieldNum1.setBounds(51, 42, 86, 20);
		frame.getContentPane().add(textFieldNum1);
		textFieldNum1.setColumns(10);
		
		textFieldNum2 = new JTextField();
		textFieldNum2.setBounds(267, 42, 86, 20);
		frame.getContentPane().add(textFieldNum2);
		textFieldNum2.setColumns(10);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,ans;
				try{
					num1=Integer.parseInt(textFieldNum1.getText());
					num2=Integer.parseInt(textFieldNum2.getText());
					
					ans=num1+num2;
					textFieldAns.setText(Integer.toString(ans));
				}catch(Exception s){
					JOptionPane.showMessageDialog(null, "Please enter valid number");
				}
			}
		});
		btnAdd.setBounds(48, 123, 89, 23);
		frame.getContentPane().add(btnAdd);
		
		JButton btnSubtract = new JButton("Subtract");
		btnSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num1,num2,ans;
				try{
					num1=Integer.parseInt(textFieldNum1.getText());
					num2=Integer.parseInt(textFieldNum2.getText());
					
					ans=num1-num2;
					textFieldAns.setText(Integer.toString(ans));
				}catch(Exception s){
					JOptionPane.showMessageDialog(null, "Please enter valid number");
				}
			}
		});
		btnSubtract.setBounds(264, 123, 89, 23);
		frame.getContentPane().add(btnSubtract);
		
		JLabel lblTheAnswerIs = new JLabel("The Answer is:");
		lblTheAnswerIs.setBounds(40, 213, 97, 14);
		frame.getContentPane().add(lblTheAnswerIs);
		
		textFieldAns = new JTextField();
		textFieldAns.setBounds(267, 210, 86, 20);
		frame.getContentPane().add(textFieldAns);
		textFieldAns.setColumns(10);
	}
}
