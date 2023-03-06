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
    private String hotel_cnpj;
    private String hotel_reserva;
    
    
    public int getHotelDd(){
        return hotel_id;
    }
    
    public void setHotelId(int hotel_id){
        this.hotel_id = hotel_id;
    }
    
    public String getHotelNome(){
        return hotel_nome;
    }
    
    public void setHotelNome(String hotel_nome){
        this.hotel_nome = hotel_nome;
    }
    
    public String getHotelLocal(){
        return hotel_local;
    }
    
    public void setHotelLocal(String hotel_local){
        this.hotel_local = hotel_local;
    }
    
    public String getHotelDescricao(){
        return hotel_descricao;
    }
    
    public void setHotelDescricao(String hotel_descricao){
        this.hotel_descricao = hotel_descricao;
    }
    
    public String getHotelCnpj(){
        return hotel_cnpj;
    }
    
    public void setHotelCnpj(String hotel_cnpj){
        this.hotel_cnpj = hotel_cnpj;
    }
    
    public String getHotelReserva(){
        return hotel_reserva;
    }
    
    public void setHotelReserva(String hotel_reserva){
        this.hotel_reserva = hotel_reserva;
    }
    
}
