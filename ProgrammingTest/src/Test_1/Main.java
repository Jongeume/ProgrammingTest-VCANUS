package Test_1;

public class Main {

	public static void main(String[] args) {
	
		BreadFactory  bf = new makeBreadFactory();
		
		Bread butter = bf.createBread("butter");
		Bread sugar = bf.createBread("sugar");
		Bread cream = bf.createBread("cream");
		

		for(int i = 0; i<cream.getBreadType().size();i++) {
			System.out.println(cream.getBreadType().get(i));
		}
		System.out.println();
		
		for(int i = 0; i<sugar.getBreadType().size();i++) {
			System.out.println(sugar.getBreadType().get(i));
		}
		System.out.println();
		
		for(int i = 0; i<butter.getBreadType().size();i++) {
			System.out.println(butter.getBreadType().get(i));
		}
		System.out.println();
		
		
	
		
	}	

}
