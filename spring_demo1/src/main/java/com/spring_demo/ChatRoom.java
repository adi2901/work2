package com.spring_demo;

import java.util.*;

public class ChatRoom 
{
private Set<String> users;
private List<String> messages;


public ChatRoom() {
	super();
	// TODO Auto-generated constructor stub
}

public ChatRoom(Set<String> users,List<String> messages) {
	super();
	this.users = users;
	this.messages = messages;
}


public Set<String> getUsers() {
	return users;
}

public void setUsers(Set<String> users) {
	this.users = users;
}

public List<String> getMessages() {
	return messages;
}

public void setMessages(List<String> messages) {
	this.messages = messages;
}

@Override
public String toString() {
	return "ChatRoom [users=" + users + ", messages=" + messages + "]";
}


}
