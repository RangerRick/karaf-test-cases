package com.example.test.provided.internal;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecutor;

public class ProvidedThing {

	public String getName() {
		final CommandLine commandLine = CommandLine.parse("java -version");
		DefaultExecutor executor = new DefaultExecutor();
		try {
			int exitValue = executor.execute(commandLine);
			return "provided thing, returned " + exitValue;
		} catch (final Exception e) {
			e.printStackTrace();
			return "failed provided thing";
		}
	}

}
