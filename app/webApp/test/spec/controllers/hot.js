'use strict';

describe('Controller: HotCtrl', function () {

  // load the controller's module
  beforeEach(module('webAppApp'));

  var HotCtrl,
    scope;

  // Initialize the controller and a mock scope
  beforeEach(inject(function ($controller, $rootScope) {
    scope = $rootScope.$new();
    HotCtrl = $controller('HotCtrl', {
      $scope: scope
      // place here mocked dependencies
    });
  }));

  it('should attach a list of awesomeThings to the scope', function () {
    expect(HotCtrl.awesomeThings.length).toBe(3);
  });
});
