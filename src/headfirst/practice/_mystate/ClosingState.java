package com.design.mystate;

public class ClosingState implements LiftState {
	private LiftMachine liftMachine;

	public ClosingState(LiftMachine liftMachine) {
		this.liftMachine = liftMachine;
	}

	public void open() {
		System.out.println("Openning the Lift");
		liftMachine.setLiftState( liftMachine.getOpenningState() );
	}

	public void close() {
		System.out.println("Lift is already closed, need not re-close");
	}

	public void run() {
		System.out.println("start running...");
		liftMachine.setLiftState( liftMachine.getRunningState() );
	}

	public void stop() {
		System.out.println("stop Lift");
		liftMachine.setLiftState( liftMachine.getStoppingState() );
	}


	public String toString() {
		return "Current Lift State: closing";
	}
}