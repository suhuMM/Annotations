# 注解框架

## 一、引入方法：
1.在工程的build.gradle文件的repositories目录下添加：maven{url 'https://jitpack.io'}<br/>
2.在module的build.gradle文的dependencies目录下件添加：compile 'com.github.suhuMM:Annotations:v1.0.0'<br/>

## 二、使用方法：
### 在activity中使用：<br/>
1.实现接口：IALayoy <br/>
2.在onCreate方法中初始化：Annotation.init(this);<br/>
![](https://github.com/suhuMM/Annotations/edit/master/image/activity.png)<br/>

### 在fragment中使用：<br/>
1.实现接口：IFLayout <br/>
2.重新方法：inflateView 并返回：return View.inflate(getActivity(), layout, null); <br/>
3.在onCreateView方法中初始化：Annotation.bind(this); <br/>
![](https://github.com/suhuMM/Annotations/edit/master/image/fragment.png)<br/>
## 三、方法介绍
