
public class Javaloops2 {
	
	public void loops2() 
	{
		int t=2;
		
        for(int i=0;i<t;i++){
            int a = 0;
            int b = 2;
            int n = 10;
            int[] arrl = new int[n];
            arrl[0] = a+ 1*b;
            
            for(int j =2; j<=n;j++) 
            {
            	
            	int temp = (int) (Math.pow(2, j-1)*b);
            	arrl[j-1] = temp+arrl[j-2];
            }
            
            for(int k=0 ;k<arrl.length;k++)
            {
            	
            System.out.print(arrl[k] + " ");
            }
            System.out.print("\n");
           
	}
	}

}
 