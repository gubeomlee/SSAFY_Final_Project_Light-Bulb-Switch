<template>
  <div>
    <div>
      <Header></Header>
      <body>
        <router-view></router-view>
      </body>
    </div>
  </div>
</template>

<script setup>
import { RouterView, RouterLink } from "vue-router";
import Header from "./components/Header/Header.vue";
</script>

<style scoped></style>
