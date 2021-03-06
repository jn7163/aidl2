package net.sf.aidl2.internal;

import com.squareup.javapoet.NameAllocator;

import javax.lang.model.type.TypeMirror;

class State implements Cloneable {
    private final net.sf.aidl2.internal.AidlProcessor.Environment environment;

    NameAllocator allocator;
    boolean external;
    boolean allowUnchecked;
    boolean nullable = true;
    boolean returnValue;
    TypeMirror type;
    CharSequence name;

    public State(AidlProcessor.Environment environment, NameAllocator allocator) {
        this.environment = environment;
        this.allocator = allocator;
    }

    public State allowUnchecked(boolean allowUnchecked) {
        this.allowUnchecked = allowUnchecked;
        return this;
    }

    public State setParameter(AidlParamModel param) {
        this.returnValue = param.isReturn();
        this.name = param.name == null ? "returnValue" : allocator.get(param);
        this.type = param.type;
        this.nullable = param.nullable;
        return this;
    }

    public State external(boolean external) {
        this.external = external;
        return this;
    }

    @Override
    @SuppressWarnings("all")
    public State clone() {
        try {
            State state = (State) super.clone();

            state.allocator = allocator.clone();

            return state;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public Reader buildReader(String name) {
        return new Reader(environment, this, name);
    }

    public Writer buildWriter(String name) {
        return new Writer(environment, this, name);
    }
}
