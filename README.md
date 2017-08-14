# 注解框架

## 一、框架简介：
Annotation特点就是使代码更加简洁，降低代码的耦合性，提高代码的编译效率，提高开发效率。与butterknife相比增加setLayout()注解，目的就是省略掉布局填充代码，下面分别对Activity和Fragment进行说明：1.在activity中省略掉：setContentView();2.在fragment中省略掉inflate();其实并不是真正的省略，而是将使用反射将其封装在Annotation框架里面，那么问题来了，那么如何将布局添加进该类中？这就是刚才所说的增加setLayout()注解，该注解在类前，只要一打开该类就一目了然看到该类的布局




## 二、引入方法：
1.在工程的build.gradle文件的repositories目录下添加：maven{url 'https://jitpack.io'}<br/>
2.在module的build.gradle文的dependencies目录下件添加：compile 'com.github.suhuMM:Annotations:v1.0.0'<br/>

## 三、使用方法：
### 在activity中使用：<br/>
1.实现接口：IALayoy <br/>
2.在onCreate方法中初始化：Annotation.init(this);<br/>
![](https://github.com/suhuMM/Annotations/raw/master/image/activity.png)<br/>

### 在fragment中使用：<br/>
1.实现接口：IFLayout <br/>
2.重新方法：inflateView 并返回：return View.inflate(getActivity(), layout, null); <br/>
3.在onCreateView方法中初始化：Annotation.bind(this); <br/>
![](https://github.com/suhuMM/Annotations/raw/master/image/fragment.png)<br/>
## 四、方法介绍
