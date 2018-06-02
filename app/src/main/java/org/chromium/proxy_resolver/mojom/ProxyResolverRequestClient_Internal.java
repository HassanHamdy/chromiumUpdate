
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/proxy_resolver/public/mojom/proxy_resolver.mojom
//

package org.chromium.proxy_resolver.mojom;

import org.chromium.mojo.bindings.DeserializationException;


class ProxyResolverRequestClient_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<ProxyResolverRequestClient, ProxyResolverRequestClient.Proxy> MANAGER =
            new org.chromium.mojo.bindings.Interface.Manager<ProxyResolverRequestClient, ProxyResolverRequestClient.Proxy>() {
    
        @Override
        public String getName() {
            return "proxy_resolver::mojom::ProxyResolverRequestClient";
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
        public Stub buildStub(org.chromium.mojo.system.Core core, ProxyResolverRequestClient impl) {
            return new Stub(core, impl);
        }
    
        @Override
        public ProxyResolverRequestClient[] buildArray(int size) {
          return new ProxyResolverRequestClient[size];
        }
    };


    private static final int REPORT_RESULT_ORDINAL = 0;

    private static final int ALERT_ORDINAL = 1;

    private static final int ON_ERROR_ORDINAL = 2;

    private static final int RESOLVE_DNS_ORDINAL = 3;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements ProxyResolverRequestClient.Proxy {

        Proxy(org.chromium.mojo.system.Core core,
              org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void reportResult(
int error, ProxyInfo proxyInfo) {

            ProxyResolverRequestClientReportResultParams _message = new ProxyResolverRequestClientReportResultParams();

            _message.error = error;

            _message.proxyInfo = proxyInfo;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(REPORT_RESULT_ORDINAL)));

        }


        @Override
        public void alert(
String error) {

            ProxyResolverRequestClientAlertParams _message = new ProxyResolverRequestClientAlertParams();

            _message.error = error;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(ALERT_ORDINAL)));

        }


        @Override
        public void onError(
int lineNumber, String error) {

            ProxyResolverRequestClientOnErrorParams _message = new ProxyResolverRequestClientOnErrorParams();

            _message.lineNumber = lineNumber;

            _message.error = error;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(ON_ERROR_ORDINAL)));

        }


        @Override
        public void resolveDns(
org.chromium.net.interfaces.HostResolverRequestInfo requestInfo, org.chromium.net.interfaces.HostResolverRequestClient client) {

            ProxyResolverRequestClientResolveDnsParams _message = new ProxyResolverRequestClientResolveDnsParams();

            _message.requestInfo = requestInfo;

            _message.client = client;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(RESOLVE_DNS_ORDINAL)));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<ProxyResolverRequestClient> {

        Stub(org.chromium.mojo.system.Core core, ProxyResolverRequestClient impl) {
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
                                ProxyResolverRequestClient_Internal.MANAGER, messageWithHeader);
            
            
            
            
            
                    case REPORT_RESULT_ORDINAL: {
            
                        ProxyResolverRequestClientReportResultParams data =
                                ProxyResolverRequestClientReportResultParams.deserialize(messageWithHeader.getPayload());
            
                        getImpl().reportResult(data.error, data.proxyInfo);
                        return true;
                    }
            
            
            
            
            
                    case ALERT_ORDINAL: {
            
                        ProxyResolverRequestClientAlertParams data =
                                ProxyResolverRequestClientAlertParams.deserialize(messageWithHeader.getPayload());
            
                        getImpl().alert(data.error);
                        return true;
                    }
            
            
            
            
            
                    case ON_ERROR_ORDINAL: {
            
                        ProxyResolverRequestClientOnErrorParams data =
                                ProxyResolverRequestClientOnErrorParams.deserialize(messageWithHeader.getPayload());
            
                        getImpl().onError(data.lineNumber, data.error);
                        return true;
                    }
            
            
            
            
            
                    case RESOLVE_DNS_ORDINAL: {
            
                        ProxyResolverRequestClientResolveDnsParams data =
                                ProxyResolverRequestClientResolveDnsParams.deserialize(messageWithHeader.getPayload());
            
                        getImpl().resolveDns(data.requestInfo, data.client);
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
                                getCore(), ProxyResolverRequestClient_Internal.MANAGER, messageWithHeader, receiver);
            
            
            
            
            
            
            
            
            
            
                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }
    }


    
    static final class ProxyResolverRequestClientReportResultParams extends org.chromium.mojo.bindings.Struct {
    
        private static final int STRUCT_SIZE = 24;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(24, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public int error;
        public ProxyInfo proxyInfo;
    
        private ProxyResolverRequestClientReportResultParams(int version) {
            super(STRUCT_SIZE, version);
        }
    
        public ProxyResolverRequestClientReportResultParams() {
            this(0);
        }
    
        public static ProxyResolverRequestClientReportResultParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }
    
        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static ProxyResolverRequestClientReportResultParams deserialize(java.nio.ByteBuffer data) {
            if (data == null)
                return null;
    
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }
    
        @SuppressWarnings("unchecked")
        public static ProxyResolverRequestClientReportResultParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            ProxyResolverRequestClientReportResultParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                result = new ProxyResolverRequestClientReportResultParams(mainDataHeader.elementsOrVersion);
                if (mainDataHeader.elementsOrVersion >= 0) {
                    
                    result.error = decoder0.readInt(8);
                }
                if (mainDataHeader.elementsOrVersion >= 0) {
                    
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, false);
                    result.proxyInfo = ProxyInfo.decode(decoder1);
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
            
            encoder0.encode(this.error, 8);
            
            encoder0.encode(this.proxyInfo, 16, false);
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
            ProxyResolverRequestClientReportResultParams other = (ProxyResolverRequestClientReportResultParams) object;
            if (this.error!= other.error)
                return false;
            if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.proxyInfo, other.proxyInfo))
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
            result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.error);
            result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.proxyInfo);
            return result;
        }
    }



    
    static final class ProxyResolverRequestClientAlertParams extends org.chromium.mojo.bindings.Struct {
    
        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public String error;
    
        private ProxyResolverRequestClientAlertParams(int version) {
            super(STRUCT_SIZE, version);
        }
    
        public ProxyResolverRequestClientAlertParams() {
            this(0);
        }
    
        public static ProxyResolverRequestClientAlertParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }
    
        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static ProxyResolverRequestClientAlertParams deserialize(java.nio.ByteBuffer data) {
            if (data == null)
                return null;
    
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }
    
        @SuppressWarnings("unchecked")
        public static ProxyResolverRequestClientAlertParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            ProxyResolverRequestClientAlertParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                result = new ProxyResolverRequestClientAlertParams(mainDataHeader.elementsOrVersion);
                if (mainDataHeader.elementsOrVersion >= 0) {
                    
                    result.error = decoder0.readString(8, false);
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
            
            encoder0.encode(this.error, 8, false);
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
            ProxyResolverRequestClientAlertParams other = (ProxyResolverRequestClientAlertParams) object;
            if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.error, other.error))
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
            result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.error);
            return result;
        }
    }



    
    static final class ProxyResolverRequestClientOnErrorParams extends org.chromium.mojo.bindings.Struct {
    
        private static final int STRUCT_SIZE = 24;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(24, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public int lineNumber;
        public String error;
    
        private ProxyResolverRequestClientOnErrorParams(int version) {
            super(STRUCT_SIZE, version);
        }
    
        public ProxyResolverRequestClientOnErrorParams() {
            this(0);
        }
    
        public static ProxyResolverRequestClientOnErrorParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }
    
        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static ProxyResolverRequestClientOnErrorParams deserialize(java.nio.ByteBuffer data) {
            if (data == null)
                return null;
    
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }
    
        @SuppressWarnings("unchecked")
        public static ProxyResolverRequestClientOnErrorParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            ProxyResolverRequestClientOnErrorParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                result = new ProxyResolverRequestClientOnErrorParams(mainDataHeader.elementsOrVersion);
                if (mainDataHeader.elementsOrVersion >= 0) {
                    
                    result.lineNumber = decoder0.readInt(8);
                }
                if (mainDataHeader.elementsOrVersion >= 0) {
                    
                    result.error = decoder0.readString(16, false);
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
            
            encoder0.encode(this.lineNumber, 8);
            
            encoder0.encode(this.error, 16, false);
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
            ProxyResolverRequestClientOnErrorParams other = (ProxyResolverRequestClientOnErrorParams) object;
            if (this.lineNumber!= other.lineNumber)
                return false;
            if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.error, other.error))
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
            result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.lineNumber);
            result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.error);
            return result;
        }
    }



    
    static final class ProxyResolverRequestClientResolveDnsParams extends org.chromium.mojo.bindings.Struct {
    
        private static final int STRUCT_SIZE = 24;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(24, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public org.chromium.net.interfaces.HostResolverRequestInfo requestInfo;
        public org.chromium.net.interfaces.HostResolverRequestClient client;
    
        private ProxyResolverRequestClientResolveDnsParams(int version) {
            super(STRUCT_SIZE, version);
        }
    
        public ProxyResolverRequestClientResolveDnsParams() {
            this(0);
        }
    
        public static ProxyResolverRequestClientResolveDnsParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }
    
        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static ProxyResolverRequestClientResolveDnsParams deserialize(java.nio.ByteBuffer data) {
            if (data == null)
                return null;
    
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }
    
        @SuppressWarnings("unchecked")
        public static ProxyResolverRequestClientResolveDnsParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            ProxyResolverRequestClientResolveDnsParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                result = new ProxyResolverRequestClientResolveDnsParams(mainDataHeader.elementsOrVersion);
                if (mainDataHeader.elementsOrVersion >= 0) {
                    
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.requestInfo = org.chromium.net.interfaces.HostResolverRequestInfo.decode(decoder1);
                }
                if (mainDataHeader.elementsOrVersion >= 0) {
                    
                    result.client = decoder0.readServiceInterface(16, false, org.chromium.net.interfaces.HostResolverRequestClient.MANAGER);
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
            
            encoder0.encode(this.requestInfo, 8, false);
            
            encoder0.encode(this.client, 16, false, org.chromium.net.interfaces.HostResolverRequestClient.MANAGER);
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
            ProxyResolverRequestClientResolveDnsParams other = (ProxyResolverRequestClientResolveDnsParams) object;
            if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.requestInfo, other.requestInfo))
                return false;
            if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.client, other.client))
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
            result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.requestInfo);
            result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.client);
            return result;
        }
    }



}
