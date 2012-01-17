/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.openhealthtools.mdht.uml.cda.consol.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConsolFactoryImpl extends EFactoryImpl implements ConsolFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConsolFactory init() {
		try {
			ConsolFactory theConsolFactory = (ConsolFactory) EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/consol");
			if (theConsolFactory != null) {
				return theConsolFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ConsolFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsolFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ConsolPackage.GENERAL_HEADER_CONSTRAINTS:
				return createGeneralHeaderConstraints();
			case ConsolPackage.GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET:
				return createGeneralHeaderConstraints_RecordTarget();
			case ConsolPackage.RECORD_TARGET_PATIENT_ROLE:
				return createRecordTarget_PatientRole();
			case ConsolPackage.PATIENT_ROLE_PATIENT:
				return createPatientRole_Patient();
			case ConsolPackage.PATIENT_GUARDIAN:
				return createPatient_Guardian();
			case ConsolPackage.PATIENT_LANGUAGE_COMMUNICATION:
				return createPatient_LanguageCommunication();
			case ConsolPackage.PATIENT_BIRTHPLACE:
				return createPatient_Birthplace();
			case ConsolPackage.BIRTHPLACE_PLACE:
				return createBirthplace_Place();
			case ConsolPackage.PATIENT_ROLE_PROVIDER_ORGANIZATION:
				return createPatientRole_ProviderOrganization();
			case ConsolPackage.GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF:
				return createGeneralHeaderConstraints_ComponentOf();
			case ConsolPackage.COMPONENT_OF_ENCOMPASSING_ENCOUNTER:
				return createComponentOf_EncompassingEncounter();
			case ConsolPackage.GENERAL_HEADER_CONSTRAINTS_AUTHOR:
				return createGeneralHeaderConstraints_Author();
			case ConsolPackage.AUTHOR_ASSIGNED_AUTHOR:
				return createAuthor_AssignedAuthor();
			case ConsolPackage.ASSIGNED_AUTHOR_AUTHORING_DEVICE:
				return createAssignedAuthor_AuthoringDevice();
			case ConsolPackage.GENERAL_HEADER_CONSTRAINTS_PERSON:
				return createGeneralHeaderConstraints_Person();
			case ConsolPackage.GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER:
				return createGeneralHeaderConstraints_DataEnterer();
			case ConsolPackage.DATA_ENTERER_ASSIGNED_ENTITY:
				return createDataEnterer_AssignedEntity();
			case ConsolPackage.GENERAL_HEADER_CONSTRAINTS_CUSTODIAN:
				return createGeneralHeaderConstraints_Custodian();
			case ConsolPackage.CUSTODIAN_ASSIGNED_CUSTODIAN:
				return createCustodian_AssignedCustodian();
			case ConsolPackage.ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION:
				return createAssignedCustodian_CustodianOrganization();
			case ConsolPackage.GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT:
				return createGeneralHeaderConstraints_InformationRecipient();
			case ConsolPackage.INFORMATION_RECIPIENT_INTENDED_RECIPIENT:
				return createInformationRecipient_IntendedRecipient();
			case ConsolPackage.INTENDED_RECIPIENT_ORGANIZATION:
				return createIntendedRecipient_Organization();
			case ConsolPackage.GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR:
				return createGeneralHeaderConstraints_LegalAuthenticator();
			case ConsolPackage.LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY:
				return createLegalAuthenticator_AssignedEntity();
			case ConsolPackage.GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR:
				return createGeneralHeaderConstraints_Authenticator();
			case ConsolPackage.AUTHENTICATOR_ASSIGNED_ENTITY:
				return createAuthenticator_AssignedEntity();
			case ConsolPackage.GENERAL_HEADER_CONSTRAINTS_INFORMANT:
				return createGeneralHeaderConstraints_Informant();
			case ConsolPackage.INFORMANT_ASSIGNED_ENTITY:
				return createInformant_AssignedEntity();
			case ConsolPackage.INFORMANT_RELATED_ENTITY:
				return createInformant_RelatedEntity();
			case ConsolPackage.GENERAL_HEADER_CONSTRAINTS_PARTICIPANT_SUPPORT:
				return createGeneralHeaderConstraints_ParticipantSupport();
			case ConsolPackage.GENERAL_HEADER_CONSTRAINTS_IN_FULFILLMENT_OF:
				return createGeneralHeaderConstraints_InFulfillmentOf();
			case ConsolPackage.IN_FULFILLMENT_OF_ORDER:
				return createInFulfillmentOf_Order();
			case ConsolPackage.ALLERGY_PROBLEM_ACT:
				return createAllergyProblemAct();
			case ConsolPackage.ALLERGY_OBSERVATION:
				return createAllergyObservation();
			case ConsolPackage.REACTION_OBSERVATION:
				return createReactionObservation();
			case ConsolPackage.SEVERITY_OBSERVATION:
				return createSeverityObservation();
			case ConsolPackage.PROCEDURE_ACTIVITY_PROCEDURE:
				return createProcedureActivityProcedure();
			case ConsolPackage.INDICATION:
				return createIndication();
			case ConsolPackage.SERVICE_DELIVERY_LOCATION:
				return createServiceDeliveryLocation();
			case ConsolPackage.MEDICATION_ACTIVITY:
				return createMedicationActivity();
			case ConsolPackage.MEDICATION_SUPPLY_ORDER:
				return createMedicationSupplyOrder();
			case ConsolPackage.INSTRUCTIONS:
				return createInstructions();
			case ConsolPackage.MEDICATION_DISPENSE:
				return createMedicationDispense();
			case ConsolPackage.DRUG_VEHICLE:
				return createDrugVehicle();
			case ConsolPackage.PRODUCT_INSTANCE:
				return createProductInstance();
			case ConsolPackage.PRODUCT_INSTANCE_SCOPING_ENTITY:
				return createProductInstance_ScopingEntity();
			case ConsolPackage.PRODUCT_INSTANCE_PLAYING_DEVICE:
				return createProductInstance_PlayingDevice();
			case ConsolPackage.ALLERGY_STATUS_OBSERVATION:
				return createAllergyStatusObservation();
			case ConsolPackage.AGE_OBSERVATION:
				return createAgeObservation();
			case ConsolPackage.HEALTH_STATUS_OBSERVATION:
				return createHealthStatusObservation();
			case ConsolPackage.COMMENT:
				return createComment();
			case ConsolPackage.MEDICATION_SERIES_NUMBER_OBSERVATION:
				return createMedicationSeriesNumberObservation();
			case ConsolPackage.MEDICATION_STATUS_OBSERVATION:
				return createMedicationStatusObservation();
			case ConsolPackage.INTERNAL_REFERENCE:
				return createInternalReference();
			case ConsolPackage.MEDICATION_TYPE:
				return createMedicationType();
			case ConsolPackage.NON_MEDICINAL_SUPPLY_ACTIVITY:
				return createNonMedicinalSupplyActivity();
			case ConsolPackage.MEDICATION_FULLFILLMENT_INSTRUCTIONS:
				return createMedicationFullfillmentInstructions();
			case ConsolPackage.PROBLEM_CONCERN_ACT:
				return createProblemConcernAct();
			case ConsolPackage.PROBLEM_OBSERVATION:
				return createProblemObservation();
			case ConsolPackage.PROBLEM_STATUS:
				return createProblemStatus();
			case ConsolPackage.CONTINUITY_OF_CARE_DOCUMENT:
				return createContinuityOfCareDocument();
			case ConsolPackage.ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL:
				return createAdvanceDirectivesSectionEntriesOptional();
			case ConsolPackage.ADVANCE_DIRECTIVE_OBSERVATION:
				return createAdvanceDirectiveObservation();
			case ConsolPackage.ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE:
				return createAdvanceDirectiveObservation_Reference();
			case ConsolPackage.REFERENCE_EXTERNAL_DOCUMENT:
				return createReference_ExternalDocument();
			case ConsolPackage.ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN:
				return createAdvanceDirectiveObservation_Custodian();
			case ConsolPackage.CUSTODIAN_CUSTODIAN_ROLE:
				return createCustodian_CustodianRole();
			case ConsolPackage.CUSTODIAN_ROLE_CUSTODIAN_ENTITY:
				return createCustodianRole_CustodianEntity();
			case ConsolPackage.ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER:
				return createAdvanceDirectiveObservation_Verifier();
			case ConsolPackage.ALLERGIES_SECTION:
				return createAllergiesSection();
			case ConsolPackage.ALLERGIES_SECTION_ENTRIES_OPTIONAL:
				return createAllergiesSectionEntriesOptional();
			case ConsolPackage.ENCOUNTERS_SECTION_ENTRIES_OPTIONAL:
				return createEncountersSectionEntriesOptional();
			case ConsolPackage.ENCOUNTER_ACTIVITIES:
				return createEncounterActivities();
			case ConsolPackage.IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL:
				return createImmunizationsSectionEntriesOptional();
			case ConsolPackage.IMMUNIZATION_ACTIVITY:
				return createImmunizationActivity();
			case ConsolPackage.IMMUNIZATION_REFUSAL_REASON:
				return createImmunizationRefusalReason();
			case ConsolPackage.PAYERS_SECTION:
				return createPayersSection();
			case ConsolPackage.COVERAGE_ACTIVITY:
				return createCoverageActivity();
			case ConsolPackage.POLICY_ACTIVITY:
				return createPolicyActivity();
			case ConsolPackage.AUTHORIZATION_ACTIVITY:
				return createAuthorizationActivity();
			case ConsolPackage.MEDICATIONS_SECTION:
				return createMedicationsSection();
			case ConsolPackage.MEDICATIONS_SECTION_ENTRIES_OPTIONAL:
				return createMedicationsSectionEntriesOptional();
			case ConsolPackage.PLAN_OF_CARE_SECTION:
				return createPlanOfCareSection();
			case ConsolPackage.PLAN_OF_CARE_ACTIVITY_ACT:
				return createPlanOfCareActivityAct();
			case ConsolPackage.PLAN_OF_CARE_ACTIVITY_ENCOUNTER:
				return createPlanOfCareActivityEncounter();
			case ConsolPackage.PLAN_OF_CARE_ACTIVITY_OBSERVATION:
				return createPlanOfCareActivityObservation();
			case ConsolPackage.PLAN_OF_CARE_ACTIVITY_PROCEDURE:
				return createPlanOfCareActivityProcedure();
			case ConsolPackage.PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION:
				return createPlanOfCareActivitySubstanceAdministration();
			case ConsolPackage.PLAN_OF_CARE_ACTIVITY_SUPPLY:
				return createPlanOfCareActivitySupply();
			case ConsolPackage.PROCEDURES_SECTION:
				return createProceduresSection();
			case ConsolPackage.PROCEDURES_SECTION_ENTRIES_OPTIONAL:
				return createProceduresSectionEntriesOptional();
			case ConsolPackage.PROCEDURE_ACTIVITY_OBSERVATION:
				return createProcedureActivityObservation();
			case ConsolPackage.PROCEDURE_ACTIVITY_ACT:
				return createProcedureActivityAct();
			case ConsolPackage.VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL:
				return createVitalSignsSectionEntriesOptional();
			case ConsolPackage.VITAL_SIGNS_ORGANIZER:
				return createVitalSignsOrganizer();
			case ConsolPackage.VITAL_SIGN_OBSERVATION:
				return createVitalSignObservation();
			case ConsolPackage.FAMILY_HISTORY_SECTION:
				return createFamilyHistorySection();
			case ConsolPackage.FAMILY_HISTORY_ORGANIZER:
				return createFamilyHistoryOrganizer();
			case ConsolPackage.FAMILY_HISTORY_OBSERVATION:
				return createFamilyHistoryObservation();
			case ConsolPackage.FAMILY_HISTORY_DEATH_OBSERVATION:
				return createFamilyHistoryDeathObservation();
			case ConsolPackage.SOCIAL_HISTORY_SECTION:
				return createSocialHistorySection();
			case ConsolPackage.SOCIAL_HISTORY_OBSERVATION:
				return createSocialHistoryObservation();
			case ConsolPackage.PREGNANCY_OBSERVATION:
				return createPregnancyObservation();
			case ConsolPackage.ESTIMATED_DATE_OF_DELIVERY:
				return createEstimatedDateOfDelivery();
			case ConsolPackage.RESULTS_SECTION:
				return createResultsSection();
			case ConsolPackage.RESULTS_SECTION_ENTRIES_OPTIONAL:
				return createResultsSectionEntriesOptional();
			case ConsolPackage.RESULT_ORGANIZER:
				return createResultOrganizer();
			case ConsolPackage.RESULT_OBSERVATION:
				return createResultObservation();
			case ConsolPackage.MEDICAL_EQUIPMENT_SECTION:
				return createMedicalEquipmentSection();
			case ConsolPackage.FUNCTIONAL_STATUS_SECTION:
				return createFunctionalStatusSection();
			case ConsolPackage.PROBLEM_SECTION:
				return createProblemSection();
			case ConsolPackage.PROBLEM_SECTION_ENTRIES_OPTIONAL:
				return createProblemSectionEntriesOptional();
			case ConsolPackage.SOCIAL_HISTORY_STATUS_OBSERVATION:
				return createSocialHistoryStatusObservation();
			case ConsolPackage.PURPOSE_SECTION:
				return createPurposeSection();
			case ConsolPackage.PURPOSE_ACTIVITY:
				return createPurposeActivity();
			case ConsolPackage.ADVANCE_DIRECTIVES_SECTION:
				return createAdvanceDirectivesSection();
			case ConsolPackage.ADVANCE_DIRECTIVE_VERIFICATION:
				return createAdvanceDirectiveVerification();
			case ConsolPackage.ADVANCE_DIRECTIVE_STATUS_OBSERVATION:
				return createAdvanceDirectiveStatusObservation();
			case ConsolPackage.ENCOUNTERS_SECTION:
				return createEncountersSection();
			case ConsolPackage.ENCOUNTER:
				return createEncounter();
			case ConsolPackage.IMMUNIZATIONS_SECTION:
				return createImmunizationsSection();
			case ConsolPackage.INSURANCE_PROVIDER:
				return createInsuranceProvider();
			case ConsolPackage.PAYER_ENTRY:
				return createPayerEntry();
			case ConsolPackage.COVERED_PARTY:
				return createCoveredParty();
			case ConsolPackage.POLICY_SUBSCRIBER:
				return createPolicySubscriber();
			case ConsolPackage.EXTERNAL_REFERENCE:
				return createExternalReference();
			case ConsolPackage.SUPPORT:
				return createSupport();
			case ConsolPackage.VITAL_SIGNS_SECTION:
				return createVitalSignsSection();
			case ConsolPackage.HISTORY_OF_PAST_ILLNESS_SECTION:
				return createHistoryOfPastIllnessSection();
			case ConsolPackage.CHIEF_COMPLAINT_SECTION:
				return createChiefComplaintSection();
			case ConsolPackage.REASON_FOR_REFERRAL_SECTION:
				return createReasonForReferralSection();
			case ConsolPackage.HISTORY_OF_PRESENT_ILLNESS_SECTION:
				return createHistoryOfPresentIllnessSection();
			case ConsolPackage.HOSPITAL_ADMISSION_DIAGNOSIS_SECTION:
				return createHospitalAdmissionDiagnosisSection();
			case ConsolPackage.HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL:
				return createHospitalAdmissionMedicationsSectionEntriesOptional();
			case ConsolPackage.ADMISSION_MEDICATION:
				return createAdmissionMedication();
			case ConsolPackage.MEDICATIONS_ADMINISTERED_SECTION:
				return createMedicationsAdministeredSection();
			case ConsolPackage.PHYSICAL_EXAM_SECTION:
				return createPhysicalExamSection();
			case ConsolPackage.GENERAL_STATUS_SECTION:
				return createGeneralStatusSection();
			case ConsolPackage.REVIEW_OF_SYSTEMS_SECTION:
				return createReviewOfSystemsSection();
			case ConsolPackage.ASSESSMENT_AND_PLAN_SECTION:
				return createAssessmentAndPlanSection();
			case ConsolPackage.LANGUAGE_SPOKEN:
				return createLanguageSpoken();
			case ConsolPackage.HEALTHCARE_PROVIDER:
				return createHealthcareProvider();
			case ConsolPackage.SUPPORT_GUARDIAN:
				return createSupportGuardian();
			case ConsolPackage.SUPPORT_PARTICIPANT:
				return createSupportParticipant();
			case ConsolPackage.SURGICAL_DRAINS_SECTION:
				return createSurgicalDrainsSection();
			case ConsolPackage.UNSTRUCTURED_DOCUMENT:
				return createUnstructuredDocument();
			case ConsolPackage.UNSTRUCTURED_DOCUMENT_RECORD_TARGET:
				return createUnstructuredDocument_RecordTarget();
			case ConsolPackage.RECORD_TARGET_PATIENT_ROLE2:
				return createRecordTarget_PatientRole2();
			case ConsolPackage.UNSTRUCTURED_DOCUMENT_AUTHOR:
				return createUnstructuredDocument_Author();
			case ConsolPackage.AUTHOR_ASSIGNED_AUTHOR2:
				return createAuthor_AssignedAuthor2();
			case ConsolPackage.UNSTRUCTURED_DOCUMENT_CUSTODIAN:
				return createUnstructuredDocument_Custodian();
			case ConsolPackage.CUSTODIAN_ASSIGNED_CUSTODIAN3:
				return createCustodian_AssignedCustodian3();
			case ConsolPackage.ASSIGNED_CUSTODIAN3_CUSTODIAN_ORGANIZATION:
				return createAssignedCustodian3_CustodianOrganization();
			case ConsolPackage.UNSTRUCTURED_DOCUMENT_COMPONENT:
				return createUnstructuredDocument_Component();
			case ConsolPackage.COMPONENT_NON_XML_BODY:
				return createComponent_NonXMLBody();
			case ConsolPackage.SCAN_ORIGINAL_AUTHOR:
				return createScanOriginalAuthor();
			case ConsolPackage.SCANNING_DEVICE:
				return createScanningDevice();
			case ConsolPackage.SCAN_DATA_ENTERER:
				return createScanDataEnterer();
			case ConsolPackage.MEDICATION_INFORMATION:
				return createMedicationInformation();
			case ConsolPackage.UNSTRUCTURED_OR_SCANNED_DOCUMENT:
				return createUnstructuredOrScannedDocument();
			case ConsolPackage.REFERRAL_SUMMARY:
				return createReferralSummary();
			case ConsolPackage.DISCHARGE_SUMMARY:
				return createDischargeSummary();
			case ConsolPackage.DISCHARGE_SUMMARY_COMPONENT_OF:
				return createDischargeSummary_ComponentOf();
			case ConsolPackage.COMPONENT_OF_ENCOMPASSING_ENCOUNTER3:
				return createComponentOf_EncompassingEncounter3();
			case ConsolPackage.ENCOMPASSING_ENCOUNTER3_RESPONSIBLE_PARTY:
				return createEncompassingEncounter3_ResponsibleParty();
			case ConsolPackage.ENCOMPASSING_ENCOUNTER3_ENCOUNTER_PARTICIPANT:
				return createEncompassingEncounter3_EncounterParticipant();
			case ConsolPackage.HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION:
				return createHospitalDischargeDiagnosisSection();
			case ConsolPackage.HOSPITAL_DISCHARGE_DIAGNOSIS:
				return createHospitalDischargeDiagnosis();
			case ConsolPackage.DISCHARGE_DIET_SECTION:
				return createDischargeDietSection();
			case ConsolPackage.HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL:
				return createHospitalDischargeMedicationsSectionEntriesOptional();
			case ConsolPackage.DISCHARGE_MEDICATION:
				return createDischargeMedication();
			case ConsolPackage.HOSPITAL_COURSE_SECTION:
				return createHospitalCourseSection();
			case ConsolPackage.CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION:
				return createChiefComplaintAndReasonForVisitSection();
			case ConsolPackage.HOSPITAL_CONSULTATIONS_SECTION:
				return createHospitalConsultationsSection();
			case ConsolPackage.HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION:
				return createHospitalDischargeInstructionsSection();
			case ConsolPackage.HOSPITAL_DISCHARGE_PHYSICAL_SECTION:
				return createHospitalDischargePhysicalSection();
			case ConsolPackage.HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION:
				return createHospitalDischargeStudiesSummarySection();
			case ConsolPackage.REASON_FOR_VISIT_SECTION:
				return createReasonForVisitSection();
			case ConsolPackage.PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION:
				return createPreconditionForSubstanceAdministration();
			case ConsolPackage.IMMUNIZATION_MEDICATION_INFORMATION:
				return createImmunizationMedicationInformation();
			case ConsolPackage.PROCEDURE_SPECIMEN:
				return createProcedureSpecimen();
			case ConsolPackage.PROCEDURE_PERFORMER:
				return createProcedurePerformer();
			case ConsolPackage.PROCEDURE_ENCOUNTER:
				return createProcedureEncounter();
			case ConsolPackage.MEDICATION_INFORMATION_MANUFACTURED_MATERIAL:
				return createMedicationInformationManufacturedMaterial();
			case ConsolPackage.FAMILY_HISTORY_SUBJECT:
				return createFamilyHistorySubject();
			case ConsolPackage.HOSPITAL_DISCHARGE_MEDICATIONS_SECTION:
				return createHospitalDischargeMedicationsSection();
			case ConsolPackage.RELATED_INFORMANT:
				return createRelatedInformant();
			case ConsolPackage.ENCOUNTER_PERFORMER:
				return createEncounterPerformer();
			case ConsolPackage.ENCOUNTER_PERFORMER_ASSIGNED_ENTITY:
				return createEncounterPerformerAssignedEntity();
			case ConsolPackage.ALLERGY_OBSERVATION_PARTICIPANT:
				return createAllergyObservationParticipant();
			case ConsolPackage.ALLERGY_OBSERVATION_PARTICIPANT_ROLE:
				return createAllergyObservationParticipantRole();
			case ConsolPackage.ALLERGY_OBSERVATION_PLAYING_ENTITY:
				return createAllergyObservationPlayingEntity();
			case ConsolPackage.ANESTHESIA_SECTION:
				return createAnesthesiaSection();
			case ConsolPackage.COMPLICATIONS_SECTION:
				return createComplicationsSection();
			case ConsolPackage.DICOM_OBJECT_CATALOG_SECTION:
				return createDICOMObjectCatalogSection();
			case ConsolPackage.FINDINGS_SECTION:
				return createFindingsSection();
			case ConsolPackage.INTERVENTIONS_SECTION:
				return createInterventionsSection();
			case ConsolPackage.MEDICAL_HISTORY_SECTION:
				return createMedicalHistorySection();
			case ConsolPackage.OBJECTIVE_SECTION:
				return createObjectiveSection();
			case ConsolPackage.OPERATIVE_NOTE_FLUID_SECTION:
				return createOperativeNoteFluidSection();
			case ConsolPackage.OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION:
				return createOperativeNoteSurgicalProcedureSection();
			case ConsolPackage.PLANNED_PROCEDURE_SECTION:
				return createPlannedProcedureSection();
			case ConsolPackage.POSTOPERATIVE_DIAGNOSIS_SECTION:
				return createPostoperativeDiagnosisSection();
			case ConsolPackage.POSTPROCEDURE_DIAGNOSIS_SECTION:
				return createPostprocedureDiagnosisSection();
			case ConsolPackage.POSTPROCEDURE_DIAGNOSIS:
				return createPostprocedureDiagnosis();
			case ConsolPackage.PREOPERATIVE_DIAGNOSIS_SECTION:
				return createPreoperativeDiagnosisSection();
			case ConsolPackage.PROCEDURE_DESCRIPTION_SECTION:
				return createProcedureDescriptionSection();
			case ConsolPackage.PROCEDURE_DISPOSITION_SECTION:
				return createProcedureDispositionSection();
			case ConsolPackage.PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION:
				return createProcedureEstimatedBloodLossSection();
			case ConsolPackage.PROCEDURE_FINDINGS_SECTION:
				return createProcedureFindingsSection();
			case ConsolPackage.PROCEDURE_IMPLANTS_SECTION:
				return createProcedureImplantsSection();
			case ConsolPackage.PROCEDURE_INDICATIONS_SECTION:
				return createProcedureIndicationsSection();
			case ConsolPackage.PROCEDURE_SPECIMENS_TAKEN_SECTION:
				return createProcedureSpecimensTakenSection();
			case ConsolPackage.SUBJECTIVE_SECTION:
				return createSubjectiveSection();
			case ConsolPackage.CONSULTATION_NOTE:
				return createConsultationNote();
			case ConsolPackage.CONSULTATION_NOTE_COMPONENT_OF:
				return createConsultationNote_ComponentOf();
			case ConsolPackage.COMPONENT_OF_ENCOMPASSING_ENCOUNTER2:
				return createComponentOf_EncompassingEncounter2();
			case ConsolPackage.ENCOMPASSING_ENCOUNTER2_RESPONSIBLE_PARTY:
				return createEncompassingEncounter2_ResponsibleParty();
			case ConsolPackage.ENCOMPASSING_ENCOUNTER2_ENCOUNTER_PARTICIPANT:
				return createEncompassingEncounter2_EncounterParticipant();
			case ConsolPackage.ASSESSMENT_SECTION:
				return createAssessmentSection();
			case ConsolPackage.HISTORY_AND_PHYSICAL_NOTE:
				return createHistoryAndPhysicalNote();
			case ConsolPackage.HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF:
				return createHistoryAndPhysicalNote_ComponentOf();
			case ConsolPackage.COMPONENT_OF_ENCOMPASSING_ENCOUNTER4:
				return createComponentOf_EncompassingEncounter4();
			case ConsolPackage.ENCOMPASSING_ENCOUNTER4_RESPONSIBLE_PARTY:
				return createEncompassingEncounter4_ResponsibleParty();
			case ConsolPackage.ENCOMPASSING_ENCOUNTER4_ENCOUNTER_PARTICIPANT:
				return createEncompassingEncounter4_EncounterParticipant();
			case ConsolPackage.OPERATIVE_NOTE:
				return createOperativeNote();
			case ConsolPackage.OPERATIVE_NOTE_DOCUMENTATION_OF:
				return createOperativeNote_DocumentationOf();
			case ConsolPackage.DOCUMENTATION_OF_SERVICE_EVENT:
				return createDocumentationOf_ServiceEvent();
			case ConsolPackage.SERVICE_EVENT_PRIMARY_PERFORMER:
				return createServiceEvent_PrimaryPerformer();
			case ConsolPackage.PROCEDURE_NOTE:
				return createProcedureNote();
			case ConsolPackage.PROCEDURE_NOTE_COMPONENT_OF:
				return createProcedureNote_ComponentOf();
			case ConsolPackage.COMPONENT_OF_ENCOMPASSING_ENCOUNTER5:
				return createComponentOf_EncompassingEncounter5();
			case ConsolPackage.ENCOMPASSING_ENCOUNTER5_LOCATION:
				return createEncompassingEncounter5_Location();
			case ConsolPackage.LOCATION_HEALTH_CARE_FACILITY:
				return createLocation_HealthCareFacility();
			case ConsolPackage.ENCOMPASSING_ENCOUNTER5_ENCOUNTER_PARTICIPANT:
				return createEncompassingEncounter5_EncounterParticipant();
			case ConsolPackage.PROCEDURE_NOTE_INDIVIDUAL:
				return createProcedureNote_Individual();
			case ConsolPackage.PROCEDURE_NOTE_PRIMARY_CARE_PHYSICIAN:
				return createProcedureNote_PrimaryCarePhysician();
			case ConsolPackage.PROCEDURE_NOTE_PROVIDER:
				return createProcedureNote_Provider();
			case ConsolPackage.PROVIDER_ASSOCIATED_ENTITY:
				return createProvider_AssociatedEntity();
			case ConsolPackage.PROCEDURE_NOTE_DOCUMENTATION_OF:
				return createProcedureNote_DocumentationOf();
			case ConsolPackage.DOCUMENTATION_OF_SERVICE_EVENT1:
				return createDocumentationOf_ServiceEvent1();
			case ConsolPackage.SERVICE_EVENT1_PRIMARY_PERFORMER:
				return createServiceEvent1_PrimaryPerformer();
			case ConsolPackage.PROGRESS_NOTE:
				return createProgressNote();
			case ConsolPackage.PROGRESS_NOTE_DOCUMENTATION_OF:
				return createProgressNote_DocumentationOf();
			case ConsolPackage.DOCUMENTATION_OF_SERVICE_EVENT2:
				return createDocumentationOf_ServiceEvent2();
			case ConsolPackage.PROGRESS_NOTE_COMPONENT_OF:
				return createProgressNote_ComponentOf();
			case ConsolPackage.COMPONENT_OF_ENCOMPASSING_ENCOUNTER6:
				return createComponentOf_EncompassingEncounter6();
			case ConsolPackage.ENCOMPASSING_ENCOUNTER6_LOCATION:
				return createEncompassingEncounter6_Location();
			case ConsolPackage.LOCATION_HEALTH_CARE_FACILITY1:
				return createLocation_HealthCareFacility1();
			case ConsolPackage.PREOPERATIVE_DIAGNOSIS:
				return createPreoperativeDiagnosis();
			case ConsolPackage.INSTRUCTIONS_SECTION:
				return createInstructionsSection();
			case ConsolPackage.HOSPITAL_ADMISSION_DIAGNOSIS:
				return createHospitalAdmissionDiagnosis();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralHeaderConstraints createGeneralHeaderConstraints() {
		GeneralHeaderConstraintsImpl generalHeaderConstraints = new GeneralHeaderConstraintsImpl();
		return generalHeaderConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralHeaderConstraints_RecordTarget createGeneralHeaderConstraints_RecordTarget() {
		GeneralHeaderConstraints_RecordTargetImpl generalHeaderConstraints_RecordTarget = new GeneralHeaderConstraints_RecordTargetImpl();
		return generalHeaderConstraints_RecordTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecordTarget_PatientRole createRecordTarget_PatientRole() {
		RecordTarget_PatientRoleImpl recordTarget_PatientRole = new RecordTarget_PatientRoleImpl();
		return recordTarget_PatientRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientRole_Patient createPatientRole_Patient() {
		PatientRole_PatientImpl patientRole_Patient = new PatientRole_PatientImpl();
		return patientRole_Patient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Patient_Guardian createPatient_Guardian() {
		Patient_GuardianImpl patient_Guardian = new Patient_GuardianImpl();
		return patient_Guardian;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Patient_LanguageCommunication createPatient_LanguageCommunication() {
		Patient_LanguageCommunicationImpl patient_LanguageCommunication = new Patient_LanguageCommunicationImpl();
		return patient_LanguageCommunication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Patient_Birthplace createPatient_Birthplace() {
		Patient_BirthplaceImpl patient_Birthplace = new Patient_BirthplaceImpl();
		return patient_Birthplace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Birthplace_Place createBirthplace_Place() {
		Birthplace_PlaceImpl birthplace_Place = new Birthplace_PlaceImpl();
		return birthplace_Place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientRole_ProviderOrganization createPatientRole_ProviderOrganization() {
		PatientRole_ProviderOrganizationImpl patientRole_ProviderOrganization = new PatientRole_ProviderOrganizationImpl();
		return patientRole_ProviderOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralHeaderConstraints_ComponentOf createGeneralHeaderConstraints_ComponentOf() {
		GeneralHeaderConstraints_ComponentOfImpl generalHeaderConstraints_ComponentOf = new GeneralHeaderConstraints_ComponentOfImpl();
		return generalHeaderConstraints_ComponentOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentOf_EncompassingEncounter createComponentOf_EncompassingEncounter() {
		ComponentOf_EncompassingEncounterImpl componentOf_EncompassingEncounter = new ComponentOf_EncompassingEncounterImpl();
		return componentOf_EncompassingEncounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralHeaderConstraints_Author createGeneralHeaderConstraints_Author() {
		GeneralHeaderConstraints_AuthorImpl generalHeaderConstraints_Author = new GeneralHeaderConstraints_AuthorImpl();
		return generalHeaderConstraints_Author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Author_AssignedAuthor createAuthor_AssignedAuthor() {
		Author_AssignedAuthorImpl author_AssignedAuthor = new Author_AssignedAuthorImpl();
		return author_AssignedAuthor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignedAuthor_AuthoringDevice createAssignedAuthor_AuthoringDevice() {
		AssignedAuthor_AuthoringDeviceImpl assignedAuthor_AuthoringDevice = new AssignedAuthor_AuthoringDeviceImpl();
		return assignedAuthor_AuthoringDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralHeaderConstraints_Person createGeneralHeaderConstraints_Person() {
		GeneralHeaderConstraints_PersonImpl generalHeaderConstraints_Person = new GeneralHeaderConstraints_PersonImpl();
		return generalHeaderConstraints_Person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralHeaderConstraints_DataEnterer createGeneralHeaderConstraints_DataEnterer() {
		GeneralHeaderConstraints_DataEntererImpl generalHeaderConstraints_DataEnterer = new GeneralHeaderConstraints_DataEntererImpl();
		return generalHeaderConstraints_DataEnterer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataEnterer_AssignedEntity createDataEnterer_AssignedEntity() {
		DataEnterer_AssignedEntityImpl dataEnterer_AssignedEntity = new DataEnterer_AssignedEntityImpl();
		return dataEnterer_AssignedEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralHeaderConstraints_Custodian createGeneralHeaderConstraints_Custodian() {
		GeneralHeaderConstraints_CustodianImpl generalHeaderConstraints_Custodian = new GeneralHeaderConstraints_CustodianImpl();
		return generalHeaderConstraints_Custodian;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Custodian_AssignedCustodian createCustodian_AssignedCustodian() {
		Custodian_AssignedCustodianImpl custodian_AssignedCustodian = new Custodian_AssignedCustodianImpl();
		return custodian_AssignedCustodian;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignedCustodian_CustodianOrganization createAssignedCustodian_CustodianOrganization() {
		AssignedCustodian_CustodianOrganizationImpl assignedCustodian_CustodianOrganization = new AssignedCustodian_CustodianOrganizationImpl();
		return assignedCustodian_CustodianOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralHeaderConstraints_InformationRecipient createGeneralHeaderConstraints_InformationRecipient() {
		GeneralHeaderConstraints_InformationRecipientImpl generalHeaderConstraints_InformationRecipient = new GeneralHeaderConstraints_InformationRecipientImpl();
		return generalHeaderConstraints_InformationRecipient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationRecipient_IntendedRecipient createInformationRecipient_IntendedRecipient() {
		InformationRecipient_IntendedRecipientImpl informationRecipient_IntendedRecipient = new InformationRecipient_IntendedRecipientImpl();
		return informationRecipient_IntendedRecipient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntendedRecipient_Organization createIntendedRecipient_Organization() {
		IntendedRecipient_OrganizationImpl intendedRecipient_Organization = new IntendedRecipient_OrganizationImpl();
		return intendedRecipient_Organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralHeaderConstraints_LegalAuthenticator createGeneralHeaderConstraints_LegalAuthenticator() {
		GeneralHeaderConstraints_LegalAuthenticatorImpl generalHeaderConstraints_LegalAuthenticator = new GeneralHeaderConstraints_LegalAuthenticatorImpl();
		return generalHeaderConstraints_LegalAuthenticator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegalAuthenticator_AssignedEntity createLegalAuthenticator_AssignedEntity() {
		LegalAuthenticator_AssignedEntityImpl legalAuthenticator_AssignedEntity = new LegalAuthenticator_AssignedEntityImpl();
		return legalAuthenticator_AssignedEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralHeaderConstraints_Authenticator createGeneralHeaderConstraints_Authenticator() {
		GeneralHeaderConstraints_AuthenticatorImpl generalHeaderConstraints_Authenticator = new GeneralHeaderConstraints_AuthenticatorImpl();
		return generalHeaderConstraints_Authenticator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Authenticator_AssignedEntity createAuthenticator_AssignedEntity() {
		Authenticator_AssignedEntityImpl authenticator_AssignedEntity = new Authenticator_AssignedEntityImpl();
		return authenticator_AssignedEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralHeaderConstraints_Informant createGeneralHeaderConstraints_Informant() {
		GeneralHeaderConstraints_InformantImpl generalHeaderConstraints_Informant = new GeneralHeaderConstraints_InformantImpl();
		return generalHeaderConstraints_Informant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Informant_AssignedEntity createInformant_AssignedEntity() {
		Informant_AssignedEntityImpl informant_AssignedEntity = new Informant_AssignedEntityImpl();
		return informant_AssignedEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Informant_RelatedEntity createInformant_RelatedEntity() {
		Informant_RelatedEntityImpl informant_RelatedEntity = new Informant_RelatedEntityImpl();
		return informant_RelatedEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralHeaderConstraints_ParticipantSupport createGeneralHeaderConstraints_ParticipantSupport() {
		GeneralHeaderConstraints_ParticipantSupportImpl generalHeaderConstraints_ParticipantSupport = new GeneralHeaderConstraints_ParticipantSupportImpl();
		return generalHeaderConstraints_ParticipantSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralHeaderConstraints_InFulfillmentOf createGeneralHeaderConstraints_InFulfillmentOf() {
		GeneralHeaderConstraints_InFulfillmentOfImpl generalHeaderConstraints_InFulfillmentOf = new GeneralHeaderConstraints_InFulfillmentOfImpl();
		return generalHeaderConstraints_InFulfillmentOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InFulfillmentOf_Order createInFulfillmentOf_Order() {
		InFulfillmentOf_OrderImpl inFulfillmentOf_Order = new InFulfillmentOf_OrderImpl();
		return inFulfillmentOf_Order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyProblemAct createAllergyProblemAct() {
		AllergyProblemActImpl allergyProblemAct = new AllergyProblemActImpl();
		return allergyProblemAct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyObservation createAllergyObservation() {
		AllergyObservationImpl allergyObservation = new AllergyObservationImpl();
		return allergyObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReactionObservation createReactionObservation() {
		ReactionObservationImpl reactionObservation = new ReactionObservationImpl();
		return reactionObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeverityObservation createSeverityObservation() {
		SeverityObservationImpl severityObservation = new SeverityObservationImpl();
		return severityObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyStatusObservation createAllergyStatusObservation() {
		AllergyStatusObservationImpl allergyStatusObservation = new AllergyStatusObservationImpl();
		return allergyStatusObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgeObservation createAgeObservation() {
		AgeObservationImpl ageObservation = new AgeObservationImpl();
		return ageObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthStatusObservation createHealthStatusObservation() {
		HealthStatusObservationImpl healthStatusObservation = new HealthStatusObservationImpl();
		return healthStatusObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment createComment() {
		CommentImpl comment = new CommentImpl();
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationActivity createMedicationActivity() {
		MedicationActivityImpl medicationActivity = new MedicationActivityImpl();
		return medicationActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonMedicinalSupplyActivity createNonMedicinalSupplyActivity() {
		NonMedicinalSupplyActivityImpl nonMedicinalSupplyActivity = new NonMedicinalSupplyActivityImpl();
		return nonMedicinalSupplyActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductInstance createProductInstance() {
		ProductInstanceImpl productInstance = new ProductInstanceImpl();
		return productInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductInstance_ScopingEntity createProductInstance_ScopingEntity() {
		ProductInstance_ScopingEntityImpl productInstance_ScopingEntity = new ProductInstance_ScopingEntityImpl();
		return productInstance_ScopingEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductInstance_PlayingDevice createProductInstance_PlayingDevice() {
		ProductInstance_PlayingDeviceImpl productInstance_PlayingDevice = new ProductInstance_PlayingDeviceImpl();
		return productInstance_PlayingDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instructions createInstructions() {
		InstructionsImpl instructions = new InstructionsImpl();
		return instructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Indication createIndication() {
		IndicationImpl indication = new IndicationImpl();
		return indication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationDispense createMedicationDispense() {
		MedicationDispenseImpl medicationDispense = new MedicationDispenseImpl();
		return medicationDispense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationSupplyOrder createMedicationSupplyOrder() {
		MedicationSupplyOrderImpl medicationSupplyOrder = new MedicationSupplyOrderImpl();
		return medicationSupplyOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DrugVehicle createDrugVehicle() {
		DrugVehicleImpl drugVehicle = new DrugVehicleImpl();
		return drugVehicle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationSeriesNumberObservation createMedicationSeriesNumberObservation() {
		MedicationSeriesNumberObservationImpl medicationSeriesNumberObservation = new MedicationSeriesNumberObservationImpl();
		return medicationSeriesNumberObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationStatusObservation createMedicationStatusObservation() {
		MedicationStatusObservationImpl medicationStatusObservation = new MedicationStatusObservationImpl();
		return medicationStatusObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalReference createInternalReference() {
		InternalReferenceImpl internalReference = new InternalReferenceImpl();
		return internalReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationType createMedicationType() {
		MedicationTypeImpl medicationType = new MedicationTypeImpl();
		return medicationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationFullfillmentInstructions createMedicationFullfillmentInstructions() {
		MedicationFullfillmentInstructionsImpl medicationFullfillmentInstructions = new MedicationFullfillmentInstructionsImpl();
		return medicationFullfillmentInstructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemConcernAct createProblemConcernAct() {
		ProblemConcernActImpl problemConcernAct = new ProblemConcernActImpl();
		return problemConcernAct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemObservation createProblemObservation() {
		ProblemObservationImpl problemObservation = new ProblemObservationImpl();
		return problemObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemStatus createProblemStatus() {
		ProblemStatusImpl problemStatus = new ProblemStatusImpl();
		return problemStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinuityOfCareDocument createContinuityOfCareDocument() {
		ContinuityOfCareDocumentImpl continuityOfCareDocument = new ContinuityOfCareDocumentImpl();
		return continuityOfCareDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdvanceDirectivesSectionEntriesOptional createAdvanceDirectivesSectionEntriesOptional() {
		AdvanceDirectivesSectionEntriesOptionalImpl advanceDirectivesSectionEntriesOptional = new AdvanceDirectivesSectionEntriesOptionalImpl();
		return advanceDirectivesSectionEntriesOptional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergiesSection createAllergiesSection() {
		AllergiesSectionImpl allergiesSection = new AllergiesSectionImpl();
		return allergiesSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergiesSectionEntriesOptional createAllergiesSectionEntriesOptional() {
		AllergiesSectionEntriesOptionalImpl allergiesSectionEntriesOptional = new AllergiesSectionEntriesOptionalImpl();
		return allergiesSectionEntriesOptional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncountersSectionEntriesOptional createEncountersSectionEntriesOptional() {
		EncountersSectionEntriesOptionalImpl encountersSectionEntriesOptional = new EncountersSectionEntriesOptionalImpl();
		return encountersSectionEntriesOptional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationsSectionEntriesOptional createImmunizationsSectionEntriesOptional() {
		ImmunizationsSectionEntriesOptionalImpl immunizationsSectionEntriesOptional = new ImmunizationsSectionEntriesOptionalImpl();
		return immunizationsSectionEntriesOptional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PayersSection createPayersSection() {
		PayersSectionImpl payersSection = new PayersSectionImpl();
		return payersSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoverageActivity createCoverageActivity() {
		CoverageActivityImpl coverageActivity = new CoverageActivityImpl();
		return coverageActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyActivity createPolicyActivity() {
		PolicyActivityImpl policyActivity = new PolicyActivityImpl();
		return policyActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorizationActivity createAuthorizationActivity() {
		AuthorizationActivityImpl authorizationActivity = new AuthorizationActivityImpl();
		return authorizationActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationsSection createMedicationsSection() {
		MedicationsSectionImpl medicationsSection = new MedicationsSectionImpl();
		return medicationsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationsSectionEntriesOptional createMedicationsSectionEntriesOptional() {
		MedicationsSectionEntriesOptionalImpl medicationsSectionEntriesOptional = new MedicationsSectionEntriesOptionalImpl();
		return medicationsSectionEntriesOptional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanOfCareSection createPlanOfCareSection() {
		PlanOfCareSectionImpl planOfCareSection = new PlanOfCareSectionImpl();
		return planOfCareSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanOfCareActivityAct createPlanOfCareActivityAct() {
		PlanOfCareActivityActImpl planOfCareActivityAct = new PlanOfCareActivityActImpl();
		return planOfCareActivityAct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanOfCareActivityEncounter createPlanOfCareActivityEncounter() {
		PlanOfCareActivityEncounterImpl planOfCareActivityEncounter = new PlanOfCareActivityEncounterImpl();
		return planOfCareActivityEncounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanOfCareActivityObservation createPlanOfCareActivityObservation() {
		PlanOfCareActivityObservationImpl planOfCareActivityObservation = new PlanOfCareActivityObservationImpl();
		return planOfCareActivityObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanOfCareActivityProcedure createPlanOfCareActivityProcedure() {
		PlanOfCareActivityProcedureImpl planOfCareActivityProcedure = new PlanOfCareActivityProcedureImpl();
		return planOfCareActivityProcedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanOfCareActivitySubstanceAdministration createPlanOfCareActivitySubstanceAdministration() {
		PlanOfCareActivitySubstanceAdministrationImpl planOfCareActivitySubstanceAdministration = new PlanOfCareActivitySubstanceAdministrationImpl();
		return planOfCareActivitySubstanceAdministration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanOfCareActivitySupply createPlanOfCareActivitySupply() {
		PlanOfCareActivitySupplyImpl planOfCareActivitySupply = new PlanOfCareActivitySupplyImpl();
		return planOfCareActivitySupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProceduresSection createProceduresSection() {
		ProceduresSectionImpl proceduresSection = new ProceduresSectionImpl();
		return proceduresSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProceduresSectionEntriesOptional createProceduresSectionEntriesOptional() {
		ProceduresSectionEntriesOptionalImpl proceduresSectionEntriesOptional = new ProceduresSectionEntriesOptionalImpl();
		return proceduresSectionEntriesOptional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureActivityObservation createProcedureActivityObservation() {
		ProcedureActivityObservationImpl procedureActivityObservation = new ProcedureActivityObservationImpl();
		return procedureActivityObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureActivityAct createProcedureActivityAct() {
		ProcedureActivityActImpl procedureActivityAct = new ProcedureActivityActImpl();
		return procedureActivityAct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureActivityProcedure createProcedureActivityProcedure() {
		ProcedureActivityProcedureImpl procedureActivityProcedure = new ProcedureActivityProcedureImpl();
		return procedureActivityProcedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VitalSignsSectionEntriesOptional createVitalSignsSectionEntriesOptional() {
		VitalSignsSectionEntriesOptionalImpl vitalSignsSectionEntriesOptional = new VitalSignsSectionEntriesOptionalImpl();
		return vitalSignsSectionEntriesOptional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyHistorySection createFamilyHistorySection() {
		FamilyHistorySectionImpl familyHistorySection = new FamilyHistorySectionImpl();
		return familyHistorySection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyHistoryOrganizer createFamilyHistoryOrganizer() {
		FamilyHistoryOrganizerImpl familyHistoryOrganizer = new FamilyHistoryOrganizerImpl();
		return familyHistoryOrganizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyHistoryObservation createFamilyHistoryObservation() {
		FamilyHistoryObservationImpl familyHistoryObservation = new FamilyHistoryObservationImpl();
		return familyHistoryObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyHistoryDeathObservation createFamilyHistoryDeathObservation() {
		FamilyHistoryDeathObservationImpl familyHistoryDeathObservation = new FamilyHistoryDeathObservationImpl();
		return familyHistoryDeathObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocialHistorySection createSocialHistorySection() {
		SocialHistorySectionImpl socialHistorySection = new SocialHistorySectionImpl();
		return socialHistorySection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocialHistoryObservation createSocialHistoryObservation() {
		SocialHistoryObservationImpl socialHistoryObservation = new SocialHistoryObservationImpl();
		return socialHistoryObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PregnancyObservation createPregnancyObservation() {
		PregnancyObservationImpl pregnancyObservation = new PregnancyObservationImpl();
		return pregnancyObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EstimatedDateOfDelivery createEstimatedDateOfDelivery() {
		EstimatedDateOfDeliveryImpl estimatedDateOfDelivery = new EstimatedDateOfDeliveryImpl();
		return estimatedDateOfDelivery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultsSection createResultsSection() {
		ResultsSectionImpl resultsSection = new ResultsSectionImpl();
		return resultsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultsSectionEntriesOptional createResultsSectionEntriesOptional() {
		ResultsSectionEntriesOptionalImpl resultsSectionEntriesOptional = new ResultsSectionEntriesOptionalImpl();
		return resultsSectionEntriesOptional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultOrganizer createResultOrganizer() {
		ResultOrganizerImpl resultOrganizer = new ResultOrganizerImpl();
		return resultOrganizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultObservation createResultObservation() {
		ResultObservationImpl resultObservation = new ResultObservationImpl();
		return resultObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicalEquipmentSection createMedicalEquipmentSection() {
		MedicalEquipmentSectionImpl medicalEquipmentSection = new MedicalEquipmentSectionImpl();
		return medicalEquipmentSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalStatusSection createFunctionalStatusSection() {
		FunctionalStatusSectionImpl functionalStatusSection = new FunctionalStatusSectionImpl();
		return functionalStatusSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemSection createProblemSection() {
		ProblemSectionImpl problemSection = new ProblemSectionImpl();
		return problemSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemSectionEntriesOptional createProblemSectionEntriesOptional() {
		ProblemSectionEntriesOptionalImpl problemSectionEntriesOptional = new ProblemSectionEntriesOptionalImpl();
		return problemSectionEntriesOptional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocialHistoryStatusObservation createSocialHistoryStatusObservation() {
		SocialHistoryStatusObservationImpl socialHistoryStatusObservation = new SocialHistoryStatusObservationImpl();
		return socialHistoryStatusObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PurposeSection createPurposeSection() {
		PurposeSectionImpl purposeSection = new PurposeSectionImpl();
		return purposeSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PurposeActivity createPurposeActivity() {
		PurposeActivityImpl purposeActivity = new PurposeActivityImpl();
		return purposeActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdvanceDirectivesSection createAdvanceDirectivesSection() {
		AdvanceDirectivesSectionImpl advanceDirectivesSection = new AdvanceDirectivesSectionImpl();
		return advanceDirectivesSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdvanceDirectiveObservation createAdvanceDirectiveObservation() {
		AdvanceDirectiveObservationImpl advanceDirectiveObservation = new AdvanceDirectiveObservationImpl();
		return advanceDirectiveObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdvanceDirectiveObservation_Reference createAdvanceDirectiveObservation_Reference() {
		AdvanceDirectiveObservation_ReferenceImpl advanceDirectiveObservation_Reference = new AdvanceDirectiveObservation_ReferenceImpl();
		return advanceDirectiveObservation_Reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference_ExternalDocument createReference_ExternalDocument() {
		Reference_ExternalDocumentImpl reference_ExternalDocument = new Reference_ExternalDocumentImpl();
		return reference_ExternalDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdvanceDirectiveObservation_Custodian createAdvanceDirectiveObservation_Custodian() {
		AdvanceDirectiveObservation_CustodianImpl advanceDirectiveObservation_Custodian = new AdvanceDirectiveObservation_CustodianImpl();
		return advanceDirectiveObservation_Custodian;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Custodian_CustodianRole createCustodian_CustodianRole() {
		Custodian_CustodianRoleImpl custodian_CustodianRole = new Custodian_CustodianRoleImpl();
		return custodian_CustodianRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustodianRole_CustodianEntity createCustodianRole_CustodianEntity() {
		CustodianRole_CustodianEntityImpl custodianRole_CustodianEntity = new CustodianRole_CustodianEntityImpl();
		return custodianRole_CustodianEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdvanceDirectiveObservation_Verifier createAdvanceDirectiveObservation_Verifier() {
		AdvanceDirectiveObservation_VerifierImpl advanceDirectiveObservation_Verifier = new AdvanceDirectiveObservation_VerifierImpl();
		return advanceDirectiveObservation_Verifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdvanceDirectiveVerification createAdvanceDirectiveVerification() {
		AdvanceDirectiveVerificationImpl advanceDirectiveVerification = new AdvanceDirectiveVerificationImpl();
		return advanceDirectiveVerification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdvanceDirectiveStatusObservation createAdvanceDirectiveStatusObservation() {
		AdvanceDirectiveStatusObservationImpl advanceDirectiveStatusObservation = new AdvanceDirectiveStatusObservationImpl();
		return advanceDirectiveStatusObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncountersSection createEncountersSection() {
		EncountersSectionImpl encountersSection = new EncountersSectionImpl();
		return encountersSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterActivities createEncounterActivities() {
		EncounterActivitiesImpl encounterActivities = new EncounterActivitiesImpl();
		return encounterActivities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceDeliveryLocation createServiceDeliveryLocation() {
		ServiceDeliveryLocationImpl serviceDeliveryLocation = new ServiceDeliveryLocationImpl();
		return serviceDeliveryLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Encounter createEncounter() {
		EncounterImpl encounter = new EncounterImpl();
		return encounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationsSection createImmunizationsSection() {
		ImmunizationsSectionImpl immunizationsSection = new ImmunizationsSectionImpl();
		return immunizationsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationActivity createImmunizationActivity() {
		ImmunizationActivityImpl immunizationActivity = new ImmunizationActivityImpl();
		return immunizationActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationRefusalReason createImmunizationRefusalReason() {
		ImmunizationRefusalReasonImpl immunizationRefusalReason = new ImmunizationRefusalReasonImpl();
		return immunizationRefusalReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InsuranceProvider createInsuranceProvider() {
		InsuranceProviderImpl insuranceProvider = new InsuranceProviderImpl();
		return insuranceProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PayerEntry createPayerEntry() {
		PayerEntryImpl payerEntry = new PayerEntryImpl();
		return payerEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoveredParty createCoveredParty() {
		CoveredPartyImpl coveredParty = new CoveredPartyImpl();
		return coveredParty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicySubscriber createPolicySubscriber() {
		PolicySubscriberImpl policySubscriber = new PolicySubscriberImpl();
		return policySubscriber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalReference createExternalReference() {
		ExternalReferenceImpl externalReference = new ExternalReferenceImpl();
		return externalReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Support createSupport() {
		SupportImpl support = new SupportImpl();
		return support;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VitalSignsSection createVitalSignsSection() {
		VitalSignsSectionImpl vitalSignsSection = new VitalSignsSectionImpl();
		return vitalSignsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VitalSignsOrganizer createVitalSignsOrganizer() {
		VitalSignsOrganizerImpl vitalSignsOrganizer = new VitalSignsOrganizerImpl();
		return vitalSignsOrganizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VitalSignObservation createVitalSignObservation() {
		VitalSignObservationImpl vitalSignObservation = new VitalSignObservationImpl();
		return vitalSignObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryOfPastIllnessSection createHistoryOfPastIllnessSection() {
		HistoryOfPastIllnessSectionImpl historyOfPastIllnessSection = new HistoryOfPastIllnessSectionImpl();
		return historyOfPastIllnessSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChiefComplaintSection createChiefComplaintSection() {
		ChiefComplaintSectionImpl chiefComplaintSection = new ChiefComplaintSectionImpl();
		return chiefComplaintSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReasonForReferralSection createReasonForReferralSection() {
		ReasonForReferralSectionImpl reasonForReferralSection = new ReasonForReferralSectionImpl();
		return reasonForReferralSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryOfPresentIllnessSection createHistoryOfPresentIllnessSection() {
		HistoryOfPresentIllnessSectionImpl historyOfPresentIllnessSection = new HistoryOfPresentIllnessSectionImpl();
		return historyOfPresentIllnessSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalAdmissionDiagnosisSection createHospitalAdmissionDiagnosisSection() {
		HospitalAdmissionDiagnosisSectionImpl hospitalAdmissionDiagnosisSection = new HospitalAdmissionDiagnosisSectionImpl();
		return hospitalAdmissionDiagnosisSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalDischargeDiagnosisSection createHospitalDischargeDiagnosisSection() {
		HospitalDischargeDiagnosisSectionImpl hospitalDischargeDiagnosisSection = new HospitalDischargeDiagnosisSectionImpl();
		return hospitalDischargeDiagnosisSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalAdmissionMedicationsSectionEntriesOptional createHospitalAdmissionMedicationsSectionEntriesOptional() {
		HospitalAdmissionMedicationsSectionEntriesOptionalImpl hospitalAdmissionMedicationsSectionEntriesOptional = new HospitalAdmissionMedicationsSectionEntriesOptionalImpl();
		return hospitalAdmissionMedicationsSectionEntriesOptional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdmissionMedication createAdmissionMedication() {
		AdmissionMedicationImpl admissionMedication = new AdmissionMedicationImpl();
		return admissionMedication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalDischargeMedicationsSection createHospitalDischargeMedicationsSection() {
		HospitalDischargeMedicationsSectionImpl hospitalDischargeMedicationsSection = new HospitalDischargeMedicationsSectionImpl();
		return hospitalDischargeMedicationsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalDischargePhysicalSection createHospitalDischargePhysicalSection() {
		HospitalDischargePhysicalSectionImpl hospitalDischargePhysicalSection = new HospitalDischargePhysicalSectionImpl();
		return hospitalDischargePhysicalSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChiefComplaintAndReasonForVisitSection createChiefComplaintAndReasonForVisitSection() {
		ChiefComplaintAndReasonForVisitSectionImpl chiefComplaintAndReasonForVisitSection = new ChiefComplaintAndReasonForVisitSectionImpl();
		return chiefComplaintAndReasonForVisitSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReasonForVisitSection createReasonForVisitSection() {
		ReasonForVisitSectionImpl reasonForVisitSection = new ReasonForVisitSectionImpl();
		return reasonForVisitSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedInformant createRelatedInformant() {
		RelatedInformantImpl relatedInformant = new RelatedInformantImpl();
		return relatedInformant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterPerformer createEncounterPerformer() {
		EncounterPerformerImpl encounterPerformer = new EncounterPerformerImpl();
		return encounterPerformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterPerformerAssignedEntity createEncounterPerformerAssignedEntity() {
		EncounterPerformerAssignedEntityImpl encounterPerformerAssignedEntity = new EncounterPerformerAssignedEntityImpl();
		return encounterPerformerAssignedEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyObservationParticipant createAllergyObservationParticipant() {
		AllergyObservationParticipantImpl allergyObservationParticipant = new AllergyObservationParticipantImpl();
		return allergyObservationParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyObservationParticipantRole createAllergyObservationParticipantRole() {
		AllergyObservationParticipantRoleImpl allergyObservationParticipantRole = new AllergyObservationParticipantRoleImpl();
		return allergyObservationParticipantRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyObservationPlayingEntity createAllergyObservationPlayingEntity() {
		AllergyObservationPlayingEntityImpl allergyObservationPlayingEntity = new AllergyObservationPlayingEntityImpl();
		return allergyObservationPlayingEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnesthesiaSection createAnesthesiaSection() {
		AnesthesiaSectionImpl anesthesiaSection = new AnesthesiaSectionImpl();
		return anesthesiaSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplicationsSection createComplicationsSection() {
		ComplicationsSectionImpl complicationsSection = new ComplicationsSectionImpl();
		return complicationsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DICOMObjectCatalogSection createDICOMObjectCatalogSection() {
		DICOMObjectCatalogSectionImpl dicomObjectCatalogSection = new DICOMObjectCatalogSectionImpl();
		return dicomObjectCatalogSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FindingsSection createFindingsSection() {
		FindingsSectionImpl findingsSection = new FindingsSectionImpl();
		return findingsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalConsultationsSection createHospitalConsultationsSection() {
		HospitalConsultationsSectionImpl hospitalConsultationsSection = new HospitalConsultationsSectionImpl();
		return hospitalConsultationsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterventionsSection createInterventionsSection() {
		InterventionsSectionImpl interventionsSection = new InterventionsSectionImpl();
		return interventionsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicalHistorySection createMedicalHistorySection() {
		MedicalHistorySectionImpl medicalHistorySection = new MedicalHistorySectionImpl();
		return medicalHistorySection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectiveSection createObjectiveSection() {
		ObjectiveSectionImpl objectiveSection = new ObjectiveSectionImpl();
		return objectiveSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperativeNoteFluidSection createOperativeNoteFluidSection() {
		OperativeNoteFluidSectionImpl operativeNoteFluidSection = new OperativeNoteFluidSectionImpl();
		return operativeNoteFluidSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperativeNoteSurgicalProcedureSection createOperativeNoteSurgicalProcedureSection() {
		OperativeNoteSurgicalProcedureSectionImpl operativeNoteSurgicalProcedureSection = new OperativeNoteSurgicalProcedureSectionImpl();
		return operativeNoteSurgicalProcedureSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlannedProcedureSection createPlannedProcedureSection() {
		PlannedProcedureSectionImpl plannedProcedureSection = new PlannedProcedureSectionImpl();
		return plannedProcedureSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostoperativeDiagnosisSection createPostoperativeDiagnosisSection() {
		PostoperativeDiagnosisSectionImpl postoperativeDiagnosisSection = new PostoperativeDiagnosisSectionImpl();
		return postoperativeDiagnosisSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostprocedureDiagnosisSection createPostprocedureDiagnosisSection() {
		PostprocedureDiagnosisSectionImpl postprocedureDiagnosisSection = new PostprocedureDiagnosisSectionImpl();
		return postprocedureDiagnosisSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostprocedureDiagnosis createPostprocedureDiagnosis() {
		PostprocedureDiagnosisImpl postprocedureDiagnosis = new PostprocedureDiagnosisImpl();
		return postprocedureDiagnosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreoperativeDiagnosisSection createPreoperativeDiagnosisSection() {
		PreoperativeDiagnosisSectionImpl preoperativeDiagnosisSection = new PreoperativeDiagnosisSectionImpl();
		return preoperativeDiagnosisSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureDescriptionSection createProcedureDescriptionSection() {
		ProcedureDescriptionSectionImpl procedureDescriptionSection = new ProcedureDescriptionSectionImpl();
		return procedureDescriptionSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureDispositionSection createProcedureDispositionSection() {
		ProcedureDispositionSectionImpl procedureDispositionSection = new ProcedureDispositionSectionImpl();
		return procedureDispositionSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureEstimatedBloodLossSection createProcedureEstimatedBloodLossSection() {
		ProcedureEstimatedBloodLossSectionImpl procedureEstimatedBloodLossSection = new ProcedureEstimatedBloodLossSectionImpl();
		return procedureEstimatedBloodLossSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureFindingsSection createProcedureFindingsSection() {
		ProcedureFindingsSectionImpl procedureFindingsSection = new ProcedureFindingsSectionImpl();
		return procedureFindingsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureImplantsSection createProcedureImplantsSection() {
		ProcedureImplantsSectionImpl procedureImplantsSection = new ProcedureImplantsSectionImpl();
		return procedureImplantsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureIndicationsSection createProcedureIndicationsSection() {
		ProcedureIndicationsSectionImpl procedureIndicationsSection = new ProcedureIndicationsSectionImpl();
		return procedureIndicationsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureSpecimensTakenSection createProcedureSpecimensTakenSection() {
		ProcedureSpecimensTakenSectionImpl procedureSpecimensTakenSection = new ProcedureSpecimensTakenSectionImpl();
		return procedureSpecimensTakenSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubjectiveSection createSubjectiveSection() {
		SubjectiveSectionImpl subjectiveSection = new SubjectiveSectionImpl();
		return subjectiveSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsultationNote createConsultationNote() {
		ConsultationNoteImpl consultationNote = new ConsultationNoteImpl();
		return consultationNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsultationNote_ComponentOf createConsultationNote_ComponentOf() {
		ConsultationNote_ComponentOfImpl consultationNote_ComponentOf = new ConsultationNote_ComponentOfImpl();
		return consultationNote_ComponentOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentOf_EncompassingEncounter2 createComponentOf_EncompassingEncounter2() {
		ComponentOf_EncompassingEncounter2Impl componentOf_EncompassingEncounter2 = new ComponentOf_EncompassingEncounter2Impl();
		return componentOf_EncompassingEncounter2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncompassingEncounter2_ResponsibleParty createEncompassingEncounter2_ResponsibleParty() {
		EncompassingEncounter2_ResponsiblePartyImpl encompassingEncounter2_ResponsibleParty = new EncompassingEncounter2_ResponsiblePartyImpl();
		return encompassingEncounter2_ResponsibleParty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncompassingEncounter2_EncounterParticipant createEncompassingEncounter2_EncounterParticipant() {
		EncompassingEncounter2_EncounterParticipantImpl encompassingEncounter2_EncounterParticipant = new EncompassingEncounter2_EncounterParticipantImpl();
		return encompassingEncounter2_EncounterParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssessmentSection createAssessmentSection() {
		AssessmentSectionImpl assessmentSection = new AssessmentSectionImpl();
		return assessmentSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryAndPhysicalNote createHistoryAndPhysicalNote() {
		HistoryAndPhysicalNoteImpl historyAndPhysicalNote = new HistoryAndPhysicalNoteImpl();
		return historyAndPhysicalNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryAndPhysicalNote_ComponentOf createHistoryAndPhysicalNote_ComponentOf() {
		HistoryAndPhysicalNote_ComponentOfImpl historyAndPhysicalNote_ComponentOf = new HistoryAndPhysicalNote_ComponentOfImpl();
		return historyAndPhysicalNote_ComponentOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentOf_EncompassingEncounter4 createComponentOf_EncompassingEncounter4() {
		ComponentOf_EncompassingEncounter4Impl componentOf_EncompassingEncounter4 = new ComponentOf_EncompassingEncounter4Impl();
		return componentOf_EncompassingEncounter4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncompassingEncounter4_ResponsibleParty createEncompassingEncounter4_ResponsibleParty() {
		EncompassingEncounter4_ResponsiblePartyImpl encompassingEncounter4_ResponsibleParty = new EncompassingEncounter4_ResponsiblePartyImpl();
		return encompassingEncounter4_ResponsibleParty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncompassingEncounter4_EncounterParticipant createEncompassingEncounter4_EncounterParticipant() {
		EncompassingEncounter4_EncounterParticipantImpl encompassingEncounter4_EncounterParticipant = new EncompassingEncounter4_EncounterParticipantImpl();
		return encompassingEncounter4_EncounterParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperativeNote createOperativeNote() {
		OperativeNoteImpl operativeNote = new OperativeNoteImpl();
		return operativeNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperativeNote_DocumentationOf createOperativeNote_DocumentationOf() {
		OperativeNote_DocumentationOfImpl operativeNote_DocumentationOf = new OperativeNote_DocumentationOfImpl();
		return operativeNote_DocumentationOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentationOf_ServiceEvent createDocumentationOf_ServiceEvent() {
		DocumentationOf_ServiceEventImpl documentationOf_ServiceEvent = new DocumentationOf_ServiceEventImpl();
		return documentationOf_ServiceEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceEvent_PrimaryPerformer createServiceEvent_PrimaryPerformer() {
		ServiceEvent_PrimaryPerformerImpl serviceEvent_PrimaryPerformer = new ServiceEvent_PrimaryPerformerImpl();
		return serviceEvent_PrimaryPerformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureNote createProcedureNote() {
		ProcedureNoteImpl procedureNote = new ProcedureNoteImpl();
		return procedureNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureNote_ComponentOf createProcedureNote_ComponentOf() {
		ProcedureNote_ComponentOfImpl procedureNote_ComponentOf = new ProcedureNote_ComponentOfImpl();
		return procedureNote_ComponentOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentOf_EncompassingEncounter5 createComponentOf_EncompassingEncounter5() {
		ComponentOf_EncompassingEncounter5Impl componentOf_EncompassingEncounter5 = new ComponentOf_EncompassingEncounter5Impl();
		return componentOf_EncompassingEncounter5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncompassingEncounter5_Location createEncompassingEncounter5_Location() {
		EncompassingEncounter5_LocationImpl encompassingEncounter5_Location = new EncompassingEncounter5_LocationImpl();
		return encompassingEncounter5_Location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location_HealthCareFacility createLocation_HealthCareFacility() {
		Location_HealthCareFacilityImpl location_HealthCareFacility = new Location_HealthCareFacilityImpl();
		return location_HealthCareFacility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncompassingEncounter5_EncounterParticipant createEncompassingEncounter5_EncounterParticipant() {
		EncompassingEncounter5_EncounterParticipantImpl encompassingEncounter5_EncounterParticipant = new EncompassingEncounter5_EncounterParticipantImpl();
		return encompassingEncounter5_EncounterParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureNote_Individual createProcedureNote_Individual() {
		ProcedureNote_IndividualImpl procedureNote_Individual = new ProcedureNote_IndividualImpl();
		return procedureNote_Individual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureNote_PrimaryCarePhysician createProcedureNote_PrimaryCarePhysician() {
		ProcedureNote_PrimaryCarePhysicianImpl procedureNote_PrimaryCarePhysician = new ProcedureNote_PrimaryCarePhysicianImpl();
		return procedureNote_PrimaryCarePhysician;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureNote_Provider createProcedureNote_Provider() {
		ProcedureNote_ProviderImpl procedureNote_Provider = new ProcedureNote_ProviderImpl();
		return procedureNote_Provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Provider_AssociatedEntity createProvider_AssociatedEntity() {
		Provider_AssociatedEntityImpl provider_AssociatedEntity = new Provider_AssociatedEntityImpl();
		return provider_AssociatedEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureNote_DocumentationOf createProcedureNote_DocumentationOf() {
		ProcedureNote_DocumentationOfImpl procedureNote_DocumentationOf = new ProcedureNote_DocumentationOfImpl();
		return procedureNote_DocumentationOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentationOf_ServiceEvent1 createDocumentationOf_ServiceEvent1() {
		DocumentationOf_ServiceEvent1Impl documentationOf_ServiceEvent1 = new DocumentationOf_ServiceEvent1Impl();
		return documentationOf_ServiceEvent1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceEvent1_PrimaryPerformer createServiceEvent1_PrimaryPerformer() {
		ServiceEvent1_PrimaryPerformerImpl serviceEvent1_PrimaryPerformer = new ServiceEvent1_PrimaryPerformerImpl();
		return serviceEvent1_PrimaryPerformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgressNote createProgressNote() {
		ProgressNoteImpl progressNote = new ProgressNoteImpl();
		return progressNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgressNote_DocumentationOf createProgressNote_DocumentationOf() {
		ProgressNote_DocumentationOfImpl progressNote_DocumentationOf = new ProgressNote_DocumentationOfImpl();
		return progressNote_DocumentationOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentationOf_ServiceEvent2 createDocumentationOf_ServiceEvent2() {
		DocumentationOf_ServiceEvent2Impl documentationOf_ServiceEvent2 = new DocumentationOf_ServiceEvent2Impl();
		return documentationOf_ServiceEvent2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgressNote_ComponentOf createProgressNote_ComponentOf() {
		ProgressNote_ComponentOfImpl progressNote_ComponentOf = new ProgressNote_ComponentOfImpl();
		return progressNote_ComponentOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentOf_EncompassingEncounter6 createComponentOf_EncompassingEncounter6() {
		ComponentOf_EncompassingEncounter6Impl componentOf_EncompassingEncounter6 = new ComponentOf_EncompassingEncounter6Impl();
		return componentOf_EncompassingEncounter6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncompassingEncounter6_Location createEncompassingEncounter6_Location() {
		EncompassingEncounter6_LocationImpl encompassingEncounter6_Location = new EncompassingEncounter6_LocationImpl();
		return encompassingEncounter6_Location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location_HealthCareFacility1 createLocation_HealthCareFacility1() {
		Location_HealthCareFacility1Impl location_HealthCareFacility1 = new Location_HealthCareFacility1Impl();
		return location_HealthCareFacility1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreoperativeDiagnosis createPreoperativeDiagnosis() {
		PreoperativeDiagnosisImpl preoperativeDiagnosis = new PreoperativeDiagnosisImpl();
		return preoperativeDiagnosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstructionsSection createInstructionsSection() {
		InstructionsSectionImpl instructionsSection = new InstructionsSectionImpl();
		return instructionsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalAdmissionDiagnosis createHospitalAdmissionDiagnosis() {
		HospitalAdmissionDiagnosisImpl hospitalAdmissionDiagnosis = new HospitalAdmissionDiagnosisImpl();
		return hospitalAdmissionDiagnosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationsAdministeredSection createMedicationsAdministeredSection() {
		MedicationsAdministeredSectionImpl medicationsAdministeredSection = new MedicationsAdministeredSectionImpl();
		return medicationsAdministeredSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalExamSection createPhysicalExamSection() {
		PhysicalExamSectionImpl physicalExamSection = new PhysicalExamSectionImpl();
		return physicalExamSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralStatusSection createGeneralStatusSection() {
		GeneralStatusSectionImpl generalStatusSection = new GeneralStatusSectionImpl();
		return generalStatusSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReviewOfSystemsSection createReviewOfSystemsSection() {
		ReviewOfSystemsSectionImpl reviewOfSystemsSection = new ReviewOfSystemsSectionImpl();
		return reviewOfSystemsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalCourseSection createHospitalCourseSection() {
		HospitalCourseSectionImpl hospitalCourseSection = new HospitalCourseSectionImpl();
		return hospitalCourseSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssessmentAndPlanSection createAssessmentAndPlanSection() {
		AssessmentAndPlanSectionImpl assessmentAndPlanSection = new AssessmentAndPlanSectionImpl();
		return assessmentAndPlanSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageSpoken createLanguageSpoken() {
		LanguageSpokenImpl languageSpoken = new LanguageSpokenImpl();
		return languageSpoken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthcareProvider createHealthcareProvider() {
		HealthcareProviderImpl healthcareProvider = new HealthcareProviderImpl();
		return healthcareProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupportGuardian createSupportGuardian() {
		SupportGuardianImpl supportGuardian = new SupportGuardianImpl();
		return supportGuardian;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupportParticipant createSupportParticipant() {
		SupportParticipantImpl supportParticipant = new SupportParticipantImpl();
		return supportParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurgicalDrainsSection createSurgicalDrainsSection() {
		SurgicalDrainsSectionImpl surgicalDrainsSection = new SurgicalDrainsSectionImpl();
		return surgicalDrainsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnstructuredDocument createUnstructuredDocument() {
		UnstructuredDocumentImpl unstructuredDocument = new UnstructuredDocumentImpl();
		return unstructuredDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnstructuredDocument_RecordTarget createUnstructuredDocument_RecordTarget() {
		UnstructuredDocument_RecordTargetImpl unstructuredDocument_RecordTarget = new UnstructuredDocument_RecordTargetImpl();
		return unstructuredDocument_RecordTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecordTarget_PatientRole2 createRecordTarget_PatientRole2() {
		RecordTarget_PatientRole2Impl recordTarget_PatientRole2 = new RecordTarget_PatientRole2Impl();
		return recordTarget_PatientRole2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnstructuredDocument_Author createUnstructuredDocument_Author() {
		UnstructuredDocument_AuthorImpl unstructuredDocument_Author = new UnstructuredDocument_AuthorImpl();
		return unstructuredDocument_Author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Author_AssignedAuthor2 createAuthor_AssignedAuthor2() {
		Author_AssignedAuthor2Impl author_AssignedAuthor2 = new Author_AssignedAuthor2Impl();
		return author_AssignedAuthor2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnstructuredDocument_Custodian createUnstructuredDocument_Custodian() {
		UnstructuredDocument_CustodianImpl unstructuredDocument_Custodian = new UnstructuredDocument_CustodianImpl();
		return unstructuredDocument_Custodian;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Custodian_AssignedCustodian3 createCustodian_AssignedCustodian3() {
		Custodian_AssignedCustodian3Impl custodian_AssignedCustodian3 = new Custodian_AssignedCustodian3Impl();
		return custodian_AssignedCustodian3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignedCustodian3_CustodianOrganization createAssignedCustodian3_CustodianOrganization() {
		AssignedCustodian3_CustodianOrganizationImpl assignedCustodian3_CustodianOrganization = new AssignedCustodian3_CustodianOrganizationImpl();
		return assignedCustodian3_CustodianOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnstructuredDocument_Component createUnstructuredDocument_Component() {
		UnstructuredDocument_ComponentImpl unstructuredDocument_Component = new UnstructuredDocument_ComponentImpl();
		return unstructuredDocument_Component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component_NonXMLBody createComponent_NonXMLBody() {
		Component_NonXMLBodyImpl component_NonXMLBody = new Component_NonXMLBodyImpl();
		return component_NonXMLBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScanOriginalAuthor createScanOriginalAuthor() {
		ScanOriginalAuthorImpl scanOriginalAuthor = new ScanOriginalAuthorImpl();
		return scanOriginalAuthor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScanningDevice createScanningDevice() {
		ScanningDeviceImpl scanningDevice = new ScanningDeviceImpl();
		return scanningDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScanDataEnterer createScanDataEnterer() {
		ScanDataEntererImpl scanDataEnterer = new ScanDataEntererImpl();
		return scanDataEnterer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationInformation createMedicationInformation() {
		MedicationInformationImpl medicationInformation = new MedicationInformationImpl();
		return medicationInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnstructuredOrScannedDocument createUnstructuredOrScannedDocument() {
		UnstructuredOrScannedDocumentImpl unstructuredOrScannedDocument = new UnstructuredOrScannedDocumentImpl();
		return unstructuredOrScannedDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferralSummary createReferralSummary() {
		ReferralSummaryImpl referralSummary = new ReferralSummaryImpl();
		return referralSummary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DischargeSummary createDischargeSummary() {
		DischargeSummaryImpl dischargeSummary = new DischargeSummaryImpl();
		return dischargeSummary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DischargeSummary_ComponentOf createDischargeSummary_ComponentOf() {
		DischargeSummary_ComponentOfImpl dischargeSummary_ComponentOf = new DischargeSummary_ComponentOfImpl();
		return dischargeSummary_ComponentOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentOf_EncompassingEncounter3 createComponentOf_EncompassingEncounter3() {
		ComponentOf_EncompassingEncounter3Impl componentOf_EncompassingEncounter3 = new ComponentOf_EncompassingEncounter3Impl();
		return componentOf_EncompassingEncounter3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncompassingEncounter3_ResponsibleParty createEncompassingEncounter3_ResponsibleParty() {
		EncompassingEncounter3_ResponsiblePartyImpl encompassingEncounter3_ResponsibleParty = new EncompassingEncounter3_ResponsiblePartyImpl();
		return encompassingEncounter3_ResponsibleParty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncompassingEncounter3_EncounterParticipant createEncompassingEncounter3_EncounterParticipant() {
		EncompassingEncounter3_EncounterParticipantImpl encompassingEncounter3_EncounterParticipant = new EncompassingEncounter3_EncounterParticipantImpl();
		return encompassingEncounter3_EncounterParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DischargeDietSection createDischargeDietSection() {
		DischargeDietSectionImpl dischargeDietSection = new DischargeDietSectionImpl();
		return dischargeDietSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalDischargeMedicationsSectionEntriesOptional createHospitalDischargeMedicationsSectionEntriesOptional() {
		HospitalDischargeMedicationsSectionEntriesOptionalImpl hospitalDischargeMedicationsSectionEntriesOptional = new HospitalDischargeMedicationsSectionEntriesOptionalImpl();
		return hospitalDischargeMedicationsSectionEntriesOptional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreconditionForSubstanceAdministration createPreconditionForSubstanceAdministration() {
		PreconditionForSubstanceAdministrationImpl preconditionForSubstanceAdministration = new PreconditionForSubstanceAdministrationImpl();
		return preconditionForSubstanceAdministration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationMedicationInformation createImmunizationMedicationInformation() {
		ImmunizationMedicationInformationImpl immunizationMedicationInformation = new ImmunizationMedicationInformationImpl();
		return immunizationMedicationInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureSpecimen createProcedureSpecimen() {
		ProcedureSpecimenImpl procedureSpecimen = new ProcedureSpecimenImpl();
		return procedureSpecimen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedurePerformer createProcedurePerformer() {
		ProcedurePerformerImpl procedurePerformer = new ProcedurePerformerImpl();
		return procedurePerformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureEncounter createProcedureEncounter() {
		ProcedureEncounterImpl procedureEncounter = new ProcedureEncounterImpl();
		return procedureEncounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationInformationManufacturedMaterial createMedicationInformationManufacturedMaterial() {
		MedicationInformationManufacturedMaterialImpl medicationInformationManufacturedMaterial = new MedicationInformationManufacturedMaterialImpl();
		return medicationInformationManufacturedMaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyHistorySubject createFamilyHistorySubject() {
		FamilyHistorySubjectImpl familyHistorySubject = new FamilyHistorySubjectImpl();
		return familyHistorySubject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalDischargeStudiesSummarySection createHospitalDischargeStudiesSummarySection() {
		HospitalDischargeStudiesSummarySectionImpl hospitalDischargeStudiesSummarySection = new HospitalDischargeStudiesSummarySectionImpl();
		return hospitalDischargeStudiesSummarySection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DischargeMedication createDischargeMedication() {
		DischargeMedicationImpl dischargeMedication = new DischargeMedicationImpl();
		return dischargeMedication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalDischargeDiagnosis createHospitalDischargeDiagnosis() {
		HospitalDischargeDiagnosisImpl hospitalDischargeDiagnosis = new HospitalDischargeDiagnosisImpl();
		return hospitalDischargeDiagnosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalDischargeInstructionsSection createHospitalDischargeInstructionsSection() {
		HospitalDischargeInstructionsSectionImpl hospitalDischargeInstructionsSection = new HospitalDischargeInstructionsSectionImpl();
		return hospitalDischargeInstructionsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsolPackage getConsolPackage() {
		return (ConsolPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ConsolPackage getPackage() {
		return ConsolPackage.eINSTANCE;
	}

} // ConsolFactoryImpl
