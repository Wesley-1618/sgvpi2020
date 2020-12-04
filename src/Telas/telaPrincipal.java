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
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
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
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 104, 170, 110, 400, 0 };
		gbl_contentPane.rowHeights = new int[] { 77, 53, 27, 37, 27, 40, 27, 40, 27, 45, 23, 104, 34, 0 };
		gbl_contentPane.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		JLabel lblNewLabel = new JLabel("Menu Principal");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 21));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.SOUTH;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 0;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);

		JButton btnProdutos = new JButton("Produtos\r\n");
		btnProdutos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new telaProdutos().setVisible(true);
				telaPrincipal.this.dispose();
			}
		});

		JPanel painelSecundario = new JPanel();
		painelSecundario.setBackground(Color.GRAY);
		GridBagConstraints gbc_painelSecundario = new GridBagConstraints();
		gbc_painelSecundario.fill = GridBagConstraints.BOTH;
		gbc_painelSecundario.gridheight = 13;
		gbc_painelSecundario.gridx = 3;
		gbc_painelSecundario.gridy = 0;
		contentPane.add(painelSecundario, gbc_painelSecundario);

		JButton btnCliente = new JButton("Clientes\r\n");
		GridBagConstraints gbc_btnCliente = new GridBagConstraints();
		gbc_btnCliente.fill = GridBagConstraints.BOTH;
		gbc_btnCliente.insets = new Insets(0, 0, 5, 5);
		gbc_btnCliente.gridx = 1;
		gbc_btnCliente.gridy = 2;
		contentPane.add(btnCliente, gbc_btnCliente);
		GridBagConstraints gbc_btnProdutos = new GridBagConstraints();
		gbc_btnProdutos.fill = GridBagConstraints.BOTH;
		gbc_btnProdutos.insets = new Insets(0, 0, 5, 5);
		gbc_btnProdutos.gridx = 1;
		gbc_btnProdutos.gridy = 4;

		btnCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new telaClientes().setVisible(true);
				telaPrincipal.this.dispose();
			}
		});
		contentPane.add(btnProdutos, gbc_btnProdutos);

		JButton btnFornecedor = new JButton("Fornecedores\r\n");
		GridBagConstraints gbc_btnFornecedores = new GridBagConstraints();
		gbc_btnFornecedores.fill = GridBagConstraints.BOTH;
		gbc_btnFornecedores.insets = new Insets(0, 0, 5, 5);
		gbc_btnFornecedores.gridx = 1;
		gbc_btnFornecedores.gridy = 6;
		btnFornecedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new telaFornecedor().setVisible(true);
				telaPrincipal.this.dispose();
			}
		});
		contentPane.add(btnFornecedor, gbc_btnFornecedores);

		JButton btnFuncionarios = new JButton("Funcionarios\r\n");
		GridBagConstraints gbc_btnFuncionarios = new GridBagConstraints();
		gbc_btnFuncionarios.fill = GridBagConstraints.BOTH;
		gbc_btnFuncionarios.insets = new Insets(0, 0, 5, 5);
		gbc_btnFuncionarios.gridx = 1;
		gbc_btnFuncionarios.gridy = 8;
		btnFuncionarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new telaFuncionarios().setVisible(true);
				telaPrincipal.this.dispose();
			}
		});
		contentPane.add(btnFuncionarios, gbc_btnFuncionarios);

		JButton btnSair = new JButton("Sair");
		GridBagConstraints gbc_btnSair = new GridBagConstraints();
		gbc_btnSair.anchor = GridBagConstraints.NORTH;
		gbc_btnSair.insets = new Insets(0, 0, 0, 5);
		gbc_btnSair.gridx = 1;
		gbc_btnSair.gridy = 12;
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		contentPane.add(btnSair, gbc_btnSair);

	}
}
