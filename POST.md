
## Goal

The goal is simple, just create a console application, using gradle, so that it can be imported by IDEA. No other advanced features of gradle are needed. Simplicity is the best for beginners. Learn more in real work.

## Set up the project

To keep focus on Gralde, I will make the java project as simple as possible for now.

### The directory structure

```
└── src
  	└── main
	  	└── java
			└── hello
```

Now create a java class as the main entry point. `src/main/java/hello/HelloWorld.java`.

```
package hello;

public class HelloWorld {
  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
```

## Install Gradle

I will using the `gvm` to install gradle. For installation and more documentation, please refer to the [repo page](https://github.com/moovweb/gvm), or the [main page](http://gvmtool.net/).

To test the gradle installation, run Gralde from the shell:

```
gradle
```

### Find out what Gradle can do

Before you even create a `build.gradle` file for the project, you can ask it what tasks are available:

```
gradle tasks
```

You will see very elementary tasks.

### Build Java Code

Let's create a basic `build.gralde` file now with one simple line:

```
apply plugin: 'java'
```

This will add some tasks for common java processing behaviors, like building, running tests. Run `gradle tasks` to see them.

```
gradle build
```

The build task compiles, tests and assembles the code into a JAR file. More informations can be found in the build subdirectories.

### Declare dependencies

## Build your project with Gralde Wrapper

**REFERENCES**

1. http://spring.io/guides/gs/gradle/
