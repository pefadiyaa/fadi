import java.util.Scanner;
public class Employe
{
   int eNo;
   String eName;
   double eSalary;
   public void getdetails()
   { 
     Scanner sc=new Scanner(System.in);
     System.out.print("Employe number:");
     eNo=sc.nextInt();
     System.out.print("Name:");
     sc.nextLine();
     eName=sc.nextLine();
     System.out.print("Salary:");
     eSalary=sc.nextDouble();
   }
   void display()
   {
      System.out.println("Employe No:"+eNo);
      System.out.println("Name:"+eName);
      System.out.println("Salary Amount:"+eSalary+"\n");
   }
   public static void main(String[]args)
   {
     System.out.println("\nEnter the No.of Employe's");
     Scanner sc1=new Scanner(System.in);
     int num=sc1.nextInt();
     System.out.println("Enter the Employe details");
     Employe arr[]=new Employe[num];
     for(int i=0;i<num;i++)
     {
         arr[i]=new Employe();
         arr[i].getdetails();
     }
     System.out.println("Informations of all the employees");
     for(int i=0;i<num;i++)
         arr[i].display();
     boolean state=false;
     System.out.println("Enter the Employe Number to get details of a employee");
     int num2=sc1.nextInt();
     for(int i=0;i<num;i++)
     {
        if(arr[i].eNo==num2)
        {
            System.out.println("Employe details");
            arr[i].display();
        }
      }
    }
}
