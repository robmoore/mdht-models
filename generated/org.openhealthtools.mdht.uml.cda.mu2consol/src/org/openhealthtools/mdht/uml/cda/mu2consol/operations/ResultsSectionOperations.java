/*******************************************************************************
 * Copyright (c) 2012 Rama Ramakrishnan and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Rama Ramakrishnan (Agilex Corporation) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.mu2consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPlugin;
import org.openhealthtools.mdht.uml.cda.mu2consol.ResultOrganizer;
import org.openhealthtools.mdht.uml.cda.mu2consol.ResultsSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.util.Mu2consolValidator;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Results Section</b></em>' model objects. <!-- end-user-doc
 * -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.ResultsSection#validateMu2consolResultsSectionResultOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Mu2consol Results Section Result Organizer</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.ResultsSection#getMu2consolResultOrganizers()
 * <em>Get Mu2consol Result Organizers</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.ResultsSection#validateResultsSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Results Section Entries Optional Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResultsSectionOperations
		extends org.openhealthtools.mdht.uml.cda.consol.operations.ResultsSectionOperations {
	protected static final ThreadLocal<OCL> EOCL_ENV = new ThreadLocal<OCL>() {
		@Override
		public OCL initialValue() {
			return OCL.newInstance();
		}
	};

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected ResultsSectionOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getOrganizers()->select(organizer : cda::Organizer | not
	 * organizer.oclIsUndefined() and
	 * organizer.oclIsKindOf(mu2consol::ResultOrganizer
	 * )).oclAsType(mu2consol::ResultOrganizer)
	 *
	 * @param resultsSection
	 *            The receiving '<em><b>Results Section</b></em>' model object.
	 *            <!-- end-model-doc -->
	 * @generated
	 */

	public static EList<ResultOrganizer> getMu2consolResultOrganizers(ResultsSection resultsSection) {

		if (GET_MU2CONSOL_RESULT_ORGANIZERS__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.RESULTS_SECTION,
					Mu2consolPackage.Literals.RESULTS_SECTION.getEAllOperations().get(65));
			try {
				GET_MU2CONSOL_RESULT_ORGANIZERS__EOCL_QRY = helper
						.createQuery(GET_MU2CONSOL_RESULT_ORGANIZERS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_MU2CONSOL_RESULT_ORGANIZERS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ResultOrganizer> result = (Collection<ResultOrganizer>) query.evaluate(resultsSection);
		return new BasicEList.UnmodifiableEList<ResultOrganizer>(result.size(), result.toArray());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root =
	 * '2.16.840.1.113883.10.20.22.2.3.1')
	 *
	 * @param resultsSection
	 *            The receiving '<em><b>Results Section</b></em>' model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateResultsSectionEntriesOptionalTemplateId(ResultsSection resultsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.RESULTS_SECTION);
			try {
				VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV
						.set(helper.createInvariant(
								VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get()
				.createQuery(
						VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get())
				.check(resultsSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR, Mu2consolValidator.DIAGNOSTIC_SOURCE,
						Mu2consolValidator.RESULTS_SECTION__RESULTS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID,
						Mu2consolPlugin.INSTANCE.getString("ResultsSectionResultsSectionEntriesOptionalTemplateId"),
						new Object[] { resultsSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the
	 * '{@link #getMu2consolResultOrganizers(ResultsSection) <em>Get Mu2consol
	 * Result Organizers</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #getMu2consolResultOrganizers(ResultsSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MU2CONSOL_RESULT_ORGANIZERS__EOCL_EXP = "self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(mu2consol::ResultOrganizer)).oclAsType(mu2consol::ResultOrganizer)";

	/**
	 * The cached OCL query for the
	 * '{@link #getMu2consolResultOrganizers(ResultsSection) <em>Get Mu2consol
	 * Result Organizers</em>}' query operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #getMu2consolResultOrganizers(ResultsSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MU2CONSOL_RESULT_ORGANIZERS__EOCL_QRY;

	/**
	 * The cached OCL expression body for the
	 * '{@link #validateResultsSectionEntriesOptionalTemplateId(ResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Results Section Entries Optional Template Id</em>}'
	 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #validateResultsSectionEntriesOptionalTemplateId(ResultsSection,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.3.1')";

	/**
	 * The cached OCL invariant for the
	 * '{@link #validateResultsSectionEntriesOptionalTemplateId(ResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Results Section Entries Optional Template Id</em>}'
	 * invariant operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #validateResultsSectionEntriesOptionalTemplateId(ResultsSection,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * The cached OCL expression body for the '
	 * {@link #validateResultsSectionResultOrganizer(ResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Results Section Result Organizer</em>}' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #validateResultsSectionResultOrganizer(ResultsSection,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULTS_SECTION_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(mu2consol::ResultOrganizer))";

	/**
	 * The cached OCL invariant for the
	 * '{@link #validateResultsSectionResultOrganizer(ResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Results Section Result Organizer</em>}' invariant operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #validateResultsSectionResultOrganizer(ResultsSection,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_RESULTS_SECTION_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 *
	 * @param resultsSection
	 *            The receiving '<em><b>Results Section</b></em>' model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateResultsSectionResultOrganizer(ResultsSection resultsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_RESULTS_SECTION_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.RESULTS_SECTION);
			try {
				VALIDATE_RESULTS_SECTION_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper
						.createInvariant(VALIDATE_RESULTS_SECTION_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_RESULTS_SECTION_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get())
				.check(resultsSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR, Mu2consolValidator.DIAGNOSTIC_SOURCE,
						Mu2consolValidator.RESULTS_SECTION__RESULTS_SECTION_RESULT_ORGANIZER,
						Mu2consolPlugin.INSTANCE.getString("ResultsSectionResultsSectionResultOrganizer"),
						new Object[] { resultsSection }));
			}

			return false;
		}
		return true;
	}

} // ResultsSectionOperations