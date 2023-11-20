<template>
  <div>
    <div class="container">
      <div class="shadow pt-5 pb-5 m-5 bg-light rounded" style="width: 80%">
        <form class="signupform" method="post" action="main" style="width: 80%; margin: auto">
          <div class="text-center">
            <h2 class="d-inline mb-3 fs-4 fw-semibold">모임 만들기</h2>
          </div>
          <hr class="mb-3" />
          <div>
            <div>모임대표: {{ representative }}</div>
          </div>
          <div class="mb-3">
            <label for="groupTitle" class="col-form-label">모임이름</label>
            <input type="text" class="form-control" id="groupTitle" v-model="groupTitle" />
          </div>
          <div class="mb-3">
            <label for="groupLocation" class="col-form-label">모임장소</label>
            <select id="groupLocation" v-model="groupLocation">
              <option value="">선택</option>
              <option v-for="loc in store.locationList" :value="loc">
                {{ loc }}
              </option>
            </select>
          </div>
          <div class="mb-3">
            <label for="groupCapacity" class="col-form-label">정원(30명 ~ 300명)</label>
            <input type="number" class="form-control" id="groupCapacity" v-model="groupCapacity" />
          </div>
          <div class="mb-3">
            <label for="groupContent" class="col-form-label">모임목표</label>
            <input type="text" class="form-control" id="groupContent" v-model="groupContent" />
          </div>
          <div>
            <div>관심사항</div>
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
            <RouterLink class="w-20 me-2 btn btn-outline-primary" @click="createGroup" :to="{ name: 'groupSearch' }" style="padding: 2px">모임생성</RouterLink>
            <RouterLink class="w-20 btn btn-outline-danger" :to="{ name: 'home' }" style="padding: 2px">취소</RouterLink>
          </div>
        </form>
      </div>
    </div>
  </div>
</template>

<script setup>
import { ref } from "vue";
import { RouterView, RouterLink } from "vue-router";
import { useGroupStore } from "@/stores/group";
import { useUsersStore } from "../../stores/users";
const store = useGroupStore();
const userStore = useUsersStore();

const representative = ref(userStore.loginUser.username);
const representativeId = ref(userStore.loginUser.userId);
const groupTitle = ref("");
const groupLocation = ref("");
const groupCapacity = ref(30);
const groupContent = ref("");
const workoutList = ref([]);
for (let i = 0; i < store.workout.length; i++) {
  workoutList.value.push([store.workout[i], false]);
}

const workoutListCreateGroup = ref([]);
const createGroup = () => {
  for (let i = 0; i < workoutList.value.length; i++) {
    if (workoutList.value[i][1] === true) {
      workoutListCreateGroup.value.push(workoutList.value[i][0]);
    }
  }

  store.createGroup(representative, representativeId, groupTitle, groupLocation, groupCapacity, groupContent, workoutListCreateGroup);
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
