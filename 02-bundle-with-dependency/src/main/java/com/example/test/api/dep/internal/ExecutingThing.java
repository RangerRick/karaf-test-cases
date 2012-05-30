package com.example.test.api.dep.internal;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecutor;

import com.example.test.api.dep.Thing;

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
