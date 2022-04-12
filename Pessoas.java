/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agenda_telefonica;

public class Pessoas {
    //A seguir, os métodos get e set da classse Pessoas
    
    String nome;
    int telefone;
    String email;
    int matricula;
    
    
    public void setNome(String nome){
      this.nome = nome;  
    }
    
    public String getNome(){
        return this.nome;
    }
    
    
    public void setTelefone(int telefone){
        this.telefone = telefone;
    }
    
    public int getTelefone(){
        return this.telefone;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    
    public int getMatricula(){
        return this.matricula;
    }
    
    public void getMostrarPessoa(){
        System.out.println(this.nome+ "\n" + this.telefone +"\n" + this.email + "\n" + this.matricula+ "\n");
    }
    
    //Aqui, a senha se trata da própria matrícula, e a verificação se da na comparação, se a matricula(senha) digitada é a mesma que this.matricula
    public boolean verificar_matricula(int senha){
       if (this.matricula == senha){
           return true;
       }
       else {
           return false;
       }
    } 
}
