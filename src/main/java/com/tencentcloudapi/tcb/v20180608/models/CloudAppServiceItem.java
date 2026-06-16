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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudAppServiceItem extends AbstractModel {

    /**
    * 服务名
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * 框架名
    */
    @SerializedName("Framework")
    @Expose
    private String Framework;

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 应用路径
    */
    @SerializedName("AppPath")
    @Expose
    private String AppPath;

    /**
    * 服务创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 最新版本名
    */
    @SerializedName("LatestVersionName")
    @Expose
    private String LatestVersionName;

    /**
    * 最新版本状态
    */
    @SerializedName("LatestStatus")
    @Expose
    private String LatestStatus;

    /**
    * 最新版本构建时间
    */
    @SerializedName("LatestBuildTime")
    @Expose
    private String LatestBuildTime;

    /**
    * 部署类型
    */
    @SerializedName("DeployType")
    @Expose
    private String DeployType;

    /**
     * Get 服务名 
     * @return ServiceName 服务名
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set 服务名
     * @param ServiceName 服务名
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get 框架名 
     * @return Framework 框架名
     */
    public String getFramework() {
        return this.Framework;
    }

    /**
     * Set 框架名
     * @param Framework 框架名
     */
    public void setFramework(String Framework) {
        this.Framework = Framework;
    }

    /**
     * Get 域名 
     * @return Domain 域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
     * @param Domain 域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 应用路径 
     * @return AppPath 应用路径
     */
    public String getAppPath() {
        return this.AppPath;
    }

    /**
     * Set 应用路径
     * @param AppPath 应用路径
     */
    public void setAppPath(String AppPath) {
        this.AppPath = AppPath;
    }

    /**
     * Get 服务创建时间 
     * @return CreateTime 服务创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 服务创建时间
     * @param CreateTime 服务创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 最新版本名 
     * @return LatestVersionName 最新版本名
     */
    public String getLatestVersionName() {
        return this.LatestVersionName;
    }

    /**
     * Set 最新版本名
     * @param LatestVersionName 最新版本名
     */
    public void setLatestVersionName(String LatestVersionName) {
        this.LatestVersionName = LatestVersionName;
    }

    /**
     * Get 最新版本状态 
     * @return LatestStatus 最新版本状态
     */
    public String getLatestStatus() {
        return this.LatestStatus;
    }

    /**
     * Set 最新版本状态
     * @param LatestStatus 最新版本状态
     */
    public void setLatestStatus(String LatestStatus) {
        this.LatestStatus = LatestStatus;
    }

    /**
     * Get 最新版本构建时间 
     * @return LatestBuildTime 最新版本构建时间
     */
    public String getLatestBuildTime() {
        return this.LatestBuildTime;
    }

    /**
     * Set 最新版本构建时间
     * @param LatestBuildTime 最新版本构建时间
     */
    public void setLatestBuildTime(String LatestBuildTime) {
        this.LatestBuildTime = LatestBuildTime;
    }

    /**
     * Get 部署类型 
     * @return DeployType 部署类型
     */
    public String getDeployType() {
        return this.DeployType;
    }

    /**
     * Set 部署类型
     * @param DeployType 部署类型
     */
    public void setDeployType(String DeployType) {
        this.DeployType = DeployType;
    }

    public CloudAppServiceItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudAppServiceItem(CloudAppServiceItem source) {
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.Framework != null) {
            this.Framework = new String(source.Framework);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.AppPath != null) {
            this.AppPath = new String(source.AppPath);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.LatestVersionName != null) {
            this.LatestVersionName = new String(source.LatestVersionName);
        }
        if (source.LatestStatus != null) {
            this.LatestStatus = new String(source.LatestStatus);
        }
        if (source.LatestBuildTime != null) {
            this.LatestBuildTime = new String(source.LatestBuildTime);
        }
        if (source.DeployType != null) {
            this.DeployType = new String(source.DeployType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "Framework", this.Framework);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "AppPath", this.AppPath);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "LatestVersionName", this.LatestVersionName);
        this.setParamSimple(map, prefix + "LatestStatus", this.LatestStatus);
        this.setParamSimple(map, prefix + "LatestBuildTime", this.LatestBuildTime);
        this.setParamSimple(map, prefix + "DeployType", this.DeployType);

    }
}

