<template>
  <div>
    <div>여기는 모임 상세 정보입니다.</div>
    <div>
      {{ group }}
    </div>
  </div>
</template>

<script setup>
const props = defineProps({
  group: Object,
});
</script>

<style scoped></style>
