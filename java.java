import java.util.*;
class largest
{
	public static void main(String args[])
	{
		Scanner s=newScanner(System.in);
		System.out.println("ENTER 3 NOS");
		int no1=s.nextInt();
		int no2=s.nextInt();
		int no3=s.nextInt();
		if(n01>no2&&no1>no3)
		{
			System.out.println(no1+" is greatest");
		}
		else if(n02>no3&&no2>no1)
		{
			System.out.println(no2+" is greatest");
		}
		else 
		{
			System.out.println(no3+" is greatest");
		}
		if(n01<no2&&no1<no3)
		{
			System.out.println(no1+" is smallest");
		}
		else if(n02<no3&&no2<no1)
		{
			System.out.println(no2+" is smallest");
		}
		else 
		{
			System.out.println(no3+" is smallest");
		}
		int sum=no1+no2+no3;
		System.out.println("THEIR SUM IS= "+sum);
	}
}