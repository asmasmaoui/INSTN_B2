/**
 */
package org.eclipse.papyrus.simplenn.profile.SimpleNN;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.simplenn.profile.SimpleNN.SimpleNNFactory
 * @model kind="package"
 * @generated
 */
public interface SimpleNNPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "SimpleNN"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/papyrus/SimpleNN/1"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "SimpleNN"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimpleNNPackage eINSTANCE = org.eclipse.papyrus.simplenn.profile.SimpleNN.impl.SimpleNNPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.simplenn.profile.SimpleNN.impl.NeuralNetworkImpl <em>Neural Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.simplenn.profile.SimpleNN.impl.NeuralNetworkImpl
	 * @see org.eclipse.papyrus.simplenn.profile.SimpleNN.impl.SimpleNNPackageImpl#getNeuralNetwork()
	 * @generated
	 */
	int NEURAL_NETWORK = 0;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEURAL_NETWORK__BASE_CLASS = 0;

	/**
	 * The number of structural features of the '<em>Neural Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEURAL_NETWORK_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>No Operations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEURAL_NETWORK___NO_OPERATIONS__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Allattributesarelayers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEURAL_NETWORK___ALLATTRIBUTESARELAYERS__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The number of operations of the '<em>Neural Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEURAL_NETWORK_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.simplenn.profile.SimpleNN.impl.LayerImpl <em>Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.simplenn.profile.SimpleNN.impl.LayerImpl
	 * @see org.eclipse.papyrus.simplenn.profile.SimpleNN.impl.SimpleNNPackageImpl#getLayer()
	 * @generated
	 */
	int LAYER = 2;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__BASE_PROPERTY = 0;

	/**
	 * The number of structural features of the '<em>Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>No Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER___NO_TYPE__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.simplenn.profile.SimpleNN.impl.Conv1DImpl <em>Conv1 D</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.simplenn.profile.SimpleNN.impl.Conv1DImpl
	 * @see org.eclipse.papyrus.simplenn.profile.SimpleNN.impl.SimpleNNPackageImpl#getConv1D()
	 * @generated
	 */
	int CONV1_D = 1;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONV1_D__BASE_PROPERTY = LAYER__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Filters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONV1_D__FILTERS = LAYER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Kernel size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONV1_D__KERNEL_SIZE = LAYER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Conv1 D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONV1_D_FEATURE_COUNT = LAYER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>No Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONV1_D___NO_TYPE__DIAGNOSTICCHAIN_MAP = LAYER___NO_TYPE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Conv1 D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONV1_D_OPERATION_COUNT = LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.simplenn.profile.SimpleNN.impl.LSTMImpl <em>LSTM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.simplenn.profile.SimpleNN.impl.LSTMImpl
	 * @see org.eclipse.papyrus.simplenn.profile.SimpleNN.impl.SimpleNNPackageImpl#getLSTM()
	 * @generated
	 */
	int LSTM = 3;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LSTM__BASE_PROPERTY = LAYER__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Use Bias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LSTM__USE_BIAS = LAYER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Activation Fct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LSTM__ACTIVATION_FCT = LAYER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>LSTM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LSTM_FEATURE_COUNT = LAYER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>No Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LSTM___NO_TYPE__DIAGNOSTICCHAIN_MAP = LAYER___NO_TYPE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>LSTM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LSTM_OPERATION_COUNT = LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.simplenn.profile.SimpleNN.EActivationFCT <em>EActivation FCT</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.simplenn.profile.SimpleNN.EActivationFCT
	 * @see org.eclipse.papyrus.simplenn.profile.SimpleNN.impl.SimpleNNPackageImpl#getEActivationFCT()
	 * @generated
	 */
	int EACTIVATION_FCT = 4;


	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.simplenn.profile.SimpleNN.NeuralNetwork <em>Neural Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Neural Network</em>'.
	 * @see org.eclipse.papyrus.simplenn.profile.SimpleNN.NeuralNetwork
	 * @generated
	 */
	EClass getNeuralNetwork();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.simplenn.profile.SimpleNN.NeuralNetwork#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.eclipse.papyrus.simplenn.profile.SimpleNN.NeuralNetwork#getBase_Class()
	 * @see #getNeuralNetwork()
	 * @generated
	 */
	EReference getNeuralNetwork_Base_Class();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.simplenn.profile.SimpleNN.NeuralNetwork#NoOperations(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>No Operations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>No Operations</em>' operation.
	 * @see org.eclipse.papyrus.simplenn.profile.SimpleNN.NeuralNetwork#NoOperations(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getNeuralNetwork__NoOperations__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.simplenn.profile.SimpleNN.NeuralNetwork#allattributesarelayers(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Allattributesarelayers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Allattributesarelayers</em>' operation.
	 * @see org.eclipse.papyrus.simplenn.profile.SimpleNN.NeuralNetwork#allattributesarelayers(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getNeuralNetwork__Allattributesarelayers__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.simplenn.profile.SimpleNN.Conv1D <em>Conv1 D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conv1 D</em>'.
	 * @see org.eclipse.papyrus.simplenn.profile.SimpleNN.Conv1D
	 * @generated
	 */
	EClass getConv1D();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.simplenn.profile.SimpleNN.Conv1D#getFilters <em>Filters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filters</em>'.
	 * @see org.eclipse.papyrus.simplenn.profile.SimpleNN.Conv1D#getFilters()
	 * @see #getConv1D()
	 * @generated
	 */
	EAttribute getConv1D_Filters();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.simplenn.profile.SimpleNN.Conv1D#getKernel_size <em>Kernel size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kernel size</em>'.
	 * @see org.eclipse.papyrus.simplenn.profile.SimpleNN.Conv1D#getKernel_size()
	 * @see #getConv1D()
	 * @generated
	 */
	EAttribute getConv1D_Kernel_size();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.simplenn.profile.SimpleNN.Layer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layer</em>'.
	 * @see org.eclipse.papyrus.simplenn.profile.SimpleNN.Layer
	 * @generated
	 */
	EClass getLayer();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.simplenn.profile.SimpleNN.Layer#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see org.eclipse.papyrus.simplenn.profile.SimpleNN.Layer#getBase_Property()
	 * @see #getLayer()
	 * @generated
	 */
	EReference getLayer_Base_Property();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.simplenn.profile.SimpleNN.Layer#NoType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>No Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>No Type</em>' operation.
	 * @see org.eclipse.papyrus.simplenn.profile.SimpleNN.Layer#NoType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getLayer__NoType__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.simplenn.profile.SimpleNN.LSTM <em>LSTM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LSTM</em>'.
	 * @see org.eclipse.papyrus.simplenn.profile.SimpleNN.LSTM
	 * @generated
	 */
	EClass getLSTM();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.simplenn.profile.SimpleNN.LSTM#isUseBias <em>Use Bias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Bias</em>'.
	 * @see org.eclipse.papyrus.simplenn.profile.SimpleNN.LSTM#isUseBias()
	 * @see #getLSTM()
	 * @generated
	 */
	EAttribute getLSTM_UseBias();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.simplenn.profile.SimpleNN.LSTM#getActivationFct <em>Activation Fct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activation Fct</em>'.
	 * @see org.eclipse.papyrus.simplenn.profile.SimpleNN.LSTM#getActivationFct()
	 * @see #getLSTM()
	 * @generated
	 */
	EAttribute getLSTM_ActivationFct();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.simplenn.profile.SimpleNN.EActivationFCT <em>EActivation FCT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EActivation FCT</em>'.
	 * @see org.eclipse.papyrus.simplenn.profile.SimpleNN.EActivationFCT
	 * @generated
	 */
	EEnum getEActivationFCT();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SimpleNNFactory getSimpleNNFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.simplenn.profile.SimpleNN.impl.NeuralNetworkImpl <em>Neural Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.simplenn.profile.SimpleNN.impl.NeuralNetworkImpl
		 * @see org.eclipse.papyrus.simplenn.profile.SimpleNN.impl.SimpleNNPackageImpl#getNeuralNetwork()
		 * @generated
		 */
		EClass NEURAL_NETWORK = eINSTANCE.getNeuralNetwork();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEURAL_NETWORK__BASE_CLASS = eINSTANCE.getNeuralNetwork_Base_Class();

		/**
		 * The meta object literal for the '<em><b>No Operations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEURAL_NETWORK___NO_OPERATIONS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getNeuralNetwork__NoOperations__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Allattributesarelayers</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEURAL_NETWORK___ALLATTRIBUTESARELAYERS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getNeuralNetwork__Allattributesarelayers__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.simplenn.profile.SimpleNN.impl.Conv1DImpl <em>Conv1 D</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.simplenn.profile.SimpleNN.impl.Conv1DImpl
		 * @see org.eclipse.papyrus.simplenn.profile.SimpleNN.impl.SimpleNNPackageImpl#getConv1D()
		 * @generated
		 */
		EClass CONV1_D = eINSTANCE.getConv1D();

		/**
		 * The meta object literal for the '<em><b>Filters</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONV1_D__FILTERS = eINSTANCE.getConv1D_Filters();

		/**
		 * The meta object literal for the '<em><b>Kernel size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONV1_D__KERNEL_SIZE = eINSTANCE.getConv1D_Kernel_size();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.simplenn.profile.SimpleNN.impl.LayerImpl <em>Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.simplenn.profile.SimpleNN.impl.LayerImpl
		 * @see org.eclipse.papyrus.simplenn.profile.SimpleNN.impl.SimpleNNPackageImpl#getLayer()
		 * @generated
		 */
		EClass LAYER = eINSTANCE.getLayer();

		/**
		 * The meta object literal for the '<em><b>Base Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYER__BASE_PROPERTY = eINSTANCE.getLayer_Base_Property();

		/**
		 * The meta object literal for the '<em><b>No Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LAYER___NO_TYPE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getLayer__NoType__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.simplenn.profile.SimpleNN.impl.LSTMImpl <em>LSTM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.simplenn.profile.SimpleNN.impl.LSTMImpl
		 * @see org.eclipse.papyrus.simplenn.profile.SimpleNN.impl.SimpleNNPackageImpl#getLSTM()
		 * @generated
		 */
		EClass LSTM = eINSTANCE.getLSTM();

		/**
		 * The meta object literal for the '<em><b>Use Bias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LSTM__USE_BIAS = eINSTANCE.getLSTM_UseBias();

		/**
		 * The meta object literal for the '<em><b>Activation Fct</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LSTM__ACTIVATION_FCT = eINSTANCE.getLSTM_ActivationFct();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.simplenn.profile.SimpleNN.EActivationFCT <em>EActivation FCT</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.simplenn.profile.SimpleNN.EActivationFCT
		 * @see org.eclipse.papyrus.simplenn.profile.SimpleNN.impl.SimpleNNPackageImpl#getEActivationFCT()
		 * @generated
		 */
		EEnum EACTIVATION_FCT = eINSTANCE.getEActivationFCT();

	}

} //SimpleNNPackage
