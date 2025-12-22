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

public class AssetRiskItem extends AbstractModel {

    /**
    * 租户ID
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 云厂商
    */
    @SerializedName("Provider")
    @Expose
    private String Provider;

    /**
    * 云厂商名称
    */
    @SerializedName("ProviderName")
    @Expose
    private String ProviderName;

    /**
    * 云账号名称
    */
    @SerializedName("CloudAccountName")
    @Expose
    private String CloudAccountName;

    /**
    * 云账号ID
    */
    @SerializedName("CloudAccountId")
    @Expose
    private String CloudAccountId;

    /**
    * 实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 首次发现时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 风险状态
    */
    @SerializedName("RiskStatus")
    @Expose
    private Long RiskStatus;

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
    * 风险规则ID
    */
    @SerializedName("RiskRuleId")
    @Expose
    private String RiskRuleId;

    /**
    * 处置分类
    */
    @SerializedName("Classify")
    @Expose
    private String Classify;

    /**
    * 等保合规
    */
    @SerializedName("StandardTerms")
    @Expose
    private StandardTerm [] StandardTerms;

    /**
     * Get 租户ID 
     * @return AppId 租户ID
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 租户ID
     * @param AppId 租户ID
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
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
     * Get 云厂商名称 
     * @return ProviderName 云厂商名称
     */
    public String getProviderName() {
        return this.ProviderName;
    }

    /**
     * Set 云厂商名称
     * @param ProviderName 云厂商名称
     */
    public void setProviderName(String ProviderName) {
        this.ProviderName = ProviderName;
    }

    /**
     * Get 云账号名称 
     * @return CloudAccountName 云账号名称
     */
    public String getCloudAccountName() {
        return this.CloudAccountName;
    }

    /**
     * Set 云账号名称
     * @param CloudAccountName 云账号名称
     */
    public void setCloudAccountName(String CloudAccountName) {
        this.CloudAccountName = CloudAccountName;
    }

    /**
     * Get 云账号ID 
     * @return CloudAccountId 云账号ID
     */
    public String getCloudAccountId() {
        return this.CloudAccountId;
    }

    /**
     * Set 云账号ID
     * @param CloudAccountId 云账号ID
     */
    public void setCloudAccountId(String CloudAccountId) {
        this.CloudAccountId = CloudAccountId;
    }

    /**
     * Get 实例名称 
     * @return InstanceName 实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称
     * @param InstanceName 实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
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
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
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
     * Get 风险规则ID 
     * @return RiskRuleId 风险规则ID
     */
    public String getRiskRuleId() {
        return this.RiskRuleId;
    }

    /**
     * Set 风险规则ID
     * @param RiskRuleId 风险规则ID
     */
    public void setRiskRuleId(String RiskRuleId) {
        this.RiskRuleId = RiskRuleId;
    }

    /**
     * Get 处置分类 
     * @return Classify 处置分类
     */
    public String getClassify() {
        return this.Classify;
    }

    /**
     * Set 处置分类
     * @param Classify 处置分类
     */
    public void setClassify(String Classify) {
        this.Classify = Classify;
    }

    /**
     * Get 等保合规 
     * @return StandardTerms 等保合规
     */
    public StandardTerm [] getStandardTerms() {
        return this.StandardTerms;
    }

    /**
     * Set 等保合规
     * @param StandardTerms 等保合规
     */
    public void setStandardTerms(StandardTerm [] StandardTerms) {
        this.StandardTerms = StandardTerms;
    }

    public AssetRiskItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetRiskItem(AssetRiskItem source) {
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.Provider != null) {
            this.Provider = new String(source.Provider);
        }
        if (source.ProviderName != null) {
            this.ProviderName = new String(source.ProviderName);
        }
        if (source.CloudAccountName != null) {
            this.CloudAccountName = new String(source.CloudAccountName);
        }
        if (source.CloudAccountId != null) {
            this.CloudAccountId = new String(source.CloudAccountId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.RiskStatus != null) {
            this.RiskStatus = new Long(source.RiskStatus);
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
        if (source.RiskRuleId != null) {
            this.RiskRuleId = new String(source.RiskRuleId);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Provider", this.Provider);
        this.setParamSimple(map, prefix + "ProviderName", this.ProviderName);
        this.setParamSimple(map, prefix + "CloudAccountName", this.CloudAccountName);
        this.setParamSimple(map, prefix + "CloudAccountId", this.CloudAccountId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "RiskStatus", this.RiskStatus);
        this.setParamSimple(map, prefix + "RiskTitle", this.RiskTitle);
        this.setParamSimple(map, prefix + "CheckType", this.CheckType);
        this.setParamSimple(map, prefix + "Severity", this.Severity);
        this.setParamSimple(map, prefix + "RiskRuleId", this.RiskRuleId);
        this.setParamSimple(map, prefix + "Classify", this.Classify);
        this.setParamArrayObj(map, prefix + "StandardTerms.", this.StandardTerms);

    }
}

