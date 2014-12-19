package chapter;

public class Project
{
	public static void main(String[]args)
	{
		int x=1, y=1;
		while(x<=12)
		{
			int display=x*y;
			System.out.print(display);
			System.out.print(' ');
			y++;
			if(y==13)
			{
				System.out.println();
				y=1;
				x++;
			}
				
		}
	}

}
