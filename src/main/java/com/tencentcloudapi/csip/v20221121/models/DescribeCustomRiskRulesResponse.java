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

public class DescribeCustomRiskRulesResponse extends AbstractModel {

    /**
    * <p>风险规则数量</p>
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * <p>风险规则列表</p>
    */
    @SerializedName("RiskRuleList")
    @Expose
    private CustomRiskRuleItem [] RiskRuleList;

    /**
    * <p>云厂商选项</p>
    */
    @SerializedName("ProviderList")
    @Expose
    private AttributeOptionSet [] ProviderList;

    /**
    * <p>资产类型选项</p>
    */
    @SerializedName("AssetTypeList")
    @Expose
    private AttributeOptionSet [] AssetTypeList;

    /**
    * <p>安全条款规范</p>
    */
    @SerializedName("StandardNameList")
    @Expose
    private StandardItem [] StandardNameList;

    /**
    * <p>风险等级</p>
    */
    @SerializedName("RuleSeverityList")
    @Expose
    private RuleStatisticsItem [] RuleSeverityList;

    /**
    * <p>检查类型</p>
    */
    @SerializedName("CheckTypeList")
    @Expose
    private RuleStatisticsItem [] CheckTypeList;

    /**
    * <p>安全分类</p>
    */
    @SerializedName("ClassifyList")
    @Expose
    private RuleStatisticsItem [] ClassifyList;

    /**
    * <p>安全规范</p>
    */
    @SerializedName("StandardList")
    @Expose
    private RuleStatisticsItem [] StandardList;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>风险规则数量</p> 
     * @return TotalCount <p>风险规则数量</p>
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>风险规则数量</p>
     * @param TotalCount <p>风险规则数量</p>
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get <p>风险规则列表</p> 
     * @return RiskRuleList <p>风险规则列表</p>
     */
    public CustomRiskRuleItem [] getRiskRuleList() {
        return this.RiskRuleList;
    }

    /**
     * Set <p>风险规则列表</p>
     * @param RiskRuleList <p>风险规则列表</p>
     */
    public void setRiskRuleList(CustomRiskRuleItem [] RiskRuleList) {
        this.RiskRuleList = RiskRuleList;
    }

    /**
     * Get <p>云厂商选项</p> 
     * @return ProviderList <p>云厂商选项</p>
     */
    public AttributeOptionSet [] getProviderList() {
        return this.ProviderList;
    }

    /**
     * Set <p>云厂商选项</p>
     * @param ProviderList <p>云厂商选项</p>
     */
    public void setProviderList(AttributeOptionSet [] ProviderList) {
        this.ProviderList = ProviderList;
    }

    /**
     * Get <p>资产类型选项</p> 
     * @return AssetTypeList <p>资产类型选项</p>
     */
    public AttributeOptionSet [] getAssetTypeList() {
        return this.AssetTypeList;
    }

    /**
     * Set <p>资产类型选项</p>
     * @param AssetTypeList <p>资产类型选项</p>
     */
    public void setAssetTypeList(AttributeOptionSet [] AssetTypeList) {
        this.AssetTypeList = AssetTypeList;
    }

    /**
     * Get <p>安全条款规范</p> 
     * @return StandardNameList <p>安全条款规范</p>
     */
    public StandardItem [] getStandardNameList() {
        return this.StandardNameList;
    }

    /**
     * Set <p>安全条款规范</p>
     * @param StandardNameList <p>安全条款规范</p>
     */
    public void setStandardNameList(StandardItem [] StandardNameList) {
        this.StandardNameList = StandardNameList;
    }

    /**
     * Get <p>风险等级</p> 
     * @return RuleSeverityList <p>风险等级</p>
     */
    public RuleStatisticsItem [] getRuleSeverityList() {
        return this.RuleSeverityList;
    }

    /**
     * Set <p>风险等级</p>
     * @param RuleSeverityList <p>风险等级</p>
     */
    public void setRuleSeverityList(RuleStatisticsItem [] RuleSeverityList) {
        this.RuleSeverityList = RuleSeverityList;
    }

    /**
     * Get <p>检查类型</p> 
     * @return CheckTypeList <p>检查类型</p>
     */
    public RuleStatisticsItem [] getCheckTypeList() {
        return this.CheckTypeList;
    }

    /**
     * Set <p>检查类型</p>
     * @param CheckTypeList <p>检查类型</p>
     */
    public void setCheckTypeList(RuleStatisticsItem [] CheckTypeList) {
        this.CheckTypeList = CheckTypeList;
    }

    /**
     * Get <p>安全分类</p> 
     * @return ClassifyList <p>安全分类</p>
     */
    public RuleStatisticsItem [] getClassifyList() {
        return this.ClassifyList;
    }

    /**
     * Set <p>安全分类</p>
     * @param ClassifyList <p>安全分类</p>
     */
    public void setClassifyList(RuleStatisticsItem [] ClassifyList) {
        this.ClassifyList = ClassifyList;
    }

    /**
     * Get <p>安全规范</p> 
     * @return StandardList <p>安全规范</p>
     */
    public RuleStatisticsItem [] getStandardList() {
        return this.StandardList;
    }

    /**
     * Set <p>安全规范</p>
     * @param StandardList <p>安全规范</p>
     */
    public void setStandardList(RuleStatisticsItem [] StandardList) {
        this.StandardList = StandardList;
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

    public DescribeCustomRiskRulesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCustomRiskRulesResponse(DescribeCustomRiskRulesResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RiskRuleList != null) {
            this.RiskRuleList = new CustomRiskRuleItem[source.RiskRuleList.length];
            for (int i = 0; i < source.RiskRuleList.length; i++) {
                this.RiskRuleList[i] = new CustomRiskRuleItem(source.RiskRuleList[i]);
            }
        }
        if (source.ProviderList != null) {
            this.ProviderList = new AttributeOptionSet[source.ProviderList.length];
            for (int i = 0; i < source.ProviderList.length; i++) {
                this.ProviderList[i] = new AttributeOptionSet(source.ProviderList[i]);
            }
        }
        if (source.AssetTypeList != null) {
            this.AssetTypeList = new AttributeOptionSet[source.AssetTypeList.length];
            for (int i = 0; i < source.AssetTypeList.length; i++) {
                this.AssetTypeList[i] = new AttributeOptionSet(source.AssetTypeList[i]);
            }
        }
        if (source.StandardNameList != null) {
            this.StandardNameList = new StandardItem[source.StandardNameList.length];
            for (int i = 0; i < source.StandardNameList.length; i++) {
                this.StandardNameList[i] = new StandardItem(source.StandardNameList[i]);
            }
        }
        if (source.RuleSeverityList != null) {
            this.RuleSeverityList = new RuleStatisticsItem[source.RuleSeverityList.length];
            for (int i = 0; i < source.RuleSeverityList.length; i++) {
                this.RuleSeverityList[i] = new RuleStatisticsItem(source.RuleSeverityList[i]);
            }
        }
        if (source.CheckTypeList != null) {
            this.CheckTypeList = new RuleStatisticsItem[source.CheckTypeList.length];
            for (int i = 0; i < source.CheckTypeList.length; i++) {
                this.CheckTypeList[i] = new RuleStatisticsItem(source.CheckTypeList[i]);
            }
        }
        if (source.ClassifyList != null) {
            this.ClassifyList = new RuleStatisticsItem[source.ClassifyList.length];
            for (int i = 0; i < source.ClassifyList.length; i++) {
                this.ClassifyList[i] = new RuleStatisticsItem(source.ClassifyList[i]);
            }
        }
        if (source.StandardList != null) {
            this.StandardList = new RuleStatisticsItem[source.StandardList.length];
            for (int i = 0; i < source.StandardList.length; i++) {
                this.StandardList[i] = new RuleStatisticsItem(source.StandardList[i]);
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
        this.setParamArrayObj(map, prefix + "RiskRuleList.", this.RiskRuleList);
        this.setParamArrayObj(map, prefix + "ProviderList.", this.ProviderList);
        this.setParamArrayObj(map, prefix + "AssetTypeList.", this.AssetTypeList);
        this.setParamArrayObj(map, prefix + "StandardNameList.", this.StandardNameList);
        this.setParamArrayObj(map, prefix + "RuleSeverityList.", this.RuleSeverityList);
        this.setParamArrayObj(map, prefix + "CheckTypeList.", this.CheckTypeList);
        this.setParamArrayObj(map, prefix + "ClassifyList.", this.ClassifyList);
        this.setParamArrayObj(map, prefix + "StandardList.", this.StandardList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

