#!/bin/bash

echo "applying secret"
kubectl apply -f healthtracker-secret.yaml

echo "applying configuration"
kubectl apply -f healthtracker-config.yaml

echo "mapping volume"
kubectl apply -f healthtracker-volume.yaml

echo "installing db "
kubectl apply -f healthtracker-db.yaml

echo "configuring application "
kubectl apply -f healthtracker-services.yaml

echo "installing services "
kubectl apply -f healthtracker-deployment.yaml

echo "installing gateway "
kubectl apply -f healthtracker-gateway.yaml

echo "installing ingress "
kubectl apply -f healthtracker-ingres.yaml


echo "process completed.. "
kubectl get deployments
