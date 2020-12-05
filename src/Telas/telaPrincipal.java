package Telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class telaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaPrincipal frame = new telaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public telaPrincipal() {
		setTitle("Menu Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Menu Principal");
		lblNewLabel.setBounds(117, 41, 138, 26);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 21));
		contentPane.add(lblNewLabel);

		JButton btnProdutos = new JButton("Produtos\r\n");
		btnProdutos.setBounds(105, 190, 165, 23);
		btnProdutos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new telaProdutos().setVisible(true);
				telaPrincipal.this.dispose();
			}
		});

		JPanel painelSecundario = new JPanel();
		painelSecundario.setBounds(384, 0, 400, 567);
		painelSecundario.setBackground(Color.GRAY);
		contentPane.add(painelSecundario);

		JButton btnCliente = new JButton("Clientes\r\n");
		btnCliente.setBounds(105, 125, 165, 23);
		contentPane.add(btnCliente);

		btnCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new telaClientes().setVisible(true);
				telaPrincipal.this.dispose();
			}
		});
		contentPane.add(btnProdutos);

		JButton btnFornecedor = new JButton("Fornecedores\r\n");
		btnFornecedor.setBounds(105, 255, 165, 23);
		btnFornecedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new telaFornecedor().setVisible(true);
				telaPrincipal.this.dispose();
			}
		});
		contentPane.add(btnFornecedor);

		JButton btnFuncionarios = new JButton("Funcionarios\r\n");
		btnFuncionarios.setBounds(105, 320, 165, 23);
		btnFuncionarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new telaFuncionarios().setVisible(true);
				telaPrincipal.this.dispose();
			}
		});
		contentPane.add(btnFuncionarios);

		JButton btnSair = new JButton("Sair");
		btnSair.setBounds(130, 527, 108, 23);
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		contentPane.add(btnSair);

	}
}
