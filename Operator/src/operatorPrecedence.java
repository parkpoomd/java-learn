public class operatorPrecedence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double dX;
		dX = 1D + 2D * 3D / 4D + 2D - 1D;
		System.out.println(dX);
		dX = (1D + 2D * 3D) / 4D + (2D - 1D);
		System.out.println(dX);
		dX = 1D + (2D * 3D) / (4D + 2D) - 1D;
		System.out.println(dX);
		dX = (1D + 2D) * (3D / 4D) + (2D - 1D);
		System.out.println(dX);
	}

}
