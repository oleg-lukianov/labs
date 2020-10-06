kubectl create namespace lukianov
kubectl apply -f k8s_nginx.yaml
kubectl run nginx-manual --image=nginx -n lukianov


