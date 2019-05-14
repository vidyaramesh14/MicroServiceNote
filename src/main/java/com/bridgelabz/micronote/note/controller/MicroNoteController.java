package com.bridgelabz.micronote.note.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.bridgelabz.micronote.NoteUtil.Response;
import com.bridgelabz.micronote.note.model.User;
import com.bridgelabz.micronote.note.noteDTO.MicroNoteDTO;
import com.bridgelabz.micronote.note.service.MicroNoteserviceImpl;

@RestController
public class MicroNoteController {
	@Autowired
	private MicroNoteserviceImpl note_services;	
	@PostMapping("/createnote")
	public ResponseEntity<Response> create_Note(@RequestBody MicroNoteDTO notedto,@RequestHeader(name="JWT-Token")String token) throws Exception
	{ 
		Response response=note_services.createNote(notedto, token);
		return new ResponseEntity<Response>(response,HttpStatus.OK);
	}
	@PutMapping("/updatenote")
	public ResponseEntity<Response> update_Note(@RequestParam(value ="note_id") Long note_id,@RequestBody MicroNoteDTO note,@RequestHeader("JWT-Token") String token) throws Exception {
		Response response=note_services.updateNote(note_id,note,token);
		return new ResponseEntity<Response>(response,HttpStatus.OK);
	}
	
	@PutMapping("/deletenote")
	public ResponseEntity<Response> delete(@RequestParam(value ="note_id") Long note_id ,@RequestHeader(name="JWT-Token")String token) throws Exception {
		Response response=note_services.deleteNote(note_id, token);
		return new ResponseEntity<Response>(response,HttpStatus.OK);
	}
	//addUser
//	@GetMapping("/getUser")
//	public User addUserToNote() throws Exception {
//		User user =note_services.userInfo();
//		return user;
//	
//	}
}
