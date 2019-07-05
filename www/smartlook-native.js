
var exec = require('cordova/exec');

var PLUGIN_NAME = 'SmartlookPlugin';

var Smartlook = function() {};

Smartlook.init = function (apiKey, successCallback, failCallback) {
  return exec(successCallback, failCallback, PLUGIN_NAME, 'init', [apiKey]);
}

Smartlook.enableWebviewRecording = function (flag, successCallback, failCallback) {
  return exec(successCallback, failCallback, PLUGIN_NAME, 'enableWebviewRecording', [flag]);
}

module.exports = Smartlook;
