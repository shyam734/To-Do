package com.todo.model;

import java.util.Date;
import java.util.Random;

import  javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Note {
	
	@Id
	
	private int id;
	private String noteTitle;
	private String noteContent;
	private Date noteDate;
	private Date lastUpdated;
	
	
	
	
	public Date getLastUpdated() {
		return lastUpdated;
	}
	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
	public Note(String noteTitle, String noteContent, Date noteDate,Date lastUpdated) {
		
		super();
		this.id=new Random().nextInt(1000);
		this.noteTitle = noteTitle;
		this.noteContent = noteContent;
		this.noteDate = noteDate;
		this.lastUpdated=lastUpdated;
	}
	public Note() {
		super();
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		
		
		this.id = id;
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
	public Date getNoteDate() {
		return noteDate;
	}
	public void setNoteDate(Date noteDate) {
		this.noteDate = noteDate;
	}
	
	
	

}
