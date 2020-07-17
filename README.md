# NQuire 300 barcode reader plugin

Allows you to control the builtin scanner on NQuire 300 devices [https://www.newland-id.com/product/nquire-300/](https://www.newland-id.com/product/nquire-300/)


## Install

```
cordova plugin add https://github.com/tartinesKiller/cordova-plugin-nquire300-barcode
```

## Usage
### Enable / disable the scanner
```
window.nquire300Barcode.enableReader(true);
```
### Enable / disable the continuous mode
```
window.nquire300Barcode.enableContinuousMode(true);
```
### Enable / disable the good read LED
```
window.nquire300Barcode.enableGoodReadLed(true);
```
### Enable / disable the good read BEEP
```
window.nquire300Barcode.enableGoodReadSound(true);
```
