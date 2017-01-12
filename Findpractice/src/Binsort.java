
public class Binsort {

	public static int Binsort(int[]arr,int goal)
	{
		int low=0;
		int high=arr.length ;
		while(low<=high)
		{
			int middle=(low+high)/2;
			if (arr[middle]==goal)
			{
			   return middle;
			}
			else if(arr[middle]<goal)
			{
				low=middle+1;
			}
			else
			{
				high=middle-1;
			}	
					
		}
		return -1;		
	}
	public static void main(String[] args)
	{
		int[]array={0,1,2,3,4,5};
		System.out.println(Binsort(array,0));
		
		
	}
	
}
