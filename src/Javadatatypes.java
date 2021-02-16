
public class Javadatatypes {
	
	/*
	Input Format

	The first line contains an integer, , denoting the number of test cases.
	Each test case, , is comprised of a single line with an integer, , which can be arbitrarily large or small.

	Output Format

	For each input variable  and appropriate primitive , you must determine if the given primitives are capable of storing it. If yes, then print:

	n can be fitted in:
	* dataType
	If there is more than one appropriate data type, print each one on its own line and order them by size (i.e.: ).

	If the number cannot be stored in one of the four aforementioned primitives, print the line:

	n can't be fitted anywhere.
	Sample Input

	5
	-150
	150000
	1500000000
	213333333333333333333333333333333333
	-100000000000000
	Sample Output

	-150 can be fitted in:
	* short
	* int
	* long
	150000 can be fitted in:
	* int
	* long
	1500000000 can be fitted in:
	* int
	* long
	213333333333333333333333333333333333 can't be fitted anywhere.
	-100000000000000 can be fitted in:
	* long
	* 
	*/
	
	public void fitdataType()
	{
		try
        {
            long x=-100;
            
           System.out.println(x+" can be fitted in:");
           
           if(x>=(-1*Math.pow(2, 7)) && x<=(Math.pow(2, 7))-1)
           {
        	   System.out.println("* byte");
           }
        
           
           if(x>=(-1*Math.pow(2, 15)) && x<=(Math.pow(2, 15))-1)
           {
        	   System.out.println("* short");
           }
           
           if(x>=(-1*Math.pow(2, 31)) && x<=(Math.pow(2, 31))-1)
           {
        	   System.out.println("* int");
           }
           if(x>=(-1*Math.pow(2, 63)) && x<=(Math.pow(2, 63))-1)
           {
        	   System.out.println("* long");
           }
          
                     
            
        }
        catch(Exception e)
        {
            //System.out.println(sc.next()+" can't be fitted anywhere.");
        }
	}

}
