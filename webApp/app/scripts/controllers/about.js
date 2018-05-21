'use strict';

/**
 * @ngdoc function
 * @name webAppApp.controller:AboutCtrl
 * @description
 * # AboutCtrl
 * Controller of the webAppApp
 */
angular.module('webAppApp')
  .controller('AboutCtrl', function ($scope, $state) {
    $scope.$state = $state;
  });
