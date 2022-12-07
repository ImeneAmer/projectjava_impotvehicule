# projectjava_impotvehicule

######	Classe Societe:
*	La méthode getImpots(int annee) retourne un enregistrement Impots qui correspond à annee  à partir de la liste des impôts
*	La méthode add(Impots imp)  ajoute un enregistrement Impots à sa liste des impôts
*	La méthode toString() retourne l’id et la raison sociale de la société
######	Classe Impots 	 :
*	La méthode add(Dossier d) ajoute un dossier à la liste des dossiers d’un enregistrement Impots
* La méthode toString() retourne le détail de la liste des dossiers (voir exécution)
######	Classe Dossier 	 :
*	La méthode calculerMontant() est absraite
######	Classe DossierVehicule 	 :
*	La méthode toString retourne le détail d’un dossier sous la forme : Vehicule E 6 CH, montant:350.0 
* La méthode calculerMontant() calcule le montant selon le tableau ci-dessous
###### Classe DossierRevenus 	 :
* La méthode toString retourne le détail d’un dossier sous la forme : 15% de revenus 1000000.0: 150000.0
* La méthode calculerMontant() calcule le montant des impôts qui représente 15% du chiffre d’affaire ca
##### Le montant des impôts des véhicules dépend du nombre de chevaux et de la catégorie du véhicule  :


| categorie/nb chevaux           | <8ch    |  de 8 a 10 ch   | de 11 a 14ch   | >15 ch |
|--------------------------------|---------|-----------------|----------------|--------|
|Véhicule à moteur Essence       |350 dh   |650 dh           |3000 dh         |8000dh  |
|Véhicule à moteur Gasoil        |700 dh   |1500 dh          |6000 dh         |8000dh  |
