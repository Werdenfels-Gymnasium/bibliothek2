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

public class BuchEnt extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BuchEnt frame = new BuchEnt();
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
	public BuchEnt() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnZurck = new JButton("Zurück");
		btnZurck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnZurck.setBounds(15, 16, 80, 23);
		btnZurck.setFont(new Font("Arial", Font.PLAIN, 11));
		
		JLabel lblEintragAusBuch = new JLabel("Eintrag aus Buch entfernen");
		lblEintragAusBuch.setBounds(335, 20, 132, 14);
		lblEintragAusBuch.setFont(new Font("Arial", Font.PLAIN, 11));
		
		JLabel lblGebenSieDie = new JLabel("Geben sie die ISBN des Buches ein, welches Sie entfernen möchten");
		lblGebenSieDie.setBounds(225, 152, 428, 14);
		lblGebenSieDie.setFont(new Font("Arial", Font.PLAIN, 11));
		
		textField = new JTextField();
		textField.setBounds(316, 214, 161, 20);
		textField.setColumns(10);
		
		JButton btnLschen = new JButton("Löschen");
		btnLschen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LöschenOK ok= new LöschenOK();
				ok.setVisible(true);
			}
		});
		btnLschen.setFont(new Font("Arial", Font.PLAIN, 11));
		btnLschen.setBounds(335, 377, 110, 23);
		contentPane.setLayout(null);
		contentPane.add(btnZurck);
		contentPane.add(lblEintragAusBuch);
		contentPane.add(lblGebenSieDie);
		contentPane.add(textField);
		contentPane.add(btnLschen);
		
		JLabel lblBack = new JLabel("");
		Image img0 = new ImageIcon(this.getClass().getResource("/Hintergrund 800p.png")).getImage();
		lblBack.setIcon(new ImageIcon(img0));
		lblBack.setBounds(0, 0, 784, 450);
		contentPane.add(lblBack);
	}
}
