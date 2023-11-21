<template>
  <div>
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
