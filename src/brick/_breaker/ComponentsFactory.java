package brick._breaker;

public class ComponentsFactory {
	public static Components getComponents(String choice) {
		if(choice.equalsIgnoreCase("ball")) {
			return new Ball(1, 3);
		}else if(choice.equalsIgnoreCase("map")) {
			return new Map(4, 8);
		}else if(choice.equalsIgnoreCase("paddle")) {
			return new Paddle(70, 12);
		}else {
			return null;
		}
	}
}
