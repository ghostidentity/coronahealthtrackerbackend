#!/bin/bash

echo "images are now pushing to docker registry .."
docker push mtagab/gateway
docker push mtagab/account
docker push mtagab/government
docker push mtagab/infection
docker push mtagab/notification
docker push mtagab/security
docker push mtagab/hospital
docker push mtagab/person
docker push mtagab/website
docker push mtagab/authentication
docker push mtagab/resource

docker container prune --force
