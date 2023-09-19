package ra.bt05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Tìm giá trị nhỏ nhất trong mảng
        int[] array = new int[5];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++){
            System.out.println(" Array nhập phần tử thứ "+i+":");
            array[i] = sc.nextInt();
        }
        int min = array[0];
        for (int i = 1; i < array.length; i++){
            if( min > array[i]){
                min = array[i];
            }
        }
        System.out.println("Số nhỏ nhất: " + min);


    }
}
