package com.forum.units;

public class Upvote extends AbstractEntity {
	
	private Question question;				//question for which user has upvoted
	
	private Reply reply;					//reply for which user has upvoted
	
	private User user;						//user who has upvoted for either of question xor answer
	
	private static Long lastEntry = 0L;		//id for the last upvote on discussion forum
	
	public void autoGenerateId() {
		lastEntry = lastEntry + 1L;
		super.setId(lastEntry);
	}
	
	public Question getQuestion() {
		return question;
	}
	
	public void setQuestion(Question question) {
		this.question = question;
	}
	
	public Reply getReply() {
		return reply;
	}
	
	public void setReply(Reply reply) {
		this.reply = reply;
	}
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}

	@Override
	void autoGeneratedId() {

	}
}
