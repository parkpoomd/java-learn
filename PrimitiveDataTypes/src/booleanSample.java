public class booleanSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(true);
		System.out.println(false);
		
		boolean bx = false;
		System.out.println("bx = " + bx);
		String strB = "TRue";
		System.out.println(Boolean.valueOf(strB));
		bx = Boolean.parseBoolean(strB);
		System.out.println("bx = " + bx);
	}

}
