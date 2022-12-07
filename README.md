# projectjava_impotvehicule

#	Classe Societe:
###	La méthode getImpots(int annee) retourne un enregistrement Impots qui correspond à annee  à partir de la liste des impôts
###	La méthode add(Impots imp)  ajoute un enregistrement Impots à sa liste des impôts
###	La méthode toString() retourne l’id et la raison sociale de la société
#	Classe Impots 	 :
###	La méthode add(Dossier d) ajoute un dossier à la liste des dossiers d’un enregistrement Impots
###	La méthode toString() retourne le détail de la liste des dossiers (voir exécution)
#	Classe Dossier 	 :
###	La méthode calculerMontant() est absraite
#	Classe DossierVehicule 	 :
###	La méthode toString retourne le détail d’un dossier sous la forme : Vehicule E 6 CH, montant:350.0 
###	La méthode calculerMontant() calcule le montant selon le tableau ci-dessous
#	Classe DossierRevenus 	 :
###	La méthode toString retourne le détail d’un dossier sous la forme : 15% de revenus 1000000.0: 150000.0
###	La méthode calculerMontant() calcule le montant des impôts qui représente 15% du chiffre d’affaire ca
####Le montant des impôts des véhicules dépend du nombre de chevaux et de la catégorie du véhicule selon le tableau suivant :
Catégorie/ nb Chevaux	Inférieur à 8 CH	De 8 à 10 CH	De 11 à 14 CH	Sup ou égal à 15 CH
Véhicule à moteur Essence	350 DH	650 DH	3000 DH	8000 DH
Véhicule à moteur Gasoil	700 DH	1500 DH	6000 DH	20.000 DH
