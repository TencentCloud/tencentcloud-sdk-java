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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CDCResource extends AbstractModel {

    /**
    * 用户的Appid
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 地域id
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * 可用区id
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * redis独享集群id
    */
    @SerializedName("RedisClusterId")
    @Expose
    private String RedisClusterId;

    /**
    * 计费模式，1-包年包月，0-按量计费
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 自动续费标识，0 - 默认状态（手动续费）；1 - 自动续费；2 - 明确不自动续费
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * 独享集群名称
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 实例创建时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 实例到期时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 集群状态：1-流程中，2-运行中，3-已隔离
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 基础管控资源包
    */
    @SerializedName("BaseBundles")
    @Expose
    private ResourceBundle [] BaseBundles;

    /**
    * 资源包列表
    */
    @SerializedName("ResourceBundles")
    @Expose
    private ResourceBundle [] ResourceBundles;

    /**
    * 所属本地专有集群id
    */
    @SerializedName("DedicatedClusterId")
    @Expose
    private String DedicatedClusterId;

    /**
     * Get 用户的Appid 
     * @return AppId 用户的Appid
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 用户的Appid
     * @param AppId 用户的Appid
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 地域id 
     * @return RegionId 地域id
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 地域id
     * @param RegionId 地域id
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 可用区id 
     * @return ZoneId 可用区id
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 可用区id
     * @param ZoneId 可用区id
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get redis独享集群id 
     * @return RedisClusterId redis独享集群id
     */
    public String getRedisClusterId() {
        return this.RedisClusterId;
    }

    /**
     * Set redis独享集群id
     * @param RedisClusterId redis独享集群id
     */
    public void setRedisClusterId(String RedisClusterId) {
        this.RedisClusterId = RedisClusterId;
    }

    /**
     * Get 计费模式，1-包年包月，0-按量计费 
     * @return PayMode 计费模式，1-包年包月，0-按量计费
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 计费模式，1-包年包月，0-按量计费
     * @param PayMode 计费模式，1-包年包月，0-按量计费
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 项目id 
     * @return ProjectId 项目id
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id
     * @param ProjectId 项目id
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 自动续费标识，0 - 默认状态（手动续费）；1 - 自动续费；2 - 明确不自动续费 
     * @return AutoRenewFlag 自动续费标识，0 - 默认状态（手动续费）；1 - 自动续费；2 - 明确不自动续费
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 自动续费标识，0 - 默认状态（手动续费）；1 - 自动续费；2 - 明确不自动续费
     * @param AutoRenewFlag 自动续费标识，0 - 默认状态（手动续费）；1 - 自动续费；2 - 明确不自动续费
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get 独享集群名称 
     * @return ClusterName 独享集群名称
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 独享集群名称
     * @param ClusterName 独享集群名称
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 实例创建时间 
     * @return StartTime 实例创建时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 实例创建时间
     * @param StartTime 实例创建时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 实例到期时间 
     * @return EndTime 实例到期时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 实例到期时间
     * @param EndTime 实例到期时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 集群状态：1-流程中，2-运行中，3-已隔离 
     * @return Status 集群状态：1-流程中，2-运行中，3-已隔离
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 集群状态：1-流程中，2-运行中，3-已隔离
     * @param Status 集群状态：1-流程中，2-运行中，3-已隔离
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 基础管控资源包 
     * @return BaseBundles 基础管控资源包
     */
    public ResourceBundle [] getBaseBundles() {
        return this.BaseBundles;
    }

    /**
     * Set 基础管控资源包
     * @param BaseBundles 基础管控资源包
     */
    public void setBaseBundles(ResourceBundle [] BaseBundles) {
        this.BaseBundles = BaseBundles;
    }

    /**
     * Get 资源包列表 
     * @return ResourceBundles 资源包列表
     */
    public ResourceBundle [] getResourceBundles() {
        return this.ResourceBundles;
    }

    /**
     * Set 资源包列表
     * @param ResourceBundles 资源包列表
     */
    public void setResourceBundles(ResourceBundle [] ResourceBundles) {
        this.ResourceBundles = ResourceBundles;
    }

    /**
     * Get 所属本地专有集群id 
     * @return DedicatedClusterId 所属本地专有集群id
     */
    public String getDedicatedClusterId() {
        return this.DedicatedClusterId;
    }

    /**
     * Set 所属本地专有集群id
     * @param DedicatedClusterId 所属本地专有集群id
     */
    public void setDedicatedClusterId(String DedicatedClusterId) {
        this.DedicatedClusterId = DedicatedClusterId;
    }

    public CDCResource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CDCResource(CDCResource source) {
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.RedisClusterId != null) {
            this.RedisClusterId = new String(source.RedisClusterId);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.BaseBundles != null) {
            this.BaseBundles = new ResourceBundle[source.BaseBundles.length];
            for (int i = 0; i < source.BaseBundles.length; i++) {
                this.BaseBundles[i] = new ResourceBundle(source.BaseBundles[i]);
            }
        }
        if (source.ResourceBundles != null) {
            this.ResourceBundles = new ResourceBundle[source.ResourceBundles.length];
            for (int i = 0; i < source.ResourceBundles.length; i++) {
                this.ResourceBundles[i] = new ResourceBundle(source.ResourceBundles[i]);
            }
        }
        if (source.DedicatedClusterId != null) {
            this.DedicatedClusterId = new String(source.DedicatedClusterId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "RedisClusterId", this.RedisClusterId);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "BaseBundles.", this.BaseBundles);
        this.setParamArrayObj(map, prefix + "ResourceBundles.", this.ResourceBundles);
        this.setParamSimple(map, prefix + "DedicatedClusterId", this.DedicatedClusterId);

    }
}

