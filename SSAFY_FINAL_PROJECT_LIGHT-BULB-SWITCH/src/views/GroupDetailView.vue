<template>
  <div>
    <div>개별 그룹 상세 페이지입니다.</div>
    {{ title }}
  </div>
</template>

<script setup>
import { ref } from "vue";
import { useRoute } from "vue-router";
const route = useRoute();

const title = ref(route.params.title);
</script>

<style scoped></style>
