import java.util.Scanner;
class Main
{
  public static int power(int a,int b)
    { 
        if (b== 0) 
            return 1; 
        else
            return a * power(a, b - 1); 
    } 
    public static void main(String[] args) 
    { 
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int m=sc.nextInt();
        System.out.println(power(n,m)); 
    } 
} 