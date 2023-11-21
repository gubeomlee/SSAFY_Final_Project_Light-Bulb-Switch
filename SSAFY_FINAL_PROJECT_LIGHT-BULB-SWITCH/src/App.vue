<template>
  <div>
    <div>
      <header>
        <Header></Header>
      </header>
      <body>
        <router-view></router-view>
      </body>
      <footer>
        <Footer></Footer>
      </footer>
    </div>
  </div>
</template>

<script setup>
import { RouterView, RouterLink } from "vue-router";
import Header from "./components/Header/Header.vue";
import Footer from "./components/Footer/Footer.vue";
</script>

<style scoped>
body {
  min-height: 100vh; /* 뷰포트의 최소 높이를 100%로 설정 */
}
</style>
