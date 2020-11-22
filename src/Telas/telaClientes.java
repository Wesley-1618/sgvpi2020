package Telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class telaClientes extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaClientes frame = new telaClientes();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public telaClientes() {
		setTitle("Clientes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 58, 140, 43, 533, 0 };
		gbl_contentPane.rowHeights = new int[] { 82, 23, 23, 23, 23, 294, 57, 0 };
		gbl_contentPane.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		JButton btnCadastraCliente = new JButton("Cadastrar Cliente");
		GridBagConstraints gbc_btnCadastraCliente = new GridBagConstraints();
		gbc_btnCadastraCliente.anchor = GridBagConstraints.SOUTH;
		gbc_btnCadastraCliente.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnCadastraCliente.insets = new Insets(0, 0, 5, 5);
		gbc_btnCadastraCliente.gridx = 1;
		gbc_btnCadastraCliente.gridy = 0;
		contentPane.add(btnCadastraCliente, gbc_btnCadastraCliente);

		table = new JTable();
		GridBagConstraints gbc_table = new GridBagConstraints();
		gbc_table.fill = GridBagConstraints.BOTH;
		gbc_table.gridheight = 7;
		gbc_table.gridx = 3;
		gbc_table.gridy = 0;
		contentPane.add(table, gbc_table);

		JButton btnModificarCliente = new JButton("Modificar Cliente");
		GridBagConstraints gbc_btnModificarCliente = new GridBagConstraints();
		gbc_btnModificarCliente.anchor = GridBagConstraints.NORTH;
		gbc_btnModificarCliente.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnModificarCliente.insets = new Insets(0, 0, 5, 5);
		gbc_btnModificarCliente.gridx = 1;
		gbc_btnModificarCliente.gridy = 1;
		contentPane.add(btnModificarCliente, gbc_btnModificarCliente);

		JButton btnExcluirCliente = new JButton("Excluir Cliente");
		GridBagConstraints gbc_btnExcluirCliente = new GridBagConstraints();
		gbc_btnExcluirCliente.anchor = GridBagConstraints.NORTH;
		gbc_btnExcluirCliente.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnExcluirCliente.insets = new Insets(0, 0, 5, 5);
		gbc_btnExcluirCliente.gridx = 1;
		gbc_btnExcluirCliente.gridy = 2;
		contentPane.add(btnExcluirCliente, gbc_btnExcluirCliente);

		JButton btnHistoricoCompras = new JButton("Hist\u00F3rico de Compras");
		GridBagConstraints gbc_btnHistoricoCompras = new GridBagConstraints();
		gbc_btnHistoricoCompras.anchor = GridBagConstraints.NORTH;
		gbc_btnHistoricoCompras.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnHistoricoCompras.insets = new Insets(0, 0, 5, 5);
		gbc_btnHistoricoCompras.gridx = 1;
		gbc_btnHistoricoCompras.gridy = 3;
		contentPane.add(btnHistoricoCompras, gbc_btnHistoricoCompras);

		JButton btnUltimaCompra = new JButton("\u00DAltima Compra");
		GridBagConstraints gbc_btnUltimaCompra = new GridBagConstraints();
		gbc_btnUltimaCompra.anchor = GridBagConstraints.NORTH;
		gbc_btnUltimaCompra.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnUltimaCompra.insets = new Insets(0, 0, 5, 5);
		gbc_btnUltimaCompra.gridx = 1;
		gbc_btnUltimaCompra.gridy = 4;
		contentPane.add(btnUltimaCompra, gbc_btnUltimaCompra);

		JButton btnInicio = new JButton("Inicio");
		GridBagConstraints gbc_btnInicio = new GridBagConstraints();
		gbc_btnInicio.anchor = GridBagConstraints.NORTH;
		gbc_btnInicio.insets = new Insets(0, 0, 0, 5);
		gbc_btnInicio.gridx = 1;
		gbc_btnInicio.gridy = 6;
		btnInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new telaPrincipal().setVisible(true);
			}
		});
		contentPane.add(btnInicio, gbc_btnInicio);
	}
}
