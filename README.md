# simplejavaexample  

##### In simplejavaexample/src dir:
Compile:
```sh
$ javac -d . somepackage/HelloWorld.java
```

Run directly:
```sh
$ java somepackage.HelloWorld
```

Create jar:
```sh
$ jar cfe myJar.jar somepackage.HelloWorld somepackage/HelloWorld.class somepackage/somesubpackage/*.class   
```

Look in jar:
```sh
$ jar tf jar-file
```

Run jar:
```sh
$ java -jar myJar.jar 
```


##### LINKS:
Working with Manifest Files: The Basics:
https://docs.oracle.com/javase/tutorial/deployment/jar/manifestindex.html

Using JAR Files: The Basics:
https://docs.oracle.com/javase/tutorial/deployment/jar/basicsindex.html