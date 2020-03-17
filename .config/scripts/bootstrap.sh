minikube --memory 3000 --cpus 2 start
minikube addons enable ingress
kubectl create clusterrolebinding admin --clusterrole=cluster-admin --serviceaccount=default:default
kubectl apply -f https://raw.githubusercontent.com/kubernetes/ingress-nginx/nginx-0.30.0/deploy/static/mandatory.yaml
kubectl apply -f https://raw.githubusercontent.com/kubernetes/ingress-nginx/nginx-0.30.0/deploy/static/provider/baremetal/service-nodeport.yaml
