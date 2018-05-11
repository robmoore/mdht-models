/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Encounters Section Entries Optional2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getEncountersSectionEntriesOptional2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='EncountersSectionEntriesOptional2TemplateId EncountersSectionEntriesOptionalCode EncountersSectionEntriesOptionalCodeP' templateId.root='2.16.840.1.113883.10.20.22.2.22' templateId.extension='2015-08-01' constraints.validation.dependOn.EncountersSectionEntriesOptionalCode='EncountersSectionEntriesOptionalCodeP' constraints.validation.warning='EncountersSectionEntriesOptionalEncounterActivities'"
 * @generated
 */
public interface EncountersSectionEntriesOptional2 extends EncountersSectionEntriesOptional {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.2.22\' and id.extension.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateEncountersSectionEntriesOptional2TemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getEncounters()->select(encounter : cda::Encounter | not encounter.oclIsUndefined() and encounter.oclIsKindOf(consol::EncounterActivity2)).oclAsType(consol::EncounterActivity2)'"
	 * @generated
	 */
	EList<EncounterActivity2> getConsolEncounterActivity2s();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncountersSectionEntriesOptional2 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncountersSectionEntriesOptional2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // EncountersSectionEntriesOptional2
