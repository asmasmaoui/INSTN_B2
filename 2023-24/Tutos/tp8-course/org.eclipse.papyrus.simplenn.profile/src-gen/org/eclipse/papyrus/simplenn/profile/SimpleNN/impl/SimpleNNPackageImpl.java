/**
 */
package org.eclipse.papyrus.simplenn.profile.SimpleNN.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.papyrus.simplenn.profile.SimpleNN.Conv1D;
import org.eclipse.papyrus.simplenn.profile.SimpleNN.EActivationFCT;
import org.eclipse.papyrus.simplenn.profile.SimpleNN.Layer;
import org.eclipse.papyrus.simplenn.profile.SimpleNN.NeuralNetwork;
import org.eclipse.papyrus.simplenn.profile.SimpleNN.SimpleNNFactory;
import org.eclipse.papyrus.simplenn.profile.SimpleNN.SimpleNNPackage;

import org.eclipse.papyrus.simplenn.profile.SimpleNN.util.SimpleNNValidator;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleNNPackageImpl extends EPackageImpl implements SimpleNNPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass neuralNetworkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conv1DEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass layerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lstmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eActivationFCTEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.papyrus.simplenn.profile.SimpleNN.SimpleNNPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SimpleNNPackageImpl() {
		super(eNS_URI, SimpleNNFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link SimpleNNPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SimpleNNPackage init() {
		if (isInited) return (SimpleNNPackage)EPackage.Registry.INSTANCE.getEPackage(SimpleNNPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSimpleNNPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SimpleNNPackageImpl theSimpleNNPackage = registeredSimpleNNPackage instanceof SimpleNNPackageImpl ? (SimpleNNPackageImpl)registeredSimpleNNPackage : new SimpleNNPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		TypesPackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSimpleNNPackage.createPackageContents();

		// Initialize created meta-data
		theSimpleNNPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theSimpleNNPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return SimpleNNValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theSimpleNNPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SimpleNNPackage.eNS_URI, theSimpleNNPackage);
		return theSimpleNNPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNeuralNetwork() {
		return neuralNetworkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNeuralNetwork_Base_Class() {
		return (EReference)neuralNetworkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNeuralNetwork__NoOperations__DiagnosticChain_Map() {
		return neuralNetworkEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNeuralNetwork__Allattributesarelayers__DiagnosticChain_Map() {
		return neuralNetworkEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConv1D() {
		return conv1DEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConv1D_Filters() {
		return (EAttribute)conv1DEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConv1D_Kernel_size() {
		return (EAttribute)conv1DEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLayer() {
		return layerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLayer_Base_Property() {
		return (EReference)layerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLayer__NoType__DiagnosticChain_Map() {
		return layerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLSTM() {
		return lstmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLSTM_UseBias() {
		return (EAttribute)lstmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLSTM_ActivationFct() {
		return (EAttribute)lstmEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEActivationFCT() {
		return eActivationFCTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SimpleNNFactory getSimpleNNFactory() {
		return (SimpleNNFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		neuralNetworkEClass = createEClass(NEURAL_NETWORK);
		createEReference(neuralNetworkEClass, NEURAL_NETWORK__BASE_CLASS);
		createEOperation(neuralNetworkEClass, NEURAL_NETWORK___NO_OPERATIONS__DIAGNOSTICCHAIN_MAP);
		createEOperation(neuralNetworkEClass, NEURAL_NETWORK___ALLATTRIBUTESARELAYERS__DIAGNOSTICCHAIN_MAP);

		conv1DEClass = createEClass(CONV1_D);
		createEAttribute(conv1DEClass, CONV1_D__FILTERS);
		createEAttribute(conv1DEClass, CONV1_D__KERNEL_SIZE);

		layerEClass = createEClass(LAYER);
		createEReference(layerEClass, LAYER__BASE_PROPERTY);
		createEOperation(layerEClass, LAYER___NO_TYPE__DIAGNOSTICCHAIN_MAP);

		lstmEClass = createEClass(LSTM);
		createEAttribute(lstmEClass, LSTM__USE_BIAS);
		createEAttribute(lstmEClass, LSTM__ACTIVATION_FCT);

		// Create enums
		eActivationFCTEEnum = createEEnum(EACTIVATION_FCT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		conv1DEClass.getESuperTypes().add(this.getLayer());
		lstmEClass.getESuperTypes().add(this.getLayer());

		// Initialize classes, features, and operations; add parameters
		initEClass(neuralNetworkEClass, NeuralNetwork.class, "NeuralNetwork", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getNeuralNetwork_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 0, 1, NeuralNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		EOperation op = initEOperation(getNeuralNetwork__NoOperations__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "NoOperations", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = initEOperation(getNeuralNetwork__Allattributesarelayers__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "allattributesarelayers", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(conv1DEClass, Conv1D.class, "Conv1D", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getConv1D_Filters(), theTypesPackage.getInteger(), "filters", null, 0, 1, Conv1D.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getConv1D_Kernel_size(), theTypesPackage.getInteger(), "kernel_size", null, 0, 1, Conv1D.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(layerEClass, Layer.class, "Layer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getLayer_Base_Property(), theUMLPackage.getProperty(), null, "base_Property", null, 1, 1, Layer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		op = initEOperation(getLayer__NoType__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "NoType", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(lstmEClass, org.eclipse.papyrus.simplenn.profile.SimpleNN.LSTM.class, "LSTM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getLSTM_UseBias(), theTypesPackage.getBoolean(), "useBias", null, 0, 1, org.eclipse.papyrus.simplenn.profile.SimpleNN.LSTM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getLSTM_ActivationFct(), this.getEActivationFCT(), "activationFct", null, 0, 1, org.eclipse.papyrus.simplenn.profile.SimpleNN.LSTM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		// Initialize enums and add enum literals
		initEEnum(eActivationFCTEEnum, EActivationFCT.class, "EActivationFCT"); //$NON-NLS-1$
		addEEnumLiteral(eActivationFCTEEnum, EActivationFCT.TANH);
		addEEnumLiteral(eActivationFCTEEnum, EActivationFCT.LINEAR);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/2.0.0/UML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUMLAnnotations() {
		String source = "http://www.eclipse.org/uml2/2.0.0/UML"; //$NON-NLS-1$
		addAnnotation
		  (getNeuralNetwork__Allattributesarelayers__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "originalName", "all attributes are layers" //$NON-NLS-1$ //$NON-NLS-2$
		   });
	}

} //SimpleNNPackageImpl
