var app=angular.module('App');
app.controller('SearchController',function($scope,CommService,$rootScope) {
    $scope.message = 'Hello Welcome To Search Page';
    $scope.searchData=()=>{
        
            $rootScope.isLoading=true;
            CommService.getUserInfoById($scope.searchValue).then(function(response) {
                $scope.userInfo = response.data;
                $rootScope.isLoading=false;
              });
    }
    $scope.searchData();
    $rootScope.isLoading=false;
});