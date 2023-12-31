import { createRouter, createWebHistory } from "vue-router";
import { useUsersStore } from "@/stores/users";
import { useGroupStore } from "../stores/group";
import GroupCreateView from "@/views/GroupCreateView.vue";
import GroupSearchView from "@/views/GroupSearchView.vue";
import GroupDetailView from "@/views/GroupDetailView.vue";
import HomeView from "@/views/HomeView.vue";
import LoginView from "@/views/LoginView.vue";
import SignupView from "@/views/SignupView.vue";
import MypageView from "@/views/MypageView.vue";
import YoutubeVideoSearchListView from "@/views/YoutubeVideoSearchListView.vue";
import YoutubeVideoSearchListDetailView from "@/views/YoutubeVideoSearchListDetailView.vue";

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
      path: "/groupSearch",
      name: "groupSearch",
      component: GroupSearchView,
    },
    {
      path: "/groupDetailView/:title",
      name: "groupDetailView",
      component: GroupDetailView,
    },
    {
      path: "/login",
      name: "login",
      component: LoginView,
    },
    {
      path: "/signup",
      name: "signup",
      component: SignupView,
    },
    {
      path: "/mypage",
      name: "mypage",
      component: MypageView,
    },
    {
      path: "/youtubeVideoSearchListView/:keyword",
      name: "youtubeVideoSearchListView",
      component: YoutubeVideoSearchListView,
    },
    {
      path: "/youtubeVideoSearchListDetailView/:title/:videoId",
      name: "youtubeVideoSearchListDetailView",
      component: YoutubeVideoSearchListDetailView,
    },
  ],
});

router.beforeEach((to, from, next) => {
  const usersStore = useUsersStore(); // users store 인스턴스 생성

  // users store의 상태 및 함수 사용 예시
  if (to.name === "groupCreate" && !usersStore.loginStatus) {
    alert("로그인이 필요합니다.");
    next({ name: "login" });
  } else {
    next();
  }
});

router.beforeEach((to, from, next) => {
  const groupStore = useGroupStore();

  if (from.name === "groupCreate" && !groupStore.isValidCreat) {
    alert("유효하지 않은 그룹 생성입니다.");
  } else {
    next();
  }
});

router.beforeEach((to, from, next) => {
  const userStore = useUsersStore();

  if (
    from.name === "groupSearch" &&
    to.name === "groupDetailView" &&
    userStore.loginStatus === false
  ) {
    alert("로그인이 필요합니다.");
    next({ name: "login" });
  } else {
    next();
  }
});

export default router;
