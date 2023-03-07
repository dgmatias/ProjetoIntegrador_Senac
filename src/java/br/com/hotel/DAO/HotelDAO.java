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
        
        String sql = "Select * from hotel where hotel_nome = ? OR hotel_cnpj = ?";        
                
        try{
            conn = new ConexaoDAO().conexaoDB();
            
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, hotelDTO.getHotel_nome() );
            pstm.setString(2, hotelDTO.getHotel_cnpj() );
            pstm.setString(3, hotelDTO.getHotel_descricao());
            pstm.setString(4, hotelDTO.getHotel_cnpj());
            pstm.setString(5, hotelDTO.getHotel_comodos());
            pstm.setString(6, hotelDTO.getHotel_camas());
            pstm.setString(7, hotelDTO.getHotel_checkin());
            pstm.setString(8, hotelDTO.getHotel_checkout());
            rs = pstm.executeQuery();
            
            if(!rs.next() ) {
                
                String sql2 = "INSERT INTO hotel (hotel_nome, hotel_cnpj) VALUES (?, ?)";
                
                pstm = conn.prepareStatement(sql2);
                pstm.setString (1, hotelDTO.getHotel_nome());
                pstm.setString (2, hotelDTO.getHotel_cnpj());
                pstm.setString(3, hotelDTO.getHotel_descricao());
                pstm.setString(4, hotelDTO.getHotel_cnpj());
                pstm.setString(5, hotelDTO.getHotel_comodos());
                pstm.setString(6, hotelDTO.getHotel_camas());
                pstm.setString(7, hotelDTO.getHotel_checkin());
                pstm.setString(8, hotelDTO.getHotel_checkout());
                pstm.execute();
                pstm.close();
            }
            
            
        
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
                hotelDTO.setHotel_cnpj(rs.getString("hotel_cpnj"));
                hotelDTO.setHotel_reserva(rs.getString("hotel_descricao"));
                hotelDTO.setHotel_reserva(rs.getString("hotel_camas"));
                hotelDTO.setHotel_reserva(rs.getString("hotel_checkin"));
                hotelDTO.setHotel_reserva(rs.getString("hotel_checkout"));
                
                    
                lista.add(hotelDTO);
            }
                
            while (rs.next()){
                HotelDTO hotelDTO = new HotelDTO();
                hotelDTO.setHotel_id(rs.getInt("hotel_id"));
                hotelDTO.setHotel_nome(rs.getString("hotel_nome"));
                hotelDTO.setHotel_local(rs.getString("hotel_local"));
                hotelDTO.setHotel_descricao(rs.getString("hotel_descricao"));
                hotelDTO.setHotel_cnpj(rs.getString("hotel_cpnj"));
                hotelDTO.setHotel_reserva(rs.getString("hotel_descricao"));
                hotelDTO.setHotel_reserva(rs.getString("hotel_camas"));
                hotelDTO.setHotel_reserva(rs.getString("hotel_checkin"));
                hotelDTO.setHotel_reserva(rs.getString("hotel_checkout"));
                    
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
            pstm.setString (1, hotelDTO.getHotel_nome());
            pstm.setString(2, hotelDTO.getHotel_local());
            pstm.setString(3, hotelDTO.getHotel_descricao());
            pstm.setString(4, hotelDTO.getHotel_cnpj());
            pstm.setString(5, hotelDTO.getHotel_comodos());
            pstm.setString(6, hotelDTO.getHotel_camas());
            pstm.setString(7, hotelDTO.getHotel_checkin());
            pstm.setString(8, hotelDTO.getHotel_checkout());
            
            pstm.execute();
            pstm.close();
            
        }catch(SQLException e){
                
        }
    }
}
