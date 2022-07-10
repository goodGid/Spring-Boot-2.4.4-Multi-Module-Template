# Spring-Multi-Module-Template

## Goal

* Compose a multi module structure project

## Spec

* Java 11
* Spring Boot 2.4.4
* MySQL
* JPA
* Gradle 6.8.3

## Structure

* Parent
  - module-common : Repository, Property, Constant

* Child
  - module-api : Controller, Service

> build.gradle in Root
``` java
project(':module-api') {
    dependencies {
        compile project(':module-common')
    }
} 
```

## Setup

* Need to add **DB config** in module-common to /config/custom/db.yml

![image](https://user-images.githubusercontent.com/18522341/115961986-16020880-a554-11eb-8c98-76f727b24c8c.png)



## Reference

* [DolphaGo/spring-multi-module-example](https://github.com/DolphaGo/spring-multi-module-example)
* [Spring Boot 와 Properties(or Yaml) Environment](https://kingbbode.tistory.com/39)
* [멀티모듈에 한 방으로 적용되는 application.yml](https://devyounji.tistory.com/40)
