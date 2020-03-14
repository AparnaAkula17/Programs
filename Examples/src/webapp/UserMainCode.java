package webapp;

public class UserMainCode {
	public static int countVowels(String string) {
		int count=0;
		for(int x=0;x<string.length();x++)
		{
		if(string.charAt(x)=='a'|| string.charAt(x)=='e' || string.charAt(x)=='i' || string.charAt(x)=='o' || string.charAt(x)=='u')
		{
			count++;
		}
		}
		return count;
	}
}
