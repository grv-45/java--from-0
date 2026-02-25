package twodarrays;

public class addin2d {

        public static void main(String[] args) {

            int [][] mat={{1,2,3},{4,5,6},{4,3,5}};


            for(int i =0;i<mat.length;i++){
                for(int j =0;j<mat[i].length;j++){
                    System.out.print(mat[i][j]+" ");
                }
                System.out.println();
            }

            // sum
            int sum =0;
            for(int i =0;i<mat.length;i++){
                for(int j =0;j<mat[i].length;j++){
                    sum+=mat[i][j];
                }
            }
            System.out.println("sum is "+ sum);


            int [][] B={{1,2,3},{4,5,6},{4,3,5}};

            int m = mat.length;
            int n = mat[0].length;
            int p = B[0].length;

            int [][] c = new int[m][p];

            // multiplication
            for(int i =0;i<m;i++){
                for(int j =0;j<p;j++){
                    for(int k=0;k<n;k++){
                        c[i][j]+=mat[i][k]*B[k][j];   // ✔ correct
                    }
                }
            }


            System.out.println("Multiplication result:");
            for(int i =0;i<m;i++){
                for(int j =0;j<p;j++){
                    System.out.print(c[i][j]+" ");
                }
                System.out.println();
            }
        }
    }

