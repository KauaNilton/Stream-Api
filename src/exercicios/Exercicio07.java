package exercicios;

import java.util.*;

public class Exercicio07 {
    // Encontrando o segundo número maior da lista
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

      Integer segundoMaiorNumero = numeros.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(0);

        System.out.println(segundoMaiorNumero);
    }
}
