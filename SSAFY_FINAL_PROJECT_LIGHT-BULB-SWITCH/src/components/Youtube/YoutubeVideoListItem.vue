<template>
  <div>
    <div>개별 영상 정보</div>
    <div>
      <li @click="clickVideo">
        <!-- <img :src="video.snippet.thumbnails.default.url" /> -->
        <!-- <span>{{ video.snippet.title }}</span> -->
        {{ video }}
      </li>
    </div>
  </div>
</template>

<script setup>
import { useYoutubeStore } from "../../stores/youtube";
const store = useYoutubeStore();

const props = defineProps({
  video: {
    type: Object,
    required: true,
  },
});

const clickVideo = () => {
  console.log(props.video);
  console.log(props.video.snippet);
  store.clickVideo(props.video);
};
</script>

<style scoped></style>
