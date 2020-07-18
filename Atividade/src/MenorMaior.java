import java.util.Scanner;

public class MenorMaior {

    public void menorMaior(){
        Menu menu = new Menu();
        Integer num1 = 0;
        Integer num2 = 0;
        Scanner menormaior = new Scanner(System.in);

        Menu.escrever("Informe um numero inteiro: ");
        num1 = menormaior.nextInt();
        Menu.escrever("Informe o Segundo numero Inteiro:" );
        num2 = menormaior.nextInt();

        if (num1 > num2) {
            menu.escrever(num1 +" é o maior");
        } else if (num2 > num1) {
            menu.escrever(num2 +" é o maior");
        } else {
            menu.escrever("Os numeros são iguais");
        }
    }
}

