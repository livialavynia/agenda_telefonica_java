/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agenda_telefonica;

public class Main {
    public static void main(String[] args){
        
        Pessoas p1 = new Pessoas();
        Agenda agenda = new Agenda();
        
        p1.setNome("Lívia");
        p1.setTelefone(996922504);
        p1.setEmail("livia.cavalcante@arapiraca.ufal.br");
        p1.setMatricula(20111541);
        
        agenda.setinserirPessoa(p1);
        
        Pessoas p2 = new Pessoas();
        
        p2.setNome("Lucas");
        p2.setTelefone(95641253);
        p2.setEmail("lucas@gmail.com");
        p2.setMatricula(21445873);
        
        agenda.setinserirPessoa(p2);
        
        Pessoas p3 = new Pessoas();
        p3.setNome("Laura");
        p3.setTelefone(95521468);
        p3.setEmail("laura@gmail.com");
        p3.setMatricula(2147453);
        
        System.out.println("AGENDA:");
        agenda.getimprimirAgenda();
        
        System.out.println("REMOVENDO UM CONTATO:");
        agenda.removerPessoa(p3);
        
        System.out.println("AGENDA DEPOIS DE EXCLUIR CONTATO:");
        agenda.getimprimirAgenda();
        
        
        
        
        
        
        
    }
}
