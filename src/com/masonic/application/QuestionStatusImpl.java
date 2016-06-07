package com.masonic.application;

import com.masonic.persistence.QuestionStatusOpal;

public class QuestionStatusImpl extends com.opal.AbstractIdentityImpl<QuestionStatus, QuestionStatusOpal> implements QuestionStatus {

	private final QuestionStatusOpal myQuestionStatusOpal;

	public QuestionStatusImpl(QuestionStatusOpal argQuestionStatusOpal) {
		super();
		myQuestionStatusOpal = org.apache.commons.lang3.Validate.notNull(argQuestionStatusOpal);
	}

	protected QuestionStatusOpal getQuestionStatusOpal() {
		return myQuestionStatusOpal;
	}

	@Override
	protected com.opal.IdentityOpal<? extends QuestionStatus> getOpal() {
		return getQuestionStatusOpal();
	}

	@Override
	protected com.opal.IdentityOpal<? extends QuestionStatus> getBottomOpal() {
		return getQuestionStatusOpal();
	}

	@Override
	public int compareTo(QuestionStatus argSecond) {
		return this.getSequenceAsObject().compareTo(argSecond.getSequenceAsObject());
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public java.lang.String getCode() {
		return getQuestionStatusOpal().getCode();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public QuestionStatusImpl setCode(java.lang.String argCode) {
		getQuestionStatusOpal().setCode(argCode);
		return this;
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 256L)
	@Override
	public java.lang.String getName() {
		return getQuestionStatusOpal().getName();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 256L)
	@Override
	public QuestionStatusImpl setName(java.lang.String argName) {
		getQuestionStatusOpal().setName(argName);
		return this;
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public java.lang.String getShortName() {
		return getQuestionStatusOpal().getShortName();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public QuestionStatusImpl setShortName(java.lang.String argShortName) {
		getQuestionStatusOpal().setShortName(argShortName);
		return this;
	}

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getSequenceAsObject() {
		return getQuestionStatusOpal().getSequenceAsObject();
	}

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public QuestionStatusImpl setSequence(java.lang.Integer argSequence) {
		getQuestionStatusOpal().setSequence(argSequence);
		return this;
	}

	@Override
	public QuestionStatusImpl setSequence(int argSequence) {
		getQuestionStatusOpal().setSequence(argSequence);
		return this;
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/* The following methods allow access to the user objects that have references
	to this object. */

	@Override
	public com.masonic.application.QuestionStatus addQuestion(Question argQuestion) {
		getQuestionStatusOpal().addQuestionOpal(((QuestionImpl) argQuestion).getQuestionOpal());
		return this;
	}

	@Override
	public com.masonic.application.QuestionStatus removeQuestion(Question argQuestion) {
		getQuestionStatusOpal().removeQuestionOpal(((QuestionImpl) argQuestion).getQuestionOpal());
		return this;
	}

	@Override
	public int getQuestionCount() {
		return getQuestionStatusOpal().getQuestionOpalCount();
	}

	@Override
	public java.util.stream.Stream<Question> streamQuestion() {
		return getQuestionStatusOpal().streamQuestionOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<Question> createQuestionIterator() {
		return new com.opal.OpalIterator<> (getQuestionStatusOpal().createQuestionOpalIterator());
	}

	@Override
	public void unlink() {
		getQuestionStatusOpal().unlink();
	}

	@Override
	public void reload() {
		getQuestionStatusOpal().reload();
	}

	@Override
	public QuestionStatus copy() {
		return getQuestionStatusOpal().copy().getUserFacing();
	}

}
