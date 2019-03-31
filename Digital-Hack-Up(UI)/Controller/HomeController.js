var app=angular.module('App');
app.controller('HomeController',function($scope,CommService,$timeout,$rootScope) {
    $scope.message = 'Hello Welcome To Home Page';
    $rootScope.isLoading=false;
            var formdata = new FormData();
            $scope.getTheFiles = function ($files) {
                angular.forEach($files, function (value, key) {
                    formdata.append(key, value);
                });
            };


    $scope.upload=()=>{
        $rootScope.isLoading=true;
        var formdata1 = new FormData();
        formdata1.append("file",document.getElementById("file1").files[0]);
    
        var config = { headers: {'Content-Type': undefined},
                       transformRequest: angular.identity
                     }
        CommService.uploadFile(formdata1,config).then(function(response){
            $scope.init();
            $rootScope.isLoading=false;
        })

    }
   

   console.log( CommService.myFunc(2));
   $scope.init=()=>{
    $rootScope.isLoading=true;
    CommService.getData().then(function(response) {
        $scope.userInfo = response.data;
        $('#table_id').dataTable().fnDestroy();
        $timeout(()=>{
            window.$('#table_id').DataTable({
                "scrollX": true,
                "lengthMenu": [[10, 25, 50, -1], [10, 25, 50, "All"]],
                "pageLength": 10
            });
            $rootScope.isLoading=false;
        },2000)
      });
   };

   $scope.init();
});