/*******************************************************************************
 * Copyright (c) 2009, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ihe.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.mdht.uml.cda.operations.SectionOperations;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPlugin;
import org.openhealthtools.mdht.uml.cda.ihe.ReasonForReferralSection;
import org.openhealthtools.mdht.uml.cda.ihe.util.IHEValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Reason For Referral Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ReasonForReferralSection#validateReasonForReferralSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Referral Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ReasonForReferralSection#validateReasonForReferralSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Referral Section Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReasonForReferralSectionOperations extends SectionOperations {
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
	protected ReasonForReferralSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReasonForReferralSectionTemplateId(ReasonForReferralSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Referral Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReasonForReferralSectionTemplateId(ReasonForReferralSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REASON_FOR_REFERRAL_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.3.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateReasonForReferralSectionTemplateId(ReasonForReferralSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Referral Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReasonForReferralSectionTemplateId(ReasonForReferralSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_REASON_FOR_REFERRAL_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reasonForReferralSection The receiving '<em><b>Reason For Referral Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateReasonForReferralSectionTemplateId(ReasonForReferralSection reasonForReferralSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_REASON_FOR_REFERRAL_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(IHEPackage.Literals.REASON_FOR_REFERRAL_SECTION);
			try {
				VALIDATE_REASON_FOR_REFERRAL_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_REASON_FOR_REFERRAL_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_REASON_FOR_REFERRAL_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				reasonForReferralSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
						IHEValidator.REASON_FOR_REFERRAL_SECTION__REASON_FOR_REFERRAL_SECTION_TEMPLATE_ID,
						IHEPlugin.INSTANCE.getString("ReasonForReferralSectionReasonForReferralSectionTemplateId"),
						new Object[] { reasonForReferralSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReasonForReferralSectionCode(ReasonForReferralSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Referral Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReasonForReferralSectionCode(ReasonForReferralSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REASON_FOR_REFERRAL_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in " +
			"value.code = '42349-1' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateReasonForReferralSectionCode(ReasonForReferralSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Referral Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReasonForReferralSectionCode(ReasonForReferralSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_REASON_FOR_REFERRAL_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reasonForReferralSection The receiving '<em><b>Reason For Referral Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateReasonForReferralSectionCode(ReasonForReferralSection reasonForReferralSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_REASON_FOR_REFERRAL_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(IHEPackage.Literals.REASON_FOR_REFERRAL_SECTION);
			try {
				VALIDATE_REASON_FOR_REFERRAL_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_REASON_FOR_REFERRAL_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_REASON_FOR_REFERRAL_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				reasonForReferralSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
						IHEValidator.REASON_FOR_REFERRAL_SECTION__REASON_FOR_REFERRAL_SECTION_CODE,
						IHEPlugin.INSTANCE.getString("ReasonForReferralSectionReasonForReferralSectionCode"),
						new Object[] { reasonForReferralSection }));
			}

			return false;
		}
		return true;
	}

} // ReasonForReferralSectionOperations
