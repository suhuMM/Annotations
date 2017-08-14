# 注解框架
引入方法：
--------
1.在工程的build.gradle文件添加：maven{url 'https://jitpack.io'}
<br />
例如：
<br />
allprojects {<br />
    >>repositories {<br />
      >>>jcenter()<br />
       >>>> maven{url 'https://jitpack.io'}<br />
   }<br />
}<br />
2.在module的build.gradle文件添加：compile 'com.github.suhuMM:Annotations:v1.0.0'
例如：
dependencies {
    compile fileTree(include: ['*.jar'], dir: 'libs')
    androidTestCompile('com.android.support.test.espresso:espresso-core:2.2.2', {
        exclude group: 'com.android.support', module: 'support-annotations'
    })
    compile 'com.android.support:appcompat-v7:26.+'
    compile 'com.android.support.constraint:constraint-layout:1.0.2'
    compile 'com.github.suhuMM:Annotations:v1.0.0'

}
