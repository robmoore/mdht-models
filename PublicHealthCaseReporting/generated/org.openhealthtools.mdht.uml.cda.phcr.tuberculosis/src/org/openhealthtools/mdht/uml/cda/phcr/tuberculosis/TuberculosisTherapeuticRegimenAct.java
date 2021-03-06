/*******************************************************************************
 * Copyright (c) 2012, Public Health Data Standards Consortium (PHDSC)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     PHDSC - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.phcr.tuberculosis;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.phcr.TherapeuticRegimenAct;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Therapeutic Regimen Act</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPackage#getTuberculosisTherapeuticRegimenAct()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='TuberculosisTherapeuticRegimenActTemplateId' templateId.root='2.16.840.1.113883.10.20.15.3.18' constraints.validation.warning='TuberculosisTherapeuticRegimenActTuberculosisTreatmentGivenSubstanceAdministration' constraints.validation.info='TuberculosisTherapeuticRegimenActTuberculosisTreatmentNotGivenSubstanceAdministration'"
 * @generated
 */
public interface TuberculosisTherapeuticRegimenAct extends TherapeuticRegimenAct {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.substanceAdministration.oclIsUndefined() and entryRelationship.substanceAdministration.oclIsKindOf(tuberculosis::TuberculosisTreatmentGivenSubstanceAdministration) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.substanceAdministration.oclIsUndefined() and entryRelationship.substanceAdministration.oclIsKindOf(tuberculosis::TuberculosisTreatmentGivenSubstanceAdministration) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)'"
	 * @generated
	 */
	boolean validateTuberculosisTherapeuticRegimenActTuberculosisTreatmentGivenSubstanceAdministration(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.substanceAdministration.oclIsUndefined() and entryRelationship.substanceAdministration.oclIsKindOf(tuberculosis::TuberculosisTreatmentNotGivenSubstanceAdministration) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.substanceAdministration.oclIsUndefined() and entryRelationship.substanceAdministration.oclIsKindOf(tuberculosis::TuberculosisTreatmentNotGivenSubstanceAdministration) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)'"
	 * @generated
	 */
	boolean validateTuberculosisTherapeuticRegimenActTuberculosisTreatmentNotGivenSubstanceAdministration(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(tuberculosis::TuberculosisTreatmentGivenSubstanceAdministration)).oclAsType(tuberculosis::TuberculosisTreatmentGivenSubstanceAdministration)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(tuberculosis::TuberculosisTreatmentGivenSubstanceAdministration)).oclAsType(tuberculosis::TuberculosisTreatmentGivenSubstanceAdministration)'"
	 * @generated
	 */
	EList<TuberculosisTreatmentGivenSubstanceAdministration> getTuberculosisTreatmentGivenSubstanceAdministrations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(tuberculosis::TuberculosisTreatmentNotGivenSubstanceAdministration)).oclAsType(tuberculosis::TuberculosisTreatmentNotGivenSubstanceAdministration)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(tuberculosis::TuberculosisTreatmentNotGivenSubstanceAdministration)).oclAsType(tuberculosis::TuberculosisTreatmentNotGivenSubstanceAdministration)'"
	 * @generated
	 */
	EList<TuberculosisTreatmentNotGivenSubstanceAdministration> getTuberculosisTreatmentNotGivenSubstanceAdministrations();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TuberculosisTherapeuticRegimenAct init();

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TuberculosisTherapeuticRegimenAct init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // TuberculosisTherapeuticRegimenAct
