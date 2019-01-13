package com.design.mystate;

public class StoppingState implements LiftState {
	private LiftMachine liftMachine;

	public StoppingState(LiftMachine liftMachine) {
		this.liftMachine = liftMachine;
	}

	public void open() {
		System.out.println("open the lift");
		liftMachine.setLiftState( liftMachine.getOpenningState() );
	}

	public void close() {
		System.out.println("Lift already is closed, need not re-close");
	}

	public void run() {
		System.out.println("start running...");
		liftMachine.setLiftState( liftMachine.getRunningState() );
	}

	public void stop() {
		System.out.println("Lift already stoped, need not re-stop");
	}


	public String toString() {
		return "Current Lift State: stopping";
	}
}