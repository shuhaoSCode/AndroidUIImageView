# AndroidUIImageView

重写ImageView，防止内存溢出（oom），图片不压缩。Android新手看这里~~

## 如何导入？  [![嘿嘿](https://jitpack.io/v/shuhaoSCode/AndroidUIImageView.svg)](https://jitpack.io/#shuhaoSCode/AndroidUIImageView)

* Android Studio

		allprojects {
			repositories {
			  ...
			  maven { url 'https://jitpack.io' }
			}
		}
		  
		dependencies {
	        compile 'com.github.shuhaoSCode:AndroidUIImageView:-SNAPSHOT'
		}


* eclipse。。。请自行copy class。
## 如何使用？
	<com.shuhao.uiimageview.UIImageView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:src="@mipmap/ic_launcher"/>
        
   简单粗暴有木有，直接做ImageView就行。原来OOM的项目现在完美运行~
  

