import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {

	
	public TestBase() throws IOException {
		 FileInputStream fn = new FileInputStream("C:\\QA\\SeleniumWorkspace\\RESTAssuredAutomation\\src\\main\\java\\Config_env\\Config.properties");
         Properties prop = new Properties();
         prop.load(fn);
	}
	
	
	
	
	
	
	
	
	
	
	
}
