[![](https://jitpack.io/v/mkw8263/MindevIndicator.svg)](https://jitpack.io/#mkw8263/MindevIndicator) <br>
![](https://github.com/mkw8263/MindevIndicator/blob/master/device-2019-11-14-231038%20(2).png)

How to
To get a Git project into your build:

Step 1. Add the JitPack repository to your build file

gradle
maven
sbt
leiningen
Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.mkw8263:MindevIndicator:0.01'
	}
Share this release:
