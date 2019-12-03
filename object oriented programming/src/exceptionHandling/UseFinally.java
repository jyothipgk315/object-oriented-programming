package exceptionHandling;

public class UseFinally {

	public static void main(String[] args) {
		try
		{
				int a[]=new int[5];
				a[4]=30/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}

		catch(Exception e)        //any other exception present it will print
		{
			System.out.println(e);
		}
		finally 
		{
			System.out.println("programme closed");
		}
			}

		}
