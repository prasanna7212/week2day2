package Week2.Day1;

public class Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word= "sakthiprasanna";
		//String Strcopy="";
		char[] Letter=word.toCharArray();
		int Length=Letter.length;
		for(int i=0;i<Length;i++) {
			if(i%2!=0) {
				String strcpy="";
				strcpy=strcpy+Letter[i];
				System.out.println(strcpy);
			}
			else
			{
				System.out.println(Letter[i]);
			}
		}
	}
	}

