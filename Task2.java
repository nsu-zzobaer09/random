package class15;

abstract class Polygon{
	private int numSide;
	Polygon(int numSide){
		this.numSide = numSide;
	}
	
	public int getNumSide() {
			return numSide;
	}
	public void setName(int numSide) {
		this.numSide = numSide;
	}
	abstract public double area();
	abstract public double perimeter();
}

//class Triangle1 extends Polygon{
//	private double sideA;
//	private double sideB;
//	private double sideC;
//
//	public double getA() {
//		return sideA;
//	}
//	public void setA(double sideA) {
//		this.sideA = sideA;
//	}
//
//	public double getB() {
//		return sideB;
//	}
//	public void setB(double sideB) {
//		this.sideB = sideB;
//	}
//	
//}

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
