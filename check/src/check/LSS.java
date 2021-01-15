package check;

import java.util.*;

public class LSS {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,-1,4,5,-1,7,6,-24,5,9,2);
	    Integer max=list.get(0);
	    Integer dummy=0;
		for(Integer a :list)
		{
		 	dummy = dummy+a;
		 	if(dummy<a)
		 	{
		 		dummy=a;
		 	}
		 	if(max<dummy)
		 	{
		 		max=dummy;
		 	}
		}
		System.out.println(list);
		System.out.println(max);
		
	
	}

}
