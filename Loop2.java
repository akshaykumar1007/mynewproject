package loop;

public class Loop2 {

	public static void main(String[] args) {
		//star pattern 5
//		for(int i=1; i<=7; i++)
//		{
//			for(int j=7-1; j>=i; j--)
//			{
//			System.out.print(" ");
//			}
//			for(int j=1; j<=i; j++)
//			{
//				System.out.print("* ");
//			}
//			System.out.println();
//  	}
//
		//star pattern 6
//		for(int i=1; i<=7; i++)
//			{
//				for(int j=1; j<=i-1; j++)
//				{
//				System.out.print(" ");
//				}
//				for(int j=7; j>=i; j--)
//				{
//					System.out.print("* ");
//				}
//				System.out.println();
//			}
		//star pattern 7
//		for(int i=1; i<=7; i++)
//			{
//				for(int j=7-1; j>=i; j--)
//				{
//				System.out.print(" ");
//				}
//				for(int j=1; j<=(i*2)-1; j++)
//				{
//					System.out.print("*");
//				}
//				System.out.println();
		//star pattern 8
		for(int i=7; i>=1; i--)
		{
			for(int j=7-i; j>=1; j--)
			{
			System.out.print(" ");
			}
			for(int j=1; j<=(i*2)-1; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
