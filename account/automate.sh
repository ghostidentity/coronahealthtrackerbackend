#!/bin/bash

mvn clean install
docker build -t mtagab/account:latest .
docker push mtagab/account
