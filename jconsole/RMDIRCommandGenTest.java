package org.jconsole;


import java.lang.String;
import org.jconsole.JConsole;
import java.lang.System;
import org.junit.*;
import static org.junit.Assert.fail;

public class RMDIRCommandGenTest {
	/**
	 * Test method for the class org.jconsole.RMDIRCommand
	 */
	@Test
	public void testRMDIRCommand0() throws Exception {
		RMDIRCommand var0 = new RMDIRCommand();
		JConsole var1 = JConsole.instance();
		String var2 = System.getProperty("user.dir");
		var1.setCurrentDir(var2);
		var0.setConsole(var1);
		String[] var4 = { "RMTest" };
		var0.execute(var4);
		var1.setCurrentDir(var2);
		var0.setConsole(var1);
		var0.execute(var4);
	}

	/**
	 * Test method for the class org.jconsole.RMDIRCommand
	 */
	@Test
	public void testRMDIRCommand1() throws Exception {
		RMDIRCommand var0 = new RMDIRCommand();
		String[] var5 = null;
		var0.execute(var5);
		JConsole var1 = JConsole.instance();
		String var2 = System.getProperty("user.dir");
		var1.setCurrentDir(var2);
		var0.setConsole(var1);
		String[] var7 = { "RMTest" };
		var0.execute(var7);
	}

	/**
	 * Test method for the class org.jconsole.RMDIRCommand
	 */
	@Test
	public void testRMDIRCommand2() throws Exception {
		RMDIRCommand var0 = new RMDIRCommand();
		JConsole var1 = JConsole.instance();
		String var2 = System.getProperty("user.dir");
		var1.setCurrentDir(var2);
		var0.setConsole(var1);
		String[] var4 = { "RMTest" };
		var0.execute(var4);
		String[] var5 = null;
		var0.execute(var5);
	}

	/**
	 * Test method for the class org.jconsole.RMDIRCommand
	 */
	@Test
	public void testRMDIRCommand3() throws Exception {
		RMDIRCommand var0 = new RMDIRCommand();
		JConsole var1 = JConsole.instance();
		String var2 = System.getProperty("user.dir");
		var1.setCurrentDir(var2);
		var0.setConsole(var1);
		String[] var7 = { "RMTest" };
		var0.execute(var7);
		String[] var5 = null;
		var0.execute(var5);
	}

	/**
	 * Test method for the class org.jconsole.RMDIRCommand
	 */
	@Test
	public void testRMDIRCommand4() throws Exception {
		RMDIRCommand var0 = new RMDIRCommand();
		JConsole var1 = JConsole.instance();
		String var2 = System.getProperty("user.dir");
		var1.setCurrentDir(var2);
		var0.setConsole(var1);
		String[] var4 = { "RMTest" };
		var0.execute(var4);
		var1.setCurrentDir(var2);
		var0.setConsole(var1);
		String[] var7 = { "RMTest" };
		var0.execute(var7);
	}
}