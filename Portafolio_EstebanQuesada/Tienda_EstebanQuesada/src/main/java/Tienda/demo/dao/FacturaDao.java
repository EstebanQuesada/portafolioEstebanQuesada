/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Tienda.demo.dao;

/**
 *
 * @author EsteP
 */
 import Tienda.demo.domain.Factura;
 import org.springframework.data.jpa.repository.JpaRepository;
 public interface FacturaDao extends JpaRepository <Factura,Long> {
 }