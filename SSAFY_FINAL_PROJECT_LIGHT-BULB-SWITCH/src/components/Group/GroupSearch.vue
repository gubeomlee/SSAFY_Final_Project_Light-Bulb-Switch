<template>
  <div>
    <!-- <div>여기는 모임검색 페이지입니다.</div> -->
    <GroupSearchList
      v-for="group in store.groupList"
      :group="group"
    ></GroupSearchList>
  </div>
</template>

<script setup>
import { ref } from "vue";
import { RouterView, RouterLink } from "vue-router";
import { useGroupStore } from "@/stores/group";
import GroupSearchList from "./GroupSearchList.vue";
const store = useGroupStore();
</script>

<style scoped></style>
