package assignment2Feb;
	import java.util.Collections;
	import java.util.HashMap;
	import java.util.Map;
	 
	public class CreateSyncMap {
	 
	    public static void main(String a[]){
	         
	        Map<String,String> mp = new HashMap<String,String>();
	        Map<String,String> sysMapt = Collections.synchronizedMap(mp);
	        System.out.println("Synchronized map got created..."+sysMapt);
	    }
	
}
