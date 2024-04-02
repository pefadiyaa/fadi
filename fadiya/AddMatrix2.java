import java.util.Scanner;
class Matrix
{
  int m,n,i,j;
  int[][]a=new int[5][5];
  int[][]b=new int[5][5];
  int[][]c=new int[5][5];
  Scanner sc=new Scanner(System.in);
  void get()
  {
       System.out.println("Enter no:of rows:");
       m=sc.nextInt();
       System.out.println("Enter no:of column:");
       n=sc.nextInt();
       System.out.println("Enter element of matrix A");
       for(i=0;i<m;i++)
             for(j=0;j<n;i++)
                     a[i][j]=sc.nextInt();
       System.out.println("Enter element of matrix B");
       for(i=0;i<m;i++)
             for(j=0;j<n;i++)
                     b[i][j]=sc.nextInt();
   }
   void add()
   {
     for(i=0;i<m;i++)
         for(j=0;j<n;j++)
               c[i][j]=a[i][j]+b[i][j];
   }
   void dispaly()
    {
        System.out.println("Matrix A");
        for(i=0;i<m;i++){
              for(j=0;j<n;j++){
                    System.out.println(a[i][j]+"  ");
                    }
                    System.out.println();
                  }
        System.out.println("Matrix B");
        for(i=0;i<m;i++){
              for(j=0;j<n;j++){
                    System.out.println(b[i][j]+" ");
                    }
                    System.out.println();
                  }
         System.out.println("Matrix C");
        for(i=0;i<m;i++){
              for(j=0;j<n;j++){
                    System.out.println(c[i][j]+" ");
                    }
                    System.out.println();
                  }
     }
}        
public class AddMatrix2 
{
public static void main(String[]args)
  {
  Matrix obj=new Matrix();
  obj.get();
  obj.add();
  obj.display();
  }
}                           
                                
                      
