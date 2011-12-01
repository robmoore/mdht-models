/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.consol.AllergiesSection;
import org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Allergies Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergiesSection#validateAllergiesSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergiesSection#validateAllergiesSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergiesSection#validateAllergiesSectionAllergyDrugSensitivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section Allergy Drug Sensitivity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergiesSection#getConsolAllergyDrugSensitivities() <em>Get Consol Allergy Drug Sensitivities</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergiesSection#validateAllergiesSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section Entries Optional Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergiesSection#validateAllergiesSectionEntriesOptionalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section Entries Optional Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AllergiesSectionOperations extends AllergiesSectionEntriesOptionalOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllergiesSectionOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (
	 * value.code = '48765-2' and value.codeSystem = '2.16.840.1.113883.6.1'))
	 * @param allergiesSection The receiving '<em><b>Allergies Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAllergiesSectionEntriesOptionalCode(AllergiesSection allergiesSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGIES_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGIES_SECTION);
			try {
				VALIDATE_ALLERGIES_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGIES_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGIES_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergiesSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGIES_SECTION__ALLERGIES_SECTION_ENTRIES_OPTIONAL_CODE,
					ConsolPlugin.INSTANCE.getString("AllergiesSectionEntriesOptionalCode"),
					new Object[] { allergiesSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergiesSectionTitle(AllergiesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergiesSectionTitle(AllergiesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGIES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergiesSectionTitle(AllergiesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergiesSectionTitle(AllergiesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGIES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())
	 * @param allergiesSection The receiving '<em><b>Allergies Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAllergiesSectionTitle(AllergiesSection allergiesSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_ALLERGIES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGIES_SECTION);
			try {
				VALIDATE_ALLERGIES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGIES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGIES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergiesSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGIES_SECTION__ALLERGIES_SECTION_TITLE,
					ConsolPlugin.INSTANCE.getString("AllergiesSectionTitle"), new Object[] { allergiesSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergiesSectionText(AllergiesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergiesSectionText(AllergiesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGIES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergiesSectionText(AllergiesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergiesSectionText(AllergiesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGIES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.text.oclIsUndefined()
	 * @param allergiesSection The receiving '<em><b>Allergies Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAllergiesSectionText(AllergiesSection allergiesSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_ALLERGIES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGIES_SECTION);
			try {
				VALIDATE_ALLERGIES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGIES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGIES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergiesSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGIES_SECTION__ALLERGIES_SECTION_TEXT,
					ConsolPlugin.INSTANCE.getString("AllergiesSectionText"), new Object[] { allergiesSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergiesSectionAllergyDrugSensitivity(AllergiesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section Allergy Drug Sensitivity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergiesSectionAllergyDrugSensitivity(AllergiesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGIES_SECTION_ALLERGY_DRUG_SENSITIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::AllergyProblemAct))";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergiesSectionAllergyDrugSensitivity(AllergiesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section Allergy Drug Sensitivity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergiesSectionAllergyDrugSensitivity(AllergiesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGIES_SECTION_ALLERGY_DRUG_SENSITIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::AllergyProblemAct))
	 * @param allergiesSection The receiving '<em><b>Allergies Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAllergiesSectionAllergyDrugSensitivity(AllergiesSection allergiesSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGIES_SECTION_ALLERGY_DRUG_SENSITIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGIES_SECTION);
			try {
				VALIDATE_ALLERGIES_SECTION_ALLERGY_DRUG_SENSITIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGIES_SECTION_ALLERGY_DRUG_SENSITIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGIES_SECTION_ALLERGY_DRUG_SENSITIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergiesSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGIES_SECTION__ALLERGIES_SECTION_ALLERGY_DRUG_SENSITIVITY,
					ConsolPlugin.INSTANCE.getString("AllergiesSectionAllergyDrugSensitivity"),
					new Object[] { allergiesSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolAllergyDrugSensitivities(AllergiesSection) <em>Get Consol Allergy Drug Sensitivities</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolAllergyDrugSensitivities(AllergiesSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_ALLERGY_DRUG_SENSITIVITIES__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::AllergyProblemAct)).oclAsType(consol::AllergyProblemAct)";

	/**
	 * The cached OCL query for the '{@link #getConsolAllergyDrugSensitivities(AllergiesSection) <em>Get Consol Allergy Drug Sensitivities</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolAllergyDrugSensitivities(AllergiesSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_ALLERGY_DRUG_SENSITIVITIES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::AllergyProblemAct)).oclAsType(consol::AllergyProblemAct)
	 * @param allergiesSection The receiving '<em><b>Allergies Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<AllergyProblemAct> getConsolAllergyDrugSensitivities(AllergiesSection allergiesSection) {
		if (GET_CONSOL_ALLERGY_DRUG_SENSITIVITIES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.ALLERGIES_SECTION,
				ConsolPackage.Literals.ALLERGIES_SECTION.getEAllOperations().get(62));
			try {
				GET_CONSOL_ALLERGY_DRUG_SENSITIVITIES__EOCL_QRY = helper.createQuery(GET_CONSOL_ALLERGY_DRUG_SENSITIVITIES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CONSOL_ALLERGY_DRUG_SENSITIVITIES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<AllergyProblemAct> result = (Collection<AllergyProblemAct>) query.evaluate(allergiesSection);
		return new BasicEList.UnmodifiableEList<AllergyProblemAct>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergiesSectionEntriesOptionalTemplateId(AllergiesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section Entries Optional Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergiesSectionEntriesOptionalTemplateId(AllergiesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGIES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergiesSectionEntriesOptionalTemplateId(AllergiesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section Entries Optional Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergiesSectionEntriesOptionalTemplateId(AllergiesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGIES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * The cached OCL expression body for the '{@link #validateAllergiesSectionEntriesOptionalCode(AllergiesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section Entries Optional Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergiesSectionEntriesOptionalCode(AllergiesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGIES_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in ("
			+ "value.code = '48765-2' and value.codeSystem = '2.16.840.1.113883.6.1'))";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergiesSectionEntriesOptionalCode(AllergiesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section Entries Optional Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergiesSectionEntriesOptionalCode(AllergiesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGIES_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.6.1')
	 * @param allergiesSection The receiving '<em><b>Allergies Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAllergiesSectionEntriesOptionalTemplateId(AllergiesSection allergiesSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGIES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGIES_SECTION);
			try {
				VALIDATE_ALLERGIES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGIES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ALLERGIES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergiesSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGIES_SECTION__ALLERGIES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", new Object[] {
								"AllergiesSectionEntriesOptionalTemplateId",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(allergiesSection, context) }),
					new Object[] { allergiesSection }));
			}
			return false;
		}
		return true;
	}

} // AllergiesSectionOperations
