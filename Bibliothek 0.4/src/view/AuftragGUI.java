package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Storage;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

public class AuftragGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldISBN;
	private JTextField textFieldEntID;
	private JTextField textFieldAbg;
	Storage storage;


	/**
	 * Create the frame.
	 */
	public AuftragGUI(Storage storage) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		this.storage=storage;
		
		JButton btnZurck = new JButton("Zurück");
		btnZurck.setBounds(15, 15, 97, 23);
		btnZurck.setFont(new Font("Arial", Font.PLAIN, 11));
		btnZurck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		JLabel lblNeuerEintragFr = new JLabel("Neuer Eintrag für Auftrag");
		lblNeuerEintragFr.setBounds(335, 19, 139, 14);
		lblNeuerEintragFr.setFont(new Font("Arial", Font.PLAIN, 11));
		
		JLabel lblNewLabel_1 = new JLabel("ISBN");
		lblNewLabel_1.setBounds(228, 161, 76, 14);
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 11));
		
		JLabel lblNewLabel_2 = new JLabel("EntleiherID");
		lblNewLabel_2.setBounds(228, 199, 76, 14);
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 11));
		
		JLabel lblNewLabel_3 = new JLabel("Abgabe");
		lblNewLabel_3.setBounds(228, 237, 76, 14);
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 11));
		
		textFieldISBN = new JTextField();
		textFieldISBN.setBounds(441, 158, 86, 20);
		textFieldISBN.setColumns(10);
		
		textFieldEntID = new JTextField();
		textFieldEntID.setBounds(441, 196, 86, 20);
		textFieldEntID.setColumns(10);
		
		textFieldAbg = new JTextField();
		textFieldAbg.setBounds(441, 234, 86, 20);
		textFieldAbg.setColumns(10);
		
		JButton btnEintragErstellen = new JButton("Eintrag erstellen");
		btnEintragErstellen.setBounds(335, 372, 121, 23);
		btnEintragErstellen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				EintragOK ok= new EintragOK();
				ok.setVisible(true);
			}
		});
		btnEintragErstellen.setFont(new Font("Arial", Font.PLAIN, 11));
		contentPane.setLayout(null);
		contentPane.add(lblNewLabel_3);
		contentPane.add(lblNewLabel_2);
		contentPane.add(lblNewLabel_1);
		contentPane.add(textFieldISBN);
		contentPane.add(textFieldEntID);
		contentPane.add(textFieldAbg);
		contentPane.add(btnZurck);
		contentPane.add(btnEintragErstellen);
		contentPane.add(lblNeuerEintragFr);
		
		JLabel lblBack = new JLabel("");
		lblBack.setBounds(0, 0, 784, 450);
		Image img0 = new ImageIcon(this.getClass().getResource("/Hintergrund 800p.png")).getImage();
		lblBack.setIcon(new ImageIcon(img0));
		contentPane.add(lblBack);
	}

}
