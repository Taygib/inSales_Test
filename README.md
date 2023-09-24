#   Автотест страницы inSales
[![Typing SVG](https://readme-typing-svg.herokuapp.com?color=%2336BCF7&lines=Автотест+страницы+inSales)](https://www.insales.ru)

- __*inSales*__  — платформа управления онлайн-торговлей через сайт, на маркетплейсах, в социальных сетях и мессенджерах.


<h2>  :hammer_and_wrench: Cтек </h2>
<p align="center">
  <a href="https://www.jetbrains.com/idea/"><img width="6%" title="IDEA" src="src/test/resources/materials/pictures/IDEA.png"> </a>
  <a href="https://selenide.org/"><img width="6%" title="Selenide" src="src/test/resources/materials/pictures/Selenide.png"> </a>
  <a href="https://aerokube.com/selenoid/"><img width="6%" title="Selenoid" src="src/test/resources/materials/pictures/Selenoid.png"> </a>
  <a href="https://gradle.org/"><img width="6%" title="Gradle" src="src/test/resources/materials/pictures/Gradle.png"> </a>
  <a href="https://github.com/allure-framework/allure2"><img width="6%" title="Allure Report" src="src/test/resources/materials/pictures/Allure Report.png"> </a>
  <a href="https://github.com/"><img width="6%" title="GitHub" src="src/test/resources/materials/pictures/GitHub.png"></a> 
  <a href="https://telegram.org"><img width="6%" title="Telegram" src="src/test/resources/materials/pictures/Telegram.png"></a>
  <a href="https://www.jenkins.io/"><img width="6%" title="Jenkins" src="src/test/resources/materials/pictures/Jenkins.png"> </a>
  <a href="https://www.java.com/"><img width="6%" title="Java" src="src/test/resources/materials/pictures/Java.png"></a>
  <a href="https://junit.org/junit5/"><img width="6%" title="junit5" src="src/test/resources/materials/pictures/junit5.png"> </a>
</p>


## :page_with_curl: Проверки
- *Проверка кликабельности кнопки для регистрации*
- *Проверка номеров и электронной почты*
- *Проверка раздела =Проблемы, которые решает inSales=*
- *Проверка перехода по ссылке =Смотреть все шаблоны=*
- *Проверка перехода по ссылке =Смотреть все интеграции=*



##  <img width="5%" title="Jenkins" src="src/test/resources/materials/pictures/Jenkins.png"> Сборка в [Jenkins](https://jenkins.autotests.cloud/job/InSales_Test/)  :gear:
<p align="center">
<img width="70%" title="Jenkins Build" src="src/test/resources/materials/screens/Jenkins Start.png?raw=true">
 </p>

__*Сборка:*__
- `Browser` - браузер (например chrome)
- `BrowserSize` - разрешение экрана (например 1800x900)
- `BrowserVersion` - версия браузера (например 99.0)
- `TASK` - inSalesTest

## :rocket: Запуск тестов

__*Локально, из терминала:*__
```
gradle clean test
```
__*Удаленно, из терминала:*__
```
gradle clean test -DisRemote=true
```
__*Удаленно, из Jenkins:*__
```
clean
${TASK}
-DisRemote=true
-Dbrowser=${Browser}
-DbrVersion=${BrVersion}
-DbrSize=${BrSize}
-DbaseUrl=${BaseUrl}
-Dselenoid=${Selenoid}
```

### Фаил test.properties
Для запуска теста локально нужно создать фаил в папке resources (src/test/resources) и необходимо указать следующее параметры
```
selenoid_UserName = UserName
selenoid_Password = Password
selenoid_Url = Url
```
## :bar_chart: Пример отчета о прохождении тестов в Allure и Telegram


|        <img width="5%" title="Allure Report" src="src/test/resources/materials/pictures/Allure Report.png" > Allure <img src="src/test/resources/materials/screens/allure.png?raw=true">        | <img width="5%" title="Allure Report" src="src/test/resources/materials/pictures/Allure Report.png" > Allure<img src="src/test/resources/materials/screens/allure1.png?raw=true"> |
|:-------------------------------------------------------------------------------------------:|:------------------------------------------------------------------------:|

<p align="center">
<img width="3%" title="Telegram" src="src/test/resources/materials/pictures/Telegram.png">Telegram
</p>
<p align="center">
<img width="45%"  src="src/test/resources/materials/screens/Telegram.png?raw=true">                                                                        
 </p>


### <img width="5%" title="Selenoid" src="src/test/resources/materials/pictures/Selenoid.png"> Видео теста на Selenoid

<img src="src/test/resources/materials/video/button.gif">