**Basic Serenity, Selenium, Cucumber login scenario**

Prerequisites:

Java 8 JDK, Maven, Cucumber & Gherkin plugins (for InteliJ)

Configure browser, headless etc in the serenity.properties file

**Run all features using maven command:**

`mvn clean verify serenity:aggregate`

Run specified tag only:

`'clean verify "-Dcucumber.options=--tags @validLogin" serenity:aggregate'`

View the report in: 

`\target\site\serenity\index.html`

Project generated using maven archetype. 

`mvn archetype:generate
-DgroupId=com.grayzemon
-DartifactId=cucumber-serenity
-DarchetypeGroupId=net.serenity-bdd
-DarchetypeArtifactId=serenity-cucumber4-archetype
-DarchetypeVersion=2.0.81
-DinteractiveMode=false`
