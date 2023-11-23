package com.ssafy.board.model.dto;

public class Workout {
	private int id;
	private String workout;

	public Workout() {
	}

	public Workout(String workout) {
		this.workout = workout;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getWorkout() {
		return workout;
	}

	public void setWorkout(String workout) {
		this.workout = workout;
	}

	@Override
	public String toString() {
		return "Workouts [id=" + id + ", workout=" + workout + "]";
	}
}
