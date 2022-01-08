/*
 * Copyright 2004-2010 the Seasar Foundation and the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.seasar.doma.internal.apt.type;

import javax.lang.model.element.TypeElement;
import javax.lang.model.type.TypeMirror;

/**
 * @author taedium
 * 
 */
public interface DataType {

    TypeMirror getTypeMirror();

    TypeElement getTypeElement();

    String getTypeName();

    String getTypeNameAsTypeParameter();

    String getMetaTypeName();

    String getMetaTypeNameAsTypeParameter();

    String getQualifiedName();

    String getPackageName();

    String getPackageExcludedBinaryName();

    boolean isPrimitive();

    boolean isEnum();

    <R, P, TH extends Throwable> R accept(DataTypeVisitor<R, P, TH> visitor, P p)
            throws TH;
}
