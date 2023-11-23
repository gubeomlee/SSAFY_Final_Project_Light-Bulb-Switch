<template>
  <div>
    <div>
      <div class="container">
        <div class="shadow pt-5 pb-5 m-5 bg-light rounded" style="width: 80%">
          <div style="width: 80%; margin: auto">
            <div class="text-center">
              <h2 class="d-inline mb-3 fs-4 fw-semibold">
                {{ route.params.title }}
              </h2>
            </div>
            <hr class="mb-3" />
            <div>
              <div class="text-center">
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
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script setup>
import { useRoute } from "vue-router";
import { computed } from "vue";
const route = useRoute();
const videoURL = computed(() => {
  return `https://www.youtube.com/embed/${route.params.videoId}`;
});
console.log(route.params.title);
console.log(route.params.videoId);
</script>

<style scoped></style>
