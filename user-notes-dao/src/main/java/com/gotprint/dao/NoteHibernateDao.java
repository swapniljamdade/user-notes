package com.gotprint.dao;

import java.util.List;

import com.gotprint.domain.Note;

public interface NoteHibernateDao {
	
	List<Note> getUserNotes(String userEmail);
	
}
