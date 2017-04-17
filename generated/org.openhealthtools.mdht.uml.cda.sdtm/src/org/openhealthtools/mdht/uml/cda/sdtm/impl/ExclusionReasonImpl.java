/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.sdtm.ExclusionReason;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.ExclusionReasonOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exclusion Reason</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ExclusionReasonImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements ExclusionReason {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExclusionReasonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdtmPackage.Literals.EXCLUSION_REASON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateExclusionReasonTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ExclusionReasonOperations.validateExclusionReasonTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateExclusionReasonMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ExclusionReasonOperations.validateExclusionReasonMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateExclusionReasonCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ExclusionReasonOperations.validateExclusionReasonCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateExclusionReasonCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ExclusionReasonOperations.validateExclusionReasonCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateExclusionReasonValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ExclusionReasonOperations.validateExclusionReasonValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateExclusionReasonValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ExclusionReasonOperations.validateExclusionReasonValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExclusionReason init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public ExclusionReason init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} //ExclusionReasonImpl
