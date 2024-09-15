import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;

import java.util.*;

public class DadoVIEW extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField inputNomeJogador1;
	private JTextField inputNomeJogador2;
	private final Action action = new SwingAction();
	
	private int totalJogador1 = 0;
	private int totalJogador2 = 0;
	private boolean jogador1Jogou = false;
	private boolean jogador2Jogou = false;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DadoVIEW frame = new DadoVIEW();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public DadoVIEW() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 660, 520);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSair.setBounds(545, 11, 89, 23);
		contentPane.add(btnSair);
		
		JLabel lblNewLabel = new JLabel("Digite o nome do Jogador 1:");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(27, 61, 205, 23);
		contentPane.add(lblNewLabel);
		
		inputNomeJogador1 = new JTextField();
		inputNomeJogador1.setBounds(230, 63, 280, 21);
		contentPane.add(inputNomeJogador1);
		inputNomeJogador1.setColumns(10);
		
		JLabel lblDigiteONome = new JLabel("Digite o nome do Jogador 2:");
		lblDigiteONome.setForeground(Color.WHITE);
		lblDigiteONome.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		lblDigiteONome.setBounds(27, 95, 205, 23);
		contentPane.add(lblDigiteONome);
		
		inputNomeJogador2 = new JTextField();
		inputNomeJogador2.setColumns(10);
		inputNomeJogador2.setBounds(230, 97, 280, 21);
		contentPane.add(inputNomeJogador2);
		
		JLabel lblNewLabel_1 = new JLabel("----------------------------------------------------------------------------------------------------------------------------------------------");
		lblNewLabel_1.setBounds(37, 129, 583, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblJogador = new JLabel("Jogador 1:");
		lblJogador.setForeground(Color.WHITE);
		lblJogador.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		lblJogador.setBounds(10, 198, 82, 23);
		contentPane.add(lblJogador);
		
		JLabel lblJogador_2 = new JLabel("Jogador 2:");
		lblJogador_2.setForeground(Color.WHITE);
		lblJogador_2.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		lblJogador_2.setBounds(10, 303, 75, 23);
		contentPane.add(lblJogador_2);
		
		JTextArea outputNomeJogador1 = new JTextArea();
		outputNomeJogador1.setFont(new Font("Courier New", Font.BOLD, 20));
		outputNomeJogador1.setBounds(113, 177, 119, 72);
		contentPane.add(outputNomeJogador1);
		
		JTextArea outputNomeJogador2 = new JTextArea();
		outputNomeJogador2.setFont(new Font("Courier New", Font.BOLD, 20));
		outputNomeJogador2.setBounds(113, 281, 119, 72);
		contentPane.add(outputNomeJogador2);
		
		JLabel lblDado = new JLabel("Dado 1:");
		lblDado.setForeground(Color.WHITE);
		lblDado.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		lblDado.setBounds(258, 154, 82, 23);
		contentPane.add(lblDado);
		
		JLabel lblDado_2 = new JLabel("Dado 2:");
		lblDado_2.setForeground(Color.WHITE);
		lblDado_2.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		lblDado_2.setBounds(361, 154, 82, 23);
		contentPane.add(lblDado_2);
		
		JLabel lblDado_1_1 = new JLabel("Dado 3:");
		lblDado_1_1.setForeground(Color.WHITE);
		lblDado_1_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		lblDado_1_1.setBounds(453, 154, 82, 23);
		contentPane.add(lblDado_1_1);
		
		JLabel lblDado_1_2 = new JLabel("Dado 1:");
		lblDado_1_2.setForeground(Color.WHITE);
		lblDado_1_2.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		lblDado_1_2.setBounds(258, 252, 82, 23);
		contentPane.add(lblDado_1_2);
		
		JLabel lblDado_1_2_1 = new JLabel("Dado 2:");
		lblDado_1_2_1.setForeground(Color.WHITE);
		lblDado_1_2_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		lblDado_1_2_1.setBounds(361, 252, 82, 23);
		contentPane.add(lblDado_1_2_1);
		
		JLabel lblDado_1_2_1_1 = new JLabel("Dado 3:");
		lblDado_1_2_1_1.setForeground(Color.WHITE);
		lblDado_1_2_1_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		lblDado_1_2_1_1.setBounds(453, 252, 82, 23);
		contentPane.add(lblDado_1_2_1_1);
		
		JTextArea outputVencedor = new JTextArea();
		outputVencedor.setFont(new Font("Courier New", Font.BOLD, 30));
		outputVencedor.setBounds(80, 384, 511, 66);
		contentPane.add(outputVencedor);
		
		JLabel lblDado1Jogador1 = new JLabel("X");
		lblDado1Jogador1.setForeground(Color.WHITE);
		lblDado1Jogador1.setFont(new Font("Arial", Font.BOLD, 32));
		lblDado1Jogador1.setBounds(268, 198, 21, 23);
		contentPane.add(lblDado1Jogador1);
		
		JLabel lblDado2Jogador1 = new JLabel("X");
		lblDado2Jogador1.setForeground(Color.WHITE);
		lblDado2Jogador1.setFont(new Font("Arial", Font.BOLD, 32));
		lblDado2Jogador1.setBounds(371, 198, 21, 23);
		contentPane.add(lblDado2Jogador1);
		
		JLabel lblDado3Jogador1 = new JLabel("X");
		lblDado3Jogador1.setForeground(Color.WHITE);
		lblDado3Jogador1.setFont(new Font("Arial", Font.BOLD, 32));
		lblDado3Jogador1.setBounds(473, 198, 21, 23);
		contentPane.add(lblDado3Jogador1);
		
		JLabel lblDado1Jogador2 = new JLabel("X");
		lblDado1Jogador2.setForeground(Color.WHITE);
		lblDado1Jogador2.setFont(new Font("Arial", Font.BOLD, 32));
		lblDado1Jogador2.setBounds(268, 303, 21, 23);
		contentPane.add(lblDado1Jogador2);
		
		JLabel lblDado2Jogador2 = new JLabel("X");
		lblDado2Jogador2.setForeground(Color.WHITE);
		lblDado2Jogador2.setFont(new Font("Arial", Font.BOLD, 32));
		lblDado2Jogador2.setBounds(371, 297, 21, 23);
		contentPane.add(lblDado2Jogador2);
		
		JLabel lblDado3Jogador2 = new JLabel("X");
		lblDado3Jogador2.setForeground(Color.WHITE);
		lblDado3Jogador2.setFont(new Font("Arial", Font.BOLD, 32));
		lblDado3Jogador2.setBounds(473, 297, 21, 23);
		contentPane.add(lblDado3Jogador2);
		
		JButton btnResetar = new JButton("Resetar");
		btnResetar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String campoLimpo = "";
				inputNomeJogador1.setText(campoLimpo);
				inputNomeJogador2.setText(campoLimpo);
				outputNomeJogador1.setText(campoLimpo);
				outputNomeJogador2.setText(campoLimpo);
				lblDado1Jogador1.setText(campoLimpo);
				lblDado2Jogador1.setText(campoLimpo);
				lblDado3Jogador1.setText(campoLimpo);
				lblDado1Jogador2.setText(campoLimpo);
				lblDado2Jogador2.setText(campoLimpo);
				lblDado3Jogador2.setText(campoLimpo);
				outputVencedor.setText(campoLimpo);
			}
		});
		btnResetar.setBounds(10, 11, 89, 23);
		contentPane.add(btnResetar);
		
		JButton btnSalvarJogador1 = new JButton("Salvar");
		btnSalvarJogador1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nomeJogador1 = inputNomeJogador1.getText();
				outputNomeJogador1.setText(nomeJogador1);
			}
		});
		btnSalvarJogador1.setBounds(521, 62, 89, 23);
		contentPane.add(btnSalvarJogador1);
		
		JButton btnSalvarJogador2 = new JButton("Salvar");
		btnSalvarJogador2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nomeJogador2 = inputNomeJogador2.getText();
				outputNomeJogador2.setText(nomeJogador2);
			}
		});
		btnSalvarJogador2.setBounds(520, 96, 89, 23);
		contentPane.add(btnSalvarJogador2);
		
		JButton btnJogarJogador1 = new JButton("Jogar");
		btnJogarJogador1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int[] pontuacaoJogador1 = new int[3];
				Random random = new Random();
				
				for(int i = 0; i < 3; i++) {
					pontuacaoJogador1[i] = random.nextInt(6) + 1;
					totalJogador1 += pontuacaoJogador1[i];
 				}
				
		        if (valoresIguais(pontuacaoJogador1, 3)) totalJogador1 *= 3;
		        else if (valoresIguais(pontuacaoJogador1, 2)) totalJogador1 *= 2;
				
				lblDado1Jogador1.setText(pontuacaoJogador1[0] + "");
				lblDado2Jogador1.setText(pontuacaoJogador1[1] + "");
				lblDado3Jogador1.setText(pontuacaoJogador1[2] + "");
			}
		});
		btnJogarJogador1.setBounds(521, 154, 89, 23);
		contentPane.add(btnJogarJogador1);
		
		JButton btnJogarJogador2 = new JButton("Jogar");
		btnJogarJogador2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int [] pontuacaoJogador2 = new int[3];
				Random random = new Random();
				
				for(int i = 0; i < 3; i++) {
					pontuacaoJogador2[i] = random.nextInt(6) + 1;
					totalJogador2 += pontuacaoJogador2[i];
				}
				
				if (valoresIguais(pontuacaoJogador2, 3)) totalJogador2 *= 3;
		        else if (valoresIguais(pontuacaoJogador2, 2)) totalJogador2 *= 2;
				
				lblDado1Jogador2.setText(pontuacaoJogador2[0] + "");
				lblDado2Jogador2.setText(pontuacaoJogador2[1] + "");
				lblDado3Jogador2.setText(pontuacaoJogador2[2] + "");
				
				if(totalJogador1 > totalJogador2) {
					String nomeJog1 = inputNomeJogador1.getText();
					outputVencedor.setText(nomeJog1 + " venceu a partida!");
					return;
				}
				
				String nomeJog2 = inputNomeJogador2.getText();
				outputVencedor.setText(nomeJog2 + " venceu a partida!");
			}
		});
		btnJogarJogador2.setBounds(521, 253, 89, 23);
		contentPane.add(btnJogarJogador2);
		
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	
    private boolean valoresIguais(int[] dados, int quantidade) {
        Arrays.sort(dados);
        int iguais = 1;
        for (int i = 1; i < dados.length; i++) {
            if (dados[i] == dados[i - 1]) iguais++;
        }
        return iguais == quantidade;
    }
}
