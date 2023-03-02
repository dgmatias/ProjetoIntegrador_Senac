package br.com.hotel.DTO;

/**
 *
 * @author Thiago
 */
public class HotelDTO {
    private int hotel_id;
    private String hotel_nome;
    private String hotel_local;
    private String hotel_descricao;
    private String hotel_cpnj;
    private String hotel_reserva;
    
    
    public int getHotel_id(){
        return hotel_id;
    }
    
    public void setHotel_id(int hotel_id){
        this.hotel_id = hotel_id;
    }
    
    public String getHotel_nome(){
        return hotel_nome;
    }
    
    public void setHotel_nome(String hotel_nome){
        this.hotel_nome = hotel_nome;
    }
    
    public String getHotel_local(){
        return hotel_local;
    }
    
    public void setHotel_local(String hotel_local){
        this.hotel_local = hotel_local;
    }
    
    public String getHotel_descricao(){
        return hotel_descricao;
    }
    
    public void setHotel_descricao(String hotel_descricao){
        this.hotel_descricao = hotel_descricao;
    }
    
    public String getHotel_cpnj(){
        return hotel_cpnj;
    }
    
    public void setHotel_cpnj(String hotel_cpnj){
        this.hotel_cpnj = hotel_cpnj;
    }
    
    public String getHotel_reserva(){
        return hotel_reserva;
    }
    
    public void setHotel_reserva(String hotel_reserva){
        this.hotel_reserva = hotel_reserva;
    }
    
}
