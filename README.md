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

