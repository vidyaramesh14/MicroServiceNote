package com.bridgelabz.micronote.note.service;

import java.time.LocalDateTime;
import java.util.List;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bridgelabz.micronote.NoteUtil.Response;
import com.bridgelabz.micronote.NoteUtil.ResponseUtil;
import com.bridgelabz.micronote.NoteUtil.UserToken;
import com.bridgelabz.micronote.note.model.MicroNoteModel;
import com.bridgelabz.micronote.note.model.User;
import com.bridgelabz.micronote.note.noteDTO.MicroNoteDTO;
import com.bridgelabz.micronote.note.repository.NoteRepository;
@Service
public class MicroNoteserviceImpl implements MicroNoteService{
	@Autowired
	NoteRepository noterepository;	
	@Autowired
	ModelMapper modelmapper;
	//@Autowired
    private RestTemplate restTemplate= new RestTemplate();
	@Override
	public Response createNote(MicroNoteDTO notedto,String token) throws Exception {
		if(notedto.getTitle().isEmpty() | notedto.getContent().isEmpty())
		{
			throw new Exception("Invalid Input");
		}
		Long id=UserToken.verifyToken(token);
		MicroNoteModel note=modelmapper.map(notedto,MicroNoteModel.class);	
		note.setUserId(id);
		note.setCreated_date(LocalDateTime.now());
		note.setUpdate_date(LocalDateTime.now());	
		noterepository.save(note);
		Response response=ResponseUtil.getResponse(201,"Success");
		return response;
	}	
	
	@Override
	public Response updateNote(Long note_id, MicroNoteDTO note, String token) throws Exception {
		if(note.getTitle().isEmpty() || note.getContent().isEmpty())
		{
			throw new Exception("Invalid Input...");
		}
		Long user_id=UserToken.verifyToken(token);
		MicroNoteModel filterNote=noterepository.findById(note_id).orElseThrow(()->new Exception("there is no note..."));
		filterNote.setTitle(note.getTitle());
		filterNote.setContent(note.getContent());
		filterNote.setColor(note.getColor());
		filterNote.setUpdate_date(LocalDateTime.now());
		filterNote.setUserId(user_id);
		noterepository.save(filterNote);	
		Response response = ResponseUtil.getResponse(201,"Note Updated...");
		return response;
	}
	
	@Override
	public Response deleteNote(Long noteId, String token) throws Exception {
		MicroNoteModel note=noterepository.findById(noteId).orElseThrow( ()->new Exception("there is no Note..."));
		System.out.println("333333333"+String.valueOf(noteId));
		noterepository.delete(note);
		Response response = ResponseUtil.getResponse(200,"Note deleted...");
		return response;
	}
	@Override
	public List<MicroNoteModel> getAllNotes(String token) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	public User userInfo() throws Exception {
		//User user1=new User();
	String url = "http://localhost:8086/getUserId";
	User user=	 restTemplate.getForObject(url, User.class);
	
//	MicroNoteModel note=noterepository.findById(noteId).orElseThrow( ()->new Exception("there is no Note..."));
//	note.getCollaboratedUser().add(user);
//	noterepository.save(note);
//	Response response = ResponseUtil.getResponse(200,"User added...");
	return user;
		
	}
	

}
