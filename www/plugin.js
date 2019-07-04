
var exec = require('cordova/exec');

var PLUGIN_NAME = 'MyCordovaPlugin';

var MyCordovaPlugin = {
  init: function(apiKey) {
    // exec(onSuccess, onFail, 'Mixpanel', 'alias', [alias, distinctId]);
    exec(null, null, PLUGIN_NAME, 'init', [apiKey]);
  }
};

module.exports = MyCordovaPlugin;
