import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Entleiher extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Entleiher frame = new Entleiher();
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
	public Entleiher() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnZurck = new JButton("Zurück");
		btnZurck.setFont(new Font("Arial", Font.PLAIN, 11));
		btnZurck.setBounds(15, 16, 85, 23);
		btnZurck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		JLabel lblNeuerEintargFr = new JLabel("Neuer Eintrag für Entleiher");
		lblNeuerEintargFr.setFont(new Font("Arial", Font.PLAIN, 11));
		lblNeuerEintargFr.setBounds(324, 20, 153, 14);
		
		JLabel lblArt = new JLabel("Art");
		lblArt.setFont(new Font("Arial", Font.PLAIN, 11));
		lblArt.setBounds(210, 193, 76, 14);
		
		String[] EntleiherArt = {"Einzelperson","Oberstufenschüler","Unter-/Mittelstufenschüler","Standort"} ;
		JComboBox comboBox = new JComboBox(EntleiherArt);
		comboBox.setFont(new Font("Arial", Font.PLAIN, 11));
		comboBox.setBounds(373, 190, 187, 20);
		
		JButton btnAuftragErstellen = new JButton("Eintrag erstellen");
		btnAuftragErstellen.setBounds(324, 372, 111, 23);
		btnAuftragErstellen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				EintragOK ok= new EintragOK();
				ok.setVisible(true);
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnZurck);
		contentPane.add(btnAuftragErstellen);
		contentPane.add(lblNeuerEintargFr);
		contentPane.add(lblArt);
		contentPane.add(comboBox);
		
		JLabel lblBack = new JLabel("");
		lblBack.setFont(new Font("Arial", Font.PLAIN, 11));
		lblBack.setBounds(0, 0, 784, 450);
		Image img0 = new ImageIcon(this.getClass().getResource("/Hintergrund 800p.png")).getImage();
		lblBack.setIcon(new ImageIcon(img0));
		contentPane.add(lblBack);
	}

}
