/*******************************************************************************
 * Copyright (c) 2009, 2012 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ccd.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.mdht.uml.cda.operations.SectionOperations;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.ccd.AlertsSection;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPlugin;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemAct;
import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Alerts Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AlertsSection#validateAlertsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alerts Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AlertsSection#validateAlertsSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alerts Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AlertsSection#validateAlertsSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alerts Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AlertsSection#validateAlertsSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alerts Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AlertsSection#validateAlertsSectionProblemAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alerts Section Problem Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AlertsSection#getProblemActs() <em>Get Problem Acts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AlertsSectionOperations extends SectionOperations {
	protected static final ThreadLocal<OCL> EOCL_ENV = new ThreadLocal<OCL>() {
		@Override
		public OCL initialValue() {
			return OCL.newInstance();
		}
	};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlertsSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAlertsSectionTemplateId(AlertsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alerts Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAlertsSectionTemplateId(AlertsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALERTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.2')";

	/**
	 * The cached OCL invariant for the '{@link #validateAlertsSectionTemplateId(AlertsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alerts Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAlertsSectionTemplateId(AlertsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_ALERTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param alertsSection The receiving '<em><b>Alerts Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAlertsSectionTemplateId(AlertsSection alertsSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ALERTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CCDPackage.Literals.ALERTS_SECTION);
			try {
				VALIDATE_ALERTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_ALERTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ALERTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(alertsSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CCDValidator.DIAGNOSTIC_SOURCE,
						CCDValidator.ALERTS_SECTION__ALERTS_SECTION_TEMPLATE_ID,
						CCDPlugin.INSTANCE.getString("AlertsSectionAlertsSectionTemplateId"),
						new Object[] { alertsSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAlertsSectionCode(AlertsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alerts Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAlertsSectionCode(AlertsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALERTS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in " +
			"value.code = '48765-2' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateAlertsSectionCode(AlertsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alerts Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAlertsSectionCode(AlertsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_ALERTS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param alertsSection The receiving '<em><b>Alerts Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAlertsSectionCode(AlertsSection alertsSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ALERTS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CCDPackage.Literals.ALERTS_SECTION);
			try {
				VALIDATE_ALERTS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_ALERTS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_ALERTS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			alertsSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CCDValidator.DIAGNOSTIC_SOURCE,
						CCDValidator.ALERTS_SECTION__ALERTS_SECTION_CODE,
						CCDPlugin.INSTANCE.getString("AlertsSectionAlertsSectionCode"),
						new Object[] { alertsSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAlertsSectionTitle(AlertsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alerts Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAlertsSectionTitle(AlertsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALERTS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAlertsSectionTitle(AlertsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alerts Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAlertsSectionTitle(AlertsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_ALERTS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param alertsSection The receiving '<em><b>Alerts Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAlertsSectionTitle(AlertsSection alertsSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ALERTS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CCDPackage.Literals.ALERTS_SECTION);
			try {
				VALIDATE_ALERTS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_ALERTS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_ALERTS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			alertsSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CCDValidator.DIAGNOSTIC_SOURCE,
						CCDValidator.ALERTS_SECTION__ALERTS_SECTION_TITLE,
						CCDPlugin.INSTANCE.getString("AlertsSectionAlertsSectionTitle"),
						new Object[] { alertsSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAlertsSectionText(AlertsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alerts Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAlertsSectionText(AlertsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALERTS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateAlertsSectionText(AlertsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alerts Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAlertsSectionText(AlertsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_ALERTS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param alertsSection The receiving '<em><b>Alerts Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAlertsSectionText(AlertsSection alertsSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ALERTS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CCDPackage.Literals.ALERTS_SECTION);
			try {
				VALIDATE_ALERTS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_ALERTS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_ALERTS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			alertsSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CCDValidator.DIAGNOSTIC_SOURCE,
						CCDValidator.ALERTS_SECTION__ALERTS_SECTION_TEXT,
						CCDPlugin.INSTANCE.getString("AlertsSectionAlertsSectionText"),
						new Object[] { alertsSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAlertsSectionProblemAct(AlertsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alerts Section Problem Act</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAlertsSectionProblemAct(AlertsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALERTS_SECTION_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(ccd::ProblemAct))";

	/**
	 * The cached OCL invariant for the '{@link #validateAlertsSectionProblemAct(AlertsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alerts Section Problem Act</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAlertsSectionProblemAct(AlertsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_ALERTS_SECTION_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param alertsSection The receiving '<em><b>Alerts Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAlertsSectionProblemAct(AlertsSection alertsSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ALERTS_SECTION_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CCDPackage.Literals.ALERTS_SECTION);
			try {
				VALIDATE_ALERTS_SECTION_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_ALERTS_SECTION_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ALERTS_SECTION_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(alertsSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, CCDValidator.DIAGNOSTIC_SOURCE,
						CCDValidator.ALERTS_SECTION__ALERTS_SECTION_PROBLEM_ACT,
						CCDPlugin.INSTANCE.getString("AlertsSectionAlertsSectionProblemAct"),
						new Object[] { alertsSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getProblemActs(AlertsSection) <em>Get Problem Acts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemActs(AlertsSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROBLEM_ACTS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(ccd::ProblemAct)).oclAsType(ccd::ProblemAct)";

	/**
	 * The cached OCL query for the '{@link #getProblemActs(AlertsSection) <em>Get Problem Acts</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemActs(AlertsSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROBLEM_ACTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EList<ProblemAct> getProblemActs(AlertsSection alertsSection) {

		if (GET_PROBLEM_ACTS__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				CCDPackage.Literals.ALERTS_SECTION, CCDPackage.Literals.ALERTS_SECTION.getEAllOperations().get(60));
			try {
				GET_PROBLEM_ACTS__EOCL_QRY = helper.createQuery(GET_PROBLEM_ACTS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_PROBLEM_ACTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ProblemAct> result = (Collection<ProblemAct>) query.evaluate(alertsSection);
		return new BasicEList.UnmodifiableEList<ProblemAct>(result.size(), result.toArray());
	}

} // AlertsSectionOperations
