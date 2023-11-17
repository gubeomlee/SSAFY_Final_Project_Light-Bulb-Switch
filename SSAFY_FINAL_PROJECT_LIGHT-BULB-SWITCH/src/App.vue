<template>
  <div>
    <div>
      <Header></Header>
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
footer {
  position: absolute;
  bottom: 0;
  width: 100%;
  height: 60px;
}
</style>
