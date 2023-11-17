<template>
  <div>
    <div>
      {{ store.loginUser }}
    </div>
  </div>
</template>

<script setup>
import { useUsersStore } from "../../stores/users";
const store = useUsersStore();
console.log(store.loginUser);
</script>

<style scoped></style>
