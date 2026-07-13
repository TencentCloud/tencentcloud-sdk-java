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
package com.tencentcloudapi.tokenhub.v20260322.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateEndpointRequest extends AbstractModel {

    /**
    * <p>服务名称。最大 64 字符。</p>
    */
    @SerializedName("EndpointName")
    @Expose
    private String EndpointName;

    /**
    * <p>模型 ID。可通过 DescribeModelList 接口获取。</p>
    */
    @SerializedName("ModelId")
    @Expose
    private String ModelId;

    /**
    * <p>计费方式。取值：FREE（免费体验）、TOKEN（按 Token 计费）、TPM（TPM 保障）、COMPUTE_UNIT（按算力单元计费）。</p>
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * <p>RPM（每分钟请求数）限流上限。可选。必须大于 0，且不能超过用户在该模型上的 RPM 上限。不传则使用默认值（60）。</p>
    */
    @SerializedName("RPM")
    @Expose
    private Long RPM;

    /**
    * <p>TPM（每分钟 Token 数）限流上限，单位为 tokens/min。可选。必须大于 0，且不能超过用户在该模型上的 TPM 上限。设置后会同时作用于输入 TPM 和输出 TPM。不传则使用默认值（0 表示不限流）。</p>
    */
    @SerializedName("TPM")
    @Expose
    private Long TPM;

    /**
    * <p>自动调整配额</p>
    */
    @SerializedName("AutoAdjustQuota")
    @Expose
    private Long AutoAdjustQuota;

    /**
    * <p>自定义推理服务 id</p>
    */
    @SerializedName("EndpointId")
    @Expose
    private String EndpointId;

    /**
     * Get <p>服务名称。最大 64 字符。</p> 
     * @return EndpointName <p>服务名称。最大 64 字符。</p>
     */
    public String getEndpointName() {
        return this.EndpointName;
    }

    /**
     * Set <p>服务名称。最大 64 字符。</p>
     * @param EndpointName <p>服务名称。最大 64 字符。</p>
     */
    public void setEndpointName(String EndpointName) {
        this.EndpointName = EndpointName;
    }

    /**
     * Get <p>模型 ID。可通过 DescribeModelList 接口获取。</p> 
     * @return ModelId <p>模型 ID。可通过 DescribeModelList 接口获取。</p>
     */
    public String getModelId() {
        return this.ModelId;
    }

    /**
     * Set <p>模型 ID。可通过 DescribeModelList 接口获取。</p>
     * @param ModelId <p>模型 ID。可通过 DescribeModelList 接口获取。</p>
     */
    public void setModelId(String ModelId) {
        this.ModelId = ModelId;
    }

    /**
     * Get <p>计费方式。取值：FREE（免费体验）、TOKEN（按 Token 计费）、TPM（TPM 保障）、COMPUTE_UNIT（按算力单元计费）。</p> 
     * @return ChargeType <p>计费方式。取值：FREE（免费体验）、TOKEN（按 Token 计费）、TPM（TPM 保障）、COMPUTE_UNIT（按算力单元计费）。</p>
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set <p>计费方式。取值：FREE（免费体验）、TOKEN（按 Token 计费）、TPM（TPM 保障）、COMPUTE_UNIT（按算力单元计费）。</p>
     * @param ChargeType <p>计费方式。取值：FREE（免费体验）、TOKEN（按 Token 计费）、TPM（TPM 保障）、COMPUTE_UNIT（按算力单元计费）。</p>
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get <p>RPM（每分钟请求数）限流上限。可选。必须大于 0，且不能超过用户在该模型上的 RPM 上限。不传则使用默认值（60）。</p> 
     * @return RPM <p>RPM（每分钟请求数）限流上限。可选。必须大于 0，且不能超过用户在该模型上的 RPM 上限。不传则使用默认值（60）。</p>
     */
    public Long getRPM() {
        return this.RPM;
    }

    /**
     * Set <p>RPM（每分钟请求数）限流上限。可选。必须大于 0，且不能超过用户在该模型上的 RPM 上限。不传则使用默认值（60）。</p>
     * @param RPM <p>RPM（每分钟请求数）限流上限。可选。必须大于 0，且不能超过用户在该模型上的 RPM 上限。不传则使用默认值（60）。</p>
     */
    public void setRPM(Long RPM) {
        this.RPM = RPM;
    }

    /**
     * Get <p>TPM（每分钟 Token 数）限流上限，单位为 tokens/min。可选。必须大于 0，且不能超过用户在该模型上的 TPM 上限。设置后会同时作用于输入 TPM 和输出 TPM。不传则使用默认值（0 表示不限流）。</p> 
     * @return TPM <p>TPM（每分钟 Token 数）限流上限，单位为 tokens/min。可选。必须大于 0，且不能超过用户在该模型上的 TPM 上限。设置后会同时作用于输入 TPM 和输出 TPM。不传则使用默认值（0 表示不限流）。</p>
     */
    public Long getTPM() {
        return this.TPM;
    }

    /**
     * Set <p>TPM（每分钟 Token 数）限流上限，单位为 tokens/min。可选。必须大于 0，且不能超过用户在该模型上的 TPM 上限。设置后会同时作用于输入 TPM 和输出 TPM。不传则使用默认值（0 表示不限流）。</p>
     * @param TPM <p>TPM（每分钟 Token 数）限流上限，单位为 tokens/min。可选。必须大于 0，且不能超过用户在该模型上的 TPM 上限。设置后会同时作用于输入 TPM 和输出 TPM。不传则使用默认值（0 表示不限流）。</p>
     */
    public void setTPM(Long TPM) {
        this.TPM = TPM;
    }

    /**
     * Get <p>自动调整配额</p> 
     * @return AutoAdjustQuota <p>自动调整配额</p>
     */
    public Long getAutoAdjustQuota() {
        return this.AutoAdjustQuota;
    }

    /**
     * Set <p>自动调整配额</p>
     * @param AutoAdjustQuota <p>自动调整配额</p>
     */
    public void setAutoAdjustQuota(Long AutoAdjustQuota) {
        this.AutoAdjustQuota = AutoAdjustQuota;
    }

    /**
     * Get <p>自定义推理服务 id</p> 
     * @return EndpointId <p>自定义推理服务 id</p>
     */
    public String getEndpointId() {
        return this.EndpointId;
    }

    /**
     * Set <p>自定义推理服务 id</p>
     * @param EndpointId <p>自定义推理服务 id</p>
     */
    public void setEndpointId(String EndpointId) {
        this.EndpointId = EndpointId;
    }

    public CreateEndpointRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateEndpointRequest(CreateEndpointRequest source) {
        if (source.EndpointName != null) {
            this.EndpointName = new String(source.EndpointName);
        }
        if (source.ModelId != null) {
            this.ModelId = new String(source.ModelId);
        }
        if (source.ChargeType != null) {
            this.ChargeType = new String(source.ChargeType);
        }
        if (source.RPM != null) {
            this.RPM = new Long(source.RPM);
        }
        if (source.TPM != null) {
            this.TPM = new Long(source.TPM);
        }
        if (source.AutoAdjustQuota != null) {
            this.AutoAdjustQuota = new Long(source.AutoAdjustQuota);
        }
        if (source.EndpointId != null) {
            this.EndpointId = new String(source.EndpointId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EndpointName", this.EndpointName);
        this.setParamSimple(map, prefix + "ModelId", this.ModelId);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "RPM", this.RPM);
        this.setParamSimple(map, prefix + "TPM", this.TPM);
        this.setParamSimple(map, prefix + "AutoAdjustQuota", this.AutoAdjustQuota);
        this.setParamSimple(map, prefix + "EndpointId", this.EndpointId);

    }
}

