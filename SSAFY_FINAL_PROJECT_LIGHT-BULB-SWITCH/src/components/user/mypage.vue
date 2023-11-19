<template>
  <div>
    <!-- <div>
      {{ store.loginUser }}
      <br />
      {{ store.loginUser.workoutList }}
      <br />
      {{ workoutList }}
    </div> -->
    <div class="container d-flex flex-row" style="width: 80%; min-height: auto">
      <div class="shadow rounded m-2 p-2" style="background-color: antiquewhite; width: 40%">
        <div class="d-flex flex-row">
          <div class="m-1 p-1" style="background-color: white">
            <i class="bi bi-person-bounding-box" style="font-size: 5rem"></i>
          </div>
          <div class="d-flex flex-column">
            <div class="m-1 p-1" style="background-color: beige">
              {{ store.loginUser.username }}
            </div>
            <div class="m-1 p-1" style="background-color: azure">{{ store.loginUser.age }}세</div>
            <div class="m-1 p-1" style="background-color: azure">
              {{ store.loginUser.location }}
            </div>
          </div>
        </div>
        <div>
          <div style="font-size: 1.5rem">관심 목록</div>
          <div>
            <button
              v-for="(workout, index) in workoutList"
              @click="store.selectWorkout(workoutList, index)"
              type="button"
              :class="{
                'btn btn-outline-dark': workout[1] % 2 === 0,
                'btn btn-dark': workout[1] % 2 !== 0,
              }"
              style="margin: 2px; padding: 2px"
            >
              {{ workout[0] }}
            </button>
          </div>
          <div @click="changeWorkout">
            <button type="button" class="btn btn-outline-danger">수정</button>
          </div>
        </div>
      </div>
      <div class="shadow rounded m-2 p-2" style="background-color: aqua; width: 60%">
        <div>모임일정 달력</div>
        <div class="schedule" style="background-color: bisque; width: 50%;">
        <div>달력</div>
        <scheduleVue/>
        </div>
      </div>
    </div>
  </div>
</template>

<script setup>
import { ref } from "vue";
import { useUsersStore } from "../../stores/users";
import scheduleVue from "@/components/user/schedule.vue";
const store = useUsersStore();

const workoutList = ref([]);
for (let i = 0; i < store.workout.length; i++) {
  if (store.loginUser.workoutList.includes(store.workout[i])) {
    workoutList.value.push([store.workout[i], true]);
  } else {
    workoutList.value.push([store.workout[i], false]);
  }
}

const changeWorkout = () => {
  const changedWorkoutList = ref([]);
  for (let i = 0; i < workoutList.value.length; i++) {
    if (workoutList.value[i][1] === true) {
      changedWorkoutList.value.push(workoutList.value[i][0]);
    }
  }
  store.loginUser.workoutList = changedWorkoutList;
};
</script>

<style scoped></style>
