/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.lisandroJimenez.webapp.service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import java.util.List;
import org.lisandroJimenez.webapp.model.Carro;
import org.lisandroJimenez.webapp.util.JPAUtil;

/**
 *
 * @author Usuario
 */
public class CarroService implements ICarroService {
    private EntityManager em;
    public CarroService(){
        this.em = JPAUtil.getEntityManager();
    }
    
    @Override
    public List<Carro> listarCarro() {
        return em.createQuery("SELECT c FROM Carro c", Carro.class).getResultList();
    }

    @Override
    public void agregarCarro(Carro carro) {
        EntityTransaction transaction = em.getTransaction();
        try{
            transaction.begin();
            em.persist(carro);
            transaction.commit();
        }catch(Exception e){
            if(transaction == null){
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}
