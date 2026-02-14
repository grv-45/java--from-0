package twodarrays;

public class maxelement {
    public static void main(String[] args) {
        int [] [] arr = {{2,3,4,5},{3,5,2,7},{9,7,8,6}};
        int max = Integer.MIN_VALUE;
        for(int i =0; i<3;i++){
            for(int j =0;j<4;j++){
                if(arr[i][j]>max){
                    max= arr[i][j];
                }

            }
        }
        System.out.println(max);
    }
}
