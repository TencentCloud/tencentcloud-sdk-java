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

public class RepositoryImageVO extends AbstractModel {

    /**
    * 用户appid
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 用户uin
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 昵称
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * 镜像id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 镜像名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 镜像创建时间
    */
    @SerializedName("InstanceCreateTime")
    @Expose
    private String InstanceCreateTime;

    /**
    * 镜像大小带单位
    */
    @SerializedName("InstanceSize")
    @Expose
    private String InstanceSize;

    /**
    * 构建次数
    */
    @SerializedName("BuildCount")
    @Expose
    private Long BuildCount;

    /**
    * 镜像类型
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 授权状态
    */
    @SerializedName("AuthStatus")
    @Expose
    private Long AuthStatus;

    /**
    * 镜像版本
    */
    @SerializedName("InstanceVersion")
    @Expose
    private String InstanceVersion;

    /**
    * 地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 仓库地址
    */
    @SerializedName("RepositoryUrl")
    @Expose
    private String RepositoryUrl;

    /**
    * 仓库名称
    */
    @SerializedName("RepositoryName")
    @Expose
    private String RepositoryName;

    /**
    * 是否核心
    */
    @SerializedName("IsCore")
    @Expose
    private Long IsCore;

    /**
    * 漏洞风险
    */
    @SerializedName("VulRisk")
    @Expose
    private Long VulRisk;

    /**
    * 检查任务
    */
    @SerializedName("CheckCount")
    @Expose
    private Long CheckCount;

    /**
    * 体检时间
    */
    @SerializedName("CheckTime")
    @Expose
    private String CheckTime;

    /**
    * 是否新资产 1新
    */
    @SerializedName("IsNewAsset")
    @Expose
    private Long IsNewAsset;

    /**
     * Get 用户appid 
     * @return AppId 用户appid
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 用户appid
     * @param AppId 用户appid
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 用户uin 
     * @return Uin 用户uin
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 用户uin
     * @param Uin 用户uin
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 昵称 
     * @return NickName 昵称
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set 昵称
     * @param NickName 昵称
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    /**
     * Get 镜像id 
     * @return InstanceId 镜像id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 镜像id
     * @param InstanceId 镜像id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 镜像名称 
     * @return InstanceName 镜像名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 镜像名称
     * @param InstanceName 镜像名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 镜像创建时间 
     * @return InstanceCreateTime 镜像创建时间
     */
    public String getInstanceCreateTime() {
        return this.InstanceCreateTime;
    }

    /**
     * Set 镜像创建时间
     * @param InstanceCreateTime 镜像创建时间
     */
    public void setInstanceCreateTime(String InstanceCreateTime) {
        this.InstanceCreateTime = InstanceCreateTime;
    }

    /**
     * Get 镜像大小带单位 
     * @return InstanceSize 镜像大小带单位
     */
    public String getInstanceSize() {
        return this.InstanceSize;
    }

    /**
     * Set 镜像大小带单位
     * @param InstanceSize 镜像大小带单位
     */
    public void setInstanceSize(String InstanceSize) {
        this.InstanceSize = InstanceSize;
    }

    /**
     * Get 构建次数 
     * @return BuildCount 构建次数
     */
    public Long getBuildCount() {
        return this.BuildCount;
    }

    /**
     * Set 构建次数
     * @param BuildCount 构建次数
     */
    public void setBuildCount(Long BuildCount) {
        this.BuildCount = BuildCount;
    }

    /**
     * Get 镜像类型 
     * @return InstanceType 镜像类型
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 镜像类型
     * @param InstanceType 镜像类型
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 授权状态 
     * @return AuthStatus 授权状态
     */
    public Long getAuthStatus() {
        return this.AuthStatus;
    }

    /**
     * Set 授权状态
     * @param AuthStatus 授权状态
     */
    public void setAuthStatus(Long AuthStatus) {
        this.AuthStatus = AuthStatus;
    }

    /**
     * Get 镜像版本 
     * @return InstanceVersion 镜像版本
     */
    public String getInstanceVersion() {
        return this.InstanceVersion;
    }

    /**
     * Set 镜像版本
     * @param InstanceVersion 镜像版本
     */
    public void setInstanceVersion(String InstanceVersion) {
        this.InstanceVersion = InstanceVersion;
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
     * Get 仓库地址 
     * @return RepositoryUrl 仓库地址
     */
    public String getRepositoryUrl() {
        return this.RepositoryUrl;
    }

    /**
     * Set 仓库地址
     * @param RepositoryUrl 仓库地址
     */
    public void setRepositoryUrl(String RepositoryUrl) {
        this.RepositoryUrl = RepositoryUrl;
    }

    /**
     * Get 仓库名称 
     * @return RepositoryName 仓库名称
     */
    public String getRepositoryName() {
        return this.RepositoryName;
    }

    /**
     * Set 仓库名称
     * @param RepositoryName 仓库名称
     */
    public void setRepositoryName(String RepositoryName) {
        this.RepositoryName = RepositoryName;
    }

    /**
     * Get 是否核心 
     * @return IsCore 是否核心
     */
    public Long getIsCore() {
        return this.IsCore;
    }

    /**
     * Set 是否核心
     * @param IsCore 是否核心
     */
    public void setIsCore(Long IsCore) {
        this.IsCore = IsCore;
    }

    /**
     * Get 漏洞风险 
     * @return VulRisk 漏洞风险
     */
    public Long getVulRisk() {
        return this.VulRisk;
    }

    /**
     * Set 漏洞风险
     * @param VulRisk 漏洞风险
     */
    public void setVulRisk(Long VulRisk) {
        this.VulRisk = VulRisk;
    }

    /**
     * Get 检查任务 
     * @return CheckCount 检查任务
     */
    public Long getCheckCount() {
        return this.CheckCount;
    }

    /**
     * Set 检查任务
     * @param CheckCount 检查任务
     */
    public void setCheckCount(Long CheckCount) {
        this.CheckCount = CheckCount;
    }

    /**
     * Get 体检时间 
     * @return CheckTime 体检时间
     */
    public String getCheckTime() {
        return this.CheckTime;
    }

    /**
     * Set 体检时间
     * @param CheckTime 体检时间
     */
    public void setCheckTime(String CheckTime) {
        this.CheckTime = CheckTime;
    }

    /**
     * Get 是否新资产 1新 
     * @return IsNewAsset 是否新资产 1新
     */
    public Long getIsNewAsset() {
        return this.IsNewAsset;
    }

    /**
     * Set 是否新资产 1新
     * @param IsNewAsset 是否新资产 1新
     */
    public void setIsNewAsset(Long IsNewAsset) {
        this.IsNewAsset = IsNewAsset;
    }

    public RepositoryImageVO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RepositoryImageVO(RepositoryImageVO source) {
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.NickName != null) {
            this.NickName = new String(source.NickName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceCreateTime != null) {
            this.InstanceCreateTime = new String(source.InstanceCreateTime);
        }
        if (source.InstanceSize != null) {
            this.InstanceSize = new String(source.InstanceSize);
        }
        if (source.BuildCount != null) {
            this.BuildCount = new Long(source.BuildCount);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.AuthStatus != null) {
            this.AuthStatus = new Long(source.AuthStatus);
        }
        if (source.InstanceVersion != null) {
            this.InstanceVersion = new String(source.InstanceVersion);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.RepositoryUrl != null) {
            this.RepositoryUrl = new String(source.RepositoryUrl);
        }
        if (source.RepositoryName != null) {
            this.RepositoryName = new String(source.RepositoryName);
        }
        if (source.IsCore != null) {
            this.IsCore = new Long(source.IsCore);
        }
        if (source.VulRisk != null) {
            this.VulRisk = new Long(source.VulRisk);
        }
        if (source.CheckCount != null) {
            this.CheckCount = new Long(source.CheckCount);
        }
        if (source.CheckTime != null) {
            this.CheckTime = new String(source.CheckTime);
        }
        if (source.IsNewAsset != null) {
            this.IsNewAsset = new Long(source.IsNewAsset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "NickName", this.NickName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceCreateTime", this.InstanceCreateTime);
        this.setParamSimple(map, prefix + "InstanceSize", this.InstanceSize);
        this.setParamSimple(map, prefix + "BuildCount", this.BuildCount);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "AuthStatus", this.AuthStatus);
        this.setParamSimple(map, prefix + "InstanceVersion", this.InstanceVersion);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "RepositoryUrl", this.RepositoryUrl);
        this.setParamSimple(map, prefix + "RepositoryName", this.RepositoryName);
        this.setParamSimple(map, prefix + "IsCore", this.IsCore);
        this.setParamSimple(map, prefix + "VulRisk", this.VulRisk);
        this.setParamSimple(map, prefix + "CheckCount", this.CheckCount);
        this.setParamSimple(map, prefix + "CheckTime", this.CheckTime);
        this.setParamSimple(map, prefix + "IsNewAsset", this.IsNewAsset);

    }
}

