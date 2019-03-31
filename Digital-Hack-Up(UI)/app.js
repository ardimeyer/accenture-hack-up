angular.module("App",['main']);
var app =angular.module("main",['ui.router','angular-page-loader']);

app.run(function($rootScope) {
    $rootScope.url='http://127.0.0.1:8080';
    console.log("It is working");
});
app.config(function($stateProvider, $urlRouterProvider) {

    $urlRouterProvider.otherwise('/home');

    $stateProvider

        // HOME STATES AND NESTED VIEWS ========================================
        .state('home', {
            url: '/home',
            templateUrl: './template/home.html',
            controller: 'HomeController'
        })

        // SEARCH PAGE AND MULTIPLE NAMED VIEWS =================================
        .state('search', {
            url: '/search',
            templateUrl: './template/search.html',
            controller: 'SearchController'      
        })
        // ELASTIC SEARCH STATE
        .state('elasticsearch', {
            url: '/elasticsearch',
            templateUrl: './template/elasticsearch.html',
            controller: 'ElasticSearchController'      
        })
        .state('chartview', {
            url: '/chartview',
            templateUrl: './template/chartview.html',
            controller: 'chartviewController'      
        });

});
