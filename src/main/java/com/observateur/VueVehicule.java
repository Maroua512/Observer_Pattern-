package com.observateur;

public class VueVehicule  implements IVueVehicule {
    private final IVehicule vehicule;

    public VueVehicule(IVehicule vehicule) {
        if (vehicule == null) {
            throw new IllegalArgumentException("Le véhicule ne peut pas être null");
        }
        this.vehicule = vehicule;
    }

    @Override
    public void actualise() {
      
        System.out.println("La vue " + this.vehicule.getDescription() + " a été actualisée et le prix est " + this.vehicule.getPrix());
    }
    
}
