import { ref, computed } from "vue";
import { defineStore } from "pinia";
import axios from "axios";

export const useYoutubeStore = defineStore("youtube", () => {
  const videos = ref([]);
  const videoRandom = ref(null);
  const videoSelect = ref(null);

  const youtubeSearchRandom = () => {
    const randomIndex = Math.floor(Math.random() * 2);
    console.log(randomIndex);
    const URL = "https://www.googleapis.com/youtube/v3/search";
    const API_KEY = import.meta.env.VITE_YOUTUBE_API_KEY;
    axios({
      url: URL,
      method: "GET",
      params: {
        key: API_KEY,
        part: "snippet",
        q: "운동",
        type: "video",
        maxResults: 2,
      },
    })
      .then((response) => {
        videoRandom.value = response.data.items[randomIndex].snippet;
        console.log(videoRandom.value);
      })
      .catch(() => {});
  };

  const youtubeSearchSelect = (keyword) => {
    const URL = "https://www.googleapis.com/youtube/v3/search";
    const API_KEY = import.meta.env.VITE_YOUTUBE_API_KEY;
    axios({
      url: URL,
      method: "GET",
      params: {
        key: API_KEY,
        part: "snippet",
        q: keyword,
        type: "video",
        maxResults: 5,
      },
    })
      .then((response) => {
        videos.value = response.data.items;
        console.log(response);
      })
      .catch(() => {});
    // console.log(videos);
    // console.log(videos.value);
  };

  const clickVideo = function (video) {
    videoSelect.value = video;
    console.log(videoSelect);
  };
  return {
    videos,
    youtubeSearchRandom,
    youtubeSearchSelect,
    clickVideo,
    videoSelect,
    videoRandom,
  };
});
