# Demo

## First run of Artifactory

```shell
http://3.69.54.35:8081
```
User: admin
Pass: password
New Pass: Passw0rd

## Setup Maven repository
We will add a local and a remote repository

### Local repository
Repository Key (Name): maven-demo-lib-local
_Physical, locally-managed repositories into which you can deploy artifacts._

### Remote repository
Repository Key (Name): maven-demo-lib-remote
_Serves as a caching proxy for a repository managed at a remote URL_

### Virtual repository
Repository Key (Name): maven-demo-lib
Add the local and remote Maven repositories (move them from Available Repositories to Selected Repositories using the arrow buttons).
Select the local repository as the Default Deployment Repository.
_Or "repository group", aggregates several repositories with the same package type under a common URL._

## SSH into demo instance

```shell
ssh -i "~/.ssh/borist-develeap.instance.key.pem" ubuntu@3.69.54.35
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











## Create a maven project
No need if cloned from git.


```shell
mvn -B archetype:generate -DgroupId=com.mavendemo -DartifactId=mavendemo -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4

```