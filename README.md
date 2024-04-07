**APDC 2023/2024**

Para a discussão:

-> DEPLOY LOCAL

DS -> gcloud beta emulators datastore start
mvn package appengine:run

-> DEPLOY NA CLOUD
mvn package -e -X appengine:deploy -Dapp.deploy.projectId=bionic-charge-415916 -Dapp.deploy.version=7







