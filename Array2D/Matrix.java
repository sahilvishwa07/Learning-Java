// package Array2D;

// import java.util.Scanner;

// public class Matrix {
//     public static void main(String args[]) {
//         int matrixss[][] = new int[3][3];
//         int n = matrixss.length, m = matrixss[0].length;

//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter elements for a 3x3 matrix:");
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 matrixss[i][j] = sc.nextInt();
//             }
//         }
//         System.out.println("The matrix is:");
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 System.out.print(matrixss[i][j] + " ");
//             }
//             System.out.println();
//         }
//         sc.close();
//     }
// }
package Array2D;

import java.util.Scanner;

public class Matrix {
    public static boolean search(int matrixss[][], int key){
        for (int i = 0; i < matrixss.length; i++) {
            for (int j = 0; j < matrixss[0].length; j++) {
                if(matrixss[i][j] == key){
                    System.out.println("Founded at cell (" + i + "," + j +")");
                    return true;
                }
            }
            
        }
        System.out.println("Key not found");
        return false;

    }
    public static void main(String args[]) {
        int matrixss[][] = new int[3][3];
        int n = matrixss.length, m = matrixss[0].length;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter elements for a 3x3 matrix:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                matrixss[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nThe matrix is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrixss[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();

        search(matrixss, 9);
    }
}
