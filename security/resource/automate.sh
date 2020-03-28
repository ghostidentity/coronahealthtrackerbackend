#!/bin/bash

mvn clean install
docker build -t mtagab/resource:latest .
docker push mtagab/resource
