package exercicios;

import java.util.Arrays;
import java.util.List;

public class Exercicio11 {
    // Encontrando a soma dos quadrados de todos os números da lista
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaDosQuadrados = numeros.stream()
                .map(n -> n * n)
                .reduce(Integer::sum)
                .orElse(0);

        System.out.println(somaDosQuadrados);

    }
}
