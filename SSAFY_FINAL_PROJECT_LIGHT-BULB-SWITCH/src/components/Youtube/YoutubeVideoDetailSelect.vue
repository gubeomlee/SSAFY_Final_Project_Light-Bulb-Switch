<template>
  <div>
    <iframe
      width="560"
      height="315"
      :src="videoURL"
      title="YouTube video player"
      frameborder="0"
      allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share"
      allowfullscreen
    ></iframe>
  </div>
</template>

<script setup>
import { computed } from "vue";
const props = defineProps({
  videoId: Object,
});
const videoURL = computed(() => {
  return `https://www.youtube.com/embed/${props.videoId}`;
});
</script>

<style scoped></style>
