/**
 * 
 */
package builder;

import java.util.UUID;

/**
 * Model class for storing Bot state and information.
 * 
 * @author vihan de silva
 *
 */
public class Bot {
	private UUID id;
	private String name;
	private double iq;
	private boolean isActive;
	private String ipAddress;
	
	public Bot(CustomBotBuilder customBotBuilder) {
		this.id = UUID.randomUUID();
		this.name = customBotBuilder.getName();
		this.iq = customBotBuilder.getIq();
		this.isActive = customBotBuilder.isActive();
		this.ipAddress = customBotBuilder.getIpAddress();
	}
	
	public Bot(DefaultBotBuilder defaultBotBuilder) {
		this.id = UUID.randomUUID();
		this.name = defaultBotBuilder.getName();
		this.iq = defaultBotBuilder.getIq();
		this.isActive = defaultBotBuilder.isActive();
		this.ipAddress = defaultBotBuilder.getIpAddress();	
	}
	
	@Override
	public String toString() {
		String message = "-- Bot Information -- \n"
						+ "Bot Name: " + this.name +"\n"
						+ "Bot IQ: " + this.iq +"\n"
						+ "Bot IP Address: " + this.ipAddress +"\n"
						+ "Bot Active Status: " + this.isActive +"\n"
						+" --   --";
		System.out.println(message);
		
		return message;
	}
}
