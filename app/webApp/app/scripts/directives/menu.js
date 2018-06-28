'use strict';

/**
 * @ngdoc directive
 * @name webAppApp.directive:menu
 * @description
 * # menu
 */
angular.module('webAppApp')
  .directive('menu', function () {
    return {
      templateUrl: 'views/directive/menu.html',
      restrict: 'EA'
    };
  });
