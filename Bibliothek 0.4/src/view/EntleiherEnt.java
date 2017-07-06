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

public class EntleiherEnt extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	Storage storage;


	/**
	 * Create the frame.
	 */
	public EntleiherEnt(Storage storage) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		this.storage=storage;
		
		JButton btnZurck = new JButton("Zurück");
		btnZurck.setBounds(15, 16, 76, 23);
		btnZurck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnZurck.setFont(new Font("Arial", Font.PLAIN, 11));
		
		JLabel lblEntleiherEntfernen = new JLabel("Entleiher entfernen");
		lblEntleiherEntfernen.setBounds(337, 20, 134, 14);
		lblEntleiherEntfernen.setFont(new Font("Arial", Font.PLAIN, 11));
		
		JLabel lblGebenSieDie = new JLabel("Geben sie die ID des Entleihers ein, welchen sie entfernen möchten");
		lblGebenSieDie.setBounds(211, 159, 325, 14);
		lblGebenSieDie.setFont(new Font("Arial", Font.PLAIN, 11));
		
		textField = new JTextField();
		textField.setBounds(327, 210, 111, 20);
		textField.setColumns(10);
		
		JButton btnLschen = new JButton("Löschen");
		btnLschen.setBounds(339, 372, 99, 23);
		btnLschen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LöschenOK ok= new LöschenOK();
				ok.setVisible(true);
			}
		});
		btnLschen.setFont(new Font("Arial", Font.PLAIN, 11));
		
		JLabel lblAchtungDerVerbundene = new JLabel("Achtung: Der verbundene Schüler/Standort/externer Ausleiher wird ebenfalls gelöscht!");
		lblAchtungDerVerbundene.setBounds(161, 300, 499, 14);
		lblAchtungDerVerbundene.setFont(new Font("Arial", Font.PLAIN, 11));
		contentPane.setLayout(null);
		contentPane.add(btnZurck);
		contentPane.add(lblEntleiherEntfernen);
		contentPane.add(textField);
		contentPane.add(btnLschen);
		contentPane.add(lblAchtungDerVerbundene);
		contentPane.add(lblGebenSieDie);
		
		JLabel lblBack = new JLabel("");
		Image img0 = new ImageIcon(this.getClass().getResource("/Hintergrund 800p.png")).getImage();
		lblBack.setIcon(new ImageIcon(img0));
		lblBack.setBounds(0, 0, 846, 450);
		contentPane.add(lblBack);
	}

}
