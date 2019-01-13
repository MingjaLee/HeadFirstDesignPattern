package com.design.mystate;

public class RunningState implements LiftState {
	private LiftMachine liftMachine;

	public RunningState(LiftMachine liftMachine) {
		this.liftMachine = liftMachine;
	}

	public void open() {
		System.out.println("Lift is running, cann't open");
	}

	public void close() {
		System.out.println("Lift already closed");
	}

	public void run() {
		System.out.println("Lift already is running, need not re-running");
	}

	public void stop() {
		System.out.println("Stop Lift");
		liftMachine.setLiftState( liftMachine.getStoppingState() );
	}


	public String toString() {
		return "Current Lift State: running";
	}
}