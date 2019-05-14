package com.bridgelabz.micronote.note.service;
import java.util.List;

import com.bridgelabz.micronote.NoteUtil.Response;
import com.bridgelabz.micronote.note.model.MicroNoteModel;
import com.bridgelabz.micronote.note.noteDTO.MicroNoteDTO;

public interface MicroNoteService {
	public Response createNote(MicroNoteDTO noteDto, String token) throws Exception;
	public Response updateNote(Long note_id,MicroNoteDTO note,String token) throws Exception;
	public List<MicroNoteModel> getAllNotes(String token)throws Exception;
	public Response deleteNote(Long noteId,String token) throws Exception;
}
