angular.module('ACCOUNT').controller('maintainSystemParameterController',
		[ '$scope', '$rootElement', '$http', '$location', function($scope, $rootElement, $http, $location) {
			$scope.textMessage = '';
			
//			$scope.consumptionTypeText = '消費種類';
//			$scope.consumptionTypeDetailText = '消費種類明細';
//			$scope.consumptionPatternsText = '消費方式';
//			$scope.accountText = '帳戶';
			$scope.textArray = ['消費種類', '消費種類明細', '消費方式', '帳戶']
			
			$scope.init = function() {
				$scope.accConsumptionTypesList = [];
				$scope.accConsumptionPatternsList = [];
				$scope.accAccountsList = [];
			}
			
			$scope.getMaintainInfo = function() {
				var url = $rootElement.attr('ng-app') + '/MAINTAIN_SYSTEM_PARAMETER/getMaintainInfo'
				$http({
					method: 'GET',
					url: url
				}).then(function successCallback(response) {
					$scope.accConsumptionTypesList = response.data.accConsumptionTypesList;
					$scope.accConsumptionPatternsList = response.data.accConsumptionPatternsList;
					$scope.accAccountsList = response.data.accAccountsList;
					
				}, function errorCallback(response) {
					$scope.textMessage = 'getMaintainInfo error';
				});
			}
			
			$scope.getMaintainInfo();
			
		} ]);