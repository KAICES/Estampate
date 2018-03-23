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
public class CamisetasDAO {
    
         Session session = null; 
    
    public CamisetasDAO() { 
        
        this.session = HibernateUtil.getSessionFactory().getCurrentSession(); 
    }
    
    public List<Camisetas> getCamisetas(){ 
        
        List<Camisetas> misCamisetas=new ArrayList<Camisetas>(); 
        
            try{ 
                
                Transaction tx = session.beginTransaction(); 
                Query q= session.createQuery("from Camisetas"); 
                misCamisetas = (List<Camisetas>)q.list(); 
                
    }catch(Exception e){ 
        e.printStackTrace(); 
    }
            
        return misCamisetas; 
    }
    
    
}
