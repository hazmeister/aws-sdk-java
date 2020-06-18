/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * If you work with a third party video watermarking partner, use the group of settings that correspond with your
 * watermarking partner to include watermarks in your output.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/PartnerWatermarking" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PartnerWatermarking implements Serializable, Cloneable, StructuredPojo {

    /**
     * For forensic video watermarking, MediaConvert supports Nagra NexGuard File Marker watermarking. MediaConvert
     * supports both PreRelease Content (NGPR/G2) and OTT Streaming workflows.
     */
    private NexGuardFileMarkerSettings nexguardFileMarkerSettings;

    /**
     * For forensic video watermarking, MediaConvert supports Nagra NexGuard File Marker watermarking. MediaConvert
     * supports both PreRelease Content (NGPR/G2) and OTT Streaming workflows.
     * 
     * @param nexguardFileMarkerSettings
     *        For forensic video watermarking, MediaConvert supports Nagra NexGuard File Marker watermarking.
     *        MediaConvert supports both PreRelease Content (NGPR/G2) and OTT Streaming workflows.
     */

    public void setNexguardFileMarkerSettings(NexGuardFileMarkerSettings nexguardFileMarkerSettings) {
        this.nexguardFileMarkerSettings = nexguardFileMarkerSettings;
    }

    /**
     * For forensic video watermarking, MediaConvert supports Nagra NexGuard File Marker watermarking. MediaConvert
     * supports both PreRelease Content (NGPR/G2) and OTT Streaming workflows.
     * 
     * @return For forensic video watermarking, MediaConvert supports Nagra NexGuard File Marker watermarking.
     *         MediaConvert supports both PreRelease Content (NGPR/G2) and OTT Streaming workflows.
     */

    public NexGuardFileMarkerSettings getNexguardFileMarkerSettings() {
        return this.nexguardFileMarkerSettings;
    }

    /**
     * For forensic video watermarking, MediaConvert supports Nagra NexGuard File Marker watermarking. MediaConvert
     * supports both PreRelease Content (NGPR/G2) and OTT Streaming workflows.
     * 
     * @param nexguardFileMarkerSettings
     *        For forensic video watermarking, MediaConvert supports Nagra NexGuard File Marker watermarking.
     *        MediaConvert supports both PreRelease Content (NGPR/G2) and OTT Streaming workflows.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PartnerWatermarking withNexguardFileMarkerSettings(NexGuardFileMarkerSettings nexguardFileMarkerSettings) {
        setNexguardFileMarkerSettings(nexguardFileMarkerSettings);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getNexguardFileMarkerSettings() != null)
            sb.append("NexguardFileMarkerSettings: ").append(getNexguardFileMarkerSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PartnerWatermarking == false)
            return false;
        PartnerWatermarking other = (PartnerWatermarking) obj;
        if (other.getNexguardFileMarkerSettings() == null ^ this.getNexguardFileMarkerSettings() == null)
            return false;
        if (other.getNexguardFileMarkerSettings() != null && other.getNexguardFileMarkerSettings().equals(this.getNexguardFileMarkerSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNexguardFileMarkerSettings() == null) ? 0 : getNexguardFileMarkerSettings().hashCode());
        return hashCode;
    }

    @Override
    public PartnerWatermarking clone() {
        try {
            return (PartnerWatermarking) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.PartnerWatermarkingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
