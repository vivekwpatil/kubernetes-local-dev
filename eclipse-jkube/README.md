
Deploy application to kubernetes using JKube

````
minikube start

eval $(minikube docker-env)

mvn clean install

mvn k8s:build

mvn k8s:resource

mvn k8s:apply 
or 
mvn k8s:deploy

kubectl get pods

kubectl get svc

minikube service eclipse-jkube --url

curl <servive url>/api/hello/vivek

mvn k8s:undeploy

```

