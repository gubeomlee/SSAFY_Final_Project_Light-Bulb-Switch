<template>
  <div>
    유투브 랜덤 영상
    <div>
      <!-- {{ store.youtubeSearchRandom() }} -->
      <!-- <div>{{ store.videoRandom }}</div> -->
      <!-- <img :src="store.videoRandom.thumbnails.default.url" /> -->
      <!-- <span>{{ store.videoRandom.title }}</span> -->
    </div>
  </div>
</template>

<script setup>
import { ref } from "vue";
import { useYoutubeStore } from "../../stores/youtube";
const store = useYoutubeStore();
</script>

<style scoped></style>
