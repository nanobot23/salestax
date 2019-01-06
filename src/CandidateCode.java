/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class CandidateCode {
   public static void main(String args[] ) throws Exception {

        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        
        
        int grade[]={10,9,8,7,6,5};
        
        int credit[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
        	
        	credit[i]=sc.nextInt();
        	
        	
        	
        }
        
        int ar[][]= new int[n][6];
        
        
        for(int i=0;i<n;i++)
        {
        	for(int j=0;j<6;j++)
        	{
        		ar[i][j]=grade[j]*credit[i];
        		
        		
        	}	
        	
        }
       
        for(int i=0;i<n;i++)
        {
        	for(int j=0;j<6;j++)
        	{
        		System.out.print(ar[i][j]+" ");
        		
        		
        	}	
        	System.out.println();
        }
       
        
        for(int i=0;i<6;i++)	
        {
        	for (int j=0;j<6;j++)
        	{
        		int sum=0;
        		
        		for(int k=0;k<n;k++)
        		{
        			
        			
        			
        				
        			
        				
        			
        			
        		}
        		
        		
        	}
        	
        	
        	
        }
        
        	
        	
        	
        	
        	

   }
}
