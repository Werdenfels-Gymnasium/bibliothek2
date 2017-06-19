import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Image;

public class EintragOK extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EintragOK frame = new EintragOK();
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
	public EintragOK() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblDerEintragWurde = new JLabel("Der Eintrag wurde erstellt");
		lblDerEintragWurde.setFont(new Font("Arial", Font.PLAIN, 11));
		lblDerEintragWurde.setBounds(133, 109, 185, 14);
		
		JLabel lblsymbol = new JLabel("");
		Image img1 = new ImageIcon(this.getClass().getResource("/OK.png")).getImage();
		lblsymbol.setIcon(new ImageIcon(img1));
		lblsymbol.setBounds(51, 92, 48, 48);
		
		JButton btnOk = new JButton("OK");
		btnOk.setFont(new Font("Arial", Font.PLAIN, 11));
		btnOk.setBounds(180, 222, 75, 23);
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		contentPane.setLayout(null);
		contentPane.add(lblsymbol);
		contentPane.add(lblDerEintragWurde);
		contentPane.add(btnOk);
		
		JLabel lblBack = new JLabel("");
		lblBack.setBounds(0, 0, 434, 450);
		Image img0 = new ImageIcon(this.getClass().getResource("/Hintergrund 800p.png")).getImage();
		lblBack.setIcon(new ImageIcon(img0));
		contentPane.add(lblBack);
	}
}
