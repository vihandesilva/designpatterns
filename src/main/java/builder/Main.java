package builder;

public class Main {

	public static void main(String[] args) {
		IRobotBuilder builder = new DefaultRobotBuilder();
		RobotEngineer defaultEngineer = new RobotEngineer(builder);
		
		defaultEngineer.createRobot();
		
		System.out.println("Robot name: " + defaultEngineer.getRobot().getName());

	}

}
