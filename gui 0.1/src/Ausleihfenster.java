import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Ausleihfenster extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ausleihfenster frame = new Ausleihfenster();
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
	public Ausleihfenster() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
			
		JLabel lblTitel1 = new JLabel("Wilkommen zum Buchverleih");
		lblTitel1.setBackground(Color.GRAY);
		
		JLabel lblText1 = new JLabel("Für wen wollen sie Bücher ausleihen?");
		
		JButton btnback1 = new JButton("Zurück");
		btnback1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			contentPane.setVisible(false);
			dispose();
			hauptfenster.main(null);
			}
		});
		
		JLabel lblU = new JLabel("Unterstufe");
		lblU.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				AusfUnter ausfu1=new AusfUnter();
				dispose();
				ausfu1.setVisible(true);
			}
		});
		Image img1 = new ImageIcon(this.getClass().getResource("/path3776.png")).getImage();
		lblU.setIcon(new ImageIcon(img1));
		
		JLabel lblO = new JLabel("Oberstufe");
		
		JLabel lblE = new JLabel("Einzeln");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnback1, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 207, Short.MAX_VALUE)
					.addComponent(lblTitel1, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE)
					.addGap(280))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addGap(233)
					.addComponent(lblText1, GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
					.addGap(177))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(63)
					.addComponent(lblU, GroupLayout.PREFERRED_SIZE, 99, Short.MAX_VALUE)
					.addGap(141)
					.addComponent(lblO, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
					.addGap(111)
					.addComponent(lblE, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
					.addGap(132))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(6)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnback1)
						.addComponent(lblTitel1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
					.addGap(42)
					.addComponent(lblText1, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(130)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblU)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblO, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblE, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)))
					.addGap(113))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
