package org.example;

public class Main {
    public static void main(String[] args) {

        int[] array = {3, 5, 1, 8, 2, 0, 0, 4, 10};

        int difference = ArrayDifference.findDifference(array);
        System.out.println("Разница между максимальным и минимальным элементами: " + difference);

        int evenCount = CountEvens.countEvens(array);
        System.out.println("Количество четных элементов: " + evenCount);

        boolean neighboringzeros = NeighboringZeros.hasNeighboringZeros(array);
        System.out.println("Наличие нулей рядом: " + neighboringzeros);
    }
}