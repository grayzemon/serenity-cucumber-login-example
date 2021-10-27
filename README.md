**Basic Serenity, Selenium, Cucumber login scenario**

Prerequisites:

Java 15 JDK, Maven, Cucumber & Gherkin plugins (for InteliJ)

Configure browser, headless etc in the serenity.properties file

**Run all features using maven command:**

`mvn clean verify serenity:aggregate`

Run specified tag only:

`'clean verify "-Dcucumber.options=--tags @validLogin" serenity:aggregate'`

View the report in: 

`\target\site\serenity\index.html`

Project generated from scratch using maven archetype. 

pom file based on:

https://github.com/serenity-bdd/serenity-cucumber-starter/blob/master/pom.xml

serenity.version downgraded to 2.5.10 in the pom.xml due to error with runner file.
