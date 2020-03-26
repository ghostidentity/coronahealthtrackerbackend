#!/bin/bash

echo "building images..."
mvn clean install --file ./account/pom.xml
mvn clean install --file ./government/pom.xml
mvn clean install --file ./hospital/pom.xml
mvn clean install --file ./infection/pom.xml
mvn clean install --file ./notification/pom.xml
mvn clean install --file ./person/pom.xml
mvn clean install --file ./security/authentication/pom.xml
mvn clean install --file ./security/resource/pom.xml
mvn clean install --file ./security/skeleton/pom.xml

skaffold build
