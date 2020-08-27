package org.sid.basique;

// Voici l'implémentation la plus fréquente :
public class Singleton {

    /**
     * Constructeur privé
     */
    private Singleton() {
    }

    /**
     * Instance unique non préinitialisée
     */
    private static Singleton INSTANCE = null;

    /**
     * Point d'accès pour l'instance unique du singleton
     */
    public static Singleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
}
/*
* Cette implémentation semble correcte à première vue.
Pourtant, elle est extrêmement dangereuse en environnement multithreadé,
*  car deux threads peuvent exécuter le test simultanément
*  et créer ainsi chacun une instance du singleton.
*  Elle doit donc être absolument proscrite.*/