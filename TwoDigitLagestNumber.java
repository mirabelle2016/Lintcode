/* This is not a really lintcode question, it's a practice for two digit range of LargestNumber question*/
package lintcode;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class TwoDigitLagestNumber {

	 public static String largestNumber(int[] num) {
         
         
         	int a,b,temp = 0,index = 0;
         	int count=num.length;
         	String s="";
         	ArrayList<Integer> arr = new ArrayList<Integer>();
           ArrayList<Integer> ori = new ArrayList<Integer>();
           StringBuilder sb=new StringBuilder();
           for(int k=0;k<num.length;k++)
           ori.add(num[k]);
           for(int j=0;j<num.length;j++)
           {
        	   for(int i=0;i<ori.size();i++)
               {
            	   if(ori.get(i)/10>0)
            	   {
            		   a=ori.get(i)/10;
            	   }
            	   else
            	   {
            		   a=ori.get(i);
            	   }
            	   if(a>temp)
            	   {
            		   temp=a;
            		   index=i;
            	   }
            	   else if(a==temp)
            	   {
            		   if(ori.indexOf(index)/10>0&&ori.indexOf(i)/10==0)
            		   {
            			   if(ori.indexOf(index)%10<ori.indexOf(i))
            			   {
            				  index=i;
            				   
            			   }
            			 
            		   }
            		   else if(ori.indexOf(index)/10==0&&ori.indexOf(i)/10>0)
            		   {
            			   if(ori.indexOf(i)%10>ori.indexOf(index))
            			   {
            				   index=i;
            			   }
            		   }
            		   else if(ori.indexOf(index)/10>0&&ori.indexOf(i)/10>0)
            		   {
            			   if(ori.indexOf(index)%10<ori.indexOf(i)%10)
            			   {
            				   index=i;
            			   }
            		   }
            		 
            	   }
            	  
            	   
               }
               sb.append(Integer.toString(ori.get(index)));
               ori.remove(index);
               temp=0;
           }
          
       
       return sb.toString();
        
 }
	
	public static void main(String[] args) 
	{
		int[] num={4,25,40,10,80,2};
		
		//expected 8044025210
		System.out.println(largestNumber(num));
	}

}
