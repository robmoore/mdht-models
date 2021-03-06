/**
 */
package org.openhealthtools.mdht.uml.cda.vsdr.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.mdht.uml.cda.ClinicalDocument;
import org.eclipse.mdht.uml.cda.ClinicalStatement;
import org.eclipse.mdht.uml.cda.Observation;
import org.eclipse.mdht.uml.cda.Organizer;
import org.eclipse.mdht.uml.cda.Section;
import org.eclipse.mdht.uml.hl7.rim.Act;
import org.eclipse.mdht.uml.hl7.rim.InfrastructureRoot;
import org.openhealthtools.mdht.uml.cda.vsdr.*;
import org.openhealthtools.mdht.uml.cda.vsdr.AutopsyPerformance;
import org.openhealthtools.mdht.uml.cda.vsdr.AutopsyResults;
import org.openhealthtools.mdht.uml.cda.vsdr.CertifyingDeath;
import org.openhealthtools.mdht.uml.cda.vsdr.CoronerCaseTransfer;
import org.openhealthtools.mdht.uml.cda.vsdr.CoronerReferral;
import org.openhealthtools.mdht.uml.cda.vsdr.DateandTimeofDeath;
import org.openhealthtools.mdht.uml.cda.vsdr.DeathCausalInformation;
import org.openhealthtools.mdht.uml.cda.vsdr.DeathLocationType;
import org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody;
import org.openhealthtools.mdht.uml.cda.vsdr.Injury;
import org.openhealthtools.mdht.uml.cda.vsdr.LocationofDeath;
import org.openhealthtools.mdht.uml.cda.vsdr.MannerofDeath;
import org.openhealthtools.mdht.uml.cda.vsdr.PregnancyStatus;
import org.openhealthtools.mdht.uml.cda.vsdr.PronouncingDeath;
import org.openhealthtools.mdht.uml.cda.vsdr.ReportingDeathInformationfromaClinicalSettingtoVitalRecords;
import org.openhealthtools.mdht.uml.cda.vsdr.TobaccoUse;
import org.openhealthtools.mdht.uml.cda.vsdr.VsdrPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.vsdr.VsdrPackage
 * @generated
 */
public class VsdrSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static VsdrPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VsdrSwitch() {
		if (modelPackage == null) {
			modelPackage = VsdrPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case VsdrPackage.REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS: {
				ReportingDeathInformationfromaClinicalSettingtoVitalRecords reportingDeathInformationfromaClinicalSettingtoVitalRecords = (ReportingDeathInformationfromaClinicalSettingtoVitalRecords)theEObject;
				T result = caseReportingDeathInformationfromaClinicalSettingtoVitalRecords(reportingDeathInformationfromaClinicalSettingtoVitalRecords);
				if (result == null) result = caseClinicalDocument(reportingDeathInformationfromaClinicalSettingtoVitalRecords);
				if (result == null) result = caseAct(reportingDeathInformationfromaClinicalSettingtoVitalRecords);
				if (result == null) result = caseInfrastructureRoot(reportingDeathInformationfromaClinicalSettingtoVitalRecords);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VsdrPackage.DEATH_REPORT_DOCUMENT_BODY: {
				DeathReportDocumentBody deathReportDocumentBody = (DeathReportDocumentBody)theEObject;
				T result = caseDeathReportDocumentBody(deathReportDocumentBody);
				if (result == null) result = caseSection(deathReportDocumentBody);
				if (result == null) result = caseAct(deathReportDocumentBody);
				if (result == null) result = caseInfrastructureRoot(deathReportDocumentBody);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VsdrPackage.DATEAND_TIMEOF_DEATH: {
				DateandTimeofDeath dateandTimeofDeath = (DateandTimeofDeath)theEObject;
				T result = caseDateandTimeofDeath(dateandTimeofDeath);
				if (result == null) result = caseObservation(dateandTimeofDeath);
				if (result == null) result = caseClinicalStatement(dateandTimeofDeath);
				if (result == null) result = caseAct(dateandTimeofDeath);
				if (result == null) result = caseInfrastructureRoot(dateandTimeofDeath);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VsdrPackage.LOCATIONOF_DEATH: {
				LocationofDeath locationofDeath = (LocationofDeath)theEObject;
				T result = caseLocationofDeath(locationofDeath);
				if (result == null) result = caseObservation(locationofDeath);
				if (result == null) result = caseClinicalStatement(locationofDeath);
				if (result == null) result = caseAct(locationofDeath);
				if (result == null) result = caseInfrastructureRoot(locationofDeath);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VsdrPackage.CERTIFYING_DEATH: {
				CertifyingDeath certifyingDeath = (CertifyingDeath)theEObject;
				T result = caseCertifyingDeath(certifyingDeath);
				if (result == null) result = caseObservation(certifyingDeath);
				if (result == null) result = caseClinicalStatement(certifyingDeath);
				if (result == null) result = caseAct(certifyingDeath);
				if (result == null) result = caseInfrastructureRoot(certifyingDeath);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VsdrPackage.MANNEROF_DEATH: {
				MannerofDeath mannerofDeath = (MannerofDeath)theEObject;
				T result = caseMannerofDeath(mannerofDeath);
				if (result == null) result = caseObservation(mannerofDeath);
				if (result == null) result = caseClinicalStatement(mannerofDeath);
				if (result == null) result = caseAct(mannerofDeath);
				if (result == null) result = caseInfrastructureRoot(mannerofDeath);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VsdrPackage.PREGNANCY_STATUS: {
				PregnancyStatus pregnancyStatus = (PregnancyStatus)theEObject;
				T result = casePregnancyStatus(pregnancyStatus);
				if (result == null) result = caseObservation(pregnancyStatus);
				if (result == null) result = caseClinicalStatement(pregnancyStatus);
				if (result == null) result = caseAct(pregnancyStatus);
				if (result == null) result = caseInfrastructureRoot(pregnancyStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VsdrPackage.TOBACCO_USE: {
				TobaccoUse tobaccoUse = (TobaccoUse)theEObject;
				T result = caseTobaccoUse(tobaccoUse);
				if (result == null) result = caseObservation(tobaccoUse);
				if (result == null) result = caseClinicalStatement(tobaccoUse);
				if (result == null) result = caseAct(tobaccoUse);
				if (result == null) result = caseInfrastructureRoot(tobaccoUse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VsdrPackage.INJURY: {
				Injury injury = (Injury)theEObject;
				T result = caseInjury(injury);
				if (result == null) result = caseOrganizer(injury);
				if (result == null) result = caseClinicalStatement(injury);
				if (result == null) result = caseAct(injury);
				if (result == null) result = caseInfrastructureRoot(injury);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VsdrPackage.DEATH_CAUSAL_INFORMATION: {
				DeathCausalInformation deathCausalInformation = (DeathCausalInformation)theEObject;
				T result = caseDeathCausalInformation(deathCausalInformation);
				if (result == null) result = caseOrganizer(deathCausalInformation);
				if (result == null) result = caseClinicalStatement(deathCausalInformation);
				if (result == null) result = caseAct(deathCausalInformation);
				if (result == null) result = caseInfrastructureRoot(deathCausalInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VsdrPackage.AUTOPSY_PERFORMANCE: {
				AutopsyPerformance autopsyPerformance = (AutopsyPerformance)theEObject;
				T result = caseAutopsyPerformance(autopsyPerformance);
				if (result == null) result = caseObservation(autopsyPerformance);
				if (result == null) result = caseClinicalStatement(autopsyPerformance);
				if (result == null) result = caseAct(autopsyPerformance);
				if (result == null) result = caseInfrastructureRoot(autopsyPerformance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VsdrPackage.AUTOPSY_RESULTS: {
				AutopsyResults autopsyResults = (AutopsyResults)theEObject;
				T result = caseAutopsyResults(autopsyResults);
				if (result == null) result = caseObservation(autopsyResults);
				if (result == null) result = caseClinicalStatement(autopsyResults);
				if (result == null) result = caseAct(autopsyResults);
				if (result == null) result = caseInfrastructureRoot(autopsyResults);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VsdrPackage.CORONER_REFERRAL: {
				CoronerReferral coronerReferral = (CoronerReferral)theEObject;
				T result = caseCoronerReferral(coronerReferral);
				if (result == null) result = caseObservation(coronerReferral);
				if (result == null) result = caseClinicalStatement(coronerReferral);
				if (result == null) result = caseAct(coronerReferral);
				if (result == null) result = caseInfrastructureRoot(coronerReferral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VsdrPackage.CORONER_CASE_TRANSFER: {
				CoronerCaseTransfer coronerCaseTransfer = (CoronerCaseTransfer)theEObject;
				T result = caseCoronerCaseTransfer(coronerCaseTransfer);
				if (result == null) result = caseObservation(coronerCaseTransfer);
				if (result == null) result = caseClinicalStatement(coronerCaseTransfer);
				if (result == null) result = caseAct(coronerCaseTransfer);
				if (result == null) result = caseInfrastructureRoot(coronerCaseTransfer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VsdrPackage.DEATH_LOCATION_TYPE: {
				DeathLocationType deathLocationType = (DeathLocationType)theEObject;
				T result = caseDeathLocationType(deathLocationType);
				if (result == null) result = caseObservation(deathLocationType);
				if (result == null) result = caseClinicalStatement(deathLocationType);
				if (result == null) result = caseAct(deathLocationType);
				if (result == null) result = caseInfrastructureRoot(deathLocationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VsdrPackage.PRONOUNCING_DEATH: {
				PronouncingDeath pronouncingDeath = (PronouncingDeath)theEObject;
				T result = casePronouncingDeath(pronouncingDeath);
				if (result == null) result = caseObservation(pronouncingDeath);
				if (result == null) result = caseClinicalStatement(pronouncingDeath);
				if (result == null) result = caseAct(pronouncingDeath);
				if (result == null) result = caseInfrastructureRoot(pronouncingDeath);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reporting Death Informationfroma Clinical Settingto Vital Records</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reporting Death Informationfroma Clinical Settingto Vital Records</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReportingDeathInformationfromaClinicalSettingtoVitalRecords(ReportingDeathInformationfromaClinicalSettingtoVitalRecords object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Death Report Document Body</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Death Report Document Body</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeathReportDocumentBody(DeathReportDocumentBody object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dateand Timeof Death</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dateand Timeof Death</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateandTimeofDeath(DateandTimeofDeath object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Locationof Death</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Locationof Death</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocationofDeath(LocationofDeath object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Certifying Death</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Certifying Death</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCertifyingDeath(CertifyingDeath object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mannerof Death</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mannerof Death</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMannerofDeath(MannerofDeath object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pregnancy Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pregnancy Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePregnancyStatus(PregnancyStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tobacco Use</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tobacco Use</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTobaccoUse(TobaccoUse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Injury</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Injury</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInjury(Injury object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Death Causal Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Death Causal Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeathCausalInformation(DeathCausalInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Autopsy Performance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Autopsy Performance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAutopsyPerformance(AutopsyPerformance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Autopsy Results</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Autopsy Results</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAutopsyResults(AutopsyResults object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coroner Referral</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coroner Referral</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoronerReferral(CoronerReferral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coroner Case Transfer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coroner Case Transfer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoronerCaseTransfer(CoronerCaseTransfer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Death Location Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Death Location Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeathLocationType(DeathLocationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pronouncing Death</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pronouncing Death</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePronouncingDeath(PronouncingDeath object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Infrastructure Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Infrastructure Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfrastructureRoot(InfrastructureRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Act</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Act</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAct(Act object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clinical Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clinical Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClinicalDocument(ClinicalDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSection(Section object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clinical Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clinical Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClinicalStatement(ClinicalStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObservation(Observation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organizer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrganizer(Organizer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //VsdrSwitch
