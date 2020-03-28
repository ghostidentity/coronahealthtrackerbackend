#!/bin/bash

mvn clean install
docker build -t mtagab/authentication:latest .
docker push mtagab/authentication
