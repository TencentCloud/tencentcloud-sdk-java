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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AIGWIntentRoute extends AbstractModel {

    /**
    * <p>意图识别模型id</p>
    */
    @SerializedName("IntentModelServiceId")
    @Expose
    private String IntentModelServiceId;

    /**
    * <p>置信度</p>
    */
    @SerializedName("ConfidenceThreshold")
    @Expose
    private Float ConfidenceThreshold;

    /**
    * <p>默认服务id</p>
    */
    @SerializedName("DefaultModelServiceId")
    @Expose
    private String DefaultModelServiceId;

    /**
    * <p>规则</p>
    */
    @SerializedName("Rules")
    @Expose
    private AIGWIntentRouteRule [] Rules;

    /**
    * <p>默认路由目标 DefaultModelServiceId 对应的标准模型名称；为空表示未配置。仅对应 TIONE 模型服务时可配置。非空值最长 256 字节，支持中文、英文、数字、下划线和短横线，须以中文、英文或数字开头。同一网关内不同模型 API 不得使用相同的标准模型名称；同一模型 API 内同一模型服务在多处配置时须保持一致。</p>
    */
    @SerializedName("DefaultStandardModelName")
    @Expose
    private String DefaultStandardModelName;

    /**
    * <p>执行意图识别的 IntentModelServiceId 对应的标准模型名称；为空表示未配置。仅对应 TIONE 模型服务时可配置。非空值最长 256 字节，支持中文、英文、数字、下划线和短横线，须以中文、英文或数字开头。同一网关内不同模型 API 不得使用相同的标准模型名称；同一模型 API 内同一模型服务在多处配置时须保持一致。</p>
    */
    @SerializedName("IntentStandardModelName")
    @Expose
    private String IntentStandardModelName;

    /**
     * Get <p>意图识别模型id</p> 
     * @return IntentModelServiceId <p>意图识别模型id</p>
     */
    public String getIntentModelServiceId() {
        return this.IntentModelServiceId;
    }

    /**
     * Set <p>意图识别模型id</p>
     * @param IntentModelServiceId <p>意图识别模型id</p>
     */
    public void setIntentModelServiceId(String IntentModelServiceId) {
        this.IntentModelServiceId = IntentModelServiceId;
    }

    /**
     * Get <p>置信度</p> 
     * @return ConfidenceThreshold <p>置信度</p>
     */
    public Float getConfidenceThreshold() {
        return this.ConfidenceThreshold;
    }

    /**
     * Set <p>置信度</p>
     * @param ConfidenceThreshold <p>置信度</p>
     */
    public void setConfidenceThreshold(Float ConfidenceThreshold) {
        this.ConfidenceThreshold = ConfidenceThreshold;
    }

    /**
     * Get <p>默认服务id</p> 
     * @return DefaultModelServiceId <p>默认服务id</p>
     */
    public String getDefaultModelServiceId() {
        return this.DefaultModelServiceId;
    }

    /**
     * Set <p>默认服务id</p>
     * @param DefaultModelServiceId <p>默认服务id</p>
     */
    public void setDefaultModelServiceId(String DefaultModelServiceId) {
        this.DefaultModelServiceId = DefaultModelServiceId;
    }

    /**
     * Get <p>规则</p> 
     * @return Rules <p>规则</p>
     */
    public AIGWIntentRouteRule [] getRules() {
        return this.Rules;
    }

    /**
     * Set <p>规则</p>
     * @param Rules <p>规则</p>
     */
    public void setRules(AIGWIntentRouteRule [] Rules) {
        this.Rules = Rules;
    }

    /**
     * Get <p>默认路由目标 DefaultModelServiceId 对应的标准模型名称；为空表示未配置。仅对应 TIONE 模型服务时可配置。非空值最长 256 字节，支持中文、英文、数字、下划线和短横线，须以中文、英文或数字开头。同一网关内不同模型 API 不得使用相同的标准模型名称；同一模型 API 内同一模型服务在多处配置时须保持一致。</p> 
     * @return DefaultStandardModelName <p>默认路由目标 DefaultModelServiceId 对应的标准模型名称；为空表示未配置。仅对应 TIONE 模型服务时可配置。非空值最长 256 字节，支持中文、英文、数字、下划线和短横线，须以中文、英文或数字开头。同一网关内不同模型 API 不得使用相同的标准模型名称；同一模型 API 内同一模型服务在多处配置时须保持一致。</p>
     */
    public String getDefaultStandardModelName() {
        return this.DefaultStandardModelName;
    }

    /**
     * Set <p>默认路由目标 DefaultModelServiceId 对应的标准模型名称；为空表示未配置。仅对应 TIONE 模型服务时可配置。非空值最长 256 字节，支持中文、英文、数字、下划线和短横线，须以中文、英文或数字开头。同一网关内不同模型 API 不得使用相同的标准模型名称；同一模型 API 内同一模型服务在多处配置时须保持一致。</p>
     * @param DefaultStandardModelName <p>默认路由目标 DefaultModelServiceId 对应的标准模型名称；为空表示未配置。仅对应 TIONE 模型服务时可配置。非空值最长 256 字节，支持中文、英文、数字、下划线和短横线，须以中文、英文或数字开头。同一网关内不同模型 API 不得使用相同的标准模型名称；同一模型 API 内同一模型服务在多处配置时须保持一致。</p>
     */
    public void setDefaultStandardModelName(String DefaultStandardModelName) {
        this.DefaultStandardModelName = DefaultStandardModelName;
    }

    /**
     * Get <p>执行意图识别的 IntentModelServiceId 对应的标准模型名称；为空表示未配置。仅对应 TIONE 模型服务时可配置。非空值最长 256 字节，支持中文、英文、数字、下划线和短横线，须以中文、英文或数字开头。同一网关内不同模型 API 不得使用相同的标准模型名称；同一模型 API 内同一模型服务在多处配置时须保持一致。</p> 
     * @return IntentStandardModelName <p>执行意图识别的 IntentModelServiceId 对应的标准模型名称；为空表示未配置。仅对应 TIONE 模型服务时可配置。非空值最长 256 字节，支持中文、英文、数字、下划线和短横线，须以中文、英文或数字开头。同一网关内不同模型 API 不得使用相同的标准模型名称；同一模型 API 内同一模型服务在多处配置时须保持一致。</p>
     */
    public String getIntentStandardModelName() {
        return this.IntentStandardModelName;
    }

    /**
     * Set <p>执行意图识别的 IntentModelServiceId 对应的标准模型名称；为空表示未配置。仅对应 TIONE 模型服务时可配置。非空值最长 256 字节，支持中文、英文、数字、下划线和短横线，须以中文、英文或数字开头。同一网关内不同模型 API 不得使用相同的标准模型名称；同一模型 API 内同一模型服务在多处配置时须保持一致。</p>
     * @param IntentStandardModelName <p>执行意图识别的 IntentModelServiceId 对应的标准模型名称；为空表示未配置。仅对应 TIONE 模型服务时可配置。非空值最长 256 字节，支持中文、英文、数字、下划线和短横线，须以中文、英文或数字开头。同一网关内不同模型 API 不得使用相同的标准模型名称；同一模型 API 内同一模型服务在多处配置时须保持一致。</p>
     */
    public void setIntentStandardModelName(String IntentStandardModelName) {
        this.IntentStandardModelName = IntentStandardModelName;
    }

    public AIGWIntentRoute() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIGWIntentRoute(AIGWIntentRoute source) {
        if (source.IntentModelServiceId != null) {
            this.IntentModelServiceId = new String(source.IntentModelServiceId);
        }
        if (source.ConfidenceThreshold != null) {
            this.ConfidenceThreshold = new Float(source.ConfidenceThreshold);
        }
        if (source.DefaultModelServiceId != null) {
            this.DefaultModelServiceId = new String(source.DefaultModelServiceId);
        }
        if (source.Rules != null) {
            this.Rules = new AIGWIntentRouteRule[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new AIGWIntentRouteRule(source.Rules[i]);
            }
        }
        if (source.DefaultStandardModelName != null) {
            this.DefaultStandardModelName = new String(source.DefaultStandardModelName);
        }
        if (source.IntentStandardModelName != null) {
            this.IntentStandardModelName = new String(source.IntentStandardModelName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IntentModelServiceId", this.IntentModelServiceId);
        this.setParamSimple(map, prefix + "ConfidenceThreshold", this.ConfidenceThreshold);
        this.setParamSimple(map, prefix + "DefaultModelServiceId", this.DefaultModelServiceId);
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);
        this.setParamSimple(map, prefix + "DefaultStandardModelName", this.DefaultStandardModelName);
        this.setParamSimple(map, prefix + "IntentStandardModelName", this.IntentStandardModelName);

    }
}

