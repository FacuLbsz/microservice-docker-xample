# microservice-docker-xample

A microservice example using Spring Boot and Docker.

## Spring Boot

You can start the microservice running

``
mvn clean spring-boot run
``


## Docker

To create an image from this service you should change on ``pom.xml`` ``<dockerHost>`` and ``<dockerCertPath>`` to Docker configuration environment.

Example:

``
<dockerHost>https://192.168.99.100:2376</dockerHost>
<dockerCertPath>C:/Users/facundo.vazquez/.docker/machine/machines/default</dockerCertPath>
``

Then run the next command to generate image locally.

``
mvn package docker:build
``

More info about maven configuration: https://github.com/spotify/docker-maven-plugin#setup

If you want to run the generated image, you should run

``
docker run -d -p 8080:8080 --name [NAME] [REPOSITORY|IMAGEID]
``

To push the generated image, you first should tag the image running

``
docker tag [IMAGEID] [USER]/[NEWNAME]
``

And then push it running

``
docker push [USER]/[NEWNAME]
``
