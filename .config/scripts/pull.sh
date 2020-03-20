#!/bin/bash

echo "pulling images..."

#docker pull mtagab/gateway:latest
docker pull mtagab/account:latest
docker pull mtagab/government:latest
docker pull mtagab/infection:latest
docker pull mtagab/notification:latest
#docker pull mtagab/security:latest
#docker pull mtagab/website:latest
docker pull mtagab/person:latest
docker pull mtagab/hospital:latest
docker pull mtagab/authentication:latest
docker pull mtagab/resource:latest

