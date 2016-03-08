var cooltoolsApp = angular.module('cooltools', ['ngRoute']);

cooltoolsApp.config(function($locationProvider, $routeProvider) {
	$locationProvider.html5Mode(true);
//	var site_prefix = '/cooltools';
	$routeProvider.when("/strange", {
		templateUrl : "/static-resources/review.html"
	});
	
	$routeProvider.when("/login", {
		templateUrl : "/static-resources/login.html"
	});
	
	$routeProvider.when("/home", {
		templateUrl : "static-resources/about.html"
	});
	
	
	$routeProvider.when("/about", {
		templateUrl : "static-resources/about.html"
	});
	
	
});