import Vue from 'vue'
import App from './App.vue'
import router from './router.js'
import BootstrapVue from 'bootstrap-vue/dist/bootstrap-vue.esm'
Vue.config.productionTip = false

import 'bootstrap/dist/css/bootstrap.css';
import 'bootstrap-vue/dist/bootstrap-vue.css';
import '@/assets/css/main.css'

Vue.use(BootstrapVue)
Vue.use(router)

new Vue({
  router,
  render: h => h(App),
}).$mount('#app')
