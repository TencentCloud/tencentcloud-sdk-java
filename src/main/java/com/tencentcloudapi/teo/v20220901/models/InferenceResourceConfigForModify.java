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

public class InferenceResourceConfigForModify extends AbstractModel {

    /**
    * <p>扩容缩容的方式。取值有：<li>Auto：根据请求量自动调整实例数量；</li><li>Manual：人工设置固定的实例数量。</li></p>
    */
    @SerializedName("ScalingMode")
    @Expose
    private String ScalingMode;

    /**
    * <p>推理服务自动伸缩配置。当 ScalingMode 为 Auto 时必填。</p>
    */
    @SerializedName("AutoScalingConfig")
    @Expose
    private InferenceAutoScalingConfig AutoScalingConfig;

    /**
    * <p>推理服务人工设置实例配置。当 ScalingMode 为 Manual 时必填。</p>
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
    * <p>推理服务的硬件资源配置。</p>
    */
    @SerializedName("HardwareConfig")
    @Expose
    private InferenceHardwareConfigForModify HardwareConfig;

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
     * Get <p>推理服务自动伸缩配置。当 ScalingMode 为 Auto 时必填。</p> 
     * @return AutoScalingConfig <p>推理服务自动伸缩配置。当 ScalingMode 为 Auto 时必填。</p>
     */
    public InferenceAutoScalingConfig getAutoScalingConfig() {
        return this.AutoScalingConfig;
    }

    /**
     * Set <p>推理服务自动伸缩配置。当 ScalingMode 为 Auto 时必填。</p>
     * @param AutoScalingConfig <p>推理服务自动伸缩配置。当 ScalingMode 为 Auto 时必填。</p>
     */
    public void setAutoScalingConfig(InferenceAutoScalingConfig AutoScalingConfig) {
        this.AutoScalingConfig = AutoScalingConfig;
    }

    /**
     * Get <p>推理服务人工设置实例配置。当 ScalingMode 为 Manual 时必填。</p> 
     * @return ManualInstanceConfig <p>推理服务人工设置实例配置。当 ScalingMode 为 Manual 时必填。</p>
     */
    public InferenceManualInstanceConfig getManualInstanceConfig() {
        return this.ManualInstanceConfig;
    }

    /**
     * Set <p>推理服务人工设置实例配置。当 ScalingMode 为 Manual 时必填。</p>
     * @param ManualInstanceConfig <p>推理服务人工设置实例配置。当 ScalingMode 为 Manual 时必填。</p>
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

    /**
     * Get <p>推理服务的硬件资源配置。</p> 
     * @return HardwareConfig <p>推理服务的硬件资源配置。</p>
     */
    public InferenceHardwareConfigForModify getHardwareConfig() {
        return this.HardwareConfig;
    }

    /**
     * Set <p>推理服务的硬件资源配置。</p>
     * @param HardwareConfig <p>推理服务的硬件资源配置。</p>
     */
    public void setHardwareConfig(InferenceHardwareConfigForModify HardwareConfig) {
        this.HardwareConfig = HardwareConfig;
    }

    public InferenceResourceConfigForModify() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InferenceResourceConfigForModify(InferenceResourceConfigForModify source) {
        if (source.ScalingMode != null) {
            this.ScalingMode = new String(source.ScalingMode);
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
        if (source.HardwareConfig != null) {
            this.HardwareConfig = new InferenceHardwareConfigForModify(source.HardwareConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ScalingMode", this.ScalingMode);
        this.setParamObj(map, prefix + "AutoScalingConfig.", this.AutoScalingConfig);
        this.setParamObj(map, prefix + "ManualInstanceConfig.", this.ManualInstanceConfig);
        this.setParamSimple(map, prefix + "Concurrency", this.Concurrency);
        this.setParamObj(map, prefix + "HardwareConfig.", this.HardwareConfig);

    }
}

