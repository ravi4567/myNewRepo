package com.test;

public class UpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "i love program";
		char[] ch = s.toCharArray();
		 //||  ch[i] != ' ' && ch[i - 1] == ' '
		for(int i=0;i<ch.length;i++) {
			if (i == 0 && ch[i] != ' ' ||  ch[i] != ' ' && ch[i - 1] == ' ') { 
	  
	                // If it is in lower-case 
	                if (ch[i] >= 'a' && ch[i] <= 'z') { 
	  
	                    // Convert into Upper-case 
	                    ch[i] = (char)(ch[i] - 'a' + 'A'); 
	                } 
	            } 
		}
		String st = new String(ch);
		System.out.println(st);
	}

}
