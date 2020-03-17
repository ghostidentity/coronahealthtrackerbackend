#!/bin/bash

mvn clean install
docker build -t mtagab/government:latest .
docker push mtagab/government
