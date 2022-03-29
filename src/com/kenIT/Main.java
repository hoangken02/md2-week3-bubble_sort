package com.kenIT;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter list size: ");
        int size = scanner.nextInt();
        int[] list = new int[size];

        System.out.print("Enter " + list.length + " numbers: ");
        for (int i = 0; i < list.length; i++) {

            list[i] = scanner.nextInt();
        }
        ;

        for (Integer i : list) {
            System.out.print(i + "\t");
        }

        System.out.println("After sorted: ");
        bubbleSortByStep(list);

    }

    static void bubbleSortByStep(int[] list) {
        boolean nextPass = true;
        for (int i = 1; i < list.length && nextPass; i++) {
            nextPass = false;
            for (int j = 0; j < list.length - i ; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    nextPass = true;
                }
            }

            if (nextPass == false) {
                System.out.println("Array may be sorted");
                break;
            }

            System.out.print("List after the  " + i + "' sort: ");
            for (Integer e :
                    list) {
                System.out.print(e + "\t");
            }
            System.out.println();
        }

    }


}

