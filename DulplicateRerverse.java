package Week2.Day1;

public class DulplicateRerverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text="I prepared biryani for dinner " ;
		String[] sp=text.split(" ");
		for(int i=0;i<sp.length;i++) {
			for(int j=i+1;j<sp.length;j++) {
			if(sp[i].equals(sp[j])) {
				//System.out.println("" +sp[j]);
				sp[j]="";
			}
				
			}
			System.out.println(""+sp[i]);
		}
	}
	}

	}

}
