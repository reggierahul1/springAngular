 
'use strict';
 
angular.module('simpleAngularJsApp').factory('myAccountService', ['$http', '$q', function($http, $q){
 
    var REST_SERVICE_GET_ACCOUNTS_URI = 'http://localhost:8080/simpleWeb/entry/v1/forecasting/accounts.json'; 
    
    var factory = {getAllAccounts: getAllAccounts};
    
    return factory;
    
    function getAllAccounts() {
        var deferred = $q.defer();
        $http.get(REST_SERVICE_GET_ACCOUNTS_URI)
            .then(
            function (response) {
                deferred.resolve(response.data);
            },
            function(errResponse){
                console.error('Error while retrieving accounts');
                deferred.reject(errResponse);
            }
        );
        return deferred.promise;
    }
    
}]);