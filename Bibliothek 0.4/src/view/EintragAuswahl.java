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
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;

public class EintragAuswahl extends JFrame {

	private JPanel contentPane;
	Storage storage;


	/**
	 * Create the frame.
	 */
	public EintragAuswahl(Storage storage) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		this.storage=storage;
		
		JLabel lblFrWelcheDatenbank = new JLabel("Für welche Datenbank möchten sie einen neuen Eintrag erstellen?");
		lblFrWelcheDatenbank.setBounds(226, 18, 318, 14);
		lblFrWelcheDatenbank.setFont(new Font("Arial", Font.PLAIN, 11));
		
		String[] Datenbanken= {"Bitte wählen sie die Datenbank aus","Buch","Entleiher","Einzelperson","Oberstufenschüler","Unter-/Mittelstufenschüler","Aufträge","Kurs","Klasse","Lehrer"};
		
		JButton btnZurck = new JButton("Zurück");
		btnZurck.setBounds(15, 14, 81, 23);
		btnZurck.setFont(new Font("Arial", Font.PLAIN, 11));
		btnZurck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		
		JButton btnNewButton = new JButton("Buch");
		btnNewButton.setBounds(176, 138, 131, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BuchGUI buch1 = new BuchGUI(storage);
				buch1.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 11));
		
		JButton btnNewButton_1 = new JButton("Entleiher");
		btnNewButton_1.setBounds(325, 138, 169, 23);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EntleiherGUI entl1= new EntleiherGUI(storage);
				entl1.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 11));
		
		JButton btnNewButton_2 = new JButton("Einzelperson");
		btnNewButton_2.setBounds(512, 138, 111, 23);
		btnNewButton_2.setFont(new Font("Arial", Font.PLAIN, 11));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EinzelpersonGUI einz1=new EinzelpersonGUI(storage);
				einz1.setVisible(true);
			}
		});
		
		JButton btnNewButton_3 = new JButton("Oberstufenschüler");
		btnNewButton_3.setBounds(176, 179, 131, 23);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OberstufenschülerGUI ob1= new OberstufenschülerGUI(storage);
				ob1.setVisible(true);
			}
		});
		btnNewButton_3.setFont(new Font("Arial", Font.PLAIN, 11));
		
		JButton btnNewButton_4 = new JButton("Unter/Mittelstufenschüler");
		btnNewButton_4.setBounds(325, 179, 169, 23);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Unter_MittelGUI um1 = new Unter_MittelGUI(storage);
				um1.setVisible(true);
			}
		});
		btnNewButton_4.setFont(new Font("Arial", Font.PLAIN, 11));
		
		JButton btnNewButton_5 = new JButton("Aufträge");
		btnNewButton_5.setBounds(512, 179, 111, 23);
		btnNewButton_5.setFont(new Font("Arial", Font.PLAIN, 11));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AuftragGUI auf1=new AuftragGUI(storage);
				auf1.setVisible(true);
			}
		});
		
		JButton btnNewButton_8 = new JButton("Standort");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Standort st1=new Standort(storage);
				st1.setVisible(true);
			}
		});
		btnNewButton_8.setBounds(176, 223, 131, 23);
		btnNewButton_8.setFont(new Font("Arial", Font.PLAIN, 11));
		contentPane.setLayout(null);
		contentPane.add(btnZurck);
		contentPane.add(lblFrWelcheDatenbank);
		contentPane.add(btnNewButton);
		contentPane.add(btnNewButton_3);
		contentPane.add(btnNewButton_1);
		contentPane.add(btnNewButton_4);
		contentPane.add(btnNewButton_2);
		contentPane.add(btnNewButton_5);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_6 = new JButton("Lehrer");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LehrerGUI lehr1=new LehrerGUI(storage);
				lehr1.setVisible(true);
			}
		});
		btnNewButton_6.setFont(new Font("Arial", Font.PLAIN, 11));
		btnNewButton_6.setBounds(512, 223, 111, 23);
		contentPane.add(btnNewButton_6);
		
		JLabel lblBack = new JLabel("");
		lblBack.setBounds(0, 0, 869, 450);
		contentPane.add(lblBack);
		Image img0 = new ImageIcon(this.getClass().getResource("/Hintergrund 800p.png")).getImage();
		lblBack.setIcon(new ImageIcon(img0));
	}
}
