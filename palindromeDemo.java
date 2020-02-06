public class palindromeDemo {
	public static void main(String []args) {
	String Str = "MADAAM";
	int len = Str.length();
	boolean flag=false;
	for(int i=0;i<(len/2);i++) {
		if(Str.charAt(i)==Str.charAt(len-i-1)) {
			flag= true;
		}
		else {
			flag=false;
				break;
		}
	}
	
	if(flag) {
		System.out.println("Palindrome");
	}
	else {
		System.out.println("Not a Palindrome");
	}
}
}
