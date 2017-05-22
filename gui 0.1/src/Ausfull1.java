import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class Ausfull1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ausfull1 frame = new Ausfull1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ausfull1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBitteGebenSie = new JLabel("Bitte geben sie ihre Daten ein !");
		lblBitteGebenSie.setBounds(109, 42, 222, 15);
		contentPane.add(lblBitteGebenSie);
		
		JButton btnZurück1 = new JButton("Zurück");
		btnZurück1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				contentPane.setVisible(false);
				dispose();
				Ausleihfenster.main(null);
			}
		});
		btnZurück1.setBounds(12, 12, 117, 25);
		contentPane.add(btnZurück1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(217, 128, 114, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(217, 174, 114, 19);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Kurs");
		lblNewLabel.setBounds(66, 84, 70, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Lehrerkürzel");
		lblNewLabel_1.setBounds(66, 130, 91, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Anzahl");
		lblNewLabel_2.setBounds(66, 176, 70, 15);
		contentPane.add(lblNewLabel_2);
		
		JButton btnAuftragErstellen = new JButton("Auftrag erstellen");
		btnAuftragErstellen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Auftrag wurde erstellt");
			}
		});
		btnAuftragErstellen.setBounds(133, 238, 155, 25);
		contentPane.add(btnAuftragErstellen);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(217, 79, 114, 24);
		contentPane.add(comboBox);
	}
}
