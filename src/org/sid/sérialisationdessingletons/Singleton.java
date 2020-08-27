package org.sid.sérialisationdessingletons;
/*
* Pour finir, rappelez-vous qu'il existe une seconde façon d'instancier des objets : par désérialisation.

Si votre Singleton implémente java.io.Serializable, il faut absolument empêcher que sa désérialisation n'entraîne la création de nouvelles instances. Pour cela, la javadoc indique que la méthode "readResolve()" permet de remplacer tout objet désérialisé par un objet personnalisé. Utilisons cela à notre avantage :*/

import java.io.Serializable;

public class Singleton implements Serializable {

    /**
     * Constructeur privé
     */
    private Singleton() {
    }

    /**
     * Instance unique pré-initialisée
     */
    private static Singleton INSTANCE = new Singleton();

    /**
     * Point d'accès pour l'instance unique du singleton
     */
    public static Singleton getInstance() {
        return INSTANCE;
    }

    /**
     * Sécurité anti-désérialisation
     */
    private Object readResolve() {
        return INSTANCE;
    }
}
 // Ainsi, toute instance désérialisée du Singleton sera remplacée par notre instance unique.