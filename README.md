## About

This project is a Test Automation Framework for a NASA's RESTful sound service.
You can use it to quickly execute integration test for the prod and preprod environment.


## Getting Started

You can simply clone this repository and then build and run it locally using Maven.

#### Prerequisites

You need Gradle and Java 1.8 on your development machine.
If your development environment is not set up already, see 
[JDK 8](http://www.oracle.com/technetwork/java/javase/documentation/jdk8-doc-downloads-2133158.html).
[Gradle](https://gradle.org/gradle-download/).

#### Clone this repository

To clone the repository to your local machine using git, 
replace the URL in the command example below with the one for your starter code on Github. 
You should have received this URL in an email from the services Platform team. 
You can also use Sourcetree to clone it. 

git clone https://github.com/craft/sound-test-gradle.git
cd sound-test-gradle


#### Build and Run the test Automation

Build the project by navigating to the root directory and running:
```

gradle clean build -x test
```

Execute Tests by navigating to the root directory and running:
```

gradle clean test -Denv=prd
```

Test Results can be found at

sound-test-gradle/build/reports/tests/index.html
```

TestNG Results can be found at

sound-test-gradle/build/target/index.html
```

## Next Steps

- Generate javadocs for the test automation classes by running:

gradle  testJavaDoc
```

Test javadocs can be found at

sound-test-gradle/build/docs/testjavadoc/index.html
```

- To Implement and add new Test Cases update exisitng testng.xml file or create a new one and pass the path in build.gradle

sound-test-gradle/src/test/resources/sound/testng.xml
```


## Directory Layout

```
Coming soon

## Contact

For assistance, submit questions to the developer community at
https://answers.lc.intuit.com/tags/services%20platform
or email the Nasa Quality team at mailto:opensource-api-quality@nasa.gov
=======
# Description

Java RestAssured based Test Automation Framework

Release Notes: 
