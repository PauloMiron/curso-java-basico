import java.util.Scanner;

public class Fatorial {

    public void fat() {

        Scanner leitorFat = new Scanner(System.in);



        Double numero;
        Menu.escrever("Informe o numero que você deseja fazer o fatoramento: ");
        numero = leitorFat.nextDouble();
        String resultado = numero +" != ";

        Double teste = numero;

        for (double i = numero; i - 1 > 0 ; i--){
            teste =  teste * (i- 1);
        }

        for (double i = numero; i > 0; i--){
            resultado = resultado + i + " * ";
        }
        resultado = resultado.substring(0,resultado.length()-3);

        Menu.escrever(resultado + " = "  + teste);


    }
}
