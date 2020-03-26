#!/bin/bash

mvn clean install
docker build -t mtagab/skeleton:latest .
docker push mtagab/skeleton
