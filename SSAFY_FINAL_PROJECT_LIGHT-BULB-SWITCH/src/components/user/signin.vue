<template>
  <div>
    <div class="container">
      <div class="shadow pt-5 pb-5 m-5 bg-light rounded" style="width: 80%">
        <form class="signinform" method="post" action="main" style="width: 80%; margin: auto">
          <div class="text-center">
            <h2 class="d-inline mb-3 fs-4 fw-semibold">회원가입</h2>
          </div>
          <hr class="mb-3" />

          <div class="mb-3">
            <label for="userId" class="col-form-label">아이디</label>
            <input type="text" class="form-control" id="userId" v-model="userId" />
          </div>
          <div class="mb-3">
            <label for="password" class="col-form-label">비밀번호</label>
            <input type="password" class="form-control" id="password" v-model="password" />
          </div>
          <div class="mb-3">
            <label for="username" class="col-form-label">이름</label>
            <input type="text" class="form-control" id="username" v-model="username" />
          </div>
          <div class="mb-3">
            <label for="location" class="col-form-label">지역</label>
            <select id="location" v-model="location">
              <option value="">선택</option>
              <option v-for="loc in store.locationList" :value="loc">
                {{ loc }}
              </option>
            </select>
          </div>
          <div class="mb-3">
            <label for="age" class="col-form-label">나이</label>
            <input type="number" class="form-control" id="age" v-model="age" />
          </div>
          <div class="mb-3">
            <label for="gender" class="col-form-label">성별</label>
            <select id="gender" v-model="gender">
              <option value="">선택</option>
              <option value="M">남성</option>
              <option calue="F">여성</option>
            </select>
          </div>
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
          <div style="margin-top: 4px">
            <RouterLink class="w-20 me-2 btn btn-outline-primary" @click="signin" :to="{ name: 'login' }" style="padding: 2px">회원가입</RouterLink>
            <RouterLink class="w-20 btn btn-outline-danger" :to="{ name: 'home' }" style="padding: 2px">취소</RouterLink>
          </div>
        </form>
      </div>
    </div>
  </div>
</template>

<script setup>
import { RouterView, RouterLink } from "vue-router";
import { ref } from "vue";
import { useUsersStore } from "@/stores/users";
const store = useUsersStore();

const userId = ref("");
const password = ref("");
const username = ref("");
const location = ref("");
const age = ref(null);
const gender = ref("");
const workoutList = ref([]);
for (let i = 0; i < store.workout.length; i++) {
  workoutList.value.push([store.workout[i], false]);
}

const signinWorkout = ref([]);
const signin = () => {
  for (let i = 0; i < workoutList.value.length; i++) {
    if (workoutList.value[i][1] === true) {
      signinWorkout.value.push(workoutList.value[i][0]);
    }
  }

  store.signinFunc(userId.value, password.value, username.value, location.value, age.value, gender.value, signinWorkout.value);
};
</script>

<style scoped>
* {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
  list-style: none;
}

a {
  text-decoration: none !important;
}

.container {
  display: flex;
  justify-content: center;
  flex-direction: column;
  align-items: center;
  left: 0;
  right: 0;
  margin: auto;
  margin-top: 100px;
  margin-bottom: 200px;
  width: 1400px;
}

.container-fluid {
  padding: 0 20px 0 20px !important;
}

#page-name {
  font-weight: bold;
  font-size: 2rem;
}

.main-image {
  width: 100%;
  height: 200px;
}

.search-box {
  width: 100%;
  padding: 10px;
}

input {
  width: 100%;
}

.video-list img {
  width: 100%;
  height: 200px;
  object-fit: cover;
}

.video-box {
  width: 100%;
}
</style>
