#!/bin/bash

kubectl delete --all deployments
kubectl delete --all services
kubectl delete --all ConfigMap
kubectl delete --all Secret
#kubectl delete --all PersistentVolumeClaim
kubectl delete --all Ingress
