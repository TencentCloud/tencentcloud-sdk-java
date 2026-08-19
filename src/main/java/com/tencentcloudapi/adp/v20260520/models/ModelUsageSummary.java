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

public class ModelUsageSummary extends AbstractModel {

    /**
    * <p>调用次数（业务调用维度的顶层计数）</p>
    */
    @SerializedName("CallCount")
    @Expose
    private Float CallCount;

    /**
    * <p>是否默认知识库</p>
    */
    @SerializedName("IsDefaultKB")
    @Expose
    private Boolean IsDefaultKB;

    /**
    * <p>模型名称，标识使用的 AI 模型</p>
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * <p>MODEL 域消耗计量列表（权威字段）：按单位+label 分项列出每类计量。unit=TOKEN 时 label 区分 Token 子类别（input/output/avg_* /cache_*），label 为空表示 total_tokens；unit=PAGE_COUNT 表示模型消耗页数</p>
    */
    @SerializedName("ResourceConsumptionList")
    @Expose
    private ResourceConsumption [] ResourceConsumptionList;

    /**
    * <p>模型消耗 PU 总量（聚合维度内的 PU 消耗之和）</p>
    */
    @SerializedName("ConsumptionPU")
    @Expose
    private Float ConsumptionPU;

    /**
     * Get <p>调用次数（业务调用维度的顶层计数）</p> 
     * @return CallCount <p>调用次数（业务调用维度的顶层计数）</p>
     */
    public Float getCallCount() {
        return this.CallCount;
    }

    /**
     * Set <p>调用次数（业务调用维度的顶层计数）</p>
     * @param CallCount <p>调用次数（业务调用维度的顶层计数）</p>
     */
    public void setCallCount(Float CallCount) {
        this.CallCount = CallCount;
    }

    /**
     * Get <p>是否默认知识库</p> 
     * @return IsDefaultKB <p>是否默认知识库</p>
     */
    public Boolean getIsDefaultKB() {
        return this.IsDefaultKB;
    }

    /**
     * Set <p>是否默认知识库</p>
     * @param IsDefaultKB <p>是否默认知识库</p>
     */
    public void setIsDefaultKB(Boolean IsDefaultKB) {
        this.IsDefaultKB = IsDefaultKB;
    }

    /**
     * Get <p>模型名称，标识使用的 AI 模型</p> 
     * @return ModelName <p>模型名称，标识使用的 AI 模型</p>
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set <p>模型名称，标识使用的 AI 模型</p>
     * @param ModelName <p>模型名称，标识使用的 AI 模型</p>
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get <p>MODEL 域消耗计量列表（权威字段）：按单位+label 分项列出每类计量。unit=TOKEN 时 label 区分 Token 子类别（input/output/avg_* /cache_*），label 为空表示 total_tokens；unit=PAGE_COUNT 表示模型消耗页数</p> 
     * @return ResourceConsumptionList <p>MODEL 域消耗计量列表（权威字段）：按单位+label 分项列出每类计量。unit=TOKEN 时 label 区分 Token 子类别（input/output/avg_* /cache_*），label 为空表示 total_tokens；unit=PAGE_COUNT 表示模型消耗页数</p>
     */
    public ResourceConsumption [] getResourceConsumptionList() {
        return this.ResourceConsumptionList;
    }

    /**
     * Set <p>MODEL 域消耗计量列表（权威字段）：按单位+label 分项列出每类计量。unit=TOKEN 时 label 区分 Token 子类别（input/output/avg_* /cache_*），label 为空表示 total_tokens；unit=PAGE_COUNT 表示模型消耗页数</p>
     * @param ResourceConsumptionList <p>MODEL 域消耗计量列表（权威字段）：按单位+label 分项列出每类计量。unit=TOKEN 时 label 区分 Token 子类别（input/output/avg_* /cache_*），label 为空表示 total_tokens；unit=PAGE_COUNT 表示模型消耗页数</p>
     */
    public void setResourceConsumptionList(ResourceConsumption [] ResourceConsumptionList) {
        this.ResourceConsumptionList = ResourceConsumptionList;
    }

    /**
     * Get <p>模型消耗 PU 总量（聚合维度内的 PU 消耗之和）</p> 
     * @return ConsumptionPU <p>模型消耗 PU 总量（聚合维度内的 PU 消耗之和）</p>
     */
    public Float getConsumptionPU() {
        return this.ConsumptionPU;
    }

    /**
     * Set <p>模型消耗 PU 总量（聚合维度内的 PU 消耗之和）</p>
     * @param ConsumptionPU <p>模型消耗 PU 总量（聚合维度内的 PU 消耗之和）</p>
     */
    public void setConsumptionPU(Float ConsumptionPU) {
        this.ConsumptionPU = ConsumptionPU;
    }

    public ModelUsageSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModelUsageSummary(ModelUsageSummary source) {
        if (source.CallCount != null) {
            this.CallCount = new Float(source.CallCount);
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
        if (source.ConsumptionPU != null) {
            this.ConsumptionPU = new Float(source.ConsumptionPU);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CallCount", this.CallCount);
        this.setParamSimple(map, prefix + "IsDefaultKB", this.IsDefaultKB);
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamArrayObj(map, prefix + "ResourceConsumptionList.", this.ResourceConsumptionList);
        this.setParamSimple(map, prefix + "ConsumptionPU", this.ConsumptionPU);

    }
}

