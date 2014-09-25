package org.jconsole;


import java.lang.String;
import org.jconsole.JConsole;
import java.lang.System;
import org.junit.*;
import static org.junit.Assert.*;

public class PWDCommandGenTest {
	/**
	 * Test method for the class org.jconsole.PWDCommand
	 */
	@Test
	public void testPWDCommand10() throws Exception {
		PWDCommand var13 = new PWDCommand();
		JConsole var14 = JConsole.instance();
		String var15 = System.getProperty("user.dir");
		var14.setCurrentDir(var15);
		var13.setConsole(var14);
		String[] var17 = null;
		var13.execute(var17);
		var14.setCurrentDir(var15);
		var13.setConsole(var14);
		var13.execute(var17);
	}

	/**
	 * Test method for the class org.jconsole.PWDCommand
	 */
	@Test
	public void testPWDCommand11() throws Exception {
		PWDCommand var13 = new PWDCommand();
		JConsole var14 = JConsole.instance();
		String var15 = System.getProperty("user.dir");
		var14.setCurrentDir(var15);
		var13.setConsole(var14);
		String[] var17 = null;
		var13.execute(var17);
		var14.setCurrentDir(var15);
		var13.setConsole(var14);
		var13.execute(var17);
	}

	/**
	 * Test method for the class org.jconsole.PWDCommand
	 */
	@Test
	public void testPWDCommand12() throws Exception {
		PWDCommand var13 = new PWDCommand();
		JConsole var14 = JConsole.instance();
		String var15 = System.getProperty("user.dir");
		var14.setCurrentDir(var15);
		var13.setConsole(var14);
		String[] var17 = null;
		var13.execute(var17);
		var14.setCurrentDir(var15);
		var13.setConsole(var14);
		var13.execute(var17);
	}

	/**
	 * Test method for the class org.jconsole.PWDCommand
	 */
	@Test
	public void testPWDCommand13() throws Exception {
		PWDCommand var13 = new PWDCommand();
		JConsole var14 = JConsole.instance();
		String var15 = System.getProperty("user.dir");
		var14.setCurrentDir(var15);
		var13.setConsole(var14);
		String[] var17 = null;
		var13.execute(var17);
		var14.setCurrentDir(var15);
		var13.setConsole(var14);
		var13.execute(var17);
	}

	/**
	 * Test method for the class org.jconsole.PWDCommand
	 */
	@Test
	public void testPWDCommand14() throws Exception {
		PWDCommand var13 = new PWDCommand();
		JConsole var14 = JConsole.instance();
		String var15 = System.getProperty("user.dir");
		var14.setCurrentDir(var15);
		var13.setConsole(var14);
		String[] var17 = null;
		var13.execute(var17);
		var14.setCurrentDir(var15);
		var13.setConsole(var14);
		var13.execute(var17);
	}
}