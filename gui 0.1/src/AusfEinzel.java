import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AusfEinzel extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AusfEinzel frame = new AusfEinzel();
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
	public AusfEinzel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblBitteGebenSie = new JLabel("Bitte geben Sie Ihre Daten ein!");
		
		JButton btnZurck = new JButton("Zurück");
		btnZurck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				contentPane.setVisible(false);
				dispose();
				Ausleihfenster.main(null);
			}
		});
		
		JLabel lblNewLabel = new JLabel("Nachname");
		
		JLabel lblNewLabel_1 = new JLabel("Vorname");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Adresse");
		
		JLabel lblNewLabel_3 = new JLabel("Telefonnummer");
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		JButton btnAuftragErstellen = new JButton("Auftrag erstellen");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnZurck, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
					.addGap(145)
					.addComponent(lblBitteGebenSie, GroupLayout.PREFERRED_SIZE, 260, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(269, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(167)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel_3)
							.addPreferredGap(ComponentPlacement.RELATED, 282, Short.MAX_VALUE)
							.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel_2)
							.addPreferredGap(ComponentPlacement.RELATED, 282, Short.MAX_VALUE)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel_1)
							.addPreferredGap(ComponentPlacement.RELATED, 282, Short.MAX_VALUE)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel)
							.addPreferredGap(ComponentPlacement.RELATED, 282, Short.MAX_VALUE)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(155))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(317)
					.addComponent(btnAuftragErstellen)
					.addContainerGap(316, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(12)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnZurck)
						.addComponent(lblBitteGebenSie))
					.addGap(116)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
					.addComponent(btnAuftragErstellen)
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
}
