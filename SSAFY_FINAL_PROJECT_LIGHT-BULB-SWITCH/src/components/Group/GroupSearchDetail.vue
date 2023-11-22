<template>
  <div>
    <!-- <div>
      {{ group }}
    </div> -->
    <div>
      <div class="container">
        <div class="shadow pt-5 pb-5 m-5 bg-light rounded" style="width: 80%">
          <div style="width: 80%; margin: auto">
            <div class="text-center">
              <h2 class="d-inline mb-3 fs-4 fw-semibold">
                {{ group.groupTitle }}
              </h2>
            </div>
            <hr class="mb-3" />
            <div>
              {{ group.groupLocation }} | {{ group.groupLocationDetail }} | 멤버
              {{ group.groupCapacity }}
            </div>
            <div>{{ group.groupContent }}</div>
            <div>
              <div v-if="!groupStore.joinStatus">
                <button
                  type="button"
                  class="btn btn-dark m-1"
                  @click="joinGroup"
                >
                  가입
                </button>
              </div>
              <div v-else>
                <button
                  type="button"
                  class="btn btn-dark m-1"
                  @click="leaveGroup"
                >
                  탈퇴
                </button>
              </div>
            </div>
            <hr class="mb-3" />
            <div>
              <div>멤버</div>
              <div>
                <GroupMember
                  v-for="user in group.groupMember"
                  :key="user.id"
                  :user="user"
                ></GroupMember>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script setup>
import { ref, onMounted } from "vue";
import { useGroupStore } from "../../stores/group";
import { useUsersStore } from "../../stores/users";
import GroupMember from "./GroupMember.vue";
const groupStore = useGroupStore();
const userStore = useUsersStore();

const props = defineProps({
  group: Object,
});

const joinGroup = () => {
  // console.log(userStore.loginUser);
  // console.log(userStore.loginUser.id);
  // console.log(userStore.loginUser.username);
  // console.log(props.group.id);
  groupStore.joinGroup(
    props.group.id,
    userStore.loginUser.id,
    userStore.loginUser.username
  );
  groupStore.joinStatusFunc(props.group.id, userStore.loginUser.id);
  console.log(groupStore.joinStatus);
};

const leaveGroup = () => {
  groupStore.leaveGroup(props.group.id, userStore.loginUser.id);
  groupStore.joinStatusFunc(props.group.id, userStore.loginUser.id);
  console.log(groupStore.joinStatus);
};

groupStore.joinStatusFunc(props.group.id, userStore.loginUser.id);
console.log(groupStore.joinStatus);
</script>

<style scoped></style>
