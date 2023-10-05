import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesFile {
	public static void main(String[] args) {

		try {
			FileInputStream fileInputStream = new FileInputStream("C:\\Users\\tusha\\OneDrive\\Desktop\\t.properties");
			Properties properties = new Properties();
			properties.load(fileInputStream);
			String userName = properties.getProperty("username");
			String passWord = properties.getProperty("password");
			System.out.println("Username is :" + userName);
			System.out.println(("Password is : " + passWord));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
