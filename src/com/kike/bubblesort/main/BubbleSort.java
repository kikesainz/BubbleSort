package com.kike.bubblesort.main;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean intercambiado; // Esta bandera nos ayuda a optimizar el algoritmo, cuando la bandera permanezca a false
        					  // significará que no ha habido cambios y que está ordenado. En ese momento pararemos el algoritmo

        for (int i = 0; i < n - 1; i++) {
            intercambiado = false; // Inicializamos la bandera como falsa al comienzo de cada pasada
            for (int j = 0; j < n - i - 1; j++) {
                // Comparamos elementos adyacentes y realizamos un intercambio si están en el orden incorrecto
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    intercambiado = true; // Cambiamos la bandera a verdadera si se realizó un intercambio
                }
            }

            // Si no hubo intercambios en esta pasada, la lista ya está ordenada y podemos salir del bucle
            if (!intercambiado) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        
        System.out.println("Array desordenado:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        bubbleSort(arr);

        System.out.println("\nArray ordenado:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

