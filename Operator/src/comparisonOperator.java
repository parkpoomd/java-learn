public class comparisonOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iA = 4, iB = 5;
		
		float fA = 4.0F;
		
		if(iA == iB)
			System.out.println("iA เท่ากับ iB");
		if(iA != iB)
			System.out.println("iA ไม่เท่ากับ iB");
		if(iA == fA)
			System.out.println("iA เท่ากับ fA");
		fA = fA + 1;
		if(iB == fA)
			System.out.println("iB เท่ากับ fA");
	}

}
