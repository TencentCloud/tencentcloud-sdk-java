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
    * <p>模型id别名列表</p>
    */
    @SerializedName("ExtraModelIds")
    @Expose
    private String [] ExtraModelIds;

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
    * <p>模型状态</p><p>枚举值：</p><ul><li>online： 在线</li><li>pre-offline： 预下线</li><li>discontinued： 停止新购</li><li>maintenance： 维护中</li><li>offline： 下线</li></ul>
    */
    @SerializedName("ModelStatus")
    @Expose
    private String ModelStatus;

    /**
    * <p>模型计费单位（模型维度属性，区别于计费方式 ChargeType）。取值：TOKEN（词元）、COUNT（次）、CREDIT（积分）、PICTURE（张）。未激活时为空。</p>
    */
    @SerializedName("ModelChargeUnit")
    @Expose
    private String ModelChargeUnit;

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
    * <p>模型图标。</p>
    */
    @SerializedName("ModelImage")
    @Expose
    private ModelImage ModelImage;

    /**
    * <p>模型下线时间，Status=pre-offline 时，会配置模型下线时间</p>
    */
    @SerializedName("OfflineAt")
    @Expose
    private String OfflineAt;

    /**
    * <p>停止新购时间</p>
    */
    @SerializedName("DiscontinuedAt")
    @Expose
    private String DiscontinuedAt;

    /**
    * <p>是否参与夜间折扣。true 表示该接入点参与夜间时段折扣计费，false 表示不参与。</p>
    */
    @SerializedName("NightDiscountEnabled")
    @Expose
    private Boolean NightDiscountEnabled;

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
     * Get <p>模型id别名列表</p> 
     * @return ExtraModelIds <p>模型id别名列表</p>
     */
    public String [] getExtraModelIds() {
        return this.ExtraModelIds;
    }

    /**
     * Set <p>模型id别名列表</p>
     * @param ExtraModelIds <p>模型id别名列表</p>
     */
    public void setExtraModelIds(String [] ExtraModelIds) {
        this.ExtraModelIds = ExtraModelIds;
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
     * Get <p>模型状态</p><p>枚举值：</p><ul><li>online： 在线</li><li>pre-offline： 预下线</li><li>discontinued： 停止新购</li><li>maintenance： 维护中</li><li>offline： 下线</li></ul> 
     * @return ModelStatus <p>模型状态</p><p>枚举值：</p><ul><li>online： 在线</li><li>pre-offline： 预下线</li><li>discontinued： 停止新购</li><li>maintenance： 维护中</li><li>offline： 下线</li></ul>
     */
    public String getModelStatus() {
        return this.ModelStatus;
    }

    /**
     * Set <p>模型状态</p><p>枚举值：</p><ul><li>online： 在线</li><li>pre-offline： 预下线</li><li>discontinued： 停止新购</li><li>maintenance： 维护中</li><li>offline： 下线</li></ul>
     * @param ModelStatus <p>模型状态</p><p>枚举值：</p><ul><li>online： 在线</li><li>pre-offline： 预下线</li><li>discontinued： 停止新购</li><li>maintenance： 维护中</li><li>offline： 下线</li></ul>
     */
    public void setModelStatus(String ModelStatus) {
        this.ModelStatus = ModelStatus;
    }

    /**
     * Get <p>模型计费单位（模型维度属性，区别于计费方式 ChargeType）。取值：TOKEN（词元）、COUNT（次）、CREDIT（积分）、PICTURE（张）。未激活时为空。</p> 
     * @return ModelChargeUnit <p>模型计费单位（模型维度属性，区别于计费方式 ChargeType）。取值：TOKEN（词元）、COUNT（次）、CREDIT（积分）、PICTURE（张）。未激活时为空。</p>
     */
    public String getModelChargeUnit() {
        return this.ModelChargeUnit;
    }

    /**
     * Set <p>模型计费单位（模型维度属性，区别于计费方式 ChargeType）。取值：TOKEN（词元）、COUNT（次）、CREDIT（积分）、PICTURE（张）。未激活时为空。</p>
     * @param ModelChargeUnit <p>模型计费单位（模型维度属性，区别于计费方式 ChargeType）。取值：TOKEN（词元）、COUNT（次）、CREDIT（积分）、PICTURE（张）。未激活时为空。</p>
     */
    public void setModelChargeUnit(String ModelChargeUnit) {
        this.ModelChargeUnit = ModelChargeUnit;
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

    /**
     * Get <p>模型图标。</p> 
     * @return ModelImage <p>模型图标。</p>
     */
    public ModelImage getModelImage() {
        return this.ModelImage;
    }

    /**
     * Set <p>模型图标。</p>
     * @param ModelImage <p>模型图标。</p>
     */
    public void setModelImage(ModelImage ModelImage) {
        this.ModelImage = ModelImage;
    }

    /**
     * Get <p>模型下线时间，Status=pre-offline 时，会配置模型下线时间</p> 
     * @return OfflineAt <p>模型下线时间，Status=pre-offline 时，会配置模型下线时间</p>
     */
    public String getOfflineAt() {
        return this.OfflineAt;
    }

    /**
     * Set <p>模型下线时间，Status=pre-offline 时，会配置模型下线时间</p>
     * @param OfflineAt <p>模型下线时间，Status=pre-offline 时，会配置模型下线时间</p>
     */
    public void setOfflineAt(String OfflineAt) {
        this.OfflineAt = OfflineAt;
    }

    /**
     * Get <p>停止新购时间</p> 
     * @return DiscontinuedAt <p>停止新购时间</p>
     */
    public String getDiscontinuedAt() {
        return this.DiscontinuedAt;
    }

    /**
     * Set <p>停止新购时间</p>
     * @param DiscontinuedAt <p>停止新购时间</p>
     */
    public void setDiscontinuedAt(String DiscontinuedAt) {
        this.DiscontinuedAt = DiscontinuedAt;
    }

    /**
     * Get <p>是否参与夜间折扣。true 表示该接入点参与夜间时段折扣计费，false 表示不参与。</p> 
     * @return NightDiscountEnabled <p>是否参与夜间折扣。true 表示该接入点参与夜间时段折扣计费，false 表示不参与。</p>
     */
    public Boolean getNightDiscountEnabled() {
        return this.NightDiscountEnabled;
    }

    /**
     * Set <p>是否参与夜间折扣。true 表示该接入点参与夜间时段折扣计费，false 表示不参与。</p>
     * @param NightDiscountEnabled <p>是否参与夜间折扣。true 表示该接入点参与夜间时段折扣计费，false 表示不参与。</p>
     */
    public void setNightDiscountEnabled(Boolean NightDiscountEnabled) {
        this.NightDiscountEnabled = NightDiscountEnabled;
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
        if (source.ExtraModelIds != null) {
            this.ExtraModelIds = new String[source.ExtraModelIds.length];
            for (int i = 0; i < source.ExtraModelIds.length; i++) {
                this.ExtraModelIds[i] = new String(source.ExtraModelIds[i]);
            }
        }
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ModelStatus != null) {
            this.ModelStatus = new String(source.ModelStatus);
        }
        if (source.ModelChargeUnit != null) {
            this.ModelChargeUnit = new String(source.ModelChargeUnit);
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
        if (source.ModelImage != null) {
            this.ModelImage = new ModelImage(source.ModelImage);
        }
        if (source.OfflineAt != null) {
            this.OfflineAt = new String(source.OfflineAt);
        }
        if (source.DiscontinuedAt != null) {
            this.DiscontinuedAt = new String(source.DiscontinuedAt);
        }
        if (source.NightDiscountEnabled != null) {
            this.NightDiscountEnabled = new Boolean(source.NightDiscountEnabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EndpointId", this.EndpointId);
        this.setParamSimple(map, prefix + "EndpointName", this.EndpointName);
        this.setParamSimple(map, prefix + "ModelId", this.ModelId);
        this.setParamArraySimple(map, prefix + "ExtraModelIds.", this.ExtraModelIds);
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ModelStatus", this.ModelStatus);
        this.setParamSimple(map, prefix + "ModelChargeUnit", this.ModelChargeUnit);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "PaymentEnabled", this.PaymentEnabled);
        this.setParamSimple(map, prefix + "ChargeDetail", this.ChargeDetail);
        this.setParamSimple(map, prefix + "StopReason", this.StopReason);
        this.setParamSimple(map, prefix + "RPM", this.RPM);
        this.setParamSimple(map, prefix + "TPM", this.TPM);
        this.setParamObj(map, prefix + "ModelImage.", this.ModelImage);
        this.setParamSimple(map, prefix + "OfflineAt", this.OfflineAt);
        this.setParamSimple(map, prefix + "DiscontinuedAt", this.DiscontinuedAt);
        this.setParamSimple(map, prefix + "NightDiscountEnabled", this.NightDiscountEnabled);

    }
}

