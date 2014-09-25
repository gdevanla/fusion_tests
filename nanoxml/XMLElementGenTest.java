package net.n3.nanoxml;


import java.util.Vector;

import net.n3.nanoxml.XMLElement;
import net.n3.nanoxml.IXMLElement;

import java.lang.String;

import org.junit.Test;

public class XMLElementGenTest {
	/**
	 * Test method for the class net.n3.nanoxml.XMLElement
	 */
	@Test
	public void testXMLElement295() throws Exception {
		XMLElement var436 = new XMLElement("n:note",
				"http://www.w3.org/TR/html4/", "insert.xml", 1);
		IXMLElement var437 = new XMLElement("f:to",
				"http://www.w3.org/TR/html5/", "insert.xml", 2);
		var437.setAttribute("type", "http://www.w3.org/TR/html5/", "book");
		var436.addChild(var437);
		var436.setAttribute("type", "http://www.w3.org/TR/html4/", "email");
		var436.getAttribute("type", "http://www.w3.org/TR/html4/", "post");
		var436.hasAttribute("type", "http://www.w3.org/TR/html4/");
		var436.removeAttribute("type", "http://www.w3.org/TR/html4/");
		var436.removeAttribute("email", "http://www.w3.org/TR/html4/");
		var436.hasAttribute("type", "http://www.w3.org/TR/html4/");
		IXMLElement var439 = new XMLElement("f:from",
				"http://www.w3.org/TR/html5/", "insert.xml", 2);
		var436.addChild(var439);
		IXMLElement var441 = new XMLElement("f:to",
				"http://www.w3.org/TR/html5/", "insert.xml", 1);
		var436.addChild(var441);
		var436.getFirstChildNamed("from", "http://www.w3.org/TR/html5/");
		var436.getFirstChildNamed("from", "http://www.w3.org/TR/html4/");
		var436.getFirstChildNamed("subject", "http://www.w3.org/TR/html5/");
	}

	/**
	 * Test method for the class net.n3.nanoxml.XMLElement
	 */
	@Test
	public void testXMLElement296() throws Exception {
		XMLElement var442 = new XMLElement("n:subject",
				"http://www.w3.org/TR/html4/", "insert.xml", 2);
		var442.getAttribute(null, "http://www.w3.org/TR/html4/", "book");
		IXMLElement var444 = new XMLElement("n:subject",
				"http://www.w3.org/TR/html4/", "insert.xml", 2);
		var442.addChild(var444);
		IXMLElement var445 = new XMLElement("n:to",
				"http://www.w3.org/TR/html4/", "insert.xml", 1);
		var442.addChild(var445);
		IXMLElement var439 = new XMLElement("f:from",
				"http://www.w3.org/TR/html5/", "insert.xml", 2);
		var442.addChild(var439);
		IXMLElement var441 = new XMLElement("f:to",
				"http://www.w3.org/TR/html5/", "insert.xml", 1);
		var442.addChild(var441);
		var442.getFirstChildNamed("from", "http://www.w3.org/TR/html5/");
		var442.getFirstChildNamed("from", "http://www.w3.org/TR/html4/");
		var442.getFirstChildNamed("subject", "http://www.w3.org/TR/html5/");
	}

	/**
	 * Test method for the class net.n3.nanoxml.XMLElement
	 */
	@Test
	public void testXMLElement297() throws Exception {
		XMLElement var442 = new XMLElement("n:subject",
				"http://www.w3.org/TR/html4/", "insert.xml", 2);
		IXMLElement var444 = new XMLElement("n:subject",
				"http://www.w3.org/TR/html4/", "insert.xml", 2);
		var442.addChild(var444);
		IXMLElement var445 = new XMLElement("n:to",
				"http://www.w3.org/TR/html4/", "insert.xml", 1);
		var442.addChild(var445);
		IXMLElement var439 = new XMLElement("f:from",
				"http://www.w3.org/TR/html5/", "insert.xml", 2);
		var442.addChild(var439);
		IXMLElement var441 = new XMLElement("f:to",
				"http://www.w3.org/TR/html5/", "insert.xml", 1);
		var442.addChild(var441);
		var442.getFirstChildNamed("from", "http://www.w3.org/TR/html5/");
		var442.getFirstChildNamed("from", "http://www.w3.org/TR/html4/");
		var442.getFirstChildNamed("subject", "http://www.w3.org/TR/html5/");
		IXMLElement var446 = new XMLElement("f:to",
				"http://www.w3.org/TR/html5/", "insert.xml", 2);
		var442.addChild(var446);
		IXMLElement var448 = new XMLElement("f:to",
				"http://www.w3.org/TR/html5/", "insert.xml", 1);
		var442.addChild(var448);
		IXMLElement var449 = new XMLElement("n:to",
				"http://www.w3.org/TR/html4/", "insert.xml", 1);
		var442.addChild(var449);
		var442.getChildrenNamed("to", "http://www.w3.org/TR/html5/");
		var442.getChildrenNamed("subject", "http://www.w3.org/TR/html5/");
	}

	/**
	 * Test method for the class net.n3.nanoxml.XMLElement
	 */
	@Test
	public void testXMLElement298() throws Exception {
		XMLElement var450 = new XMLElement("n:to",
				"http://www.w3.org/TR/html4/", "insert.xml", 1);
		IXMLElement var439 = new XMLElement("f:from",
				"http://www.w3.org/TR/html5/", "insert.xml", 2);
		var450.addChild(var439);
		IXMLElement var441 = new XMLElement("f:to",
				"http://www.w3.org/TR/html5/", "insert.xml", 1);
		var450.addChild(var441);
		var450.getFirstChildNamed("from", "http://www.w3.org/TR/html5/");
		var450.getFirstChildNamed("from", "http://www.w3.org/TR/html4/");
		var450.getFirstChildNamed("subject", "http://www.w3.org/TR/html5/");
		IXMLElement var444 = new XMLElement("n:subject",
				"http://www.w3.org/TR/html4/", "insert.xml", 2);
		var450.addChild(var444);
		IXMLElement var445 = new XMLElement("n:to",
				"http://www.w3.org/TR/html4/", "insert.xml", 1);
		var450.addChild(var445);
		var450.addChild(var439);
		var450.addChild(var441);
		var450.getFirstChildNamed("from", "http://www.w3.org/TR/html5/");
		var450.getFirstChildNamed("from", "http://www.w3.org/TR/html4/");
		var450.getFirstChildNamed("subject", "http://www.w3.org/TR/html5/");
	}

	/**
	 * Test method for the class net.n3.nanoxml.XMLElement
	 */
	@Test
	public void testXMLElement299() throws Exception {
		XMLElement var450 = new XMLElement("n:to",
				"http://www.w3.org/TR/html4/", "insert.xml", 1);
		IXMLElement var444 = new XMLElement("n:subject",
				"http://www.w3.org/TR/html4/", "insert.xml", 2);
		var450.addChild(var444);
		IXMLElement var445 = new XMLElement("n:to",
				"http://www.w3.org/TR/html4/", "insert.xml", 1);
		var450.addChild(var445);
		IXMLElement var439 = new XMLElement("f:from",
				"http://www.w3.org/TR/html5/", "insert.xml", 2);
		var450.addChild(var439);
		IXMLElement var441 = new XMLElement("f:to",
				"http://www.w3.org/TR/html5/", "insert.xml", 1);
		var450.addChild(var441);
		var450.getFirstChildNamed("from", "http://www.w3.org/TR/html5/");
		var450.getFirstChildNamed("from", "http://www.w3.org/TR/html4/");
		var450.getFirstChildNamed("subject", "http://www.w3.org/TR/html5/");
		var450.setAttribute("type", "http://www.w3.org/TR/html5/", "book");
		var450.getAttribute("type", "http://www.w3.org/TR/html5/", "notebook");
	}

	/**
	 * Test method for the class net.n3.nanoxml.XMLElement
	 */
	@Test
	public void testXMLElement300() throws Exception {
		XMLElement var452 = new XMLElement("note",
				"http://www.w3.org/TR/html4/");
	}

	/**
	 * Test method for the class net.n3.nanoxml.XMLElement
	 */
	@Test
	public void testXMLElement301() throws Exception {
		XMLElement var452 = new XMLElement("note",
				"http://www.w3.org/TR/html4/");
	}

	/**
	 * Test method for the class net.n3.nanoxml.XMLElement
	 */
	@Test
	public void testXMLElement302() throws Exception {
		XMLElement var452 = new XMLElement("note",
				"http://www.w3.org/TR/html4/");
	}

	/**
	 * Test method for the class net.n3.nanoxml.XMLElement
	 */
	@Test
	public void testXMLElement303() throws Exception {
		XMLElement var452 = new XMLElement("note",
				"http://www.w3.org/TR/html4/");
	}

	/**
	 * Test method for the class net.n3.nanoxml.XMLElement
	 */@Test
	public void testXMLElement304() throws Exception {
		XMLElement var452 = new XMLElement("note",
				"http://www.w3.org/TR/html4/");
	}

	/**
	 * Test method for the class net.n3.nanoxml.XMLElement
	 */@Test
	public void testXMLElement305() throws Exception {
		XMLElement var453 = new XMLElement("to", "insert.xml", 3);
		IXMLElement var454 = new XMLElement("from", "insert.xml", 2);
		var453.addChild(var454);
		IXMLElement var456 = new XMLElement("to", "insert.xml", 1);
		var453.insertChild(var456, 1);
		var453.getFirstChildNamed("from");
		var453.getFirstChildNamed("subject");
		var453.isLeaf();
	}

	/**
	 * Test method for the class net.n3.nanoxml.XMLElement
	 */@Test
	public void testXMLElement306() throws Exception {
		XMLElement var458 = new XMLElement("note", "insert.xml", 1);
		IXMLElement var459 = new XMLElement("to", "insert.xml", 1);
		var458.addChild(var459);
		var458.setAttribute("type", "email");
		var458.setAttribute("address", "post");
		IXMLElement var461 = new XMLElement("note", "insert.xml", 1);
		IXMLElement var462 = new XMLElement("to", "insert.xml", 1);
		var461.addChild(var462);
		var461.setAttribute("type", "email");
		var461.setAttribute("address", "post");
		var458.equalsXMLElement(var461);
		var458.setAttribute("type", "book");
		var458.getAttribute("type");
	}

	/**
	 * Test method for the class net.n3.nanoxml.XMLElement
	 */@Test
	public void testXMLElement307() throws Exception {
		XMLElement var464 = new XMLElement("to", "insert.xml", 2);
		IXMLElement var462 = new XMLElement("to", "insert.xml", 1);
		var464.addChild(var462);
		var464.setAttribute("type", "email");
		var464.setAttribute("address", "post");
		IXMLElement var465 = new XMLElement("to", "insert.xml", 2);
		var464.addChild(var465);
		IXMLElement var467 = new XMLElement(null);
		var467.getName();
		var464.addChild(var467);
		var464.getChildrenCount();
	}

	/**
	 * Test method for the class net.n3.nanoxml.XMLElement
	 */@Test
	public void testXMLElement308() throws Exception {
		XMLElement var468 = new XMLElement("from", "insert.xml", 2);
		IXMLElement var469 = new XMLElement("to", "insert.xml", 2);
		var468.addChild(var469);
		var468.getChildrenCount();
		IXMLElement var471 = new XMLElement("from", "insert.xml", 2);
		var468.addChild(var471);
		IXMLElement var473 = new XMLElement("to", "insert.xml", 1);
		var468.insertChild(var473, 1);
		var468.getChildrenCount();
		var468.removeChildAtIndex(0);
		var468.getChildrenCount();
	}

	/**
	 * Test method for the class net.n3.nanoxml.XMLElement
	 */@Test
	public void testXMLElement309() throws Exception {
		XMLElement var458 = new XMLElement("note", "insert.xml", 1);
		IXMLElement var474 = new XMLElement("from", "insert.xml", 2);
		var458.addChild(var474);
		IXMLElement var476 = new XMLElement("to", "insert.xml", 1);
		var458.addChild(var476);
		IXMLElement var477 = new XMLElement("to", "insert.xml", 3);
		var458.addChild(var477);
		var458.getChildrenNamed("to");
		var458.getChildrenNamed("subject");
		IXMLElement var469 = new XMLElement("to", "insert.xml", 2);
		var458.addChild(var469);
		var458.getChildrenCount();
	}

	/**
	 * Test method for the class net.n3.nanoxml.XMLElement
	 */@Test
	public void testXMLElement310() throws Exception {
		XMLElement var478 = new XMLElement(null);
		var478.getName();
		var478.getName();
	}

	/**
	 * Test method for the class net.n3.nanoxml.XMLElement
	 */@Test
	public void testXMLElement311() throws Exception {
		XMLElement var478 = new XMLElement(null);
		var478.getName();
		var478.getName();
	}

	/**
	 * Test method for the class net.n3.nanoxml.XMLElement
	 */@Test
	public void testXMLElement312() throws Exception {
		XMLElement var478 = new XMLElement(null);
		var478.getName();
		var478.getName();
		var478.getName();
	}

	/**
	 * Test method for the class net.n3.nanoxml.XMLElement
	 */@Test
	public void testXMLElement313() throws Exception {
		XMLElement var478 = new XMLElement(null);
		var478.getName();
		var478.getName();
	}

	/**
	 * Test method for the class net.n3.nanoxml.XMLElement
	 */@Test
	public void testXMLElement314() throws Exception {
		XMLElement var478 = new XMLElement(null);
		var478.getName();
		var478.getName();
	}

	/**
	 * Test method for the class net.n3.nanoxml.XMLElement
	 */@Test
	public void testXMLElement315() throws Exception {
		XMLElement var483 = new XMLElement();
		IXMLElement var484 = new XMLElement("from", "insert.xml", 2);
		var483.addChild(var484);
		IXMLElement var486 = new XMLElement("to", "insert.xml", 1);
		var483.insertChild(var486, 1);
		var483.getChildAtIndex(0);
		var483.getChildAtIndex(1);
		var483.createElement("note", "insert.xml", 1);
	}

	/**
	 * Test method for the class net.n3.nanoxml.XMLElement
	 */@Test
	public void testXMLElement316() throws Exception {
		XMLElement var483 = new XMLElement();
		var483.hasChildren();
		IXMLElement var489 = new XMLElement("from", "insert.xml", 2);
		var483.addChild(var489);
		var483.hasChildren();
		var483.createElement("note", "http://www.w3.org/TR/html4/");
	}

	/**
	 * Test method for the class net.n3.nanoxml.XMLElement
	 */@Test
	public void testXMLElement317() throws Exception {
		XMLElement var483 = new XMLElement();
		IXMLElement var491 = new XMLElement(null);
		var483.addChild(var491);
		IXMLElement var493 = new XMLElement(null);
		var493.getName();
		var483.addChild(var493);
		var483.getChildrenCount();
		var483.createElement("f:note", "http://www.w3.org/TR/html4/",
				"insert.xml", 2);
	}

	/**
	 * Test method for the class net.n3.nanoxml.XMLElement
	 */@Test
	public void testXMLElement318() throws Exception {
		XMLElement var483 = new XMLElement();
		var483.setName("book");
		var483.setName("f:book", "http://www.w3.org/TR/html4/");
		var483.setName("book", "http://www.w3.org/TR/html4/");
	}

	/**
	 * Test method for the class net.n3.nanoxml.XMLElement
	 */@Test
	public void testXMLElement319() throws Exception {
		XMLElement var483 = new XMLElement();
		var483.setName("f:book", "http://www.w3.org/TR/html4/");
		var483.setName("book", "http://www.w3.org/TR/html4/");
		IXMLElement var497 = new XMLElement("f:to",
				"http://www.w3.org/TR/html5/", "insert.xml", 2);
		var483.addChild(var497);
		IXMLElement var499 = new XMLElement("f:to",
				"http://www.w3.org/TR/html5/", "insert.xml", 1);
		var483.addChild(var499);
		IXMLElement var500 = new XMLElement("n:to",
				"http://www.w3.org/TR/html4/", "insert.xml", 1);
		var483.addChild(var500);
		var483.getChildrenNamed("to", "http://www.w3.org/TR/html5/");
		var483.getChildrenNamed("subject", "http://www.w3.org/TR/html5/");
	}
}