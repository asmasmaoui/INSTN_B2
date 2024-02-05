/**
 */
package org.eclipse.papyrus.simplenn.profile.SimpleNN;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conv1 D</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.simplenn.profile.SimpleNN.Conv1D#getFilters <em>Filters</em>}</li>
 *   <li>{@link org.eclipse.papyrus.simplenn.profile.SimpleNN.Conv1D#getKernel_size <em>Kernel size</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.simplenn.profile.SimpleNN.SimpleNNPackage#getConv1D()
 * @model
 * @generated
 */
public interface Conv1D extends Layer {
	/**
	 * Returns the value of the '<em><b>Filters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filters</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filters</em>' attribute.
	 * @see #setFilters(int)
	 * @see org.eclipse.papyrus.simplenn.profile.SimpleNN.SimpleNNPackage#getConv1D_Filters()
	 * @model dataType="org.eclipse.uml2.types.Integer" ordered="false"
	 * @generated
	 */
	int getFilters();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.simplenn.profile.SimpleNN.Conv1D#getFilters <em>Filters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filters</em>' attribute.
	 * @see #getFilters()
	 * @generated
	 */
	void setFilters(int value);

	/**
	 * Returns the value of the '<em><b>Kernel size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kernel size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kernel size</em>' attribute.
	 * @see #setKernel_size(int)
	 * @see org.eclipse.papyrus.simplenn.profile.SimpleNN.SimpleNNPackage#getConv1D_Kernel_size()
	 * @model dataType="org.eclipse.uml2.types.Integer" ordered="false"
	 * @generated
	 */
	int getKernel_size();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.simplenn.profile.SimpleNN.Conv1D#getKernel_size <em>Kernel size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kernel size</em>' attribute.
	 * @see #getKernel_size()
	 * @generated
	 */
	void setKernel_size(int value);

} // Conv1D
