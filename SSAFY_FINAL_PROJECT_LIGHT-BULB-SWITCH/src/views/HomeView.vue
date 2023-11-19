<template>
  <div>
    <!-- <SearchBar></SearchBar> -->
    <YoutubeVideoSearch></YoutubeVideoSearch>
    <Home></Home>
    <YoutubeVideoList></YoutubeVideoList>
    <YoutubeVideoListItem></YoutubeVideoListItem>
    <YoutubeVideoDetail></YoutubeVideoDetail>
  </div>
</template>

<script setup>
import SearchBar from "../components/Header/SearchBar.vue";
import Home from "../components/Main/Home.vue";
import YoutubeVideoDetail from "../components/Youtube/YoutubeVideoDetail.vue";
import YoutubeVideoListItem from "../components/Youtube/YoutubeVideoListItem.vue";
import YoutubeVideoList from "../components/Youtube/YoutubeVideoList.vue";
import YoutubeVideoSearch from "../components/Youtube/YoutubeVideoSearch.vue";
</script>

<style scoped></style>
