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
import org.eclipse.mdht.uml.cda.operations.DataEntererOperations;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPlugin;
import org.openhealthtools.mdht.uml.cda.ihe.ScanDataEnterer;
import org.openhealthtools.mdht.uml.cda.ihe.util.IHEValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Scan Data Enterer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ScanDataEnterer#validateScanDataEntererTimeEqualsDocumentEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scan Data Enterer Time Equals Document Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ScanDataEnterer#validateScanDataEntererHasAssignedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scan Data Enterer Has Assigned Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ScanDataEnterer#validateScanDataEntererTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scan Data Enterer Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ScanDataEnterer#validateScanDataEntererTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scan Data Enterer Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScanDataEntererOperations extends DataEntererOperations {
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
	protected ScanDataEntererOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateScanDataEntererTimeEqualsDocumentEffectiveTime(ScanDataEnterer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scan Data Enterer Time Equals Document Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScanDataEntererTimeEqualsDocumentEffectiveTime(ScanDataEnterer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SCAN_DATA_ENTERER_TIME_EQUALS_DOCUMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.time.value = self.getClinicalDocument().effectiveTime.value";

	/**
	 * The cached OCL invariant for the '{@link #validateScanDataEntererTimeEqualsDocumentEffectiveTime(ScanDataEnterer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scan Data Enterer Time Equals Document Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScanDataEntererTimeEqualsDocumentEffectiveTime(ScanDataEnterer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_SCAN_DATA_ENTERER_TIME_EQUALS_DOCUMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param scanDataEnterer The receiving '<em><b>Scan Data Enterer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateScanDataEntererTimeEqualsDocumentEffectiveTime(ScanDataEnterer scanDataEnterer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SCAN_DATA_ENTERER_TIME_EQUALS_DOCUMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(IHEPackage.Literals.SCAN_DATA_ENTERER);
			try {
				VALIDATE_SCAN_DATA_ENTERER_TIME_EQUALS_DOCUMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_SCAN_DATA_ENTERER_TIME_EQUALS_DOCUMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SCAN_DATA_ENTERER_TIME_EQUALS_DOCUMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				scanDataEnterer)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
						IHEValidator.SCAN_DATA_ENTERER__SCAN_DATA_ENTERER_TIME_EQUALS_DOCUMENT_EFFECTIVE_TIME,
						IHEPlugin.INSTANCE.getString("ScanDataEntererScanDataEntererTimeEqualsDocumentEffectiveTime"),
						new Object[] { scanDataEnterer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateScanDataEntererHasAssignedEntityId(ScanDataEnterer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scan Data Enterer Has Assigned Entity Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScanDataEntererHasAssignedEntityId(ScanDataEnterer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SCAN_DATA_ENTERER_HAS_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.assignedEntity.id->forAll(ident : datatypes::II | not ident.root.oclIsUndefined() and not ident.extension.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateScanDataEntererHasAssignedEntityId(ScanDataEnterer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scan Data Enterer Has Assigned Entity Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScanDataEntererHasAssignedEntityId(ScanDataEnterer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_SCAN_DATA_ENTERER_HAS_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param scanDataEnterer The receiving '<em><b>Scan Data Enterer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateScanDataEntererHasAssignedEntityId(ScanDataEnterer scanDataEnterer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SCAN_DATA_ENTERER_HAS_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(IHEPackage.Literals.SCAN_DATA_ENTERER);
			try {
				VALIDATE_SCAN_DATA_ENTERER_HAS_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_SCAN_DATA_ENTERER_HAS_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SCAN_DATA_ENTERER_HAS_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				scanDataEnterer)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
						IHEValidator.SCAN_DATA_ENTERER__SCAN_DATA_ENTERER_HAS_ASSIGNED_ENTITY_ID,
						IHEPlugin.INSTANCE.getString("ScanDataEntererScanDataEntererHasAssignedEntityId"),
						new Object[] { scanDataEnterer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateScanDataEntererTemplateId(ScanDataEnterer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scan Data Enterer Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScanDataEntererTemplateId(ScanDataEnterer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SCAN_DATA_ENTERER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.2.20.3')";

	/**
	 * The cached OCL invariant for the '{@link #validateScanDataEntererTemplateId(ScanDataEnterer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scan Data Enterer Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScanDataEntererTemplateId(ScanDataEnterer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_SCAN_DATA_ENTERER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param scanDataEnterer The receiving '<em><b>Scan Data Enterer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateScanDataEntererTemplateId(ScanDataEnterer scanDataEnterer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SCAN_DATA_ENTERER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(IHEPackage.Literals.SCAN_DATA_ENTERER);
			try {
				VALIDATE_SCAN_DATA_ENTERER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_SCAN_DATA_ENTERER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SCAN_DATA_ENTERER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(scanDataEnterer)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
						IHEValidator.SCAN_DATA_ENTERER__SCAN_DATA_ENTERER_TEMPLATE_ID,
						IHEPlugin.INSTANCE.getString("ScanDataEntererScanDataEntererTemplateId"),
						new Object[] { scanDataEnterer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateScanDataEntererTime(ScanDataEnterer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scan Data Enterer Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScanDataEntererTime(ScanDataEnterer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SCAN_DATA_ENTERER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.time.oclIsUndefined() or self.time.isNullFlavorUndefined()) implies (not self.time.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateScanDataEntererTime(ScanDataEnterer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scan Data Enterer Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScanDataEntererTime(ScanDataEnterer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_SCAN_DATA_ENTERER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param scanDataEnterer The receiving '<em><b>Scan Data Enterer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateScanDataEntererTime(ScanDataEnterer scanDataEnterer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SCAN_DATA_ENTERER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(IHEPackage.Literals.SCAN_DATA_ENTERER);
			try {
				VALIDATE_SCAN_DATA_ENTERER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_SCAN_DATA_ENTERER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_SCAN_DATA_ENTERER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			scanDataEnterer)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
						IHEValidator.SCAN_DATA_ENTERER__SCAN_DATA_ENTERER_TIME,
						IHEPlugin.INSTANCE.getString("ScanDataEntererScanDataEntererTime"),
						new Object[] { scanDataEnterer }));
			}

			return false;
		}
		return true;
	}

} // ScanDataEntererOperations
