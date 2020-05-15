# JEE-ORM-JPA-Hibernate-Spring
JEE-ORM-JPA-Hibernate-Spring

##Application pour gerer des produits qui permet de :
 *   Ajouter et Ajouter un produit
 *   Consulter tous les produits
 *   Consulter les produits dont le nom contient un mot cle
 *   Metre a jour un produit
 *   Supprimer un produit
##Chaque produit est defini par:
 *   Id : de type Long auto-incremente
 *   Designation de type string
 *   Prix de type Double
 *   Quantite de type entier
##Les donnes sont stockees dans MySQL
##Maven poue gestion des dependances
##L'application se compose de deux couches:
 *   La couche DAO formee de :
        Une interface IProduitDao
        Une classe SingletonConnection
        Une implementation JDBC de cette interface dans laquelle on fait le mapping objet relationnelle
        Une classe TestDao
 *   La couche Web formee par:
        Un seul controleur(servlet)
        Un Modele
        Des vues JSP
****************************************************
##create project => spring starter project(springboot) => +mysql +JPA

creation des Entitees 
puis application.properties  
creation database 
interface DAO => generic:EntityRepository
implementation dao
