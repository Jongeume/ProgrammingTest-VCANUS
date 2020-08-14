package Test_1;

import java.util.ArrayList;

/*
[
 {
   "breadType": "cream",
   "recipe": {
     "flour": 100,
     "water": 100,
     "cream": 200
   }
 },
 {
   "breadType": "sugar",
   "recipe": {
     "flour": 100,
     "water": 50,
     "sugar": 200
   }
 },
 {
   "breadType": "butter",
   "recipe": {
     "flour": 100,
     "water": 100,
     "butter": 50
   }
 }
]
*/
public class cream extends Bread {
	@Override
	public ArrayList<String> getBreadType() {
		ArrayList<String> creamRecipe = new ArrayList<String>();
		creamRecipe.add("breadType : cream");
		creamRecipe.add("recipe");
		creamRecipe.add("flour : 100");
		creamRecipe.add("water : 100");
		creamRecipe.add("cream : 200");
		
		return creamRecipe;
	}

}
