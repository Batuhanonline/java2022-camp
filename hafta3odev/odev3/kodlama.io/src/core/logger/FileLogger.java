package core.logger;

public class FileLogger implements BaseLogger{

	@Override
	public void log(String logMessage) {
		System.out.println("File logged: " + logMessage);
		
	}

}
