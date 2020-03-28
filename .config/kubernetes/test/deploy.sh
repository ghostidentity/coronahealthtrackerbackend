#!/bin/bash

kubectl apply -f healthtracker-ingres.yaml
kubectl apply -f healthtracker-config.yaml
kubectl apply -f healthtracker-secret.yaml
kubectl apply -f healthtracker-db.yaml
kubectl apply -f healthtracker-sample.yaml
kubectl apply -f healthtracker-volume.yaml
kubectl apply -f healthtracker-authentication.yaml
kubectl apply -f healthtracker-resource.yaml
