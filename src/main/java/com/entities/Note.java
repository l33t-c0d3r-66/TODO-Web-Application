package com.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Note 
{
	@Id
	@GeneratedValue
	private int noteId;
	private String noteTitle;
	private String noteContent;
	private Date dateAdded;
	
	public Note() {
		super();
	}
	public Note(String noteTitle, String noteContent, Date dateAdded) {
		super();
		this.noteTitle = noteTitle;
		this.noteContent = noteContent;
		this.dateAdded = dateAdded;
	}
	public int getNoteId() {
		return noteId;
	}
	public void setNoteId(int noteId) {
		this.noteId = noteId;
	}
	public String getNoteTitle() {
		return noteTitle;
	}
	public void setNoteTitle(String noteTitle) {
		this.noteTitle = noteTitle;
	}
	public String getNoteContent() {
		return noteContent;
	}
	public void setNoteContent(String noteContent) {
		this.noteContent = noteContent;
	}
	public Date getDateAdded() {
		return dateAdded;
	}
	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}
	@Override
	public String toString() {
		return "Note [noteId=" + noteId + ", noteTitle=" + noteTitle + ", noteContent=" + noteContent + ", dateAdded="
				+ dateAdded + "]";
	}
	
	
}
