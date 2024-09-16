import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalcVIEW extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField outputNumeros;
	private JButton btn1;
	
	private long expressao = 0;
	private long valor1 = 0;
	private long valor2 = 0;
	private char operacao = '&';
	private boolean apenasUmValor = false;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcVIEW frame = new CalcVIEW();
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
	public CalcVIEW() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 525, 470);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 120, 272, 302);
		contentPane.add(panel);
		panel.setLayout(null);
		
		btn1 = new JButton("1");
		btn1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn1.setBounds(10, 11, 75, 60);
		panel.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn2.setBounds(95, 11, 75, 60);
		panel.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn3.setBounds(180, 11, 75, 60);
		panel.add(btn3);
		
		JButton btn6 = new JButton("6");
		btn6.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn6.setBounds(180, 82, 75, 60);
		panel.add(btn6);
		
		JButton btn5 = new JButton("5");
		btn5.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn5.setBounds(95, 82, 75, 60);
		panel.add(btn5);
		
		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn4.setBounds(10, 82, 75, 60);
		panel.add(btn4);
		
		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn9.setBounds(180, 153, 75, 60);
		panel.add(btn9);
		
		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn8.setBounds(95, 153, 75, 60);
		panel.add(btn8);
		
		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn7.setBounds(10, 153, 75, 60);
		panel.add(btn7);
		
		JButton btn0 = new JButton("0");
		btn0.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn0.setBounds(95, 224, 75, 60);
		panel.add(btn0);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(308, 120, 195, 230);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnMultiplicacao = new JButton("X");
		btnMultiplicacao.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnMultiplicacao.setBounds(10, 11, 75, 60);
		panel_1.add(btnMultiplicacao);
		
		JButton btnDivisao = new JButton("/");
		btnDivisao.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDivisao.setBounds(95, 11, 75, 60);
		panel_1.add(btnDivisao);
		
		JButton btnSoma = new JButton("+");
		btnSoma.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSoma.setBounds(10, 82, 75, 60);
		panel_1.add(btnSoma);
		
		JButton btnSubtracao = new JButton("-");
		btnSubtracao.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSubtracao.setBounds(95, 82, 75, 60);
		panel_1.add(btnSubtracao);
		
		JButton btnIgual = new JButton("=");
		btnIgual.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnIgual.setBounds(10, 153, 75, 60);
		panel_1.add(btnIgual);
		
		JButton btnLimpa = new JButton("C");
		btnLimpa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				zeraValores();
			}
		});
		btnLimpa.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnLimpa.setBounds(95, 153, 75, 60);
		panel_1.add(btnLimpa);
		
		JLabel lblNewLabel = new JLabel("Calculadora");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 25));
		lblNewLabel.setBounds(211, 11, 179, 30);
		contentPane.add(lblNewLabel);
		
		outputNumeros = new JTextField();
		outputNumeros.setBounds(10, 55, 493, 44);
		contentPane.add(outputNumeros);
		outputNumeros.setColumns(10);
	}
	
	public void zeraValores() {
		expressao = 0;
		valor1 = 0;
		valor2 = 0;
		operacao = '&';
		outputNumeros.setText(String.valueOf(expressao)); 
		apenasUmValor = false;
	}
	
	public void imprimeOperacao() {
		outputNumeros.setText(String.valueOf(valor1) + " " + operacao);
	}
	
	public void imprimeResultado(long resultado) {
		outputNumeros.setText(String.valueOf(expressao));
	}
	
	public void imprimeErro(String erro) {
		JOptionPane.showMessageDialog(null,erro);
	}
}
