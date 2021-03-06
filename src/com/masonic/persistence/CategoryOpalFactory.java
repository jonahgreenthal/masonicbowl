package com.masonic.persistence;
import com.masonic.application.Category;
import com.opal.PersistenceException;

public interface CategoryOpalFactory extends com.opal.IdentityOpalFactory<Category, CategoryOpal>, com.opal.OpalFactoryCreator<Category, CategoryOpal> {

	public java.util.HashSet<CategoryOpal> forCategoryGroupCodeCollection(java.lang.String argCategoryGroupCode) throws com.opal.PersistenceException;
	public CategoryOpal forCode(java.lang.String argCode) throws PersistenceException;
	public CategoryOpal forName(java.lang.String argName) throws PersistenceException;
	public CategoryOpal forShortName(java.lang.String argShortName) throws PersistenceException;
}
