package br.com.hotel.DTO;

/**
 *
 * @author Thiago
 */
public class HotelDTO {
    private int hotel_id;
    private String hotel_nome;
    private String hotel_local;
    private String hotel_cnpj;    
    
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
    
    public String getHotel_cnpj(){
        return hotel_cnpj;
    }
    
    public void setHotel_cnpj(String hotel_cnpj){
        this.hotel_cnpj = hotel_cnpj;
    }
    
}
