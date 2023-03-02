package br.com.hotel.DTO;

/**
 *
 * @author Thiago-_-#
 */
public class AdminDTO {
    
    private int admin_id;
    private String admin_nome;
    private String admin_email;
    private String admin_senha;
    
    public int getAdmin_id(){
        return admin_id;
    }
    
    public void setAdmin_id(int admin_id){
        this.admin_id = admin_id;
    }
    
    public String getAdmin_nome(){
        return admin_nome;
    }
    
    public void setAdmin_nome(String admin_nome){
        this.admin_nome = admin_nome;
    }
    
    public String getAdmin_email(){
        return admin_email;
    }
    
    public void setAdmin_email(String admin_email){
        this.admin_email = admin_email;
    }
    
    public String getAdmin_senha(){
        return admin_senha;
    }
    
    public void setAdmin_senha(String admin_senha){
        this.admin_senha = admin_senha;
    }
    
}
