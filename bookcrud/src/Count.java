
import java.util.*;
class Count
{
    public static void main(String[] args)
    {
        int fail=0;
        int pass=0;
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of subjects:");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        if(n<=0)
        {
            System.out.println("Invalid input range");
        }
        else
        {
            for(i=0;i<n;i++)
            {
                if(a[i]>=50)
                    pass++;
                else
                    fail++;
            }
            if(n==pass)
                System.out.println("Ram passed in all subjects");
            else if(n==fail)
                System.out.println("Ram failed in all subjects");
            else
                System.out.println("Ram passed in "+pass+" subjects and failed in "+fail+" subjects");
        }
    }
}