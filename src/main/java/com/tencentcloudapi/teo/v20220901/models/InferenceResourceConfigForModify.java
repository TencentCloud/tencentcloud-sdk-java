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
    * 扩容缩容的方式。取值有：<li>Auto：根据请求量自动调整实例数量；</li><li>Manual：人工设置固定的实例数量。</li>
    */
    @SerializedName("ScalingMode")
    @Expose
    private String ScalingMode;

    /**
    * 推理服务自动伸缩配置。当 ScalingMode 为 Auto 时必填。
    */
    @SerializedName("AutoScalingConfig")
    @Expose
    private InferenceAutoScalingConfig AutoScalingConfig;

    /**
    * 推理服务人工设置实例配置。当 ScalingMode 为 Manual 时必填。
    */
    @SerializedName("ManualInstanceConfig")
    @Expose
    private InferenceManualInstanceConfig ManualInstanceConfig;

    /**
    * 单实例的并发数。默认值为 1。
    */
    @SerializedName("Concurrency")
    @Expose
    private Long Concurrency;

    /**
     * Get 扩容缩容的方式。取值有：<li>Auto：根据请求量自动调整实例数量；</li><li>Manual：人工设置固定的实例数量。</li> 
     * @return ScalingMode 扩容缩容的方式。取值有：<li>Auto：根据请求量自动调整实例数量；</li><li>Manual：人工设置固定的实例数量。</li>
     */
    public String getScalingMode() {
        return this.ScalingMode;
    }

    /**
     * Set 扩容缩容的方式。取值有：<li>Auto：根据请求量自动调整实例数量；</li><li>Manual：人工设置固定的实例数量。</li>
     * @param ScalingMode 扩容缩容的方式。取值有：<li>Auto：根据请求量自动调整实例数量；</li><li>Manual：人工设置固定的实例数量。</li>
     */
    public void setScalingMode(String ScalingMode) {
        this.ScalingMode = ScalingMode;
    }

    /**
     * Get 推理服务自动伸缩配置。当 ScalingMode 为 Auto 时必填。 
     * @return AutoScalingConfig 推理服务自动伸缩配置。当 ScalingMode 为 Auto 时必填。
     */
    public InferenceAutoScalingConfig getAutoScalingConfig() {
        return this.AutoScalingConfig;
    }

    /**
     * Set 推理服务自动伸缩配置。当 ScalingMode 为 Auto 时必填。
     * @param AutoScalingConfig 推理服务自动伸缩配置。当 ScalingMode 为 Auto 时必填。
     */
    public void setAutoScalingConfig(InferenceAutoScalingConfig AutoScalingConfig) {
        this.AutoScalingConfig = AutoScalingConfig;
    }

    /**
     * Get 推理服务人工设置实例配置。当 ScalingMode 为 Manual 时必填。 
     * @return ManualInstanceConfig 推理服务人工设置实例配置。当 ScalingMode 为 Manual 时必填。
     */
    public InferenceManualInstanceConfig getManualInstanceConfig() {
        return this.ManualInstanceConfig;
    }

    /**
     * Set 推理服务人工设置实例配置。当 ScalingMode 为 Manual 时必填。
     * @param ManualInstanceConfig 推理服务人工设置实例配置。当 ScalingMode 为 Manual 时必填。
     */
    public void setManualInstanceConfig(InferenceManualInstanceConfig ManualInstanceConfig) {
        this.ManualInstanceConfig = ManualInstanceConfig;
    }

    /**
     * Get 单实例的并发数。默认值为 1。 
     * @return Concurrency 单实例的并发数。默认值为 1。
     */
    public Long getConcurrency() {
        return this.Concurrency;
    }

    /**
     * Set 单实例的并发数。默认值为 1。
     * @param Concurrency 单实例的并发数。默认值为 1。
     */
    public void setConcurrency(Long Concurrency) {
        this.Concurrency = Concurrency;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ScalingMode", this.ScalingMode);
        this.setParamObj(map, prefix + "AutoScalingConfig.", this.AutoScalingConfig);
        this.setParamObj(map, prefix + "ManualInstanceConfig.", this.ManualInstanceConfig);
        this.setParamSimple(map, prefix + "Concurrency", this.Concurrency);

    }
}

