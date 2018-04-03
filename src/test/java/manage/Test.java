package manage;

import java.io.File;
import java.io.FileNotFoundException;

import com.thoughtworks.xstream.XStream;

public class Test {
	public static void main(String[] args) throws FileNotFoundException {
		XStream xStream = new XStream();
		xStream.processAnnotations(Properties.class);
		Object readObject = xStream.fromXML(new File("pns-ums-bizMatrix.xml"));
		System.out.println("Object loaded by xstream: " + readObject);
	}
}
