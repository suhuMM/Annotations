# 注解框架

## 一、框架简介：
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  Annotation特点就是使代码更加简洁，降低代码的耦合性，提高代码的编译效率，提高开发效率。与butterknife相比增加setLayout()注解，目的就是省略掉布局填充代码，下面分别对Activity和Fragment进行说明：1.在activity中省略掉：setContentView();2.在fragment中省略掉inflate();其实并不是真正的省略，而是将使用反射将其封装在Annotation框架里面，那么问题来了，那么如何将布局添加进该类中？这就是刚才所说的增加setLayout()注解，该注解在类前，只要一打开该类就一目了然看到该类的布局，具体已经在使用方法中介绍的很详细。<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  使用Annotation框架使个人建议将其封装到BaseActivity和BaseFragment中，可以避免一些重复代码。<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  封装BaseActivity时在onCreate方法中初始化：Annotation.init(this);<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  封装BaseFragment时，将inflateView()方法封装进去，但是不要将Annotation.bind(this)封装到onCreateView()中，因为onCreateView()需要返回一个view对象，这个时候需要将Annotation.bind()返回的View给onCreateView();<br/>

## 二、引入方法：
### 方式一：
在module的build.gradle文的dependencies目录下件添加：compile 'com.suhu:Annotations:v1.0.0'<br/>
（在Android studio默认的jcenter库中，所以只需一步即可）
### 方式二：
1.在工程的build.gradle文件的repositories目录下添加：maven{url 'https://jitpack.io'}<br/>
2.在module的build.gradle文的dependencies目录下件添加：compile 'com.github.suhuMM:Annotations:v1.0.0'<br/>
### 针对eclipse用户：
使用eclipse的同学请在Annotations/app/libs/目录下复制jar包：annotation.jar<br/>

## 三、使用方法：
### 在activity中使用：<br/>
1.实现接口：IALayoy <br/>
2.在onCreate方法中初始化：Annotation.init(this);<br/>
![](https://github.com/suhuMM/Annotations/raw/master/image/activity.png)<br/>

### 在fragment中使用：<br/>
1.实现接口：IFLayout <br/>
2.重写方法：inflateView 并返回：return View.inflate(getActivity(), layout, null); <br/>
3.在onCreateView方法中初始化：Annotation.bind(this); <br/>
![](https://github.com/suhuMM/Annotations/raw/master/image/fragment.png)<br/>
## 四、方法介绍
### Activity初始化方法：init()
![](https://github.com/suhuMM/Annotations/raw/master/image/init.png)<br/>
### Fragment初始化方法：bind()
![](https://github.com/suhuMM/Annotations/raw/master/image/bind.png)<br/>
## 五、版本信息
### v1.0.0版本信息：
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; v1.0.0也是最初始版本，该版本主要有两大模块：1.布局加载（setLayout注解）2.控件加载（bindView注解）
