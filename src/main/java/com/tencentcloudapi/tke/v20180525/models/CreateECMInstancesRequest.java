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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateECMInstancesRequest extends AbstractModel{

    /**
    * 集群id
    */
    @SerializedName("ClusterID")
    @Expose
    private String ClusterID;

    /**
    * 模块id
    */
    @SerializedName("ModuleId")
    @Expose
    private String ModuleId;

    /**
    * 需要创建实例的可用区及创建数目及运营商的列表
    */
    @SerializedName("ZoneInstanceCountISPSet")
    @Expose
    private ECMZoneInstanceCountISP [] ZoneInstanceCountISPSet;

    /**
    * 密码
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 公网带宽
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

    /**
    * 镜像id
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * 实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 主机名称
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * 增强服务，包括云镜和云监控
    */
    @SerializedName("EnhancedService")
    @Expose
    private ECMEnhancedService EnhancedService;

    /**
    * 用户自定义脚本
    */
    @SerializedName("UserData")
    @Expose
    private String UserData;

    /**
    * 实例扩展信息
    */
    @SerializedName("External")
    @Expose
    private String External;

    /**
    * 实例所属安全组
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
     * Get 集群id 
     * @return ClusterID 集群id
     */
    public String getClusterID() {
        return this.ClusterID;
    }

    /**
     * Set 集群id
     * @param ClusterID 集群id
     */
    public void setClusterID(String ClusterID) {
        this.ClusterID = ClusterID;
    }

    /**
     * Get 模块id 
     * @return ModuleId 模块id
     */
    public String getModuleId() {
        return this.ModuleId;
    }

    /**
     * Set 模块id
     * @param ModuleId 模块id
     */
    public void setModuleId(String ModuleId) {
        this.ModuleId = ModuleId;
    }

    /**
     * Get 需要创建实例的可用区及创建数目及运营商的列表 
     * @return ZoneInstanceCountISPSet 需要创建实例的可用区及创建数目及运营商的列表
     */
    public ECMZoneInstanceCountISP [] getZoneInstanceCountISPSet() {
        return this.ZoneInstanceCountISPSet;
    }

    /**
     * Set 需要创建实例的可用区及创建数目及运营商的列表
     * @param ZoneInstanceCountISPSet 需要创建实例的可用区及创建数目及运营商的列表
     */
    public void setZoneInstanceCountISPSet(ECMZoneInstanceCountISP [] ZoneInstanceCountISPSet) {
        this.ZoneInstanceCountISPSet = ZoneInstanceCountISPSet;
    }

    /**
     * Get 密码 
     * @return Password 密码
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 密码
     * @param Password 密码
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 公网带宽 
     * @return InternetMaxBandwidthOut 公网带宽
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set 公网带宽
     * @param InternetMaxBandwidthOut 公网带宽
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * Get 镜像id 
     * @return ImageId 镜像id
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set 镜像id
     * @param ImageId 镜像id
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
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
     * Get 主机名称 
     * @return HostName 主机名称
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set 主机名称
     * @param HostName 主机名称
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get 增强服务，包括云镜和云监控 
     * @return EnhancedService 增强服务，包括云镜和云监控
     */
    public ECMEnhancedService getEnhancedService() {
        return this.EnhancedService;
    }

    /**
     * Set 增强服务，包括云镜和云监控
     * @param EnhancedService 增强服务，包括云镜和云监控
     */
    public void setEnhancedService(ECMEnhancedService EnhancedService) {
        this.EnhancedService = EnhancedService;
    }

    /**
     * Get 用户自定义脚本 
     * @return UserData 用户自定义脚本
     */
    public String getUserData() {
        return this.UserData;
    }

    /**
     * Set 用户自定义脚本
     * @param UserData 用户自定义脚本
     */
    public void setUserData(String UserData) {
        this.UserData = UserData;
    }

    /**
     * Get 实例扩展信息 
     * @return External 实例扩展信息
     */
    public String getExternal() {
        return this.External;
    }

    /**
     * Set 实例扩展信息
     * @param External 实例扩展信息
     */
    public void setExternal(String External) {
        this.External = External;
    }

    /**
     * Get 实例所属安全组 
     * @return SecurityGroupIds 实例所属安全组
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set 实例所属安全组
     * @param SecurityGroupIds 实例所属安全组
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    public CreateECMInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateECMInstancesRequest(CreateECMInstancesRequest source) {
        if (source.ClusterID != null) {
            this.ClusterID = new String(source.ClusterID);
        }
        if (source.ModuleId != null) {
            this.ModuleId = new String(source.ModuleId);
        }
        if (source.ZoneInstanceCountISPSet != null) {
            this.ZoneInstanceCountISPSet = new ECMZoneInstanceCountISP[source.ZoneInstanceCountISPSet.length];
            for (int i = 0; i < source.ZoneInstanceCountISPSet.length; i++) {
                this.ZoneInstanceCountISPSet[i] = new ECMZoneInstanceCountISP(source.ZoneInstanceCountISPSet[i]);
            }
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.InternetMaxBandwidthOut != null) {
            this.InternetMaxBandwidthOut = new Long(source.InternetMaxBandwidthOut);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.EnhancedService != null) {
            this.EnhancedService = new ECMEnhancedService(source.EnhancedService);
        }
        if (source.UserData != null) {
            this.UserData = new String(source.UserData);
        }
        if (source.External != null) {
            this.External = new String(source.External);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterID", this.ClusterID);
        this.setParamSimple(map, prefix + "ModuleId", this.ModuleId);
        this.setParamArrayObj(map, prefix + "ZoneInstanceCountISPSet.", this.ZoneInstanceCountISPSet);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "InternetMaxBandwidthOut", this.InternetMaxBandwidthOut);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamObj(map, prefix + "EnhancedService.", this.EnhancedService);
        this.setParamSimple(map, prefix + "UserData", this.UserData);
        this.setParamSimple(map, prefix + "External", this.External);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);

    }
}

