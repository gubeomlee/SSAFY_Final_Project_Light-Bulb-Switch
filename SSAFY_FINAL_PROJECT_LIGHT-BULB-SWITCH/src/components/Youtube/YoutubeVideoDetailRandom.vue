<template>
  <div>
    유투브 랜덤 영상
    <div>
      <!-- {{ store.youtubeSearchRandom() }} -->
      <div>{{ store.videoRandom }}</div>
      <img :src="store.videoRandom.thumbnails.default.url" />
      <!-- <span>{{ store.videoRandom.title }}</span> -->
    </div>
  </div>
</template>

<script setup>
import { ref, onMounted } from "vue";
import { useYoutubeStore } from "../../stores/youtube";
const store = useYoutubeStore();

store.youtubeSearchRandom().then(() => {
  console.log(store.videoRandom);
});

onMounted(() => {
  console.log(store.videoRandom);
});
</script>

<style scoped></style>
