#!/bin/bash

mvn clean install
docker build -t mtagab/hospital:latest .
docker push mtagab/hospital
