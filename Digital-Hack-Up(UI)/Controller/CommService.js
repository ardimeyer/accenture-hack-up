var app=angular.module('App');

app.service('CommService', function($http,$rootScope) {
    this.getData=()=>{
        return $http.get($rootScope.url+"/getAllUser");
    }
    this.uploadFile=(fb,con)=>{
        return $http.post($rootScope.url+"/upload_csv",fb,con);
    }
    this.getUserInfoById=(param)=>{
        return $http.get($rootScope.url+"/get-user-info/"+param);
    }
    this.indexDataToElastic=()=>{
        return $http.get($rootScope.url+"/indexDataInElastic");
    }
    this.getDataEducationVsLimitBal=()=>{
        return $http.get($rootScope.url+"/getDataEducationVsLimitBal");
    }
    this.getUserInfoByIdInElastic=(param)=>{ 
        if(param==undefined){
             return $http.get($rootScope.url+"/getAllDataFromElastic");
        }else{
            return $http.get($rootScope.url+"/searchNameAndId/"+param);
        }
        
    }
    this.myFunc = function (x) {
      return x.toString(16);
    }
  });