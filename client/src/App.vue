<template>
  <div id="app">
   <navbar></navbar>
  <router-view />

</div>

</template>

<script>
import Navbar from './components/Navbar.vue';
export default {
  name: 'App',
  components:{
    Navbar

  }

}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #6e6545;
  margin:0;
  padding:0;
  width:100vw;
  height:100vh;
}
</style>
