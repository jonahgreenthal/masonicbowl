package com.masonic.persistence;

import com.masonic.application.Section;

@com.opal.StoreGeneratedPrimaryKey
public final class SectionOpal extends com.opal.UpdatableOpal<Section> {

	public static final java.lang.Boolean ourDefaultExtras = java.lang.Boolean.FALSE;

	private SectionOpal() {
		super();
		setUserFacing(null);
	}

	public SectionOpal(com.opal.IdentityOpalFactory<Section, SectionOpal> argOpalFactory, Object[] argValues) {
		super(argOpalFactory, argValues);
	}

	@Override
	protected void applyDefaults() {
		/* Initialize fields with their default values. */
		getNewValues()[6] = ourDefaultExtras;


		/* Initialize the back Collections to empty sets. */

		myNewPlacementOpalHashSet = new java.util.HashSet<>();

		return;
	}

	@Override
	protected void initializeReferences() {
		myOldPacketOpal = PacketOpal.NOT_YET_LOADED;
		myOldQuestionTypeOpal = QuestionTypeOpal.NOT_YET_LOADED;
		return;
	}

	/* package */ static final String[] ourFieldNames = new String[] {
		"Id",
		"PacketId",
		"QuestionTypeCode",
		"Sequence",
		"Name",
		"ShortName",
		"Extras",
	};

	/* package */ static final Class<?>[] ourFieldTypes = new Class<?>[] {
		java.lang.Integer.class,
		java.lang.Integer.class,
		java.lang.String.class,
		java.lang.Integer.class,
		java.lang.String.class,
		java.lang.String.class,
		java.lang.Boolean.class,
	};

	/* package */ static final boolean[] ourFieldNullability = new boolean[] {
		false,
		false,
		false,
		false,
		false,
		false,
		false,
	};

	/* package */ static final com.opal.FieldValidator[] ourFieldValidators = new com.opal.FieldValidator[] {
		null,
		null,
		null,
		null,
		null,
		null,
		null,
	};

	public static final SectionOpal NOT_YET_LOADED = new SectionOpal();

	public static String[] getStaticFieldNames() { return ourFieldNames; }

	public static Class<?>[] getStaticFieldTypes() { return ourFieldTypes; }

	@Override
	public Class<?>[] getFieldTypes() { return ourFieldTypes; }

	public static boolean[] getStaticFieldNullability() { return ourFieldNullability; }

	@Override
	public com.opal.FieldValidator[] getFieldValidators() { return ourFieldValidators; }

	@Override
	public boolean[] getFieldNullability() { return ourFieldNullability; }

	public static com.opal.FieldValidator[] getStaticFieldValidators() { return ourFieldValidators; }


	public synchronized java.lang.Integer getIdAsObject() {
		return (java.lang.Integer) getReadValueSet()[0];
	}

	public synchronized java.lang.Integer getPacketIdAsObject() {
		return (java.lang.Integer) getReadValueSet()[1];
	}

	public synchronized java.lang.String getQuestionTypeCode() {
		return (java.lang.String) getReadValueSet()[2];
	}

	public synchronized java.lang.Integer getSequenceAsObject() {
		return (java.lang.Integer) getReadValueSet()[3];
	}

	public synchronized java.lang.String getName() {
		return (java.lang.String) getReadValueSet()[4];
	}

	public synchronized java.lang.String getShortName() {
		return (java.lang.String) getReadValueSet()[5];
	}

	public synchronized java.lang.Boolean isExtrasAsObject() {
		return (java.lang.Boolean) getReadValueSet()[6];
	}

	public synchronized SectionOpal setId(final java.lang.Integer argId) {
		tryMutate();
		if (argId == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myId on " + this + " to null.");
		}
		getNewValues()[0] = argId;
		return this;
	}

	public SectionOpal setId(final int argId) {
		setId(java.lang.Integer.valueOf(argId));
		return this;
	}

	public synchronized SectionOpal setPacketId(final java.lang.Integer argPacketId) {
		tryMutate();
		if (argPacketId == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myPacketId on " + this + " to null.");
		}
		getNewValues()[1] = argPacketId;
		return this;
	}

	public SectionOpal setPacketId(final int argPacketId) {
		setPacketId(java.lang.Integer.valueOf(argPacketId));
		return this;
	}

	public synchronized SectionOpal setQuestionTypeCode(final java.lang.String argQuestionTypeCode) {
		tryMutate();
		if (argQuestionTypeCode == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myQuestionTypeCode on " + this + " to null.");
		}
		if (argQuestionTypeCode.length() > 32) {
			throw new com.opal.ArgumentTooLongException("Cannot set myQuestionTypeCode on " + this + " to \"" + argQuestionTypeCode + "\" because that field's maximum length is 32.", argQuestionTypeCode.length(), 32);
		}
		getNewValues()[2] = argQuestionTypeCode;
		return this;
	}

	public synchronized SectionOpal setSequence(final java.lang.Integer argSequence) {
		tryMutate();
		if (argSequence == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set mySequence on " + this + " to null.");
		}
		getNewValues()[3] = argSequence;
		return this;
	}

	public SectionOpal setSequence(final int argSequence) {
		setSequence(java.lang.Integer.valueOf(argSequence));
		return this;
	}

	public synchronized SectionOpal setName(final java.lang.String argName) {
		tryMutate();
		if (argName == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myName on " + this + " to null.");
		}
		if (argName.length() > 256) {
			throw new com.opal.ArgumentTooLongException("Cannot set myName on " + this + " to \"" + argName + "\" because that field's maximum length is 256.", argName.length(), 256);
		}
		getNewValues()[4] = argName;
		return this;
	}

	public synchronized SectionOpal setShortName(final java.lang.String argShortName) {
		tryMutate();
		if (argShortName == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myShortName on " + this + " to null.");
		}
		if (argShortName.length() > 32) {
			throw new com.opal.ArgumentTooLongException("Cannot set myShortName on " + this + " to \"" + argShortName + "\" because that field's maximum length is 32.", argShortName.length(), 32);
		}
		getNewValues()[5] = argShortName;
		return this;
	}

	public synchronized SectionOpal setExtras(final java.lang.Boolean argExtras) {
		tryMutate();
		if (argExtras == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myExtras on " + this + " to null.");
		}
		getNewValues()[6] = argExtras;
		return this;
	}

	public SectionOpal setExtras(final boolean argExtras) {
		setExtras(argExtras ? Boolean.TRUE : Boolean.FALSE);
		return this;
	}

	private boolean myClearOldCollections = false;

	protected boolean needsToClearOldCollections() {
		return myClearOldCollections;
	}

	protected final void setClearOldCollections(boolean argValue) {
		myClearOldCollections = argValue;
	}

	@Override
	protected /* synchronized */ void copyOldValuesToNewInternal() {
		myNewPacketOpal = myOldPacketOpal;
		myNewQuestionTypeOpal = myOldQuestionTypeOpal;
		myNewPlacementOpalHashSet = null; /* Necessary if it has been rolled back */
		myPlacementOpalCachedOperations = null; /* Ditto */
		/* We don't copy Collections of other Opals; they will be cloned as needed. */
		return;
	}

	@Override
	protected /* synchronized */ void copyNewValuesToOldInternal() {
		myOldPacketOpal = myNewPacketOpal;
		myOldQuestionTypeOpal = myNewQuestionTypeOpal;

		if (needsToClearOldCollections()) {
			myOldPlacementOpalHashSet = null;
		} else {
			if (myNewPlacementOpalHashSet != null) {
				if (myNewPlacementOpalHashSet.size() > 0) {
					myOldPlacementOpalHashSet = myNewPlacementOpalHashSet;
				} else {
					myOldPlacementOpalHashSet = java.util.Collections.emptySet();
				}
				myNewPlacementOpalHashSet = null;
			} else {
				myPlacementOpalCachedOperations = null;
			}
		}
		setClearOldCollections(false);
		return;
	}

	@Override
	protected void unlinkInternal() {
		java.util.Iterator<?> lclI;
		if (myNewPlacementOpalHashSet != null || myPlacementOpalCachedOperations != null) {
			lclI = createPlacementOpalIterator();
			while (lclI.hasNext()) {
				((PlacementOpal) lclI.next()).setSectionOpalInternal(null);
			}
		}
		if (getPacketOpal() != null) {
			getPacketOpal().removeSectionOpalInternal(this);
		}
		if (getQuestionTypeOpal() != null) {
			getQuestionTypeOpal().removeSectionOpalInternal(this);
		}
		return;
	}

	@Override
	protected void copyFieldsToInternal(com.opal.UpdatableOpal<Section> argTarget) {
		Object[] lclValues = getReadValueSet();
		Object[] lclTargetNewValues = argTarget.getNewValues();
		/* Field 0 (Id) is database generated. */
		/* Field 1 (PacketId) is part of a unique key. */
		lclTargetNewValues[2] = lclValues[2]; /* QuestionTypeCode (immutable) */
		/* Field 3 (Sequence) is part of a unique key. */
		lclTargetNewValues[4] = lclValues[4]; /* Name (immutable) */
		lclTargetNewValues[5] = lclValues[5]; /* ShortName (immutable) */
		lclTargetNewValues[6] = lclValues[6]; /* Extras (immutable) */

		return;
	}

	@Override
	public synchronized void translateReferencesToFields() {
		if (myNewPacketOpal != PacketOpal.NOT_YET_LOADED) {
			setPacketId(myNewPacketOpal == null ? null : myNewPacketOpal.getIdAsObject());
		}
		if (myNewQuestionTypeOpal != QuestionTypeOpal.NOT_YET_LOADED) {
			setQuestionTypeCode(myNewQuestionTypeOpal == null ? null : myNewQuestionTypeOpal.getCode());
		}
		return;
	}

	@Override
	public java.util.Set<com.opal.TransactionAware> getRequiredPriorCommits() {
		java.util.Set<com.opal.TransactionAware> lclTAs = null;
		com.opal.UpdatableOpal<?> lclUO;
		lclUO = myNewPacketOpal;
		if ((lclUO != null) && lclUO.isNew()) {
			lclTAs = new com.siliconage.util.Fast3Set<>();
			lclTAs.add(lclUO);
		}
		lclUO = myNewQuestionTypeOpal;
		if ((lclUO != null) && lclUO.isNew()) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
			lclTAs.add(lclUO);
		}
		return (lclTAs != null) && (lclTAs.size() > 0) ? lclTAs : java.util.Collections.emptySet();
	}

	@Override
	public java.util.Set<com.opal.TransactionAware> getRequiredSubsequentCommits() {
		if (isNew()) {
			return java.util.Collections.emptySet();
		}
		java.util.Set<com.opal.TransactionAware> lclTAs = null;
		com.opal.UpdatableOpal<?> lclUO;
		if ((lclUO = myOldPacketOpal) == PacketOpal.NOT_YET_LOADED) {
			lclUO = myOldPacketOpal = retrievePacketOpal(getOldValues());
		}
		if (lclUO != null && lclUO.isDeleted()) {
			lclTAs = new com.siliconage.util.Fast3Set<>();
			lclTAs.add(lclUO);
		}
		if ((lclUO = myOldQuestionTypeOpal) == QuestionTypeOpal.NOT_YET_LOADED) {
			lclUO = myOldQuestionTypeOpal = retrieveQuestionTypeOpal(getOldValues());
		}
		if (lclUO != null && lclUO.isDeleted()) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
			lclTAs.add(lclUO);
		}
		return (lclTAs != null) && (lclTAs.size() > 0) ? lclTAs : java.util.Collections.emptySet();
	}

	@Override
	public Object[] getPrimaryKeyWhereClauseValues() {
		return new Object[] {getOldValues()[0], };
	}

	private static int getFieldCountInternal() { return ourFieldNames.length; }

	@Override
	protected int getFieldCount() { return getFieldCountInternal(); }

	@Override
	protected String[] getFieldNames() { return ourFieldNames; }

	@Override
	public synchronized void output(final java.io.PrintStream argOutput) {
		argOutput.println("Id = " + getIdAsObject());
		argOutput.println("PacketId = " + getPacketIdAsObject());
		argOutput.println("QuestionTypeCode = " + getQuestionTypeCode());
		argOutput.println("Sequence = " + getSequenceAsObject());
		argOutput.println("Name = " + getName());
		argOutput.println("ShortName = " + getShortName());
		argOutput.println("Extras = " + isExtrasAsObject());
	}

	@Override
	public synchronized void output(final java.io.PrintWriter argOutput) {
		argOutput.println("Id = " + getIdAsObject());
		argOutput.println("PacketId = " + getPacketIdAsObject());
		argOutput.println("QuestionTypeCode = " + getQuestionTypeCode());
		argOutput.println("Sequence = " + getSequenceAsObject());
		argOutput.println("Name = " + getName());
		argOutput.println("ShortName = " + getShortName());
		argOutput.println("Extras = " + isExtrasAsObject());
	}

	private PacketOpal myOldPacketOpal;
	private PacketOpal myNewPacketOpal;

	protected PacketOpal retrievePacketOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[1] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getPacketOpalFactory().forId(getPacketIdAsObject());
	}

	public synchronized PacketOpal getPacketOpal() {
		PacketOpal lclPacketOpal;
		boolean lclAccess = tryAccess();
		lclPacketOpal = lclAccess ? myNewPacketOpal : myOldPacketOpal;
		if (lclPacketOpal == PacketOpal.NOT_YET_LOADED) {
			lclPacketOpal = retrievePacketOpal(getReadValueSet());
			if (lclAccess) {
				myNewPacketOpal = lclPacketOpal;
			} else {
				myOldPacketOpal = lclPacketOpal;
			}
		}
		return lclPacketOpal;
	}

	public synchronized SectionOpal setPacketOpal(PacketOpal argPacketOpal) {
		tryMutate();
		PacketOpal lclPacketOpal = getPacketOpal();
		if (lclPacketOpal == argPacketOpal) { return this; }
		if (lclPacketOpal != null) {
			lclPacketOpal.removeSectionOpalInternal(this);
		}
		myNewPacketOpal = argPacketOpal;
		if (argPacketOpal != null) {
			argPacketOpal.addSectionOpalInternal(this);
		}
		return this;
	}

	protected synchronized void setPacketOpalInternal(PacketOpal argPacketOpal) {
		tryMutate();
		myNewPacketOpal = argPacketOpal;
	}

	private QuestionTypeOpal myOldQuestionTypeOpal;
	private QuestionTypeOpal myNewQuestionTypeOpal;

	protected QuestionTypeOpal retrieveQuestionTypeOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[2] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getQuestionTypeOpalFactory().forCode(getQuestionTypeCode());
	}

	public synchronized QuestionTypeOpal getQuestionTypeOpal() {
		QuestionTypeOpal lclQuestionTypeOpal;
		boolean lclAccess = tryAccess();
		lclQuestionTypeOpal = lclAccess ? myNewQuestionTypeOpal : myOldQuestionTypeOpal;
		if (lclQuestionTypeOpal == QuestionTypeOpal.NOT_YET_LOADED) {
			lclQuestionTypeOpal = retrieveQuestionTypeOpal(getReadValueSet());
			if (lclAccess) {
				myNewQuestionTypeOpal = lclQuestionTypeOpal;
			} else {
				myOldQuestionTypeOpal = lclQuestionTypeOpal;
			}
		}
		return lclQuestionTypeOpal;
	}

	public synchronized SectionOpal setQuestionTypeOpal(QuestionTypeOpal argQuestionTypeOpal) {
		tryMutate();
		QuestionTypeOpal lclQuestionTypeOpal = getQuestionTypeOpal();
		if (lclQuestionTypeOpal == argQuestionTypeOpal) { return this; }
		if (lclQuestionTypeOpal != null) {
			lclQuestionTypeOpal.removeSectionOpalInternal(this);
		}
		myNewQuestionTypeOpal = argQuestionTypeOpal;
		if (argQuestionTypeOpal != null) {
			argQuestionTypeOpal.addSectionOpalInternal(this);
		}
		return this;
	}

	protected synchronized void setQuestionTypeOpalInternal(QuestionTypeOpal argQuestionTypeOpal) {
		tryMutate();
		myNewQuestionTypeOpal = argQuestionTypeOpal;
	}

	private java.util.Set<PlacementOpal> myOldPlacementOpalHashSet = null;
	private java.util.Set<PlacementOpal> myNewPlacementOpalHashSet = null;
	private java.util.ArrayList<com.opal.CachedOperation<PlacementOpal>> myPlacementOpalCachedOperations = null;

	/* package */ java.util.Set<PlacementOpal> getPlacementOpalHashSet() {
		if (tryAccess()) {
			if (myNewPlacementOpalHashSet == null) {
				if (myOldPlacementOpalHashSet == null) {
					if (isNew()) {
						myOldPlacementOpalHashSet = java.util.Collections.emptySet();
					} else {
						java.util.Set<PlacementOpal> lclS;
						lclS = OpalFactoryFactory.getInstance().getPlacementOpalFactory().forSectionIdCollection(getIdAsObject());
						myOldPlacementOpalHashSet = lclS.size() > 0 ? lclS : java.util.Collections.emptySet();
					}
				}
				myNewPlacementOpalHashSet = new java.util.HashSet<>(myOldPlacementOpalHashSet);
				if (myPlacementOpalCachedOperations != null) {
					com.opal.OpalUtility.handleCachedOperations(myPlacementOpalCachedOperations, myNewPlacementOpalHashSet);
					myPlacementOpalCachedOperations = null;
				}
			}
			return myNewPlacementOpalHashSet;
		} else {
			if (myOldPlacementOpalHashSet == null) {
				java.util.Set<PlacementOpal> lclS;
				lclS = OpalFactoryFactory.getInstance().getPlacementOpalFactory().forSectionIdCollection(getIdAsObject());
				myOldPlacementOpalHashSet = lclS.size() > 0 ? lclS : java.util.Collections.emptySet();
			}
			return myOldPlacementOpalHashSet;
		}
	}

	public synchronized void addPlacementOpal(PlacementOpal argPlacementOpal) {
		tryMutate();
		argPlacementOpal.setSectionOpal(this);
		return;
	}

	protected synchronized void addPlacementOpalInternal(PlacementOpal argPlacementOpal) {
		tryMutate();
		if (myNewPlacementOpalHashSet == null) {
			if (myOldPlacementOpalHashSet == null) {
				if (myPlacementOpalCachedOperations == null) { myPlacementOpalCachedOperations = new java.util.ArrayList<>(); }
				myPlacementOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.ADD, argPlacementOpal));
			} else {
				myNewPlacementOpalHashSet = new java.util.HashSet<>(myOldPlacementOpalHashSet);
				myNewPlacementOpalHashSet.add(argPlacementOpal);
			}
		} else {
			myNewPlacementOpalHashSet.add(argPlacementOpal);
		}
		return;
	}

	public synchronized void removePlacementOpal(PlacementOpal argPlacementOpal) {
		tryMutate();
		argPlacementOpal.setSectionOpal(null);
	}

	protected synchronized void removePlacementOpalInternal(PlacementOpal argPlacementOpal) {
		tryMutate();
		if (myNewPlacementOpalHashSet == null) {
			if (myOldPlacementOpalHashSet == null) {
				if (myPlacementOpalCachedOperations == null) { myPlacementOpalCachedOperations = new java.util.ArrayList<>(); }
				myPlacementOpalCachedOperations.add(new com.opal.CachedOperation<>(com.opal.CachedOperation.REMOVE, argPlacementOpal));
			} else {
				myNewPlacementOpalHashSet = new java.util.HashSet<>(myOldPlacementOpalHashSet);
				myNewPlacementOpalHashSet.remove(argPlacementOpal);
			}
		} else {
			myNewPlacementOpalHashSet.remove(argPlacementOpal);
		}
		return;
	}

	public synchronized int getPlacementOpalCount() { return getPlacementOpalHashSet().size(); }

	public synchronized java.util.Iterator<PlacementOpal> createPlacementOpalIterator() {
		return getPlacementOpalHashSet().iterator();
	}

	public synchronized java.util.stream.Stream<PlacementOpal> streamPlacementOpal() {
		return getPlacementOpalHashSet().stream();
	}

	@Override
	public java.lang.String toString() {
		java.lang.StringBuilder lclSB = new java.lang.StringBuilder(64);
		lclSB.append("SectionOpal[");
		lclSB.append("myId=");
		lclSB.append(toStringField(0));
		lclSB.append(']');
		return lclSB.toString();
	}

	@Override
	protected void updateReferencesAfterReload() {
		if (myNewPacketOpal != PacketOpal.NOT_YET_LOADED) {
			setPacketOpal(retrievePacketOpal(getNewValues()));
		}
		if (myNewQuestionTypeOpal != QuestionTypeOpal.NOT_YET_LOADED) {
			setQuestionTypeOpal(retrieveQuestionTypeOpal(getNewValues()));
		}
	}

	@Override
	protected void updateCollectionsAfterReload() {
		assert needsToClearOldCollections() == false;
		setClearOldCollections(true);
	}

}
