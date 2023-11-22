package DAO;

import ecoleta.Main;
import entity.CollectPoint;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import utils.Conexao;

/* private final Double latitude;
    private final Double longitute;
    private final String nome;
    private final String email;
    private final String cidade;
    private final String tipoResiduo;
    private int id;*/
public class pontoColetaDAO {

    public static void pontoColetaDAO(CollectPoint coleta) {
        String sql = "INSERT INTO ecoleta (nome, email, cidade, tipoResiduo, latitude, longitude) VALUES (?,?,?,?,?,?)";
        try (PreparedStatement stm = Conexao.getConexao().prepareStatement(sql)) {

            stm.setString(1, coleta.getNome());
            stm.setString(2, coleta.getEmail());
            stm.setString(3, coleta.getCidade());
            stm.setObject(4, coleta.getTipoResiduo());
            stm.setDouble(5, coleta.getLatitude());
            stm.setDouble(6, coleta.getLongitute());

            stm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Inserido no banco");
        } catch (SQLException e) {
            System.out.println(e);

            JOptionPane.showMessageDialog(null, "Problema no insert " + e);
        }

    }

    public static String buscarNome(String nome) {

        String sql = "SELECT * FROM ecoleta WHERE nome = ?";
        try (PreparedStatement stm = Conexao.getConexao().prepareStatement(sql)) {
            stm.setString(1, nome);

            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                nome = rs.getString("nome");

                return Main.nomeGlobal = nome;

            }

        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }

        return null;

    }

    public static ArrayList<CollectPoint> buscarPontos(String cidade) {

        String sql = "SELECT * FROM ecoleta WHERE cidade = ?";
        ArrayList<CollectPoint> pontos = new ArrayList<>();

        try (PreparedStatement stm = Conexao.getConexao().prepareStatement(sql)) {
           
            stm.setString(1, cidade);
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                String nome = rs.getString("nome");
                
                Double lat = rs.getDouble("latitude");
                Double longi = rs.getDouble("longitude");
                String city = rs.getString("cidade");
                pontos.add(new CollectPoint(cidade, lat, longi));

            }

            return pontos;
        } catch (Exception e) {
            System.out.println(e);
        }
        return pontos;

    }

}
