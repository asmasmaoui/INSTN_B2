/**
 */
package org.eclipse.papyrus.simplenn.profile.SimpleNN;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.simplenn.profile.SimpleNN.SimpleNNPackage
 * @generated
 */
public interface SimpleNNFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimpleNNFactory eINSTANCE = org.eclipse.papyrus.simplenn.profile.SimpleNN.impl.SimpleNNFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Neural Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Neural Network</em>'.
	 * @generated
	 */
	NeuralNetwork createNeuralNetwork();

	/**
	 * Returns a new object of class '<em>Conv1 D</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conv1 D</em>'.
	 * @generated
	 */
	Conv1D createConv1D();

	/**
	 * Returns a new object of class '<em>LSTM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LSTM</em>'.
	 * @generated
	 */
	LSTM createLSTM();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SimpleNNPackage getSimpleNNPackage();

} //SimpleNNFactory
