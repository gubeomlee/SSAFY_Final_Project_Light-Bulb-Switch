<template>
  <div>
    <div>개별 영상 정보</div>
    <div>
      <li @click="clickVideo">
        <img :src="video.snippet.thumbnails.default.url" />
        <span>{{ video.snippet.title }}</span>
      </li>
    </div>
  </div>
</template>

<script setup>
import { ref } from "vue";
import { useYoutubeStore } from "../../stores/youtube";
const store = useYoutubeStore();

const props = defineProps({
  video: Object,
});

const clickVideo = () => {
  snippet.value = props.video.snippet;
  store.clickVideo(props.video);
};
</script>

<style scoped></style>
