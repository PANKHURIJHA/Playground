import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int r=n%10;
      while(n>10)
      {
        n=n/10;
      }
      System.out.print(n+r);
	    // Type your code here
	}
}