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
		sql.append("tel_fornecedor numeric (12),");
		sql.append("constraint fornecedor_pkey primary key (cod_fornecedor),");
		sql.append("foreign key (cod_produto) References Produto (cod_produto) ");
		sql.append(")");

		try (Statement comando = link.createStatement();) {
			comando.execute(sql.toString());
		} catch (SQLException e) {
			ConnectPg.printSQLException(e, null);
		}

	}
}
