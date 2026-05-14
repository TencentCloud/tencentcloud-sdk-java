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

public class CheckViewRiskItem extends AbstractModel {

    /**
    * <p>检查项规则ID</p>
    */
    @SerializedName("RiskRuleId")
    @Expose
    private String RiskRuleId;

    /**
    * <p>风险名称</p>
    */
    @SerializedName("RiskTitle")
    @Expose
    private String RiskTitle;

    /**
    * <p>检查类型</p>
    */
    @SerializedName("CheckType")
    @Expose
    private String CheckType;

    /**
    * <p>风险等级</p>
    */
    @SerializedName("Severity")
    @Expose
    private String Severity;

    /**
    * <p>存在1个风险项</p>
    */
    @SerializedName("RiskDesc")
    @Expose
    private String RiskDesc;

    /**
    * <p>首次发现时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>风险更新时间</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>云厂商</p>
    */
    @SerializedName("Provider")
    @Expose
    private String Provider;

    /**
    * <p>风险状态</p>
    */
    @SerializedName("RiskStatus")
    @Expose
    private Long RiskStatus;

    /**
    * <p>受影响资产数量</p>
    */
    @SerializedName("AssetCount")
    @Expose
    private Long AssetCount;

    /**
    * <p>风险数量</p>
    */
    @SerializedName("RiskCount")
    @Expose
    private Long RiskCount;

    /**
    * <p>资产类型</p>
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * <p>事件类型</p>
    */
    @SerializedName("EventType")
    @Expose
    private String EventType;

    /**
    * <p>处置分类</p>
    */
    @SerializedName("Classify")
    @Expose
    private String Classify;

    /**
    * <p>cspm规范条款</p>
    */
    @SerializedName("StandardTerms")
    @Expose
    private StandardTerm [] StandardTerms;

    /**
    * <p>资产类型图标</p>
    */
    @SerializedName("AssetTypeIconURL")
    @Expose
    private String AssetTypeIconURL;

    /**
     * Get <p>检查项规则ID</p> 
     * @return RiskRuleId <p>检查项规则ID</p>
     */
    public String getRiskRuleId() {
        return this.RiskRuleId;
    }

    /**
     * Set <p>检查项规则ID</p>
     * @param RiskRuleId <p>检查项规则ID</p>
     */
    public void setRiskRuleId(String RiskRuleId) {
        this.RiskRuleId = RiskRuleId;
    }

    /**
     * Get <p>风险名称</p> 
     * @return RiskTitle <p>风险名称</p>
     */
    public String getRiskTitle() {
        return this.RiskTitle;
    }

    /**
     * Set <p>风险名称</p>
     * @param RiskTitle <p>风险名称</p>
     */
    public void setRiskTitle(String RiskTitle) {
        this.RiskTitle = RiskTitle;
    }

    /**
     * Get <p>检查类型</p> 
     * @return CheckType <p>检查类型</p>
     */
    public String getCheckType() {
        return this.CheckType;
    }

    /**
     * Set <p>检查类型</p>
     * @param CheckType <p>检查类型</p>
     */
    public void setCheckType(String CheckType) {
        this.CheckType = CheckType;
    }

    /**
     * Get <p>风险等级</p> 
     * @return Severity <p>风险等级</p>
     */
    public String getSeverity() {
        return this.Severity;
    }

    /**
     * Set <p>风险等级</p>
     * @param Severity <p>风险等级</p>
     */
    public void setSeverity(String Severity) {
        this.Severity = Severity;
    }

    /**
     * Get <p>存在1个风险项</p> 
     * @return RiskDesc <p>存在1个风险项</p>
     */
    public String getRiskDesc() {
        return this.RiskDesc;
    }

    /**
     * Set <p>存在1个风险项</p>
     * @param RiskDesc <p>存在1个风险项</p>
     */
    public void setRiskDesc(String RiskDesc) {
        this.RiskDesc = RiskDesc;
    }

    /**
     * Get <p>首次发现时间</p> 
     * @return CreateTime <p>首次发现时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>首次发现时间</p>
     * @param CreateTime <p>首次发现时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>风险更新时间</p> 
     * @return UpdateTime <p>风险更新时间</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>风险更新时间</p>
     * @param UpdateTime <p>风险更新时间</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>云厂商</p> 
     * @return Provider <p>云厂商</p>
     */
    public String getProvider() {
        return this.Provider;
    }

    /**
     * Set <p>云厂商</p>
     * @param Provider <p>云厂商</p>
     */
    public void setProvider(String Provider) {
        this.Provider = Provider;
    }

    /**
     * Get <p>风险状态</p> 
     * @return RiskStatus <p>风险状态</p>
     */
    public Long getRiskStatus() {
        return this.RiskStatus;
    }

    /**
     * Set <p>风险状态</p>
     * @param RiskStatus <p>风险状态</p>
     */
    public void setRiskStatus(Long RiskStatus) {
        this.RiskStatus = RiskStatus;
    }

    /**
     * Get <p>受影响资产数量</p> 
     * @return AssetCount <p>受影响资产数量</p>
     */
    public Long getAssetCount() {
        return this.AssetCount;
    }

    /**
     * Set <p>受影响资产数量</p>
     * @param AssetCount <p>受影响资产数量</p>
     */
    public void setAssetCount(Long AssetCount) {
        this.AssetCount = AssetCount;
    }

    /**
     * Get <p>风险数量</p> 
     * @return RiskCount <p>风险数量</p>
     */
    public Long getRiskCount() {
        return this.RiskCount;
    }

    /**
     * Set <p>风险数量</p>
     * @param RiskCount <p>风险数量</p>
     */
    public void setRiskCount(Long RiskCount) {
        this.RiskCount = RiskCount;
    }

    /**
     * Get <p>资产类型</p> 
     * @return AssetType <p>资产类型</p>
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set <p>资产类型</p>
     * @param AssetType <p>资产类型</p>
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get <p>事件类型</p> 
     * @return EventType <p>事件类型</p>
     */
    public String getEventType() {
        return this.EventType;
    }

    /**
     * Set <p>事件类型</p>
     * @param EventType <p>事件类型</p>
     */
    public void setEventType(String EventType) {
        this.EventType = EventType;
    }

    /**
     * Get <p>处置分类</p> 
     * @return Classify <p>处置分类</p>
     */
    public String getClassify() {
        return this.Classify;
    }

    /**
     * Set <p>处置分类</p>
     * @param Classify <p>处置分类</p>
     */
    public void setClassify(String Classify) {
        this.Classify = Classify;
    }

    /**
     * Get <p>cspm规范条款</p> 
     * @return StandardTerms <p>cspm规范条款</p>
     */
    public StandardTerm [] getStandardTerms() {
        return this.StandardTerms;
    }

    /**
     * Set <p>cspm规范条款</p>
     * @param StandardTerms <p>cspm规范条款</p>
     */
    public void setStandardTerms(StandardTerm [] StandardTerms) {
        this.StandardTerms = StandardTerms;
    }

    /**
     * Get <p>资产类型图标</p> 
     * @return AssetTypeIconURL <p>资产类型图标</p>
     */
    public String getAssetTypeIconURL() {
        return this.AssetTypeIconURL;
    }

    /**
     * Set <p>资产类型图标</p>
     * @param AssetTypeIconURL <p>资产类型图标</p>
     */
    public void setAssetTypeIconURL(String AssetTypeIconURL) {
        this.AssetTypeIconURL = AssetTypeIconURL;
    }

    public CheckViewRiskItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckViewRiskItem(CheckViewRiskItem source) {
        if (source.RiskRuleId != null) {
            this.RiskRuleId = new String(source.RiskRuleId);
        }
        if (source.RiskTitle != null) {
            this.RiskTitle = new String(source.RiskTitle);
        }
        if (source.CheckType != null) {
            this.CheckType = new String(source.CheckType);
        }
        if (source.Severity != null) {
            this.Severity = new String(source.Severity);
        }
        if (source.RiskDesc != null) {
            this.RiskDesc = new String(source.RiskDesc);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Provider != null) {
            this.Provider = new String(source.Provider);
        }
        if (source.RiskStatus != null) {
            this.RiskStatus = new Long(source.RiskStatus);
        }
        if (source.AssetCount != null) {
            this.AssetCount = new Long(source.AssetCount);
        }
        if (source.RiskCount != null) {
            this.RiskCount = new Long(source.RiskCount);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.EventType != null) {
            this.EventType = new String(source.EventType);
        }
        if (source.Classify != null) {
            this.Classify = new String(source.Classify);
        }
        if (source.StandardTerms != null) {
            this.StandardTerms = new StandardTerm[source.StandardTerms.length];
            for (int i = 0; i < source.StandardTerms.length; i++) {
                this.StandardTerms[i] = new StandardTerm(source.StandardTerms[i]);
            }
        }
        if (source.AssetTypeIconURL != null) {
            this.AssetTypeIconURL = new String(source.AssetTypeIconURL);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RiskRuleId", this.RiskRuleId);
        this.setParamSimple(map, prefix + "RiskTitle", this.RiskTitle);
        this.setParamSimple(map, prefix + "CheckType", this.CheckType);
        this.setParamSimple(map, prefix + "Severity", this.Severity);
        this.setParamSimple(map, prefix + "RiskDesc", this.RiskDesc);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Provider", this.Provider);
        this.setParamSimple(map, prefix + "RiskStatus", this.RiskStatus);
        this.setParamSimple(map, prefix + "AssetCount", this.AssetCount);
        this.setParamSimple(map, prefix + "RiskCount", this.RiskCount);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "Classify", this.Classify);
        this.setParamArrayObj(map, prefix + "StandardTerms.", this.StandardTerms);
        this.setParamSimple(map, prefix + "AssetTypeIconURL", this.AssetTypeIconURL);

    }
}

