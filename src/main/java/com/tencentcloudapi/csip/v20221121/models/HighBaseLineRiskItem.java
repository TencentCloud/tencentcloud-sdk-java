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

public class HighBaseLineRiskItem extends AbstractModel {

    /**
    * 云账号ID
    */
    @SerializedName("CloudAccountID")
    @Expose
    private String CloudAccountID;

    /**
    * 实例ID
    */
    @SerializedName("AssetID")
    @Expose
    private String AssetID;

    /**
    * 实例状态
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String InstanceStatus;

    /**
    * 实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 风险名称
    */
    @SerializedName("RiskName")
    @Expose
    private String RiskName;

    /**
    * 风险分类
    */
    @SerializedName("RiskCategory")
    @Expose
    private String RiskCategory;

    /**
    * 风险等级
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
    * 风险描述
    */
    @SerializedName("RiskDesc")
    @Expose
    private String RiskDesc;

    /**
    * 风险结果
    */
    @SerializedName("RiskResult")
    @Expose
    private String RiskResult;

    /**
    * 修复建议
    */
    @SerializedName("FixAdvice")
    @Expose
    private String FixAdvice;

    /**
    * Linux漏洞
    */
    @SerializedName("RiskCategoryName")
    @Expose
    private String RiskCategoryName;

    /**
    * 风险等级名称
    */
    @SerializedName("RiskLevelName")
    @Expose
    private String RiskLevelName;

    /**
    * 实例状态
    */
    @SerializedName("InstanceStatusName")
    @Expose
    private String InstanceStatusName;

    /**
    * 首次发现时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 最近发现时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 租户ID
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
     * Get 云账号ID 
     * @return CloudAccountID 云账号ID
     */
    public String getCloudAccountID() {
        return this.CloudAccountID;
    }

    /**
     * Set 云账号ID
     * @param CloudAccountID 云账号ID
     */
    public void setCloudAccountID(String CloudAccountID) {
        this.CloudAccountID = CloudAccountID;
    }

    /**
     * Get 实例ID 
     * @return AssetID 实例ID
     */
    public String getAssetID() {
        return this.AssetID;
    }

    /**
     * Set 实例ID
     * @param AssetID 实例ID
     */
    public void setAssetID(String AssetID) {
        this.AssetID = AssetID;
    }

    /**
     * Get 实例状态 
     * @return InstanceStatus 实例状态
     */
    public String getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set 实例状态
     * @param InstanceStatus 实例状态
     */
    public void setInstanceStatus(String InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
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
     * Get 风险名称 
     * @return RiskName 风险名称
     */
    public String getRiskName() {
        return this.RiskName;
    }

    /**
     * Set 风险名称
     * @param RiskName 风险名称
     */
    public void setRiskName(String RiskName) {
        this.RiskName = RiskName;
    }

    /**
     * Get 风险分类 
     * @return RiskCategory 风险分类
     */
    public String getRiskCategory() {
        return this.RiskCategory;
    }

    /**
     * Set 风险分类
     * @param RiskCategory 风险分类
     */
    public void setRiskCategory(String RiskCategory) {
        this.RiskCategory = RiskCategory;
    }

    /**
     * Get 风险等级 
     * @return RiskLevel 风险等级
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set 风险等级
     * @param RiskLevel 风险等级
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get 风险描述 
     * @return RiskDesc 风险描述
     */
    public String getRiskDesc() {
        return this.RiskDesc;
    }

    /**
     * Set 风险描述
     * @param RiskDesc 风险描述
     */
    public void setRiskDesc(String RiskDesc) {
        this.RiskDesc = RiskDesc;
    }

    /**
     * Get 风险结果 
     * @return RiskResult 风险结果
     */
    public String getRiskResult() {
        return this.RiskResult;
    }

    /**
     * Set 风险结果
     * @param RiskResult 风险结果
     */
    public void setRiskResult(String RiskResult) {
        this.RiskResult = RiskResult;
    }

    /**
     * Get 修复建议 
     * @return FixAdvice 修复建议
     */
    public String getFixAdvice() {
        return this.FixAdvice;
    }

    /**
     * Set 修复建议
     * @param FixAdvice 修复建议
     */
    public void setFixAdvice(String FixAdvice) {
        this.FixAdvice = FixAdvice;
    }

    /**
     * Get Linux漏洞 
     * @return RiskCategoryName Linux漏洞
     */
    public String getRiskCategoryName() {
        return this.RiskCategoryName;
    }

    /**
     * Set Linux漏洞
     * @param RiskCategoryName Linux漏洞
     */
    public void setRiskCategoryName(String RiskCategoryName) {
        this.RiskCategoryName = RiskCategoryName;
    }

    /**
     * Get 风险等级名称 
     * @return RiskLevelName 风险等级名称
     */
    public String getRiskLevelName() {
        return this.RiskLevelName;
    }

    /**
     * Set 风险等级名称
     * @param RiskLevelName 风险等级名称
     */
    public void setRiskLevelName(String RiskLevelName) {
        this.RiskLevelName = RiskLevelName;
    }

    /**
     * Get 实例状态 
     * @return InstanceStatusName 实例状态
     */
    public String getInstanceStatusName() {
        return this.InstanceStatusName;
    }

    /**
     * Set 实例状态
     * @param InstanceStatusName 实例状态
     */
    public void setInstanceStatusName(String InstanceStatusName) {
        this.InstanceStatusName = InstanceStatusName;
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
     * Get 最近发现时间 
     * @return UpdateTime 最近发现时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 最近发现时间
     * @param UpdateTime 最近发现时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 租户ID 
     * @return AppID 租户ID
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set 租户ID
     * @param AppID 租户ID
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
    }

    public HighBaseLineRiskItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HighBaseLineRiskItem(HighBaseLineRiskItem source) {
        if (source.CloudAccountID != null) {
            this.CloudAccountID = new String(source.CloudAccountID);
        }
        if (source.AssetID != null) {
            this.AssetID = new String(source.AssetID);
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new String(source.InstanceStatus);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.RiskName != null) {
            this.RiskName = new String(source.RiskName);
        }
        if (source.RiskCategory != null) {
            this.RiskCategory = new String(source.RiskCategory);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new String(source.RiskLevel);
        }
        if (source.RiskDesc != null) {
            this.RiskDesc = new String(source.RiskDesc);
        }
        if (source.RiskResult != null) {
            this.RiskResult = new String(source.RiskResult);
        }
        if (source.FixAdvice != null) {
            this.FixAdvice = new String(source.FixAdvice);
        }
        if (source.RiskCategoryName != null) {
            this.RiskCategoryName = new String(source.RiskCategoryName);
        }
        if (source.RiskLevelName != null) {
            this.RiskLevelName = new String(source.RiskLevelName);
        }
        if (source.InstanceStatusName != null) {
            this.InstanceStatusName = new String(source.InstanceStatusName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CloudAccountID", this.CloudAccountID);
        this.setParamSimple(map, prefix + "AssetID", this.AssetID);
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "RiskName", this.RiskName);
        this.setParamSimple(map, prefix + "RiskCategory", this.RiskCategory);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "RiskDesc", this.RiskDesc);
        this.setParamSimple(map, prefix + "RiskResult", this.RiskResult);
        this.setParamSimple(map, prefix + "FixAdvice", this.FixAdvice);
        this.setParamSimple(map, prefix + "RiskCategoryName", this.RiskCategoryName);
        this.setParamSimple(map, prefix + "RiskLevelName", this.RiskLevelName);
        this.setParamSimple(map, prefix + "InstanceStatusName", this.InstanceStatusName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "AppID", this.AppID);

    }
}

