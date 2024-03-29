/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package org.clang.enums;

import org.moe.natj.general.ann.Generated;

/**
 * Extra C++ template information for an entity. This can apply to:
 * CXIdxEntity_Function
 * CXIdxEntity_CXXClass
 * CXIdxEntity_CXXStaticMethod
 * CXIdxEntity_CXXInstanceMethod
 * CXIdxEntity_CXXConstructor
 * CXIdxEntity_CXXConversionFunction
 * CXIdxEntity_CXXTypeAlias
 */
@Generated
public final class CXIdxEntityCXXTemplateKind {
    @Generated public static final int CXIdxEntity_NonTemplate = 0x00000000;
    @Generated public static final int CXIdxEntity_Template = 0x00000001;
    @Generated public static final int CXIdxEntity_TemplatePartialSpecialization = 0x00000002;
    @Generated public static final int CXIdxEntity_TemplateSpecialization = 0x00000003;

    @Generated
    private CXIdxEntityCXXTemplateKind() {
    }
}
