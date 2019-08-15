package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class LaHasLiadoMacho extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LaHasLiadoMacho frame = new LaHasLiadoMacho();
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
	public LaHasLiadoMacho() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLaHasLiado = new JLabel("La has liado macho");
		lblLaHasLiado.setHorizontalAlignment(SwingConstants.CENTER);
		lblLaHasLiado.setFont(new Font("Tahoma", Font.PLAIN, 33));
		lblLaHasLiado.setBounds(10, 27, 388, 209);
		contentPane.add(lblLaHasLiado);
	}

}
