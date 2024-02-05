/*******************************************************************************
 * Copyright (c) 2016 CEA LIST
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License 2.0 which
 * accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   Ansgar Radermacher - Initial API and implementation
 *******************************************************************************/

package org.eclipse.papyrus.simplenn.gen.keras.transformation;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.papyrus.designer.languages.common.base.HierarchyLocationStrategy;
import org.eclipse.papyrus.designer.languages.common.base.ModelElementsCreator;
import org.eclipse.papyrus.designer.languages.common.base.file.FileSystemAccessFactory;
import org.eclipse.papyrus.simplenn.gen.keras.GenKeras;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.PackageableElement;

public class KerasModelElementsCreator extends ModelElementsCreator {

	private static final String PYTHON_LANG = "Python"; //$NON-NLS-1$

	public KerasModelElementsCreator(IProject project) {
		this(project, PYTHON_LANG);
	}

	public KerasModelElementsCreator(IProject project, String language) {
		super(FileSystemAccessFactory.create(project), new HierarchyLocationStrategy(), language);
		this.project = project;
		pythonExt = "py"; //$NON-NLS-1$
	}

	protected String pythonExt;

	@Override
	protected boolean noCodeGen(Element element) {
		return false;
	}

	@Override
	protected void createPackageableElementFile(PackageableElement pe, IProgressMonitor monitor) {
		if (pe instanceof Classifier) {
			Classifier classifier = (Classifier) pe;
			final String fileName = locStrategy.getFileName(classifier) + "." + pythonExt; //$NON-NLS-1$
			String result = ""; //$NON-NLS-1$
			if (classifier instanceof Class) {
				result = GenKeras.genKeras((Class) classifier).toString();
				fileSystemAccess.generateFile(fileName, result);
			}
		}
	}
}
