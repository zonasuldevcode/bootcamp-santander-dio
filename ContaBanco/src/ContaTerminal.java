import java.util.InputMismatchException;
import java.util.Scanner;
/**
* <h1>ContaTerminal</h1>
* Esa classe tem como objetivo simular uma conta bancária, onde os dados são solicitados
 ao usuário via terminal
* <p>
* <b>Note:</b> Leia atentamente a documentação desta classes
* para desfrutar dos recursos oferecidos pelo autor
*
* @author  Leonardo Salvador
* @version 1.0
* @since   25/05/2024
*/
public class ContaTerminal {

    public int numero;
    public String agencia;
    public String nomeCliente;
    public double saldo;

    public static void main(String[] args) throws Exception {
        try{
        ContaTerminal ct = new ContaTerminal();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o número da Conta:");
        ct.numero = scanner.nextInt();

        System.out.println("Informe o número da Agência:");
        ct.agencia = scanner.next();

        System.out.println("Informe o nome do cliente:");
        ct.nomeCliente = scanner.next();

        System.out.println("Informe o Saldo:");
        ct.saldo = scanner.nextDouble();
        System.out.println("Olá:" + ct.nomeCliente + "," +
                "obrigado por criar uma conta em nosso banco, sua agência é:" + ct.agencia + "\n"
                + "Conta:" + ct.numero +
                " e seu saldo:" + " "
                + ct.saldo + " " +
                "Já está Disponível para saque");
                scanner.close();

        }

        catch(InputMismatchException e){

            System.err.println("O numero da conta deve ser composto de valores inteiros");

        }

        

        

    }

}