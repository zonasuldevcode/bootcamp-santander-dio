package candidatura;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo{

    public void verificaPretensao(double salarioPretendido){
           
            double salarioBase=2000.0;

        if (salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato");
        }

        else if( salarioBase == salarioPretendido){

            System.out.println("Ligar para o candidato com contra proposta");
        }

        else{
            System.out.println("Aguardando resultado demais candidatos");
        }
    }
    
    public static void main(String[] args) {

        selecaoCandidatos();
        imprimirSelecionados();
    }

    static void imprimirSelecionados(){

        String [] candidatos = {"Joao","Marcia","Felipe","Bruna","Catia"};
             System.out.println("imprimindo lista de candidatos informando o indice do elemento");
               
             for(int indice=0; indice < candidatos.length; indice ++){
                 
                 System.out.println(" O candidato de nº" + (indice +1) + " é o " +  candidatos[indice]);
             }

             System.out.println("Forma abreviada de interação for each");

                for(String candidato: candidatos){

                    System.out.println(" O candidato selecionado foi: " + candidato);
                }
    }

        static void selecaoCandidatos(){
            
     String [] candidatos = {"Joao", "Marcia","Felipe", "Bruna","Catia","Gustavo","Rodrigo","Flavia","Ana","Monica"};
            int candidatosSelecionados =0;
            int candidatoAtual=0;
            double salarioBase=2000.0;

            while(candidatosSelecionados < 5  && candidatoAtual < candidatos.length){

                String candidato = candidatos[candidatoAtual];
                double salarioPretendido = valorPretendido();
                System.out.println("O Candidato: " +  candidato  + " Solicitou este valor de salário " + salarioPretendido);

                   if( salarioBase >= salarioPretendido){

                    System.out.println(" O candidato: " + candidato + " foi selecionado para a vaga: ");
                    candidatosSelecionados++;
                   }
                   candidatoAtual++;
               
            }

            
        
    
}
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
     }
    }
    

        //try{
        //ProcessoSeletivo ps= new ProcessoSeletivo();
        //Scanner scanner =new Scanner(System.in);

       // System.out.println("");
       // System.out.println("Seja Bem-Vindo ao Sistema de Recrutamento e Seleção:");
       // System.out.println("informe a pretensão salarial:");
           //  ps.verificaPretensao(scanner.nextDouble());  
            // scanner.close();
          
    //}
    ////catch(InputMismatchException e){

            //System.err.println("O Informe o valor correto");
       //}
