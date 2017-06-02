import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import java.awt.Font;

public class AusfUnter extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldLeh;
	private JTextField textFieldLat;
	private JTextField textFieldFra;
	private JTextField textFieldKath;
	private JTextField textFieldEva;
	private JTextField textFieldEth;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AusfUnter frame = new AusfUnter();
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
	public AusfUnter() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Lehrerkürzel");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 11));
		lblNewLabel.setBounds(70, 83, 228, 14);
		
		textFieldLeh = new JTextField();
		textFieldLeh.setBounds(468, 80, 212, 20);
		textFieldLeh.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Klasse");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(70, 115, 228, 14);
		
		JLabel lblNewLabel_2 = new JLabel("Anzahl Latein");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(70, 150, 394, 14);
		
		textFieldLat = new JTextField();
		textFieldLat.setBounds(468, 147, 212, 20);
		textFieldLat.setColumns(10);
		
		JLabel lblBitteGebenSie = new JLabel("Bitte geben sie ihre Daten ein!");
		lblBitteGebenSie.setFont(new Font("Arial", Font.PLAIN, 11));
		lblBitteGebenSie.setBounds(296, 20, 302, 14);
		
		JLabel lblAnzahlFranzsisch = new JLabel("Anzahl Französisch");
		lblAnzahlFranzsisch.setFont(new Font("Arial", Font.PLAIN, 11));
		lblAnzahlFranzsisch.setBounds(70, 188, 91, 14);
		
		JLabel lblAnzahlKatholisch = new JLabel("Anzahl katholisch");
		lblAnzahlKatholisch.setFont(new Font("Arial", Font.PLAIN, 11));
		lblAnzahlKatholisch.setBounds(70, 226, 91, 14);
		
		textFieldFra = new JTextField();
		textFieldFra.setBounds(468, 185, 212, 20);
		textFieldFra.setColumns(10);
		
		textFieldKath = new JTextField();
		textFieldKath.setBounds(468, 223, 212, 20);
		textFieldKath.setColumns(10);
		
		JLabel lblAnzahlEvangelisch = new JLabel("Anzahl evangelisch");
		lblAnzahlEvangelisch.setFont(new Font("Arial", Font.PLAIN, 11));
		lblAnzahlEvangelisch.setBounds(70, 264, 140, 14);
		
		JLabel lblAnzahlEthik = new JLabel("Anzahl Ethik");
		lblAnzahlEthik.setFont(new Font("Arial", Font.PLAIN, 11));
		lblAnzahlEthik.setBounds(70, 302, 119, 14);
		
		textFieldEva = new JTextField();
		textFieldEva.setBounds(468, 261, 212, 20);
		textFieldEva.setColumns(10);
		
		textFieldEth = new JTextField();
		textFieldEth.setBounds(468, 299, 212, 20);
		textFieldEth.setColumns(10);
		
		JButton btnAuftragErstellen = new JButton("Auftrag erstellen");
		btnAuftragErstellen.setFont(new Font("Arial", Font.PLAIN, 11));
		btnAuftragErstellen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AuftragOK ok=new AuftragOK();
				ok.setVisible(true);
			}
		});
		btnAuftragErstellen.setBounds(302, 382, 162, 18);
		
		JButton btnZurck = new JButton("Zurück");
		btnZurck.setFont(new Font("Arial", Font.PLAIN, 11));
		btnZurck.setBounds(15, 16, 96, 23);
		btnZurck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				contentPane.setVisible(false);
				dispose();
				Ausleihfenster.main(null);
			}
		});
		String[] Klassen= {"10a","10b","10c"};
		JComboBox comboBox = new JComboBox(Klassen);
		comboBox.setFont(new Font("Arial", Font.PLAIN, 11));
		comboBox.setBounds(468, 109, 212, 20);
		contentPane.setLayout(null);
		contentPane.add(btnZurck);
		contentPane.add(lblBitteGebenSie);
		contentPane.add(lblNewLabel_1);
		contentPane.add(lblNewLabel);
		contentPane.add(lblNewLabel_2);
		contentPane.add(lblAnzahlEvangelisch);
		contentPane.add(lblAnzahlEthik);
		contentPane.add(lblAnzahlKatholisch);
		contentPane.add(lblAnzahlFranzsisch);
		contentPane.add(textFieldEva);
		contentPane.add(textFieldLat);
		contentPane.add(textFieldLeh);
		contentPane.add(textFieldFra);
		contentPane.add(textFieldKath);
		contentPane.add(textFieldEth);
		contentPane.add(comboBox);
		contentPane.add(btnAuftragErstellen);
		
		JLabel lblBack = new JLabel("");
		lblBack.setBounds(0, 0, 784, 450);
		contentPane.add(lblBack);
		Image img0 = new ImageIcon(this.getClass().getResource("/HintergrundGelb 800p.png")).getImage();
		lblBack.setIcon(new ImageIcon(img0));
	}
}
