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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeConfigCheckRulesResponse extends AbstractModel {

    /**
    * 风险规则数量
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 风险规则列表
    */
    @SerializedName("RuleList")
    @Expose
    private RiskRuleInfo [] RuleList;

    /**
    * 云厂商类型选项
    */
    @SerializedName("ProviderList")
    @Expose
    private AttributeOptionSet [] ProviderList;

    /**
    * 风险等级类型选项
    */
    @SerializedName("RiskLevelList")
    @Expose
    private AttributeOptionSet [] RiskLevelList;

    /**
    * 处置分类选项
    */
    @SerializedName("DispositionTypeList")
    @Expose
    private AttributeOptionSet [] DispositionTypeList;

    /**
    * 检查类型选项
    */
    @SerializedName("CheckTypeList")
    @Expose
    private AttributeOptionSet [] CheckTypeList;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 风险规则数量 
     * @return TotalCount 风险规则数量
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 风险规则数量
     * @param TotalCount 风险规则数量
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 风险规则列表 
     * @return RuleList 风险规则列表
     */
    public RiskRuleInfo [] getRuleList() {
        return this.RuleList;
    }

    /**
     * Set 风险规则列表
     * @param RuleList 风险规则列表
     */
    public void setRuleList(RiskRuleInfo [] RuleList) {
        this.RuleList = RuleList;
    }

    /**
     * Get 云厂商类型选项 
     * @return ProviderList 云厂商类型选项
     */
    public AttributeOptionSet [] getProviderList() {
        return this.ProviderList;
    }

    /**
     * Set 云厂商类型选项
     * @param ProviderList 云厂商类型选项
     */
    public void setProviderList(AttributeOptionSet [] ProviderList) {
        this.ProviderList = ProviderList;
    }

    /**
     * Get 风险等级类型选项 
     * @return RiskLevelList 风险等级类型选项
     */
    public AttributeOptionSet [] getRiskLevelList() {
        return this.RiskLevelList;
    }

    /**
     * Set 风险等级类型选项
     * @param RiskLevelList 风险等级类型选项
     */
    public void setRiskLevelList(AttributeOptionSet [] RiskLevelList) {
        this.RiskLevelList = RiskLevelList;
    }

    /**
     * Get 处置分类选项 
     * @return DispositionTypeList 处置分类选项
     */
    public AttributeOptionSet [] getDispositionTypeList() {
        return this.DispositionTypeList;
    }

    /**
     * Set 处置分类选项
     * @param DispositionTypeList 处置分类选项
     */
    public void setDispositionTypeList(AttributeOptionSet [] DispositionTypeList) {
        this.DispositionTypeList = DispositionTypeList;
    }

    /**
     * Get 检查类型选项 
     * @return CheckTypeList 检查类型选项
     */
    public AttributeOptionSet [] getCheckTypeList() {
        return this.CheckTypeList;
    }

    /**
     * Set 检查类型选项
     * @param CheckTypeList 检查类型选项
     */
    public void setCheckTypeList(AttributeOptionSet [] CheckTypeList) {
        this.CheckTypeList = CheckTypeList;
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

    public DescribeConfigCheckRulesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeConfigCheckRulesResponse(DescribeConfigCheckRulesResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RuleList != null) {
            this.RuleList = new RiskRuleInfo[source.RuleList.length];
            for (int i = 0; i < source.RuleList.length; i++) {
                this.RuleList[i] = new RiskRuleInfo(source.RuleList[i]);
            }
        }
        if (source.ProviderList != null) {
            this.ProviderList = new AttributeOptionSet[source.ProviderList.length];
            for (int i = 0; i < source.ProviderList.length; i++) {
                this.ProviderList[i] = new AttributeOptionSet(source.ProviderList[i]);
            }
        }
        if (source.RiskLevelList != null) {
            this.RiskLevelList = new AttributeOptionSet[source.RiskLevelList.length];
            for (int i = 0; i < source.RiskLevelList.length; i++) {
                this.RiskLevelList[i] = new AttributeOptionSet(source.RiskLevelList[i]);
            }
        }
        if (source.DispositionTypeList != null) {
            this.DispositionTypeList = new AttributeOptionSet[source.DispositionTypeList.length];
            for (int i = 0; i < source.DispositionTypeList.length; i++) {
                this.DispositionTypeList[i] = new AttributeOptionSet(source.DispositionTypeList[i]);
            }
        }
        if (source.CheckTypeList != null) {
            this.CheckTypeList = new AttributeOptionSet[source.CheckTypeList.length];
            for (int i = 0; i < source.CheckTypeList.length; i++) {
                this.CheckTypeList[i] = new AttributeOptionSet(source.CheckTypeList[i]);
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "RuleList.", this.RuleList);
        this.setParamArrayObj(map, prefix + "ProviderList.", this.ProviderList);
        this.setParamArrayObj(map, prefix + "RiskLevelList.", this.RiskLevelList);
        this.setParamArrayObj(map, prefix + "DispositionTypeList.", this.DispositionTypeList);
        this.setParamArrayObj(map, prefix + "CheckTypeList.", this.CheckTypeList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

