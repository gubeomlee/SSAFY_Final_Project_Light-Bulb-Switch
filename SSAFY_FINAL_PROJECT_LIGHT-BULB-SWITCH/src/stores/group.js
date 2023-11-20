import { ref, computed } from "vue";
import { defineStore } from "pinia";

export const useGroupStore = defineStore("group", () => {
  const groupList = ref([
    {
      representative: "김싸피",
      representativeId: 1,
      groupTitle: "모두가 즐거운 자전거모임",
      groupLocation: "서울",
      groupCapacity: 200,
      groupContent: "모두가 즐겁게 라이딩하고, 건강해지자!!!",
      workout: ["자전거"],
    },
    {
      representative: "이백준",
      representativeId: 2,
      groupTitle: "볼링 골프 좋아하는 사람 모여라",
      groupLocation: "부산",
      groupCapacity: 150,
      groupContent: "다음 대회에서는 우리가 우승",
      workout: ["볼링"],
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

  const createGroup = (representative, representativeId, groupTitle, groupLocation, groupCapacity, groupContent, workout) => {
    groupList.value.push({
      representative,
      representativeId,
      groupTitle,
      groupLocation,
      groupCapacity,
      groupContent,
      workout,
    });
  };

  const selectWorkout = (workoutList, index) => {
    if (workoutList[index][1] == 0) {
      console.log(workoutList[index][0] + " 선택");
    } else {
      console.log(workoutList[index][0] + " 해제");
    }
    workoutList[index][1] = !workoutList[index][1];
  };

  return { groupList, workout, locationList, createGroup, selectWorkout };
});
