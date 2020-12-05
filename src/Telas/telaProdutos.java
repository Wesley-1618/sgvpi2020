package Telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

public class telaProdutos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable tbProdutos;
	private JTextField txPesquisa;
	private JTextField tfCodProd;
	private JTextField tfCodTipoProd;
	private JTextField tfValorProd;
	private JTextField tfNomeProd;
	private JTextField tfDescProd;
	private JTextField tfQtdProd;

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
		contentPane.setLayout(null);

		JButton btnCadastrarProduto = new JButton("Cadastrar");
		btnCadastrarProduto.setBounds(31, 193, 121, 23);
		contentPane.add(btnCadastrarProduto);

		JButton btnModificarProduto = new JButton("Modificar");
		btnModificarProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnModificarProduto.setBounds(157, 193, 117, 23);
		contentPane.add(btnModificarProduto);

		JButton btnExcluirProduto = new JButton("Excluir");
		btnExcluirProduto.setBounds(279, 193, 116, 23);
		contentPane.add(btnExcluirProduto);

		txPesquisa = new JTextField();
		txPesquisa.setBounds(400, 194, 244, 20);
		txPesquisa.setToolTipText("Pesquisar");
		contentPane.add(txPesquisa);
		txPesquisa.setColumns(10);

		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setBounds(650, 193, 91, 23);
		contentPane.add(btnPesquisar);

		tbProdutos = new JTable();
		tbProdutos.setBounds(10, 226, 764, 276);
		contentPane.add(tbProdutos);

		JButton btnInicio = new JButton("Inicio");
		btnInicio.setBounds(659, 527, 115, 23);
		btnInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new telaPrincipal().setVisible(true);
				telaProdutos.this.dispose();
			}
		});

		contentPane.add(btnInicio);
		
		JLabel lblCodProd = new JLabel("Cod .:");
		lblCodProd.setBounds(25, 31, 46, 14);
		contentPane.add(lblCodProd);
		
		tfCodProd = new JTextField();
		tfCodProd.setBounds(143, 28, 180, 20);
		contentPane.add(tfCodProd);
		tfCodProd.setColumns(10);
		
		JLabel lblCodTipoProd = new JLabel("Cod. Tipo Produto .:");
		lblCodTipoProd.setBounds(25, 62, 103, 14);
		contentPane.add(lblCodTipoProd);
		
		tfCodTipoProd = new JTextField();
		tfCodTipoProd.setBounds(143, 59, 180, 20);
		contentPane.add(tfCodTipoProd);
		tfCodTipoProd.setColumns(10);
		
		tfValorProd = new JTextField();
		tfValorProd.setBounds(143, 90, 180, 20);
		contentPane.add(tfValorProd);
		tfValorProd.setColumns(10);
		
		JLabel lblValorProd = new JLabel("Valor do Produto .:");
		lblValorProd.setBounds(25, 93, 91, 14);
		contentPane.add(lblValorProd);
		
		tfNomeProd = new JTextField();
		tfNomeProd.setBounds(143, 121, 180, 20);
		contentPane.add(tfNomeProd);
		tfNomeProd.setColumns(10);
		
		JLabel lblNomeProd = new JLabel("Produto .:");
		lblNomeProd.setBounds(25, 127, 63, 14);
		contentPane.add(lblNomeProd);
		
		JLabel lblDescProd = new JLabel("Descri\u00E7\u00E3o .:");
		lblDescProd.setBounds(400, 31, 78, 14);
		contentPane.add(lblDescProd);
		
		tfDescProd = new JTextField();
		tfDescProd.setBounds(400, 59, 244, 51);
		contentPane.add(tfDescProd);
		tfDescProd.setColumns(10);
		
		JLabel lblQtdProd = new JLabel("Quantidade .:");
		lblQtdProd.setBounds(400, 127, 78, 14);
		contentPane.add(lblQtdProd);
		
		tfQtdProd = new JTextField();
		tfQtdProd.setBounds(488, 121, 156, 20);
		contentPane.add(tfQtdProd);
		tfQtdProd.setColumns(10);
	}
}
