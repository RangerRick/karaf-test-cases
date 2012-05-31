package com.example.test.execthing.internal;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecutor;

import com.example.test.api.Thing;

public class ExecutingThing implements Thing {

	@Override
	public String getName() {
		final CommandLine commandLine = CommandLine.parse("java -version");
		DefaultExecutor executor = new DefaultExecutor();
		try {
			int exitValue = executor.execute(commandLine);
			return "executed thing, returned " + exitValue;
		} catch (final Exception e) {
			e.printStackTrace();
			return "failed executing thing";
		}
	}

}
