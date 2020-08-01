import java.util.Scanner;

public class Intervalo {

    public void Inter() {
        Scanner leitor = new Scanner(System.in);
        Integer var1;
        Integer var2;
        Menu.escrever("Informe dois numeros inteiros: ");
        var1 = leitor.nextInt();
        var2 = leitor.nextInt();

        Menu.pular();

        if (var1 < var2){
            var1 = var1 +1;
            Integer total = 0;
            for (int x = var1; var1 < var2; var1++) {
                Menu.escrever(var1);
                total = total + var1;
            }
            Menu.pular();
            Menu.escrever("A soma total é : " + total);

        } else if (var2 < var1) {
            var2 = var2 + 1;
            Integer tot = 0;
            for (int x = var2; var2 < var1; var2++) {
                Menu.escrever(var2);
                tot = tot + var2;
            }
            Menu.pular();
            Menu.escrever("A soma total é " + tot);
        }
        else {
            Menu.escrever("os numeros sao iguias");
        }
    }
}

