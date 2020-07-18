import java.util.Scanner;

public class Comparartres {

    public void comparar3(){

        Scanner Leitor = new Scanner(System.in);

        Integer var1;
        Integer var2;
        Integer var3;


        System.out.println("Informe 3 Numeros Inteiros");
        var1 = Leitor.nextInt();
        var2 = Leitor.nextInt();
        var3 = Leitor.nextInt();

        if (var1 == var2 && var1 == var3) {
            System.out.println("Os 3 numeros são iguais");

        } else if (var1 == var2 || var1 == var3 || var2 == var3) {
            System.out.println("Existem 2 numeros iguais");
        }

        if (var1 > var2 && var1 > var3) {
            System.out.println(var1 + " é o maior numero");
        } else if (var2 > var3) {
            System.out.println(var2 + " é o maior numero");
        } else {
            System.out.println(var3 + " é o maior numero");
        }

        if (var1 < var2 && var1 < var3) {
            System.out.println(var1 + " é o menornumero");
        } else if (var2 < var3) {
            System.out.println(var2 + " é o menor numero");
        } else {
            System.out.println(var3 + " é o menor numero");
        }
    }
}



