package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Image;

public class Buch extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldTitel;
	private JTextField textfieldKurz;
	private JTextField textFieldFach;
	private JTextField textFieldJgst;
	private JTextField textFieldISBN;
	private JTextField textFieldZweig;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Buch frame = new Buch();
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
	public Buch() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNeuerEintragFr = new JLabel("Neuer Eintrag für Buch");
		lblNeuerEintragFr.setBounds(331, 20, 136, 14);
		lblNeuerEintragFr.setFont(new Font("Arial", Font.PLAIN, 11));
		
		JLabel lblTitel = new JLabel("Titel");
		lblTitel.setBounds(209, 102, 100, 14);
		lblTitel.setFont(new Font("Arial", Font.PLAIN, 11));
		
		JLabel lblkurzTitel = new JLabel("Kurztitel");
		lblkurzTitel.setBounds(209, 140, 100, 14);
		lblkurzTitel.setFont(new Font("Arial", Font.PLAIN, 11));
		
		JLabel lblFach = new JLabel("Fach");
		lblFach.setBounds(209, 178, 100, 14);
		lblFach.setFont(new Font("Arial", Font.PLAIN, 11));
		
		JLabel lblJahrgang = new JLabel("Jahrgangsstufe");
		lblJahrgang.setBounds(209, 216, 100, 14);
		lblJahrgang.setFont(new Font("Arial", Font.PLAIN, 11));
		
		JLabel lblISBN = new JLabel("ISBN");
		lblISBN.setBounds(209, 254, 100, 14);
		lblISBN.setFont(new Font("Arial", Font.PLAIN, 11));
		
		JLabel lblZweig = new JLabel("Zweig");
		lblZweig.setBounds(209, 292, 100, 14);
		lblZweig.setFont(new Font("Arial", Font.PLAIN, 11));
		
		textFieldTitel = new JTextField();
		textFieldTitel.setBounds(454, 99, 145, 20);
		textFieldTitel.setColumns(10);
		
		textfieldKurz = new JTextField();
		textfieldKurz.setBounds(454, 137, 145, 20);
		textfieldKurz.setColumns(10);
		
		textFieldFach = new JTextField();
		textFieldFach.setBounds(454, 175, 145, 20);
		textFieldFach.setColumns(10);
		
		textFieldJgst = new JTextField();
		textFieldJgst.setBounds(454, 213, 145, 20);
		textFieldJgst.setColumns(10);
		
		textFieldISBN = new JTextField();
		textFieldISBN.setBounds(454, 251, 145, 20);
		textFieldISBN.setColumns(10);
		
		textFieldZweig = new JTextField();
		textFieldZweig.setBounds(454, 289, 145, 20);
		textFieldZweig.setColumns(10);
		
		JButton btnAuftragErstellen = new JButton("Eintrag erstellen");
		btnAuftragErstellen.setBounds(331, 372, 135, 23);
		btnAuftragErstellen.setFont(new Font("Arial", Font.PLAIN, 11));
		btnAuftragErstellen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Eintrag für Buch in die Datenbank
				EintragOK ok= new EintragOK();
				ok.setVisible(true);
				
				
			}
		});
		
		JButton btnZurck = new JButton("Zurück");
		btnZurck.setBounds(15, 16, 78, 23);
		btnZurck.setFont(new Font("Arial", Font.PLAIN, 11));
		btnZurck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnZurck);
		contentPane.add(btnAuftragErstellen);
		contentPane.add(lblNeuerEintragFr);
		contentPane.add(lblJahrgang);
		contentPane.add(lblFach);
		contentPane.add(lblkurzTitel);
		contentPane.add(lblTitel);
		contentPane.add(lblISBN);
		contentPane.add(lblZweig);
		contentPane.add(textFieldTitel);
		contentPane.add(textfieldKurz);
		contentPane.add(textFieldFach);
		contentPane.add(textFieldJgst);
		contentPane.add(textFieldISBN);
		contentPane.add(textFieldZweig);
		
		JLabel lblBack = new JLabel("");
		lblBack.setBounds(0, 0, 784, 450);
		Image img0 = new ImageIcon(this.getClass().getResource("/Hintergrund 800p.png")).getImage();
		lblBack.setIcon(new ImageIcon(img0));
		contentPane.add(lblBack);
	}
}
