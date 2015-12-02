var cooltoolsApp = angular.module('cooltools', ['ngRoute']);

cooltoolsApp.config(function($routeProvider) {
	$routeProvider.when("/", {
		templateUrl : "/cooltools/resources/review.html"
	});
	
	$routeProvider.when("/login", {
		templateUrl : "/cooltools/resources/login.html"
	});
	
	
	$routeProvider.when("/about", {
		templateUrl : "/cooltools/resources/about.html"
	});
});