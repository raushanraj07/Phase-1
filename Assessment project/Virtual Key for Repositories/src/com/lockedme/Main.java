package com.lockedme;

import handle.Handle;
import operation.Operations;
import option.Options;

public class Main {

	public static void main(String[] args) {
		
		
		Operations.createMainFolderIfNotPresent("main");
		
		Options.printWelcomeScreen("Main", "Raushan raj");
		
		Handle.handleWelcomeScreenInput();
	}

}
