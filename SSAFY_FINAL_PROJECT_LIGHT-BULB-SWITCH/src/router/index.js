import { createRouter, createWebHistory } from "vue-router";
import HomeView from "@/views/HomeView.vue";
import SearchView from "@/views/SearchView.vue";
import LoginView from "@/views/LoginView.vue";
import SigninView from "@/views/SigninView.vue";
import MypageView from "@/views/MypageView.vue";
import GroupCreateView from "@/views/GroupCreateView.vue";

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: "/",
      name: "home",
      component: HomeView,
    },
    {
      path: "/groupCreate",
      name: "groupCreate",
      component: GroupCreateView,
    },
    {
      path: "/search",
      name: "search",
      component: SearchView,
    },
    {
      path: "/login",
      name: "login",
      component: LoginView,
    },
    {
      path: "/signin",
      name: "signin",
      component: SigninView,
    },
    {
      path: "/mypage",
      name: "mypage",
      component: MypageView,
    },
  ],
});

export default router;
