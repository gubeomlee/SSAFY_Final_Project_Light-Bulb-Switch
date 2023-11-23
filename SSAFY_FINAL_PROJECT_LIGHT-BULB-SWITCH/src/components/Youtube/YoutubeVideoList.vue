<template>
  <div>
    <div>
      <div class="container">
        <div class="shadow pt-5 pb-5 m-5 bg-light rounded" style="width: 80%">
          <div style="width: 80%; margin: auto">
            <div class="text-center">
              <h2 class="d-inline mb-3 fs-4 fw-semibold">
                검색결과: {{ route.params.keyword }}
              </h2>
            </div>
            <hr class="mb-3" />
            <YoutubeVideoListItem
              v-for="video in store.videos"
              :key="video.id.videoId"
              :video="video"
            ></YoutubeVideoListItem>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script setup>
import { useRoute } from "vue-router";
import { useYoutubeStore } from "../../stores/youtube";
import YoutubeVideoListItem from "./YoutubeVideoListItem.vue";
const store = useYoutubeStore();
const route = useRoute();

console.log(store.videos);
</script>

<style scoped></style>
