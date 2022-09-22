package loop;

public class Loop1 {

	public static void main(String[] args) {
		//star pattern 1
//		for(int i=1; i<=7 ; i++)//1,2,3,4,5
//		{
//			for(int j=1; j<=i ; j++)
//			{
//			System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//star pattern 2
//		for(int i=1; i<=7; i++)
//		{
//			for(int j=7; j>=i; j--)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//star pattern 3
//		for(int i=1; i<=7 ;i++)
//		{
//			for(int j=7; j>=i ; j--)
//			{
//				System.out.print(" ");
//			}
//			for(int j=1; j<=i; j++)
//			{
//			System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//star pattern 4
		for(int i=1; i<=7 ;i++)
		{
			for(int j=1; j<=i-1 ;j++)
			{
				System.out.print(" ");
			}
			for(int j=7; j>=i; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
