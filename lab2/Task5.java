import java.util.*;
class Task5
{
	 public static void main(Stringargs[]) {
int av[]= new int[8]; 
int large=0;
int seclarge=0;

Scanner s = new Scanner (System.in);

for (int z=0;z<av.length;z++)
{
	av[z]= s.nextInt();
	if (large < av[z])
	{
		seclarge = large;
		large = av[z];
	}
	else if (seclarge < av[z]) {
		seclarge = av[z];

	}

}
System.out.print(seclarge+ " Second largest array");
}
}