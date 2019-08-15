package vista;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import control.*;

import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Principal {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
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
	public Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 309, 299);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNmeroDeColores = new JLabel("N\u00FAmero de colores");
		lblNmeroDeColores.setBounds(10, 11, 100, 14);
		frame.getContentPane().add(lblNmeroDeColores);

		textField = new JTextField();
		textField.setBounds(114, 8, 47, 17);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel label = new JLabel("(1-6)");
		label.setBounds(181, 11, 46, 14);
		frame.getContentPane().add(label);

		JTextArea parametrosMazo = new JTextArea();
		parametrosMazo.setBounds(37, 125, 222, 124);
		frame.getContentPane().add(parametrosMazo);

		JLabel lblNmeroDeCartas = new JLabel("N\u00FAmero de cartas");
		lblNmeroDeCartas.setBounds(10, 47, 100, 14);
		frame.getContentPane().add(lblNmeroDeCartas);

		JRadioButton rdbtnS = new JRadioButton("S\u00ED");

		rdbtnS.setBounds(114, 43, 47, 23);
		frame.getContentPane().add(rdbtnS);

		JRadioButton rdbtnNo = new JRadioButton("No");

		rdbtnNo.setBounds(178, 43, 47, 23);
		frame.getContentPane().add(rdbtnNo);
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnNo);
		group.add(rdbtnS);
		
		JButton btnRandomizar = new JButton("Randomizar");
		btnRandomizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String texto = textField.getText();
				int numeroColores=-1;
				int numCartas = -1;
				String textoAImprimir="";
				try {
					numeroColores = Integer.parseInt(texto);
				}catch(Exception e) {
					LaHasLiadoMacho error = new LaHasLiadoMacho();
					error.setVisible(true);
				}
				
				Color[] colores = Randomizer.coloresAleatorios(numeroColores);
				if(rdbtnS.isSelected()) {
					numCartas = Randomizer.numeroDeCartasAJugar();
					textoAImprimir=textoAImprimir+"Número de cartas: "+numCartas+"\n";
				}
				
				for (int i=0;i<numeroColores;i++) {
					textoAImprimir=textoAImprimir+colores[i].toString()+"\n";
				}
				parametrosMazo.setText(textoAImprimir);
				
			}
		});
		btnRandomizar.setBounds(37, 78, 222, 36);
		frame.getContentPane().add(btnRandomizar);
	}
	
}
