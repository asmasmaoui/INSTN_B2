/*****************************************************************************
 * Copyright (c) 2020 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *  Ansgar Radermacher
 *
 *****************************************************************************/
package org.eclipse.papyrus.simplenn.profile;

import org.eclipse.emf.common.util.URI;

/**
 * Utility class to get informations about NN profile resources
 */
public final class NNProfileResource {

	public static final String PROFILE_PATHMAP = "pathmap://NN_PROFILES/"; //$NON-NLS-1$

	public static final String PROFILE_PATH = PROFILE_PATHMAP + "SimpleNN.profile.uml"; //$NON-NLS-1$

	public static final URI PROFILE_PATH_URI = URI.createURI(PROFILE_PATH);

	public static final String PROFILE_URI = "http://www.eclipse.org/papyrus/SimpleNNL/1"; //$NON-NLS-1$
}
