package ra.bt01;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Xoá phần tử khỏi mảng
        int[] arrayInt = {10,4,6,8,7};
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào giá trị cần xoá");
        int deleteNum = sc.nextInt();
        int deleteIndex = -1;
        for (int i = 0; i < arrayInt.length; i++){
            if(arrayInt[i] == deleteNum){
                deleteIndex = i;
                break;
            }
        }
        if(deleteIndex != -1){
            for (int i = deleteIndex; i < arrayInt.length-1; i++){
                arrayInt[i] = arrayInt[i+1];
            }
            arrayInt = Arrays.copyOf(arrayInt, arrayInt.length-1);
            System.out.println(Arrays.toString(arrayInt));

        }else {
            System.out.println("không tìm thấy phần tử cần xoá");
        }
    }
}
