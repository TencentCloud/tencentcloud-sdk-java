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
    * <p>租户ID</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>云厂商</p>
    */
    @SerializedName("Provider")
    @Expose
    private String Provider;

    /**
    * <p>云厂商名称</p>
    */
    @SerializedName("ProviderName")
    @Expose
    private String ProviderName;

    /**
    * <p>云账号名称</p>
    */
    @SerializedName("CloudAccountName")
    @Expose
    private String CloudAccountName;

    /**
    * <p>云账号ID</p>
    */
    @SerializedName("CloudAccountId")
    @Expose
    private String CloudAccountId;

    /**
    * <p>实例名称</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>首次发现时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>更新时间</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>风险状态</p>
    */
    @SerializedName("RiskStatus")
    @Expose
    private Long RiskStatus;

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
    * <p>风险规则ID</p>
    */
    @SerializedName("RiskRuleId")
    @Expose
    private String RiskRuleId;

    /**
    * <p>处置分类</p>
    */
    @SerializedName("Classify")
    @Expose
    private String Classify;

    /**
    * <p>等保合规</p>
    */
    @SerializedName("StandardTerms")
    @Expose
    private StandardTerm [] StandardTerms;

    /**
    * <p>资产类型</p>
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * <p>资产类型图标</p>
    */
    @SerializedName("AssetTypeIconURL")
    @Expose
    private String AssetTypeIconURL;

    /**
     * Get <p>租户ID</p> 
     * @return AppId <p>租户ID</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>租户ID</p>
     * @param AppId <p>租户ID</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
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
     * Get <p>云厂商名称</p> 
     * @return ProviderName <p>云厂商名称</p>
     */
    public String getProviderName() {
        return this.ProviderName;
    }

    /**
     * Set <p>云厂商名称</p>
     * @param ProviderName <p>云厂商名称</p>
     */
    public void setProviderName(String ProviderName) {
        this.ProviderName = ProviderName;
    }

    /**
     * Get <p>云账号名称</p> 
     * @return CloudAccountName <p>云账号名称</p>
     */
    public String getCloudAccountName() {
        return this.CloudAccountName;
    }

    /**
     * Set <p>云账号名称</p>
     * @param CloudAccountName <p>云账号名称</p>
     */
    public void setCloudAccountName(String CloudAccountName) {
        this.CloudAccountName = CloudAccountName;
    }

    /**
     * Get <p>云账号ID</p> 
     * @return CloudAccountId <p>云账号ID</p>
     */
    public String getCloudAccountId() {
        return this.CloudAccountId;
    }

    /**
     * Set <p>云账号ID</p>
     * @param CloudAccountId <p>云账号ID</p>
     */
    public void setCloudAccountId(String CloudAccountId) {
        this.CloudAccountId = CloudAccountId;
    }

    /**
     * Get <p>实例名称</p> 
     * @return InstanceName <p>实例名称</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>实例名称</p>
     * @param InstanceName <p>实例名称</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>实例ID</p> 
     * @return InstanceId <p>实例ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID</p>
     * @param InstanceId <p>实例ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
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
     * Get <p>更新时间</p> 
     * @return UpdateTime <p>更新时间</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间</p>
     * @param UpdateTime <p>更新时间</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
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
     * Get <p>风险规则ID</p> 
     * @return RiskRuleId <p>风险规则ID</p>
     */
    public String getRiskRuleId() {
        return this.RiskRuleId;
    }

    /**
     * Set <p>风险规则ID</p>
     * @param RiskRuleId <p>风险规则ID</p>
     */
    public void setRiskRuleId(String RiskRuleId) {
        this.RiskRuleId = RiskRuleId;
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
     * Get <p>等保合规</p> 
     * @return StandardTerms <p>等保合规</p>
     */
    public StandardTerm [] getStandardTerms() {
        return this.StandardTerms;
    }

    /**
     * Set <p>等保合规</p>
     * @param StandardTerms <p>等保合规</p>
     */
    public void setStandardTerms(StandardTerm [] StandardTerms) {
        this.StandardTerms = StandardTerms;
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
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.AssetTypeIconURL != null) {
            this.AssetTypeIconURL = new String(source.AssetTypeIconURL);
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
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "AssetTypeIconURL", this.AssetTypeIconURL);

    }
}

