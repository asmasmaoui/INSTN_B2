/**
 */
package org.eclipse.papyrus.simplenn.profile.SimpleNN.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.papyrus.simplenn.profile.SimpleNN.EActivationFCT;
import org.eclipse.papyrus.simplenn.profile.SimpleNN.LSTM;
import org.eclipse.papyrus.simplenn.profile.SimpleNN.SimpleNNPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LSTM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.simplenn.profile.SimpleNN.impl.LSTMImpl#isUseBias <em>Use Bias</em>}</li>
 *   <li>{@link org.eclipse.papyrus.simplenn.profile.SimpleNN.impl.LSTMImpl#getActivationFct <em>Activation Fct</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LSTMImpl extends LayerImpl implements LSTM {
	/**
	 * The default value of the '{@link #isUseBias() <em>Use Bias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseBias()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_BIAS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUseBias() <em>Use Bias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseBias()
	 * @generated
	 * @ordered
	 */
	protected boolean useBias = USE_BIAS_EDEFAULT;

	/**
	 * The default value of the '{@link #getActivationFct() <em>Activation Fct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivationFct()
	 * @generated
	 * @ordered
	 */
	protected static final EActivationFCT ACTIVATION_FCT_EDEFAULT = EActivationFCT.TANH;

	/**
	 * The cached value of the '{@link #getActivationFct() <em>Activation Fct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivationFct()
	 * @generated
	 * @ordered
	 */
	protected EActivationFCT activationFct = ACTIVATION_FCT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LSTMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimpleNNPackage.Literals.LSTM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUseBias() {
		return useBias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseBias(boolean newUseBias) {
		boolean oldUseBias = useBias;
		useBias = newUseBias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleNNPackage.LSTM__USE_BIAS, oldUseBias, useBias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EActivationFCT getActivationFct() {
		return activationFct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActivationFct(EActivationFCT newActivationFct) {
		EActivationFCT oldActivationFct = activationFct;
		activationFct = newActivationFct == null ? ACTIVATION_FCT_EDEFAULT : newActivationFct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleNNPackage.LSTM__ACTIVATION_FCT, oldActivationFct, activationFct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimpleNNPackage.LSTM__USE_BIAS:
				return isUseBias();
			case SimpleNNPackage.LSTM__ACTIVATION_FCT:
				return getActivationFct();
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
			case SimpleNNPackage.LSTM__USE_BIAS:
				setUseBias((Boolean)newValue);
				return;
			case SimpleNNPackage.LSTM__ACTIVATION_FCT:
				setActivationFct((EActivationFCT)newValue);
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
			case SimpleNNPackage.LSTM__USE_BIAS:
				setUseBias(USE_BIAS_EDEFAULT);
				return;
			case SimpleNNPackage.LSTM__ACTIVATION_FCT:
				setActivationFct(ACTIVATION_FCT_EDEFAULT);
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
			case SimpleNNPackage.LSTM__USE_BIAS:
				return useBias != USE_BIAS_EDEFAULT;
			case SimpleNNPackage.LSTM__ACTIVATION_FCT:
				return activationFct != ACTIVATION_FCT_EDEFAULT;
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
		result.append(" (useBias: "); //$NON-NLS-1$
		result.append(useBias);
		result.append(", activationFct: "); //$NON-NLS-1$
		result.append(activationFct);
		result.append(')');
		return result.toString();
	}

} //LSTMImpl
