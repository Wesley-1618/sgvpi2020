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
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

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
		
		JLabel lblNewLabel = new JLabel("Cod .:");
		lblNewLabel.setBounds(25, 31, 46, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(143, 28, 180, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Cod. Tipo Produto .:");
		lblNewLabel_1.setBounds(25, 62, 103, 14);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(143, 59, 180, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(143, 90, 180, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Valor do Produto .:");
		lblNewLabel_2.setBounds(25, 93, 91, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(143, 121, 180, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Produto .:");
		lblNewLabel_3.setBounds(25, 127, 63, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Descri\u00E7\u00E3o .:");
		lblNewLabel_4.setBounds(400, 31, 78, 14);
		contentPane.add(lblNewLabel_4);
		
		textField_4 = new JTextField();
		textField_4.setBounds(400, 59, 244, 51);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Quantidade .:");
		lblNewLabel_5.setBounds(400, 127, 78, 14);
		contentPane.add(lblNewLabel_5);
		
		textField_5 = new JTextField();
		textField_5.setBounds(488, 121, 156, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
	}
}
