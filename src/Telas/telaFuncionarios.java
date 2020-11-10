package Telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JButton;

public class telaFuncionarios extends JFrame {

	private JPanel contentPane;
	private JTable tbFuncionario;
	private JButton btnSair;
	private JButton btnCadastrarFuncionario;
	private JButton btnModificarFuncionrio;
	private JButton btnExcluirFuncionrio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaFuncionarios frame = new telaFuncionarios();
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
	public telaFuncionarios() {
		setTitle("Funcion\u00E1rios");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tbFuncionario = new JTable();
		tbFuncionario.setBounds(10, 132, 764, 384);
		contentPane.add(tbFuncionario);
		
		JButton button = new JButton("New button");
		button.setBounds(256, 414, 89, 23);
		contentPane.add(button);
		
		btnSair = new JButton("Sair");
		btnSair.setBounds(657, 527, 89, 23);
		contentPane.add(btnSair);
		
		btnCadastrarFuncionario = new JButton("Cadastrar Funcion\u00E1rio");
		btnCadastrarFuncionario.setBounds(10, 48, 139, 23);
		contentPane.add(btnCadastrarFuncionario);
		
		btnModificarFuncionrio = new JButton("Modificar Funcion\u00E1rio");
		btnModificarFuncionrio.setBounds(159, 48, 139, 23);
		contentPane.add(btnModificarFuncionrio);
		
		btnExcluirFuncionrio = new JButton("Excluir Funcion\u00E1rio");
		btnExcluirFuncionrio.setBounds(308, 48, 139, 23);
		contentPane.add(btnExcluirFuncionrio);
	}

}
