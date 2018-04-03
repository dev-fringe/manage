package manage;

import java.io.File;
import java.io.FileNotFoundException;

import com.thoughtworks.xstream.XStream;

public class Test {
	public static void main(String[] args) throws FileNotFoundException {
		XStream xStream = new XStream();
		xStream.processAnnotations(Properties.class);
		Properties prop = (Properties) xStream.fromXML(new File("data.xml"));
		System.out.println("Properties loaded : " + prop);
	}
}
