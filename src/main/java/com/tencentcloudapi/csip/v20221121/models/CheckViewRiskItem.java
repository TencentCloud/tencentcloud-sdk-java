/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
    * 检查项规则ID
    */
    @SerializedName("RiskRuleId")
    @Expose
    private String RiskRuleId;

    /**
    * 风险名称
    */
    @SerializedName("RiskTitle")
    @Expose
    private String RiskTitle;

    /**
    * 检查类型
    */
    @SerializedName("CheckType")
    @Expose
    private String CheckType;

    /**
    * 风险等级
    */
    @SerializedName("Severity")
    @Expose
    private String Severity;

    /**
    * 存在1个风险项
    */
    @SerializedName("RiskDesc")
    @Expose
    private String RiskDesc;

    /**
    * 首次发现时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 风险更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 云厂商
    */
    @SerializedName("Provider")
    @Expose
    private String Provider;

    /**
    * 风险状态
    */
    @SerializedName("RiskStatus")
    @Expose
    private Long RiskStatus;

    /**
    * 受影响资产数量
    */
    @SerializedName("AssetCount")
    @Expose
    private Long AssetCount;

    /**
    * 风险数量
    */
    @SerializedName("RiskCount")
    @Expose
    private Long RiskCount;

    /**
    * 资产类型
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * 事件类型
    */
    @SerializedName("EventType")
    @Expose
    private String EventType;

    /**
     * Get 检查项规则ID 
     * @return RiskRuleId 检查项规则ID
     */
    public String getRiskRuleId() {
        return this.RiskRuleId;
    }

    /**
     * Set 检查项规则ID
     * @param RiskRuleId 检查项规则ID
     */
    public void setRiskRuleId(String RiskRuleId) {
        this.RiskRuleId = RiskRuleId;
    }

    /**
     * Get 风险名称 
     * @return RiskTitle 风险名称
     */
    public String getRiskTitle() {
        return this.RiskTitle;
    }

    /**
     * Set 风险名称
     * @param RiskTitle 风险名称
     */
    public void setRiskTitle(String RiskTitle) {
        this.RiskTitle = RiskTitle;
    }

    /**
     * Get 检查类型 
     * @return CheckType 检查类型
     */
    public String getCheckType() {
        return this.CheckType;
    }

    /**
     * Set 检查类型
     * @param CheckType 检查类型
     */
    public void setCheckType(String CheckType) {
        this.CheckType = CheckType;
    }

    /**
     * Get 风险等级 
     * @return Severity 风险等级
     */
    public String getSeverity() {
        return this.Severity;
    }

    /**
     * Set 风险等级
     * @param Severity 风险等级
     */
    public void setSeverity(String Severity) {
        this.Severity = Severity;
    }

    /**
     * Get 存在1个风险项 
     * @return RiskDesc 存在1个风险项
     */
    public String getRiskDesc() {
        return this.RiskDesc;
    }

    /**
     * Set 存在1个风险项
     * @param RiskDesc 存在1个风险项
     */
    public void setRiskDesc(String RiskDesc) {
        this.RiskDesc = RiskDesc;
    }

    /**
     * Get 首次发现时间 
     * @return CreateTime 首次发现时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 首次发现时间
     * @param CreateTime 首次发现时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 风险更新时间 
     * @return UpdateTime 风险更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 风险更新时间
     * @param UpdateTime 风险更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 云厂商 
     * @return Provider 云厂商
     */
    public String getProvider() {
        return this.Provider;
    }

    /**
     * Set 云厂商
     * @param Provider 云厂商
     */
    public void setProvider(String Provider) {
        this.Provider = Provider;
    }

    /**
     * Get 风险状态 
     * @return RiskStatus 风险状态
     */
    public Long getRiskStatus() {
        return this.RiskStatus;
    }

    /**
     * Set 风险状态
     * @param RiskStatus 风险状态
     */
    public void setRiskStatus(Long RiskStatus) {
        this.RiskStatus = RiskStatus;
    }

    /**
     * Get 受影响资产数量 
     * @return AssetCount 受影响资产数量
     */
    public Long getAssetCount() {
        return this.AssetCount;
    }

    /**
     * Set 受影响资产数量
     * @param AssetCount 受影响资产数量
     */
    public void setAssetCount(Long AssetCount) {
        this.AssetCount = AssetCount;
    }

    /**
     * Get 风险数量 
     * @return RiskCount 风险数量
     */
    public Long getRiskCount() {
        return this.RiskCount;
    }

    /**
     * Set 风险数量
     * @param RiskCount 风险数量
     */
    public void setRiskCount(Long RiskCount) {
        this.RiskCount = RiskCount;
    }

    /**
     * Get 资产类型 
     * @return AssetType 资产类型
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set 资产类型
     * @param AssetType 资产类型
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get 事件类型 
     * @return EventType 事件类型
     */
    public String getEventType() {
        return this.EventType;
    }

    /**
     * Set 事件类型
     * @param EventType 事件类型
     */
    public void setEventType(String EventType) {
        this.EventType = EventType;
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

    }
}

