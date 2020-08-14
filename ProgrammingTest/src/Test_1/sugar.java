package Test_1;

import java.util.ArrayList;

public class sugar extends Bread {
	@Override
	public ArrayList<String> getBreadType() {
		ArrayList<String> sugarRecipe = new ArrayList<String>();
		sugarRecipe.add("breadType: sugar");
		sugarRecipe.add("recipe");
		sugarRecipe.add("flour: 100");
		sugarRecipe.add("water: 50");
		sugarRecipe.add("sugar: 200");
		
		return sugarRecipe;
	}

}
