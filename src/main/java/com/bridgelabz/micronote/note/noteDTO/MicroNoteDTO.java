package com.bridgelabz.micronote.note.noteDTO;

public class MicroNoteDTO {
	private String title;
	private String content;  
	private String color;
	public MicroNoteDTO() {
		super();
	}
	public MicroNoteDTO(String title, String content) {

		this.title = title;
		this.content= content;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "NoteDto [title=" + title + ", content=" + content + "]";
	}
}



