# SirDuck
Written in [Kotlin](https://kotlinlang.org/) by JetBrains, backed by [MongoDB](https://www.mongodb.com/), this discord bot conntects to the discord api using [JDA](https://github.com/DV8FromTheWorld/JDA).

## Contributing
### 0. Architecture
This project aims to discover and learn new technologies.
Regarding this, we are trying to create an interactive service, saving the data in MongoDB, writing the whole project in Kotlin, packaging into a container, maybe later multiple containers and creating a auto-deployment.

This are many things to get used to, it should be our goal to improve it over time.
The normal tools we are using here are gradle as buildsystem and git as version control software.

### 1. Cloning and first build
```bash
git clone https://github.com/cryoW0lf/SirDuck.git # You can also use the ssh version
cd SirDuck
./gradlew buildImage
```
There are two possibilities. You can always use docker-compose to start a MongoDB instance and an instance of SirDuck or you start a MongoDB instance once (in Docker or on your local machine) and run SirDuck on your machine or a container to debug.
**But first you need to insert your bot token into .env!**
```bash
docker-compose up # Use docker-compose to start a mongodb container and a sirduck container
# or
./gradlew startMongo # equals to starting a mongo container per docker cli
./gradlew runBot -Pdebug # run the bot with the debug messages enabled
docker stop <mongocontainer> # stop the mongo container
```

*(You can also use the Dockerfile.build, but it won't be explained here in detail right now)*


### 2. Working on the project + Pull Requests
To contribute on this project, you will need to work on your own feature/fix branch (Only one feature per branch).
First fork this project, replace the origin of the original or clone your fork, then create a branch in the right format.

Reference: https://github.com/angular/angular/blob/master/CONTRIBUTING.md#-submitting-a-pull-request-pr

### 3. Commits
You commit messages should follow [this style](https://github.com/angular/angular/blob/master/CONTRIBUTING.md#commit) and be signed ([help](https://help.github.com/articles/signing-commits-using-gpg/)).


## Lifecycle of the Repository
The development branch is the active branch in this Repository, the master branch is used in production.
By using git tags, we can keep a version history in master.

We are following the [Semantic Versioning](https://semver.org/).

