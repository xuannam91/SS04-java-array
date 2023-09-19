package ra.bt04;

public class Main {
    public static void main(String[] args) {
//        Tìm phần tử lớn nhất trong mảng hai chiều.
        int [][] matrix = {{1,3,3,4},{5,6,30,8},{9,44,50,12}};
        int max = matrix[0][0];
        for (int i = 0; i< matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] > max){
                    max = matrix[i][j];
                }
            }

        }
        System.out.println("Số lớn nhất trong mảng 2 chiều: " + max);
    }
}
