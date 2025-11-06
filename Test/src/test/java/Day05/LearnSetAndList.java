package Day05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.github.dockerjava.core.dockerfile.DockerfileStatement.Add;

public class LearnSetAndList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Array *******
		
//		String [] arr=new String[5];
//	    arr[0]="mohmammd";
//	    arr[1]="mohmammd";
//	    arr[2]="mohmammd";
//	    arr[3]="mohmammd";
//	    arr[4]="mohmammd";
//	    for (int i=0 ;i<arr.length;i++) {
//	    	
//	    	System.out.println(arr[i]);
//	    }
//	    Arrays.sort(arr);
//
//
//	//array 2***
//	int [] arr2= {0,2,3,4,5};
//	 for (int n=0 ;n<arr2.length;n++) {
//	    	
//	    	System.out.println(arr2[n]);
//	    }
//	 
//	}
		
	//*****//colections (set list map )//********
	
		//list 
		
		List<String> ls=new ArrayList<String>();
		//List<Integer> lr=new ArrayList<Integer>();
		
		ls.add("mohammed");
		ls.add("norr");
		ls.add("tareq");
		ls.add("naada");
//		System.out.println(ls.get(0));
//		System.out.println(ls.size());
	
		ls.remove(0);
		Collections.sort(ls);
		for (String eachname : ls) { //foreach
			System.out.println(eachname);
		}
		
		
		
}
	
}
