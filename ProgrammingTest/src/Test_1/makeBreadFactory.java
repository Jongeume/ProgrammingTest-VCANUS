package Test_1;

public class makeBreadFactory extends BreadFactory  {
	@Override
	Bread createBread(String name) {
		switch (name) {
		case "butter":
			return new butter();
		case "sugar":
			return new sugar();
		case "cream":
			return new cream();
		}
		return null;
	}

}
