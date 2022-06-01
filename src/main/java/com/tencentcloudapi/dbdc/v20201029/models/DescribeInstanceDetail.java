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
package com.tencentcloudapi.dbdc.v20201029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceDetail extends AbstractModel{

    /**
    * 独享集群实例Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 独享集群实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 产品ID, 0:CDB, 1:TDSQL
    */
    @SerializedName("ProductId")
    @Expose
    private Long ProductId;

    /**
    * 集群类型, 0:公有云, 1:金融围笼
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 主机类型, 0:物理机, 1:cvm本地盘, 2:cvm云盘
    */
    @SerializedName("HostType")
    @Expose
    private Long HostType;

    /**
    * 自动续费标志, 0:未设置, 1:自动续费, 2:到期不续费
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * 集群状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 集群状态描述
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 到期时间
    */
    @SerializedName("PeriodEndTime")
    @Expose
    private String PeriodEndTime;

    /**
    * 主机数
    */
    @SerializedName("HostNum")
    @Expose
    private Long HostNum;

    /**
    * DB实例数
    */
    @SerializedName("DbNum")
    @Expose
    private Long DbNum;

    /**
    * 分配策略, 0:紧凑, 1:均匀
    */
    @SerializedName("AssignStrategy")
    @Expose
    private Long AssignStrategy;

    /**
    * 总主机CPU(单位:核数)
    */
    @SerializedName("CpuSpec")
    @Expose
    private Long CpuSpec;

    /**
    * 总已分配CPU(单位:核数)
    */
    @SerializedName("CpuAssigned")
    @Expose
    private Long CpuAssigned;

    /**
    * 总可分配CPU(单位:核数)
    */
    @SerializedName("CpuAssignable")
    @Expose
    private Long CpuAssignable;

    /**
    * 总主机内存(单位:GB)
    */
    @SerializedName("MemorySpec")
    @Expose
    private Long MemorySpec;

    /**
    * 总已分配内存(单位:GB)
    */
    @SerializedName("MemoryAssigned")
    @Expose
    private Long MemoryAssigned;

    /**
    * 总可分配内存(单位:GB)
    */
    @SerializedName("MemoryAssignable")
    @Expose
    private Long MemoryAssignable;

    /**
    * 总机器磁盘(单位:GB)
    */
    @SerializedName("DiskSpec")
    @Expose
    private Long DiskSpec;

    /**
    * 总已分配磁盘(单位:GB)
    */
    @SerializedName("DiskAssigned")
    @Expose
    private Long DiskAssigned;

    /**
    * 总可分配磁盘(单位:GB)
    */
    @SerializedName("DiskAssignable")
    @Expose
    private Long DiskAssignable;

    /**
    * 可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 围笼ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FenceId")
    @Expose
    private String FenceId;

    /**
     * Get 独享集群实例Id 
     * @return InstanceId 独享集群实例Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 独享集群实例Id
     * @param InstanceId 独享集群实例Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 独享集群实例名称 
     * @return InstanceName 独享集群实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 独享集群实例名称
     * @param InstanceName 独享集群实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
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
     * Get 产品ID, 0:CDB, 1:TDSQL 
     * @return ProductId 产品ID, 0:CDB, 1:TDSQL
     */
    public Long getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品ID, 0:CDB, 1:TDSQL
     * @param ProductId 产品ID, 0:CDB, 1:TDSQL
     */
    public void setProductId(Long ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 集群类型, 0:公有云, 1:金融围笼 
     * @return Type 集群类型, 0:公有云, 1:金融围笼
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 集群类型, 0:公有云, 1:金融围笼
     * @param Type 集群类型, 0:公有云, 1:金融围笼
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 主机类型, 0:物理机, 1:cvm本地盘, 2:cvm云盘 
     * @return HostType 主机类型, 0:物理机, 1:cvm本地盘, 2:cvm云盘
     */
    public Long getHostType() {
        return this.HostType;
    }

    /**
     * Set 主机类型, 0:物理机, 1:cvm本地盘, 2:cvm云盘
     * @param HostType 主机类型, 0:物理机, 1:cvm本地盘, 2:cvm云盘
     */
    public void setHostType(Long HostType) {
        this.HostType = HostType;
    }

    /**
     * Get 自动续费标志, 0:未设置, 1:自动续费, 2:到期不续费 
     * @return AutoRenewFlag 自动续费标志, 0:未设置, 1:自动续费, 2:到期不续费
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 自动续费标志, 0:未设置, 1:自动续费, 2:到期不续费
     * @param AutoRenewFlag 自动续费标志, 0:未设置, 1:自动续费, 2:到期不续费
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get 集群状态 
     * @return Status 集群状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 集群状态
     * @param Status 集群状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 集群状态描述 
     * @return StatusDesc 集群状态描述
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set 集群状态描述
     * @param StatusDesc 集群状态描述
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
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
     * Get 主机数 
     * @return HostNum 主机数
     */
    public Long getHostNum() {
        return this.HostNum;
    }

    /**
     * Set 主机数
     * @param HostNum 主机数
     */
    public void setHostNum(Long HostNum) {
        this.HostNum = HostNum;
    }

    /**
     * Get DB实例数 
     * @return DbNum DB实例数
     */
    public Long getDbNum() {
        return this.DbNum;
    }

    /**
     * Set DB实例数
     * @param DbNum DB实例数
     */
    public void setDbNum(Long DbNum) {
        this.DbNum = DbNum;
    }

    /**
     * Get 分配策略, 0:紧凑, 1:均匀 
     * @return AssignStrategy 分配策略, 0:紧凑, 1:均匀
     */
    public Long getAssignStrategy() {
        return this.AssignStrategy;
    }

    /**
     * Set 分配策略, 0:紧凑, 1:均匀
     * @param AssignStrategy 分配策略, 0:紧凑, 1:均匀
     */
    public void setAssignStrategy(Long AssignStrategy) {
        this.AssignStrategy = AssignStrategy;
    }

    /**
     * Get 总主机CPU(单位:核数) 
     * @return CpuSpec 总主机CPU(单位:核数)
     */
    public Long getCpuSpec() {
        return this.CpuSpec;
    }

    /**
     * Set 总主机CPU(单位:核数)
     * @param CpuSpec 总主机CPU(单位:核数)
     */
    public void setCpuSpec(Long CpuSpec) {
        this.CpuSpec = CpuSpec;
    }

    /**
     * Get 总已分配CPU(单位:核数) 
     * @return CpuAssigned 总已分配CPU(单位:核数)
     */
    public Long getCpuAssigned() {
        return this.CpuAssigned;
    }

    /**
     * Set 总已分配CPU(单位:核数)
     * @param CpuAssigned 总已分配CPU(单位:核数)
     */
    public void setCpuAssigned(Long CpuAssigned) {
        this.CpuAssigned = CpuAssigned;
    }

    /**
     * Get 总可分配CPU(单位:核数) 
     * @return CpuAssignable 总可分配CPU(单位:核数)
     */
    public Long getCpuAssignable() {
        return this.CpuAssignable;
    }

    /**
     * Set 总可分配CPU(单位:核数)
     * @param CpuAssignable 总可分配CPU(单位:核数)
     */
    public void setCpuAssignable(Long CpuAssignable) {
        this.CpuAssignable = CpuAssignable;
    }

    /**
     * Get 总主机内存(单位:GB) 
     * @return MemorySpec 总主机内存(单位:GB)
     */
    public Long getMemorySpec() {
        return this.MemorySpec;
    }

    /**
     * Set 总主机内存(单位:GB)
     * @param MemorySpec 总主机内存(单位:GB)
     */
    public void setMemorySpec(Long MemorySpec) {
        this.MemorySpec = MemorySpec;
    }

    /**
     * Get 总已分配内存(单位:GB) 
     * @return MemoryAssigned 总已分配内存(单位:GB)
     */
    public Long getMemoryAssigned() {
        return this.MemoryAssigned;
    }

    /**
     * Set 总已分配内存(单位:GB)
     * @param MemoryAssigned 总已分配内存(单位:GB)
     */
    public void setMemoryAssigned(Long MemoryAssigned) {
        this.MemoryAssigned = MemoryAssigned;
    }

    /**
     * Get 总可分配内存(单位:GB) 
     * @return MemoryAssignable 总可分配内存(单位:GB)
     */
    public Long getMemoryAssignable() {
        return this.MemoryAssignable;
    }

    /**
     * Set 总可分配内存(单位:GB)
     * @param MemoryAssignable 总可分配内存(单位:GB)
     */
    public void setMemoryAssignable(Long MemoryAssignable) {
        this.MemoryAssignable = MemoryAssignable;
    }

    /**
     * Get 总机器磁盘(单位:GB) 
     * @return DiskSpec 总机器磁盘(单位:GB)
     */
    public Long getDiskSpec() {
        return this.DiskSpec;
    }

    /**
     * Set 总机器磁盘(单位:GB)
     * @param DiskSpec 总机器磁盘(单位:GB)
     */
    public void setDiskSpec(Long DiskSpec) {
        this.DiskSpec = DiskSpec;
    }

    /**
     * Get 总已分配磁盘(单位:GB) 
     * @return DiskAssigned 总已分配磁盘(单位:GB)
     */
    public Long getDiskAssigned() {
        return this.DiskAssigned;
    }

    /**
     * Set 总已分配磁盘(单位:GB)
     * @param DiskAssigned 总已分配磁盘(单位:GB)
     */
    public void setDiskAssigned(Long DiskAssigned) {
        this.DiskAssigned = DiskAssigned;
    }

    /**
     * Get 总可分配磁盘(单位:GB) 
     * @return DiskAssignable 总可分配磁盘(单位:GB)
     */
    public Long getDiskAssignable() {
        return this.DiskAssignable;
    }

    /**
     * Set 总可分配磁盘(单位:GB)
     * @param DiskAssignable 总可分配磁盘(单位:GB)
     */
    public void setDiskAssignable(Long DiskAssignable) {
        this.DiskAssignable = DiskAssignable;
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
     * Get 围笼ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FenceId 围笼ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFenceId() {
        return this.FenceId;
    }

    /**
     * Set 围笼ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param FenceId 围笼ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFenceId(String FenceId) {
        this.FenceId = FenceId;
    }

    public DescribeInstanceDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceDetail(DescribeInstanceDetail source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.ProductId != null) {
            this.ProductId = new Long(source.ProductId);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.HostType != null) {
            this.HostType = new Long(source.HostType);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.StatusDesc != null) {
            this.StatusDesc = new String(source.StatusDesc);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.PeriodEndTime != null) {
            this.PeriodEndTime = new String(source.PeriodEndTime);
        }
        if (source.HostNum != null) {
            this.HostNum = new Long(source.HostNum);
        }
        if (source.DbNum != null) {
            this.DbNum = new Long(source.DbNum);
        }
        if (source.AssignStrategy != null) {
            this.AssignStrategy = new Long(source.AssignStrategy);
        }
        if (source.CpuSpec != null) {
            this.CpuSpec = new Long(source.CpuSpec);
        }
        if (source.CpuAssigned != null) {
            this.CpuAssigned = new Long(source.CpuAssigned);
        }
        if (source.CpuAssignable != null) {
            this.CpuAssignable = new Long(source.CpuAssignable);
        }
        if (source.MemorySpec != null) {
            this.MemorySpec = new Long(source.MemorySpec);
        }
        if (source.MemoryAssigned != null) {
            this.MemoryAssigned = new Long(source.MemoryAssigned);
        }
        if (source.MemoryAssignable != null) {
            this.MemoryAssignable = new Long(source.MemoryAssignable);
        }
        if (source.DiskSpec != null) {
            this.DiskSpec = new Long(source.DiskSpec);
        }
        if (source.DiskAssigned != null) {
            this.DiskAssigned = new Long(source.DiskAssigned);
        }
        if (source.DiskAssignable != null) {
            this.DiskAssignable = new Long(source.DiskAssignable);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.FenceId != null) {
            this.FenceId = new String(source.FenceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "HostType", this.HostType);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "PeriodEndTime", this.PeriodEndTime);
        this.setParamSimple(map, prefix + "HostNum", this.HostNum);
        this.setParamSimple(map, prefix + "DbNum", this.DbNum);
        this.setParamSimple(map, prefix + "AssignStrategy", this.AssignStrategy);
        this.setParamSimple(map, prefix + "CpuSpec", this.CpuSpec);
        this.setParamSimple(map, prefix + "CpuAssigned", this.CpuAssigned);
        this.setParamSimple(map, prefix + "CpuAssignable", this.CpuAssignable);
        this.setParamSimple(map, prefix + "MemorySpec", this.MemorySpec);
        this.setParamSimple(map, prefix + "MemoryAssigned", this.MemoryAssigned);
        this.setParamSimple(map, prefix + "MemoryAssignable", this.MemoryAssignable);
        this.setParamSimple(map, prefix + "DiskSpec", this.DiskSpec);
        this.setParamSimple(map, prefix + "DiskAssigned", this.DiskAssigned);
        this.setParamSimple(map, prefix + "DiskAssignable", this.DiskAssignable);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "FenceId", this.FenceId);

    }
}

