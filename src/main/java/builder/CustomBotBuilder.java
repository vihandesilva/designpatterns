/**
 * 
 */
package builder;

/**
 * 
 * Builder class based on the IBotBuilder interface.
 * used to generate bots on custom values.
 * 
 * @author vihan de silva
 *
 */
public class CustomBotBuilder implements IBotBuilder {
	// Provide default values if none are provided
	private String name = "CustomBot";
	private double iq = 100;
	private boolean isActive = true;
	private String ipAddress = "127.0.0.1";
	
	public boolean isActive() {
		return isActive;
	}
	public String getName() {
		return name;
	}
	public double getIq() {
		return iq;
	}
	public String getIpAddress() {
		return ipAddress;
	}
	
	public CustomBotBuilder setName(String name) {
        if (name != null && !name.trim().isEmpty() && name.matches("[a-zA-Z ]+")) {
            this.name = name.trim();
        } else {
            System.out.println("Invalid name provided. Using default: " + this.name);
        }		
        return this;
	}
	public CustomBotBuilder setIq(double iq) {
        if (iq > 0 && iq < 250) {
            this.iq = iq;
        } else {
            System.out.println("Invalid IQ value provided. Using default: " + this.iq);
        }	
        return this;
	}
	public CustomBotBuilder setIsActive(Boolean isActive ) {
        if (isActive != null) {
            this.isActive = isActive;
        } else {
            System.out.println("Invalid employment status provided. Using default: " + this.isActive);
        }	
        return this;
	}
	public CustomBotBuilder setIpAddress(String ipAddress) {
        if (ipAddress != null && !ipAddress.trim().isEmpty()) {
            this.ipAddress = ipAddress.trim();
        } else {
            System.out.println("Invalid IP address provided. Using default: " + this.ipAddress);
        }	
        return this;
	}
	
	@Override
	public Bot build() {
		Bot bot = new Bot(this);
		return bot;
	}
}
