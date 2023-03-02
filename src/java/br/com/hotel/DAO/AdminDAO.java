/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.hotel.DAO;

import br.com.hotel.DTO.AdminDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author 51127512021.2
 */
public class AdminDAO {
    Connection conn;
    PreparedStatement pstm;
    
    public void CadastrarAdmin (AdminDTO adminDTO) throws ClassNotFoundException, SQLException{
        String sql = "INSERT INTO admin (admin_nome, admin_senha, admin_email) VALUES (?, ?, ?)";
        conn = new ConexaoDAO().conexaoDB();
        
        try{
            pstm = conn.prepareStatement(sql);
            pstm.setString (2, adminDTO.getAdmin_nome());
            pstm.setString(3, adminDTO.getAdmin_senha());
            pstm.setString(4, adminDTO.getAdmin_email());
            pstm.execute();
            pstm.close();
        
        }catch(SQLException e){
            
        }
    }
    
//    public void AlterarAdmin(AdminDTO clienteDTO) throws ClassNotFoundException{;
//        String sql = "UPDATE cliente SET , , ,";
//        conn = new ConexaoDAO().conexaoBD();
//            
//        try{
//            pstm = conn.prepareStatement(sql);
//            //pstm.setInt(1, clienteDTO.getClienteId());
//                
//            pstm.execute();
//            pstm.close();
//            
//        }catch(SQLException e){
//            System.out.println("Sem alterações");
//        }
//    }
        
    public void ExcluirAdmin(AdminDTO adminDTO) throws ClassNotFoundException{
        String sql = "DELETE FROM cliente WHERE id = ?";
        conn = new ConexaoDAO().conexaoDB();
            
        try{
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, adminDTO.getAdmin_id());
            pstm.setString (2, adminDTO.getAdmin_nome());
            pstm.setString(3, adminDTO.getAdmin_senha());
            pstm.setString(4, adminDTO.getAdmin_email());
            pstm.execute();
            pstm.close();
            
        }catch(SQLException e){
                
        }
    }
}
