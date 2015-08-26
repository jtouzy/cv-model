package com.jtouzy.cv.model.classes;

import java.time.LocalDateTime;

import com.jtouzy.dao.annotations.DAOTable;
import com.jtouzy.dao.annotations.DAOTableField;
import com.jtouzy.dao.annotations.DAOTableRelation;
import com.jtouzy.dao.db.DBType;

@DAOTable(tableName = "nws")
public class News {
	@DAOTableField(id = true, autoGenerated = true, name = "numnws", required = true, type = DBType.INTEGER)
	private Integer identifier;
	@DAOTableField(name = "titnws", length = 30, required = true, type = DBType.VARCHAR)
	private String title;
	@DAOTableField(name = "cntnws", length = 4000, required = true, type = DBType.VARCHAR)
	private String content;
	@DAOTableRelation(
		column = @DAOTableField(name = "autnws", required = true, type = DBType.INTEGER),
		relationColumn = "numusr"
	)
	private User author;
	@DAOTableField(name = "dcrnws", required = true, type = DBType.DATETIME)
	private LocalDateTime creationDate;
	@DAOTableField(name = "dpunws", type = DBType.DATETIME)
	private LocalDateTime publishDate;
	@DAOTableField(name = "stanws", required = true, type = DBType.ENUM)
	private News.State state;
	
	public Integer getIdentifier() {
		return identifier;
	}
	public void setIdentifier(Integer identifier) {
		this.identifier = identifier;
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
	public User getAuthor() {
		return author;
	}
	public void setAuthor(User author) {
		this.author = author;
	}
	public LocalDateTime getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(LocalDateTime creationDate) {
		this.creationDate = creationDate;
	}
	public LocalDateTime getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(LocalDateTime publishDate) {
		this.publishDate = publishDate;
	}
	public News.State getState() {
		return state;
	}
	public void setState(News.State state) {
		this.state = state;
	}

	public enum State {
		C, V
	}
}
