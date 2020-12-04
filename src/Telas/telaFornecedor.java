package Telas;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JButton;

public class telaFornecedor extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable tbFornecedores;

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

		JButton btnInicio = new JButton("Inicio");
		btnInicio.setBounds(685, 508, 89, 23);
		btnInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new telaPrincipal().setVisible(true);
				telaFornecedor.this.dispose();
			}
		});
		contentPane.add(btnInicio);
	}
}
