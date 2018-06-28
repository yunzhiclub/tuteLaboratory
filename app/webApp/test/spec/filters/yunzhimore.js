'use strict';

describe('Filter: yunzhiMore', function() {

  // load the filter's module
  beforeEach(module('webAppApp'));

  // initialize a new instance of the filter before each test
  var yunzhiMore;
  beforeEach(inject(function($filter) {
    yunzhiMore = $filter('yunzhiMore');

  }));

  it('should return the input prefixed with "yunzhiMore filter:"', function() {
    var text = 'sfsdfsdweffef<dsfhefwef>sfefhefdfs<!--more-->jhghjghjghjy';

    expect(yunzhiMore(text)).toBe('sfsdfsdweffef<dsfhefwef>sfefhefdfs<!--more-->');
  });

});
