import java.util.Scanner;
public class SecondCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 System.out.println("Enter url");
 String url = sc.next();

 if (url.endsWith(".com")) 
    {
    System.out.println("It is a commercial website");
 } 
 else if (url.endsWith(".org"))
     {
    System.out.println("It is an organization's website");
 }
 else if (url.endsWith(".in"))
 {
    System.out.println("It is an indian website");
 }
 
    
 
    }
}
