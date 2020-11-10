package startBank;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateBDO {
	public void processar() {
		new CreateBDO().criarTable();
	}

	private void criarTable() {
		ConnectPg cnct = new ConnectPg();
		Connection tabConect = cnct.conectPostgree();
		System.out.println("\n");
		cnct.testConection();
		criarLoja(tabConect);
		criarFuncionario(tabConect);
		criarTipoProduto(tabConect);
		criarProduto(tabConect);
		criarFornecedor(tabConect);
		criarFornecimento(tabConect);
		criarEstoque(tabConect);
		criarCliente(tabConect);
		criarEnderecoCliente(tabConect);
		criarFormaPagamento(tabConect);
		criarVenda(tabConect);
	}

	private void criarLoja(Connection link) {
		StringBuilder sql = new StringBuilder();
		sql.append(" CREATE TABLE IF NOT EXISTS Loja");
		sql.append("(");
		sql.append(" cod_loja integer not null, ");
		sql.append(" loja_cnpj numeric(14) not null, ");
		sql.append(" constraint loja_pkey primary key (cod_loja) ");
		sql.append(")");

		try (Statement comando = link.createStatement();) {
			comando.execute(sql.toString());
		} catch (SQLException e) {
			ConnectPg.printSQLException(e, null);
		}
	}

	private void criarFuncionario(Connection link) {
		StringBuilder sql = new StringBuilder();
		sql.append(" CREATE TABLE IF NOT EXISTS Funcionario");
		sql.append("(");
		sql.append(" cod_funcionario integer not null, ");
		sql.append(" nome_funcionario varchar(40) not null,");
		sql.append(" cpf_funcionario numeric(14) not null, ");
		sql.append(" constraint funcionario_pkey primary key (cod_funcionario)");
		sql.append(")");

		try (Statement comando = link.createStatement();) {
			comando.execute(sql.toString());
		} catch (SQLException e) {
			ConnectPg.printSQLException(e, null);
		}
	}

	private void criarTipoProduto(Connection link) {
		StringBuilder sql = new StringBuilder();

		sql.append(" CREATE TABLE IF NOT EXISTS Tipo_Produto ");
		sql.append("(");
		sql.append("cod_tipo_produto integer not null,");
		sql.append("nome_tipo varchar(40), ");
		sql.append("constraint TipoProduto_pkey Primary key (cod_tipo_produto)");
		sql.append(")");

		try (Statement comando = link.createStatement();) {
			comando.execute(sql.toString());
		} catch (SQLException e) {
			ConnectPg.printSQLException(e, null);
		}

	}

	private void criarProduto(Connection link) {
		StringBuilder sql = new StringBuilder();

		sql.append(" CREATE TABLE IF NOT EXISTS Produto ");
		sql.append("(");
		sql.append(" cod_produto integer not null,");
		sql.append(" cod_tipo_produto integer not null,");
		sql.append(" preco_produto decimal(10,5) not null,");
		sql.append(" nome_produto varchar(40) not null,");
		sql.append(" descricao_produto varchar(120),");
		sql.append(" quantidade_produto decimal(10,5) not null, ");
		sql.append(" constraint produto_pkey primary key (cod_produto), ");
		sql.append(" Foreign Key (cod_tipo_produto) References Tipo_Produto (cod_tipo_produto) ");
		sql.append(")");

		try (Statement comando = link.createStatement();) {
			comando.execute(sql.toString());
		} catch (SQLException e) {
			ConnectPg.printSQLException(e, null);
		}

	}

	private void criarFornecedor(Connection link) {
		StringBuilder sql = new StringBuilder();
		sql.append(" CREATE TABLE IF NOT EXISTS Fornecedor ");
		sql.append("(");
		sql.append("cod_fornecedor integer not null, ");
		sql.append("cod_produto integer not null, ");
		sql.append("nome_fornecedor varchar (40) not null, ");
		sql.append("cnpj_fornecedor numeric(14) not null,");
		sql.append("contato_fornecedor varchar(40),");
		sql.append("telefone_fornecedor numeric (12),");
		sql.append("constraint fornecedor_pkey primary key (cod_fornecedor),");
		sql.append("foreign key (cod_produto) References Produto (cod_produto) ");
		sql.append(")");

		try (Statement comando = link.createStatement();) {
			comando.execute(sql.toString());
		} catch (SQLException e) {
			ConnectPg.printSQLException(e, null);
		}

	}

	private void criarFornecimento(Connection link) {
		StringBuilder sql = new StringBuilder();

		sql.append("CREATE TABLE IF NOT EXISTS Fornecimento");
		sql.append("(");
		sql.append("cod_fornecimento integer not null,");
		sql.append("cod_loja integer not null, ");
		sql.append("cod_fornecedor integer not null, ");
		sql.append("data_fornecimento date not null,");
		sql.append("constraint fornecimento_pkey primary key (cod_fornecimento),");
		sql.append("foreign key (cod_loja) references Loja (cod_loja),");
		sql.append("foreign key (cod_fornecedor) references Fornecedor (cod_fornecedor)");
		sql.append(")");

		try (Statement comando = link.createStatement();) {
			comando.execute(sql.toString());
		} catch (SQLException e) {
			ConnectPg.printSQLException(e, null);
		}
	}

	private void criarEstoque(Connection link) {
		StringBuilder sql = new StringBuilder();
		sql.append("CREATE TABLE IF NOT EXISTS Estoque");
		sql.append("(");
		sql.append("cod_estoque integer not null,");
		sql.append("cod_loja integer not null,");
		sql.append("cod_produto integer not null,");
		sql.append("quantidade_produto_estoque decimal(10,5),");
		sql.append("constraint estoque_pkey primary key (cod_estoque),");
		sql.append("foreign key (cod_loja) references Loja (cod_loja),");
		sql.append("foreign key (cod_produto) references Produto (cod_produto)");
		sql.append(")");

		try (Statement comando = link.createStatement();) {
			comando.execute(sql.toString());
		} catch (SQLException e) {
			ConnectPg.printSQLException(e, null);
		}
	}

	private void criarCliente(Connection link) {
		StringBuilder sql = new StringBuilder();
		sql.append("CREATE TABLE IF NOT EXISTS Cliente");
		sql.append("(");
		sql.append("cod_cliente integer not null,");
		sql.append("cpf_cliente numeric(14) not null,");
		sql.append("email_cliente varchar(50),");
		sql.append("telefone_cliente numeric(12),");
		sql.append("constraint cliente_pkey primary key (cod_cliente)");
		sql.append(")");

		try (Statement comando = link.createStatement();) {
			comando.execute(sql.toString());
		} catch (SQLException e) {
			ConnectPg.printSQLException(e, null);
		}
	}

	private void criarEnderecoCliente(Connection link) {
		StringBuilder sql = new StringBuilder();

		sql.append("CREATE TABLE IF NOT EXISTS Endereco_Cliente");
		sql.append("(");
		sql.append("cod_endereco_cliente integer not null,");
		sql.append("cod_cliente integer not null,");
		sql.append("nome_rua varchar(60) not null,");
		sql.append("numero_casa integer not null,");
		sql.append("cep_cliente numeric(8) not null,");
		sql.append("complemento_cliente varchar(10),");
		sql.append("constraint Endereco_Cliente_pkey primary key (cod_endereco_cliente),");
		sql.append("foreign key (cod_cliente) references Cliente (cod_cliente)");
		sql.append(")");

		try (Statement comando = link.createStatement();) {
			comando.execute(sql.toString());
		} catch (SQLException e) {
			ConnectPg.printSQLException(e, null);
		}
	}

	private void criarFormaPagamento(Connection link) {
		StringBuilder sql = new StringBuilder();
		sql.append("CREATE TABLE IF NOT EXISTS Forma_Pagamento");
		sql.append("(");
		sql.append("cod_forma_pagamento integer not null,");
		sql.append("forma_pagamento varchar(50) not null,");
		sql.append("constraint forma_pagamento_pkey primary key (cod_forma_pagamento)");
		sql.append(")");

		try (Statement comando = link.createStatement();) {
			comando.execute(sql.toString());
		} catch (SQLException e) {
			ConnectPg.printSQLException(e, null);
		}

	}

	private void criarVenda(Connection link) {
		StringBuilder sql = new StringBuilder();

		sql.append("CREATE TABLE IF NOT EXISTS Venda");
		sql.append("(");
		sql.append("cod_venda integer not null,");
		sql.append("cod_forma_pagamento integer not null,");
		sql.append("cod_cliente integer not null,");
		sql.append("cod_loja integer not null,");
		sql.append("cod_produto integer not null,");
		sql.append("valor_compra decimal(10,5),");
		sql.append("quantidade_produto_venda integer, ");
		sql.append("constraint venda_pkey primary key (cod_venda),");
		sql.append("foreign key (cod_forma_pagamento) references Forma_Pagamento (cod_forma_pagamento),");
		sql.append("foreign key (cod_cliente) references cliente (cod_cliente),");
		sql.append("foreign key (cod_loja) references loja (cod_loja),");
		sql.append("foreign key (cod_produto) references produto (cod_produto)");
		sql.append(")");

		try (Statement comando = link.createStatement();) {
			comando.execute(sql.toString());
		} catch (SQLException e) {
			ConnectPg.printSQLException(e, null);
		}
	}
}
