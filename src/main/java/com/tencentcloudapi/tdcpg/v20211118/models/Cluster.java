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
package com.tencentcloudapi.tdcpg.v20211118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Cluster extends AbstractModel{

    /**
    * 集群ID，集群的唯一标识
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 集群名字，不修改时默认和集群ID相同
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 数据库版本
    */
    @SerializedName("DBVersion")
    @Expose
    private String DBVersion;

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 集群状态。目前包括
 - creating ：创建中
 - running : 运行中
 - isolating : 隔离中
 - isolated : 已隔离
 - recovering : 恢复中
 - deleting : 删除中
 - deleted : 已删除
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 集群状态中文含义
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * 集群创建时间。按照RFC3339标准表示，并且使用东八区时区时间，格式为：YYYY-MM-DDThh:mm:ss+08:00。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 存储当前使用量，单位GiB
    */
    @SerializedName("StorageUsed")
    @Expose
    private Float StorageUsed;

    /**
    * 存储最大使用量，单位GiB
    */
    @SerializedName("StorageLimit")
    @Expose
    private Long StorageLimit;

    /**
    * 付费模式：
 - PREPAID : 预付费，即包年包月
 - POSTPAID_BY_HOUR : 按小时结算后付费
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * 预付费集群到期时间。按照RFC3339标准表示，并且使用东八区时区时间，格式为：YYYY-MM-DDThh:mm:ss+08:00。
    */
    @SerializedName("PayPeriodEndTime")
    @Expose
    private String PayPeriodEndTime;

    /**
    * 预付费集群自动续费标签
 - 0 : 到期不自动续费
 - 1 : 到期自动续费
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * 数据库字符集
    */
    @SerializedName("DBCharset")
    @Expose
    private String DBCharset;

    /**
    * 集群内实例的数量
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * 集群内访问点信息
    */
    @SerializedName("EndpointSet")
    @Expose
    private Endpoint [] EndpointSet;

    /**
     * Get 集群ID，集群的唯一标识 
     * @return ClusterId 集群ID，集群的唯一标识
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID，集群的唯一标识
     * @param ClusterId 集群ID，集群的唯一标识
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 集群名字，不修改时默认和集群ID相同 
     * @return ClusterName 集群名字，不修改时默认和集群ID相同
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 集群名字，不修改时默认和集群ID相同
     * @param ClusterName 集群名字，不修改时默认和集群ID相同
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
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
     * Get 可用区 
     * @return Zone 可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区
     * @param Zone 可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 数据库版本 
     * @return DBVersion 数据库版本
     */
    public String getDBVersion() {
        return this.DBVersion;
    }

    /**
     * Set 数据库版本
     * @param DBVersion 数据库版本
     */
    public void setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
    }

    /**
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 集群状态。目前包括
 - creating ：创建中
 - running : 运行中
 - isolating : 隔离中
 - isolated : 已隔离
 - recovering : 恢复中
 - deleting : 删除中
 - deleted : 已删除 
     * @return Status 集群状态。目前包括
 - creating ：创建中
 - running : 运行中
 - isolating : 隔离中
 - isolated : 已隔离
 - recovering : 恢复中
 - deleting : 删除中
 - deleted : 已删除
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 集群状态。目前包括
 - creating ：创建中
 - running : 运行中
 - isolating : 隔离中
 - isolated : 已隔离
 - recovering : 恢复中
 - deleting : 删除中
 - deleted : 已删除
     * @param Status 集群状态。目前包括
 - creating ：创建中
 - running : 运行中
 - isolating : 隔离中
 - isolated : 已隔离
 - recovering : 恢复中
 - deleting : 删除中
 - deleted : 已删除
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 集群状态中文含义 
     * @return StatusDesc 集群状态中文含义
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set 集群状态中文含义
     * @param StatusDesc 集群状态中文含义
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get 集群创建时间。按照RFC3339标准表示，并且使用东八区时区时间，格式为：YYYY-MM-DDThh:mm:ss+08:00。 
     * @return CreateTime 集群创建时间。按照RFC3339标准表示，并且使用东八区时区时间，格式为：YYYY-MM-DDThh:mm:ss+08:00。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 集群创建时间。按照RFC3339标准表示，并且使用东八区时区时间，格式为：YYYY-MM-DDThh:mm:ss+08:00。
     * @param CreateTime 集群创建时间。按照RFC3339标准表示，并且使用东八区时区时间，格式为：YYYY-MM-DDThh:mm:ss+08:00。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 存储当前使用量，单位GiB 
     * @return StorageUsed 存储当前使用量，单位GiB
     */
    public Float getStorageUsed() {
        return this.StorageUsed;
    }

    /**
     * Set 存储当前使用量，单位GiB
     * @param StorageUsed 存储当前使用量，单位GiB
     */
    public void setStorageUsed(Float StorageUsed) {
        this.StorageUsed = StorageUsed;
    }

    /**
     * Get 存储最大使用量，单位GiB 
     * @return StorageLimit 存储最大使用量，单位GiB
     */
    public Long getStorageLimit() {
        return this.StorageLimit;
    }

    /**
     * Set 存储最大使用量，单位GiB
     * @param StorageLimit 存储最大使用量，单位GiB
     */
    public void setStorageLimit(Long StorageLimit) {
        this.StorageLimit = StorageLimit;
    }

    /**
     * Get 付费模式：
 - PREPAID : 预付费，即包年包月
 - POSTPAID_BY_HOUR : 按小时结算后付费 
     * @return PayMode 付费模式：
 - PREPAID : 预付费，即包年包月
 - POSTPAID_BY_HOUR : 按小时结算后付费
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 付费模式：
 - PREPAID : 预付费，即包年包月
 - POSTPAID_BY_HOUR : 按小时结算后付费
     * @param PayMode 付费模式：
 - PREPAID : 预付费，即包年包月
 - POSTPAID_BY_HOUR : 按小时结算后付费
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 预付费集群到期时间。按照RFC3339标准表示，并且使用东八区时区时间，格式为：YYYY-MM-DDThh:mm:ss+08:00。 
     * @return PayPeriodEndTime 预付费集群到期时间。按照RFC3339标准表示，并且使用东八区时区时间，格式为：YYYY-MM-DDThh:mm:ss+08:00。
     */
    public String getPayPeriodEndTime() {
        return this.PayPeriodEndTime;
    }

    /**
     * Set 预付费集群到期时间。按照RFC3339标准表示，并且使用东八区时区时间，格式为：YYYY-MM-DDThh:mm:ss+08:00。
     * @param PayPeriodEndTime 预付费集群到期时间。按照RFC3339标准表示，并且使用东八区时区时间，格式为：YYYY-MM-DDThh:mm:ss+08:00。
     */
    public void setPayPeriodEndTime(String PayPeriodEndTime) {
        this.PayPeriodEndTime = PayPeriodEndTime;
    }

    /**
     * Get 预付费集群自动续费标签
 - 0 : 到期不自动续费
 - 1 : 到期自动续费 
     * @return AutoRenewFlag 预付费集群自动续费标签
 - 0 : 到期不自动续费
 - 1 : 到期自动续费
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 预付费集群自动续费标签
 - 0 : 到期不自动续费
 - 1 : 到期自动续费
     * @param AutoRenewFlag 预付费集群自动续费标签
 - 0 : 到期不自动续费
 - 1 : 到期自动续费
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get 数据库字符集 
     * @return DBCharset 数据库字符集
     */
    public String getDBCharset() {
        return this.DBCharset;
    }

    /**
     * Set 数据库字符集
     * @param DBCharset 数据库字符集
     */
    public void setDBCharset(String DBCharset) {
        this.DBCharset = DBCharset;
    }

    /**
     * Get 集群内实例的数量 
     * @return InstanceCount 集群内实例的数量
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set 集群内实例的数量
     * @param InstanceCount 集群内实例的数量
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get 集群内访问点信息 
     * @return EndpointSet 集群内访问点信息
     */
    public Endpoint [] getEndpointSet() {
        return this.EndpointSet;
    }

    /**
     * Set 集群内访问点信息
     * @param EndpointSet 集群内访问点信息
     */
    public void setEndpointSet(Endpoint [] EndpointSet) {
        this.EndpointSet = EndpointSet;
    }

    public Cluster() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Cluster(Cluster source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.DBVersion != null) {
            this.DBVersion = new String(source.DBVersion);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.StatusDesc != null) {
            this.StatusDesc = new String(source.StatusDesc);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.StorageUsed != null) {
            this.StorageUsed = new Float(source.StorageUsed);
        }
        if (source.StorageLimit != null) {
            this.StorageLimit = new Long(source.StorageLimit);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.PayPeriodEndTime != null) {
            this.PayPeriodEndTime = new String(source.PayPeriodEndTime);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.DBCharset != null) {
            this.DBCharset = new String(source.DBCharset);
        }
        if (source.InstanceCount != null) {
            this.InstanceCount = new Long(source.InstanceCount);
        }
        if (source.EndpointSet != null) {
            this.EndpointSet = new Endpoint[source.EndpointSet.length];
            for (int i = 0; i < source.EndpointSet.length; i++) {
                this.EndpointSet[i] = new Endpoint(source.EndpointSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "DBVersion", this.DBVersion);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "StorageUsed", this.StorageUsed);
        this.setParamSimple(map, prefix + "StorageLimit", this.StorageLimit);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "PayPeriodEndTime", this.PayPeriodEndTime);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "DBCharset", this.DBCharset);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamArrayObj(map, prefix + "EndpointSet.", this.EndpointSet);

    }
}

