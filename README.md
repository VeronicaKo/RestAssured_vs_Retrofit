## Сравнение написания одного теста с помощью разных фреймворков: RestAssured и Retrofit

Работа с API сайта https://reqres.in/ 

### Для работы использованы:
#### Язык: 
- Java 18
#### Фреймворки: 
- maven-4.0.0
- rest-assured 4.4.0
- retrofit 2.9.0
- testng 7.3.0
#### Библиотеки:
- converter-jackson 2.9.0
- jackson-databind 2.13.0
- jackson-annotations 2.13.0
- json-simple 1.1.1
- junit-jupiter-api 5.8.1

#### Плагин 
- RoboPOJOGenerator 2.3.2

### Структура проекта
```
   com.example/
   |-- restassured/
       └── RestAssuredTests.java/
   |-- retrofit/
       └── jsonExamples
           └── user.json
       |-- CAPIClientHelper.java
       |-- APIInterface.java
       |-- RetrofitApplicationTests.java
       └── pojo
           |-- CreateUserRequest.java
           |-- CreateUserResponse.java
           |-- Data.java
           |-- Support.java
           └── User.java
   ```


