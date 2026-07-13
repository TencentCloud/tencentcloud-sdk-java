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

public class ModelEndpointView extends AbstractModel {

    /**
    * <p>推理服务 ID。网关默认创建的 id 与模型 id 相同；控制台自定义推理服务以 ep- 开头。</p>
    */
    @SerializedName("EndpointId")
    @Expose
    private String EndpointId;

    /**
    * <p>推理服务名称。未激活时与 ModelId 相同。</p>
    */
    @SerializedName("EndpointName")
    @Expose
    private String EndpointName;

    /**
    * <p>模型 ID。</p>
    */
    @SerializedName("ModelId")
    @Expose
    private String ModelId;

    /**
    * <p>模型名称。</p>
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * <p>状态。取值：ACTIVE（运行中）、INACTIVE（已停止）。</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>服务类型。固定为 TEXT_GENERATION（文本生成）。</p>
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * <p>计费方式。取值：FREE（免费体验）、TOKEN（按 Token 计费）。未激活时为空。</p>
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * <p>是否已开启后付费。true 表示已开启，false 表示未开启。未激活时为 false。</p>
    */
    @SerializedName("PaymentEnabled")
    @Expose
    private Boolean PaymentEnabled;

    /**
    * <p>计费详情信息，JSON 格式字符串，包含免费额度用量等信息。未激活时为空。</p>
    */
    @SerializedName("ChargeDetail")
    @Expose
    private String ChargeDetail;

    /**
    * <p>停止原因。当状态为 INACTIVE 时返回。取值：FREE_QUOTA_EXHAUSTED（免费额度已用尽）、NO_FREE_PACKAGE（无可用免费包）、INSUFFICIENT_BALANCE（余额不足）、BILLING_ISOLATED（账户欠费隔离）、INTERNAL_ERROR（内部错误）。</p>
    */
    @SerializedName("StopReason")
    @Expose
    private String StopReason;

    /**
    * <p>推理服务的 rpm 限制，没设置就按模型维度 rpm 限制展示</p>
    */
    @SerializedName("RPM")
    @Expose
    private Long RPM;

    /**
    * <p>推理服务的tpm 限制，没设置就按模型维度 tpm 限制展示</p>
    */
    @SerializedName("TPM")
    @Expose
    private Long TPM;

    /**
     * Get <p>推理服务 ID。网关默认创建的 id 与模型 id 相同；控制台自定义推理服务以 ep- 开头。</p> 
     * @return EndpointId <p>推理服务 ID。网关默认创建的 id 与模型 id 相同；控制台自定义推理服务以 ep- 开头。</p>
     */
    public String getEndpointId() {
        return this.EndpointId;
    }

    /**
     * Set <p>推理服务 ID。网关默认创建的 id 与模型 id 相同；控制台自定义推理服务以 ep- 开头。</p>
     * @param EndpointId <p>推理服务 ID。网关默认创建的 id 与模型 id 相同；控制台自定义推理服务以 ep- 开头。</p>
     */
    public void setEndpointId(String EndpointId) {
        this.EndpointId = EndpointId;
    }

    /**
     * Get <p>推理服务名称。未激活时与 ModelId 相同。</p> 
     * @return EndpointName <p>推理服务名称。未激活时与 ModelId 相同。</p>
     */
    public String getEndpointName() {
        return this.EndpointName;
    }

    /**
     * Set <p>推理服务名称。未激活时与 ModelId 相同。</p>
     * @param EndpointName <p>推理服务名称。未激活时与 ModelId 相同。</p>
     */
    public void setEndpointName(String EndpointName) {
        this.EndpointName = EndpointName;
    }

    /**
     * Get <p>模型 ID。</p> 
     * @return ModelId <p>模型 ID。</p>
     */
    public String getModelId() {
        return this.ModelId;
    }

    /**
     * Set <p>模型 ID。</p>
     * @param ModelId <p>模型 ID。</p>
     */
    public void setModelId(String ModelId) {
        this.ModelId = ModelId;
    }

    /**
     * Get <p>模型名称。</p> 
     * @return ModelName <p>模型名称。</p>
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set <p>模型名称。</p>
     * @param ModelName <p>模型名称。</p>
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get <p>状态。取值：ACTIVE（运行中）、INACTIVE（已停止）。</p> 
     * @return Status <p>状态。取值：ACTIVE（运行中）、INACTIVE（已停止）。</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态。取值：ACTIVE（运行中）、INACTIVE（已停止）。</p>
     * @param Status <p>状态。取值：ACTIVE（运行中）、INACTIVE（已停止）。</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>服务类型。固定为 TEXT_GENERATION（文本生成）。</p> 
     * @return ServiceType <p>服务类型。固定为 TEXT_GENERATION（文本生成）。</p>
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set <p>服务类型。固定为 TEXT_GENERATION（文本生成）。</p>
     * @param ServiceType <p>服务类型。固定为 TEXT_GENERATION（文本生成）。</p>
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get <p>计费方式。取值：FREE（免费体验）、TOKEN（按 Token 计费）。未激活时为空。</p> 
     * @return ChargeType <p>计费方式。取值：FREE（免费体验）、TOKEN（按 Token 计费）。未激活时为空。</p>
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set <p>计费方式。取值：FREE（免费体验）、TOKEN（按 Token 计费）。未激活时为空。</p>
     * @param ChargeType <p>计费方式。取值：FREE（免费体验）、TOKEN（按 Token 计费）。未激活时为空。</p>
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get <p>是否已开启后付费。true 表示已开启，false 表示未开启。未激活时为 false。</p> 
     * @return PaymentEnabled <p>是否已开启后付费。true 表示已开启，false 表示未开启。未激活时为 false。</p>
     */
    public Boolean getPaymentEnabled() {
        return this.PaymentEnabled;
    }

    /**
     * Set <p>是否已开启后付费。true 表示已开启，false 表示未开启。未激活时为 false。</p>
     * @param PaymentEnabled <p>是否已开启后付费。true 表示已开启，false 表示未开启。未激活时为 false。</p>
     */
    public void setPaymentEnabled(Boolean PaymentEnabled) {
        this.PaymentEnabled = PaymentEnabled;
    }

    /**
     * Get <p>计费详情信息，JSON 格式字符串，包含免费额度用量等信息。未激活时为空。</p> 
     * @return ChargeDetail <p>计费详情信息，JSON 格式字符串，包含免费额度用量等信息。未激活时为空。</p>
     */
    public String getChargeDetail() {
        return this.ChargeDetail;
    }

    /**
     * Set <p>计费详情信息，JSON 格式字符串，包含免费额度用量等信息。未激活时为空。</p>
     * @param ChargeDetail <p>计费详情信息，JSON 格式字符串，包含免费额度用量等信息。未激活时为空。</p>
     */
    public void setChargeDetail(String ChargeDetail) {
        this.ChargeDetail = ChargeDetail;
    }

    /**
     * Get <p>停止原因。当状态为 INACTIVE 时返回。取值：FREE_QUOTA_EXHAUSTED（免费额度已用尽）、NO_FREE_PACKAGE（无可用免费包）、INSUFFICIENT_BALANCE（余额不足）、BILLING_ISOLATED（账户欠费隔离）、INTERNAL_ERROR（内部错误）。</p> 
     * @return StopReason <p>停止原因。当状态为 INACTIVE 时返回。取值：FREE_QUOTA_EXHAUSTED（免费额度已用尽）、NO_FREE_PACKAGE（无可用免费包）、INSUFFICIENT_BALANCE（余额不足）、BILLING_ISOLATED（账户欠费隔离）、INTERNAL_ERROR（内部错误）。</p>
     */
    public String getStopReason() {
        return this.StopReason;
    }

    /**
     * Set <p>停止原因。当状态为 INACTIVE 时返回。取值：FREE_QUOTA_EXHAUSTED（免费额度已用尽）、NO_FREE_PACKAGE（无可用免费包）、INSUFFICIENT_BALANCE（余额不足）、BILLING_ISOLATED（账户欠费隔离）、INTERNAL_ERROR（内部错误）。</p>
     * @param StopReason <p>停止原因。当状态为 INACTIVE 时返回。取值：FREE_QUOTA_EXHAUSTED（免费额度已用尽）、NO_FREE_PACKAGE（无可用免费包）、INSUFFICIENT_BALANCE（余额不足）、BILLING_ISOLATED（账户欠费隔离）、INTERNAL_ERROR（内部错误）。</p>
     */
    public void setStopReason(String StopReason) {
        this.StopReason = StopReason;
    }

    /**
     * Get <p>推理服务的 rpm 限制，没设置就按模型维度 rpm 限制展示</p> 
     * @return RPM <p>推理服务的 rpm 限制，没设置就按模型维度 rpm 限制展示</p>
     */
    public Long getRPM() {
        return this.RPM;
    }

    /**
     * Set <p>推理服务的 rpm 限制，没设置就按模型维度 rpm 限制展示</p>
     * @param RPM <p>推理服务的 rpm 限制，没设置就按模型维度 rpm 限制展示</p>
     */
    public void setRPM(Long RPM) {
        this.RPM = RPM;
    }

    /**
     * Get <p>推理服务的tpm 限制，没设置就按模型维度 tpm 限制展示</p> 
     * @return TPM <p>推理服务的tpm 限制，没设置就按模型维度 tpm 限制展示</p>
     */
    public Long getTPM() {
        return this.TPM;
    }

    /**
     * Set <p>推理服务的tpm 限制，没设置就按模型维度 tpm 限制展示</p>
     * @param TPM <p>推理服务的tpm 限制，没设置就按模型维度 tpm 限制展示</p>
     */
    public void setTPM(Long TPM) {
        this.TPM = TPM;
    }

    public ModelEndpointView() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModelEndpointView(ModelEndpointView source) {
        if (source.EndpointId != null) {
            this.EndpointId = new String(source.EndpointId);
        }
        if (source.EndpointName != null) {
            this.EndpointName = new String(source.EndpointName);
        }
        if (source.ModelId != null) {
            this.ModelId = new String(source.ModelId);
        }
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.ChargeType != null) {
            this.ChargeType = new String(source.ChargeType);
        }
        if (source.PaymentEnabled != null) {
            this.PaymentEnabled = new Boolean(source.PaymentEnabled);
        }
        if (source.ChargeDetail != null) {
            this.ChargeDetail = new String(source.ChargeDetail);
        }
        if (source.StopReason != null) {
            this.StopReason = new String(source.StopReason);
        }
        if (source.RPM != null) {
            this.RPM = new Long(source.RPM);
        }
        if (source.TPM != null) {
            this.TPM = new Long(source.TPM);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EndpointId", this.EndpointId);
        this.setParamSimple(map, prefix + "EndpointName", this.EndpointName);
        this.setParamSimple(map, prefix + "ModelId", this.ModelId);
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "PaymentEnabled", this.PaymentEnabled);
        this.setParamSimple(map, prefix + "ChargeDetail", this.ChargeDetail);
        this.setParamSimple(map, prefix + "StopReason", this.StopReason);
        this.setParamSimple(map, prefix + "RPM", this.RPM);
        this.setParamSimple(map, prefix + "TPM", this.TPM);

    }
}

