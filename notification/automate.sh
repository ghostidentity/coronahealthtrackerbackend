#!/bin/bash

mvn clean install
docker build -t mtagab/notification:latest .
docker push mtagab/notification
