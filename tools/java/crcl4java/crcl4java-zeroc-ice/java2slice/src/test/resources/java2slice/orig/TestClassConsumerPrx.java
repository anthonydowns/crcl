// **********************************************************************
//
// Copyright (c) 2003-2016 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.6.2
//
// <auto-generated>
//
// Generated from file `foo.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package java2slice.orig;

public interface TestClassConsumerPrx extends Ice.ObjectPrx
{
    public void accept(TestClassIce t);

    public void accept(TestClassIce t, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_accept(TestClassIce t);

    public Ice.AsyncResult begin_accept(TestClassIce t, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_accept(TestClassIce t, Ice.Callback __cb);

    public Ice.AsyncResult begin_accept(TestClassIce t, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_accept(TestClassIce t, Callback_TestClassConsumer_accept __cb);

    public Ice.AsyncResult begin_accept(TestClassIce t, java.util.Map<String, String> __ctx, Callback_TestClassConsumer_accept __cb);

    public Ice.AsyncResult begin_accept(TestClassIce t, 
                                        IceInternal.Functional_VoidCallback __responseCb, 
                                        IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_accept(TestClassIce t, 
                                        IceInternal.Functional_VoidCallback __responseCb, 
                                        IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                        IceInternal.Functional_BoolCallback __sentCb);

    public Ice.AsyncResult begin_accept(TestClassIce t, 
                                        java.util.Map<String, String> __ctx, 
                                        IceInternal.Functional_VoidCallback __responseCb, 
                                        IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_accept(TestClassIce t, 
                                        java.util.Map<String, String> __ctx, 
                                        IceInternal.Functional_VoidCallback __responseCb, 
                                        IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                        IceInternal.Functional_BoolCallback __sentCb);

    public void end_accept(Ice.AsyncResult __result);
}