# FACTORIAL-RECURSIVE
package oxygen.com;
import java.util.Scanner;
public class Recursive {
static int fact=1;
static int fact(int n)
{
	if(n==1)
	{
		return 1;
	}
	else
	{
		fact=fact(n-1)*n;
		return fact;
	}
	}
	public static void main(String[] args) {
		int a=0;
Scanner s=new Scanner(System.in);
int n=s.nextInt();
a=fact(n);
System.out.println(a);
	}
}
OUTPUT:
6
720
