package com.scp.selenium.seleniumBatchSeven;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class DesktopAutomation {

	
	public static void main(String[] args) throws FindFailed, InterruptedException {
		Screen screen = new Screen();
		Thread.sleep(2000);
		Pattern p1 =  new Pattern("C:\\Users\\Yogesh\\Desktop\\Demosss\\1.PNG");
		Pattern p2 =  new Pattern("C:\\Users\\Yogesh\\Desktop\\Demosss\\2.PNG");
		Pattern p3 =  new Pattern("C:\\Users\\Yogesh\\Desktop\\Demosss\\3.PNG");
		Pattern p4 =  new Pattern("C:\\Users\\Yogesh\\Desktop\\Demosss\\4.PNG");
		screen.doubleClick(p1);
		Thread.sleep(100);
		screen.doubleClick(p2);
		Thread.sleep(100);
		screen.doubleClick(p3);
		Thread.sleep(100);
		screen.doubleClick(p4);
		
	}
}
