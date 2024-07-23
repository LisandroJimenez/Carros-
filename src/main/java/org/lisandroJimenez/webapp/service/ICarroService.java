/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.lisandroJimenez.webapp.service;

import java.util.List;
import org.lisandroJimenez.webapp.model.Carro;

public interface ICarroService {
     public List<Carro>listarCarro();
    
    public void agregarCarro(Carro carro);

}
