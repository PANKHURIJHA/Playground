import java.util.Scanner;
class Main
{
  public static int square (int num)
  {
    int s=num*num;
    return s;
  }
	public static void main (String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int s1=square(n);
      System.out.print(s1);
	 // Type your code here   
	} 
}