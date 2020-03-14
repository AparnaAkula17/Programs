package interexamples;

import java.util.function.Function;

public class PreFunctionExample {
	public static void main(String[] args)
	{
		Function<String,Integer> f1=s->s.length();
		System.out.println("The length of string india is:" +f1.apply("india"));
		
		Function<Integer,Integer> f2=n->n*n;
		System.out.println("The square of 4 is:" +f2.apply(4));
		
		Function<Integer,Integer> fact= x->{
											int f=1;
											for(int i=2;i<=x;i++)
												f=f*i;
											return f;
											};
		System.out.println("Factorail of 4 is:" +fact.apply(4));
		
		Function<String,Integer> vcount = str->
										{
											int count=0;
											for(int i=0;i<str.length();i++)
											{
												if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' )
													count++;
											}
											return count;
										};
		System.out.println("Vowels count in apple is:"+vcount.apply("apple"));
		
		Function<String,Integer> bcount= s->
										{
											int count=0;
											for(int j=0;j<s.length();j++)
											{
												if(s.charAt(j)!=' ')
													count++;												
											}
											return count;
										};
		System.out.println("Count of a ppu is:" +bcount.apply("a ppu"));
	}
}
