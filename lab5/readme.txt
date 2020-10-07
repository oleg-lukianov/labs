kubectl create namespace lukianov
kubectl apply -f k8s_nginx.yaml
kubectl run nginx-manual --image=nginx -n lukianov

kubectl apply -f k8s_ubuntu.yaml
kubectl exec -it -n lukianov ubuntu bash






