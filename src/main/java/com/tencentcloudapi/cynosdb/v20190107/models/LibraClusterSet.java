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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LibraClusterSet extends AbstractModel {

    /**
    * 用户id
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 集群名称
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 数据库版本
    */
    @SerializedName("DbVersion")
    @Expose
    private String DbVersion;

    /**
    * 实例信息
    */
    @SerializedName("InstanceSet")
    @Expose
    private LibraInstanceSet [] InstanceSet;

    /**
    * 付费模式
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * 到期时间
    */
    @SerializedName("PeriodEndTime")
    @Expose
    private String PeriodEndTime;

    /**
    * 项目id
    */
    @SerializedName("ProjectID")
    @Expose
    private Long ProjectID;

    /**
    * 地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 自动续费标识，1为自动续费，0为到期不续
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * 状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 状态描述
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * 存储大小
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * 使用容量
    */
    @SerializedName("UsedStorage")
    @Expose
    private Long UsedStorage;

    /**
    * vip地址
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * vport端口
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
     * Get 用户id 
     * @return AppId 用户id
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 用户id
     * @param AppId 用户id
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
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
     * Get 集群名称 
     * @return ClusterName 集群名称
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 集群名称
     * @param ClusterName 集群名称
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
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
     * Get 数据库版本 
     * @return DbVersion 数据库版本
     */
    public String getDbVersion() {
        return this.DbVersion;
    }

    /**
     * Set 数据库版本
     * @param DbVersion 数据库版本
     */
    public void setDbVersion(String DbVersion) {
        this.DbVersion = DbVersion;
    }

    /**
     * Get 实例信息 
     * @return InstanceSet 实例信息
     */
    public LibraInstanceSet [] getInstanceSet() {
        return this.InstanceSet;
    }

    /**
     * Set 实例信息
     * @param InstanceSet 实例信息
     */
    public void setInstanceSet(LibraInstanceSet [] InstanceSet) {
        this.InstanceSet = InstanceSet;
    }

    /**
     * Get 付费模式 
     * @return PayMode 付费模式
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 付费模式
     * @param PayMode 付费模式
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 到期时间 
     * @return PeriodEndTime 到期时间
     */
    public String getPeriodEndTime() {
        return this.PeriodEndTime;
    }

    /**
     * Set 到期时间
     * @param PeriodEndTime 到期时间
     */
    public void setPeriodEndTime(String PeriodEndTime) {
        this.PeriodEndTime = PeriodEndTime;
    }

    /**
     * Get 项目id 
     * @return ProjectID 项目id
     */
    public Long getProjectID() {
        return this.ProjectID;
    }

    /**
     * Set 项目id
     * @param ProjectID 项目id
     */
    public void setProjectID(Long ProjectID) {
        this.ProjectID = ProjectID;
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
     * Get 自动续费标识，1为自动续费，0为到期不续 
     * @return RenewFlag 自动续费标识，1为自动续费，0为到期不续
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set 自动续费标识，1为自动续费，0为到期不续
     * @param RenewFlag 自动续费标识，1为自动续费，0为到期不续
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get 状态 
     * @return Status 状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
     * @param Status 状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 状态描述 
     * @return StatusDesc 状态描述
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set 状态描述
     * @param StatusDesc 状态描述
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get 存储大小 
     * @return Storage 存储大小
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set 存储大小
     * @param Storage 存储大小
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get 使用容量 
     * @return UsedStorage 使用容量
     */
    public Long getUsedStorage() {
        return this.UsedStorage;
    }

    /**
     * Set 使用容量
     * @param UsedStorage 使用容量
     */
    public void setUsedStorage(Long UsedStorage) {
        this.UsedStorage = UsedStorage;
    }

    /**
     * Get vip地址 
     * @return Vip vip地址
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set vip地址
     * @param Vip vip地址
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get vport端口 
     * @return Vport vport端口
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set vport端口
     * @param Vport vport端口
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    public LibraClusterSet() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LibraClusterSet(LibraClusterSet source) {
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.DbVersion != null) {
            this.DbVersion = new String(source.DbVersion);
        }
        if (source.InstanceSet != null) {
            this.InstanceSet = new LibraInstanceSet[source.InstanceSet.length];
            for (int i = 0; i < source.InstanceSet.length; i++) {
                this.InstanceSet[i] = new LibraInstanceSet(source.InstanceSet[i]);
            }
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.PeriodEndTime != null) {
            this.PeriodEndTime = new String(source.PeriodEndTime);
        }
        if (source.ProjectID != null) {
            this.ProjectID = new Long(source.ProjectID);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Long(source.RenewFlag);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.StatusDesc != null) {
            this.StatusDesc = new String(source.StatusDesc);
        }
        if (source.Storage != null) {
            this.Storage = new Long(source.Storage);
        }
        if (source.UsedStorage != null) {
            this.UsedStorage = new Long(source.UsedStorage);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "DbVersion", this.DbVersion);
        this.setParamArrayObj(map, prefix + "InstanceSet.", this.InstanceSet);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "PeriodEndTime", this.PeriodEndTime);
        this.setParamSimple(map, prefix + "ProjectID", this.ProjectID);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "UsedStorage", this.UsedStorage);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);

    }
}

