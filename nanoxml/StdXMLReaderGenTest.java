package net.n3.nanoxml;


import java.lang.String;

import net.n3.nanoxml.IXMLReader;

import java.io.FileInputStream;

import org.junit.Test;

public class StdXMLReaderGenTest {
	/**
	 * Test method for the class net.n3.nanoxml.StdXMLReader
	 */
	@Test
	public void testStdXMLReader325() throws Exception {
		StdXMLReader var522 = new StdXMLReader(null,
				"src/test/resources/encoding.xml");
		var522.getSystemID();
		var522.getPublicID();
		var522.getStreamLevel();
		var522.getLineNr();
		var522.getSystemID();
		var522.getPublicID();
		var522.getStreamLevel();
		var522.getLineNr();
	}

	/**
	 * Test method for the class net.n3.nanoxml.StdXMLReader
	 */
	@Test
	public void testStdXMLReader326() throws Exception {
		StdXMLReader var522 = new StdXMLReader(null,
				"src/test/resources/encoding.xml");
		var522.getSystemID();
		var522.getPublicID();
		var522.getStreamLevel();
		var522.getLineNr();
		var522.getSystemID();
		var522.getPublicID();
		var522.getStreamLevel();
		var522.getLineNr();
	}

	/**
	 * Test method for the class net.n3.nanoxml.StdXMLReader
	 */
	@Test
	public void testStdXMLReader327() throws Exception {
		StdXMLReader var522 = new StdXMLReader(null,
				"src/test/resources/encoding.xml");
		var522.getSystemID();
		var522.getPublicID();
		var522.getStreamLevel();
		var522.getLineNr();
		var522.getSystemID();
		var522.getPublicID();
		var522.getStreamLevel();
		var522.getLineNr();
	}

	/**
	 * Test method for the class net.n3.nanoxml.StdXMLReader
	 */
	@Test
	public void testStdXMLReader328() throws Exception {
		StdXMLReader var522 = new StdXMLReader(null,
				"src/test/resources/encoding.xml");
		var522.getSystemID();
		var522.getPublicID();
		var522.getStreamLevel();
		var522.getLineNr();
		var522.getSystemID();
		var522.getPublicID();
		var522.getStreamLevel();
		var522.getLineNr();
	}

	/**
	 * Test method for the class net.n3.nanoxml.StdXMLReader
	 */
	@Test
	public void testStdXMLReader329() throws Exception {
		StdXMLReader var522 = new StdXMLReader(null,
				"src/test/resources/encoding.xml");
		var522.getSystemID();
		var522.getPublicID();
		var522.getStreamLevel();
		var522.getLineNr();
		var522.getSystemID();
		var522.getPublicID();
		var522.getStreamLevel();
		var522.getLineNr();
	}

	/**
	 * Test method for the class net.n3.nanoxml.StdXMLReader
	 */
	@Test
	public void testStdXMLReader330() throws Exception {
		StdXMLReader var524 = new StdXMLReader(new FileInputStream(
				"src/test/resources/test.xml"));
		var524.getEncoding("<?version=\"1.0\" encoding=\"ISO-8859-1\"?>");
		var524.getEncoding("<?xml?>");
		var524.getEncoding("<?xml version=\"1.0\" encoding23=\"ISO-8859-1\"?>");
		var524.getEncoding("<?xml");
		String var526 = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>\r\n"
				+ "<!DOCTYPE note SYSTEM \"Note.dtd\">\r\n" + "<note>\r\n"
				+ "<to>Tove</to>\r\n" + "<from>Jani</from>\r\n"
				+ "<heading>Reminder</heading>\r\n"
				+ "<body>Don't forget me this weekend!</body>\r\n" + "</note>";
		var524.stringReader(var526);
	}

	/**
	 * Test method for the class net.n3.nanoxml.StdXMLReader
	 */
	@Test
	public void testStdXMLReader331() throws Exception {
		StdXMLReader var524 = new StdXMLReader(new FileInputStream(
				"src/test/resources/test.xml"));
		var524.getEncoding("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>");
		var524.fileReader("src/test/resources/test.xml");
	}

	/**
	 * Test method for the class net.n3.nanoxml.StdXMLReader
	 */
	@Test
	public void testStdXMLReader332() throws Exception {
		StdXMLReader var524 = new StdXMLReader(new FileInputStream(
				"src/test/resources/test.xml"));
		var524.getSystemID();
		var524.getPublicID();
		var524.getStreamLevel();
		var524.getLineNr();
		var524.getEncoding("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>");
	}

	/**
	 * Test method for the class net.n3.nanoxml.StdXMLReader
	 */
	@Test
	public void testStdXMLReader333() throws Exception {
		StdXMLReader var524 = new StdXMLReader(new FileInputStream(
				"src/test/resources/test.xml"));
		var524.getEncoding("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>");
		var524.getEncoding("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>");
	}

	/**
	 * Test method for the class net.n3.nanoxml.StdXMLReader
	 */
	@Test
	public void testStdXMLReader334() throws Exception {
		StdXMLReader var524 = new StdXMLReader(new FileInputStream(
				"src/test/resources/test.xml"));
		String var526 = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>\r\n"
				+ "<!DOCTYPE note SYSTEM \"Note.dtd\">\r\n" + "<note>\r\n"
				+ "<to>Tove</to>\r\n" + "<from>Jani</from>\r\n"
				+ "<heading>Reminder</heading>\r\n"
				+ "<body>Don't forget me this weekend!</body>\r\n" + "</note>";
		var524.stringReader(var526);
		var524.getEncoding("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>");
	}
}