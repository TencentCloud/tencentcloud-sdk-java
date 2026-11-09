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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModelUsageDetail extends AbstractModel {

    /**
    * <p>API Key 别名或脱敏值；禁止返回明文密钥</p>
    */
    @SerializedName("ApiKeyDisplay")
    @Expose
    private String ApiKeyDisplay;

    /**
    * <p>计费方式；非模型 API 或历史数据可为未指定；后付费不产生 PU</p>
    */
    @SerializedName("BillingType")
    @Expose
    private Long BillingType;

    /**
    * <p>调用类型，来源于计费 scene_billing（与 filter.call_type 对应）</p>
    */
    @SerializedName("CallType")
    @Expose
    private String CallType;

    /**
    * <p>本次调用消耗 PU 量</p>
    */
    @SerializedName("ConsumptionPU")
    @Expose
    private Float ConsumptionPU;

    /**
    * <p>是否默认知识库，仅ResourceType=5（知识库容量）业务下有意义</p>
    */
    @SerializedName("IsDefaultKB")
    @Expose
    private Boolean IsDefaultKB;

    /**
    * <p>模型名称</p>
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * <p>MODEL 域单次调用的消耗计量列表（权威字段）：按单位+label 分项列出每类计量。unit=TOKEN 时 label 区分 Token 子类别（input/output/avg_* /cache_*），label 为空表示 total_tokens；unit=PAGE_COUNT 表示模型消耗页数</p>
    */
    @SerializedName("ResourceConsumptionList")
    @Expose
    private ResourceConsumption [] ResourceConsumptionList;

    /**
     * Get <p>API Key 别名或脱敏值；禁止返回明文密钥</p> 
     * @return ApiKeyDisplay <p>API Key 别名或脱敏值；禁止返回明文密钥</p>
     */
    public String getApiKeyDisplay() {
        return this.ApiKeyDisplay;
    }

    /**
     * Set <p>API Key 别名或脱敏值；禁止返回明文密钥</p>
     * @param ApiKeyDisplay <p>API Key 别名或脱敏值；禁止返回明文密钥</p>
     */
    public void setApiKeyDisplay(String ApiKeyDisplay) {
        this.ApiKeyDisplay = ApiKeyDisplay;
    }

    /**
     * Get <p>计费方式；非模型 API 或历史数据可为未指定；后付费不产生 PU</p> 
     * @return BillingType <p>计费方式；非模型 API 或历史数据可为未指定；后付费不产生 PU</p>
     */
    public Long getBillingType() {
        return this.BillingType;
    }

    /**
     * Set <p>计费方式；非模型 API 或历史数据可为未指定；后付费不产生 PU</p>
     * @param BillingType <p>计费方式；非模型 API 或历史数据可为未指定；后付费不产生 PU</p>
     */
    public void setBillingType(Long BillingType) {
        this.BillingType = BillingType;
    }

    /**
     * Get <p>调用类型，来源于计费 scene_billing（与 filter.call_type 对应）</p> 
     * @return CallType <p>调用类型，来源于计费 scene_billing（与 filter.call_type 对应）</p>
     */
    public String getCallType() {
        return this.CallType;
    }

    /**
     * Set <p>调用类型，来源于计费 scene_billing（与 filter.call_type 对应）</p>
     * @param CallType <p>调用类型，来源于计费 scene_billing（与 filter.call_type 对应）</p>
     */
    public void setCallType(String CallType) {
        this.CallType = CallType;
    }

    /**
     * Get <p>本次调用消耗 PU 量</p> 
     * @return ConsumptionPU <p>本次调用消耗 PU 量</p>
     */
    public Float getConsumptionPU() {
        return this.ConsumptionPU;
    }

    /**
     * Set <p>本次调用消耗 PU 量</p>
     * @param ConsumptionPU <p>本次调用消耗 PU 量</p>
     */
    public void setConsumptionPU(Float ConsumptionPU) {
        this.ConsumptionPU = ConsumptionPU;
    }

    /**
     * Get <p>是否默认知识库，仅ResourceType=5（知识库容量）业务下有意义</p> 
     * @return IsDefaultKB <p>是否默认知识库，仅ResourceType=5（知识库容量）业务下有意义</p>
     */
    public Boolean getIsDefaultKB() {
        return this.IsDefaultKB;
    }

    /**
     * Set <p>是否默认知识库，仅ResourceType=5（知识库容量）业务下有意义</p>
     * @param IsDefaultKB <p>是否默认知识库，仅ResourceType=5（知识库容量）业务下有意义</p>
     */
    public void setIsDefaultKB(Boolean IsDefaultKB) {
        this.IsDefaultKB = IsDefaultKB;
    }

    /**
     * Get <p>模型名称</p> 
     * @return ModelName <p>模型名称</p>
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set <p>模型名称</p>
     * @param ModelName <p>模型名称</p>
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get <p>MODEL 域单次调用的消耗计量列表（权威字段）：按单位+label 分项列出每类计量。unit=TOKEN 时 label 区分 Token 子类别（input/output/avg_* /cache_*），label 为空表示 total_tokens；unit=PAGE_COUNT 表示模型消耗页数</p> 
     * @return ResourceConsumptionList <p>MODEL 域单次调用的消耗计量列表（权威字段）：按单位+label 分项列出每类计量。unit=TOKEN 时 label 区分 Token 子类别（input/output/avg_* /cache_*），label 为空表示 total_tokens；unit=PAGE_COUNT 表示模型消耗页数</p>
     */
    public ResourceConsumption [] getResourceConsumptionList() {
        return this.ResourceConsumptionList;
    }

    /**
     * Set <p>MODEL 域单次调用的消耗计量列表（权威字段）：按单位+label 分项列出每类计量。unit=TOKEN 时 label 区分 Token 子类别（input/output/avg_* /cache_*），label 为空表示 total_tokens；unit=PAGE_COUNT 表示模型消耗页数</p>
     * @param ResourceConsumptionList <p>MODEL 域单次调用的消耗计量列表（权威字段）：按单位+label 分项列出每类计量。unit=TOKEN 时 label 区分 Token 子类别（input/output/avg_* /cache_*），label 为空表示 total_tokens；unit=PAGE_COUNT 表示模型消耗页数</p>
     */
    public void setResourceConsumptionList(ResourceConsumption [] ResourceConsumptionList) {
        this.ResourceConsumptionList = ResourceConsumptionList;
    }

    public ModelUsageDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModelUsageDetail(ModelUsageDetail source) {
        if (source.ApiKeyDisplay != null) {
            this.ApiKeyDisplay = new String(source.ApiKeyDisplay);
        }
        if (source.BillingType != null) {
            this.BillingType = new Long(source.BillingType);
        }
        if (source.CallType != null) {
            this.CallType = new String(source.CallType);
        }
        if (source.ConsumptionPU != null) {
            this.ConsumptionPU = new Float(source.ConsumptionPU);
        }
        if (source.IsDefaultKB != null) {
            this.IsDefaultKB = new Boolean(source.IsDefaultKB);
        }
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.ResourceConsumptionList != null) {
            this.ResourceConsumptionList = new ResourceConsumption[source.ResourceConsumptionList.length];
            for (int i = 0; i < source.ResourceConsumptionList.length; i++) {
                this.ResourceConsumptionList[i] = new ResourceConsumption(source.ResourceConsumptionList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApiKeyDisplay", this.ApiKeyDisplay);
        this.setParamSimple(map, prefix + "BillingType", this.BillingType);
        this.setParamSimple(map, prefix + "CallType", this.CallType);
        this.setParamSimple(map, prefix + "ConsumptionPU", this.ConsumptionPU);
        this.setParamSimple(map, prefix + "IsDefaultKB", this.IsDefaultKB);
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamArrayObj(map, prefix + "ResourceConsumptionList.", this.ResourceConsumptionList);

    }
}

