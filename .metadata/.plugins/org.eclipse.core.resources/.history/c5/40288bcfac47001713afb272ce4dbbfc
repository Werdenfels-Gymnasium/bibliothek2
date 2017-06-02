import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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

public class Klasse extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldAnz;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Klasse frame = new Klasse();
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
	public Klasse() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnZurck = new JButton("Zurück");
		btnZurck.setBounds(15, 16, 78, 23);
		btnZurck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnZurck.setFont(new Font("Arial", Font.PLAIN, 11));
		
		JLabel lblNeuerEintragFr = new JLabel("Neuer Eintrag für Klasse");
		lblNeuerEintragFr.setBounds(326, 20, 135, 14);
		lblNeuerEintragFr.setFont(new Font("Arial", Font.PLAIN, 11));
		
		JLabel lblAnzahlSchler = new JLabel("Anzahl Schüler");
		lblAnzahlSchler.setBounds(223, 176, 93, 14);
		lblAnzahlSchler.setFont(new Font("Arial", Font.PLAIN, 11));
		
		textFieldAnz = new JTextField();
		textFieldAnz.setBounds(441, 173, 133, 20);
		textFieldAnz.setColumns(10);
		
		JButton btnEintragErstellen = new JButton("Eintrag erstellen");
		btnEintragErstellen.setBounds(334, 372, 119, 23);
		btnEintragErstellen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				EintragOK ok= new EintragOK();
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
		
		JLabel lblBack = new JLabel("");
		lblBack.setBounds(0, 0, 784, 450);
		Image img0 = new ImageIcon(this.getClass().getResource("/Hintergrund 800p.png")).getImage();
		lblBack.setIcon(new ImageIcon(img0));
		contentPane.add(lblBack);
	}

}
