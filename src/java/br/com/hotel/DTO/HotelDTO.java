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
    private String hotel_comodos;
    private String hotel_camas;
    private String hotel_checkin;
    private String hotel_checkout;
    
    
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
    
    public String getHotel_cnpj(){
        return hotel_cnpj;
    }
    
    public void setHotel_cnpj(String hotel_cnpj){
        this.hotel_cnpj = hotel_cnpj;
    }
    
    public String getHotel_reserva(){
        return hotel_reserva;
    }
    
    public void setHotel_reserva(String hotel_reserva){
        this.hotel_reserva = hotel_reserva;
    }
    
    public String getHotel_comodos(){
        return hotel_comodos;
    }
    
    public void setHotel_comodos(String hotel_comodos){
        this.hotel_comodos = hotel_comodos;
    }
    
    public String getHotel_camas(){
        return hotel_camas;
    }
    
    public void setHotel_camas(String hotel_camas){
        this.hotel_camas = hotel_camas;
    }
    
    public String getHotel_checkin(){
        return hotel_checkin;
    }
    
    public void setHotel_checkin(String hotel_checkin){
        this.hotel_checkin = hotel_checkin;
    }
    
    public String getHotel_checkout(){
        return hotel_checkout;
    }
    
    public void setHotel_checkout(String hotel_checkout){
        this.hotel_checkout = hotel_checkout;
    }
    
}
