package net.n3.nanoxml;


import net.n3.nanoxml.XMLEntityResolver;

import java.util.Properties;

import net.n3.nanoxml.IXMLEntityResolver;

import java.lang.String;

import org.junit.Test;

import net.n3.nanoxml.StdXMLReader;
import net.n3.nanoxml.IXMLReader;

public class NonValidatorGenTest {
	/**
	 * Test method for the class net.n3.nanoxml.NonValidator
	 */
	@Test
	public void testNonValidator320() throws Exception {
		NonValidator var501 = new NonValidator();
		IXMLEntityResolver var502 = new XMLEntityResolver();
		var501.setParameterEntityResolver(var502);
		String var504 = "src/test/resources/ProcessAttList.dtd";
		IXMLReader var505 = StdXMLReader.fileReader(var504);
		var501.parseDTD(null, var505, var502, true);
		var501.elementStarted("payment", var504, 1);
		Properties var506 = new Properties();
		var501.elementAttributesProcessed("payment", var506, var504, 1);
		IXMLEntityResolver var507 = new XMLEntityResolver();
		var501.setParameterEntityResolver(var507);
		IXMLReader var509 = StdXMLReader
				.fileReader("src/test/resources/ProcessAttList.dtd");
		var501.processElement(var509, var507);
	}

	/**
	 * Test method for the class net.n3.nanoxml.NonValidator
	 */
	@Test
	public void testNonValidator321() throws Exception {
		NonValidator var501 = new NonValidator();
		IXMLEntityResolver var510 = new XMLEntityResolver();
		var501.setParameterEntityResolver(var510);
		IXMLReader var512 = StdXMLReader
				.fileReader("src/test/resources/example.dtd");
		var501.processEntity(var512, var510);
		IXMLEntityResolver var507 = new XMLEntityResolver();
		var501.setParameterEntityResolver(var507);
		IXMLReader var509 = StdXMLReader
				.fileReader("src/test/resources/ProcessAttList.dtd");
		var501.processElement(var509, var507);
	}

	/**
	 * Test method for the class net.n3.nanoxml.NonValidator
	 */
	@Test
	public void testNonValidator322() throws Exception {
		NonValidator var501 = new NonValidator();
		IXMLEntityResolver var510 = new XMLEntityResolver();
		var501.setParameterEntityResolver(var510);
		IXMLReader var512 = StdXMLReader
				.fileReader("src/test/resources/example.dtd");
		var501.processEntity(var512, var510);
		IXMLEntityResolver var513 = new XMLEntityResolver();
		var501.setParameterEntityResolver(var513);
		IXMLReader var515 = StdXMLReader
				.fileReader("src/test/resources/example.dtd");
		var501.parseDTD(null, var515, var513, true);
	}

	/**
	 * Test method for the class net.n3.nanoxml.NonValidator
	 */
	@Test
	public void testNonValidator323() throws Exception {
		NonValidator var501 = new NonValidator();
		IXMLEntityResolver var516 = new XMLEntityResolver();
		var501.setParameterEntityResolver(var516);
		IXMLReader var518 = StdXMLReader
				.fileReader("src/test/resources/example.dtd");
		var501.processElement(var518, var516);
		IXMLEntityResolver var507 = new XMLEntityResolver();
		var501.setParameterEntityResolver(var507);
		IXMLReader var509 = StdXMLReader
				.fileReader("src/test/resources/ProcessAttList.dtd");
		var501.processElement(var509, var507);
	}

	/**
	 * Test method for the class net.n3.nanoxml.NonValidator
	 */
	@Test
	public void testNonValidator324() throws Exception {
		NonValidator var501 = new NonValidator();
		IXMLEntityResolver var519 = new XMLEntityResolver();
		var501.setParameterEntityResolver(var519);
		IXMLReader var521 = StdXMLReader
				.fileReader("src/test/resources/ProcessPubIDEntity.dtd");
		var501.processEntity(var521, var519);
		IXMLEntityResolver var502 = new XMLEntityResolver();
		var501.setParameterEntityResolver(var502);
		String var504 = "src/test/resources/ProcessAttList.dtd";
		IXMLReader var505 = StdXMLReader.fileReader(var504);
		var501.parseDTD(null, var505, var502, true);
		var501.elementStarted("payment", var504, 1);
		Properties var506 = new Properties();
		var501.elementAttributesProcessed("payment", var506, var504, 1);
	}
}