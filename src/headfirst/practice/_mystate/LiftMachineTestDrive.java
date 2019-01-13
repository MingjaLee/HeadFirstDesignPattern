package com.design.mystate;

public class LiftMachineTestDrive {
	public static void main(String[] args) {
		LiftMachine liftMachine = new LiftMachine();
		System.out.println(liftMachine);

		liftMachine.open();
		liftMachine.close();
		liftMachine.run();
		liftMachine.open();
		liftMachine.stop();
		liftMachine.open();

		System.out.println(liftMachine);
	}
}