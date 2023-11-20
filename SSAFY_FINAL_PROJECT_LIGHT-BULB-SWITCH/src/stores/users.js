import { ref, computed } from "vue";
import { defineStore } from "pinia";

export const useUsersStore = defineStore("users", () => {
  const loginStatus = ref(false);
  const loginUser = ref(null);

  const userInfoList = ref([
    {
      userId: "ssafy",
      password: "1234",
      username: "김싸피",
      location: "서울",
      age: 25,
      gender: "M",
      workoutList: ["자전거", "배드민턴"],
    },
  ]);

  const workout = ref([
    "자전거",
    "배드민턴",
    "볼링",
    "테니스",
    "스키/보드",
    "골프",
    "클라이밍",
    "다이어트",
    "헬스",
    "크로스핏",
    "요가",
    "필라테스",
    "탁구",
    "당구",
    "러닝",
    "수영",
    "스쿠버다이빙",
    "서핑",
    "축구/풋살",
    "농구",
    "야구",
    "배구",
    "복싱",
    "태권도",
    "검도",
    "스케이트",
    "족구",
  ]);

  const locationList = ref(["서울", "부산", "대구", "인천", "광주", "대전", "울산", "세종", "경기", "충북", "충남", "전북", "전남", "경북", "경남", "강원", "제주"]);

  const signupFunc = (userId, password, username, location, age, gender, workoutList) => {
    userInfoList.value.push({
      userId,
      password,
      username,
      location,
      age,
      gender,
      workoutList,
    });

    console.log(userInfoList.value[userInfoList.value.length - 1]);
  };

  const loginFunc = (userId, password) => {
    console.log(userId + password);
    console.log(userInfoList.value[0].userId + userInfoList.value[0].password);
    for (let i = 0; i < userInfoList.value.length; i++) {
      if (userInfoList.value[i].userId === userId) {
        if (userInfoList.value[i].password === password) {
          loginStatus.value = true;
          loginUser.value = userInfoList.value[i];
          console.log("로그인 성공");
          return;
        } else {
          console.log("비밀번호가 틀렸습니다.");
          return;
        }
      }
    }
    console.log("존재하자 않는 userId입니다.");
  };

  const logoutFunc = () => {
    loginStatus.value = false;
    loginUser.value = null;
    console.log("로그아웃 성공");
  };

  const selectWorkout = (workoutList, index) => {
    if (workoutList[index][1] == 0) {
      console.log(workoutList[index][0] + " 선택");
    } else {
      console.log(workoutList[index][0] + " 해제");
    }
    workoutList[index][1] = !workoutList[index][1];
  };

  return {
    loginStatus,
    loginUser,
    workout,
    locationList,
    signupFunc,
    loginFunc,
    logoutFunc,
    selectWorkout,
  };
});
