import java.util.ArrayList;
import java.util.Scanner;

public class ordenar {
    public void ordem(){

        Scanner leitorDeVariaveis = new Scanner(System.in);

        System.out.println("Quantos números você deseja informar: ");
        Integer quantidadeNumeros = leitorDeVariaveis.nextInt();

        ArrayList<Integer> listaDeNumeros = new ArrayList<>();
        ArrayList<Integer> listabnumeros = new ArrayList<>();
        for (int i = 0; i < quantidadeNumeros; i++) {
            leitorDeVariaveis = new Scanner(System.in);
            System.out.print("Digite um número: ");
            Integer numeroInformado = leitorDeVariaveis.nextInt();
            listaDeNumeros.add(numeroInformado);
        }

        ArrayList<Integer> listac = new ArrayList<>();

        for (int i = 0; i < quantidadeNumeros; i++) {
            Integer pos = 0;
            Integer menorNum = null;

            for (int j = quantidadeNumeros - 1; j >= 0; j--) {
                if (!listac.contains(j)) {

                    if (menorNum == null) {
                        menorNum = listaDeNumeros.get(j);
                        pos = j;
                    }
                    if (listaDeNumeros.get(j) < menorNum) {
                        menorNum = listaDeNumeros.get(j);
                        pos = j;
                    }
                }
            }
            listabnumeros.add(i, menorNum);
            listac.add(pos);
        }
        Menu.pular();
        Menu.escrever(listaDeNumeros);
        Menu.escrever(listabnumeros);
    }


}

