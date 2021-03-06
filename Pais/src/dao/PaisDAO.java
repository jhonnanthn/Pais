package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Pais;

public class PaisDAO {

	public int createPais(Pais pais) {
		String sqlInsert = "INSERT INTO pais(nome, populacao, area) VALUES (?, ?, ?)";
		// usando o try with resources do Java 7
		try (Connection conn = ConnectionFactory.obterConexao();
				PreparedStatement stm = conn.prepareStatement(sqlInsert);) {
			stm.setString	(1, pais.getNome());
			stm.setLong	(2, pais.getPopulacao());
			stm.setDouble	(3, pais.getArea());
			stm.execute();
			String sqlQuery  = "SELECT LAST_INSERT_ID()";
			try(PreparedStatement stm2 = conn.prepareStatement(sqlQuery);
				ResultSet rs = stm2.executeQuery();) {
				if(rs.next()){
					pais.setId(rs.getInt(1));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pais.getId();
	}

	public Pais loadPais(Pais pais) {
		String sqlSelect = "SELECT nome, populacao, area FROM pais WHERE pais.id = ?";
		// usando o try with resources do Java 7, que fecha o que abriu
		try (Connection conn = ConnectionFactory.obterConexao();
				PreparedStatement stm = conn.prepareStatement(sqlSelect);) {
			stm.setInt(1, pais.getId());
			try (ResultSet rs = stm.executeQuery();) {
				if (rs.next()) {
					pais.setNome(rs.getString("nome"));
					pais.setPopulacao(Long.parseLong(rs.getString("populacao")));
					pais.setArea(Double.parseDouble(rs.getString("area")));
				} else {
					pais.setId(-1);
					pais.setNome(null);
					pais.setPopulacao(0);
					pais.setArea(0);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e1) {
			System.out.print(e1.getStackTrace());
		}
		return pais;
	}


	public void updatePais(Pais pais) {
		String sqlUpdate = "UPDATE pais SET nome=?, populacao=?, area=? WHERE id=?";
		// usando o try with resources do Java 7, que fecha o que abriu
		try (Connection conn = ConnectionFactory.obterConexao();
				PreparedStatement stm = conn.prepareStatement(sqlUpdate);) {
			stm.setString(1, pais.getNome());
			stm.setString(2, String.valueOf(pais.getPopulacao()));
			stm.setString(3, String.valueOf(pais.getArea()));
			stm.setInt(4, pais.getId());
			stm.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void deletePais(Pais pais) {
		String sqlDelete = "DELETE FROM pais WHERE id = ?";
		// usando o try with resources do Java 7, que fecha o que abriu
		try (Connection conn = ConnectionFactory.obterConexao();
				PreparedStatement stm = conn.prepareStatement(sqlDelete);) {
			stm.setInt(1, pais.getId());
			stm.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public String maiorPopulacao() {
		String sqlSelect = "SELECT nome, populacao FROM pais ORDER BY populacao DESC LIMIT 1";
		// usando o try with resources do Java 7, que fecha o que abriu
		try (Connection conn = ConnectionFactory.obterConexao();
				PreparedStatement stm = conn.prepareStatement(sqlSelect);) {
			
			try (ResultSet rs = stm.executeQuery();) {
				if (rs.next()) {
					String nome = rs.getString("nome");
					String populacao = rs.getString("populacao");
					System.out.println(nome);
					System.out.println(populacao);
					return nome;

				} 
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e1) {
			System.out.print(e1.getStackTrace());
		}
		return null;
	}
	
	public String menorArea() {
		String sqlSelect = "SELECT nome, area FROM pais ORDER BY area LIMIT 1";
		// usando o try with resources do Java 7, que fecha o que abriu
		try (Connection conn = ConnectionFactory.obterConexao();
				PreparedStatement stm = conn.prepareStatement(sqlSelect);) {
			
			try (ResultSet rs = stm.executeQuery();) {
				if (rs.next()) {
					String nome = rs.getString("nome");
					String area = rs.getString("area");
					System.out.println(nome);
					System.out.println(area);
					return nome;

				} 
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e1) {
			System.out.print(e1.getStackTrace());
		}
		return null;
	}
	
	public ArrayList<Pais> listarPais() {
		Pais Pais;
		ArrayList<Pais> lista = new ArrayList<>();
		String sqlSelect = "SELECT id, nome, populacao, area FROM pais";
		// usando o try with resources do Java 7, que fecha o que abriu
		try (Connection conn = ConnectionFactory.obterConexao();
				PreparedStatement stm = conn.prepareStatement(sqlSelect);) {
			try (ResultSet rs = stm.executeQuery();) {
				while (rs.next()) {
					Pais = new Pais();
					Pais.setId(rs.getInt("id"));
					Pais.setNome(rs.getString("nome"));
					Pais.setPopulacao(rs.getLong("populacao"));
					Pais.setArea(rs.getDouble("area"));
					lista.add(Pais);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e1) {
			System.out.print(e1.getStackTrace());
		}
		return lista;
	}
	
	public ArrayList<Pais> listarPais(String chave) {
		Pais Pais;
		ArrayList<Pais> lista = new ArrayList<>();
		String sqlSelect = "SELECT id, nome, populacao, area FROM pais";
		// usando o try with resources do Java 7, que fecha o que abriu
		try (Connection conn = ConnectionFactory.obterConexao();
				PreparedStatement stm = conn.prepareStatement(sqlSelect);) {
			stm.setString(1, "%" + chave.toUpperCase() + "%");
			try (ResultSet rs = stm.executeQuery();) {
				while (rs.next()) {
					Pais = new Pais();
					Pais.setId(rs.getInt("id"));
					Pais.setNome(rs.getString("nome"));
					Pais.setPopulacao(rs.getLong("populacao"));
					Pais.setArea(rs.getDouble("area"));
					lista.add(Pais);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e1) {
			System.out.print(e1.getStackTrace());
		}
		return lista;
	}
}
