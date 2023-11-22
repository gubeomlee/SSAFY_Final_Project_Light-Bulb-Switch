<template>
  <div>
    <div>
      <router-link
        :to="{
          name: 'groupDetailView',
          params: { title: group.groupTitle },
        }"
      >
        <div
          @click="getGroupDetail"
          class="container d-flex flex-row"
          style="width: 70%"
        >
          <div class="shadow rounded m-2 p-2 bg-light" style="width: 20%">
            <i class="bi bi-bookmarks" style="font-size: 100%"></i>
          </div>
          <div
            class="shadow rounded m-2 p-2 bg-light"
            style="max-width: 80%; min-width: 80%"
          >
            <div>{{ group.groupTitle }}</div>
            <div
              style="
                white-space: nowrap;
                overflow: hidden;
                text-overflow: ellipsis;
              "
            >
              {{ group.groupContent }}
            </div>
            <div>
              {{ group.groupLocation }} | {{ group.groupLocationDetail }} |
              멤버: {{ group.groupMember.length }} /
              {{ group.groupCapacity }}
            </div>
          </div>
        </div></router-link
      >
    </div>
  </div>
</template>

<script setup>
import { ref } from "vue";
import { RouterLink } from "vue-router";
import { useGroupStore } from "../../stores/group";
const store = useGroupStore();

const props = defineProps({
  group: Object,
});

const getGroupDetail = () => {
  console.log(props.group);
  store.getGroupDetail(props.group);
};
</script>

<style scoped>
a {
  text-decoration: none !important;
  color: black;
}
</style>
