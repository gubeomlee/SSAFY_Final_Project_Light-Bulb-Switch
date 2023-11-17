<template>
  <div>
    <div class="container">
      <div class="shadow pt-5 pb-5 m-5 bg-light rounded" style="width: 80%">
        <form
          class="reviewform"
          method="post"
          action="main"
          style="width: 80%; margin: auto"
        >
          <input type="hidden" name="act" value="doReviewUpdate" />
          <input type="hidden" name="videoId" value="${videoId }" />
          <input type="hidden" name="url" value="${url }" />
          <input type="hidden" name="reviewId" value="${review.reviewId }" />
          <div class="text-center">
            <h2 class="d-inline mb-3 fs-4 fw-semibold">로그인</h2>
          </div>
          <hr class="mb-3" />

          <div class="mb-3">
            <label for="userId" class="col-form-label">아이디</label>
            <input
              type="text"
              class="form-control"
              id="userId"
              v-model="userId"
            />
          </div>
          <div class="mb-3">
            <label for="password" class="col-form-label">비밀번호</label>
            <input
              type="password"
              class="form-control"
              id="password"
              name="title"
              v-model="password"
              @keyup.enter="login"
            />
          </div>

          <span class="w-20 me-2 btn btn-outline-primary" @click="login">
            로그인
          </span>

          <RouterLink class="w-20 btn btn-outline-danger" :to="{ name: 'home' }"
            >취소</RouterLink
          >
        </form>
      </div>
    </div>
  </div>
</template>

<script setup>
import { RouterView, RouterLink, useRouter } from "vue-router";
import { ref } from "vue";
import { useUsersStore } from "@/stores/users";

const store = useUsersStore();
const userId = ref("");
const password = ref("");
const router = useRouter();

const login = () => {
  store.loginFunc(userId.value, password.value);
  if (store.loginUser !== null) {
    router.push({ name: "home" });
  } else {
    alert("아이디 또는 비밀번호가 일치하지 않습니다.");
  }
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
