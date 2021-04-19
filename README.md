# Spring-Multi-Module-Template

## Goal

* Compose a multi module structure project

## Spec

* Java 11
* Spring Boot
* MySQL
* JPA
* Gradle

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

## Reference

* [DolphaGo/spring-multi-module-example](https://github.com/DolphaGo/spring-multi-module-example)
* [Spring Boot 와 Properties(or Yaml) Environment](https://kingbbode.tistory.com/39)
* [멀티모듈에 한 방으로 적용되는 application.yml](https://devyounji.tistory.com/40)
