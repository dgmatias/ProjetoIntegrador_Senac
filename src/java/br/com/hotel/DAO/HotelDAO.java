/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.hotel.DAO;

import br.com.hotel.DTO.HotelDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author 51127512021.2
 */
public class HotelDAO {
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<HotelDTO> lista = new ArrayList<>();
    
    public void CadastrarHotel (HotelDTO hotelDTO) throws ClassNotFoundException, SQLException{
        String sql = "INSERT INTO hotel (hotel_nome, hotel_local, hotel_descricao, hotel_cpnj, hotel_reserva) VALUES (?, ?, ?, ?, ?)";
        conn = new ConexaoDAO().conexaoDB();
        
        try{
            pstm = conn.prepareStatement(sql);
            pstm.setString (2, hotelDTO.getHotel_nome());
            pstm.setString(3, hotelDTO.getHotel_local());
            pstm.setString(4, hotelDTO.getHotel_descricao());
            pstm.setString(5, hotelDTO.getHotel_cpnj());
            pstm.setString(6, hotelDTO.getHotel_reserva());
            pstm.execute();
            pstm.close();
        
        }catch(SQLException e){
            
        }
    }
    
    public ArrayList<HotelDTO> PesquisarHotel() throws ClassNotFoundException, SQLException{
        String sql = "SELECT * FROM hotel";
        conn = new ConexaoDAO().conexaoDB();
        
        try{
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery(sql);
                
            for (int i = 0; rs.next(); i++){
                HotelDTO hotelDTO = new HotelDTO();
                hotelDTO.setHotel_id(rs.getInt("hotel_id"));
                hotelDTO.setHotel_nome(rs.getString("hotel_nome"));
                hotelDTO.setHotel_local(rs.getString("hotel_local"));
                hotelDTO.setHotel_descricao(rs.getString("hotel_descricao"));
                hotelDTO.setHotel_cpnj(rs.getString("hotel_cpnj"));
                hotelDTO.setHotel_reserva(rs.getString("hotel_reserva"));
                
                    
                lista.add(hotelDTO);
            }
                
            while (rs.next()){
                HotelDTO hotelDTO = new HotelDTO();
                hotelDTO.setHotel_id(rs.getInt("hotel_id"));
                hotelDTO.setHotel_nome(rs.getString("hotel_nome"));
                hotelDTO.setHotel_local(rs.getString("hotel_local"));
                hotelDTO.setHotel_descricao(rs.getString("hotel_descricao"));
                hotelDTO.setHotel_cpnj(rs.getString("hotel_cpnj"));
                hotelDTO.setHotel_reserva(rs.getString("hotel_reserva"));
                    
                lista.add(hotelDTO);
            }
            pstm.close();
            
        }catch(SQLException e){
                
        }
        return lista;
    }
    public void AlterarHotel(HotelDTO hotelDTO) throws ClassNotFoundException{
        String sql = "UPDATE hotel SET , , ,";
        conn = new ConexaoDAO().conexaoDB();
            
        try{
            pstm = conn.prepareStatement(sql);
            //pstm.setInt(1, clienteDTO.getClienteId());
                
            pstm.execute();
            pstm.close();
            
        }catch(SQLException e){
            System.out.println("Sem alterações");
        }
    }
        
    public void ExcluirHotel(HotelDTO hotelDTO) throws ClassNotFoundException{
        String sql = "DELETE FROM hotel WHERE id = ?";
        conn = new ConexaoDAO().conexaoDB();
            
        try{
            pstm = conn.prepareStatement(sql);
            pstm.setString (2, hotelDTO.getHotel_nome());
            pstm.setString(3, hotelDTO.getHotel_local());
            pstm.setString(4, hotelDTO.getHotel_descricao());
            pstm.setString(5, hotelDTO.getHotel_cpnj());
            pstm.setString(6, hotelDTO.getHotel_reserva());
            
            pstm.execute();
            pstm.close();
            
        }catch(SQLException e){
                
        }
    }
}
