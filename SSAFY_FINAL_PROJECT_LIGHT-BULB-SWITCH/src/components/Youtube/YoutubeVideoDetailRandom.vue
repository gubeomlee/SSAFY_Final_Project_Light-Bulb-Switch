<template>
  <div>
    <div>
      <div>{{ title }}</div>
      <img :src="url" />
    </div>
  </div>
</template>

<script setup>
import { ref, onMounted, computed } from "vue";
import { useYoutubeStore } from "../../stores/youtube";
const store = useYoutubeStore();

const videoInfo = ref("test");
const title = ref("title");
const url = ref("url");

// store.youtubeSearchRandom.then(() => {
//   videoInfo.value = store.videoRandom;
//   title.value = store.videoRandom.title;
//   url.value = store.videoRandom.thumbnails.default.url;
// });
</script>

<style scoped></style>
