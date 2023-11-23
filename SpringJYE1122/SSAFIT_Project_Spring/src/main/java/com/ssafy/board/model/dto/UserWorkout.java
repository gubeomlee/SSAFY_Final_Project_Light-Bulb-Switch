package com.ssafy.board.model.dto;

public class UserWorkout {
	private int userId;
	private int workoutId;

	public UserWorkout() {
	}

	public UserWorkout(int userId, int workoutId) {
		this.userId = userId;
		this.workoutId = workoutId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getWorkoutId() {
		return workoutId;
	}

	public void setWorkoutId(int workoutId) {
		this.workoutId = workoutId;
	}

	@Override
	public String toString() {
		return "UserWorkouts [userId=" + userId + ", workoutId=" + workoutId + "]";
	}
}
