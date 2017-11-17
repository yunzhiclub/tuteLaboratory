'use strict';

/**
 * @ngdoc function
 * @name webAppApp.controller:MainCtrl
 * @description
 * # MainCtrl
 * Controller of the webAppApp
 */
angular.module('webAppApp')
  .controller('MainCtrl', function($http, $scope) {
    var self = this;
    self.init = function() {
      // 先获取本地数据，用于显示
      var url = '/data/main.json';
      $http.get(url)
        .then(function success(response) {
          $scope.lists = response.data;
        }, function error(response) {
          console.log('发生了错误');
          console.log(response);
        });

      // 再获取远程数据，如果存在，则替换
      var api = 'http://www.mengyunzhi.com:2000/index';
      $http.get(api)
        .then(function success(response) {
          self.setDataTypeToRemote();
          $scope.lists = response.data;
        }, function error() {
          console.log('远程数据未成功获取');
        });
    };

    /**
     * 切换是否显示more
     * @param  {[type]} object 
     * @return {}        
     */
    self.toggleShowMore = function(object) {
      object.showMore = !object.showMore;
    };

    /**
     * 设置数据源为远程
     */
    self.setDataTypeToRemote = function() {
      $scope.dataType = 'remote';
    };

    $scope.toggleShowMore = self.toggleShowMore;
    $scope.dataType = 'local';
    self.init();

  });
