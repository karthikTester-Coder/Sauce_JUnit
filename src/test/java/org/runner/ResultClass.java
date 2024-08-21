package org.runner;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class ResultClass {
	public static void main(String[] args) {
		Result runClasses = JUnitCore.runClasses(TestRunner.class);
		if(runClasses.wasSuccessful()) {
			System.out.println("ALL CLASSES EXECUTED SUCESSFULLY");
			int ignoreCount = runClasses.getIgnoreCount();
			System.out.println("Ignore Count"+ignoreCount);
			int runCount = runClasses.getRunCount();
			System.out.println("Run Count"+runCount);
			long runTime = runClasses.getRunTime();
			System.out.println("Run Time"+runTime);
		}
		else {
			
		}
	}

}
