# Belajar Apache Maven
## POM
```
<project xmlns = "http://maven.apache.org/POM/4.0.0"
   xmlns:xsi = "http://www.w3.org/2001/XMLSchema-instance"
   xsi:schemaLocation = "http://maven.apache.org/POM/4.0.0
   http://maven.apache.org/xsd/maven-4.0.0.xsd">
   <modelVersion>4.0.0</modelVersion>

   <groupId>com.companyname.project-group</groupId>
   <artifactId>project</artifactId>
   <version>1.0</version>
   <packaging>jar</packaging>
</project>
```
- Project root
- Model version
- groupId
- artifactId
- version
## Build Life Cycle
- validate
- compile
- test
- package
- install
- integration-test
- deploy
- verify
- clean
- site
## Creating Project
```
mvn archetype:generate
mvn archetype:generate -DgroupId=com.paralun -DartifactId=first-app -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false
```
### Project Templates (Archetype)
- maven-archetype-quickstart
- maven-archetype-webapp
## Dependencies
```
<dependencies>
    <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>3.8.1</version>
        <scope>test</scope>
    </dependency>
</dependencies>
```
## External Dependencies
```
<dependencies>
    <dependency>
        <groupId>ldapjdk</groupId>
        <artifactId>ldapjdk</artifactId>
        <scope>system</scope>
        <version>1.0</version>
        <systemPath>${basedir}\src\lib\ldapjdk.jar</systemPath>
    </dependency>
</dependencies>
```
## Dependency Scope
- compile
- provided
- runtime
- test
- system
- import
## Maven Repository
- Local Repository
- Central Repository
- Remote Repository
## Maven Plugin
### Compiler Plugin
```
<properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <maven.compiler.source>11</maven.compiler.source>
    <maven.compiler.target>11</maven.compiler.target>
</properties>

<build>
    <plugins>
      <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-compiler-plugin</artifactId>
        <version>3.8.1</version>
        <configuration>
          <source>11</source>
          <target>11</target>
        </configuration>
      </plugin>
    </plugins>
</build>
```
### Jar Plugin
```
  <build>
    <plugins>
      <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-jar-plugin</artifactId>
        <version>2.3</version>
        <configuration>
          <archive>
            <manifest>
              <addClasspath>true</addClasspath>
              <mainClass>com.paralun.MainClass</mainClass>
            </manifest>
          </archive>
        </configuration>
      </plugin>
    </plugins>
  </build>
```
### Assembly Plugin
```
<plugin>
  <groupId>org.apache.maven.plugins</groupId>
  <artifactId>maven-assembly-plugin</artifactId>
  <version>3.3.0</version>
  <configuration>
    <descriptorRefs>
      <descriptorRef>jar-with-dependencies</descriptorRef>
    </descriptorRefs>
    <archive>
      <manifest>
        <mainClass>programmer.zaman.now.maven.App</mainClass>
      </manifest>
    </archive>
  </configuration>
  <executions>
    <execution>
      <id>make-assembly</id> <!-- this is used for inheritance merges -->
      <phase>package</phase> <!-- bind to the packaging phase -->
      <goals>
        <goal>single</goal>
      </goals>
    </execution>
  </executions>
</plugin>
```
## Maven Commands
```
mvn --version
mvn clean
mvn test-compile
mvn compile
mvn package
mvn package -Dmaven.test.skip=true
mvn clean package -Dmaven.test.skip=true
mvn verify
mvn install
mvn install -Dmaven.test.skip=true
mvn dependency:copy-dependencies
mvn dependency:tree
mvn dependency:tree -Dverbose
mvn spring-boot:run -Dapp.profiles=test
```