import java.util.*;
public class binarysearch2D {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int [][] arr=new int[m][n];
        System.out.println("Enter array elements");
        for(int i=0; i<m;i++)
        {
            for(int j=0; j<n; j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter target element");
        int target=sc.nextInt();
        System.out.println(Arrays.toString(binary2D(arr, target)));



    }
    static int[] binary2D(int [][] matrix, int target)
    {
        int r=0;
        int c=matrix.length-1;
        while(r<matrix.length && c>=0)
        {
            if(matrix[r][c]== target)
            {
                return new int[]{r,c};
            }
            if(matrix[r][c]< target)
            {
                r++;
            }
            else{
                c--;
            }
        }
        return new int[]{-1,-1};

    }
    {

    }
    
}
