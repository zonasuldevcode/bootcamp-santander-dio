package candidatura;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ProcessoSeletivo{

    public double salarioBase=2000.0;
    

    public void verificaPretensao(double salarioPretendido){

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

        try{

        ProcessoSeletivo ps= new ProcessoSeletivo();
        Scanner scanner =new Scanner(System.in);

        System.out.println("");
        System.out.println("Seja Bem-Vindo ao Sistema de Recrutamento e Seleção:");

        System.out.println("informe a pretensão salarial:");

             ps.verificaPretensao(scanner.nextDouble());  
             
             scanner.close();

    }
    

    catch(InputMismatchException e){

            System.err.println("O valor do salário deve conter números do tipo double");

        }
}
}