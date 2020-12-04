package Telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class telaProdutos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable tbProdutos;
	private JTextField txPesquisa;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaProdutos frame = new telaProdutos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public telaProdutos() {
		setTitle("Produtos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 152, 121, 121, 249, 89, 0 };
		gbl_contentPane.rowHeights = new int[] { 38, 23, 30, 368, 44, 23, 0 };
		gbl_contentPane.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		JButton btnCadastrarProduto = new JButton("Cadastrar Produto");
		GridBagConstraints gbc_btnCadastrarProduto = new GridBagConstraints();
		gbc_btnCadastrarProduto.anchor = GridBagConstraints.NORTHEAST;
		gbc_btnCadastrarProduto.insets = new Insets(0, 0, 5, 5);
		gbc_btnCadastrarProduto.gridx = 0;
		gbc_btnCadastrarProduto.gridy = 1;
		contentPane.add(btnCadastrarProduto, gbc_btnCadastrarProduto);

		JButton btnModificarProduto = new JButton("Modificar Produto");
		GridBagConstraints gbc_btnModificarProduto = new GridBagConstraints();
		gbc_btnModificarProduto.anchor = GridBagConstraints.NORTH;
		gbc_btnModificarProduto.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnModificarProduto.insets = new Insets(0, 0, 5, 5);
		gbc_btnModificarProduto.gridx = 1;
		gbc_btnModificarProduto.gridy = 1;
		contentPane.add(btnModificarProduto, gbc_btnModificarProduto);

		JButton btnExcluirProduto = new JButton("Excluir Produto");
		GridBagConstraints gbc_btnExcluirProduto = new GridBagConstraints();
		gbc_btnExcluirProduto.anchor = GridBagConstraints.NORTH;
		gbc_btnExcluirProduto.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnExcluirProduto.insets = new Insets(0, 0, 5, 5);
		gbc_btnExcluirProduto.gridx = 2;
		gbc_btnExcluirProduto.gridy = 1;
		contentPane.add(btnExcluirProduto, gbc_btnExcluirProduto);

		txPesquisa = new JTextField();
		txPesquisa.setToolTipText("Pesquisar");
		GridBagConstraints gbc_txPesquisa = new GridBagConstraints();
		gbc_txPesquisa.fill = GridBagConstraints.HORIZONTAL;
		gbc_txPesquisa.insets = new Insets(0, 0, 5, 5);
		gbc_txPesquisa.gridx = 3;
		gbc_txPesquisa.gridy = 1;
		contentPane.add(txPesquisa, gbc_txPesquisa);
		txPesquisa.setColumns(10);

		JButton btnPesquisar = new JButton("Pesquisar");
		GridBagConstraints gbc_btnPesquisar = new GridBagConstraints();
		gbc_btnPesquisar.anchor = GridBagConstraints.NORTHEAST;
		gbc_btnPesquisar.insets = new Insets(0, 0, 5, 0);
		gbc_btnPesquisar.gridx = 4;
		gbc_btnPesquisar.gridy = 1;
		contentPane.add(btnPesquisar, gbc_btnPesquisar);

		tbProdutos = new JTable();
		GridBagConstraints gbc_tbProdutos = new GridBagConstraints();
		gbc_tbProdutos.fill = GridBagConstraints.BOTH;
		gbc_tbProdutos.insets = new Insets(0, 0, 5, 0);
		gbc_tbProdutos.gridwidth = 5;
		gbc_tbProdutos.gridx = 0;
		gbc_tbProdutos.gridy = 3;
		contentPane.add(tbProdutos, gbc_tbProdutos);

		JButton btnInicio = new JButton("Inicio");
		GridBagConstraints gbc_btnInicio = new GridBagConstraints();
		gbc_btnInicio.anchor = GridBagConstraints.NORTH;
		gbc_btnInicio.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnInicio.gridx = 4;
		gbc_btnInicio.gridy = 5;
		btnInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new telaPrincipal().setVisible(true);
				telaProdutos.this.dispose();
			}
		});

		contentPane.add(btnInicio, gbc_btnInicio);
	}
}
