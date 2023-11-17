import { createRouter, createWebHistory } from "vue-router";
// import login from "@/components/user/login.vue";
// import signin from "@/components/user/signin.vue";
// import mypage from "@/components/user/mypage.vue";
import loginView from "@/views/loginView.vue";
import signinView from "@/views/signinView.vue";
import mypageView from "@/views/mypageView.vue";
import homeView from "@/views/homeView.vue";

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: "/",
      name: "home",
      component: homeView,
    },
    {
      path: "/login",
      name: "login",
      component: loginView,
    },
    {
      path: "/signin",
      name: "signin",
      component: signinView,
    },
    {
      path: "/mypage",
      name: "mypage",
      component: mypageView,
    },
  ],
});

export default router;
