/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.lisandroJimenez.webapp.util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 *
 * @author Usuario
 */
public class JPAUtil {
    private static final EntityManagerFactory emf = buildEntityManegerFactory();

    public static EntityManagerFactory buildEntityManegerFactory() {
        try {
            return Persistence.createEntityManagerFactory("SGBDCarros");
        } catch (Throwable e) {
            e.printStackTrace();
            throw new ExceptionInInitializerError(e);
        }

    }

    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
    public static void close(){
        emf.close();
    }
}
