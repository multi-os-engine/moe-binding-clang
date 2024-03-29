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
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure()
public final class CXTUResourceUsage extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public CXTUResourceUsage() {
        super(CXTUResourceUsage.class);
    }

    @Generated
    protected CXTUResourceUsage(Pointer peer) {
        super(peer);
    }

    @Generated
    public CXTUResourceUsage(VoidPtr data, int numEntries,
            @UncertainArgument("Options: reference, array Fallback: reference") CXTUResourceUsageEntry entries) {
        super(CXTUResourceUsage.class);
        setData(data);
        setNumEntries(numEntries);
        setEntries(entries);
    }

    /**
     * Private data member, used for queries.
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native VoidPtr data();

    /**
     * Private data member, used for queries.
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setData(VoidPtr value);

    /**
     * The number of entries in the 'entries' array.
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int numEntries();

    /**
     * The number of entries in the 'entries' array.
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setNumEntries(int value);

    /**
     * An array of key-value pairs, representing the breakdown of memory
     * usage.
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    @UncertainReturn("Options: reference, array Fallback: reference")
    public native CXTUResourceUsageEntry entries();

    /**
     * An array of key-value pairs, representing the breakdown of memory
     * usage.
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setEntries(
            @UncertainArgument("Options: reference, array Fallback: reference") CXTUResourceUsageEntry value);
}
