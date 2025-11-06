package Day05;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class LearnSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Set<Integer> st =new HashSet<Integer>();
         st.add(1000);
         st.add(100);
         st.add(10);
         st.add(5);
         
        for (Integer Enum : st) {
			System.out.println(Enum);
		}
        //Convert set to list to use get function 
        List<Integer>ls=new ArrayList<Integer>(st);
        System.out.println(ls.get(0));
	}

}
