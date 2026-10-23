package com.observateur;



public class App {
    public static void main(String[] args) {
        Vehicule v1 = new Vehicule("Voiture", 20000);
        VueVehicule vue1 = new VueVehicule(v1);
        VueVehicule vue2 = new VueVehicule(v1);

        // Cas 1 : les deux observateurs sont notifies lors d'une modification.
        v1.ajouterVueVehicule(vue1);
        v1.ajouterVueVehicule(vue2);
        v1.setPrix(25000);

        // Cas 2 : un observateur retire ne recoit plus de notification.
        v1.retirerVueVehicule(vue2);
        v1.setDescription("Voiture de luxe");

        // Cas 3 : l'ajout repete d'un observateur ne cree pas de doublon.
        v1.ajouterVueVehicule(vue1);
        v1.setPrix(30000);

        // Cas 4 : aucune notification si la valeur reste identique.
        v1.setPrix(30000);

    }
}
