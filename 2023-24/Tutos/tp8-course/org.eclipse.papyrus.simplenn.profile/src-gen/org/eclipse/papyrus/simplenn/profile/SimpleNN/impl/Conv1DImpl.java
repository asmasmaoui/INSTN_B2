/**
 */
package org.eclipse.papyrus.simplenn.profile.SimpleNN.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.papyrus.simplenn.profile.SimpleNN.Conv1D;
import org.eclipse.papyrus.simplenn.profile.SimpleNN.SimpleNNPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conv1 D</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.simplenn.profile.SimpleNN.impl.Conv1DImpl#getFilters <em>Filters</em>}</li>
 *   <li>{@link org.eclipse.papyrus.simplenn.profile.SimpleNN.impl.Conv1DImpl#getKernel_size <em>Kernel size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Conv1DImpl extends LayerImpl implements Conv1D {
	/**
	 * The default value of the '{@link #getFilters() <em>Filters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilters()
	 * @generated
	 * @ordered
	 */
	protected static final int FILTERS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFilters() <em>Filters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilters()
	 * @generated
	 * @ordered
	 */
	protected int filters = FILTERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getKernel_size() <em>Kernel size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKernel_size()
	 * @generated
	 * @ordered
	 */
	protected static final int KERNEL_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getKernel_size() <em>Kernel size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKernel_size()
	 * @generated
	 * @ordered
	 */
	protected int kernel_size = KERNEL_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Conv1DImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimpleNNPackage.Literals.CONV1_D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getFilters() {
		return filters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFilters(int newFilters) {
		int oldFilters = filters;
		filters = newFilters;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleNNPackage.CONV1_D__FILTERS, oldFilters, filters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getKernel_size() {
		return kernel_size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKernel_size(int newKernel_size) {
		int oldKernel_size = kernel_size;
		kernel_size = newKernel_size;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleNNPackage.CONV1_D__KERNEL_SIZE, oldKernel_size, kernel_size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimpleNNPackage.CONV1_D__FILTERS:
				return getFilters();
			case SimpleNNPackage.CONV1_D__KERNEL_SIZE:
				return getKernel_size();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SimpleNNPackage.CONV1_D__FILTERS:
				setFilters((Integer)newValue);
				return;
			case SimpleNNPackage.CONV1_D__KERNEL_SIZE:
				setKernel_size((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SimpleNNPackage.CONV1_D__FILTERS:
				setFilters(FILTERS_EDEFAULT);
				return;
			case SimpleNNPackage.CONV1_D__KERNEL_SIZE:
				setKernel_size(KERNEL_SIZE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SimpleNNPackage.CONV1_D__FILTERS:
				return filters != FILTERS_EDEFAULT;
			case SimpleNNPackage.CONV1_D__KERNEL_SIZE:
				return kernel_size != KERNEL_SIZE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (filters: "); //$NON-NLS-1$
		result.append(filters);
		result.append(", kernel_size: "); //$NON-NLS-1$
		result.append(kernel_size);
		result.append(')');
		return result.toString();
	}

} //Conv1DImpl
