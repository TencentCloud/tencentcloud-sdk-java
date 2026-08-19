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

public class CloudFunctionItem extends AbstractModel {

    /**
    * 云函数名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 云函数状态
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String InstanceStatus;

    /**
    * 云函数类型
    */
    @SerializedName("FunctionType")
    @Expose
    private String FunctionType;

    /**
    * 资源标签
    */
    @SerializedName("InstanceTag")
    @Expose
    private String InstanceTag;

    /**
    * 命名空间
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 自定义域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 实例ID
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * 实例类型
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 租户ID
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * 云函数状态展示内容
    */
    @SerializedName("InstanceStatusDisplay")
    @Expose
    private String InstanceStatusDisplay;

    /**
    * 核心资产标签
    */
    @SerializedName("CoreAssetFlag")
    @Expose
    private String CoreAssetFlag;

    /**
    * 公网访问URL
    */
    @SerializedName("PublicURL")
    @Expose
    private String PublicURL;

    /**
    * 私网访问URL
    */
    @SerializedName("PrivateURL")
    @Expose
    private String PrivateURL;

    /**
    * 所属账号
    */
    @SerializedName("AccountInfo")
    @Expose
    private String AccountInfo;

    /**
     * Get 云函数名称 
     * @return InstanceName 云函数名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 云函数名称
     * @param InstanceName 云函数名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 云函数状态 
     * @return InstanceStatus 云函数状态
     */
    public String getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set 云函数状态
     * @param InstanceStatus 云函数状态
     */
    public void setInstanceStatus(String InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get 云函数类型 
     * @return FunctionType 云函数类型
     */
    public String getFunctionType() {
        return this.FunctionType;
    }

    /**
     * Set 云函数类型
     * @param FunctionType 云函数类型
     */
    public void setFunctionType(String FunctionType) {
        this.FunctionType = FunctionType;
    }

    /**
     * Get 资源标签 
     * @return InstanceTag 资源标签
     */
    public String getInstanceTag() {
        return this.InstanceTag;
    }

    /**
     * Set 资源标签
     * @param InstanceTag 资源标签
     */
    public void setInstanceTag(String InstanceTag) {
        this.InstanceTag = InstanceTag;
    }

    /**
     * Get 命名空间 
     * @return Namespace 命名空间
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间
     * @param Namespace 命名空间
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 地域 
     * @return Region 地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
     * @param Region 地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 自定义域名 
     * @return Domain 自定义域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 自定义域名
     * @param Domain 自定义域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 实例ID 
     * @return InstanceID 实例ID
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set 实例ID
     * @param InstanceID 实例ID
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get 实例类型 
     * @return InstanceType 实例类型
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例类型
     * @param InstanceType 实例类型
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
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

    /**
     * Get 云函数状态展示内容 
     * @return InstanceStatusDisplay 云函数状态展示内容
     */
    public String getInstanceStatusDisplay() {
        return this.InstanceStatusDisplay;
    }

    /**
     * Set 云函数状态展示内容
     * @param InstanceStatusDisplay 云函数状态展示内容
     */
    public void setInstanceStatusDisplay(String InstanceStatusDisplay) {
        this.InstanceStatusDisplay = InstanceStatusDisplay;
    }

    /**
     * Get 核心资产标签 
     * @return CoreAssetFlag 核心资产标签
     */
    public String getCoreAssetFlag() {
        return this.CoreAssetFlag;
    }

    /**
     * Set 核心资产标签
     * @param CoreAssetFlag 核心资产标签
     */
    public void setCoreAssetFlag(String CoreAssetFlag) {
        this.CoreAssetFlag = CoreAssetFlag;
    }

    /**
     * Get 公网访问URL 
     * @return PublicURL 公网访问URL
     */
    public String getPublicURL() {
        return this.PublicURL;
    }

    /**
     * Set 公网访问URL
     * @param PublicURL 公网访问URL
     */
    public void setPublicURL(String PublicURL) {
        this.PublicURL = PublicURL;
    }

    /**
     * Get 私网访问URL 
     * @return PrivateURL 私网访问URL
     */
    public String getPrivateURL() {
        return this.PrivateURL;
    }

    /**
     * Set 私网访问URL
     * @param PrivateURL 私网访问URL
     */
    public void setPrivateURL(String PrivateURL) {
        this.PrivateURL = PrivateURL;
    }

    /**
     * Get 所属账号 
     * @return AccountInfo 所属账号
     */
    public String getAccountInfo() {
        return this.AccountInfo;
    }

    /**
     * Set 所属账号
     * @param AccountInfo 所属账号
     */
    public void setAccountInfo(String AccountInfo) {
        this.AccountInfo = AccountInfo;
    }

    public CloudFunctionItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudFunctionItem(CloudFunctionItem source) {
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new String(source.InstanceStatus);
        }
        if (source.FunctionType != null) {
            this.FunctionType = new String(source.FunctionType);
        }
        if (source.InstanceTag != null) {
            this.InstanceTag = new String(source.InstanceTag);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
        if (source.InstanceStatusDisplay != null) {
            this.InstanceStatusDisplay = new String(source.InstanceStatusDisplay);
        }
        if (source.CoreAssetFlag != null) {
            this.CoreAssetFlag = new String(source.CoreAssetFlag);
        }
        if (source.PublicURL != null) {
            this.PublicURL = new String(source.PublicURL);
        }
        if (source.PrivateURL != null) {
            this.PrivateURL = new String(source.PrivateURL);
        }
        if (source.AccountInfo != null) {
            this.AccountInfo = new String(source.AccountInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);
        this.setParamSimple(map, prefix + "FunctionType", this.FunctionType);
        this.setParamSimple(map, prefix + "InstanceTag", this.InstanceTag);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "InstanceStatusDisplay", this.InstanceStatusDisplay);
        this.setParamSimple(map, prefix + "CoreAssetFlag", this.CoreAssetFlag);
        this.setParamSimple(map, prefix + "PublicURL", this.PublicURL);
        this.setParamSimple(map, prefix + "PrivateURL", this.PrivateURL);
        this.setParamSimple(map, prefix + "AccountInfo", this.AccountInfo);

    }
}

