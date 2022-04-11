public class Main
{
	public static void main(String[] args) {
		int a1 = 15;
		int n = 19;
		int r = 8;
		int an = a1 + (n-1)*r; // calcula o an
		System.out.println("o vaçor de an é:"+an);
        a1 = an - (n-1)*r;     // calcula o a1
        System.out.println("o valor de a1 e: "+a1);
	    r = (an - a1)/(n-1);   // calcula o r
	    System.out.println("o valo de r e=" +r)
	    n = ((an-a1)/r)+1;     // calcula o n 
	    System.out.println("o valor de n e:" +n)
	}                   
}
