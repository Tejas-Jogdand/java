import java.util.Scanner;
class Main
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        String uname= "Vishal";
        String pwd = "Password";
        int i= 1;
        int u=1;
       while(u!=0)
       {
        System.out.print("Enter user name:-");
        String usname = s.next();
        
        while(i!=0)
        {             
            if(uname.equals(usname))
            {          
                System.out.print("\nEnter pasword:-");
                String pwds = s.next();
                if(pwd.equals(pwds))
                {
                    System.out.println("Login Sucessful");
                    u--;
                    break;
                }
                else
                {
                    System.out.println("Wrong password.....!\n");
                }
            }
            else
             {
                 System.out.println("Wrong username.....!\n");
                 break;
             }  
        }//inner while
      }//firs while
    }
 }

