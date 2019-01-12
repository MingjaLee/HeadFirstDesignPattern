package com.design.mystate;

public class LiftMachine {
	private LiftState openningState;
	private LiftState closingState;
	private LiftState runningState;
	private LiftState stoppingState;

	private LiftState liftState;

	public LiftMachine() {
		openningState = new OpenningState(this);
		closingState = new ClosingState(this);
		runningState = new RunningState(this);
		stoppingState = new StoppingState(this);

		this.setLiftState( this.getClosingState() );
	}

	public LiftState getLiftState() {
		return this.liftState;
	}

	public void setLiftState(LiftState liftState) {
		this.liftState = liftState;
	}

	// Lift actions
	public void open() {
		liftState.open();
	}

	public void close() {
		liftState.close();
	}

	public void run() {
		liftState.run();
	}

	public void stop() {
		liftState.stop();
	}


	// get the State Object
	public LiftState getOpenningState() {
		return this.openningState;
	}

	public LiftState getClosingState() {
		return this.closingState;
	}

	public LiftState getRunningState() {
		return this.runningState;
	}

	public LiftState getStoppingState() {
		return this.stoppingState;
	}

	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nLift Machine");
		result.append("\n" + liftState);

		return result.toString();
	}

}