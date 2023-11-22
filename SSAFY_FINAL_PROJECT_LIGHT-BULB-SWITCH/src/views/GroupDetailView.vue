<template>
  <div>
    <GroupSearchDetail :group="store.groupDetail"></GroupSearchDetail>
  </div>
</template>

<script setup>
import GroupSearchDetail from "../components/Group/GroupSearchDetail.vue";
import { useGroupStore } from "../stores/group";
const store = useGroupStore();
</script>

<style scoped></style>
