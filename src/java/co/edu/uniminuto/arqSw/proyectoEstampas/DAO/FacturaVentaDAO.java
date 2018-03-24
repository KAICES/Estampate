/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.uniminuto.arqSw.proyectoEstampas.DAO;

import co.edu.uniminuto.arqSw.proyectoEstampas.Hibernate.Camisetas;
import co.edu.uniminuto.arqSw.proyectoEstampas.Hibernate.FacturaVenta;
import co.edu.uniminuto.arqSw.proyectoEstampas.Hibernate.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author TIC-SCI
 */
public class FacturaVentaDAO {
 
            Session session = null; 
    
    public FacturaVentaDAO() { 
        
        this.session = HibernateUtil.getSessionFactory().getCurrentSession(); 
    }
    
    public List<FacturaVenta> getFacturaVenta(){ 
        
        List<FacturaVenta> misFacturaVenta=new ArrayList<FacturaVenta>(); 
        
            try{ 
                
                Transaction tx = session.beginTransaction(); 
                Query q= session.createQuery("from FacturaVenta"); 
                misFacturaVenta = (List<FacturaVenta>)q.list(); 
                
    }catch(Exception e){ 
        e.printStackTrace(); 
    }
            
        return misFacturaVenta; 
    }
    
    
    
}
