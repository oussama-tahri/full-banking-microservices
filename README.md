# Full Banking Project
<hr>

## Partie 1 : Front-end

<br>

```markdown
Pour chaque "HTTP Request" on l'envoie au service Gateway "port 9999"
```
<br>


la liste des produits :
<br>

<img src="captures/productsPage.PNG">

<br>

la liste des clients :
<br>

<img src="captures/customersPage.PNG">

<br>

Chaque client contient une liste des ordres (bouton vert):

<br>

<img src="captures/OrdersPage.PNG">

<br>

Cette page contient les details de chaque ordre
<br>

<img src="captures/OrderDetailsPage.PNG">

<br>

Pour configurer CORS dans la gateway-service

```markdown
spring:
  cloud:
    gateway:
      globalcors:
        corsConfigurations:
          '[/**]':
            allowedOrigins: "http://localhost:4200"
            allowedHeaders: "*"
            allowedMethods:
              - GET
              - POST
              - PUT
              - DELETE
```

<br>

## Partie 2 : Back-end

Les services sont enregistrés dans Consul :

<img src="captures/ConculServicesPage.PNG">

<br>

### 1) Spring Cloud Config

<br>
Pour utiliser Spring Cloud Config il faut tout d'abord ajouter la dependance suivante :

```markdown
<dependency>
  <groupId>org.springframework.cloud</groupId>
  <artifactId>spring-cloud-starter-config</artifactId>
</dependency>
```
<br>

Puis on push la configuration vers GitHub comme le suivant :

<img src="captures/SpringCloudConfigWithGit&Github.PNG">

<br>

pour utiliser la configuration dans chaque microservice on doit l'importer :

<img src="captures/SpringCloudConfigProps.PNG">

<br>
Et puis on l'active 
<br>

<img src="captures/SpringCloudConfigEnabling.PNG">

<br>

### 2) Concul Config

<br>
Pour utiliser Concul Config il faut tout d'abord ajouter la dependance suivante :

```markdown
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-consul-config</artifactId>
</dependency>
```
<br>

L'interface Concul où on a enregistrer notre configuration : 
<br>

<img src="captures/ConculConfigPage.PNG">

<br>

Pour utiliser la configuration dans chaque microservice on doit l'importer :

<img src="captures/ConculConfigProps.PNG">

<br>
Et pour tester si la config est bien importé on utilise une class RestController
<br>

<img src="captures/ConculConfigConfigTest.PNG">

<br>


### 2) Vault Config

<br>
Pour utiliser Vault Config il faut tout d'abord ajouter la dependance suivante :

```markdown
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-vault-config</artifactId>
</dependency>
```
<br>

L'interface Vault où on a enregistrer notre configuration :
<br>

<img src="captures/VaultConfigPage.PNG">

<br>

Pour utiliser la configuration dans chaque microservice on doit la configurer et l'importer :

<img src="captures/VaultConfigProps.PNG">

<br>
Et pour tester si la config est bien importé on utilise une class RestController
<br>

<img src="captures/ConculConfigTokenClass.PNG">

<br>

<img src="captures/VaultConfigTokenClass.PNG">

<br>

<img src="captures/Vault&ConculClassTest.PNG">

<br>
