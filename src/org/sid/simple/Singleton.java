package org.sid.simple;

/**
 * Implémentation simple d'un singleton.
 * L'instance est créée à l'initialisation.
 */
public class Singleton {

    /** Constructeur privé */
    private Singleton()
    {}

    /** Instance unique pré-initialisée */
    private static Singleton INSTANCE = new Singleton();

    /** Point d'accès pour l'instance unique du singleton */
    public static Singleton getInstance()
    {   return INSTANCE;
    }
}
/*
* Lazy-loading -----
* Dans l'implémentation ci-dessus,
*  l'instance du Singleton est automatiquement créée
*  au chargement de la classe par son classloader.
Bien qu'il s'agisse de la meilleure solution dans
* la plupart des cas, il peut arriver que l'on souhaite
*  retarder l'initialisation de l'instance jusqu'au premier
*  appel de "getInstance()". Cela se justifie par exemple
*  si le programme n'a pas systématiquement besoin des services du singleton.*/