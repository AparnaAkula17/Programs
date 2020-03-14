package webapp3;

public class ExceptionAssignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float sum=0,avg;
		try
		{
			for(int i=0;i<args.length;i++)
			{
				sum=sum+Integer.parseInt(args[i]);
			}
			avg=sum/args.length;
			System.out.println("The sum of the given array is:"+sum);
			System.out.println("The avg of the given array is:"+avg);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Unsuccessful attempt");
		}
	}

}
