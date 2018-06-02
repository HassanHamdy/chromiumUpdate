
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     media/mojo/interfaces/media_types.mojom
//

package org.chromium.media.mojom;

import org.chromium.mojo.bindings.DeserializationException;


public final class AudioDecoderConfig extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 56;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(56, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public int codec;
    public int sampleFormat;
    public int channelLayout;
    public int samplesPerSecond;
    public byte[] extraData;
    public org.chromium.mojo.common.mojom.TimeDelta seekPreroll;
    public int codecDelay;
    public EncryptionScheme encryptionScheme;

    private AudioDecoderConfig(int version) {
        super(STRUCT_SIZE, version);
    }

    public AudioDecoderConfig() {
        this(0);
    }

    public static AudioDecoderConfig deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static AudioDecoderConfig deserialize(java.nio.ByteBuffer data) {
        if (data == null)
            return null;

        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static AudioDecoderConfig decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        AudioDecoderConfig result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            result = new AudioDecoderConfig(mainDataHeader.elementsOrVersion);
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.codec = decoder0.readInt(8);
                    AudioCodec.validate(result.codec);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.sampleFormat = decoder0.readInt(12);
                    SampleFormat.validate(result.sampleFormat);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.channelLayout = decoder0.readInt(16);
                    ChannelLayout.validate(result.channelLayout);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.samplesPerSecond = decoder0.readInt(20);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.extraData = decoder0.readBytes(24, org.chromium.mojo.bindings.BindingsHelper.NOTHING_NULLABLE, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(32, false);
                result.seekPreroll = org.chromium.mojo.common.mojom.TimeDelta.decode(decoder1);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.codecDelay = decoder0.readInt(40);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(48, false);
                result.encryptionScheme = EncryptionScheme.decode(decoder1);
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
        
        encoder0.encode(this.codec, 8);
        
        encoder0.encode(this.sampleFormat, 12);
        
        encoder0.encode(this.channelLayout, 16);
        
        encoder0.encode(this.samplesPerSecond, 20);
        
        encoder0.encode(this.extraData, 24, org.chromium.mojo.bindings.BindingsHelper.NOTHING_NULLABLE, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
        
        encoder0.encode(this.seekPreroll, 32, false);
        
        encoder0.encode(this.codecDelay, 40);
        
        encoder0.encode(this.encryptionScheme, 48, false);
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
        AudioDecoderConfig other = (AudioDecoderConfig) object;
        if (this.codec!= other.codec)
            return false;
        if (this.sampleFormat!= other.sampleFormat)
            return false;
        if (this.channelLayout!= other.channelLayout)
            return false;
        if (this.samplesPerSecond!= other.samplesPerSecond)
            return false;
        if (!java.util.Arrays.equals(this.extraData, other.extraData))
            return false;
        if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.seekPreroll, other.seekPreroll))
            return false;
        if (this.codecDelay!= other.codecDelay)
            return false;
        if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.encryptionScheme, other.encryptionScheme))
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
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.codec);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.sampleFormat);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.channelLayout);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.samplesPerSecond);
        result = prime * result + java.util.Arrays.hashCode(this.extraData);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.seekPreroll);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.codecDelay);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.encryptionScheme);
        return result;
    }
}