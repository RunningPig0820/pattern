# pattern
博客 : [Spring中常用的设计模式](https://blog.csdn.net/zhangmin2016/article/details/84778686
)
## pattern-factory 工厂模式 

### 简单工厂模式(Factory)

属于 23 种设计模式之一。 简单工厂模式的实质是由一个工厂类根据传入的参数，动态决定应该创建哪一个产品类。

不符合开闭原则,每次新增都需要进行对工厂类进行修改

### 抽象工厂模式(Abstract Factory)
将对象的创建和使用相分离，采用工厂模式,即应用程序将对象的创建及初始化职责交给工厂对象。

对于调用者来说，隐藏了复杂的逻辑处理过程，调用者只关心执行结果。 对于工厂来说要对结果负责，保证生产出符合规范的产品。

### 单例模式
解决问题：是为了使资源可以共享，只需要复制或者初始化一次，可以进行重复利用

应用场景: Listener本身单例，日历Calender，IOC容器，配置信息Config

技术方案 懒汉式，饿汉式，注册登录式(枚举式)，反序列化

### 代理模式
执行者、被代理人 对于被代理人来说，这件事情是一定要做的，但是我 自己又不想做或者没有时间做。 对于代理人而言，需要获取到被代理的人个人资料， 只是参与整个过程的某个或几个环节

应用场景: 租房中介、售票黄牛、婚介、经纪人、快递、事务代理、非侵入式日志监听

技术方案: 静态代理、动态代理

### 观察者模式
定义对象间的一种一对多的依赖关系，当一个对象的状态发生改变时，所有依赖于它的对象
都得到通知并被自动更新。

应用场景: 编码解码、一拖三充电头、HDMI 转 VGA、Type-C 转 USB

技术方案 ：集成和组合

### 装饰器模式
装饰模式指的是在不必改变原类文件和使用继承的情况下，动态地扩展一个对象的功能。它是通过创建一个包装对象，也就是装饰来包裹真实的对象。

应用场景:在我们的项目中遇到这样一个问题:我们的项目需要连接多个数据库，而且不同的客户在每
次访问中根据需要会去访问不同的数据库。