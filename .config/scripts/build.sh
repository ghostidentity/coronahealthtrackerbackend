#!/bin/bash

# shellcheck disable=SC2164

echo "building images..."

#GATEWAY SECTION
cd ../gateway
mvn clean install
docker build -t mtagab/gateway:latest .

#ACCOUNT SECTION
cd ../account
mvn clean install
docker build -t mtagab/account:latest .

#GOVERNMENT SECTION
cd ../government
mvn clean install
docker build -t mtagab/government:latest .

#INFECTION SECTION
cd ../infection
mvn clean install
docker build -t mtagab/infection:latest .

#NOTIFICATION SECTION
cd ../notification
mvn clean install
docker build -t mtagab/notification:latest .

#SECURITY SECTION
cd ../security
mvn clean install
docker build -t mtagab/security:latest .

#USER SECTION
cd ../user
mvn clean install
docker build -t mtagab/person:latest .

#HOSPITAL SECTION
cd ../hospital
mvn clean install
docker build -t mtagab/hospital:latest .

#AUTHENTICATION SECTION
cd ../security
cd ./authentication
mvn clean install
docker build -t mtagab/authentication:latest .

#RESOURCE SECTION
cd ../security/resource
cd ./resource
mvn clean install
docker build -t mtagab/resource:latest .

#WEBSITE SECTION
cd ../website
mvn clean install
docker build -t mtagab/website:latest .

clear
echo "images has been built."
