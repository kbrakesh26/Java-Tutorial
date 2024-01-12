import java.util.Scanner;
public class Matrices{
    static void printMatrices(int [][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
    static void multiply(int [][] a, int r1,int c1,int [][] b,int r2, int c2){
        if(c1 != r2){
            System.out.println("Wrong Input- Multiplication is not possible");
            return;
        }
        int [][]mul =new int[r1][c2];
         for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<c1;k++){
                    mul[i][j] += (a[i][k]*b[k][j]);
                }
            }
         }
         System.out.println("Multiplication of the matrices is: ");
         printMatrices(mul);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no. of rows for 1st matrices: ");
        int r1=sc.nextInt();
        System.out.println("Enter the no. of columns for 1st matrices: ");
        int c1=sc.nextInt();
        int [][]a=new int[r1][c1];
        System.out.println("Enter the elements of the first matrice: ");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the no. of rows for 2nd matrices: ");
        int r2=sc.nextInt();
        System.out.println("Enter the no. of columns for 2nd matrices: ");
        int c2=sc.nextInt();
        int [][]b=new int[r2][c2];
        System.out.println("Enter the elements of the second matrice: ");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                a[i][j]=sc.nextInt();
            }
        }
    System.out.println("Matrix 1:");
    printMatrices(a);
    System.out.println("Matrix 2:");
    printMatrices(b);
    multiply(a, r1, c1, b, r2, c2);
    }
}