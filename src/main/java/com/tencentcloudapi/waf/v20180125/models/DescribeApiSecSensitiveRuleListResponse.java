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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeApiSecSensitiveRuleListResponse extends AbstractModel {

    /**
    * <p>api敏感规则列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Data")
    @Expose
    private ApiSecSensitiveRule [] Data;

    /**
    * <p>规则数量</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * <p>自定义敏感检测规则总开关</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>非内置规则的rulename列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleNameList")
    @Expose
    private String [] RuleNameList;

    /**
    * <p>api提取规则列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApiExtractRule")
    @Expose
    private ApiSecExtractRule [] ApiExtractRule;

    /**
    * <p>api鉴权规则列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApiSecPrivilegeRule")
    @Expose
    private ApiSecPrivilegeRule [] ApiSecPrivilegeRule;

    /**
    * <p>api场景规则列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApiSecSceneRule")
    @Expose
    private ApiSecSceneRule [] ApiSecSceneRule;

    /**
    * <p>自定义事件规则</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApiSecCustomEventRule")
    @Expose
    private ApiSecCustomEventRule [] ApiSecCustomEventRule;

    /**
    * <p>无效api排除规则列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApiExcludeRule")
    @Expose
    private ApiSecExcludeRule [] ApiExcludeRule;

    /**
    * <p>敏感数据加白规则列表</p>
    */
    @SerializedName("ApiSecSensitiveWhiteRule")
    @Expose
    private ApiSecSensitiveWhiteRule [] ApiSecSensitiveWhiteRule;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>api敏感规则列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Data <p>api敏感规则列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ApiSecSensitiveRule [] getData() {
        return this.Data;
    }

    /**
     * Set <p>api敏感规则列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Data <p>api敏感规则列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setData(ApiSecSensitiveRule [] Data) {
        this.Data = Data;
    }

    /**
     * Get <p>规则数量</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Total <p>规则数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set <p>规则数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Total <p>规则数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get <p>自定义敏感检测规则总开关</p> 
     * @return Status <p>自定义敏感检测规则总开关</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>自定义敏感检测规则总开关</p>
     * @param Status <p>自定义敏感检测规则总开关</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>非内置规则的rulename列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleNameList <p>非内置规则的rulename列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getRuleNameList() {
        return this.RuleNameList;
    }

    /**
     * Set <p>非内置规则的rulename列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleNameList <p>非内置规则的rulename列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleNameList(String [] RuleNameList) {
        this.RuleNameList = RuleNameList;
    }

    /**
     * Get <p>api提取规则列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApiExtractRule <p>api提取规则列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ApiSecExtractRule [] getApiExtractRule() {
        return this.ApiExtractRule;
    }

    /**
     * Set <p>api提取规则列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApiExtractRule <p>api提取规则列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApiExtractRule(ApiSecExtractRule [] ApiExtractRule) {
        this.ApiExtractRule = ApiExtractRule;
    }

    /**
     * Get <p>api鉴权规则列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApiSecPrivilegeRule <p>api鉴权规则列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ApiSecPrivilegeRule [] getApiSecPrivilegeRule() {
        return this.ApiSecPrivilegeRule;
    }

    /**
     * Set <p>api鉴权规则列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApiSecPrivilegeRule <p>api鉴权规则列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApiSecPrivilegeRule(ApiSecPrivilegeRule [] ApiSecPrivilegeRule) {
        this.ApiSecPrivilegeRule = ApiSecPrivilegeRule;
    }

    /**
     * Get <p>api场景规则列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApiSecSceneRule <p>api场景规则列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ApiSecSceneRule [] getApiSecSceneRule() {
        return this.ApiSecSceneRule;
    }

    /**
     * Set <p>api场景规则列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApiSecSceneRule <p>api场景规则列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApiSecSceneRule(ApiSecSceneRule [] ApiSecSceneRule) {
        this.ApiSecSceneRule = ApiSecSceneRule;
    }

    /**
     * Get <p>自定义事件规则</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApiSecCustomEventRule <p>自定义事件规则</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ApiSecCustomEventRule [] getApiSecCustomEventRule() {
        return this.ApiSecCustomEventRule;
    }

    /**
     * Set <p>自定义事件规则</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApiSecCustomEventRule <p>自定义事件规则</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApiSecCustomEventRule(ApiSecCustomEventRule [] ApiSecCustomEventRule) {
        this.ApiSecCustomEventRule = ApiSecCustomEventRule;
    }

    /**
     * Get <p>无效api排除规则列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApiExcludeRule <p>无效api排除规则列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ApiSecExcludeRule [] getApiExcludeRule() {
        return this.ApiExcludeRule;
    }

    /**
     * Set <p>无效api排除规则列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApiExcludeRule <p>无效api排除规则列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApiExcludeRule(ApiSecExcludeRule [] ApiExcludeRule) {
        this.ApiExcludeRule = ApiExcludeRule;
    }

    /**
     * Get <p>敏感数据加白规则列表</p> 
     * @return ApiSecSensitiveWhiteRule <p>敏感数据加白规则列表</p>
     */
    public ApiSecSensitiveWhiteRule [] getApiSecSensitiveWhiteRule() {
        return this.ApiSecSensitiveWhiteRule;
    }

    /**
     * Set <p>敏感数据加白规则列表</p>
     * @param ApiSecSensitiveWhiteRule <p>敏感数据加白规则列表</p>
     */
    public void setApiSecSensitiveWhiteRule(ApiSecSensitiveWhiteRule [] ApiSecSensitiveWhiteRule) {
        this.ApiSecSensitiveWhiteRule = ApiSecSensitiveWhiteRule;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeApiSecSensitiveRuleListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApiSecSensitiveRuleListResponse(DescribeApiSecSensitiveRuleListResponse source) {
        if (source.Data != null) {
            this.Data = new ApiSecSensitiveRule[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new ApiSecSensitiveRule(source.Data[i]);
            }
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.RuleNameList != null) {
            this.RuleNameList = new String[source.RuleNameList.length];
            for (int i = 0; i < source.RuleNameList.length; i++) {
                this.RuleNameList[i] = new String(source.RuleNameList[i]);
            }
        }
        if (source.ApiExtractRule != null) {
            this.ApiExtractRule = new ApiSecExtractRule[source.ApiExtractRule.length];
            for (int i = 0; i < source.ApiExtractRule.length; i++) {
                this.ApiExtractRule[i] = new ApiSecExtractRule(source.ApiExtractRule[i]);
            }
        }
        if (source.ApiSecPrivilegeRule != null) {
            this.ApiSecPrivilegeRule = new ApiSecPrivilegeRule[source.ApiSecPrivilegeRule.length];
            for (int i = 0; i < source.ApiSecPrivilegeRule.length; i++) {
                this.ApiSecPrivilegeRule[i] = new ApiSecPrivilegeRule(source.ApiSecPrivilegeRule[i]);
            }
        }
        if (source.ApiSecSceneRule != null) {
            this.ApiSecSceneRule = new ApiSecSceneRule[source.ApiSecSceneRule.length];
            for (int i = 0; i < source.ApiSecSceneRule.length; i++) {
                this.ApiSecSceneRule[i] = new ApiSecSceneRule(source.ApiSecSceneRule[i]);
            }
        }
        if (source.ApiSecCustomEventRule != null) {
            this.ApiSecCustomEventRule = new ApiSecCustomEventRule[source.ApiSecCustomEventRule.length];
            for (int i = 0; i < source.ApiSecCustomEventRule.length; i++) {
                this.ApiSecCustomEventRule[i] = new ApiSecCustomEventRule(source.ApiSecCustomEventRule[i]);
            }
        }
        if (source.ApiExcludeRule != null) {
            this.ApiExcludeRule = new ApiSecExcludeRule[source.ApiExcludeRule.length];
            for (int i = 0; i < source.ApiExcludeRule.length; i++) {
                this.ApiExcludeRule[i] = new ApiSecExcludeRule(source.ApiExcludeRule[i]);
            }
        }
        if (source.ApiSecSensitiveWhiteRule != null) {
            this.ApiSecSensitiveWhiteRule = new ApiSecSensitiveWhiteRule[source.ApiSecSensitiveWhiteRule.length];
            for (int i = 0; i < source.ApiSecSensitiveWhiteRule.length; i++) {
                this.ApiSecSensitiveWhiteRule[i] = new ApiSecSensitiveWhiteRule(source.ApiSecSensitiveWhiteRule[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "RuleNameList.", this.RuleNameList);
        this.setParamArrayObj(map, prefix + "ApiExtractRule.", this.ApiExtractRule);
        this.setParamArrayObj(map, prefix + "ApiSecPrivilegeRule.", this.ApiSecPrivilegeRule);
        this.setParamArrayObj(map, prefix + "ApiSecSceneRule.", this.ApiSecSceneRule);
        this.setParamArrayObj(map, prefix + "ApiSecCustomEventRule.", this.ApiSecCustomEventRule);
        this.setParamArrayObj(map, prefix + "ApiExcludeRule.", this.ApiExcludeRule);
        this.setParamArrayObj(map, prefix + "ApiSecSensitiveWhiteRule.", this.ApiSecSensitiveWhiteRule);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

