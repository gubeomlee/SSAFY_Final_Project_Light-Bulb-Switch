<template>
  <div>
    <!-- <SearchBar></SearchBar> -->
    <YoutubeVideoSearch></YoutubeVideoSearch>
    <div>
      <Home></Home>
      <YoutubeVideoDetailRandom></YoutubeVideoDetailRandom>
    </div>
  </div>
</template>

<script setup>
import Home from "../components/Main/Home.vue";
import YoutubeVideoSearch from "../components/Youtube/YoutubeVideoSearch.vue";
import YoutubeVideoDetailRandom from "../components/Youtube/YoutubeVideoDetailRandom.vue";
</script>

<style scoped></style>
