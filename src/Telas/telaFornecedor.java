package Telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JButton;

public class telaFornecedor extends JFrame {

	private JPanel contentPane;
	private JTable tbFornecedores;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaFornecedor frame = new telaFornecedor();
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
	public telaFornecedor() {
		setTitle("Fornecedores");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tbFornecedores = new JTable();
		tbFornecedores.setBounds(10, 177, 764, 307);
		contentPane.add(tbFornecedores);
		
		JButton btnCadastrarFornecedor = new JButton("Cadastrar Fornecedor");
		btnCadastrarFornecedor.setBounds(10, 61, 139, 23);
		contentPane.add(btnCadastrarFornecedor);
		
		JButton btnModificarFornecedor = new JButton("Modificar Fornecedor");
		btnModificarFornecedor.setBounds(159, 61, 139, 23);
		contentPane.add(btnModificarFornecedor);
		
		JButton btnExcluirFornecedor = new JButton("Excluir Fornecedor");
		btnExcluirFornecedor.setBounds(308, 61, 139, 23);
		contentPane.add(btnExcluirFornecedor);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setBounds(685, 508, 89, 23);
		contentPane.add(btnSair);
	}
}
