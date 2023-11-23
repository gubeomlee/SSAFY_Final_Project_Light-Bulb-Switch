<template>
  <div>
    <div>
      <div class="container">
        <div class="shadow pt-5 pb-5 m-5 bg-light rounded" style="width: 80%">
          <div style="width: 80%; margin: auto">
            <div class="text-center">
              <h2 class="d-inline mb-3 fs-4 fw-semibold">
                오늘은 어떤 운동을 해볼까?
              </h2>
            </div>
            <hr class="mb-3" />
            <div>
              <div class="m-3">
                <h3 class="d-inline mb-3 fs-4 fw-semibold">
                  {{ title }}
                </h3>
              </div>
              <div class="text-center">
                <YoutubeVideoDetailSelect
                  :videoId="videoId"
                ></YoutubeVideoDetailSelect>
              </div>
              <div class="m-3">
                <button
                  @click="getNewVideo"
                  type="button"
                  class="btn btn-outline-dark"
                >
                  새로운 운동 추천
                </button>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script setup>
import { ref, onMounted, computed } from "vue";
import { useYoutubeStore } from "../../stores/youtube";
import YoutubeVideoDetailSelect from "./YoutubeVideoDetailSelect.vue";
const store = useYoutubeStore();

const videoInfo = ref("test");
const title = ref("임시 제목");
const url = ref("임시 주소");
const videoId = ref("임시 videoId");

// 랜덤 영상 호출
store.youtubeSearchRandom.then(() => {
  videoInfo.value = store.videoRandom;
  title.value = store.videoRandom.snippet.title;
  url.value = store.videoRandom.snippet.thumbnails.default.url;
  console.log(videoInfo.value);
  videoId.value = store.videoRandom.id.videoId;
});

const getNewVideo = () => {
  store.youtubeSearchRandomNotComputed();
  videoInfo.value = store.videoRandom;
  title.value = store.videoRandom.snippet.title;
  url.value = store.videoRandom.snippet.thumbnails.default.url;
  videoId.value = store.videoRandom.id.videoId;
  console.log(title.value);
};
</script>

<style scoped></style>
