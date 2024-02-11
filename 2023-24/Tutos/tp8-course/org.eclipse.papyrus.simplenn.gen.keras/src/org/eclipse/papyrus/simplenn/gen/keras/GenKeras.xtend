/*******************************************************************************
 * Copyright (c) 2020 CEA LIST
 * 
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse License 2.0 which
 * accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Abhishek Djeachandrane - Initial API and implementation
 *******************************************************************************/

package org.eclipse.papyrus.simplenn.gen.keras;

import org.eclipse.uml2.uml.Class;
import static extension org.eclipse.uml2.uml.util.UMLUtil.getStereotypeApplication

import org.eclipse.papyrus.simplenn.profile.SimpleNN.NeuralNetwork
import org.eclipse.papyrus.simplenn.profile.SimpleNN.Layer
import org.eclipse.papyrus.simplenn.profile.SimpleNN.LSTM
import org.eclipse.papyrus.simplenn.profile.SimpleNN.Conv1D
import org.eclipse.uml2.uml.UMLPackage
import org.eclipse.uml2.uml.InformationFlow
import org.eclipse.uml2.uml.NamedElement
import java.util.List
import java.util.ArrayList

class GenKeras {
	static def genKeras(Class clazz) {
		val module = clazz.getStereotypeApplication(NeuralNetwork)
		if (module !== null) {
			return module.genModule
		} else {
			return "";
		}
	}

	/**
	 * Generate a model with different elements necessary for the compilation 
	 */
	static def genModule(NeuralNetwork module) '''
		import tensorflow as tf
		from tensorflow import keras
		
		class «module.base_Class.name»(tf.keras.Model):
		    ...
			
		testModule = NeuralNetwork()
««« Improve code (replace fixed name NeuralNetwork)
		testModule.compile(name="NeuralNetwork")
	'''

	static def List<NamedElement> getFlows(NamedElement start) {
		val flows = new ArrayList<NamedElement>
		var element = start.getFlow
		while (element !== null && element != start) {
			flows.add(element)
			element = element.getFlow
		}
		return flows
	}
	
	static def getFlow(NamedElement element) {
		for (flow : element.getSourceDirectedRelationships(UMLPackage.eINSTANCE.informationFlow)) {
			return (flow as InformationFlow).targets.get(0) as NamedElement
		}
		return null
	}
	/**
	 * Generate each layer according to the model
	 */
	static def genLayer(Layer layer) {
		// call genLstm or genConvolutionLayer depending on layer type
		if (layer instanceof Conv1D) {
			layer.genConvolutionLayer
		}
		else if (layer instanceof LSTM) {
			layer.genLstm
		}
	}

	/**
	 * Generate each convolution layer according to the model
	 */
	static def genConvolutionLayer(Conv1D conv1d) '''
		tf.keras.layers.Conv1D(«conv1d.filters», «conv1d.kernel_size»);
	'''

	/**
	 * Generate each LSTM layer according to the model
	 */
	static def genLstm(LSTM lstm) '''
		tf.keras.layers.LSTM(«lstm.useBias», «lstm.activationFct»);
	'''
}
