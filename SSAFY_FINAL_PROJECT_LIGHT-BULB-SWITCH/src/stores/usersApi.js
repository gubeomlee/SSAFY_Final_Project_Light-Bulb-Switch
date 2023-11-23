import { ref, computed } from "vue";
import { defineStore } from "pinia";
import axios from "axios";

const REST_BOARD_API = `http://localhost:8080/ssafit-user`;

export const useUsersApiStore = defineStore("usersApi", () => {
  const userInfoList = ref(null);
  const getBoardList = () => {
    axios.get(REST_BOARD_API + "/users").then((res) => {
      userInfoList.value = res.data;
    });
  };
  return {
    userInfoList,
    getBoardList,
  };
});
