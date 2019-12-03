package exceptionHandling;

public class ArryIndexOutOfBound {

	public static void main(String[] args) {
		// to catch the out of bound exception

		try
		{
			int arr[]= {1,2,3,4};
			System.out.println(arr[10]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e+"check the index");
		}
	}

}
