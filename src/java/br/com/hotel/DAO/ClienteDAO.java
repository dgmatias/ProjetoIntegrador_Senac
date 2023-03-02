/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.hotel.DAO;

import br.com.hotel.DTO.ClienteDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author 51127512021.2
 */
public class ClienteDAO {
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<ClienteDTO> lista = new ArrayList<>();
    
    public void CadastrarCliente (ClienteDTO clienteDTO) throws ClassNotFoundException{
        String sql = "INSERT INTO cliente (cliente_nome, cliente_email, cliente_senha, cliente_cpf, cliente_reserva) VALUES (?, ?, ?, ?, ?)";
        conn = new ConexaoDAO().conexaoDB();
        
        try{
            pstm = conn.prepareStatement(sql);
            pstm.setString (2, clienteDTO.getCliente_nome());
            pstm.setString(3, clienteDTO.getCliente_email());
            pstm.setString(4, clienteDTO.getCliente_senha());
            pstm.setString(5, clienteDTO.getCliente_cpf());
            pstm.setString(6, clienteDTO.getCliente_reserva());
            pstm.execute();
            pstm.close();
        
        }catch(SQLException e){
            
        }
    }
    
    public ArrayList<ClienteDTO> PesquisarCliente() throws ClassNotFoundException, SQLException{
        String sql = "SELECT * FROM cliente";
        conn = new ConexaoDAO().conexaoDB();
        
        try{
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery(sql);
                
            for (int i = 0; rs.next(); i++){
                ClienteDTO clienteDTO = new ClienteDTO();
                clienteDTO.setCliente_id(rs.getInt("cliente_id"));
                clienteDTO.setCliente_nome(rs.getString("cliente_nome"));
                clienteDTO.setCliente_email(rs.getString("cliente_email"));
                clienteDTO.setCliente_senha(rs.getString("cliente_senha"));
                clienteDTO.setCliente_cpf(rs.getString("cliente_cpf"));
                clienteDTO.setCliente_reserva(rs.getString("cliente_reserva"));
                    
                lista.add(clienteDTO);
            }
                
            while (rs.next()){
                ClienteDTO clienteDTO = new ClienteDTO();
                clienteDTO.setCliente_id(rs.getInt("cliente_id"));
                clienteDTO.setCliente_nome(rs.getString("cliente_nome"));
                clienteDTO.setCliente_email(rs.getString("cliente_email"));
                clienteDTO.setCliente_senha(rs.getString("cliente_senha"));
                clienteDTO.setCliente_cpf(rs.getString("cliente_cpf"));
                clienteDTO.setCliente_reserva(rs.getString("cliente_reserva"));
                    
                lista.add(clienteDTO);
            }
            pstm.close();
            
        }catch(SQLException e){
                
        }
        return lista;
    }
    public void AlterarCliente(ClienteDTO clienteDTO) throws ClassNotFoundException{
        String sql = "UPDATE cliente SET cliente_nome = ?, cliente_email = ?, cliente_senha = ?, cliente_cpf = ?, cliente_reserva = ? WHERE cliente_id = ?";
        conn = new ConexaoDAO().conexaoDB();
            
        try{
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, clienteDTO.getCliente_id());
            pstm.setString (2, clienteDTO.getCliente_nome());
            pstm.setString(3, clienteDTO.getCliente_email());
            pstm.setString(4, clienteDTO.getCliente_senha());
            pstm.setString(5, clienteDTO.getCliente_cpf());
            pstm.setString(6, clienteDTO.getCliente_reserva());
                
            pstm.execute();
            pstm.close();
            
        }catch(SQLException e){
            System.out.println("Sem alterações");
        }
    }
        
    public void ExcluirCliente(ClienteDTO clienteDTO) throws ClassNotFoundException{
        String sql = "DELETE FROM cliente WHERE id = ?";
        conn = new ConexaoDAO().conexaoDB();
            
        try{
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, clienteDTO.getCliente_id());
            pstm.setString (2, clienteDTO.getCliente_nome());
            pstm.setString(3, clienteDTO.getCliente_email());
            pstm.setString(4, clienteDTO.getCliente_senha());
            pstm.setString(5, clienteDTO.getCliente_cpf());
            pstm.setString(6, clienteDTO.getCliente_reserva());
            pstm.execute();
            pstm.close();
            
        }catch(SQLException e){
                
        }
    }
}
