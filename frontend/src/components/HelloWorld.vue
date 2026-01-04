<script setup>
import { ref } from 'vue'
import axios from 'axios'

// 列表数据
const posts = ref([])
axios.get('http://localhost:8080/api/posts').then(res => posts.value = res.data)

// 发布表单
const title = ref('')
const coverImg = ref('')
const loading = ref(false)
const msg = ref('')

function submit() {
  if (!title.value || !coverImg.value) {
    msg.value = '标题和封面都不能空'; return
  }
  loading.value = true
  axios.post('http://localhost:8080/api/posts', {
    title: title.value,
    coverImg: coverImg.value
  }).then(res => {
    msg.value = '发布成功！作品ID=' + res.data.data
    // 立刻把新作品追加到列表
    posts.value.unshift({
      id: res.data.data,
      title: title.value,
      coverImg: coverImg.value,
      authorId: 1,
      createTime: new Date().toISOString()
    })
    title.value = ''
    coverImg.value = ''
  }).catch(e => {
    msg.value = '发布失败：' + (e.response?.data?.msg || e.message)
  }).finally(() => loading.value = false)
}
</script>

<template>
  <div>
    <!-- 发布表单 -->
    <h2>发布新作品</h2>
    <form @submit.prevent="submit">
      <div>
        <label>标题：</label><br />
        <input v-model="title" maxlength="120" />
      </div>
      <div>
        <label>封面图 URL：</label><br />
        <input v-model="coverImg" placeholder="https://picsum.photos/seed/xxx/400/300" />
      </div>
      <button :disabled="loading" type="submit">提交</button>
    </form>
    <p style="color: green">{{ msg }}</p>

    <hr />

    <!-- 作品列表 -->
    <h1>传统工艺作品列表</h1>
    <div v-for="p in posts" :key="p.id" style="margin-bottom: 1rem;">
      <img :src="p.coverImg" alt="cover" style="width: 200px; height: 150px; object-fit: cover;" />
      <div>{{ p.title }}</div>
      <small>作者ID: {{ p.authorId }} · {{ new Date(p.createTime).toLocaleString() }}</small>
    </div>
  </div>
</template>