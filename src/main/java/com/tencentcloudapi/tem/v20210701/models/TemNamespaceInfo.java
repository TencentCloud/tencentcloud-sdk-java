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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TemNamespaceInfo extends AbstractModel {

    /**
    * 环境id
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * 渠道
    */
    @SerializedName("Channel")
    @Expose
    private String Channel;

    /**
    * 环境名称
    */
    @SerializedName("EnvironmentName")
    @Expose
    private String EnvironmentName;

    /**
    * 区域名称
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 环境描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 状态,1:已销毁;0:正常
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * vpc网络
    */
    @SerializedName("Vpc")
    @Expose
    private String Vpc;

    /**
    * 创建时间
    */
    @SerializedName("CreateDate")
    @Expose
    private String CreateDate;

    /**
    * 修改时间
    */
    @SerializedName("ModifyDate")
    @Expose
    private String ModifyDate;

    /**
    * 修改人
    */
    @SerializedName("Modifier")
    @Expose
    private String Modifier;

    /**
    * 创建人
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * 应用数
    */
    @SerializedName("ApplicationNum")
    @Expose
    private Long ApplicationNum;

    /**
    * 运行实例数
    */
    @SerializedName("RunInstancesNum")
    @Expose
    private Long RunInstancesNum;

    /**
    * 子网络
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 环境集群 status
    */
    @SerializedName("ClusterStatus")
    @Expose
    private String ClusterStatus;

    /**
    * 是否开启tsw
    */
    @SerializedName("EnableTswTraceService")
    @Expose
    private Boolean EnableTswTraceService;

    /**
    * 环境锁，1为上锁，0则为上锁
    */
    @SerializedName("Locked")
    @Expose
    private Long Locked;

    /**
    * 用户AppId
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 用户Uin
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 用户SubAccountUin
    */
    @SerializedName("SubAccountUin")
    @Expose
    private String SubAccountUin;

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 标签
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 资源是否有权限
    */
    @SerializedName("HasAuthority")
    @Expose
    private Boolean HasAuthority;

    /**
    * 环境类型: test、pre、prod
    */
    @SerializedName("EnvType")
    @Expose
    private String EnvType;

    /**
    * 地域码
    */
    @SerializedName("RegionId")
    @Expose
    private String RegionId;

    /**
     * Get 环境id 
     * @return EnvironmentId 环境id
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set 环境id
     * @param EnvironmentId 环境id
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get 渠道 
     * @return Channel 渠道
     */
    public String getChannel() {
        return this.Channel;
    }

    /**
     * Set 渠道
     * @param Channel 渠道
     */
    public void setChannel(String Channel) {
        this.Channel = Channel;
    }

    /**
     * Get 环境名称 
     * @return EnvironmentName 环境名称
     */
    public String getEnvironmentName() {
        return this.EnvironmentName;
    }

    /**
     * Set 环境名称
     * @param EnvironmentName 环境名称
     */
    public void setEnvironmentName(String EnvironmentName) {
        this.EnvironmentName = EnvironmentName;
    }

    /**
     * Get 区域名称 
     * @return Region 区域名称
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 区域名称
     * @param Region 区域名称
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 环境描述 
     * @return Description 环境描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 环境描述
     * @param Description 环境描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 状态,1:已销毁;0:正常 
     * @return Status 状态,1:已销毁;0:正常
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态,1:已销毁;0:正常
     * @param Status 状态,1:已销毁;0:正常
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get vpc网络 
     * @return Vpc vpc网络
     */
    public String getVpc() {
        return this.Vpc;
    }

    /**
     * Set vpc网络
     * @param Vpc vpc网络
     */
    public void setVpc(String Vpc) {
        this.Vpc = Vpc;
    }

    /**
     * Get 创建时间 
     * @return CreateDate 创建时间
     */
    public String getCreateDate() {
        return this.CreateDate;
    }

    /**
     * Set 创建时间
     * @param CreateDate 创建时间
     */
    public void setCreateDate(String CreateDate) {
        this.CreateDate = CreateDate;
    }

    /**
     * Get 修改时间 
     * @return ModifyDate 修改时间
     */
    public String getModifyDate() {
        return this.ModifyDate;
    }

    /**
     * Set 修改时间
     * @param ModifyDate 修改时间
     */
    public void setModifyDate(String ModifyDate) {
        this.ModifyDate = ModifyDate;
    }

    /**
     * Get 修改人 
     * @return Modifier 修改人
     */
    public String getModifier() {
        return this.Modifier;
    }

    /**
     * Set 修改人
     * @param Modifier 修改人
     */
    public void setModifier(String Modifier) {
        this.Modifier = Modifier;
    }

    /**
     * Get 创建人 
     * @return Creator 创建人
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set 创建人
     * @param Creator 创建人
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get 应用数 
     * @return ApplicationNum 应用数
     */
    public Long getApplicationNum() {
        return this.ApplicationNum;
    }

    /**
     * Set 应用数
     * @param ApplicationNum 应用数
     */
    public void setApplicationNum(Long ApplicationNum) {
        this.ApplicationNum = ApplicationNum;
    }

    /**
     * Get 运行实例数 
     * @return RunInstancesNum 运行实例数
     */
    public Long getRunInstancesNum() {
        return this.RunInstancesNum;
    }

    /**
     * Set 运行实例数
     * @param RunInstancesNum 运行实例数
     */
    public void setRunInstancesNum(Long RunInstancesNum) {
        this.RunInstancesNum = RunInstancesNum;
    }

    /**
     * Get 子网络 
     * @return SubnetId 子网络
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网络
     * @param SubnetId 子网络
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 环境集群 status 
     * @return ClusterStatus 环境集群 status
     */
    public String getClusterStatus() {
        return this.ClusterStatus;
    }

    /**
     * Set 环境集群 status
     * @param ClusterStatus 环境集群 status
     */
    public void setClusterStatus(String ClusterStatus) {
        this.ClusterStatus = ClusterStatus;
    }

    /**
     * Get 是否开启tsw 
     * @return EnableTswTraceService 是否开启tsw
     */
    public Boolean getEnableTswTraceService() {
        return this.EnableTswTraceService;
    }

    /**
     * Set 是否开启tsw
     * @param EnableTswTraceService 是否开启tsw
     */
    public void setEnableTswTraceService(Boolean EnableTswTraceService) {
        this.EnableTswTraceService = EnableTswTraceService;
    }

    /**
     * Get 环境锁，1为上锁，0则为上锁 
     * @return Locked 环境锁，1为上锁，0则为上锁
     */
    public Long getLocked() {
        return this.Locked;
    }

    /**
     * Set 环境锁，1为上锁，0则为上锁
     * @param Locked 环境锁，1为上锁，0则为上锁
     */
    public void setLocked(Long Locked) {
        this.Locked = Locked;
    }

    /**
     * Get 用户AppId 
     * @return AppId 用户AppId
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set 用户AppId
     * @param AppId 用户AppId
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 用户Uin 
     * @return Uin 用户Uin
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 用户Uin
     * @param Uin 用户Uin
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 用户SubAccountUin 
     * @return SubAccountUin 用户SubAccountUin
     */
    public String getSubAccountUin() {
        return this.SubAccountUin;
    }

    /**
     * Set 用户SubAccountUin
     * @param SubAccountUin 用户SubAccountUin
     */
    public void setSubAccountUin(String SubAccountUin) {
        this.SubAccountUin = SubAccountUin;
    }

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 标签 
     * @return Tags 标签
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签
     * @param Tags 标签
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 资源是否有权限 
     * @return HasAuthority 资源是否有权限
     */
    public Boolean getHasAuthority() {
        return this.HasAuthority;
    }

    /**
     * Set 资源是否有权限
     * @param HasAuthority 资源是否有权限
     */
    public void setHasAuthority(Boolean HasAuthority) {
        this.HasAuthority = HasAuthority;
    }

    /**
     * Get 环境类型: test、pre、prod 
     * @return EnvType 环境类型: test、pre、prod
     */
    public String getEnvType() {
        return this.EnvType;
    }

    /**
     * Set 环境类型: test、pre、prod
     * @param EnvType 环境类型: test、pre、prod
     */
    public void setEnvType(String EnvType) {
        this.EnvType = EnvType;
    }

    /**
     * Get 地域码 
     * @return RegionId 地域码
     */
    public String getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 地域码
     * @param RegionId 地域码
     */
    public void setRegionId(String RegionId) {
        this.RegionId = RegionId;
    }

    public TemNamespaceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TemNamespaceInfo(TemNamespaceInfo source) {
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.Channel != null) {
            this.Channel = new String(source.Channel);
        }
        if (source.EnvironmentName != null) {
            this.EnvironmentName = new String(source.EnvironmentName);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Vpc != null) {
            this.Vpc = new String(source.Vpc);
        }
        if (source.CreateDate != null) {
            this.CreateDate = new String(source.CreateDate);
        }
        if (source.ModifyDate != null) {
            this.ModifyDate = new String(source.ModifyDate);
        }
        if (source.Modifier != null) {
            this.Modifier = new String(source.Modifier);
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.ApplicationNum != null) {
            this.ApplicationNum = new Long(source.ApplicationNum);
        }
        if (source.RunInstancesNum != null) {
            this.RunInstancesNum = new Long(source.RunInstancesNum);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.ClusterStatus != null) {
            this.ClusterStatus = new String(source.ClusterStatus);
        }
        if (source.EnableTswTraceService != null) {
            this.EnableTswTraceService = new Boolean(source.EnableTswTraceService);
        }
        if (source.Locked != null) {
            this.Locked = new Long(source.Locked);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.SubAccountUin != null) {
            this.SubAccountUin = new String(source.SubAccountUin);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.HasAuthority != null) {
            this.HasAuthority = new Boolean(source.HasAuthority);
        }
        if (source.EnvType != null) {
            this.EnvType = new String(source.EnvType);
        }
        if (source.RegionId != null) {
            this.RegionId = new String(source.RegionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "Channel", this.Channel);
        this.setParamSimple(map, prefix + "EnvironmentName", this.EnvironmentName);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Vpc", this.Vpc);
        this.setParamSimple(map, prefix + "CreateDate", this.CreateDate);
        this.setParamSimple(map, prefix + "ModifyDate", this.ModifyDate);
        this.setParamSimple(map, prefix + "Modifier", this.Modifier);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "ApplicationNum", this.ApplicationNum);
        this.setParamSimple(map, prefix + "RunInstancesNum", this.RunInstancesNum);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "ClusterStatus", this.ClusterStatus);
        this.setParamSimple(map, prefix + "EnableTswTraceService", this.EnableTswTraceService);
        this.setParamSimple(map, prefix + "Locked", this.Locked);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "SubAccountUin", this.SubAccountUin);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "HasAuthority", this.HasAuthority);
        this.setParamSimple(map, prefix + "EnvType", this.EnvType);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);

    }
}

