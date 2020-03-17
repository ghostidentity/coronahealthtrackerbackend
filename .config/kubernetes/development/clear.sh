#!/bin/bash

echo "applying secret"
kubectl delete -f healthtracker-secret.yaml

echo "applying configuration"
kubectl delete -f healthtracker-config.yaml

echo "mapping volume"
kubectl delete -f healthtracker-volume.yaml

echo "installing db "
kubectl delete -f healthtracker-db.yaml

echo "configuring application "
kubectl delete -f healthtracker-services.yaml

echo "installing services "
kubectl delete -f healthtracker-deployment.yaml

echo "installing gateway "
kubectl delete -f healthtracker-gateway.yaml

echo "installing gateway "
kubectl delete -f healthtracker-ingres.yaml

clear
echo "process completed.. "
kubectl get deployments
