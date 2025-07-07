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

public class VulRiskItem extends AbstractModel {

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
    * 创建时间
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
    * 漏洞名称
    */
    @SerializedName("VulName")
    @Expose
    private String VulName;

    /**
    * 漏洞类型
    */
    @SerializedName("VulCategory")
    @Expose
    private String VulCategory;

    /**
    * 漏洞等级
    */
    @SerializedName("VulLevel")
    @Expose
    private String VulLevel;

    /**
    * CVE编号
    */
    @SerializedName("CveID")
    @Expose
    private String CveID;

    /**
    * 漏洞描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 容器ID
    */
    @SerializedName("ContainerID")
    @Expose
    private String ContainerID;

    /**
    * 漏洞风险修复建议
    */
    @SerializedName("Fix")
    @Expose
    private String Fix;

    /**
    * Linux漏洞
    */
    @SerializedName("VulCategoryName")
    @Expose
    private String VulCategoryName;

    /**
    * 漏洞等级名称
    */
    @SerializedName("VulLevelName")
    @Expose
    private String VulLevelName;

    /**
    * 实例状态中文信息
    */
    @SerializedName("InstanceStatusName")
    @Expose
    private String InstanceStatusName;

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
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
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
     * Get 漏洞名称 
     * @return VulName 漏洞名称
     */
    public String getVulName() {
        return this.VulName;
    }

    /**
     * Set 漏洞名称
     * @param VulName 漏洞名称
     */
    public void setVulName(String VulName) {
        this.VulName = VulName;
    }

    /**
     * Get 漏洞类型 
     * @return VulCategory 漏洞类型
     */
    public String getVulCategory() {
        return this.VulCategory;
    }

    /**
     * Set 漏洞类型
     * @param VulCategory 漏洞类型
     */
    public void setVulCategory(String VulCategory) {
        this.VulCategory = VulCategory;
    }

    /**
     * Get 漏洞等级 
     * @return VulLevel 漏洞等级
     */
    public String getVulLevel() {
        return this.VulLevel;
    }

    /**
     * Set 漏洞等级
     * @param VulLevel 漏洞等级
     */
    public void setVulLevel(String VulLevel) {
        this.VulLevel = VulLevel;
    }

    /**
     * Get CVE编号 
     * @return CveID CVE编号
     */
    public String getCveID() {
        return this.CveID;
    }

    /**
     * Set CVE编号
     * @param CveID CVE编号
     */
    public void setCveID(String CveID) {
        this.CveID = CveID;
    }

    /**
     * Get 漏洞描述 
     * @return Description 漏洞描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 漏洞描述
     * @param Description 漏洞描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 容器ID 
     * @return ContainerID 容器ID
     */
    public String getContainerID() {
        return this.ContainerID;
    }

    /**
     * Set 容器ID
     * @param ContainerID 容器ID
     */
    public void setContainerID(String ContainerID) {
        this.ContainerID = ContainerID;
    }

    /**
     * Get 漏洞风险修复建议 
     * @return Fix 漏洞风险修复建议
     */
    public String getFix() {
        return this.Fix;
    }

    /**
     * Set 漏洞风险修复建议
     * @param Fix 漏洞风险修复建议
     */
    public void setFix(String Fix) {
        this.Fix = Fix;
    }

    /**
     * Get Linux漏洞 
     * @return VulCategoryName Linux漏洞
     */
    public String getVulCategoryName() {
        return this.VulCategoryName;
    }

    /**
     * Set Linux漏洞
     * @param VulCategoryName Linux漏洞
     */
    public void setVulCategoryName(String VulCategoryName) {
        this.VulCategoryName = VulCategoryName;
    }

    /**
     * Get 漏洞等级名称 
     * @return VulLevelName 漏洞等级名称
     */
    public String getVulLevelName() {
        return this.VulLevelName;
    }

    /**
     * Set 漏洞等级名称
     * @param VulLevelName 漏洞等级名称
     */
    public void setVulLevelName(String VulLevelName) {
        this.VulLevelName = VulLevelName;
    }

    /**
     * Get 实例状态中文信息 
     * @return InstanceStatusName 实例状态中文信息
     */
    public String getInstanceStatusName() {
        return this.InstanceStatusName;
    }

    /**
     * Set 实例状态中文信息
     * @param InstanceStatusName 实例状态中文信息
     */
    public void setInstanceStatusName(String InstanceStatusName) {
        this.InstanceStatusName = InstanceStatusName;
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

    public VulRiskItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulRiskItem(VulRiskItem source) {
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
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.VulName != null) {
            this.VulName = new String(source.VulName);
        }
        if (source.VulCategory != null) {
            this.VulCategory = new String(source.VulCategory);
        }
        if (source.VulLevel != null) {
            this.VulLevel = new String(source.VulLevel);
        }
        if (source.CveID != null) {
            this.CveID = new String(source.CveID);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ContainerID != null) {
            this.ContainerID = new String(source.ContainerID);
        }
        if (source.Fix != null) {
            this.Fix = new String(source.Fix);
        }
        if (source.VulCategoryName != null) {
            this.VulCategoryName = new String(source.VulCategoryName);
        }
        if (source.VulLevelName != null) {
            this.VulLevelName = new String(source.VulLevelName);
        }
        if (source.InstanceStatusName != null) {
            this.InstanceStatusName = new String(source.InstanceStatusName);
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
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "VulName", this.VulName);
        this.setParamSimple(map, prefix + "VulCategory", this.VulCategory);
        this.setParamSimple(map, prefix + "VulLevel", this.VulLevel);
        this.setParamSimple(map, prefix + "CveID", this.CveID);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ContainerID", this.ContainerID);
        this.setParamSimple(map, prefix + "Fix", this.Fix);
        this.setParamSimple(map, prefix + "VulCategoryName", this.VulCategoryName);
        this.setParamSimple(map, prefix + "VulLevelName", this.VulLevelName);
        this.setParamSimple(map, prefix + "InstanceStatusName", this.InstanceStatusName);
        this.setParamSimple(map, prefix + "AppID", this.AppID);

    }
}

