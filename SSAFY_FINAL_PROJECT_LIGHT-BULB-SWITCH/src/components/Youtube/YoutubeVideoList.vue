<template>
  <div>
    <div>영상 리스트</div>
    <div>
      <YoutubeVideoListItem
        v-for="video in store.videos"
        :key="video.id.videoId"
        :video="video"
      ></YoutubeVideoListItem>
    </div>
  </div>
</template>

<script setup>
import { useYoutubeStore } from "../../stores/youtube";
import YoutubeVideoListItem from "./YoutubeVideoListItem.vue";

const store = useYoutubeStore();
</script>

<style scoped></style>
