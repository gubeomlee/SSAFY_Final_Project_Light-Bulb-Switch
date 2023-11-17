<template>
  <div>
    <div>
      {{ store.loginUser }}
    </div>
    <div class="container d-flex flex-row" style="width: 80%; height: 800px">
      <div
        class="shadow rounded m-1 p-2"
        style="background-color: antiquewhite; width: 40%"
      >
        내 정보
      </div>
      <div class="d-flex flex-column" style="width: 60%">
        <div
          class="shadow rounded m-1 p-2"
          style="background-color: aqua; height: 400px"
        >
          모임 일정
        </div>
        <div
          class="shadow rounded m-1 p-2"
          style="background-color: aquamarine; height: 400px"
        >
          모임 참여 기록
        </div>
      </div>
    </div>
  </div>
</template>

<script setup>
import { useUsersStore } from "../../stores/users";
const store = useUsersStore();
console.log(store.loginUser);
</script>

<style scoped></style>
