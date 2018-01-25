public class MyCar {
	static String carModel = "Jazz";
	String color = "Black";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int door = 3;
		
		MyCar Honda = new MyCar();
		Honda.color = "White";
		
		System.out.println("Color of my new car is " + Honda.color);
		System.out.println(", it has " + door + " doors.");
	}

}
