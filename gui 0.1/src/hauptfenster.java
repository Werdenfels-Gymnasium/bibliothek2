import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class hauptfenster {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hauptfenster window = new hauptfenster();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public hauptfenster() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnVerleih = new JButton("Zum Bücherverleih");
		btnVerleih.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ausleihfenster ausl1=new Ausleihfenster();
				frame.dispose();
				ausl1.setVisible(true);
			}
		});
		
		JButton btnZuDenDatenbanken = new JButton("Zu den Datenbanken");
		
		JLabel lblAnfang = new JLabel("Wilkommen im Programm");
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(56)
					.addComponent(btnZuDenDatenbanken, GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
					.addGap(306)
					.addComponent(btnVerleih, GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
					.addGap(72))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addGap(306)
					.addComponent(lblAnfang, GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
					.addGap(301))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblAnfang, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addGap(199)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnZuDenDatenbanken, GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
						.addComponent(btnVerleih, GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
					.addGap(139))
		);
		frame.getContentPane().setLayout(groupLayout);
	}

}
