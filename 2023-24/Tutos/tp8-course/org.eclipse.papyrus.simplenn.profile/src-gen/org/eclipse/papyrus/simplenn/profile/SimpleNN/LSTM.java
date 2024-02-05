/**
 */
package org.eclipse.papyrus.simplenn.profile.SimpleNN;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LSTM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.simplenn.profile.SimpleNN.LSTM#isUseBias <em>Use Bias</em>}</li>
 *   <li>{@link org.eclipse.papyrus.simplenn.profile.SimpleNN.LSTM#getActivationFct <em>Activation Fct</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.simplenn.profile.SimpleNN.SimpleNNPackage#getLSTM()
 * @model
 * @generated
 */
public interface LSTM extends Layer {
	/**
	 * Returns the value of the '<em><b>Use Bias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Bias</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Bias</em>' attribute.
	 * @see #setUseBias(boolean)
	 * @see org.eclipse.papyrus.simplenn.profile.SimpleNN.SimpleNNPackage#getLSTM_UseBias()
	 * @model dataType="org.eclipse.uml2.types.Boolean" ordered="false"
	 * @generated
	 */
	boolean isUseBias();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.simplenn.profile.SimpleNN.LSTM#isUseBias <em>Use Bias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Bias</em>' attribute.
	 * @see #isUseBias()
	 * @generated
	 */
	void setUseBias(boolean value);

	/**
	 * Returns the value of the '<em><b>Activation Fct</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.simplenn.profile.SimpleNN.EActivationFCT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activation Fct</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activation Fct</em>' attribute.
	 * @see org.eclipse.papyrus.simplenn.profile.SimpleNN.EActivationFCT
	 * @see #setActivationFct(EActivationFCT)
	 * @see org.eclipse.papyrus.simplenn.profile.SimpleNN.SimpleNNPackage#getLSTM_ActivationFct()
	 * @model ordered="false"
	 * @generated
	 */
	EActivationFCT getActivationFct();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.simplenn.profile.SimpleNN.LSTM#getActivationFct <em>Activation Fct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activation Fct</em>' attribute.
	 * @see org.eclipse.papyrus.simplenn.profile.SimpleNN.EActivationFCT
	 * @see #getActivationFct()
	 * @generated
	 */
	void setActivationFct(EActivationFCT value);

} // LSTM
