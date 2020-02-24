# Spring Boot + minikube  using kubectl commands
```
    5  http localhost:8080/rocket/stats
    6  eval $(minikube docker-env)
   13  docker build -f Dockerfile  -t rocketservice-minikube-vanilla:latest --rm=true .
   14  docker images
   15  docker run -p 8080:8080 rocketservice-minikube-vanilla
   17  minikube status
   36  kubectl create -f deployment.yaml
   32  kubectl get deployments
   44  kubectl get pods

   18  kubectl create -f service.yaml
   19  kubectl get services
   20  kubectl describe service rocketservice-minikube-vanilla

   35  kubectl delete deployment rocketservice-minikube-vanilla
   61  kubectl describe pod rocketservice-minikube-vanilla-74c575f78d-vk2mx
   62  minikube ip
   63  minikube service rocketservice-minikube-vanilla --url
   64  http 172.29.71.45:30994/rocket/stats
```