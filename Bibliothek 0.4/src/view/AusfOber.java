package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class AusfOber extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldLeh;
	private JTextField textFieldKu;
	private JTextField textFieldAnz;
	private JTextField textFieldBu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AusfOber frame = new AusfOber();
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
	public AusfOber() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblBitteGebenSie = new JLabel("Bitte geben Sie ihre Daten ein!");
		lblBitteGebenSie.setFont(new Font("Arial", Font.PLAIN, 11));
		lblBitteGebenSie.setBounds(309, 20, 248, 14);
		
		JLabel lblNewLabel = new JLabel("Lehrerkürzel");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 11));
		lblNewLabel.setBounds(82, 138, 383, 14);
		
		JLabel lblNewLabel_1 = new JLabel("Kurs");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(82, 176, 383, 14);
		
		JLabel lblNewLabel_2 = new JLabel("Anzahl");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(82, 214, 383, 14);
		
		textFieldLeh = new JTextField();
		textFieldLeh.setBounds(469, 135, 248, 20);
		textFieldLeh.setColumns(10);
		
		textFieldKu = new JTextField();
		textFieldKu.setBounds(469, 173, 248, 20);
		textFieldKu.setColumns(10);
		
		textFieldAnz = new JTextField();
		textFieldAnz.setBounds(469, 211, 248, 20);
		textFieldAnz.setColumns(10);
		
		JLabel lblBuch = new JLabel("Buch");
		lblBuch.setFont(new Font("Arial", Font.PLAIN, 11));
		lblBuch.setBounds(82, 252, 383, 14);
		
		textFieldBu = new JTextField();
		textFieldBu.setBounds(469, 249, 248, 20);
		textFieldBu.setColumns(10);
		
		JButton btnZurck = new JButton("Zurück");
		btnZurck.setFont(new Font("Arial", Font.PLAIN, 11));
		btnZurck.setBounds(15, 16, 94, 23);
		btnZurck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				contentPane.setVisible(false);
				dispose();
				Ausleihfenster.main(null);
			}
		});
		
		JButton btnAuftragErstellen = new JButton("Auftrag erstellen");
		btnAuftragErstellen.setFont(new Font("Arial", Font.PLAIN, 11));
		btnAuftragErstellen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AuftragOK ok=new AuftragOK();
				ok.setVisible(true);
			}
		});
		btnAuftragErstellen.setBounds(315, 377, 137, 23);
		contentPane.setLayout(null);
		contentPane.add(btnZurck);
		contentPane.add(lblBitteGebenSie);
		contentPane.add(lblNewLabel_2);
		contentPane.add(lblBuch);
		contentPane.add(lblNewLabel_1);
		contentPane.add(lblNewLabel);
		contentPane.add(textFieldAnz);
		contentPane.add(textFieldLeh);
		contentPane.add(textFieldBu);
		contentPane.add(textFieldKu);
		contentPane.add(btnAuftragErstellen);
		
		JLabel lblBack = new JLabel("");
		lblBack.setBounds(0, 0, 784, 450);
		contentPane.add(lblBack);
		Image img0 = new ImageIcon(this.getClass().getResource("/HintergrundRot 800p.png")).getImage();
		lblBack.setIcon(new ImageIcon(img0));
	}
}
