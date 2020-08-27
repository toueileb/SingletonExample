package org.sid.Synchronisationlocale;

/*
 * Si l'on est attentif, on s'aperçoit que la synchronisation n'est requise qu'au moment exact de la création de l'instance. Ne pourrait-on donc pas distinguer supprimer la synchronisation globale sur la méthode,
 *  et ne l'appliquer que dans le cas où l'instance doit être créée ?*/
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
            synchronized (Singleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton();
                }
            }
        }
        return INSTANCE;
    }
}
 // Hélas, cette solution, appelée "double-checked locking", ne fonctionne pas non plus