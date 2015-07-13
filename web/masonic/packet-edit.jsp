﻿<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="org.apache.commons.lang3.Validate" %>
<%@ page import="com.opal.DatabaseQuery" %>
<%@ page import="com.opal.cma.OpalForm" %>
<%@ page import="com.opal.cma.OpalMainForm" %>
<%@ page import="com.masonic.application.Category" %>
<%@ page import="com.masonic.application.Packet" %>
<%@ page import="com.masonic.application.PacketFactory" %>
<%@ page import="com.masonic.application.Placement" %>
<%@ page import="com.masonic.application.PlacementFactory" %>
<%@ page import="com.masonic.application.Question" %>
<%@ page import="com.masonic.application.QuestionFactory" %>
<%@ page import="com.masonic.application.QuestionType" %>
<%@ page import="com.masonic.application.Section" %>
<%@ page import="com.masonic.application.SectionFactory" %>
<%@ page import="com.masonic.opalforms.specialhandler.QuestionHandler" %>
<%@ page import="com.masonic.opalforms.updater.PacketPlacementUpdater" %>
<%@ page import="com.masonic.opalforms.updater.PlacementDuplicateTeamQuestions" %>
<%@ page import="com.masonic.opalforms.validator.PlacementCategoryValidator" %>
<%@ page import="com.masonic.menu.Menus" %>
<%@ page import="com.masonic.HTMLUtility" %>

<%
OpalMainForm<Packet> lclOF = OpalForm.create(
	session,
	request,
	"/OpalFormController",
	PacketFactory.getInstance(),
	"packet_id"
);
lclOF.setUpdaterClass(PacketPlacementUpdater.class);
lclOF.setDeleteURI("/masonic/packet-delete-confirmation.jsp");
Packet lclP = Validate.notNull(lclOF.getUserFacing());

String lclTitle = "Edit " + lclP.getNameWithPacketSet();
%>

<jsp:include page="/template/header.jsp">
	<jsp:param name="pageTitle" value="<%= lclTitle %>" />
	<jsp:param name="pageDescription" value="<%= lclTitle %>" />
	<jsp:param name="topMenu" value="<%= Menus.INTERNAL.asTopLevel().output(request, \"packet-edit\") %>" />
	<jsp:param name="h1" value="<%= lclTitle %>" />
</jsp:include>

<%= lclOF.open() %><%
if (lclOF.hasErrors()) {
	%><div class="row">
		<p class="form-error-intro">Error:</p>
		<div class="form-errors alert"><%= lclOF.errors() %></div>
	</div><%
}

%><div class="row">
	<div class="small-2 columns">
		<%= lclOF.label("Name", "Name").css("right inline") %>
	</div>
	<div class="small-10 medium-3 columns">
		<%= lclOF.text("Name", 30) %>
	</div>
	
	<div class="small-2 columns">
		<%= lclOF.label("ShortName", "Short name").css("right inline") %>
	</div>
	<div class="small-10 medium-3 columns">
		<%= lclOF.text("ShortName", 30) %>
	</div>
	
	<div class="small-1 column">
		<%= lclOF.label("Sequence", "Sequence").css("right inline") %>
	</div>
	<div class="small-10 medium-1 column">
		<%= lclOF.text("Sequence", 2) %>
	</div>
</div>

<div class="row">
	<hr />
</div>

<div class="row">
	<div class="small-12 columns">
		<h2>Sections</h2>
	</div><%
	for (OpalForm<Section> lclSOF : lclOF.children("Section", SectionFactory.getInstance(), 1, Section.SequenceComparator.getInstance())) {
		Section lclS = lclSOF.getUserFacing();
		
		if (lclSOF.hasErrors()) {
			%><div class="small-offset-1 small-11 columns alert"><%= lclSOF.errors() %></div><%
		}
		%><%= lclSOF.open() %>
		<div class="small-offset-1 small-11 columns">
			<h3><%= lclSOF.isNew() ? "New section" : lclS.getName() %></h3>
			<div class="row">
				<div class="small-2 columns">
					<%= lclSOF.label("Name", "Name").css("right inline") %>
				</div>
				<div class="small-10 medium-4 columns">
					<%= lclSOF.text("Name", 30) %>
				</div>
				
				<div class="small-2 columns">
					<%= lclSOF.label("ShortName", "Short name").css("right inline") %>
				</div>
				<div class="small-10 medium-4 columns">
					<%= lclSOF.text("ShortName", 30) %>
				</div>
			</div>
			
			<div class="row">
				<div class="small-2 columns">
					<%= lclSOF.label("QuestionType", "Question type").css("right inline") %>
				</div>
				<div class="small-10 medium-2 columns">
					<%= lclSOF.dropdown("QuestionType", QuestionType.SequenceComparator.getInstance()) %>
				</div>
				
				<div class="small-2 columns">
					<%= lclSOF.label("Extras", "Extras?").css("right inline") %>
				</div>
				<div class="small-10 medium-2 columns">
					<%= lclSOF.checkbox("Extras").style("vertical-align: sub;") %>
				</div>
				
				<div class="small-2 columns">
					<%= lclSOF.label("Sequence", "Sequence").css("right inline") %>
				</div>
				<div class="small-10 medium-2 columns">
					<%= lclSOF.text("Sequence", 2) %>
				</div>
			</div>
			
			<div class="row">
				<div class="small-12 columns">
					<table class="responsive">
						<thead>
							<tr>
								<!--<th>ID</th>-->
								<th>Sequence</th>
								<th>Category</th>
								<th>Question</th>
								<th>Delete?</th>
							</tr>
						</thead>
						<tbody><%
							for (OpalForm<Placement> lclPLOF : lclSOF.children("Placement", PlacementFactory.getInstance(), 1, Placement.StandardComparator.getInstance())) {
								lclPLOF.setValidatorClass(PlacementCategoryValidator.class);
								lclPLOF.setUpdaterClass(PlacementDuplicateTeamQuestions.class);
								
								if (lclPLOF.hasErrors()) {
									%><tr class="alert">
										<td colspan="4"><%= lclPLOF.errors() %></td>
									</tr><%
								}
								%><tr>
									<%= lclPLOF.open() %>
									<!--<td><%= lclPLOF.field("Id") %></td>-->
									<td><%= lclPLOF.text("Sequence", 3) %></td>
									<td><%= lclPLOF.dropdown("Category", Category.StandardComparator.getInstance()).namer(Category::getNameWithGroupName) %></td>
									<td><%
										if (lclPLOF.isNew()) {
											%><%= lclPLOF.special("Question", 5, QuestionHandler.class) %><%
										} else {
											Placement lclPL = Validate.notNull(lclPLOF.getUserFacing());
											
											List<Question> lclCandidates = new ArrayList<>();
											lclCandidates.add(null); // so that we can empty the Placement
											
											if (lclPL.isFilled()) {
												lclCandidates.add(lclPL.getQuestion());
											}
											
											QuestionFactory.getInstance().acquireForQuery(
												lclCandidates,
												new DatabaseQuery("SELECT Q.* FROM Question Q WHERE NOT EXISTS (SELECT * FROM Placement PL WHERE PL.question_id = Q.id) AND Q.category_code = ? ORDER BY Q.label", lclPL.getCategory().getCode())
											);
											
											%><%= lclOF.getPriorInput().dropdown("/Placement_" + lclPL.getId() + "_Question", lclCandidates, lclPLOF.getUserFacing().getQuestion(), Question.NCE.getInstance()) %><%
										}
									%></td>
									<td><%= lclPLOF.delete() %></td>
									<%= lclPLOF.close() %>
								</tr><%
							}
						%></tbody>
					</table>
				</div>
			</div>
		</div>
		<%= lclSOF.close() %><%
		if (lclSOF.alreadyExists()) {
			%><div class="small-offset-1 small-11 columns">
				<hr />
			</div><%
		}
	}
%></div>

<div class="row">
	<hr />
</div>

<div class="row">
	<div class="small-12 columns">
		<%= lclOF.submit() %> <%= lclOF.delete() %> <%= lclOF.cancel() %>
	</div>
</div>

<%= lclOF.close() %>

<jsp:include page="/template/footer.jsp" />