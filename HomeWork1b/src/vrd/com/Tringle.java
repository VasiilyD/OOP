package vrd.com;

import static java.lang.Math.sqrt;

public class Tringle {

	private double a1;
	private double b2;
	private double c3;

	private double p;

	public Tringle(float a1, float b2, float c3) {
	        this.a1 = a1;
	        this.b2 = b2;
	        this.c3 = c3;
	        this.p = p(a1, b2, c3);
	}
	        

	private double p(float a, float b, float c) {
		return (a + b + c) / 2;

	}

	public double square() {
		// if (this.checkSides()) {
		double square = sqrt(p * (p - a1) * (p - b2) * (p - c3));
		return square;
		// }else System.out.println(this.toString()+" does not exist");return-1;

	}

}
