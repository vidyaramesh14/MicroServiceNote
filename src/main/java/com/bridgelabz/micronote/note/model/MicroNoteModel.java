package com.bridgelabz.micronote.note.model;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import org.springframework.format.annotation.DateTimeFormat;
@Entity
@Table(name="notes")
public class MicroNoteModel {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long note_id;
	private String title;
	private String content;
	private boolean isArchive;
	private boolean isPined;
	private boolean isTrashed;
	private String color;
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private LocalDateTime created_date;
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private LocalDateTime update_date;	
	private Date remind;
	private String remindme;
	private Long userId;
	//@ManyToMany
	
	//(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	//@JoinTable(name = "collaborator", joinColumns = @JoinColumn(name = "note_id"), inverseJoinColumns = @JoinColumn(name = "id"))
	//private List<User> collaboratedUser;
	
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public void setNote_id(Long note_id) {
		this.note_id = note_id;
	}
	public String getRemindme() {
		return remindme;
	}
	public void setRemindme(String remindme) {
		this.remindme = remindme;
	}

	private String NoteImage;

	public String getNoteImage() {
		return NoteImage;
	}
	public void setNoteImage(String noteImage) {
		NoteImage = noteImage;
	}
	public Date getRemind() {
		return remind;
	}
	public void setRemind(Date date) {
		this.remind = date;
	}

	public Long getNote_id() {
		return note_id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isArchive() {
		return isArchive;
	}
	public void setArchive(boolean isArchive) {
		this.isArchive = isArchive;
	}
	public boolean isPined() {
		return isPined;
	}
	public void setPined(boolean isPined) {
		this.isPined = isPined;
	}
	public boolean isTrashed() {
		return isTrashed;
	}
	public void setTrashed(boolean isTrashed) {
		this.isTrashed = isTrashed;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public LocalDateTime getCreated_date() {
		return created_date;
	}
	public void setCreated_date(LocalDateTime created_date) {
		this.created_date = created_date;
	}
	public LocalDateTime getUpdate_date() {
		return update_date;
	}
	public void setUpdate_date(LocalDateTime update_date) {
		this.update_date = update_date;
	}

	@Override
	public String toString() 
	{
		return "Note [note_id=" + ", title=" + title + ", content=" + content + ", isArchive=" + isArchive
				+ ", isPined=" + isPined + ", isTrashed=" + isTrashed + ", color=" + color + " remind=" + remind + ", created_date=" + created_date + ", update_date="
				+ update_date + "]";
	}
}
