package vrd.com;

public class Main {

	public static void main(String[] args) {

	//	Tringle.trin1= new Tringle();
		 	Tringle triangle1 = new Tringle(25, 26, 27);
	      //  Tringle triangle2 = new Tringle(-7, 0, 25);
	        Tringle triangle3 = new Tringle(1, 1, 1);
	        double sq1 = triangle1.square();
	        //double sq2 = triangle2.square();
	        double sq3 = triangle3.square();
	        System.out.println(sq1);
	        //System.out.println(sq2);
	        System.out.println(sq3);
		
	}

}
