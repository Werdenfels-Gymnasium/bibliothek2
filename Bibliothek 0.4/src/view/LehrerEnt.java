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
import java.awt.Font;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LehrerEnt extends JFrame {

	private JPanel contentPane;
	private JTextField textField_2;
	Storage storage;

	

	/**
	 * Create the frame.
	 */
	public LehrerEnt(Storage storage) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		this.storage=storage;
		
		JLabel lblNeuerEintragFr = new JLabel("Lehrer entfernen");
		lblNeuerEintragFr.setBounds(343, 20, 146, 14);
		lblNeuerEintragFr.setFont(new Font("Arial", Font.PLAIN, 11));
		
		JButton btnZurck = new JButton("Zurück");
		btnZurck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnZurck.setBounds(15, 16, 75, 23);
		btnZurck.setFont(new Font("Arial", Font.PLAIN, 11));
		
		JLabel lblKrzel = new JLabel("Kürzel");
		lblKrzel.setBounds(238, 215, 90, 14);
		lblKrzel.setFont(new Font("Arial", Font.PLAIN, 11));
		
		textField_2 = new JTextField();
		textField_2.setBounds(455, 212, 102, 20);
		textField_2.setColumns(10);
		
		JButton btnEintragErstellen = new JButton("Löschen\r\n");
		btnEintragErstellen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LöschenOK ok= new LöschenOK();
				ok.setVisible(true);
			}
		});
		btnEintragErstellen.setBounds(347, 363, 132, 23);
		btnEintragErstellen.setFont(new Font("Arial", Font.PLAIN, 11));
		contentPane.setLayout(null);
		contentPane.add(lblNeuerEintragFr);
		contentPane.add(btnZurck);
		contentPane.add(lblKrzel);
		contentPane.add(textField_2);
		contentPane.add(btnEintragErstellen);
		
		JLabel lblBack = new JLabel("");
		Image img0 = new ImageIcon(this.getClass().getResource("/Hintergrund 800p.png")).getImage();
		lblBack.setIcon(new ImageIcon(img0));
		lblBack.setBounds(0, 0, 784, 450);
		contentPane.add(lblBack);
		
		JLabel lblGebenSieDas = new JLabel("Geben Sie das Kürzel des Lehrers ein, welchen Sie entfernen möchten");
		lblGebenSieDas.setFont(new Font("Arial", Font.PLAIN, 11));
		lblGebenSieDas.setBounds(219, 112, 374, 14);
		contentPane.add(lblGebenSieDas);
	}
}
