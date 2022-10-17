package core.logger;

public class DatabaseLogger implements BaseLogger{

	@Override
	public void log(String logMessage) {
		System.out.println("Database loged: " + logMessage);
		
	}

}
