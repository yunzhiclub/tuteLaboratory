'use strict';

/**
 * @ngdoc filter
 * @name webAppApp.filter:yunzhiMore
 * @function
 * @description
 * # yunzhiMore
 * Filter in the webAppApp.
 * 显示正文more以前的
 */
angular.module('webAppApp')
  .filter('yunzhiMore', function() {
    return function(input) {
    	var reg = /([^]*)(<\!--\s{0,}more\s{0,}-->)/i;
    	var result = input.match(reg);
    	if (result) {
    		return result[0];
    	} else {
    		return input;
    	}
    };
  });
