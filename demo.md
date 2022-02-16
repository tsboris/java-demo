# Demo

## First run of Artifactory

```shell
http://18.197.228.101:8081
```
User: admin
Pass: password
New Pass: Passw0rd

## Setup Maven repository
We will add a local and a remote repository

### Local repository
Repository Key (Name): maven-demo-lib-local
*Physical, locally-managed repositories into which you can deploy artifacts.*

### Remote repository
Repository Key (Name): maven-demo-lib-remote
*Serves as a caching proxy for a repository managed at a remote URL*

### Virtual repository
Repository Key (Name): maven-demo-lib
Add the local and remote Maven repositories (move them from Available Repositories to Selected Repositories using the arrow buttons).
Select the local repository as the Default Deployment Repository.
*Or "repository group", aggregates several repositories with the same package type under a common URL.*

## SSH into demo instance

```shell
ssh -i "~/.ssh/borist-develeap.instance.key.pem" ubuntu@18.197.228.101
```

## Clone Demo git

```shell
git clone https://github.com/tsboris/java-demo.git
```

## Upload an artifact with metadata using cURL

```shell
curl -sSf -u "admin:Passw0rd" \
       -X PUT \
       -T HelloWorld-0.6.5.jar \
       'http://localhost:8081/artifactory/maven-demo-lib/curl-demo/hello-world/HelloWorld-0.6.5.jar;release=true;cleanup.skip=true;build.number=0.6.5'
```

## Maven build demo
  
  
### Setup pom file
Select the Virtual repository, click **Set Me Up**.  
Select **Deploy** and click the **Copy** icon.  
Copy and paste in ```/home/ubuntu/java-demo/maven-demo/pom.xml```.

### Setup the maven project
Select the Virtual repository, click **Set Me Up** and **General Settings**.  
Copy and paste in ```/usr/share/maven/conf/settings.xml```.

### A Build Lifecycle
* **validate** - validate the project is correct and all necessary information is available
* **compile** - compile the source code of the project
* **test** - test the compiled source code using a suitable unit testing framework. These tests should not require the code be packaged or deployed
* **package** - take the compiled code and package it in its distributable format, such as a JAR.
* **verify** - run any checks on results of integration tests to ensure quality criteria are met
* **install** - install the package into the local repository, for use as a dependency in other projects locally
* **deploy** - done in the build environment, copies the final package to the remote repository for sharing with other developers and projects.

### Package the project

```shell
mvn package
```

### Deploy the project

```shell
mvn deploy
```





## Create a maven project
No need if cloned from git.


```shell
mvn -B archetype:generate -DgroupId=com.mavendemo -DartifactId=mavendemo -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4

```