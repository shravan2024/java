package array;
import java.util.*;
public class TwoDArr {

	public static void main(String[] args) {
      int[][] data=new int[2][2];
      Scanner sc = new Scanner(System.in);
      for(int i=0;i<2;i++) 
      {
    	for(int j=0;j<2;j++)
    	{
    		System.out.println("Enter row "+(i+1)+" col "+(j+1)+" values");
    		data[i][j]=sc.nextInt();
    	}
      }
      for(int i=0;i<2;i++) 
      {
    	for(int j=0;j<2;j++)
    	{
    		System.out.print(data[i][j]+"\t");	
    	}
    	System.out.println();
      }

	}

}
