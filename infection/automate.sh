#!/bin/bash

mvn clean install
docker build -t mtagab/infection:latest .
docker push mtagab/infection
