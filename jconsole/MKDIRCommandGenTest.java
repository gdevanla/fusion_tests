package org.jconsole;


import java.lang.String;
import org.jconsole.JConsole;
import java.lang.System;
import org.junit.*;
import static org.junit.Assert.*;

public class MKDIRCommandGenTest {
	/**
	 * Test method for the class org.jconsole.MKDIRCommand
	 */
	@Test
	public void testMKDIRCommand20() throws Exception {
		MKDIRCommand var27 = new MKDIRCommand();
		JConsole var28 = JConsole.instance();
		String var29 = System.getProperty("user.dir");
		var28.setCurrentDir(var29);
		var27.setConsole(var28);
		String[] var31 = { "testResource2" };
		var27.execute(var31);
		var28.setCurrentDir(var29);
		var27.setConsole(var28);
		String[] var32 = null;
		var27.execute(var32);
	}

	/**
	 * Test method for the class org.jconsole.MKDIRCommand
	 */
	@Test
	public void testMKDIRCommand21() throws Exception {
		MKDIRCommand var27 = new MKDIRCommand();
		JConsole var28 = JConsole.instance();
		String var29 = System.getProperty("user.dir");
		var28.setCurrentDir(var29);
		var27.setConsole(var28);
		String[] var32 = null;
		var27.execute(var32);
		var28.setCurrentDir(var29);
		var27.setConsole(var28);
		String[] var31 = { "testResource2" };
		var27.execute(var31);
	}

	/**
	 * Test method for the class org.jconsole.MKDIRCommand
	 */
	@Test
	public void testMKDIRCommand22() throws Exception {
		MKDIRCommand var27 = new MKDIRCommand();
		JConsole var28 = JConsole.instance();
		String var29 = System.getProperty("user.dir");
		var28.setCurrentDir(var29);
		var27.setConsole(var28);
		String[] var31 = { "testResource2" };
		var27.execute(var31);
		var28.setCurrentDir(var29);
		var27.setConsole(var28);
		String[] var32 = null;
		var27.execute(var32);
	}

	/**
	 * Test method for the class org.jconsole.MKDIRCommand
	 */
	@Test
	public void testMKDIRCommand23() throws Exception {
		MKDIRCommand var27 = new MKDIRCommand();
		JConsole var28 = JConsole.instance();
		String var29 = System.getProperty("user.dir");
		var28.setCurrentDir(var29);
		var27.setConsole(var28);
		String[] var32 = null;
		var27.execute(var32);
		var28.setCurrentDir(var29);
		var27.setConsole(var28);
		var27.execute(var32);
	}

	/**
	 * Test method for the class org.jconsole.MKDIRCommand
	 */
	@Test
	public void testMKDIRCommand24() throws Exception {
		MKDIRCommand var27 = new MKDIRCommand();
		JConsole var28 = JConsole.instance();
		String var29 = System.getProperty("user.dir");
		var28.setCurrentDir(var29);
		var27.setConsole(var28);
		String[] var32 = null;
		var27.execute(var32);
		var28.setCurrentDir(var29);
		var27.setConsole(var28);
		var27.execute(var32);
	}
}