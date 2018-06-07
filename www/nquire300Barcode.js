/**
 * Cordova Template Plugin
 */

var Nquire300Barcode = (function () { 
    
    function Nquire300Barcode() {
    }
    
    Nquire300Barcode.prototype.enableReader = function (enable, successCallback) {
        cordova.exec(successCallback, function () { console.log("Error") }, "Nquire300Barcode", "enableReader", [enable]);
    };
    Nquire300Barcode.prototype.enableContinuousMode = function (enable, successCallback) {
        cordova.exec(successCallback, function () { console.log("Error") }, "Nquire300Barcode", "enableContinuousMode", [enable]);
    };
    Nquire300Barcode.prototype.enableGoodReadLed = function (enable, successCallback) {
        cordova.exec(successCallback, function () { console.log("Error") }, "Nquire300Barcode", "enableGoodReadLed", [enable]);
    };
    Nquire300Barcode.prototype.enableGoodReadSound = function (enable, successCallback) {
        cordova.exec(successCallback, function () { console.log("Error") }, "Nquire300Barcode", "enableGoodReadSound", [enable]);
    };

    return Nquire300Barcode;

})();

var nquire300Barcode = new Nquire300Barcode();
module.exports = nquire300Barcode;