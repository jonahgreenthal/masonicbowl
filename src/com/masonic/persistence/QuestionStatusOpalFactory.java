package com.masonic.persistence;
import com.masonic.application.QuestionStatus;
import com.opal.PersistenceException;

public interface QuestionStatusOpalFactory extends com.opal.IdentityOpalFactory<QuestionStatus, QuestionStatusOpal>, com.opal.OpalFactoryCreator<QuestionStatus, QuestionStatusOpal> {

	public QuestionStatusOpal forName(java.lang.String argName) throws PersistenceException;
	public QuestionStatusOpal forCode(java.lang.String argCode) throws PersistenceException;
	public QuestionStatusOpal forShortName(java.lang.String argShortName) throws PersistenceException;
}
