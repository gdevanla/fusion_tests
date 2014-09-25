package net.n3.nanoxml;


import java.lang.Exception;
import java.lang.String;
import java.lang.IllegalArgumentException;

import net.n3.nanoxml.XMLException;

import java.io.FileNotFoundException;
import java.lang.ClassNotFoundException;

import org.junit.Test;

public class XMLExceptionGenTest {
	/**
	 * Test method for the class net.n3.nanoxml.XMLException
	 */@Test
	public void testXMLException255() throws Exception {
		XMLException var370 = new XMLException("Exception message");
		var370.toString();
		var370.toString();
		var370.getException();
	}

	/**
	 * Test method for the class net.n3.nanoxml.XMLException
	 */@Test
	public void testXMLException256() throws Exception {
		XMLException var370 = new XMLException("Exception message");
		var370.toString();
		var370.toString();
	}

	/**
	 * Test method for the class net.n3.nanoxml.XMLException
	 */@Test
	public void testXMLException257() throws Exception {
		XMLException var370 = new XMLException("Exception message");
		var370.toString();
		var370.getException();
		var370.toString();
		var370.getException();
	}

	/**
	 * Test method for the class net.n3.nanoxml.XMLException
	 */@Test
	public void testXMLException258() throws Exception {
		XMLException var370 = new XMLException("Exception message");
		var370.toString();
		var370.toString();
	}

	/**
	 * Test method for the class net.n3.nanoxml.XMLException
	 */@Test
	public void testXMLException259() throws Exception {
		XMLException var370 = new XMLException("Exception message");
		var370.toString();
		var370.getException();
		var370.toString();
	}

	/**
	 * Test method for the class net.n3.nanoxml.XMLException
	 */@Test
	public void testXMLException260() throws Exception {
		FileNotFoundException var373 = new FileNotFoundException();
		XMLException var374 = new XMLException(var373);
		var374.toString();
		var374.toString();
	}

	public XMLException instantiateXMLException6() {
		Exception var376 = new IllegalArgumentException();
		return new XMLException("main.dtd", 8, var376, "child cannot be null",
				true);
	}

	/**
	 * Test method for the class net.n3.nanoxml.XMLException
	 */@Test
	public void testXMLException261() throws Exception {
		XMLException var377 = instantiateXMLException6();
		IllegalArgumentException var378 = new IllegalArgumentException();
		XMLException var379 = new XMLException(var378);
		var377.toString();
		var377.getException();
		var377.toString();
		var377.getException();
		var379.toString();
		var379.toString();
	}

	public XMLException instantiateXMLException7() {
		Exception var376 = new IllegalArgumentException();
		return new XMLException("main.dtd", 8, var376, "child cannot be null",
				true);
	}

	/**
	 * Test method for the class net.n3.nanoxml.XMLException
	 */@Test
	public void testXMLException262() throws Exception {
		XMLException var381 = instantiateXMLException7();
		ClassNotFoundException var382 = new ClassNotFoundException();
		XMLException var383 = new XMLException(var382);
		var381.toString();
		var381.getException();
		var381.toString();
		var381.getException();
		var383.toString();
		var383.toString();
	}

	public XMLException instantiateXMLValidationException8() {
		IllegalArgumentException var378 = new IllegalArgumentException();
		return new XMLException(var378);
	}

	/**
	 * Test method for the class net.n3.nanoxml.XMLException
	 */@Test
	public void testXMLException263() throws Exception {
		XMLException var384 = instantiateXMLValidationException8();
		FileNotFoundException var373 = new FileNotFoundException();
		XMLException var374 = new XMLException(var373);
		var384.toString();
		var384.getException();
		var384.toString();
		var374.toString();
		var374.toString();
	}

	public XMLException instantiateXMLException9() {
		IllegalArgumentException var378 = new IllegalArgumentException();
		return new XMLException(var378);
	}

	/**
	 * Test method for the class net.n3.nanoxml.XMLException
	 */@Test
	public void testXMLException264() throws Exception {
		XMLException var385 = instantiateXMLException9();
		FileNotFoundException var373 = new FileNotFoundException();
		XMLException var374 = new XMLException(var373);
		var385.toString();
		var385.toString();
		var374.toString();
		var374.toString();
	}

	public XMLException instantiateXMLException10() {
		return new XMLException("Exception message");
	}

	/**
	 * Test method for the class net.n3.nanoxml.XMLException
	 */@Test
	public void testXMLException280() throws Exception {
		XMLException var414 = instantiateXMLException10();
		Exception var415 = new IllegalArgumentException();
		XMLException var416 = new XMLException("main.dtd", 8, var415,
				"child cannot be null", true);
		var414.toString();
		var414.toString();
		var416.toString();
		var416.getException();
		var416.toString();
		var416.getException();
	}

	/**
	 * Test method for the class net.n3.nanoxml.XMLException
	 */@Test
	public void testXMLException281() throws Exception {
		Exception var415 = new IllegalArgumentException();
		XMLException var416 = new XMLException("main.dtd", 8, var415,
				"child cannot be null", true);
		var416.toString();
		var416.getException();
		var416.toString();
		var416.getException();
	}

	/**
	 * Test method for the class net.n3.nanoxml.XMLException
	 */@Test
	public void testXMLException282() throws Exception {
		Exception var415 = new IllegalArgumentException();
		XMLException var416 = new XMLException("main.dtd", 8, var415,
				"child cannot be null", true);
		var416.toString();
		var416.getException();
		var416.toString();
		var416.getException();
	}

	/**
	 * Test method for the class net.n3.nanoxml.XMLException
	 */@Test
	public void testXMLException283() throws Exception {
		Exception var415 = new IllegalArgumentException();
		XMLException var416 = new XMLException("main.dtd", 8, var415,
				"child cannot be null", true);
		var416.toString();
		var416.getException();
		var416.toString();
		var416.getException();
	}

	public XMLException instantiateXMLParseException11() {
		IllegalArgumentException var419 = new IllegalArgumentException();
		return new XMLException(var419);
	}

	/**
	 * Test method for the class net.n3.nanoxml.XMLException
	 */@Test
	public void testXMLException284() throws Exception {
		XMLException var420 = instantiateXMLParseException11();
		Exception var415 = new IllegalArgumentException();
		XMLException var416 = new XMLException("main.dtd", 8, var415,
				"child cannot be null", true);
		var420.toString();
		var420.toString();
		var420.getException();
		var416.toString();
		var416.getException();
		var416.toString();
		var416.getException();
	}
}