'use strict';

/**
 * @ngdoc function
 * @name webAppApp.controller:ResourceCtrl
 * @description
 * # ResourceCtrl
 * Controller of the webAppApp
 */
angular.module('webAppApp')
  .controller('ResourceCtrl', function ($state) {
   	$state.go('resource.handout');
  });
