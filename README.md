# TP5_architecture_micro_service-main
Activité pratique N° 5 : Mise en oeuvre d'une architecture micro-service

1.Créer le micro service Customer-service
 
•Créer l’entité Customer 

•Créer l’interface CustomerRepository basée sur Spring Data 

•Déployer l’API Restful du micro-service en utilisant Spring Data Rest 

•Tester le Micro service

2.Créer le micro service Inventory-service 

 • Créer l’entité Product
     
 • Créer l’interface ProductRepository basée sur Spring Data 
     
 • Déployer l’API Restful du micro-service en utilisant Spring Data Rest
     
 • Tester le Micro service
     
3.Créer la Gateway service en utilisant Spring Cloud Gateway

4.Tester la Service proxy en utilisant une configuration Statique basée sur le fichier application.yml

5.Tester la Service proxy en utilisant une configuration Statique basée une configuration Java

6.Créer l’annuaire Registry Service basé sur NetFlix Eureka Server

7.Tester le proxy en utilisant une configuration dynamique de Gestion des routes vers les micro services enregistrés dans l’annuaire Eureka Server

8.Créer Le service Billing-Service en utilisant Open Feign pour communiquer avec les services Customer-service et Inventory-service

9.Créer un client Angular qui permet d’afficher une facture




### 1.Créer le micro service Customer-service:

1.Test customers:Get all customers en utilisant: http://localhost:8081/customers
     
<img width="871" alt="1_tester" src="https://github.com/HafidaaHatim/TP-N-4-Mise-en-oeuvre-d-un-micro-service/assets/130146750/ced55c9b-f5a2-4f1a-b62b-4e920c6fc236">
     
<img width="468" alt="2_unseulcustomer" src="https://github.com/HafidaaHatim/TP-N-4-Mise-en-oeuvre-d-un-micro-service/assets/130146750/7adead33-78b4-4761-b255-9fd25ccd6e27">
     
 2.Consultation de la base de donnees : customer-db
     
 <img width="696" alt="4_base_des_données" src="https://github.com/HafidaaHatim/TP-N-4-Mise-en-oeuvre-d-un-micro-service/assets/130146750/50ad2b88-07f7-411a-8f44-0448aeb84286">
 
### 2.Créer le micro service Inventory-service

 1.Consultation de la base de donnees : inventory-db
 
 <img width="448" alt="1_inventoryservice" src="https://github.com/HafidaaHatim/TP-N-4-Mise-en-oeuvre-d-un-micro-service/assets/130146750/e0c8a834-ab6f-4c56-9f4e-bee71d30e68b">

2.Test products:Get all products en utilisant: http://localhost:8082/products

<img width="661" alt="2_products" src="https://github.com/HafidaaHatim/TP-N-4-Mise-en-oeuvre-d-un-micro-service/assets/130146750/ad9943d0-1fed-414b-a8d9-b8bdb5feb546">

### 3.Créer la Gateway service en utilisant Spring Cloud Gateway
1.Customers with gateway en utilisant une configuration Statique basée sur le fichier application.yml :

<img width="652" alt="gateway_customers" src="https://github.com/HafidaaHatim/TP-N-4-Mise-en-oeuvre-d-un-micro-service/assets/130146750/4f3e6e68-5e69-48be-930b-85999c45c311">

2.Products with gateway  en utilisant une configuration Statique basée sur le fichier application.yml :

<img width="527" alt="gateway_products_withfunctionroute" src="https://github.com/HafidaaHatim/TP-N-4-Mise-en-oeuvre-d-un-micro-service/assets/130146750/9a10b79a-07bd-4642-935c-353f8462ef08">

3.Customers with gateway en utilisant une configuration Statique basée une configuration Java

<img width="544" alt="customers_withfunctionroute" src="https://github.com/HafidaaHatim/TP-N-4-Mise-en-oeuvre-d-un-micro-service/assets/130146750/ab90b271-4abd-4f11-8a66-11c57ec2b659">

4.Products with gateway en utilisant une configuration Statique basée une configuration Java

<img width="637" alt="gateway_products" src="https://github.com/HafidaaHatim/TP-N-4-Mise-en-oeuvre-d-un-micro-service/assets/130146750/09d9dfeb-5c72-429d-b3aa-574f285d508b">

### 6.Créer l’annuaire Registry Service basé sur NetFlix Eureka Server

<img width="960" alt="SpringEureka_services" src="https://github.com/HafidaaHatim/TP-N-4-Mise-en-oeuvre-d-un-micro-service/assets/130146750/2cb7e543-ce22-480b-9e69-838bafe6e8ae">

### 7.Tester le proxy en utilisant une configuration dynamique de Gestion des routes vers les micro services enregistrés dans l'annuaire Eureka Server

<img width="614" alt="gateway_dynamique" src="https://github.com/HafidaaHatim/TP-N-4-Mise-en-oeuvre-d-un-micro-service/assets/130146750/e1d9285d-109c-4fcd-b807-71c318b3700c">

### 8.Créer Le service Billing-Service en utilisant Open Feign pour communiquer avec les services Customer-service et Inventory-service
H2 Console Bill :

<img width="383" alt="facture" src="https://github.com/HafidaaHatim/TP-N-4-Mise-en-oeuvre-d-un-micro-service/assets/130146750/5b538870-b93c-4683-ba30-9e188c9a0c21">

H2 Console Product Item :

<img width="513" alt="productItem" src="https://github.com/HafidaaHatim/TP-N-4-Mise-en-oeuvre-d-un-micro-service/assets/130146750/40cc262b-128c-4100-b474-45b3c6298e24">

Gatewaye presente toute les données de la facture :

<img width="913" alt="BillinService-fullbill" src="https://github.com/HafidaaHatim/TP-N-4-Mise-en-oeuvre-d-un-micro-service/assets/130146750/5f0f2bee-ca4f-438f-8e8f-70a24525b125">

Billing-service :

<img width="947" alt="localhostebillinservice" src="https://github.com/HafidaaHatim/TP-N-4-Mise-en-oeuvre-d-un-micro-service/assets/130146750/331b62c5-ff4c-4d14-b0ff-6b6ee0ea96e7">

### 9.Créer un client Angular qui permet d’afficher une facture













