import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class AuftragOK extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AuftragOK frame = new AuftragOK();
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
	public AuftragOK() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDerAufragWurde = new JLabel("Der Aufrag wurde erstellt!");
		lblDerAufragWurde.setFont(new Font("Arial", Font.PLAIN, 11));
		lblDerAufragWurde.setBounds(150, 114, 157, 14);
		contentPane.add(lblDerAufragWurde);
		
		JLabel lblsymbol = new JLabel("");
		lblsymbol.setBounds(69, 100, 48, 48);
		Image img1 = new ImageIcon(this.getClass().getResource("/OK.png")).getImage();
		lblsymbol.setIcon(new ImageIcon(img1));
		contentPane.add(lblsymbol);
		
		JButton btnOk = new JButton("OK");
		btnOk.setFont(new Font("Arial", Font.PLAIN, 11));
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnOk.setBounds(173, 227, 89, 23);
		contentPane.add(btnOk);
		
		JLabel lblBack = new JLabel("");
		lblBack.setBounds(173, 11, 46, 14);
		lblBack.setBounds(0, 0, 784, 450);
		Image img0 = new ImageIcon(this.getClass().getResource("/Hintergrund 800p.png")).getImage();
		lblBack.setIcon(new ImageIcon(img0));
		contentPane.add(lblBack);
	}

}
