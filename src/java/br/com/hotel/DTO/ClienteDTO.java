package br.com.hotel.DTO;

/**
 *
 * @author Thiago-_-#
 */
public class ClienteDTO {
    
    private int cliente_id;
    private String cliente_nome;
    private String cliente_email;
    private String cliente_senha;
    private String cliente_cpf;
    
    public int getCliente_id(){
        return cliente_id;
    }
    
    public void setCliente_id(int cliente_id){
        this.cliente_id = cliente_id;
    }
    
    public String getCliente_nome(){
        return cliente_nome;
    }
    
    public void setCliente_nome(String cliente_nome){
        this.cliente_nome = cliente_nome;
    }
    
    public String getCliente_email(){
        return cliente_email;
    }
    
    public void setCliente_email(String cliente_email){
        this.cliente_email = cliente_email;
    }
    
    public String getCliente_senha(){
        return cliente_senha;
    }
    
    public void setCliente_senha(String cliente_senha){
        this.cliente_senha = cliente_senha;
    }
    
    public String getCliente_cpf(){
        return cliente_cpf;
    }
    public void setCliente_cpf(String cliente_cpf){
        this.cliente_cpf = cliente_cpf;
    }
    
}
