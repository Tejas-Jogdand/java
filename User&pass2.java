import java.util.Scanner;

class check2 {
        Scanner sc = new Scanner(System.in);

        String pwd = "password";
        String uname ="Vishal";
   
    public  void username()
    {  
        System.out.print("Enter User name:");
        String usname = sc.next();
        if(usname.equals(uname))
        {
            Password();
        }
        else
        {
             System.out.print("\nwrong user name\n Please Renter...\n");
            username();
        }
    }
    public void  Password()
    { 
        System.out.print("Enter Password:");
        String pwsd = sc.next(); 
        if(pwsd.equals(pwd))
        {
            System.out.print("\nLogin Succesful.");
        }
        else
        {
            System.out.print("\nwrong Password\n Please Renter....\n");
            Password();
        }
    }
 
}

class Main{
    public static void main(String[] args) {
        check2 us = new check2();
        us.username();
    }

}