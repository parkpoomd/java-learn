public class integerNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i1 = 40;
		int i2 = -10;
		
		int i3 = i1 + i2;
		System.out.println("i3 = " + i3);
		
		i1 += 10;	// i1 = i1 + 10
		i2 -= 5;	// i2 = i2 - 5
		System.out.println("i1 = " + i1);
		System.out.println("i2 = " + i2);
		
		long lx = 100L;
		lx = lx + i1;
		System.out.println("lx = " + lx);
	}

}
