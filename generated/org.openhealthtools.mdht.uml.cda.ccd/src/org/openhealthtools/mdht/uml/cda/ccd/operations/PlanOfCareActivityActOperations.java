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

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPlugin;
import org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareActivityAct;
import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Plan Of Care Activity Act</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareActivityAct#validatePlanOfCareActivityActMoodCodeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Act Mood Code Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareActivityAct#validatePlanOfCareActivityActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Act Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareActivityAct#validatePlanOfCareActivityActId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Act Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareActivityAct#validatePlanOfCareActivityActMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Act Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlanOfCareActivityActOperations extends ClinicalStatementOperations {
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
	protected PlanOfCareActivityActOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfCareActivityActMoodCodeValue(PlanOfCareActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Act Mood Code Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareActivityActMoodCodeValue(PlanOfCareActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_CARE_ACTIVITY_ACT_MOOD_CODE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode = vocab::x_DocumentActMood::INT or self.moodCode = vocab::x_DocumentActMood::ARQ" +
			"  or self.moodCode = vocab::x_DocumentActMood::PRMS or self.moodCode = vocab::x_DocumentActMood::PRP" +
			"  or self.moodCode = vocab::x_DocumentActMood::RQO";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfCareActivityActMoodCodeValue(PlanOfCareActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Act Mood Code Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareActivityActMoodCodeValue(PlanOfCareActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_PLAN_OF_CARE_ACTIVITY_ACT_MOOD_CODE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param planOfCareActivityAct The receiving '<em><b>Plan Of Care Activity Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePlanOfCareActivityActMoodCodeValue(PlanOfCareActivityAct planOfCareActivityAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLAN_OF_CARE_ACTIVITY_ACT_MOOD_CODE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CCDPackage.Literals.PLAN_OF_CARE_ACTIVITY_ACT);
			try {
				VALIDATE_PLAN_OF_CARE_ACTIVITY_ACT_MOOD_CODE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PLAN_OF_CARE_ACTIVITY_ACT_MOOD_CODE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PLAN_OF_CARE_ACTIVITY_ACT_MOOD_CODE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				planOfCareActivityAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CCDValidator.DIAGNOSTIC_SOURCE,
						CCDValidator.PLAN_OF_CARE_ACTIVITY_ACT__PLAN_OF_CARE_ACTIVITY_ACT_MOOD_CODE_VALUE,
						CCDPlugin.INSTANCE.getString("PlanOfCareActivityActPlanOfCareActivityActMoodCodeValue"),
						new Object[] { planOfCareActivityAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfCareActivityActTemplateId(PlanOfCareActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Act Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareActivityActTemplateId(PlanOfCareActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_CARE_ACTIVITY_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.25')";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfCareActivityActTemplateId(PlanOfCareActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Act Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareActivityActTemplateId(PlanOfCareActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_PLAN_OF_CARE_ACTIVITY_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param planOfCareActivityAct The receiving '<em><b>Plan Of Care Activity Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePlanOfCareActivityActTemplateId(PlanOfCareActivityAct planOfCareActivityAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLAN_OF_CARE_ACTIVITY_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CCDPackage.Literals.PLAN_OF_CARE_ACTIVITY_ACT);
			try {
				VALIDATE_PLAN_OF_CARE_ACTIVITY_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PLAN_OF_CARE_ACTIVITY_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PLAN_OF_CARE_ACTIVITY_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				planOfCareActivityAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CCDValidator.DIAGNOSTIC_SOURCE,
						CCDValidator.PLAN_OF_CARE_ACTIVITY_ACT__PLAN_OF_CARE_ACTIVITY_ACT_TEMPLATE_ID,
						CCDPlugin.INSTANCE.getString("PlanOfCareActivityActPlanOfCareActivityActTemplateId"),
						new Object[] { planOfCareActivityAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfCareActivityActId(PlanOfCareActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Act Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareActivityActId(PlanOfCareActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_CARE_ACTIVITY_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfCareActivityActId(PlanOfCareActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Act Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareActivityActId(PlanOfCareActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_PLAN_OF_CARE_ACTIVITY_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param planOfCareActivityAct The receiving '<em><b>Plan Of Care Activity Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePlanOfCareActivityActId(PlanOfCareActivityAct planOfCareActivityAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLAN_OF_CARE_ACTIVITY_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CCDPackage.Literals.PLAN_OF_CARE_ACTIVITY_ACT);
			try {
				VALIDATE_PLAN_OF_CARE_ACTIVITY_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PLAN_OF_CARE_ACTIVITY_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PLAN_OF_CARE_ACTIVITY_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(planOfCareActivityAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CCDValidator.DIAGNOSTIC_SOURCE,
						CCDValidator.PLAN_OF_CARE_ACTIVITY_ACT__PLAN_OF_CARE_ACTIVITY_ACT_ID,
						CCDPlugin.INSTANCE.getString("PlanOfCareActivityActPlanOfCareActivityActId"),
						new Object[] { planOfCareActivityAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfCareActivityActMoodCode(PlanOfCareActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Act Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareActivityActMoodCode(PlanOfCareActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_CARE_ACTIVITY_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfCareActivityActMoodCode(PlanOfCareActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Act Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareActivityActMoodCode(PlanOfCareActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_PLAN_OF_CARE_ACTIVITY_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param planOfCareActivityAct The receiving '<em><b>Plan Of Care Activity Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePlanOfCareActivityActMoodCode(PlanOfCareActivityAct planOfCareActivityAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLAN_OF_CARE_ACTIVITY_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CCDPackage.Literals.PLAN_OF_CARE_ACTIVITY_ACT);
			try {
				VALIDATE_PLAN_OF_CARE_ACTIVITY_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PLAN_OF_CARE_ACTIVITY_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PLAN_OF_CARE_ACTIVITY_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				planOfCareActivityAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CCDValidator.DIAGNOSTIC_SOURCE,
						CCDValidator.PLAN_OF_CARE_ACTIVITY_ACT__PLAN_OF_CARE_ACTIVITY_ACT_MOOD_CODE,
						CCDPlugin.INSTANCE.getString("PlanOfCareActivityActPlanOfCareActivityActMoodCode"),
						new Object[] { planOfCareActivityAct }));
			}

			return false;
		}
		return true;
	}

} // PlanOfCareActivityActOperations
