package builder;

/**
 * 
 * @author Vihan De Silva
 * 
 */
public class Robot implements RobotPlan {
	
	private String name;
	private int iq;
	private boolean isActive;

	@Override
	public void setRobotName(String name) {
		this.name = name;
		
	}

	@Override
	public void setRobotIQ(int iq) {
		this.iq = iq;
		
	}

	@Override
	public void setRobotActive(boolean isActive) {
		this.isActive = isActive;
		
	}

	public int getIq() {
		return iq;
	}

	public void setIq(int iq) {
		this.iq = iq;
	}

	public String getName() {
		return name;
	}

	public boolean isActive() {
		return isActive;
	}
	
	

}
