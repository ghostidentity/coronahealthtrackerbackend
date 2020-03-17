#!/bin/bash

echo "applying secret"
kubectl apply -f healthtracker-secret.yaml

echo "mapping volume"
kubectl apply -f healthtracker-volume.yaml

echo "applying configuration"
kubectl apply -f healthtracker-config.yaml

echo "configuring application "
kubectl apply -f healthtracker-services.yaml

echo "installing services "
kubectl apply -f healthtracker-deployment.yaml

clear
echo "process completed.. "
kubectl get deployments
