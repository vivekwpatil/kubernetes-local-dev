#Fabric8 maven plugin
## Install minikube locally

https://kubernetes.io/es/docs/tasks/tools/install-minikube/

### Windows10
If you are using chocolatey. Install minikube with following command
```
choco install docker-desktop
choco install minikube
minikube start
```

### OSX
```
brew install minikube
minikube start
```

## Kubernates tutorials
https://kubernetes.io/es/docs/tutorials/kubernetes-basics/create-cluster/cluster-interactive/

## Store  custom built docker images within Minikube’s virtual environment 
```
eval $(minikube docker-env)
```

##How  to create docker image of the application

```
#mvn fabric8:build
```

##create the kubernets and openshift deplyment scripts
```
mvn fabric8:resource
```

##deploy application
```
mvn fabric8:deploy
```

##check pods
```
kubectl get pods
kubectl get svc
```
##check application url
```
minikube ip
kubectl get svc
CLUSTER= $(minikube ip)
curl $CLUSTER:31857/api/hello/Vivek
```

##Debug:
remote debugging:
```
mvn fabric8:debug
```
Go to intellij:
add remote debug config and start debug
add debug point 


##Hot reload:
```
mvn fabric8:watch
```
change the code and then trigger reload by:
```
mvn package 
```
##Trouble shooting
IF you see ImagePullBackOff or ErrImagePull    error while performing kubectl get pods. you need to store custom built docker images within Minikube’s virtual environment 
```
eval $(minikube docker-env)
```

##Reference:
- https://github.com/fabric8io/fabric8-maven-plugin
