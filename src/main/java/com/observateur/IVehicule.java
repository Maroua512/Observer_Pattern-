package com.observateur;

public interface IVehicule {
    void ajouterVueVehicule(IVueVehicule IVueVehicule);
    void retirerVueVehicule(IVueVehicule  IVueVehicule);
    void notifierVuesVehicule();
    String getDescription();
    double getPrix();

}
