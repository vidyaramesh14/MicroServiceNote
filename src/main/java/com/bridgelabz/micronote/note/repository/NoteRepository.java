package com.bridgelabz.micronote.note.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.bridgelabz.micronote.note.model.MicroNoteModel;


@Repository
public interface NoteRepository extends JpaRepository<MicroNoteModel, Long>{
	
}

