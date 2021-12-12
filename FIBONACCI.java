import java.util.Scanner;
public class FIBONACCI {
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.println("how many fibonacci series do you want : ");
		int a=input.nextInt();
		System.out.println("0");
		int b=1;
		int c=0;
		int i=1;
		while (true){
			if(i<a){
				int d=b+c;
				System.out.println(d);
				b=c;
				c=d;
				i=i+1;
			}else{
			break;
			}
		}
		
	}
}
