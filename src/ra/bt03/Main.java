package ra.bt03;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        gộp mảng
        int[] array1 = new int[3];
        int[] array2 = new int[3];
        int[] array3 = new int[array1.length + array2.length];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < array1.length; i++){
            System.out.println(" Array1 nhập phần tử thứ "+i+":");
            array1[i] = sc.nextInt();
        }

        for (int i = 0; i < array2.length; i++){
            System.out.println("Array2 nhập phần tử thứ "+i+":");
            array2[i] = sc.nextInt();
        }

        for (int i= 0; i < array1.length; i++){
            array3[i] = array1[i];
        }
        for (int i= 0; i < array2.length; i++){
            array3[array1.length + i] = array2[i];
        }
        System.out.println("Array3 "+ Arrays.toString(array3));
    }
}
