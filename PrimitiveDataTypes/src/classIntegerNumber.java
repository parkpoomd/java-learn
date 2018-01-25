public class classIntegerNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		
		int i = 345;
		i = i + 10;
		System.out.println(Integer.toString(i));
		String s = "-10";
		i = Integer.valueOf(s);
		System.out.println(i);
		s = "0034";
		i = Integer.valueOf(s);
		System.out.println(i);
	}

}
