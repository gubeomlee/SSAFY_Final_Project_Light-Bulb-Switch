<template>
  <div>
    <header>
      <nav class="py-2 bg-light border-bottom">
        <div class="container d-flex flex-wrap">
          <ul class="nav me-auto">
            <li class="nav-item">
              <router-link
                class="nav-link link-dark px-2 active"
                :to="{ name: 'home' }"
                >Home</router-link
              >
            </li>
            <li class="nav-item">
              <router-link
                class="nav-link link-dark px-2"
                :to="{ name: 'groupCreate' }"
              >
                모임만들기
              </router-link>
            </li>
            <li class="nav-item">
              <router-link
                class="nav-link link-dark px-2"
                :to="{ name: 'groupSearch' }"
              >
                모임찾기
              </router-link>
            </li>
          </ul>
          <ul v-if="!store.loginStatus" class="nav">
            <li class="nav-item">
              <router-link
                class="nav-link link-dark px-2"
                :to="{ name: 'login' }"
                >Login</router-link
              >
            </li>
            <li class="nav-item">
              <router-link
                class="nav-link link-dark px-2"
                :to="{ name: 'signup' }"
                >Sign up</router-link
              >
            </li>
          </ul>
          <ul v-else class="nav">
            <li class="nav-item">
              <router-link
                class="nav-link link-dark px-2"
                :to="{ name: 'home' }"
                @click="logout"
                >Logout</router-link
              >
            </li>
            <li class="nav-item">
              <router-link
                class="nav-link link-dark px-2"
                :to="{ name: 'mypage' }"
                >MyPage</router-link
              >
            </li>
          </ul>
        </div>
      </nav>
    </header>
  </div>
</template>

<script setup>
import { RouterView, RouterLink } from "vue-router";
import { useUsersStore } from "../../stores/users";

const store = useUsersStore();
const logout = () => {
  store.logoutFunc();
};
</script>

<style scoped></style>
