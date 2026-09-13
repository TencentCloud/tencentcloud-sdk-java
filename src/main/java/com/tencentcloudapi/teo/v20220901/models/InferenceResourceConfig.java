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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InferenceResourceConfig extends AbstractModel {

    /**
    * <p>扩容缩容的方式。取值有：<li>Auto：根据请求量自动调整实例数量；</li><li>Manual：人工设置固定的实例数量。</li></p>
    */
    @SerializedName("ScalingMode")
    @Expose
    private String ScalingMode;

    /**
    * <p>硬件规格标识。已废弃，请参考使用 <code>HardwareSpecId</code>。</p>
    */
    @SerializedName("HardwareSpec")
    @Expose
    private String HardwareSpec;

    /**
    * <p>硬件规格唯一标识 ID，可通过 <code>DescribeInferenceHardwareSpecifications</code> 接口获取当前站点支持的硬件规格。</p><p>系统默认按照所选 <code>HardwareSpecId</code> 对应的硬件规格配置推理服务所需资源；如需调整，可通过 <code>HardwareConfig</code> 自定义硬件资源配置。</p>
    */
    @SerializedName("HardwareSpecId")
    @Expose
    private String HardwareSpecId;

    /**
    * <p>推理服务硬件配置。</p><p>作为入参时，若未填充则按照所选 <code>HardwareSpecId</code> 规格的默认值配置硬件资源；若填充则优先按照填写值进行配置。</p>
    */
    @SerializedName("HardwareConfig")
    @Expose
    private InferenceHardwareConfig HardwareConfig;

    /**
    * <p>推理服务自动伸缩配置。当 ScalingMode 为 Auto 时必填。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoScalingConfig")
    @Expose
    private InferenceAutoScalingConfig AutoScalingConfig;

    /**
    * <p>推理服务人工设置实例配置。当 ScalingMode 为 Manual 时必填。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ManualInstanceConfig")
    @Expose
    private InferenceManualInstanceConfig ManualInstanceConfig;

    /**
    * <p>单实例的并发数。默认值为 1。</p>
    */
    @SerializedName("Concurrency")
    @Expose
    private Long Concurrency;

    /**
     * Get <p>扩容缩容的方式。取值有：<li>Auto：根据请求量自动调整实例数量；</li><li>Manual：人工设置固定的实例数量。</li></p> 
     * @return ScalingMode <p>扩容缩容的方式。取值有：<li>Auto：根据请求量自动调整实例数量；</li><li>Manual：人工设置固定的实例数量。</li></p>
     */
    public String getScalingMode() {
        return this.ScalingMode;
    }

    /**
     * Set <p>扩容缩容的方式。取值有：<li>Auto：根据请求量自动调整实例数量；</li><li>Manual：人工设置固定的实例数量。</li></p>
     * @param ScalingMode <p>扩容缩容的方式。取值有：<li>Auto：根据请求量自动调整实例数量；</li><li>Manual：人工设置固定的实例数量。</li></p>
     */
    public void setScalingMode(String ScalingMode) {
        this.ScalingMode = ScalingMode;
    }

    /**
     * Get <p>硬件规格标识。已废弃，请参考使用 <code>HardwareSpecId</code>。</p> 
     * @return HardwareSpec <p>硬件规格标识。已废弃，请参考使用 <code>HardwareSpecId</code>。</p>
     * @deprecated
     */
    @Deprecated
    public String getHardwareSpec() {
        return this.HardwareSpec;
    }

    /**
     * Set <p>硬件规格标识。已废弃，请参考使用 <code>HardwareSpecId</code>。</p>
     * @param HardwareSpec <p>硬件规格标识。已废弃，请参考使用 <code>HardwareSpecId</code>。</p>
     * @deprecated
     */
    @Deprecated
    public void setHardwareSpec(String HardwareSpec) {
        this.HardwareSpec = HardwareSpec;
    }

    /**
     * Get <p>硬件规格唯一标识 ID，可通过 <code>DescribeInferenceHardwareSpecifications</code> 接口获取当前站点支持的硬件规格。</p><p>系统默认按照所选 <code>HardwareSpecId</code> 对应的硬件规格配置推理服务所需资源；如需调整，可通过 <code>HardwareConfig</code> 自定义硬件资源配置。</p> 
     * @return HardwareSpecId <p>硬件规格唯一标识 ID，可通过 <code>DescribeInferenceHardwareSpecifications</code> 接口获取当前站点支持的硬件规格。</p><p>系统默认按照所选 <code>HardwareSpecId</code> 对应的硬件规格配置推理服务所需资源；如需调整，可通过 <code>HardwareConfig</code> 自定义硬件资源配置。</p>
     */
    public String getHardwareSpecId() {
        return this.HardwareSpecId;
    }

    /**
     * Set <p>硬件规格唯一标识 ID，可通过 <code>DescribeInferenceHardwareSpecifications</code> 接口获取当前站点支持的硬件规格。</p><p>系统默认按照所选 <code>HardwareSpecId</code> 对应的硬件规格配置推理服务所需资源；如需调整，可通过 <code>HardwareConfig</code> 自定义硬件资源配置。</p>
     * @param HardwareSpecId <p>硬件规格唯一标识 ID，可通过 <code>DescribeInferenceHardwareSpecifications</code> 接口获取当前站点支持的硬件规格。</p><p>系统默认按照所选 <code>HardwareSpecId</code> 对应的硬件规格配置推理服务所需资源；如需调整，可通过 <code>HardwareConfig</code> 自定义硬件资源配置。</p>
     */
    public void setHardwareSpecId(String HardwareSpecId) {
        this.HardwareSpecId = HardwareSpecId;
    }

    /**
     * Get <p>推理服务硬件配置。</p><p>作为入参时，若未填充则按照所选 <code>HardwareSpecId</code> 规格的默认值配置硬件资源；若填充则优先按照填写值进行配置。</p> 
     * @return HardwareConfig <p>推理服务硬件配置。</p><p>作为入参时，若未填充则按照所选 <code>HardwareSpecId</code> 规格的默认值配置硬件资源；若填充则优先按照填写值进行配置。</p>
     */
    public InferenceHardwareConfig getHardwareConfig() {
        return this.HardwareConfig;
    }

    /**
     * Set <p>推理服务硬件配置。</p><p>作为入参时，若未填充则按照所选 <code>HardwareSpecId</code> 规格的默认值配置硬件资源；若填充则优先按照填写值进行配置。</p>
     * @param HardwareConfig <p>推理服务硬件配置。</p><p>作为入参时，若未填充则按照所选 <code>HardwareSpecId</code> 规格的默认值配置硬件资源；若填充则优先按照填写值进行配置。</p>
     */
    public void setHardwareConfig(InferenceHardwareConfig HardwareConfig) {
        this.HardwareConfig = HardwareConfig;
    }

    /**
     * Get <p>推理服务自动伸缩配置。当 ScalingMode 为 Auto 时必填。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoScalingConfig <p>推理服务自动伸缩配置。当 ScalingMode 为 Auto 时必填。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InferenceAutoScalingConfig getAutoScalingConfig() {
        return this.AutoScalingConfig;
    }

    /**
     * Set <p>推理服务自动伸缩配置。当 ScalingMode 为 Auto 时必填。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoScalingConfig <p>推理服务自动伸缩配置。当 ScalingMode 为 Auto 时必填。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoScalingConfig(InferenceAutoScalingConfig AutoScalingConfig) {
        this.AutoScalingConfig = AutoScalingConfig;
    }

    /**
     * Get <p>推理服务人工设置实例配置。当 ScalingMode 为 Manual 时必填。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ManualInstanceConfig <p>推理服务人工设置实例配置。当 ScalingMode 为 Manual 时必填。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InferenceManualInstanceConfig getManualInstanceConfig() {
        return this.ManualInstanceConfig;
    }

    /**
     * Set <p>推理服务人工设置实例配置。当 ScalingMode 为 Manual 时必填。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ManualInstanceConfig <p>推理服务人工设置实例配置。当 ScalingMode 为 Manual 时必填。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setManualInstanceConfig(InferenceManualInstanceConfig ManualInstanceConfig) {
        this.ManualInstanceConfig = ManualInstanceConfig;
    }

    /**
     * Get <p>单实例的并发数。默认值为 1。</p> 
     * @return Concurrency <p>单实例的并发数。默认值为 1。</p>
     */
    public Long getConcurrency() {
        return this.Concurrency;
    }

    /**
     * Set <p>单实例的并发数。默认值为 1。</p>
     * @param Concurrency <p>单实例的并发数。默认值为 1。</p>
     */
    public void setConcurrency(Long Concurrency) {
        this.Concurrency = Concurrency;
    }

    public InferenceResourceConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InferenceResourceConfig(InferenceResourceConfig source) {
        if (source.ScalingMode != null) {
            this.ScalingMode = new String(source.ScalingMode);
        }
        if (source.HardwareSpec != null) {
            this.HardwareSpec = new String(source.HardwareSpec);
        }
        if (source.HardwareSpecId != null) {
            this.HardwareSpecId = new String(source.HardwareSpecId);
        }
        if (source.HardwareConfig != null) {
            this.HardwareConfig = new InferenceHardwareConfig(source.HardwareConfig);
        }
        if (source.AutoScalingConfig != null) {
            this.AutoScalingConfig = new InferenceAutoScalingConfig(source.AutoScalingConfig);
        }
        if (source.ManualInstanceConfig != null) {
            this.ManualInstanceConfig = new InferenceManualInstanceConfig(source.ManualInstanceConfig);
        }
        if (source.Concurrency != null) {
            this.Concurrency = new Long(source.Concurrency);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ScalingMode", this.ScalingMode);
        this.setParamSimple(map, prefix + "HardwareSpec", this.HardwareSpec);
        this.setParamSimple(map, prefix + "HardwareSpecId", this.HardwareSpecId);
        this.setParamObj(map, prefix + "HardwareConfig.", this.HardwareConfig);
        this.setParamObj(map, prefix + "AutoScalingConfig.", this.AutoScalingConfig);
        this.setParamObj(map, prefix + "ManualInstanceConfig.", this.ManualInstanceConfig);
        this.setParamSimple(map, prefix + "Concurrency", this.Concurrency);

    }
}

