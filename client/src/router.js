import Vue from 'vue';
import Router from 'vue-router';
import MainPage from './components/MainPage.vue';
import Register from './components/Register.vue';
Vue.use(Router);


const RouterVue = new Router({
  mode: 'history',
  base: process.env.BASE_URL,
  routes: [
    { path: '/', name: 'MainPage', component: MainPage },
    { path: '/register', component: Register },
    // { path: '/Login', component: Login },
    // { path: '/About', component: About },

  ]
});

export default RouterVue;