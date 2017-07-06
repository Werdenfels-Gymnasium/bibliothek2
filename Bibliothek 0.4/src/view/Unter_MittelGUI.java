package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Storage;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Image;

public class Unter_MittelGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNach;
	private JTextField textFieldVor;
	private JTextField textFieldAbi;
	private JTextField textFieldKlaID;
	Storage storage;
	private JTextField textField;
	private JTextField textField_1;

	

	/**
	 * Create the frame.
	 */
	public Unter_MittelGUI(Storage storage) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		this.storage=storage;
		
		JButton btnZurck = new JButton("Zurück");
		btnZurck.setBounds(15, 16, 94, 23);
		btnZurck.setFont(new Font("Arial", Font.PLAIN, 11));
		btnZurck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		JLabel lblNeuerEintragFr = new JLabel("Neuer Eintrag für Unter-/Mittelstufenschüler");
		lblNeuerEintragFr.setBounds(284, 20, 209, 14);
		lblNeuerEintragFr.setFont(new Font("Arial", Font.PLAIN, 11));
		
		JLabel lblNewLabel_1 = new JLabel("Nachname");
		lblNewLabel_1.setBounds(231, 111, 98, 14);
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 11));
		
		JLabel lblNewLabel_2 = new JLabel("Vorname");
		lblNewLabel_2.setBounds(231, 149, 98, 14);
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 11));
		
		JLabel lblNewLabel_3 = new JLabel("Geburtsdatum");
		lblNewLabel_3.setBounds(231, 187, 98, 14);
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 11));
		
		JLabel lblNewLabel_4 = new JLabel("Klasse");
		lblNewLabel_4.setBounds(231, 225, 98, 14);
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 11));
		
		textFieldNach = new JTextField();
		textFieldNach.setBounds(464, 108, 112, 20);
		textFieldNach.setColumns(10);
		
		textFieldVor = new JTextField();
		textFieldVor.setBounds(464, 146, 112, 20);
		textFieldVor.setColumns(10);
		
		textFieldAbi = new JTextField();
		textFieldAbi.setBounds(464, 184, 112, 20);
		textFieldAbi.setColumns(10);
		
		textFieldKlaID = new JTextField();
		textFieldKlaID.setBounds(464, 222, 112, 20);
		textFieldKlaID.setColumns(10);
		
		JButton btnEintragErstellen = new JButton("Eintrag erstellen");
		btnEintragErstellen.setBounds(326, 373, 125, 23);
		btnEintragErstellen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				EintragOK ok= new EintragOK();
				ok.setVisible(true);
			}
		});
		btnEintragErstellen.setFont(new Font("Arial", Font.PLAIN, 11));
		
		JLabel lblZweig = new JLabel("Zweig");
		lblZweig.setBounds(231, 263, 98, 14);
		
		JLabel lblNewLabel = new JLabel("Religion\r\n");
		lblNewLabel.setBounds(231, 301, 98, 14);
		
		textField = new JTextField();
		textField.setBounds(464, 260, 112, 20);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(464, 298, 112, 20);
		textField_1.setColumns(10);
		contentPane.setLayout(null);
		contentPane.add(btnZurck);
		contentPane.add(lblNeuerEintragFr);
		contentPane.add(lblNewLabel_1);
		contentPane.add(lblNewLabel_2);
		contentPane.add(lblNewLabel_3);
		contentPane.add(lblNewLabel_4);
		contentPane.add(lblZweig);
		contentPane.add(lblNewLabel);
		contentPane.add(textField_1);
		contentPane.add(textFieldKlaID);
		contentPane.add(textFieldAbi);
		contentPane.add(textFieldVor);
		contentPane.add(textFieldNach);
		contentPane.add(textField);
		contentPane.add(btnEintragErstellen);
		
		JLabel lblBack = new JLabel("");
		lblBack.setBounds(0, 0, 838, 450);
		contentPane.add(lblBack);
		Image img0 = new ImageIcon(this.getClass().getResource("/Hintergrund 800p.png")).getImage();
		lblBack.setIcon(new ImageIcon(img0));
	}
}
