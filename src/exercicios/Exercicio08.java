package exercicios;

import java.util.Arrays;
import java.util.List;

public class Exercicio08 {
    // Somando os dígitos de todos os números da lista
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaDosNumeros = numeros.stream()
                .reduce(0, Integer::sum);

        System.out.println(somaDosNumeros);


    }
}
