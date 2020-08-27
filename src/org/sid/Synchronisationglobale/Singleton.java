package org.sid.Synchronisationglobale;

//Afin de résoudre ce problème de concurrence des threads, on peut évidemment synchroniser la méthode "getInstance()" :
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
    public static synchronized Singleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
}
/*
* Le problème est ainsi résolu, mais au prix d'une pénalité sur les performances.
* Si le singleton est accédé souvent (système de log...),
*  le ralentissement de l'application peut être important.*/