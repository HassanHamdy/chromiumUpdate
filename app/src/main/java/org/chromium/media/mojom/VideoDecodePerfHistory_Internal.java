
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     media/mojo/interfaces/video_decode_perf_history.mojom
//

package org.chromium.media.mojom;

import org.chromium.mojo.bindings.DeserializationException;


class VideoDecodePerfHistory_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<VideoDecodePerfHistory, VideoDecodePerfHistory.Proxy> MANAGER =
            new org.chromium.mojo.bindings.Interface.Manager<VideoDecodePerfHistory, VideoDecodePerfHistory.Proxy>() {
    
        @Override
        public String getName() {
            return "media::mojom::VideoDecodePerfHistory";
        }
    
        @Override
        public int getVersion() {
          return 0;
        }
    
        @Override
        public Proxy buildProxy(org.chromium.mojo.system.Core core,
                                org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }
    
        @Override
        public Stub buildStub(org.chromium.mojo.system.Core core, VideoDecodePerfHistory impl) {
            return new Stub(core, impl);
        }
    
        @Override
        public VideoDecodePerfHistory[] buildArray(int size) {
          return new VideoDecodePerfHistory[size];
        }
    };


    private static final int GET_PERF_INFO_ORDINAL = 0;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements VideoDecodePerfHistory.Proxy {

        Proxy(org.chromium.mojo.system.Core core,
              org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void getPerfInfo(
int profile, org.chromium.gfx.mojom.Size videoSize, int framesPerSec, 
GetPerfInfoResponse callback) {

            VideoDecodePerfHistoryGetPerfInfoParams _message = new VideoDecodePerfHistoryGetPerfInfoParams();

            _message.profile = profile;

            _message.videoSize = videoSize;

            _message.framesPerSec = framesPerSec;


            getProxyHandler().getMessageReceiver().acceptWithResponder(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(
                                    GET_PERF_INFO_ORDINAL,
                                    org.chromium.mojo.bindings.MessageHeader.MESSAGE_EXPECTS_RESPONSE_FLAG,
                                    0)),
                    new VideoDecodePerfHistoryGetPerfInfoResponseParamsForwardToCallback(callback));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<VideoDecodePerfHistory> {

        Stub(org.chromium.mojo.system.Core core, VideoDecodePerfHistory impl) {
            super(core, impl);
        }

        @Override
        public boolean accept(org.chromium.mojo.bindings.Message message) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(org.chromium.mojo.bindings.MessageHeader.NO_FLAG)) {
                    return false;
                }
                switch(header.getType()) {
            
                    case org.chromium.mojo.bindings.interfacecontrol.InterfaceControlMessagesConstants.RUN_OR_CLOSE_PIPE_MESSAGE_ID:
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRunOrClosePipe(
                                VideoDecodePerfHistory_Internal.MANAGER, messageWithHeader);
            
            
            
            
                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }

        @Override
        public boolean acceptWithResponder(org.chromium.mojo.bindings.Message message, org.chromium.mojo.bindings.MessageReceiver receiver) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(org.chromium.mojo.bindings.MessageHeader.MESSAGE_EXPECTS_RESPONSE_FLAG)) {
                    return false;
                }
                switch(header.getType()) {
            
                    case org.chromium.mojo.bindings.interfacecontrol.InterfaceControlMessagesConstants.RUN_MESSAGE_ID:
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRun(
                                getCore(), VideoDecodePerfHistory_Internal.MANAGER, messageWithHeader, receiver);
            
            
            
            
            
            
            
                    case GET_PERF_INFO_ORDINAL: {
            
                        VideoDecodePerfHistoryGetPerfInfoParams data =
                                VideoDecodePerfHistoryGetPerfInfoParams.deserialize(messageWithHeader.getPayload());
            
                        getImpl().getPerfInfo(data.profile, data.videoSize, data.framesPerSec, new VideoDecodePerfHistoryGetPerfInfoResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    }
            
            
                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }
    }


    
    static final class VideoDecodePerfHistoryGetPerfInfoParams extends org.chromium.mojo.bindings.Struct {
    
        private static final int STRUCT_SIZE = 24;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(24, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public int profile;
        public org.chromium.gfx.mojom.Size videoSize;
        public int framesPerSec;
    
        private VideoDecodePerfHistoryGetPerfInfoParams(int version) {
            super(STRUCT_SIZE, version);
        }
    
        public VideoDecodePerfHistoryGetPerfInfoParams() {
            this(0);
        }
    
        public static VideoDecodePerfHistoryGetPerfInfoParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }
    
        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static VideoDecodePerfHistoryGetPerfInfoParams deserialize(java.nio.ByteBuffer data) {
            if (data == null)
                return null;
    
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }
    
        @SuppressWarnings("unchecked")
        public static VideoDecodePerfHistoryGetPerfInfoParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            VideoDecodePerfHistoryGetPerfInfoParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                result = new VideoDecodePerfHistoryGetPerfInfoParams(mainDataHeader.elementsOrVersion);
                if (mainDataHeader.elementsOrVersion >= 0) {
                    
                    result.profile = decoder0.readInt(8);
                        VideoCodecProfile.validate(result.profile);
                }
                if (mainDataHeader.elementsOrVersion >= 0) {
                    
                    result.framesPerSec = decoder0.readInt(12);
                }
                if (mainDataHeader.elementsOrVersion >= 0) {
                    
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, false);
                    result.videoSize = org.chromium.gfx.mojom.Size.decode(decoder1);
                }
            } finally {
                decoder0.decreaseStackDepth();
            }
            return result;
        }
    
        @SuppressWarnings("unchecked")
        @Override
        protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
            org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            
            encoder0.encode(this.profile, 8);
            
            encoder0.encode(this.framesPerSec, 12);
            
            encoder0.encode(this.videoSize, 16, false);
        }
    
        /**
         * @see Object#equals(Object)
         */
        @Override
        public boolean equals(Object object) {
            if (object == this)
                return true;
            if (object == null)
                return false;
            if (getClass() != object.getClass())
                return false;
            VideoDecodePerfHistoryGetPerfInfoParams other = (VideoDecodePerfHistoryGetPerfInfoParams) object;
            if (this.profile!= other.profile)
                return false;
            if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.videoSize, other.videoSize))
                return false;
            if (this.framesPerSec!= other.framesPerSec)
                return false;
            return true;
        }
    
        /**
         * @see Object#hashCode()
         */
        @Override
        public int hashCode() {
            final int prime = 31;
            int result = prime + getClass().hashCode();
            result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.profile);
            result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.videoSize);
            result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.framesPerSec);
            return result;
        }
    }



    
    static final class VideoDecodePerfHistoryGetPerfInfoResponseParams extends org.chromium.mojo.bindings.Struct {
    
        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public boolean isSmooth;
        public boolean isPowerEfficient;
    
        private VideoDecodePerfHistoryGetPerfInfoResponseParams(int version) {
            super(STRUCT_SIZE, version);
        }
    
        public VideoDecodePerfHistoryGetPerfInfoResponseParams() {
            this(0);
        }
    
        public static VideoDecodePerfHistoryGetPerfInfoResponseParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }
    
        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static VideoDecodePerfHistoryGetPerfInfoResponseParams deserialize(java.nio.ByteBuffer data) {
            if (data == null)
                return null;
    
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }
    
        @SuppressWarnings("unchecked")
        public static VideoDecodePerfHistoryGetPerfInfoResponseParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            VideoDecodePerfHistoryGetPerfInfoResponseParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                result = new VideoDecodePerfHistoryGetPerfInfoResponseParams(mainDataHeader.elementsOrVersion);
                if (mainDataHeader.elementsOrVersion >= 0) {
                    
                    result.isSmooth = decoder0.readBoolean(8, 0);
                }
                if (mainDataHeader.elementsOrVersion >= 0) {
                    
                    result.isPowerEfficient = decoder0.readBoolean(8, 1);
                }
            } finally {
                decoder0.decreaseStackDepth();
            }
            return result;
        }
    
        @SuppressWarnings("unchecked")
        @Override
        protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
            org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            
            encoder0.encode(this.isSmooth, 8, 0);
            
            encoder0.encode(this.isPowerEfficient, 8, 1);
        }
    
        /**
         * @see Object#equals(Object)
         */
        @Override
        public boolean equals(Object object) {
            if (object == this)
                return true;
            if (object == null)
                return false;
            if (getClass() != object.getClass())
                return false;
            VideoDecodePerfHistoryGetPerfInfoResponseParams other = (VideoDecodePerfHistoryGetPerfInfoResponseParams) object;
            if (this.isSmooth!= other.isSmooth)
                return false;
            if (this.isPowerEfficient!= other.isPowerEfficient)
                return false;
            return true;
        }
    
        /**
         * @see Object#hashCode()
         */
        @Override
        public int hashCode() {
            final int prime = 31;
            int result = prime + getClass().hashCode();
            result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.isSmooth);
            result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.isPowerEfficient);
            return result;
        }
    }

    static class VideoDecodePerfHistoryGetPerfInfoResponseParamsForwardToCallback extends org.chromium.mojo.bindings.SideEffectFreeCloseable
            implements org.chromium.mojo.bindings.MessageReceiver {
        private final VideoDecodePerfHistory.GetPerfInfoResponse mCallback;

        VideoDecodePerfHistoryGetPerfInfoResponseParamsForwardToCallback(VideoDecodePerfHistory.GetPerfInfoResponse callback) {
            this.mCallback = callback;
        }

        @Override
        public boolean accept(org.chromium.mojo.bindings.Message message) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(GET_PERF_INFO_ORDINAL,
                                           org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG)) {
                    return false;
                }

                VideoDecodePerfHistoryGetPerfInfoResponseParams response = VideoDecodePerfHistoryGetPerfInfoResponseParams.deserialize(messageWithHeader.getPayload());

                mCallback.call(response.isSmooth, response.isPowerEfficient);
                return true;
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                return false;
            }
        }
    }

    static class VideoDecodePerfHistoryGetPerfInfoResponseParamsProxyToResponder implements VideoDecodePerfHistory.GetPerfInfoResponse {

        private final org.chromium.mojo.system.Core mCore;
        private final org.chromium.mojo.bindings.MessageReceiver mMessageReceiver;
        private final long mRequestId;

        VideoDecodePerfHistoryGetPerfInfoResponseParamsProxyToResponder(
                org.chromium.mojo.system.Core core,
                org.chromium.mojo.bindings.MessageReceiver messageReceiver,
                long requestId) {
            mCore = core;
            mMessageReceiver = messageReceiver;
            mRequestId = requestId;
        }

        @Override
        public void call(Boolean isSmooth, Boolean isPowerEfficient) {
            VideoDecodePerfHistoryGetPerfInfoResponseParams _response = new VideoDecodePerfHistoryGetPerfInfoResponseParams();

            _response.isSmooth = isSmooth;

            _response.isPowerEfficient = isPowerEfficient;

            org.chromium.mojo.bindings.ServiceMessage _message =
                    _response.serializeWithHeader(
                            mCore,
                            new org.chromium.mojo.bindings.MessageHeader(
                                    GET_PERF_INFO_ORDINAL,
                                    org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG,
                                    mRequestId));
            mMessageReceiver.accept(_message);
        }
    }



}