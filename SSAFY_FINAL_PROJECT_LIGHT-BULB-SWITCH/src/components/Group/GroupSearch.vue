<template>
  <div>
    <div>여기는 모임검색 페이지입니다.</div>
    <GroupSearchDetail
      v-for="group in store.groupList"
      :group="group"
    ></GroupSearchDetail>
  </div>
</template>

<script setup>
import { ref } from "vue";
import { RouterView, RouterLink } from "vue-router";
import GroupSearchDetail from "./GroupSearchDetail.vue";
import { useGroupStore } from "@/stores/group";
const store = useGroupStore();
</script>

<style scoped></style>
