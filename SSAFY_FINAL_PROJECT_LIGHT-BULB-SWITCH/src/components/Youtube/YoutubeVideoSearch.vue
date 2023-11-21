<template>
  <div>
    <div>유투브 영상 검색</div>
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
            <button @click="search">검색</button>
          </div>
        </div>
      </header>
    </div>
  </div>
</template>

<script setup>
import { ref } from "vue";
import { useYoutubeStore } from "../../stores/youtube";
const keyword = ref("");

const store = useYoutubeStore();

const search = function () {
  store.youtubeSearchSelect(keyword.value);
};
</script>

<style scoped></style>
