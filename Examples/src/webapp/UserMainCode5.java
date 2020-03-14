package webapp;

public class UserMainCode5 {
	public static int binarySearch(int[] array,int k)
	{
		boolean found=false;
		int low=0,high=array.length-1;
		int mid=(low+high)/2;
		while(low<=high)
		{
			if(array[mid]==k)
			{
				found=true;
				break;
			}
			else if(array[mid]<k)
			{
				low=mid+1;
			}
			else if(array[mid]>k)
			{
				high=mid-1;
			}
			mid=(low+high)/2;
		}
		if (found)
			return 1;
		else
			return 0;
		
	}

}
