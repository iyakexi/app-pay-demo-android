# Android集成支付宝&微信支付Demo

- 微信支付配置文件： 包com.qinyejun.apppaydemo.wxapi 下面 Constants.java  

- 支付宝配置文件：包com.alipay.sdk.pay 下面 AliConstants.java  

- 微信支付需要配合服务器端代码获取预支付PrePay信息,服务端具体实现代码请访问下面的链接：  
[https://github.com/iyakexi/app-pay-server-demo](https://github.com/iyakexi/app-pay-server-demo)  
配置好服务端后将包com.qinyejun.apppaydemo.api 下面 LZApiUtil.java  HOST修改为自己的服务器地址  

#### 其他关于App支付集成的文章请点击以下链接查看（本系列文章完整介绍了如何在App中集成支付宝和微信支付）：  
- [手机App集成微信支付&支付宝-iOS&Android完整版](http://fsblog.me/ios/app-wechatpay-alipay-ios-android/)
- [iOS集成支付宝-Swift版](http://fsblog.me/ios/ios-alipay-swift)
- [iOS&Android集成支付宝-server篇(PHP)](http://fsblog.me/php/ios-android-alipay-server/)
- [iOS集成微信支付-Swift版](http://fsblog.me/ios/ios-wechatpay-swift/)
- [iOS&Android集成微信支付-Server篇(PHP)](http://fsblog.me/php/ios-wechatpay-server-php/)
- [Android集成微信支付](http://fsblog.me/android/android-wechatpay/)
- [Android集成支付宝](http://fsblog.me/android/android-alipay/)
