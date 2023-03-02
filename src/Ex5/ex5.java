package Ex5;

public class ex5 {

	public static void main(String[] args) {
		
		String normal = "William";
		String inversa = "";
		
		 for (int i = normal.length() - 1;  0 <= i; i--) {
		        inversa += normal.charAt(i);
		    }
		 
		 System.out.println(inversa);

	}

}
