package com.design.mystate;

public class OpenningState implements LiftState {
	private LiftMachine liftMachine;

	public OpenningState(LiftMachine liftMachine) {
		this.liftMachine = liftMachine;
	}

	public void open() {
		System.out.println("Lift already have openned");
	}

	public void close() {
		System.out.println("close lift...");
		liftMachine.setLiftState(liftMachine.getClosingState());
	}

	public void run() {
		System.out.println("Lift is openning, cann't run now");
	}

	public void stop() {
		System.out.println("Lift is openning and already be stopped, need not re-stop");
	}

	public String toString() {
		return "Current Lift State: opening";
	}
}