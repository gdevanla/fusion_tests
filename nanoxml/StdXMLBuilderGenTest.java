package net.n3.nanoxml;


import java.lang.Object;
import junit.framework.*;

import org.junit.Test;

public class StdXMLBuilderGenTest {
	/**
	 * Test method for the class net.n3.nanoxml.StdXMLBuilder
	 */
	
	@Test
	public void testStdXMLBuilder290() {
		StdXMLBuilder var430 = new StdXMLBuilder();
		var430.startBuilding("file:sample.xml", 1);
		var430.startElement("note", "f", "http://www.w3c.org/html4",
				"file:sample.xml", 1);
		var430.startElement("book", "f", "http://www.w3c.org/html4",
				"file:sample.xml", 1);
		var430.startElement(null, "f", "http://www.w3c.org/html4",
				"file:sample.xml", 1);
		var430.endElement("noteBook1", "f:", "http://www.w3c.org/html4");
		var430.endElement("noteBook2", "f:", "http://www.w3c.org/html4");
		var430.startBuilding("file:sample.xml", 1);
		var430.startElement("book", "f", "http://www.w3c.org/html4",
				"file:sample.xml", 1);
		var430.getResult();
		
	}

	/**
	 * Test method for the class net.n3.nanoxml.StdXMLBuilder
	 */
	@Test
	public void testStdXMLBuilder291() throws Exception {
		StdXMLBuilder var430 = new StdXMLBuilder();
		var430.startBuilding("file:sample.xml", 1);
		var430.startElement("note", null, null, "file:sample.xml", 1);
		var430.addAttribute("name", null, null, "Software Testing", "String");
		var430.startBuilding("file:sample.xml", 1);
		var430.startElement("note", "f", "http://www.w3c.org/html4",
				"file:sample.xml", 1);
		var430.startElement("book", "f", "http://www.w3c.org/html4",
				"file:sample.xml", 1);
		var430.startElement(null, "f", "http://www.w3c.org/html4",
				"file:sample.xml", 1);
		var430.endElement("noteBook1", "f:", "http://www.w3c.org/html4");
		var430.endElement("noteBook2", "f:", "http://www.w3c.org/html4");
	}

	/**
	 * Test method for the class net.n3.nanoxml.StdXMLBuilder
	 */
	@Test
	public void testStdXMLBuilder292() throws Exception {
		StdXMLBuilder var430 = new StdXMLBuilder();
		var430.startBuilding("file:sample.xml", 1);
		var430.startElement("note", null, null, "file:sample.xml", 1);
		var430.addAttribute("name", null, null, "Software Testing", "String");
		var430.startBuilding("file:sample.xml", 1);
		var430.startElement("note", "f", "http://www.w3c.org/html4",
				"file:sample.xml", 1);
		var430.addAttribute("name", "f", "http://www.w3c.org/html4",
				"Software Testing", "String");
	}

	/**
	 * Test method for the class net.n3.nanoxml.StdXMLBuilder
	 */
	@Test
	public void testStdXMLBuilder293() throws Exception {
		StdXMLBuilder var430 = new StdXMLBuilder();
		var430.startBuilding("file:sample.xml", 1);
		var430.startElement("book", "f", "http://www.w3c.org/html4",
				"file:sample.xml", 1);
		var430.startElement("noteBook", "f", "http://www.w3c.org/html4",
				"file:sample.xml", 1);
		var430.startBuilding("file:sample.xml", 1);
		var430.startElement("note", "f", "http://www.w3c.org/html4",
				"file:sample.xml", 1);
		var430.startElement("book", "f", "http://www.w3c.org/html4",
				"file:sample.xml", 1);
		var430.startElement(null, "f", "http://www.w3c.org/html4",
				"file:sample.xml", 1);
		var430.endElement("noteBook1", "f:", "http://www.w3c.org/html4");
		var430.endElement("noteBook2", "f:", "http://www.w3c.org/html4");
	}

	/**
	 * Test method for the class net.n3.nanoxml.StdXMLBuilder
	 */
	@Test
	public void testStdXMLBuilder294() throws Exception {
		StdXMLBuilder var430 = new StdXMLBuilder();
		var430.startBuilding("file:sample.xml", 1);
		var430.startElement("book", "f", "http://www.w3c.org/html4",
				"file:sample.xml", 1);
		var430.startElement("noteBook", "f", "http://www.w3c.org/html4",
				"file:sample.xml", 1);
		var430.startBuilding("file:sample.xml", 1);
		var430.startElement("book", "f", "http://www.w3c.org/html4",
				"file:sample.xml", 1);
		var430.getResult();
	}
}