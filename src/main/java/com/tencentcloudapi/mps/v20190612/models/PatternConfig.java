/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PatternConfig extends AbstractModel {

    /**
    * <p>透明度阈值</p><p>取值范围：[0, 255]</p><p>默认值：30</p>
    */
    @SerializedName("TransparencyThreshold")
    @Expose
    private Long TransparencyThreshold;

    /**
    * <p>不透明阈值，必须大于TransparencyThreshold</p><p>取值范围：[0, 255]</p><p>默认值：127</p>
    */
    @SerializedName("OpaqueThreshold")
    @Expose
    private Long OpaqueThreshold;

    /**
    * <p>边缘采样步数，默认5</p><p>取值范围：[1, 10]</p>
    */
    @SerializedName("EdgeSamplingStep")
    @Expose
    private Long EdgeSamplingStep;

    /**
    * <p>边缘扩展步数，默认5</p>
    */
    @SerializedName("EdgeExpansionStep")
    @Expose
    private Long EdgeExpansionStep;

    /**
    * <p>边缘融合强度，默认0.5</p><p>取值范围：[0, 1.0]</p>
    */
    @SerializedName("EdgeBlendingIntensity")
    @Expose
    private Float EdgeBlendingIntensity;

    /**
     * Get <p>透明度阈值</p><p>取值范围：[0, 255]</p><p>默认值：30</p> 
     * @return TransparencyThreshold <p>透明度阈值</p><p>取值范围：[0, 255]</p><p>默认值：30</p>
     */
    public Long getTransparencyThreshold() {
        return this.TransparencyThreshold;
    }

    /**
     * Set <p>透明度阈值</p><p>取值范围：[0, 255]</p><p>默认值：30</p>
     * @param TransparencyThreshold <p>透明度阈值</p><p>取值范围：[0, 255]</p><p>默认值：30</p>
     */
    public void setTransparencyThreshold(Long TransparencyThreshold) {
        this.TransparencyThreshold = TransparencyThreshold;
    }

    /**
     * Get <p>不透明阈值，必须大于TransparencyThreshold</p><p>取值范围：[0, 255]</p><p>默认值：127</p> 
     * @return OpaqueThreshold <p>不透明阈值，必须大于TransparencyThreshold</p><p>取值范围：[0, 255]</p><p>默认值：127</p>
     */
    public Long getOpaqueThreshold() {
        return this.OpaqueThreshold;
    }

    /**
     * Set <p>不透明阈值，必须大于TransparencyThreshold</p><p>取值范围：[0, 255]</p><p>默认值：127</p>
     * @param OpaqueThreshold <p>不透明阈值，必须大于TransparencyThreshold</p><p>取值范围：[0, 255]</p><p>默认值：127</p>
     */
    public void setOpaqueThreshold(Long OpaqueThreshold) {
        this.OpaqueThreshold = OpaqueThreshold;
    }

    /**
     * Get <p>边缘采样步数，默认5</p><p>取值范围：[1, 10]</p> 
     * @return EdgeSamplingStep <p>边缘采样步数，默认5</p><p>取值范围：[1, 10]</p>
     */
    public Long getEdgeSamplingStep() {
        return this.EdgeSamplingStep;
    }

    /**
     * Set <p>边缘采样步数，默认5</p><p>取值范围：[1, 10]</p>
     * @param EdgeSamplingStep <p>边缘采样步数，默认5</p><p>取值范围：[1, 10]</p>
     */
    public void setEdgeSamplingStep(Long EdgeSamplingStep) {
        this.EdgeSamplingStep = EdgeSamplingStep;
    }

    /**
     * Get <p>边缘扩展步数，默认5</p> 
     * @return EdgeExpansionStep <p>边缘扩展步数，默认5</p>
     */
    public Long getEdgeExpansionStep() {
        return this.EdgeExpansionStep;
    }

    /**
     * Set <p>边缘扩展步数，默认5</p>
     * @param EdgeExpansionStep <p>边缘扩展步数，默认5</p>
     */
    public void setEdgeExpansionStep(Long EdgeExpansionStep) {
        this.EdgeExpansionStep = EdgeExpansionStep;
    }

    /**
     * Get <p>边缘融合强度，默认0.5</p><p>取值范围：[0, 1.0]</p> 
     * @return EdgeBlendingIntensity <p>边缘融合强度，默认0.5</p><p>取值范围：[0, 1.0]</p>
     */
    public Float getEdgeBlendingIntensity() {
        return this.EdgeBlendingIntensity;
    }

    /**
     * Set <p>边缘融合强度，默认0.5</p><p>取值范围：[0, 1.0]</p>
     * @param EdgeBlendingIntensity <p>边缘融合强度，默认0.5</p><p>取值范围：[0, 1.0]</p>
     */
    public void setEdgeBlendingIntensity(Float EdgeBlendingIntensity) {
        this.EdgeBlendingIntensity = EdgeBlendingIntensity;
    }

    public PatternConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PatternConfig(PatternConfig source) {
        if (source.TransparencyThreshold != null) {
            this.TransparencyThreshold = new Long(source.TransparencyThreshold);
        }
        if (source.OpaqueThreshold != null) {
            this.OpaqueThreshold = new Long(source.OpaqueThreshold);
        }
        if (source.EdgeSamplingStep != null) {
            this.EdgeSamplingStep = new Long(source.EdgeSamplingStep);
        }
        if (source.EdgeExpansionStep != null) {
            this.EdgeExpansionStep = new Long(source.EdgeExpansionStep);
        }
        if (source.EdgeBlendingIntensity != null) {
            this.EdgeBlendingIntensity = new Float(source.EdgeBlendingIntensity);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TransparencyThreshold", this.TransparencyThreshold);
        this.setParamSimple(map, prefix + "OpaqueThreshold", this.OpaqueThreshold);
        this.setParamSimple(map, prefix + "EdgeSamplingStep", this.EdgeSamplingStep);
        this.setParamSimple(map, prefix + "EdgeExpansionStep", this.EdgeExpansionStep);
        this.setParamSimple(map, prefix + "EdgeBlendingIntensity", this.EdgeBlendingIntensity);

    }
}

