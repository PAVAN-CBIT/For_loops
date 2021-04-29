public class Nestedloop
{
    public static void main(String[] args) 
    {
        
        int counter =0;
	     for(int i=0;i<1000;i++)
	  {
	      for(int j=0;j<1000;j++)
	      {
	          System.out.println("the value of i was"+i+"---"+j);
	          counter++;
	          
	      }
	  }
	
		
		
		System.out.println("COUNTER"+counter);
    }
}
