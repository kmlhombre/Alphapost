
<template>
  <b-navbar toggleable="lg" type="dark" variant="info">
    <b-navbar-brand href="#">Logo</b-navbar-brand>

    <b-navbar-toggle target="nav-collapse"></b-navbar-toggle>

    <b-collapse id="nav-collapse" is-nav>
        
      <b-nav-form>
          <b-form-input class="mr-sm-2" placeholder="Search"></b-form-input>
          <b-button  class="my-2 my-sm-0  btn-dark " type="submit">Search</b-button>
        </b-nav-form>

      <!-- Right aligned nav items -->
      <b-navbar-nav class="ml-auto">
     <b-nav-item href="#">Profile</b-nav-item>

        <b-nav-item-dropdown right>
          <!-- Using 'button-content' slot -->
      
          <template v-slot:button-content>
          </template>
         
          <b-dropdown-item href="#">Sign Out</b-dropdown-item>
        </b-nav-item-dropdown>
      </b-navbar-nav>
    </b-collapse>
  </b-navbar>

</template>

<script>

export default {
  name: 'MainPage'

}
</script>
<style scoped>
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
.search-input{
    width:500px;
}

.bg-info{
    background:#42b983 !important;
}

</style>
