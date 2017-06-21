package view;

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

public class Standort extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldSta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Standort frame = new Standort();
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
	public Standort() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnZurck = new JButton("Zurück");
		btnZurck.setBounds(15, 16, 91, 23);
		btnZurck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnZurck.setFont(new Font("Arial", Font.PLAIN, 11));
		
		JLabel lblNeuerEintragFr = new JLabel("Neuer Eintrag für Standort");
		lblNeuerEintragFr.setBounds(326, 20, 141, 14);
		lblNeuerEintragFr.setFont(new Font("Arial", Font.PLAIN, 11));
		
		JLabel lblNewLabel_1 = new JLabel("Standort");
		lblNewLabel_1.setBounds(254, 195, 82, 14);
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 11));
		
		textFieldSta = new JTextField();
		textFieldSta.setBounds(441, 192, 113, 20);
		textFieldSta.setColumns(10);
		
		JButton btnEintragErstellen = new JButton("Eintrag erstellen");
		btnEintragErstellen.setBounds(337, 372, 130, 23);
		btnEintragErstellen.setFont(new Font("Arial", Font.PLAIN, 11));
		btnEintragErstellen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				EintragOK ok= new EintragOK();
				ok.setVisible(true);
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnZurck);
		contentPane.add(lblNeuerEintragFr);
		contentPane.add(lblNewLabel_1);
		contentPane.add(textFieldSta);
		contentPane.add(btnEintragErstellen);
		
		JLabel lblBack = new JLabel("");
		lblBack.setBounds(0, 0, 784, 450);
		Image img0 = new ImageIcon(this.getClass().getResource("/Hintergrund 800p.png")).getImage();
		lblBack.setIcon(new ImageIcon(img0));
		contentPane.add(lblBack);
	}

}
