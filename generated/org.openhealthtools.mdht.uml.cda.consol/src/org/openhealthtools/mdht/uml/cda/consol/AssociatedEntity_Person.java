/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.openhealthtools.mdht.uml.cda.Person;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Associated Entity Person</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getAssociatedEntity_Person()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='PersonName'"
 * @generated
 */
public interface AssociatedEntity_Person extends Person {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.name->isEmpty() or self.name->exists(element | element.isNullFlavorUndefined())) implies (self.name->size() = 1)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.name->isEmpty() or self.name->exists(element | element.isNullFlavorUndefined())) implies (self.name->size() = 1)'"
	 * @generated
	 */
	boolean validatePersonName(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociatedEntity_Person init();
} // AssociatedEntity_Person