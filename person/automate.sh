#!/bin/bash

mvn clean install
docker build -t mtagab/person:latest .
docker push mtagab/person
