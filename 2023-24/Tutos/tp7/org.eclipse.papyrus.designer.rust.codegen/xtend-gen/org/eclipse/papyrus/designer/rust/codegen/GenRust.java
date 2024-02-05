/**
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
 */
package org.eclipse.papyrus.designer.rust.codegen;

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class GenRust {
  /**
   * Simple rust code generator
   */
  public static CharSequence genClass(final org.eclipse.uml2.uml.Class clazz) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("struct ");
    String _name = clazz.getName();
    _builder.append(_name);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("...");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
