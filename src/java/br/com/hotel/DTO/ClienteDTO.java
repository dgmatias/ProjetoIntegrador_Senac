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
    
    public int getClienteId(){
        return cliente_id;
    }
    
    public void setClienteId(int cliente_id){
        this.cliente_id = cliente_id;
    }
    
    public String getClienteNome(){
        return cliente_nome;
    }
    
    public void setClienteNome(String cliente_nome){
        this.cliente_nome = cliente_nome;
    }
    
    public String getClienteEmail(){
        return cliente_email;
    }
    
    public void setClienteEmail(String cliente_email){
        this.cliente_email = cliente_email;
    }
    
    public String getClienteSenha(){
        return cliente_senha;
    }
    
    public void setClienteSenha(String cliente_senha){
        this.cliente_senha = cliente_senha;
    }
    
    public String getClienteCpf(){
        return cliente_cpf;
    }
    public void setClienteCpf(String cliente_cpf){
        this.cliente_cpf = cliente_cpf;
    }
    
}
