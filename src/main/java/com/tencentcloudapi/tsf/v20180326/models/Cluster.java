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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Cluster extends AbstractModel {

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
    * 集群描述
    */
    @SerializedName("ClusterDesc")
    @Expose
    private String ClusterDesc;

    /**
    * 集群类型
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * 集群所属私有网络ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 集群状态
    */
    @SerializedName("ClusterStatus")
    @Expose
    private String ClusterStatus;

    /**
    * 集群CIDR
    */
    @SerializedName("ClusterCIDR")
    @Expose
    private String ClusterCIDR;

    /**
    * 集群总CPU，单位: 核
    */
    @SerializedName("ClusterTotalCpu")
    @Expose
    private Float ClusterTotalCpu;

    /**
    * 集群总内存，单位: G
    */
    @SerializedName("ClusterTotalMem")
    @Expose
    private Float ClusterTotalMem;

    /**
    * 集群已使用CPU，单位: 核
    */
    @SerializedName("ClusterUsedCpu")
    @Expose
    private Float ClusterUsedCpu;

    /**
    * 集群已使用内存，单位: G
    */
    @SerializedName("ClusterUsedMem")
    @Expose
    private Float ClusterUsedMem;

    /**
    * 集群机器实例数量
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * 集群可用的机器实例数量
    */
    @SerializedName("RunInstanceCount")
    @Expose
    private Long RunInstanceCount;

    /**
    * 集群正常状态的机器实例数量
    */
    @SerializedName("NormalInstanceCount")
    @Expose
    private Long NormalInstanceCount;

    /**
    * 删除标记：true：可以删除；false：不可删除
    */
    @SerializedName("DeleteFlag")
    @Expose
    private Boolean DeleteFlag;

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
    * 集群所属TSF地域ID
    */
    @SerializedName("TsfRegionId")
    @Expose
    private String TsfRegionId;

    /**
    * 集群所属TSF地域名称
    */
    @SerializedName("TsfRegionName")
    @Expose
    private String TsfRegionName;

    /**
    * 集群所属TSF可用区ID
    */
    @SerializedName("TsfZoneId")
    @Expose
    private String TsfZoneId;

    /**
    * 集群所属TSF可用区名称
    */
    @SerializedName("TsfZoneName")
    @Expose
    private String TsfZoneName;

    /**
    * 集群不可删除的原因
    */
    @SerializedName("DeleteFlagReason")
    @Expose
    private String DeleteFlagReason;

    /**
    * 集群最大CPU限制，单位：核
    */
    @SerializedName("ClusterLimitCpu")
    @Expose
    private Float ClusterLimitCpu;

    /**
    * 集群最大内存限制，单位：G
    */
    @SerializedName("ClusterLimitMem")
    @Expose
    private Float ClusterLimitMem;

    /**
    * 集群可用的服务实例数量
    */
    @SerializedName("RunServiceInstanceCount")
    @Expose
    private Long RunServiceInstanceCount;

    /**
    * 集群所属子网ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 返回给前端的控制信息
    */
    @SerializedName("OperationInfo")
    @Expose
    private OperationInfo OperationInfo;

    /**
    * 集群版本
    */
    @SerializedName("ClusterVersion")
    @Expose
    private String ClusterVersion;

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
     * Get 集群描述 
     * @return ClusterDesc 集群描述
     */
    public String getClusterDesc() {
        return this.ClusterDesc;
    }

    /**
     * Set 集群描述
     * @param ClusterDesc 集群描述
     */
    public void setClusterDesc(String ClusterDesc) {
        this.ClusterDesc = ClusterDesc;
    }

    /**
     * Get 集群类型 
     * @return ClusterType 集群类型
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set 集群类型
     * @param ClusterType 集群类型
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get 集群所属私有网络ID 
     * @return VpcId 集群所属私有网络ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 集群所属私有网络ID
     * @param VpcId 集群所属私有网络ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 集群状态 
     * @return ClusterStatus 集群状态
     */
    public String getClusterStatus() {
        return this.ClusterStatus;
    }

    /**
     * Set 集群状态
     * @param ClusterStatus 集群状态
     */
    public void setClusterStatus(String ClusterStatus) {
        this.ClusterStatus = ClusterStatus;
    }

    /**
     * Get 集群CIDR 
     * @return ClusterCIDR 集群CIDR
     */
    public String getClusterCIDR() {
        return this.ClusterCIDR;
    }

    /**
     * Set 集群CIDR
     * @param ClusterCIDR 集群CIDR
     */
    public void setClusterCIDR(String ClusterCIDR) {
        this.ClusterCIDR = ClusterCIDR;
    }

    /**
     * Get 集群总CPU，单位: 核 
     * @return ClusterTotalCpu 集群总CPU，单位: 核
     */
    public Float getClusterTotalCpu() {
        return this.ClusterTotalCpu;
    }

    /**
     * Set 集群总CPU，单位: 核
     * @param ClusterTotalCpu 集群总CPU，单位: 核
     */
    public void setClusterTotalCpu(Float ClusterTotalCpu) {
        this.ClusterTotalCpu = ClusterTotalCpu;
    }

    /**
     * Get 集群总内存，单位: G 
     * @return ClusterTotalMem 集群总内存，单位: G
     */
    public Float getClusterTotalMem() {
        return this.ClusterTotalMem;
    }

    /**
     * Set 集群总内存，单位: G
     * @param ClusterTotalMem 集群总内存，单位: G
     */
    public void setClusterTotalMem(Float ClusterTotalMem) {
        this.ClusterTotalMem = ClusterTotalMem;
    }

    /**
     * Get 集群已使用CPU，单位: 核 
     * @return ClusterUsedCpu 集群已使用CPU，单位: 核
     */
    public Float getClusterUsedCpu() {
        return this.ClusterUsedCpu;
    }

    /**
     * Set 集群已使用CPU，单位: 核
     * @param ClusterUsedCpu 集群已使用CPU，单位: 核
     */
    public void setClusterUsedCpu(Float ClusterUsedCpu) {
        this.ClusterUsedCpu = ClusterUsedCpu;
    }

    /**
     * Get 集群已使用内存，单位: G 
     * @return ClusterUsedMem 集群已使用内存，单位: G
     */
    public Float getClusterUsedMem() {
        return this.ClusterUsedMem;
    }

    /**
     * Set 集群已使用内存，单位: G
     * @param ClusterUsedMem 集群已使用内存，单位: G
     */
    public void setClusterUsedMem(Float ClusterUsedMem) {
        this.ClusterUsedMem = ClusterUsedMem;
    }

    /**
     * Get 集群机器实例数量 
     * @return InstanceCount 集群机器实例数量
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set 集群机器实例数量
     * @param InstanceCount 集群机器实例数量
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get 集群可用的机器实例数量 
     * @return RunInstanceCount 集群可用的机器实例数量
     */
    public Long getRunInstanceCount() {
        return this.RunInstanceCount;
    }

    /**
     * Set 集群可用的机器实例数量
     * @param RunInstanceCount 集群可用的机器实例数量
     */
    public void setRunInstanceCount(Long RunInstanceCount) {
        this.RunInstanceCount = RunInstanceCount;
    }

    /**
     * Get 集群正常状态的机器实例数量 
     * @return NormalInstanceCount 集群正常状态的机器实例数量
     */
    public Long getNormalInstanceCount() {
        return this.NormalInstanceCount;
    }

    /**
     * Set 集群正常状态的机器实例数量
     * @param NormalInstanceCount 集群正常状态的机器实例数量
     */
    public void setNormalInstanceCount(Long NormalInstanceCount) {
        this.NormalInstanceCount = NormalInstanceCount;
    }

    /**
     * Get 删除标记：true：可以删除；false：不可删除 
     * @return DeleteFlag 删除标记：true：可以删除；false：不可删除
     */
    public Boolean getDeleteFlag() {
        return this.DeleteFlag;
    }

    /**
     * Set 删除标记：true：可以删除；false：不可删除
     * @param DeleteFlag 删除标记：true：可以删除；false：不可删除
     */
    public void setDeleteFlag(Boolean DeleteFlag) {
        this.DeleteFlag = DeleteFlag;
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
     * Get 集群所属TSF地域ID 
     * @return TsfRegionId 集群所属TSF地域ID
     */
    public String getTsfRegionId() {
        return this.TsfRegionId;
    }

    /**
     * Set 集群所属TSF地域ID
     * @param TsfRegionId 集群所属TSF地域ID
     */
    public void setTsfRegionId(String TsfRegionId) {
        this.TsfRegionId = TsfRegionId;
    }

    /**
     * Get 集群所属TSF地域名称 
     * @return TsfRegionName 集群所属TSF地域名称
     */
    public String getTsfRegionName() {
        return this.TsfRegionName;
    }

    /**
     * Set 集群所属TSF地域名称
     * @param TsfRegionName 集群所属TSF地域名称
     */
    public void setTsfRegionName(String TsfRegionName) {
        this.TsfRegionName = TsfRegionName;
    }

    /**
     * Get 集群所属TSF可用区ID 
     * @return TsfZoneId 集群所属TSF可用区ID
     */
    public String getTsfZoneId() {
        return this.TsfZoneId;
    }

    /**
     * Set 集群所属TSF可用区ID
     * @param TsfZoneId 集群所属TSF可用区ID
     */
    public void setTsfZoneId(String TsfZoneId) {
        this.TsfZoneId = TsfZoneId;
    }

    /**
     * Get 集群所属TSF可用区名称 
     * @return TsfZoneName 集群所属TSF可用区名称
     */
    public String getTsfZoneName() {
        return this.TsfZoneName;
    }

    /**
     * Set 集群所属TSF可用区名称
     * @param TsfZoneName 集群所属TSF可用区名称
     */
    public void setTsfZoneName(String TsfZoneName) {
        this.TsfZoneName = TsfZoneName;
    }

    /**
     * Get 集群不可删除的原因 
     * @return DeleteFlagReason 集群不可删除的原因
     */
    public String getDeleteFlagReason() {
        return this.DeleteFlagReason;
    }

    /**
     * Set 集群不可删除的原因
     * @param DeleteFlagReason 集群不可删除的原因
     */
    public void setDeleteFlagReason(String DeleteFlagReason) {
        this.DeleteFlagReason = DeleteFlagReason;
    }

    /**
     * Get 集群最大CPU限制，单位：核 
     * @return ClusterLimitCpu 集群最大CPU限制，单位：核
     */
    public Float getClusterLimitCpu() {
        return this.ClusterLimitCpu;
    }

    /**
     * Set 集群最大CPU限制，单位：核
     * @param ClusterLimitCpu 集群最大CPU限制，单位：核
     */
    public void setClusterLimitCpu(Float ClusterLimitCpu) {
        this.ClusterLimitCpu = ClusterLimitCpu;
    }

    /**
     * Get 集群最大内存限制，单位：G 
     * @return ClusterLimitMem 集群最大内存限制，单位：G
     */
    public Float getClusterLimitMem() {
        return this.ClusterLimitMem;
    }

    /**
     * Set 集群最大内存限制，单位：G
     * @param ClusterLimitMem 集群最大内存限制，单位：G
     */
    public void setClusterLimitMem(Float ClusterLimitMem) {
        this.ClusterLimitMem = ClusterLimitMem;
    }

    /**
     * Get 集群可用的服务实例数量 
     * @return RunServiceInstanceCount 集群可用的服务实例数量
     */
    public Long getRunServiceInstanceCount() {
        return this.RunServiceInstanceCount;
    }

    /**
     * Set 集群可用的服务实例数量
     * @param RunServiceInstanceCount 集群可用的服务实例数量
     */
    public void setRunServiceInstanceCount(Long RunServiceInstanceCount) {
        this.RunServiceInstanceCount = RunServiceInstanceCount;
    }

    /**
     * Get 集群所属子网ID 
     * @return SubnetId 集群所属子网ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 集群所属子网ID
     * @param SubnetId 集群所属子网ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 返回给前端的控制信息 
     * @return OperationInfo 返回给前端的控制信息
     */
    public OperationInfo getOperationInfo() {
        return this.OperationInfo;
    }

    /**
     * Set 返回给前端的控制信息
     * @param OperationInfo 返回给前端的控制信息
     */
    public void setOperationInfo(OperationInfo OperationInfo) {
        this.OperationInfo = OperationInfo;
    }

    /**
     * Get 集群版本 
     * @return ClusterVersion 集群版本
     */
    public String getClusterVersion() {
        return this.ClusterVersion;
    }

    /**
     * Set 集群版本
     * @param ClusterVersion 集群版本
     */
    public void setClusterVersion(String ClusterVersion) {
        this.ClusterVersion = ClusterVersion;
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
        if (source.ClusterDesc != null) {
            this.ClusterDesc = new String(source.ClusterDesc);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.ClusterStatus != null) {
            this.ClusterStatus = new String(source.ClusterStatus);
        }
        if (source.ClusterCIDR != null) {
            this.ClusterCIDR = new String(source.ClusterCIDR);
        }
        if (source.ClusterTotalCpu != null) {
            this.ClusterTotalCpu = new Float(source.ClusterTotalCpu);
        }
        if (source.ClusterTotalMem != null) {
            this.ClusterTotalMem = new Float(source.ClusterTotalMem);
        }
        if (source.ClusterUsedCpu != null) {
            this.ClusterUsedCpu = new Float(source.ClusterUsedCpu);
        }
        if (source.ClusterUsedMem != null) {
            this.ClusterUsedMem = new Float(source.ClusterUsedMem);
        }
        if (source.InstanceCount != null) {
            this.InstanceCount = new Long(source.InstanceCount);
        }
        if (source.RunInstanceCount != null) {
            this.RunInstanceCount = new Long(source.RunInstanceCount);
        }
        if (source.NormalInstanceCount != null) {
            this.NormalInstanceCount = new Long(source.NormalInstanceCount);
        }
        if (source.DeleteFlag != null) {
            this.DeleteFlag = new Boolean(source.DeleteFlag);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.TsfRegionId != null) {
            this.TsfRegionId = new String(source.TsfRegionId);
        }
        if (source.TsfRegionName != null) {
            this.TsfRegionName = new String(source.TsfRegionName);
        }
        if (source.TsfZoneId != null) {
            this.TsfZoneId = new String(source.TsfZoneId);
        }
        if (source.TsfZoneName != null) {
            this.TsfZoneName = new String(source.TsfZoneName);
        }
        if (source.DeleteFlagReason != null) {
            this.DeleteFlagReason = new String(source.DeleteFlagReason);
        }
        if (source.ClusterLimitCpu != null) {
            this.ClusterLimitCpu = new Float(source.ClusterLimitCpu);
        }
        if (source.ClusterLimitMem != null) {
            this.ClusterLimitMem = new Float(source.ClusterLimitMem);
        }
        if (source.RunServiceInstanceCount != null) {
            this.RunServiceInstanceCount = new Long(source.RunServiceInstanceCount);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.OperationInfo != null) {
            this.OperationInfo = new OperationInfo(source.OperationInfo);
        }
        if (source.ClusterVersion != null) {
            this.ClusterVersion = new String(source.ClusterVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "ClusterDesc", this.ClusterDesc);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "ClusterStatus", this.ClusterStatus);
        this.setParamSimple(map, prefix + "ClusterCIDR", this.ClusterCIDR);
        this.setParamSimple(map, prefix + "ClusterTotalCpu", this.ClusterTotalCpu);
        this.setParamSimple(map, prefix + "ClusterTotalMem", this.ClusterTotalMem);
        this.setParamSimple(map, prefix + "ClusterUsedCpu", this.ClusterUsedCpu);
        this.setParamSimple(map, prefix + "ClusterUsedMem", this.ClusterUsedMem);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamSimple(map, prefix + "RunInstanceCount", this.RunInstanceCount);
        this.setParamSimple(map, prefix + "NormalInstanceCount", this.NormalInstanceCount);
        this.setParamSimple(map, prefix + "DeleteFlag", this.DeleteFlag);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "TsfRegionId", this.TsfRegionId);
        this.setParamSimple(map, prefix + "TsfRegionName", this.TsfRegionName);
        this.setParamSimple(map, prefix + "TsfZoneId", this.TsfZoneId);
        this.setParamSimple(map, prefix + "TsfZoneName", this.TsfZoneName);
        this.setParamSimple(map, prefix + "DeleteFlagReason", this.DeleteFlagReason);
        this.setParamSimple(map, prefix + "ClusterLimitCpu", this.ClusterLimitCpu);
        this.setParamSimple(map, prefix + "ClusterLimitMem", this.ClusterLimitMem);
        this.setParamSimple(map, prefix + "RunServiceInstanceCount", this.RunServiceInstanceCount);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamObj(map, prefix + "OperationInfo.", this.OperationInfo);
        this.setParamSimple(map, prefix + "ClusterVersion", this.ClusterVersion);

    }
}

