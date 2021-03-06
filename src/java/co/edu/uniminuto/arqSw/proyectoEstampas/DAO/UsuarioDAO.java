/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.uniminuto.arqSw.proyectoEstampas.DAO;
import co.edu.uniminuto.arqSw.proyectoEstampas.Hibernate.HibernateUtil;
import co.edu.uniminuto.arqSw.proyectoEstampas.Hibernate.Usuario;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author TIC-SCI
 */
public class UsuarioDAO {
    
    
    Session session = null; 
    
    public UsuarioDAO() { 
        
        this.session = HibernateUtil.getSessionFactory().getCurrentSession(); 
    }
    
    
    public List<Usuario> getUsuarios(){ 
        
        List<Usuario> misPersonas=new ArrayList<Usuario>(); 
        
            try{ 
                
                Transaction tx = session.beginTransaction(); 
                Query q= session.createQuery("from Usuario"); 
                misPersonas = (List<Usuario>)q.list(); 
                
            }catch(Exception e){ 
                e.printStackTrace(); 
            }
            
                return misPersonas; 
    }
    
    
    
}
