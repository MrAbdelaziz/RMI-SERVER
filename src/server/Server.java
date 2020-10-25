/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;


import java.rmi.registry.LocateRegistry;
import java.util.Hashtable;
import javax.naming.Context;
import javax.naming.InitialContext;

import Impl.*;

/**
 *
 * @author a
 */
public class Server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
   
            System.out.println("Serveur : Construction .. ");
            
            Reverse rev = new Reverse();
            Trielist tl = new Trielist();
            Produit pr = new Produit();
            Palindrome pl = new Palindrome();
            
            System.out.println("Objet Reverse liee dans le RMIregistry");
            LocateRegistry.createRegistry(1099);
            /* RMI  
		            //Naming
		            Naming.rebind("rmi://localhost/rev", rev);
		            Naming.rebind("rmi://localhost/trie", tl);
		            Naming.rebind("rmi://localhost/produit", pr);
		            Naming.rebind("rmi://localhost/palindrome", pl); 
            */
            
       //JNDI
        	final Hashtable<Object, Object> jndiProperties = new Hashtable<Object, Object>();
            jndiProperties.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.rmi.registry.RegistryContextFactory");
            jndiProperties.put(Context.PROVIDER_URL, "rmi://localhost:1099");
            
            InitialContext ctx = new InitialContext(jndiProperties);
            ctx.bind("palindrome", pl);
        	
        	System.out.println("Attente des clients !");
        	
        } catch (Exception e) {
            System.out.println("Erreur de liaison de l'objet Reverse");
            System.out.println(e.toString());
        }

    }

}
