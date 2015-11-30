var cooltoolsApp = angular.module('cooltools', ["ngRoute"]);

cooltoolsApp.config(function($routeProvider) {
	$routeProvider.when("/requests", {
		templateUrl : "/views/requests.html"
	});
	$routeProvider.when("/review", {
		templateUrl : "/views/review.html"
	});
});