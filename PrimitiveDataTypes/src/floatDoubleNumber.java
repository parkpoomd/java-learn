public class floatDoubleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float fx = 3.579F;
		double dx = -1.23456789E7;
		double dy = -1.23456789;
		System.out.println(fx);
		System.out.println(dx);
		System.out.println(dy);
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MAX_EXPONENT);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MAX_EXPONENT);
		String strF = "-1.23E7";
		float fy = Float.valueOf(strF);
		System.out.println(fy);
	}

}
