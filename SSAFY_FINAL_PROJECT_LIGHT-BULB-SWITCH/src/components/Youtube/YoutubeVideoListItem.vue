<template>
  <div>
    <router-link
      :to="{
        name: 'youtubeVideoSearchListDetailView',
        params: { videoId: video.id.videoId, title: video.snippet.title },
      }"
    >
      <div class="m-3 bg-body-secondary rounded shadow">
        <div class="d-flex flex-row">
          <img :src="video.snippet.thumbnails.default.url" class="rounded" />
          <div
            class="m-2"
            style="
              white-space: nowrap;
              overflow: hidden;
              text-overflow: ellipsis;
            "
          >
            {{ video.snippet.title }}
          </div>
        </div>
      </div>
    </router-link>
  </div>
</template>

<script setup>
import { RouterView, RouterLink, useRouter } from "vue-router";

const props = defineProps({
  video: Object,
});

console.log(props.video.snippet.title);
</script>

<style scoped>
a {
  text-decoration: none !important;
  color: black;
}
</style>
