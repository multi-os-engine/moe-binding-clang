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

package org.clang.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ann.UncertainReturn;

@Generated
@Structure()
public final class CXCodeCompleteResults extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public CXCodeCompleteResults() {
        super(CXCodeCompleteResults.class);
    }

    @Generated
    protected CXCodeCompleteResults(Pointer peer) {
        super(peer);
    }

    @Generated
    public CXCodeCompleteResults(
            @UncertainArgument("Options: reference, array Fallback: reference") CXCompletionResult Results,
            int NumResults) {
        super(CXCodeCompleteResults.class);
        setResults(Results);
        setNumResults(NumResults);
    }

    /**
     * The code-completion results.
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    @UncertainReturn("Options: reference, array Fallback: reference")
    public native CXCompletionResult Results();

    /**
     * The code-completion results.
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setResults(
            @UncertainArgument("Options: reference, array Fallback: reference") CXCompletionResult value);

    /**
     * The number of code-completion results stored in the
     * \c Results array.
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int NumResults();

    /**
     * The number of code-completion results stored in the
     * \c Results array.
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setNumResults(int value);
}
