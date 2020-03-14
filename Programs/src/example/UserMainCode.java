package example;

public class UserMainCode 
{

	public static int checkUnique(String s)
	{
		// TODO Auto-generated method stub
		   String s1 = s.toLowerCase();
		   StringBuffer sb = new StringBuffer(s1);
		   int l = sb.length();
		   int count = 0;
		   for (int i = 0; i < l; i++) 
		   {
		     count = 0;
		     for (int j = i + 1; j < l; j++) 
		     {
		       if (sb.charAt(i) == sb.charAt(j)) 
		       {
		         sb.deleteCharAt(j);
		         count++;
		         j--;
		         l--;
		       }
		     }
		     if (count > 0) 
		     {
		       sb.deleteCharAt(i);
		       i--;
		       l--;
		     }
		   }
		   int le=sb.length();
		   if(le>0)
			   return le;
		   else
			   return -1;
		   }
}
