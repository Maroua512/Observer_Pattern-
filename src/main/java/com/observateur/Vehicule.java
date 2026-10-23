package com.observateur;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Vehicule implements IVehicule {
    private String description;
    private double prix;

    private final Set<IVueVehicule> vuesVehicule;

    public Vehicule(String description, double prix) {
        this.description = description;
        this.prix = prix;
        this.vuesVehicule = new HashSet<>();
    }

    @Override
    public void ajouterVueVehicule(IVueVehicule vueVehicule) {
        if (vueVehicule == null) {
            throw new IllegalArgumentException("La vue ne peut pas être nulle");
        }
        vuesVehicule.add(vueVehicule);
    }

    @Override
    public void retirerVueVehicule(IVueVehicule vueVehicule) {
        vuesVehicule.remove(vueVehicule);
    }

    @Override
    public void notifierVuesVehicule() {
        for (IVueVehicule vue : vuesVehicule) {
            vue.actualise();
        }
    }
    
    
    public void setDescription(String description) {
        if (!Objects.equals(this.description, description)) {
            this.description = description;
            notifierVuesVehicule();
        }
    }

    public String getDescription() {
        return this.description;
    }
       
    public double getPrix() {
        return this.prix;
    }

    public void setPrix(double prix) {
        if (Double.compare(this.prix, prix) != 0) {
            this.prix = prix;
            notifierVuesVehicule();
        }
    }
        

    
}
