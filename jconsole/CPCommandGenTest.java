package org.jconsole;


import java.lang.String;
import org.jconsole.JConsole;
import java.lang.System;
import org.junit.*;
import static org.junit.Assert.*;

public class CPCommandGenTest {
	/**
	 * Test method for the class org.jconsole.CPCommand
	 */
	@Test
	public void testCPCommand30() throws Exception {
		CPCommand var38 = new CPCommand();
		JConsole var39 = JConsole.instance();
		String var40 = System.getProperty("user.dir");
		var39.setCurrentDir(var40);
		var38.setConsole(var39);
		String[] var42 = new String[0];
		var38.execute(var42);
		var39.setCurrentDir(var40);
		var38.setConsole(var39);
		String var43 = var40 + "/testResource/testDoc.txt";
		String[] var44 = { var43, "." };
		var38.execute(var44);
	}

	/**
	 * Test method for the class org.jconsole.CPCommand
	 */
	@Test
	public void testCPCommand31() throws Exception {
		CPCommand var38 = new CPCommand();
		JConsole var39 = JConsole.instance();
		String var40 = System.getProperty("user.dir");
		var39.setCurrentDir(var40);
		var38.setConsole(var39);
		String[] var42 = new String[0];
		var38.execute(var42);
		var39.setCurrentDir(var40);
		var38.setConsole(var39);
		String[] var45 = { "*stDoc2.txt", "./testResource" };
		var38.execute(var45);
	}

	/**
	 * Test method for the class org.jconsole.CPCommand
	 */
	@Test
	public void testCPCommand32() throws Exception {
		CPCommand var38 = new CPCommand();
		JConsole var39 = JConsole.instance();
		String var40 = System.getProperty("user.dir");
		var39.setCurrentDir(var40);
		var38.setConsole(var39);
		String var43 = var40 + "/testResource/testDoc.txt";
		String[] var44 = { var43, "." };
		var38.execute(var44);
		var39.setCurrentDir(var40);
		var38.setConsole(var39);
		String[] var42 = new String[0];
		var38.execute(var42);
	}

	/**
	 * Test method for the class org.jconsole.CPCommand
	 */
	@Test
	public void testCPCommand33() throws Exception {
		CPCommand var38 = new CPCommand();
		JConsole var39 = JConsole.instance();
		String var40 = System.getProperty("user.dir");
		var39.setCurrentDir(var40);
		var38.setConsole(var39);
		String[] var45 = { "*stDoc2.txt", "./testResource" };
		var38.execute(var45);
		var39.setCurrentDir(var40);
		var38.setConsole(var39);
		String var43 = var40 + "/testResource/testDoc.txt";
		String[] var44 = { var43, "." };
		var38.execute(var44);
	}

	/**
	 * Test method for the class org.jconsole.CPCommand
	 */
	@Test
	public void testCPCommand34() throws Exception {
		CPCommand var38 = new CPCommand();
		JConsole var39 = JConsole.instance();
		String var40 = System.getProperty("user.dir");
		var39.setCurrentDir(var40);
		var38.setConsole(var39);
		String[] var45 = { "*stDoc2.txt", "./testResource" };
		var38.execute(var45);
		var39.setCurrentDir(var40);
		var38.setConsole(var39);
		var38.execute(var45);
	}
}