'use strict'

/**
 * @ngdoc overview
 * @name webAppApp
 * @description
 * # webAppApp
 *
 * Main module of the application.
 */
angular
  .module('webAppApp', [
    'ngAnimate',
    'ngCookies',
    'ngResource',
    'ngRoute',
    'ngSanitize',
    'ngTouch',
    'ui.router'
  ])
  .config(function ($stateProvider, $urlRouterProvider) {
    $stateProvider.state({
      name: 'main',
      url: '/',
      templateUrl: 'views/main.html',
      controller: 'MainCtrl',
      data: {
        title: '首页'
      }
    })
    .state({
      name: 'about',
      url: '/about',
      templateUrl: 'views/about.html',
      controller: 'AboutCtrl',
      data: {
        title: '关于我们'
      }
    })
      .state({
        name: 'nav',
        url: '/nav',
        templateUrl: 'views/nav.html',
        controller: 'NavCtrl',
        data: {
          title: '站内导航'
        }
      })
    .state({
      name: 'check',
      url: '/check',
      templateUrl: 'views/check.html',
      data: {
        title: '验收'
      }
    });
    $urlRouterProvider.otherwise('/');
  });
