package builder;

public class Main {

	public static void main(String[] args) {
		System.out.println("Builder Pattern Test Program");
		System.out.println("---------------------------- ");
		System.out.println("");
		System.out.println("Creating custom bot");
		
		Bot customBot = new CustomBotBuilder()
						.setName("Zima Blue")
						.setIq(200)
						.setIpAddress("100.100.100.001")
						.setIsActive(false)
						.build();
		System.out.println("Custom Bot information: ");
		customBot.toString();
		
		System.out.println("Creating default bot");
		Bot defaultBot = new DefaultBotBuilder().build();
		System.out.println("Default Bot information: ");
		defaultBot.toString();
	}

}
