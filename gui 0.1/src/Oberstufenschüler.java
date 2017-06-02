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
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Image;

public class Oberstufenschüler extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNach;
	private JTextField textFieldVor;
	private JTextField textFieldAbi;
	private JTextField textFieldKuID;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Oberstufenschüler frame = new Oberstufenschüler();
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
	public Oberstufenschüler() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnZurck = new JButton("Zurück");
		btnZurck.setBounds(15, 16, 84, 23);
		btnZurck.setFont(new Font("Arial", Font.PLAIN, 11));
		btnZurck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		JLabel lblNeuerEintragFr = new JLabel("Neuer Eintrag für Oberstufenschüler");
		lblNeuerEintragFr.setBounds(301, 20, 176, 14);
		lblNeuerEintragFr.setFont(new Font("Arial", Font.PLAIN, 11));
		
		JLabel lblNewLabel_1 = new JLabel("Nachname");
		lblNewLabel_1.setBounds(215, 152, 103, 14);
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 11));
		
		JLabel lblNewLabel_2 = new JLabel("Vorname");
		lblNewLabel_2.setBounds(215, 190, 103, 14);
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 11));
		
		JLabel lblNewLabel_3 = new JLabel("Abiturjahrgang");
		lblNewLabel_3.setBounds(215, 228, 103, 14);
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 11));
		
		JLabel lblNewLabel_4 = new JLabel("KursID");
		lblNewLabel_4.setBounds(215, 266, 103, 14);
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 11));
		
		textFieldNach = new JTextField();
		textFieldNach.setBounds(472, 149, 110, 20);
		textFieldNach.setColumns(10);
		
		textFieldVor = new JTextField();
		textFieldVor.setBounds(472, 187, 110, 20);
		textFieldVor.setColumns(10);
		
		textFieldAbi = new JTextField();
		textFieldAbi.setBounds(472, 225, 110, 20);
		textFieldAbi.setColumns(10);
		
		textFieldKuID = new JTextField();
		textFieldKuID.setBounds(472, 263, 110, 20);
		textFieldKuID.setColumns(10);
		
		JButton btnEintragErstellen = new JButton("Eintrag erstellen");
		btnEintragErstellen.setBounds(329, 372, 123, 23);
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
		contentPane.add(lblNewLabel_2);
		contentPane.add(lblNewLabel_3);
		contentPane.add(lblNewLabel_4);
		contentPane.add(textFieldNach);
		contentPane.add(textFieldVor);
		contentPane.add(textFieldAbi);
		contentPane.add(textFieldKuID);
		contentPane.add(btnEintragErstellen);
		
		JLabel lblBack = new JLabel("");
		lblBack.setBounds(0, 0, 784, 450);
		Image img0 = new ImageIcon(this.getClass().getResource("/Hintergrund 800p.png")).getImage();
		lblBack.setIcon(new ImageIcon(img0));
		contentPane.add(lblBack);
	}

}
