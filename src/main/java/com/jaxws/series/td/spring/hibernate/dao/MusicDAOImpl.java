package com.jaxws.series.td.spring.hibernate.dao;
 
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
 
import com.jaxws.series.td.spring.hibernate.model.Music;
 
@Transactional(value="transactionManager")
public class MusicDAOImpl{
 
    public static final String MUSIC_COMPOSER = "AR Rahman";
 
    
    //@autowired kaldırıldı.
    private SessionFactory sessionFactory;
 
    
    public SessionFactory getSessionFactory() {
		return sessionFactory;
	}


	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	public static String getMusicComposer() {
		return MUSIC_COMPOSER;
	}



    public List<Music> getAllMoviesByComposer(String composerName) {
 
        // local variables
        List<Music> lstMusic = null;
 
        if(null != composerName && composerName.equalsIgnoreCase(getMusicComposer())){
 
            // get all books info from database
            lstMusic = getSessionFactory().getCurrentSession().getNamedQuery("HQL_GET_MUSIC_BY_COMPOSER_ID").list();
        }
        return lstMusic;
    }
}