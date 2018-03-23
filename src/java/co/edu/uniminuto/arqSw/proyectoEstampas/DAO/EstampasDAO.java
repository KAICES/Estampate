/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.uniminuto.arqSw.proyectoEstampas.DAO;
import co.edu.uniminuto.arqSw.proyectoEstampas.Hibernate.Estampas;
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
public class EstampasDAO {

    
     Session session = null; 
    
    public EstampasDAO() { 
        
        this.session = HibernateUtil.getSessionFactory().getCurrentSession(); 
    }
    
    
    public List<Estampas> getEstampas(){ 
        
        List<Estampas> misPersonas=new ArrayList<Estampas>(); 
        
            try{ 
                
                Transaction tx = session.beginTransaction(); 
                Query q= session.createQuery("from Estampas"); 
                misPersonas = (List<Estampas>)q.list(); 
                
            }catch(Exception e){ 
                e.printStackTrace(); 
            }
            
                return misPersonas; 
    }
    
    
    
    
}
