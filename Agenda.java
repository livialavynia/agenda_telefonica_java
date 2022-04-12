/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/

package agenda_telefonica;
import java.util.ArrayList;
public class Agenda extends Pessoas {
   //criando o array que guardará os contatos a serem inseridos
   public ArrayList<Pessoas>lista_agenda = new ArrayList<>();
   
   public void setinserirPessoa(Pessoas p){
       lista_agenda.add(p);
   }
   
   public void removerPessoa(Pessoas p){
       lista_agenda.remove(p);
       System.out.println(p + " foi removido com sucesso! \n");
   }
   
   public String getimprimirAgenda(){
       for(int i=0;i<lista_agenda.size();i++){
           lista_agenda.get(i).getMostrarPessoa();
       }    
       return null;
   }
}
