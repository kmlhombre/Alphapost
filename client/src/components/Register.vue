<template>
   
    <div class="register">   
       <div class = "form">
         <div class= "form-50w">
        <form>
           <div class = "sign-up-header">
             <h3>Sign Up</h3>
           </div>
            <div class="form-group">
                <label>Username</label>
                <input type="text" class="form-control form-control-lg"/>
            </div>

            <div class="form-group">
                <label>Email Address</label>
                <input type="email" class="form-control form-control-lg" />
            </div>

            <div class="form-group">
                <label>Password</label>
                <input type="password" class="form-control form-control-lg" />
            </div>

            <button type="submit" class="btn btn-dark btn-lg btn-block">Sign Up</button>

            <p class="forgot-password text-right">
                Already registered 
                <router-link :to="{name: 'login'}">sign in?</router-link>
            </p>

        <b-container class="media-container pt-3">
        <b-row>
          <b-col class = "p-0" cols="8">Sign Up with</b-col>
          <b-col class = "p-0" cols="2">
              <input class="facebook" type="submit" value="">
          </b-col>
          <b-col class = "p-0" cols="2">
              <input class="google-plus" type="submit" value="">
          </b-col>
        </b-row>
      </b-container>

        </form>
         </div>
         </div>
    </div>
</template>

<script>
    export default {
        data() {
            return {}
        }
    }
</script>

<style scoped>
.form{
  width:40%;
  height:500px;
  color: white;
  padding: 15px;
  position: absolute;
  top: 50%;
  left: 50%;
  -ms-transform: translateX(-50%) translateY(-50%);
  -webkit-transform: translate(-50%,-50%);
  transform: translate(-50%,-50%);
}
h3 {
  margin: 10px 0 0;
}
.sign-up-header{
 margin-bottom:50px;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}

.form-50w{
width:60%;
position: absolute;
left: 50%;
top: 50%;
padding: 30px;
 border-radius: 25px;
  border: 1px solid gray;
background: #42b983;
-webkit-transform: translate(-50%, -50%);
-ms-transform: translate(-50%, -50%);
transform: translate(-50%, -50%);
}

.facebook{
 background:url(../assets/images/facebook.png) no-repeat;
    cursor:pointer;
    border:none;
    width:24px;
    height:24px;
}
.facebook:active {
     background:url(../assets/images/facebook.png) no-repeat;
}

.google-plus{
 background:url(../assets/images/google-plus.png) no-repeat;
    cursor:pointer;
    border:none;
     width:24px;
     height:24px;
}

.google-plus:active {
     background:url(../assets/images/google-plus.png) no-repeat;
}

</style>
