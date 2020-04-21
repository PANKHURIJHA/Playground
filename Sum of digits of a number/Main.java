import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int r=0;
      int s=0;
      while(n!=0)
      {
        
        s=s+(n%10);
        n=n/10;
        
      }
      System.out.print(s);
        
        
	    // Type your code here
	}
}