/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.39
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.doubango.tinyWRAP;

public class MsrpSession extends InviteSession {
  private long swigCPtr;

  protected MsrpSession(long cPtr, boolean cMemoryOwn) {
    super(tinyWRAPJNI.SWIGMsrpSessionUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MsrpSession obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      tinyWRAPJNI.delete_MsrpSession(swigCPtr);
    }
    swigCPtr = 0;
    super.delete();
  }

  public MsrpSession(SipStack Stack, MsrpCallback callback) {
    this(tinyWRAPJNI.new_MsrpSession(SipStack.getCPtr(Stack), Stack, MsrpCallback.getCPtr(callback), callback), true);
  }

  public boolean setCallback(MsrpCallback callback) {
    return tinyWRAPJNI.MsrpSession_setCallback(swigCPtr, this, MsrpCallback.getCPtr(callback), callback);
  }

  public boolean callMsrp(String remoteUri, ActionConfig config) {
    return tinyWRAPJNI.MsrpSession_callMsrp__SWIG_0(swigCPtr, this, remoteUri, ActionConfig.getCPtr(config), config);
  }

  public boolean callMsrp(String remoteUri) {
    return tinyWRAPJNI.MsrpSession_callMsrp__SWIG_1(swigCPtr, this, remoteUri);
  }

  public boolean sendLMessage(ActionConfig config) {
    return tinyWRAPJNI.MsrpSession_sendLMessage__SWIG_0(swigCPtr, this, ActionConfig.getCPtr(config), config);
  }

  public boolean sendLMessage() {
    return tinyWRAPJNI.MsrpSession_sendLMessage__SWIG_1(swigCPtr, this);
  }

  public boolean sendFile(ActionConfig config) {
    return tinyWRAPJNI.MsrpSession_sendFile__SWIG_0(swigCPtr, this, ActionConfig.getCPtr(config), config);
  }

  public boolean sendFile() {
    return tinyWRAPJNI.MsrpSession_sendFile__SWIG_1(swigCPtr, this);
  }

}
