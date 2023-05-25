import java.util.Scanner;

public class exerciciEspe {
    public static void main(String[] args) {
        exerciciEspe a = new exerciciEspe();
        int num = a.fibonacci(7);
        System.out.println(num);


    }
    // Recursivitat


    public int fibonacci(int a) {
        if (a == 0) {
            return 0;
        } else if (a == 1) {
            return 1;
        } else {
            return fibonacci(a - 1) + fibonacci(a - 2);
        }
    }

    public void crearArrayQuadrada(int a) {
        int[][] array = new int[a][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                array[i][j] = (int) (Math.random() * 10);
            }
        }
        imprimirDiagonal(array);
        imprimirSecundaria(array);
    }

    public void imprimirArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }

    public void imprimirDiagonal(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i == j) {
                    System.out.print(a[i][j] + "\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

    public void imprimirSecundaria(int[][] a) {
        System.out.println("======================");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i + j == a.length - 1) {
                    System.out.print(a[i][j] + "\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

    public int mitjanaArray(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum / a.length;
    }

    public int[] doblarArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] *= 2;
        }
        return a;
    }

    public boolean[] esParellArray(int[] a) {
        boolean[] b = new boolean[a.length];
        for (int i = 0; i < b.length; i++) {
            if (a[i] % 2 == 0) {
                b[i] = true;
            } else {
                b[i] = false;
            }
        }
        return b;
    }

    public int sumar(int a, int b) {
        return a + b;
    }

    public int resta(int a, int b) {
        return a - b;
    }

    public void print() {
        System.out.println(sumar(5, 7));
        System.out.println(resta(8, 4));
    }

    public boolean esSenar(int a) {
        return a % 2 == 1;
    }

    public boolean esParell(int a) {
        return !esSenar(a);
    }

    public int mitjana(int a, int b, int c) {
        return (a + b + c) / 3;
    }

    public int llegirTeclat() {
        System.out.println("Fica un numero");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}