/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.tencent;

public class ITRTCCloud {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected ITRTCCloud(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ITRTCCloud obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        trtcenginewarperJNI.delete_ITRTCCloud(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setCallback(ITRTCCloudCallback callback) {
    trtcenginewarperJNI.ITRTCCloud_setCallback(swigCPtr, this, ITRTCCloudCallback.getCPtr(callback), callback);
  }

  public void enterRoom(TRTCParams params, TRTCAppScene scene) {
    trtcenginewarperJNI.ITRTCCloud_enterRoom(swigCPtr, this, TRTCParams.getCPtr(params), params, scene.swigValue());
  }

  public void exitRoom() {
    trtcenginewarperJNI.ITRTCCloud_exitRoom(swigCPtr, this);
  }

  public void setVideoEncoderParam(TRTCVideoEncParam params) {
    trtcenginewarperJNI.ITRTCCloud_setVideoEncoderParam(swigCPtr, this, TRTCVideoEncParam.getCPtr(params), params);
  }

  public int setRemoteVideoRecvCallback(String userId, TRTCVideoFrameFormat videoFormat, ITRTCVideoRecvCallback callback) {
    return trtcenginewarperJNI.ITRTCCloud_setRemoteVideoRecvCallback(swigCPtr, this, userId, videoFormat.swigValue(), ITRTCVideoRecvCallback.getCPtr(callback), callback);
  }

  public int setRemoteAudioRecvCallback(String userId, TRTCAudioFrameFormat audioFormat, ITRTCAudioRecvCallback callback) {
    return trtcenginewarperJNI.ITRTCCloud_setRemoteAudioRecvCallback(swigCPtr, this, userId, audioFormat.swigValue(), ITRTCAudioRecvCallback.getCPtr(callback), callback);
  }

  public int setRemoteSmallStreamRecvCallback(String userId, TRTCVideoFrameFormat videoFormat, ITRTCVideoRecvCallback callback) {
    return trtcenginewarperJNI.ITRTCCloud_setRemoteSmallStreamRecvCallback(swigCPtr, this, userId, videoFormat.swigValue(), ITRTCVideoRecvCallback.getCPtr(callback), callback);
  }

  public int setRemoteSubStreamRecvCallback(String userId, TRTCVideoFrameFormat videoFormat, ITRTCVideoRecvCallback callback) {
    return trtcenginewarperJNI.ITRTCCloud_setRemoteSubStreamRecvCallback(swigCPtr, this, userId, videoFormat.swigValue(), ITRTCVideoRecvCallback.getCPtr(callback), callback);
  }

  public int sendCustomVideoData(TRTCVideoFrame frame) {
    return trtcenginewarperJNI.ITRTCCloud_sendCustomVideoData(swigCPtr, this, TRTCVideoFrame.getCPtr(frame), frame);
  }

  public int sendCustomAudioData(TRTCAudioFrame frame) {
    return trtcenginewarperJNI.ITRTCCloud_sendCustomAudioData(swigCPtr, this, TRTCAudioFrame.getCPtr(frame), frame);
  }

  public boolean sendSEIMsg(SWIGTYPE_p_unsigned_char data, int datalen, int repeatcount) {
    return trtcenginewarperJNI.ITRTCCloud_sendSEIMsg(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(data), datalen, repeatcount);
  }

  public boolean sendCustomCmdMsg(long cmdId, SWIGTYPE_p_unsigned_char msg, int msglen, boolean reliable, boolean ordered) {
    return trtcenginewarperJNI.ITRTCCloud_sendCustomCmdMsg(swigCPtr, this, cmdId, SWIGTYPE_p_unsigned_char.getCPtr(msg), msglen, reliable, ordered);
  }

  public void setAuxVideoEncoderParam(TRTCVideoEncParam params) {
    trtcenginewarperJNI.ITRTCCloud_setAuxVideoEncoderParam(swigCPtr, this, TRTCVideoEncParam.getCPtr(params), params);
  }

  public int sendAuxVideoData(TRTCVideoFrame frame) {
    return trtcenginewarperJNI.ITRTCCloud_sendAuxVideoData(swigCPtr, this, TRTCVideoFrame.getCPtr(frame), frame);
  }

  public void setEncryptionCallback(ITRTCEncryptionCallback callback) {
    trtcenginewarperJNI.ITRTCCloud_setEncryptionCallback(swigCPtr, this, ITRTCEncryptionCallback.getCPtr(callback), callback);
  }

  public void setDecryptionCallback(ITRTCDecryptionCallback callback) {
    trtcenginewarperJNI.ITRTCCloud_setDecryptionCallback(swigCPtr, this, ITRTCDecryptionCallback.getCPtr(callback), callback);
  }

}