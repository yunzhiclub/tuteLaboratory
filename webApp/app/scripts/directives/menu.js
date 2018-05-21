'use strict';

/**
 * @ngdoc directive
 * @name webAppApp.directive:menu
 * @description
 * # menu
 */
angular.module('webAppApp')
  .directive('menu', function ($state) {
    return {
      templateUrl: 'views/directive/menu.html',
      restrict: 'EA',
      link: function postLink(scope, element, attrs) {
        scope.$state = $state;
      }
    };
  });
