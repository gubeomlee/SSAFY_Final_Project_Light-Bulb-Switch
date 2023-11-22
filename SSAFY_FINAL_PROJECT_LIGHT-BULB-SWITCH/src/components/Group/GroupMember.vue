<template>
  <div>
    <div class="d-flex flex-row">
      <div>
        <i class="bi bi-person-bounding-box"></i>
      </div>
      <div class="ms-2">{{ user.username }}</div>
    </div>
  </div>
</template>

<script setup>
const props = defineProps({
  user: Object,
});
</script>

<style scoped></style>
