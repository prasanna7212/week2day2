package Week2.Day1;

public class palidrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="";
		String reverseName="polo";
		char[] charArray=name.toCharArray();
		for(int i=charArray.length-1;i>0;i--) {
			reverseName=reverseName+charArray[i];
		}
		System.out.println(reverseName);
		if(reverseName.equals(name)) {
			System.out.println("palindrome");
		}else {
			System.out.println("Not a palindrome");
		}
	}



	}


