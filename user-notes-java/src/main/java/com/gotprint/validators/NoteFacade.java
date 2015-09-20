package com.gotprint.validators;

import java.util.List;

import com.gotprint.dao.NoteHibernateDao;
import com.gotprint.domain.Note;
import com.gotprint.impl.NoteHibernateDaoImpl;

public class NoteFacade {

	public List<Note> getUserNotes(String userEmail) {
		NoteHibernateDao noteHibernateDao = new NoteHibernateDaoImpl();
		return noteHibernateDao.getUserNotes(userEmail);
	}

}
