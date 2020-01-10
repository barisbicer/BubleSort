import java.util.Arrays;

public class BubleSort {
	
	

	public static void main(String[] args) {
	
		int sortarry[]= {3,6,5,8,7,9,2,1,12,4,18,52,25,10,11,36,13,60,61,62,63,64,65,66,67,68,69,70,71,72,75,74,0};
	
	    int temp;
	  		
	    for(int i=0;i<sortarry.length;i++)
		{
	  	  for(int j=i;j<sortarry.length;j++)
		  { 
			if(sortarry[i] > sortarry[j])
		    {   
		    	 temp=sortarry[i]; 	    
		    	 sortarry[i]=sortarry[j];
		    	 sortarry[j]=temp;
			   		    
		    	 
		    }
		  }
				
		}
		
		System.out.println(""+Arrays.toString(sortarry));
		
		
			
	}
	
}
