<template>
  <div>
    <header class="py-3 mb-4 border-bottom">
      <div class="container d-flex flex-wrap justify-content-center">
        <a href="/" class="d-flex align-items-center mb-3 mb-lg-0 me-lg-auto text-dark text-decoration-none">
          <svg class="bi me-2" width="40" height="32">
            <use xlink:href="#bootstrap"></use>
          </svg>
          <span class="fs-4">모임 검색</span>
        </a>
        <form class="col-12 col-lg-auto mb-3 mb-lg-0">
          <input type="search" class="form-control" placeholder="Search..." aria-label="Search" />
        </form>
      </div>
    </header>
  </div>
</template>

<script setup>
import { RouterView, RouterLink } from "vue-router";
</script>

<style scoped></style>
