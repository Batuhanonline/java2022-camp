package core.logger;

public class EmailLogger implements BaseLogger{

	@Override
	public void log(String logMessage) {
		System.out.println("Email logged: " + logMessage);
		
	}

}
