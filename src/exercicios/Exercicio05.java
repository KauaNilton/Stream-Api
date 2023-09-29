package exercicios;

import java.util.Arrays;
import java.util.List;

public class Exercicio05 {
    // Calculando a média dos números maiores que 5
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        double mediaNumeros = numeros.stream()
                .filter(n -> n > 5)
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);


                System.out.println(mediaNumeros);

    }
}
