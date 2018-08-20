angular.module('ACCOUNT', ['ngRoute'])
	.config(['$routeProvider', function($routeProvider) {
		$routeProvider
			.when('/ACCOUNTING',{
				templateUrl: '/Accounting/pages/ACCOUNTING/ACCOUNTING.html',
        		controller: 'accountingController'
			})
			.when('/SHOW_CONSUMPTION_DETAIL',{
				templateUrl: '/Accounting/pages/SHOW_CONSUMPTION_DETAIL/SHOW_CONSUMPTION_DETAIL.html',
				controller: 'showConsumptionDetailController'
			})
			.when('/MAINTAIN_SYSTEM_PARAMETER',{
				templateUrl: '/Accounting/pages/MAINTAIN_SYSTEM_PARAMETER/MAINTAIN_SYSTEM_PARAMETER.html',
				controller: 'maintainSystemParameterController'
			})
	}])