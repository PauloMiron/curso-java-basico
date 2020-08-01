import java.awt.*;
import java.util.Scanner;

public class IntervaloInteiros {

    public void Intervalo() {
        Scanner leitor = new Scanner(System.in);
        Integer var1;
        Integer var2;
        Menu.escrever("Informe dois numeros inteiros: ");
        var1 = leitor.nextInt();
        var2 = leitor.nextInt();

        Menu.pular();

        if (var1 < var2){
            var1 = var1 +1;
            for (int x = var1; var1 < var2; var1++) {
                Menu.escrever(var1);
            }
        } else if (var2 < var1) {
            var2 = var2 + 1;
            for (int x = var2 + 1; var2 < var1; var2++) {
                Menu.escrever(var2);
            }
        }
        else {
            Menu.escrever("os numeros sao iguias");
            }

        }

       /* Essa forma seria melhor ?

       if (var1 < var2){
            Integer x = var1;
            while (var1 != var2){
                var1 = x;
                Menu.escrever(var1);
                x = x + 1;
            }
        } else if (var2 < var1){
            Integer x = var1;
            while (var1 != var2){
                var1 = x;
                Menu.escrever(var1);
                x = x - 1;
            }
        } else {
            Menu.escrever("Os numeros são iguais");
        }
*/


    }
