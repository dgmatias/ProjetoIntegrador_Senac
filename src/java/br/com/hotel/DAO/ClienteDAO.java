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
        String sql = "INSERT INTO cliente () VALUES ()";
        conn = new ConexaoDAO().conexaoBD();
        
        try{
            pstm = conn.prepareStatement(sql);
            //pstm.setString (2, clienteDTO.getClienteNome());
            pstm.execute();
            pstm.close();
        
        }catch(SQLException e){
            
        }
    }
    
    public ArrayList<ClienteDTO> PesquisarCliente() throws ClassNotFoundException, SQLException{
        String sql = "SELECT * FROM cliente";
        conn = new ConexaoDAO().conexaoBD();
        
        try{
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery(sql);
                
            for (int i = 0; rs.next(); i++){
                ClienteDTO clienteDTO = new ClienteDTO();
                //clienteDTO.setClienteId(rs.getInt("cliente_id"));
                    
                lista.add(clienteDTO);
            }
                
            while (rs.next()){
                ClienteDTO clienteDTO = new ClienteDTO();
                //clienteDTO.setClienteId(rs.getInt("cliente_id"));
                    
                lista.add(clienteDTO);
            }
            pstm.close();
            
        }catch(SQLException e){
                
        }
        return lista;
    }
    public void AlterarCliente(ClienteDTO clienteDTO) throws ClassNotFoundException{
        String sql = "UPDATE cliente SET , , ,";
        conn = new ConexaoDAO().conexaoBD();
            
        try{
            pstm = conn.prepareStatement(sql);
            //pstm.setInt(1, clienteDTO.getClienteId());
                
            pstm.execute();
            pstm.close();
            
        }catch(SQLException e){
            System.out.println("Sem alterações");
        }
    }
        
    public void ExcluirCliente(ClienteDTO clienteDTO) throws ClassNotFoundException{
        String sql = "DELETE FROM cliente WHERE id = ?";
        conn = new ConexaoDAO().conexaoBD();
            
        try{
            pstm = conn.prepareStatement(sql);
            //pstm.setInt(1, clienteDTO.getClienteId());
            pstm.execute();
            pstm.close();
            
        }catch(SQLException e){
                
        }
    }
}
