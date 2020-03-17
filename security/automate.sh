#!/bin/bash

mvn clean install
docker build -t mtagab/security:latest .
docker push mtagab/security
