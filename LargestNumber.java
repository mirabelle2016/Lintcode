package medium;

import java.util.Arrays;
import java.util.Comparator;
class NumbersComparator implements Comparator<String>
{

	public int compare(String o1, String o2) {
		
		return (o2+o1).compareTo(o1+o2);
	}
}
class Solution
{
	public String largestNumber(int[] nums)
	{
		String[] strs=new String[nums.length];
		for(int i=0;i<nums.length;i++)
		{
			strs[i]=Integer.toString(nums[i]);
		}
		Arrays.sort(strs,new NumbersComparator());
		StringBuilder sb=new StringBuilder();
		for(int j=0;j<strs.length;j++)
		{
			sb.append(strs[j]);
			//System.out.print(strs[j]+" ");
		}
		String result=sb.toString();
		return result;
	}
}


public class LargestNumber {

	public static void main(String[] args) 
	{
		int[] num={80,4,25,40,10,2};
		//int[] num={4,40,10};
		//expected 8044025210
		Solution s=new Solution();
		
		System.out.println(s.largestNumber(num));

	}

}
