import java.util.*;
public class Pattern 
{

	public static void main(String[] args) 
	{
		int iNumber = 4;
		System.out.println("number of rows:");
	    //Scanner input=new Scanner(System.in);
		//Number=input.nextInt();
		//input.close();
		for(int i=iNumber; i > 0;i--)
		{ 
			for(int j=0; j< i;j++)
			{
				System.out.print("1");
			}
			System.out.println("");
		}

	}
}

