package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Storage;

import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.imageio.*;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;

public class Ausleihfenster extends JFrame {

	private JPanel contentPane;
	Storage storage;

	public Ausleihfenster(Storage storage) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		this.storage = storage;
	
			
		JLabel lblTitel1 = new JLabel("Wilkommen zum Buchverleih");
		lblTitel1.setFont(new Font("Arial", Font.PLAIN, 11));
		lblTitel1.setBounds(310, 11, 211, 33);
		lblTitel1.setBackground(Color.GRAY);
		
		JLabel lblText1 = new JLabel("Für wen wollen sie Bücher ausleihen?");
		lblText1.setFont(new Font("Arial", Font.PLAIN, 11));
		lblText1.setBounds(281, 92, 292, 23);
		
		JButton btnback1 = new JButton("Zurück");
		btnback1.setFont(new Font("Arial", Font.PLAIN, 11));
		btnback1.setBounds(15, 16, 89, 23);
		btnback1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			dispose();
			hauptfenster haupt1 =new hauptfenster(storage);
			haupt1.frame.setVisible(true);
			}
		});
		
		JLabel lblU = new JLabel("");
		lblU.setBounds(79, 239, 123, 124);
		lblU.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				AusfUnter ausfu1=new AusfUnter(storage);
				dispose();
				ausfu1.setVisible(true);
			}
		});
		Image img1 = new ImageIcon(this.getClass().getResource("/gelb.png")).getImage();
		lblU.setIcon(new ImageIcon(img1));
		
		JLabel lblO = new JLabel("");
		lblO.setBounds(319, 239, 134, 124);
		Image img2 = new ImageIcon(this.getClass().getResource("/rot.png")).getImage();
		lblO.setIcon(new ImageIcon(img2));

		lblO.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				AusfOber ausfu2=new AusfOber();
				dispose();
				ausfu2.setVisible(true);
				
			}
		});
		
		JLabel lblE = new JLabel("");
		lblE.setBounds(534, 239, 135, 124);
		Image img3 = new ImageIcon(this.getClass().getResource("/blau.png")).getImage();
		lblE.setIcon(new ImageIcon(img3));
		lblE.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AusfEinzel ausfu3=new AusfEinzel();
				dispose();
				ausfu3.setVisible(true);
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnback1);
		contentPane.add(lblTitel1);
		contentPane.add(lblU);
		contentPane.add(lblO);
		contentPane.add(lblE);
		contentPane.add(lblText1);
		
		JLabel lblBack = new JLabel("");
		lblBack.setBounds(0, 0, 784, 450);
		contentPane.add(lblBack);
		Image img0 = new ImageIcon(this.getClass().getResource("/Hintergrund 800p.png")).getImage();
		lblBack.setIcon(new ImageIcon(img0));
	}
}
