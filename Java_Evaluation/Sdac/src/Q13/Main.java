package Q13;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Main {
	public static void main(String[] args) throws IOException {
		FileReader fileReader = new FileReader(
				"C:\\Users\\Shreyash\\OneDrive\\Desktop\\Java_Evaluation\\Sdac\\src\\Q13\\Text1");
		Properties properties = new Properties();
		properties.load(fileReader);
		System.out.println(properties.getProperty("username"));
		System.out.println(properties.getProperty("password"));
		
	}
}
