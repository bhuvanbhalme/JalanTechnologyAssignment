package arraysconsept;

public class SubArraysSumZero {

	public static void main(String[] args) {
		  int a[]= {-4,1,3,-2,-1};
		  int b=0;
		  for(int i=0;i<a.length;i++) {
			  int sum=0;
			  for(int j=i;j<a.length;j++)
			  {
				  sum=sum+a[j];
				  if(sum==0)
				  {
					  b=1;
					  break;
				  }
			  }
		  }
		  if(b==1)
			  System.out.println("Elements Found");
		  else
			  System.out.println("No Elements Found");
	}

}
