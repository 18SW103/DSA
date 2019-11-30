class Task4{

	public static float aver(int arr[])
	{
		int a=0;
		for(int  i: arr){
			a=a+i;
		}
		return a/arr.length;//return the Average
	}
	public static void main(String[] args) {
		int [] ar={1,3,2,4,5};//Declaring Array
		System.out.print("Average is = "+aver(ar));
	}
}
