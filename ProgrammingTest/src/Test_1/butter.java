package Test_1;

import java.util.ArrayList;

public class butter extends Bread {
	@Override
	public ArrayList<String> getBreadType() {
		ArrayList<String> butterRecipe = new ArrayList<String>();
		butterRecipe.add("breadType: butter");
		butterRecipe.add("recipe");
		butterRecipe.add("flour: 100");
		butterRecipe.add("water: 100");
		butterRecipe.add("butter: 50");
		
		return butterRecipe;
	}
	
	
	
	
}
