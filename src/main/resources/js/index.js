angular.module('ACCOUNT')
	.controller('accountController', [ '$scope', '$rootElement', '$location', '$http',
		function($scope, $rootElement, $location, $http) {
			
			$scope.toAccounting = function () {
		        $location.path('/ACCOUNTING');
		    }
			
			$scope.toShowConsumptionDetail = function () {
				$location.path('/SHOW_CONSUMPTION_DETAIL');
			}
			
			$scope.toMaintainSystemParameter = function(){
				$location.path('/MAINTAIN_SYSTEM_PARAMETER');
			}
			
		} ]);