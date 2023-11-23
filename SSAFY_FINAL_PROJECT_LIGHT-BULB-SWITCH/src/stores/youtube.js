import { ref, computed } from "vue";
import { defineStore } from "pinia";
import axios from "axios";

export const useYoutubeStore = defineStore("youtube", () => {
  const videos = ref([]);
  const videoRandom = ref(null);
  const videoSelect = ref(null);

  const youtubeSearchRandom = computed(async () => {
    const randomIndex = Math.floor(Math.random() * 20);
    console.log(randomIndex);
    const URL = "https://www.googleapis.com/youtube/v3/search";
    const API_KEY = import.meta.env.VITE_YOUTUBE_API_KEY;
    try {
      const response = await axios({
        url: URL,
        method: "GET",
        params: {
          key: API_KEY,
          part: "snippet",
          q: "운동",
          type: "video",
          maxResults: 20,
        },
      });
      videoRandom.value = response.data.items[randomIndex];
    } catch {}
  });

  const youtubeSearchRandomNotComputed = () => {
    const randomIndex = Math.floor(Math.random() * 20);
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
        maxResults: 20,
      },
    })
      .then((response) => {
        videoRandom.value = response.data.items[randomIndex];
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
        maxResults: 10,
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
    youtubeSearchRandomNotComputed,
    youtubeSearchSelect,
    clickVideo,
    videoSelect,
    videoRandom,
  };
});
