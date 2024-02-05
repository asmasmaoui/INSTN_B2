/**
 */
package org.eclipse.papyrus.simplenn.profile.SimpleNN.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.papyrus.simplenn.profile.SimpleNN.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.simplenn.profile.SimpleNN.SimpleNNPackage
 * @generated
 */
public class SimpleNNValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SimpleNNValidator INSTANCE = new SimpleNNValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.papyrus.simplenn.profile.SimpleNN"; //$NON-NLS-1$

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No Operations' of 'Neural Network'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NEURAL_NETWORK__NO_OPERATIONS = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Allattributesarelayers' of 'Neural Network'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NEURAL_NETWORK__ALLATTRIBUTESARELAYERS = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No Type' of 'Layer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LAYER__NO_TYPE = 3;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 3;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleNNValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return SimpleNNPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case SimpleNNPackage.NEURAL_NETWORK:
				return validateNeuralNetwork((NeuralNetwork)value, diagnostics, context);
			case SimpleNNPackage.CONV1_D:
				return validateConv1D((Conv1D)value, diagnostics, context);
			case SimpleNNPackage.LAYER:
				return validateLayer((Layer)value, diagnostics, context);
			case SimpleNNPackage.LSTM:
				return validateLSTM((LSTM)value, diagnostics, context);
			case SimpleNNPackage.EACTIVATION_FCT:
				return validateEActivationFCT((EActivationFCT)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNeuralNetwork(NeuralNetwork neuralNetwork, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(neuralNetwork, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(neuralNetwork, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(neuralNetwork, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(neuralNetwork, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(neuralNetwork, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(neuralNetwork, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(neuralNetwork, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(neuralNetwork, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(neuralNetwork, diagnostics, context);
		if (result || diagnostics != null) result &= validateNeuralNetwork_NoOperations(neuralNetwork, diagnostics, context);
		if (result || diagnostics != null) result &= validateNeuralNetwork_allattributesarelayers(neuralNetwork, diagnostics, context);
		return result;
	}

	/**
	 * Validates the NoOperations constraint of '<em>Neural Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNeuralNetwork_NoOperations(NeuralNetwork neuralNetwork, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return neuralNetwork.NoOperations(diagnostics, context);
	}

	/**
	 * Validates the allattributesarelayers constraint of '<em>Neural Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNeuralNetwork_allattributesarelayers(NeuralNetwork neuralNetwork, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return neuralNetwork.allattributesarelayers(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConv1D(Conv1D conv1D, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(conv1D, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(conv1D, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(conv1D, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(conv1D, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(conv1D, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(conv1D, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(conv1D, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(conv1D, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(conv1D, diagnostics, context);
		if (result || diagnostics != null) result &= validateLayer_NoType(conv1D, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLayer(Layer layer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(layer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(layer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(layer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(layer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(layer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(layer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(layer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(layer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(layer, diagnostics, context);
		if (result || diagnostics != null) result &= validateLayer_NoType(layer, diagnostics, context);
		return result;
	}

	/**
	 * Validates the NoType constraint of '<em>Layer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLayer_NoType(Layer layer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return layer.NoType(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLSTM(LSTM lstm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(lstm, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(lstm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(lstm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(lstm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(lstm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(lstm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(lstm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(lstm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(lstm, diagnostics, context);
		if (result || diagnostics != null) result &= validateLayer_NoType(lstm, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEActivationFCT(EActivationFCT eActivationFCT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //SimpleNNValidator
