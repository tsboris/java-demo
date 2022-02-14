# Demo

## First run of Artifactory
User: admin
Pass: password
New Pass: Passw0rd

## Setup Maven repository
We will add a local and a remote repository

### Local repository
Repository Key (Name): maven-demo-lib-local

### Remote repository
Repository Key (Name): maven-demo-lib-remote

### Virtual repository
Repository Key (Name): maven-demo-lib
Add the local and remote Maven repositories (move them from Available Repositories to Selected Repositories using the arrow buttons).
Select the local repository as the Default Deployment Repository.

## SSH into demo instance

```shell
ssh -i "~/.ssh/borist-develeap.instance.key.pem" ubuntu@35.158.109.252
```

## Clone Demo git

```shell
git clone https://github.com/tsboris/java-demo.git
```

## Create a maven project
```shell
mvn -B archetype:generate -DgroupId=com.mavendemo -DartifactId=mavendemo -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4

```