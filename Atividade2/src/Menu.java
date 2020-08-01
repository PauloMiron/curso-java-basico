import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Scanner Leitor = new Scanner(System.in);
        Integer opcaoSelecionada = 0;
        Boolean devoApresentarMenu = true;

        IntervaloInteiros intervalo = new IntervaloInteiros();
        Intervalo inter = new Intervalo();
        Populacional populacional = new Populacional();
        Populacionall populacionall = new Populacionall();
        Lista lista = new Lista();
        fibonacci fibonacci = new fibonacci();
        Fatorial fatorial = new Fatorial();
        ordenar ordenar = new ordenar();

        while (devoApresentarMenu) {

            System.out.println("Menu de opções: ");
            escrever(" _________________________________");
            escrever("| (1) - Intervalo entre Inteiros  |");
            escrever("| (2) - Interv. Inteiros 2.0      |");
            escrever("| (3) - Cresci. Populacional      |");
            escrever("| (4) - Cresci. Populacional 2.0  |");
            escrever("| (5) - Lista Mult B = A * 2      |");
            escrever("| (6) - Sequencia Fibonacci       |");
            escrever("| (7) - Fatorial                  |");
            escrever("| (8) - Ordenando Lista           |");
            escrever("| (0) - Sair                      |");
            escrever("|_________________________________|");
            pular();
            System.out.print("Selecione a opção desejada: ");
            pular();


            opcaoSelecionada = Leitor.nextInt();

            if (opcaoSelecionada != 0 && opcaoSelecionada != 1 && opcaoSelecionada != 2 && opcaoSelecionada != 3
                    && opcaoSelecionada != 4 && opcaoSelecionada != 5  && opcaoSelecionada != 6  && opcaoSelecionada != 7
                    && opcaoSelecionada != 8) {
                System.out.println("Opção Inválida....");
                pular();
                devoApresentarMenu = true;
            } else {
                devoApresentarMenu = false;
            }
            switch (opcaoSelecionada){
                case 1:
                    intervalo.Intervalo();
                case 2:
                    inter.Inter();
                case 3:
                    populacional.Populacao();
                case 4:
                    populacionall.pop();
                case 5:
                    lista.lista();
                case 6:
                    fibonacci.fibo();
                case 7:
                    fatorial.fat();
                case 8:
                    ordenar.ordem();

            }



        }

    }



    public static void escrever(Object o)
    {
        System.out.println(o);
    }
    public static void pular()
    {
        System.out.print("\n");
    }
}


