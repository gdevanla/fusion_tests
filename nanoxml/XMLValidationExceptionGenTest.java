package net.n3.nanoxml;


import java.lang.IllegalArgumentException;
import java.lang.Exception;
import java.lang.String;
import java.io.FileNotFoundException;
import java.lang.ClassNotFoundException;

import org.junit.Test;

public class XMLValidationExceptionGenTest {
	/**
	 * Test method for the class net.n3.nanoxml.XMLValidationException
	 */@Test
	public void testXMLValidationException275() throws Exception {
		IllegalArgumentException var404 = new IllegalArgumentException();
		XMLException var405 = new XMLException(var404);
		var405.toString();
		var405.getException();
		var405.toString();
	}

	/**
	 * Test method for the class net.n3.nanoxml.XMLValidationException
	 */@Test
	public void testXMLValidationException276() throws Exception {
		ClassNotFoundException var408 = new ClassNotFoundException();
		XMLException var409 = new XMLException(var408);
		var409.toString();
		var409.getException();
		var409.toString();
		var409.getException();
	}

	/**
	 * Test method for the class net.n3.nanoxml.XMLValidationException
	 */@Test
	public void testXMLValidationException277() throws Exception {
		IllegalArgumentException var404 = new IllegalArgumentException();
		XMLException var405 = new XMLException(var404);
		var405.toString();
		var405.getException();
		var405.toString();
		var405.getException();
	}

	/**
	 * Test method for the class net.n3.nanoxml.XMLValidationException
	 */@Test
	public void testXMLValidationException278() throws Exception {
		Exception var410 = new IllegalArgumentException();
		XMLException var411 = new XMLException("main.dtd", 8, var410,
				"child cannot be null", true);
		var411.toString();
		var411.toString();
	}

	/**
	 * Test method for the class net.n3.nanoxml.XMLValidationException
	 */@Test
	public void testXMLValidationException279() throws Exception {
		FileNotFoundException var412 = new FileNotFoundException();
		XMLException var413 = new XMLException(var412);
		var413.toString();
		var413.toString();
	}
}