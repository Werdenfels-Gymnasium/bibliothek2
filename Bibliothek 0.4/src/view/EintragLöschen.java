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

public class EintragLöschen extends JFrame {

	private JPanel contentPane;
	Storage storage;


	/**
	 * Create the frame.
	 */
	public EintragLöschen(Storage storage) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		this.storage=storage;
		
		JLabel lblFrWelcheDatenbank = new JLabel("Aus welcher Datenbank möchten sie einen Eintrag entfernen?");
		lblFrWelcheDatenbank.setBounds(244, 18, 318, 14);
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
				BuchEnt buch1 = new BuchEnt();
				buch1.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 11));
		
		JButton btnNewButton_1 = new JButton("Entleiher");
		btnNewButton_1.setBounds(325, 138, 169, 23);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EntleiherEnt entl1= new EntleiherEnt();
				entl1.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 11));
		
		JButton btnNewButton_5 = new JButton("Aufträge");
		btnNewButton_5.setBounds(512, 138, 111, 23);
		btnNewButton_5.setFont(new Font("Arial", Font.PLAIN, 11));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AuftragEnt auf1=new AuftragEnt();
				auf1.setVisible(true);
			}
		});
		
		JButton btnNewButton_6 = new JButton("Kurs");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KursEnt ku1=new KursEnt();
				ku1.setVisible(true);
			}
		});
		btnNewButton_6.setBounds(240, 220, 131, 23);
		btnNewButton_6.setFont(new Font("Arial", Font.PLAIN, 11));
		
		JButton btnNewButton_7 = new JButton("Klasse");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KlasseEnt kla1= new KlasseEnt();
				kla1.setVisible(true);
				
			}
		});
		btnNewButton_7.setBounds(423, 220, 169, 23);
		btnNewButton_7.setFont(new Font("Arial", Font.PLAIN, 11));
		contentPane.setLayout(null);
		contentPane.add(btnZurck);
		contentPane.add(lblFrWelcheDatenbank);
		contentPane.add(btnNewButton_6);
		contentPane.add(btnNewButton);
		contentPane.add(btnNewButton_7);
		contentPane.add(btnNewButton_1);
		contentPane.add(btnNewButton_5);
		
		JLabel lblBack = new JLabel("");
		lblBack.setBounds(0, 0, 784, 450);
		contentPane.add(lblBack);
		Image img0 = new ImageIcon(this.getClass().getResource("/Hintergrund 800p.png")).getImage();
		lblBack.setIcon(new ImageIcon(img0));
	}
}
