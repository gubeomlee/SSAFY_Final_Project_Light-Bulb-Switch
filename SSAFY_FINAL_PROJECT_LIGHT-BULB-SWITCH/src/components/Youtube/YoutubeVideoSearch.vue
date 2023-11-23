<template>
  <div>
    <div>
      <header class="py-3 mb-4 border-bottom">
        <div class="container d-flex flex-wrap justify-content-center">
          <a
            href="/"
            class="d-flex align-items-center mb-3 mb-lg-0 me-lg-auto text-dark text-decoration-none"
          >
            <svg class="bi me-2" width="40" height="32">
              <use xlink:href="#bootstrap"></use>
            </svg>
            <span class="fs-4">운동 검색</span>
          </a>
          <div class="col-12 col-lg-auto mb-3 mb-lg-0">
            <input
              type="text"
              class="form-control"
              placeholder="Search..."
              aria-label="Search"
              v-model="keyword"
              @keyup.enter="search"
            />
            <!-- <button @click="search">검색</button> -->
          </div>
        </div>
      </header>
    </div>
  </div>
</template>

<script setup>
import { ref } from "vue";
import { useYoutubeStore } from "../../stores/youtube";
import { RouterView, RouterLink, useRouter } from "vue-router";
const store = useYoutubeStore();
const router = useRouter();

const keyword = ref(null);

const search = function () {
  if (keyword.value === null) {
    keyword.value = "운동";
  }
  store.youtubeSearchSelect(keyword.value);
  router.push({
    name: "youtubeVideoSearchListView",
    params: { keyword: keyword.value },
  });
};
</script>

<style scoped></style>
