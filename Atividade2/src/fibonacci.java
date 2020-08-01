import java.util.Scanner;

public class fibonacci {

    public void fibo(){
        Scanner ler = new Scanner(System.in);
        Integer N;
        Integer numB = 0;
        Integer numA = 1;
        Integer num;
        Integer controle = 0;
        Menu.escrever("Digite o numero que voce deseja ver a sequencia fibonacci: ");
        N = ler.nextInt();

        while(controle < N && numA <= N){
            Menu.escrever(numA);
            num = numA + numB;
            numB = numA;
            numA = num;
            controle++;

        }
    }

        }



