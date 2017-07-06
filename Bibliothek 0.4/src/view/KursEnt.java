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
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class KursEnt extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldAnz;
	Storage storage;

	/**
	 * Create the frame.
	 */
	public KursEnt(Storage storage) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		this.storage=storage;
		
		JButton btnZurck = new JButton("Zurück");
		btnZurck.setBounds(15, 16, 78, 23);
		btnZurck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnZurck.setFont(new Font("Arial", Font.PLAIN, 11));
		
		JLabel lblNeuerEintragFr = new JLabel("Kurs entfernen\r\n");
		lblNeuerEintragFr.setBounds(336, 20, 135, 14);
		lblNeuerEintragFr.setFont(new Font("Arial", Font.PLAIN, 11));
		
		JLabel lblAnzahlSchler = new JLabel("KursID");
		lblAnzahlSchler.setBounds(223, 176, 93, 14);
		lblAnzahlSchler.setFont(new Font("Arial", Font.PLAIN, 11));
		
		textFieldAnz = new JTextField();
		textFieldAnz.setBounds(441, 173, 133, 20);
		textFieldAnz.setColumns(10);
		
		JButton btnEintragErstellen = new JButton("Löschen");
		btnEintragErstellen.setBounds(334, 372, 119, 23);
		btnEintragErstellen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				LöschenOK ok= new LöschenOK();
				ok.setVisible(true);
			}
		});
		btnEintragErstellen.setFont(new Font("Arial", Font.PLAIN, 11));
		contentPane.setLayout(null);
		contentPane.add(lblAnzahlSchler);
		contentPane.add(textFieldAnz);
		contentPane.add(btnZurck);
		contentPane.add(btnEintragErstellen);
		contentPane.add(lblNeuerEintragFr);
		Image img0 = new ImageIcon(this.getClass().getResource("/Hintergrund 800p.png")).getImage();
		
		JLabel lblGebenSieDie = new JLabel("Geben sie die ID des Kurses ein, welchen sie entfernen möchten");
		lblGebenSieDie.setFont(new Font("Arial", Font.PLAIN, 11));
		lblGebenSieDie.setBounds(223, 96, 330, 14);
		contentPane.add(lblGebenSieDie);
		
		JLabel lblBack = new JLabel("");
		lblBack.setBounds(0, 0, 863, 450);
		lblBack.setIcon(new ImageIcon(img0));
		contentPane.add(lblBack);
	}
}
