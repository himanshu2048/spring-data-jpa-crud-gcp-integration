# spring-data-jpa-crud-gcp-integration



# Below commands will give access and connectivity through cloud sdk


gcloud auth login
gcloud init
gcloud components install app-engine-java
gcloud components list 


#Once above process completed Got to the pom folder through cloud sdk


mvn clean appengine:run
mvn appengine:deploy -Dappengine.appId=[YOUR-PROJECT-ID]

project id is the once where you initially created project