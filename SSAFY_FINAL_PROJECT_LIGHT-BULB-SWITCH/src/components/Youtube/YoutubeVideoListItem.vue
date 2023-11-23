<template>
  <div>
    <div class="m-3 bg-body-secondary rounded shadow">
      <div class="d-flex flex-row">
        <img :src="video.snippet.thumbnails.default.url" class="rounded" />
        <div
          class="m-2"
          style="white-space: nowrap; overflow: hidden; text-overflow: ellipsis"
        >
          {{ video.snippet.title }}
        </div>
      </div>
    </div>
  </div>
</template>

<script setup>
const props = defineProps({
  video: Object,
});
</script>

<style scoped></style>
