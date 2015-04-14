/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.Indication2;
import org.openhealthtools.mdht.uml.cda.consol.Instruction2;
import org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2;

import org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProcedureActivityObservation2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedure Activity Observation2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ProcedureActivityObservation2Impl extends ProcedureActivityObservationImpl implements
		ProcedureActivityObservation2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedureActivityObservation2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureActivityObservation2InstructionsInversion(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityObservation2Operations.validateProcedureActivityObservation2InstructionsInversion(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityObservation2CodeCodeSystems(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityObservation2Operations.validateProcedureActivityObservation2CodeCodeSystems(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityObservation2CodeSuggestedCodeSystems(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityObservation2Operations.validateProcedureActivityObservation2CodeSuggestedCodeSystems(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityObservationStatusCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityObservation2Operations.validateProcedureActivityObservationStatusCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureActivityObservationIndication2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityObservation2Operations.validateProcedureActivityObservationIndication2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureActivityObservationMedicationActivity2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityObservation2Operations.validateProcedureActivityObservationMedicationActivity2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureActivityObservationInstruction2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityObservation2Operations.validateProcedureActivityObservationInstruction2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityObservation2AuthorParticipation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityObservation2Operations.validateProcedureActivityObservation2AuthorParticipation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityObservation2ReactionObservation2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityObservation2Operations.validateProcedureActivityObservation2ReactionObservation2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityObservation2ANYNullFlavor(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityObservation2Operations.validateProcedureActivityObservation2ANYNullFlavor(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityObservation2ProcedureObservationPerformerProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityAddr(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureActivityObservation2Operations.validateProcedureActivityObservation2ProcedureObservationPerformerProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityAddr(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityObservation2ProcedureObservationPerformerProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityTelecom(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureActivityObservation2Operations.validateProcedureActivityObservation2ProcedureObservationPerformerProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityTelecom(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityObservation2ProcedureActivityObservationProcedureObservationPerformerAssignedEntity(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureActivityObservation2Operations.validateProcedureActivityObservation2ProcedureActivityObservationProcedureObservationPerformerAssignedEntity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Indication2> getConsolIndication2s() {
		return ProcedureActivityObservation2Operations.getConsolIndication2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MedicationActivity2> getConsolMedicationActivity2s() {
		return ProcedureActivityObservation2Operations.getConsolMedicationActivity2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Instruction2 getConsolInstruction2() {
		return ProcedureActivityObservation2Operations.getConsolInstruction2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReactionObservation2> getReactionObservation2s() {
		return ProcedureActivityObservation2Operations.getReactionObservation2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureActivityObservationTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityObservation2Operations.validateProcedureActivityObservationTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureActivityObservationTargetSiteCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityObservation2Operations.validateProcedureActivityObservationTargetSiteCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureActivityObservationTargetSiteCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityObservation2Operations.validateProcedureActivityObservationTargetSiteCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureActivityObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureActivityObservation2Operations.validateProcedureActivityObservationMoodCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureActivityObservationStatusCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityObservation2Operations.validateProcedureActivityObservationStatusCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureActivityObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureActivityObservation2Operations.validateProcedureActivityObservationValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureActivityObservationPerformer(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityObservation2Operations.validateProcedureActivityObservationPerformer(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcedureActivityObservation2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcedureActivityObservation2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // ProcedureActivityObservation2Impl
