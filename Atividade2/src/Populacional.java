public class Populacional {

    public void Populacao() {
        Double populacaA = 80000.00;
        Double populacaB = 200000.00;
        Double totalB;
        Double totalA;
        Integer ano = 0;

        while (populacaA <= populacaB) {
            ano = ano + 1;
            totalA = (populacaA * 0.03);
            populacaA = totalA + populacaA;
            totalB = (populacaB *0.015);
            populacaB = totalB + populacaB;
        }
        System.out.print("Levou: "+ ano + " Anos Para a população A ultrapassar ou igualar a populacao B");
        System.out.println();
    }
}





