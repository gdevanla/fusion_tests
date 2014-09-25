package org.jconsole;

import java.io.File;
import java.lang.String;
import org.jconsole.JConsole;
import java.lang.System;
import org.junit.*;
import static org.junit.Assert.*;

public class CDCommandGenTest {
	/**
	 * Test method for the class org.jconsole.CDCommand
	 */
	@Test
	public void testCDCommand15() throws Exception {
		CDCommand var18 = new CDCommand();
		JConsole var19 = JConsole.instance();
		String var20 = System.getProperty("user.dir");
		var19.setCurrentDir(var20);
		var18.setConsole(var19);
		String[] var22 = { ".." };
		var18.execute(var22);
		var18.getCurrentDir();
		var19.setCurrentDir(var20);
		var18.setConsole(var19);
		String[] var23 = { "" };
		var18.execute(var23);
		var18.getCurrentDir();
	}

	/**
	 * Test method for the class org.jconsole.CDCommand
	 */
	@Test
	public void testCDCommand16() throws Exception {
		CDCommand var18 = new CDCommand();
		JConsole var19 = JConsole.instance();
		String var20 = System.getProperty("user.dir");
		var19.setCurrentDir(var20);
		var18.setConsole(var19);
		String[] var24 = { "psedo" };
		var18.execute(var24);
		var18.getCurrentDir();
		var19.setCurrentDir(var20);
		var18.setConsole(var19);
		String[] var25 = { "src" };
		var18.execute(var25);
		var18.getCurrentDir();
	}

	/**
	 * Test method for the class org.jconsole.CDCommand
	 */
	@Test
	public void testCDCommand17() throws Exception {
		CDCommand var18 = new CDCommand();
		JConsole var19 = JConsole.instance();
		String var20 = System.getProperty("user.dir");
		var19.setCurrentDir(var20);
		var18.setConsole(var19);
		String[] var25 = { "src" };
		var18.execute(var25);
		var18.getCurrentDir();
		var19.setCurrentDir(var20);
		var18.setConsole(var19);
		String[] var26 = { "." };
		var18.execute(var26);
		var18.getCurrentDir();
	}

	/**
	 * Test method for the class org.jconsole.CDCommand
	 */
	@Test
	public void testCDCommand18() throws Exception {
		CDCommand var18 = new CDCommand();
		JConsole var19 = JConsole.instance();
		String var20 = System.getProperty("user.dir");
		var19.setCurrentDir(var20);
		var18.setConsole(var19);
		String[] var22 = { ".." };
		var18.execute(var22);
		var18.getCurrentDir();
		var19.setCurrentDir(var20);
		var18.setConsole(var19);
		String[] var24 = { "psedo" };
		var18.execute(var24);
		var18.getCurrentDir();
	}

	/**
	 * Test method for the class org.jconsole.CDCommand
	 */
	@Test
	public void testCDCommand19() throws Exception {
		CDCommand var18 = new CDCommand();
		JConsole var19 = JConsole.instance();
		String var20 = System.getProperty("user.dir");
		var19.setCurrentDir(var20);
		var18.setConsole(var19);
		String[] var22 = { ".." };
		var18.execute(var22);
		var18.getCurrentDir();
		var19.setCurrentDir(var20);
		var18.setConsole(var19);
		String[] var23 = { "" };
		var18.execute(var23);
		var18.getCurrentDir();
	}
}