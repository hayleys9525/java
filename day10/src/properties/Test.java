package properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Test {

	public static void main(String[] args) {

		Properties props = new Properties();
		String fileName = "file.txt";
		FileInputStream in = null;
		try {
			in = new FileInputStream(fileName);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		try {
			props.load(in);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		String ip = props.getProperty("IP_ADDR");
		System.out.println(ip);
	}

}
