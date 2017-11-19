package com.wrox;

import java.time.Instant;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class Ticket {
	private String customerName;
	private String Subject;
	private String body;
	private Instant dateCreated;
	private Map<String, Attachment> attachments = new LinkedHashMap<>();
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getSubject() {
		return Subject;
	}
	public void setSubject(String subject) {
		Subject = subject;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public Attachment getAttachment(String name) {
		return this.attachments.get(name);
	}
	public Collection<Attachment> getAttachments() {
		return this.attachments.values();
	}
	public void addAttachment(Attachment attachment) {
		this.attachments.put(attachment.getName(), attachment);
	}
	public int getNumberOfAttachments() {
		return this.attachments.size();
	}
	public Instant getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Instant dateCreated) {
		this.dateCreated = dateCreated;
	}
}