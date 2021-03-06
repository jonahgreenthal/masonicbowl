package com.masonic.persistence;


public abstract class QuestionImpl extends com.opal.AbstractIdentityImpl<com.masonic.application.Question, com.masonic.persistence.QuestionOpal> implements com.masonic.application.Question {

	protected QuestionImpl() {
		super();
	}

	protected abstract com.masonic.persistence.QuestionOpal getQuestionOpal();

	@Override
	protected com.opal.IdentityOpal<? extends com.masonic.application.Question> getOpal() {
		return getQuestionOpal();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getIdAsObject() {
		return getQuestionOpal().getIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public void setId(java.lang.Integer argId) {
		getQuestionOpal().setId(argId);
		return;
	}

	@Override
	public void setId(int argId) {
		getQuestionOpal().setId(argId);
		return;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public java.lang.String getCategoryCode() {
		return getQuestionOpal().getCategoryCode();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public void setCategoryCode(java.lang.String argCategoryCode) {
		getQuestionOpal().setCategoryCode(argCategoryCode);
		return;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@Override
	public java.lang.String getInternalNote() {
		return getQuestionOpal().getInternalNote();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@Override
	public void setInternalNote(java.lang.String argInternalNote) {
		getQuestionOpal().setInternalNote(argInternalNote);
		return;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@Override
	public java.lang.String getExternalNote() {
		return getQuestionOpal().getExternalNote();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@Override
	public void setExternalNote(java.lang.String argExternalNote) {
		getQuestionOpal().setExternalNote(argExternalNote);
		return;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public java.lang.String getQuestionTypeCode() {
		return getQuestionOpal().getQuestionTypeCode();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public void setQuestionTypeCode(java.lang.String argQuestionTypeCode) {
		getQuestionOpal().setQuestionTypeCode(argQuestionTypeCode);
		return;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 256L)
	@Override
	public java.lang.String getLabel() {
		return getQuestionOpal().getLabel();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 256L)
	@Override
	public void setLabel(java.lang.String argLabel) {
		getQuestionOpal().setLabel(argLabel);
		return;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getWriterAccountIdAsObject() {
		return getQuestionOpal().getWriterAccountIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public void setWriterAccountId(java.lang.Integer argWriterAccountId) {
		getQuestionOpal().setWriterAccountId(argWriterAccountId);
		return;
	}

	@Override
	public void setWriterAccountId(int argWriterAccountId) {
		getQuestionOpal().setWriterAccountId(argWriterAccountId);
		return;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.CurrentDateTimeDefault
	@Override
	public java.time.LocalDateTime getUpdated() {
		return getQuestionOpal().getUpdated();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.CurrentDateTimeDefault
	@Override
	public void setUpdated(java.time.LocalDateTime argUpdated) {
		getQuestionOpal().setUpdated(argUpdated);
		return;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public java.lang.String getIntendedPacketSetCode() {
		return getQuestionOpal().getIntendedPacketSetCode();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public void setIntendedPacketSetCode(java.lang.String argIntendedPacketSetCode) {
		getQuestionOpal().setIntendedPacketSetCode(argIntendedPacketSetCode);
		return;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@com.opal.annotation.Default(value = "DRAFTED")
	@Override
	public java.lang.String getQuestionStatusCode() {
		return getQuestionOpal().getQuestionStatusCode();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@com.opal.annotation.Default(value = "DRAFTED")
	@Override
	public void setQuestionStatusCode(java.lang.String argQuestionStatusCode) {
		getQuestionOpal().setQuestionStatusCode(argQuestionStatusCode);
		return;
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/** @return the PacketSet object created from question through reference question_intended_packet_set_code_fkey */

	@com.opal.annotation.Nullability(nullable = true)
	@Override
	public com.masonic.application.PacketSet getIntendedPacketSet() {
		PacketSetOpal lclPacketSetOpal = getQuestionOpal().getIntendedPacketSetOpal();
		return lclPacketSetOpal == null ? null : lclPacketSetOpal.getUserFacing();
	}

	@Override
	public void setIntendedPacketSet(com.masonic.application.PacketSet argPacketSet) {
		getQuestionOpal().setIntendedPacketSetOpal(argPacketSet == null ? null : ((PacketSetImpl) argPacketSet).getPacketSetOpal());
		return;
	}

	/** @return the QuestionStatus object created from question through reference question_question_status_code_fkey */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.masonic.application.QuestionStatus getStatus() {
		QuestionStatusOpal lclQuestionStatusOpal = getQuestionOpal().getStatusOpal();
		return lclQuestionStatusOpal == null ? null : lclQuestionStatusOpal.getUserFacing();
	}

	@Override
	public void setStatus(com.masonic.application.QuestionStatus argQuestionStatus) {
		getQuestionOpal().setStatusOpal(argQuestionStatus == null ? null : ((QuestionStatusImpl) argQuestionStatus).getQuestionStatusOpal());
		return;
	}

	/** @return the Category object created from question through reference question_to_category */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.masonic.application.Category getCategory() {
		CategoryOpal lclCategoryOpal = getQuestionOpal().getCategoryOpal();
		return lclCategoryOpal == null ? null : lclCategoryOpal.getUserFacing();
	}

	@Override
	public void setCategory(com.masonic.application.Category argCategory) {
		getQuestionOpal().setCategoryOpal(argCategory == null ? null : ((CategoryImpl) argCategory).getCategoryOpal());
		return;
	}

	/** @return the QuestionType object created from question through reference question_to_question_type */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.masonic.application.QuestionType getQuestionType() {
		QuestionTypeOpal lclQuestionTypeOpal = getQuestionOpal().getQuestionTypeOpal();
		return lclQuestionTypeOpal == null ? null : lclQuestionTypeOpal.getUserFacing();
	}

	@Override
	public void setQuestionType(com.masonic.application.QuestionType argQuestionType) {
		getQuestionOpal().setQuestionTypeOpal(argQuestionType == null ? null : ((QuestionTypeImpl) argQuestionType).getQuestionTypeOpal());
		return;
	}

	/** @return the Account object created from question through reference question_writer_account_id_fkey */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.masonic.application.Account getWriter() {
		AccountOpal lclAccountOpal = getQuestionOpal().getWriterOpal();
		return lclAccountOpal == null ? null : lclAccountOpal.getUserFacing();
	}

	@Override
	public void setWriter(com.masonic.application.Account argAccount) {
		getQuestionOpal().setWriterOpal(argAccount == null ? null : ((AccountImpl) argAccount).getAccountOpal());
		return;
	}

	/* The following methods allow access to the user objects that have references
	to this object. */

	@Override
	public void addPlacement(com.masonic.application.Placement argPlacement) {
		getQuestionOpal().addPlacementOpal(((PlacementImpl) argPlacement).getPlacementOpal());
		return;
	}

	@Override
	public void removePlacement(com.masonic.application.Placement argPlacement) {
		getQuestionOpal().removePlacementOpal(((PlacementImpl) argPlacement).getPlacementOpal());
		return;
	}

	@Override
	public int getPlacementCount() {
		return getQuestionOpal().getPlacementOpalCount();
	}

	@Override
	public java.util.stream.Stream<com.masonic.application.Placement> streamPlacement() {
		return getQuestionOpal().streamPlacementOpal().map(com.opal.Opal::getUserFacing);
	}

	@Override
	public java.util.Iterator<com.masonic.application.Placement> createPlacementIterator() {
		return new com.opal.OpalIterator<> (getQuestionOpal().createPlacementOpalIterator());
	}

	@Override
	public void unlink() {
		getQuestionOpal().unlink();
	}

	@Override
	public void reload() {
		getQuestionOpal().reload();
	}

	@Override
	public com.masonic.application.Question copy() {
		return getQuestionOpal().copy().getUserFacing();
	}

}
