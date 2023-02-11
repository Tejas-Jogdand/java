import java.util.Scanner;
public class revnoadd
{
    public static void main(String[] args) 
    {
             Scanner sc = new Scanner(System.in);
             
             System.out.print("Enter Number:");
             int num = sc.nextInt();
             int r;
             int sum=0;
            if(num!=0)
            {
             while(num>0)
             {
                r = num%10;
                if(r%2==0)
                {
                    sum += r;
                }
                System.out.print(r);
                num = num/10;
             }
             System.out.println("\nAddition of all even numbers in given number is :"+sum);
            }
            else
            {
             System.out.println("Entered Number is zero...!");
            }
    }
}