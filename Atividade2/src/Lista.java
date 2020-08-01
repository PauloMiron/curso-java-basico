import java.util.ArrayList;
import java.util.Scanner;

public class Lista {

    public void lista() {
        Scanner leitorlista = new Scanner(System.in);
        Integer quantidade = 8;
        Integer qtde = 8;

        Integer maior = null;
        ArrayList<Integer> listaDeNumeros = new ArrayList<>();
        ArrayList<Integer> listaB = new ArrayList<>();

        for (int i = 0; i < quantidade; i++) {
            leitorlista = new Scanner(System.in);

            System.out.print("Digite um número: ");
            Integer numeroInformado = leitorlista.nextInt();
            listaDeNumeros.add(numeroInformado);
        }

        Menu.pular();

        listaB.addAll(listaDeNumeros);

        for (int j = 0; j < qtde; j ++){
            listaB.set(j,listaB.get(j) * 2);
        }

        Menu.escrever(listaDeNumeros);
        Menu.escrever(listaB);




}}
