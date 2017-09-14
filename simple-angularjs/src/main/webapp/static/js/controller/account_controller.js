'use strict';
 
angular.module('simpleAngularJsApp').controller('AccountController', ['$scope', 'myAccountService', function($scope, passedAccountService){
    var self = this;
    self.accounts=[];
    
    fetchAllAccounts();
    
    function fetchAllAccounts(){
        passedAccountService.getAllAccounts()
            .then(
            function(d) {
                console.log("starting to fetch accounts...");
                self.accounts = d;
            },
            function(errResponse){
                console.error('Error while fetching accounts');
            }
        );
    }
}]);