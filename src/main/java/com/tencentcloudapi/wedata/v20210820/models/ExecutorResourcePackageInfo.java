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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExecutorResourcePackageInfo extends AbstractModel {

    /**
    * 资源包规格相关：资源包个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourcePackageNum")
    @Expose
    private Long ResourcePackageNum;

    /**
    * 资源包规格相关：cpu个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CpuNum")
    @Expose
    private Long CpuNum;

    /**
    * 资源包id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutorResourcePackageId")
    @Expose
    private String ExecutorResourcePackageId;

    /**
    * 资源包规格相关：内存大小，单位:G
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MemSize")
    @Expose
    private Long MemSize;

    /**
    * 资源包状态， /**
     * 初始化中
     * /
    INIT(0),
    /**
     * 运行中
     * /
    RUNNING(1),
    /**
     * 运行异常
     * /
    RUNNING_FAILED(2),
    /**
     * 释放中
     * /
    DELETEING(3),
    /**
     * 已释放
     * /
    DELETED(4),
    /**
     * 创建中
     * /
    CREATING(5),
    /**
     * 创建失败
     * /
    CREATE_FAILED(6),
    /**
     * 更新中
     * /
    UPDATING(7),
    /**
     * 更新失败
     * /
    UPDATE_FAILED(8),
    /**
     * 已到期
     * /
    EXPIRED(9);
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 资源包状态描述：保存创建失败，运行异常和更新失败的原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StatusDescription")
    @Expose
    private String StatusDescription;

    /**
    * 资源包到期时间，时间戳毫秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * 资源包额外属性
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtInfo")
    @Expose
    private ExecutorResourcePackageExtInfo ExtInfo;

    /**
    * 绑定的项目id，可为空
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 资源组绑定的时间，时间戳毫秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectBindTime")
    @Expose
    private Long ProjectBindTime;

    /**
    * 资源包使用状态: cpu使用，内存使用及趋势
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourcePackageUsage")
    @Expose
    private ExecutorResourcePackageUsageInfo ResourcePackageUsage;

    /**
    * 计费相关：产品资源id列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductResourceIdList")
    @Expose
    private Long [] ProductResourceIdList;

    /**
    * 生命周期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LifeTime")
    @Expose
    private Long LifeTime;

    /**
    * 私有网络Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 私有网络名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * 子网Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 子网名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetName")
    @Expose
    private String SubnetName;

    /**
    * 执行资源相关：资源规格描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceStandard")
    @Expose
    private String ResourceStandard;

    /**
    * 内存总数
    */
    @SerializedName("TotalMemory")
    @Expose
    private Long TotalMemory;

    /**
     * Get 资源包规格相关：资源包个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourcePackageNum 资源包规格相关：资源包个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getResourcePackageNum() {
        return this.ResourcePackageNum;
    }

    /**
     * Set 资源包规格相关：资源包个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourcePackageNum 资源包规格相关：资源包个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourcePackageNum(Long ResourcePackageNum) {
        this.ResourcePackageNum = ResourcePackageNum;
    }

    /**
     * Get 资源包规格相关：cpu个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CpuNum 资源包规格相关：cpu个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCpuNum() {
        return this.CpuNum;
    }

    /**
     * Set 资源包规格相关：cpu个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param CpuNum 资源包规格相关：cpu个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCpuNum(Long CpuNum) {
        this.CpuNum = CpuNum;
    }

    /**
     * Get 资源包id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutorResourcePackageId 资源包id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutorResourcePackageId() {
        return this.ExecutorResourcePackageId;
    }

    /**
     * Set 资源包id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutorResourcePackageId 资源包id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutorResourcePackageId(String ExecutorResourcePackageId) {
        this.ExecutorResourcePackageId = ExecutorResourcePackageId;
    }

    /**
     * Get 资源包规格相关：内存大小，单位:G
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MemSize 资源包规格相关：内存大小，单位:G
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMemSize() {
        return this.MemSize;
    }

    /**
     * Set 资源包规格相关：内存大小，单位:G
注意：此字段可能返回 null，表示取不到有效值。
     * @param MemSize 资源包规格相关：内存大小，单位:G
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemSize(Long MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get 资源包状态， /**
     * 初始化中
     * /
    INIT(0),
    /**
     * 运行中
     * /
    RUNNING(1),
    /**
     * 运行异常
     * /
    RUNNING_FAILED(2),
    /**
     * 释放中
     * /
    DELETEING(3),
    /**
     * 已释放
     * /
    DELETED(4),
    /**
     * 创建中
     * /
    CREATING(5),
    /**
     * 创建失败
     * /
    CREATE_FAILED(6),
    /**
     * 更新中
     * /
    UPDATING(7),
    /**
     * 更新失败
     * /
    UPDATE_FAILED(8),
    /**
     * 已到期
     * /
    EXPIRED(9);
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 资源包状态， /**
     * 初始化中
     * /
    INIT(0),
    /**
     * 运行中
     * /
    RUNNING(1),
    /**
     * 运行异常
     * /
    RUNNING_FAILED(2),
    /**
     * 释放中
     * /
    DELETEING(3),
    /**
     * 已释放
     * /
    DELETED(4),
    /**
     * 创建中
     * /
    CREATING(5),
    /**
     * 创建失败
     * /
    CREATE_FAILED(6),
    /**
     * 更新中
     * /
    UPDATING(7),
    /**
     * 更新失败
     * /
    UPDATE_FAILED(8),
    /**
     * 已到期
     * /
    EXPIRED(9);
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 资源包状态， /**
     * 初始化中
     * /
    INIT(0),
    /**
     * 运行中
     * /
    RUNNING(1),
    /**
     * 运行异常
     * /
    RUNNING_FAILED(2),
    /**
     * 释放中
     * /
    DELETEING(3),
    /**
     * 已释放
     * /
    DELETED(4),
    /**
     * 创建中
     * /
    CREATING(5),
    /**
     * 创建失败
     * /
    CREATE_FAILED(6),
    /**
     * 更新中
     * /
    UPDATING(7),
    /**
     * 更新失败
     * /
    UPDATE_FAILED(8),
    /**
     * 已到期
     * /
    EXPIRED(9);
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 资源包状态， /**
     * 初始化中
     * /
    INIT(0),
    /**
     * 运行中
     * /
    RUNNING(1),
    /**
     * 运行异常
     * /
    RUNNING_FAILED(2),
    /**
     * 释放中
     * /
    DELETEING(3),
    /**
     * 已释放
     * /
    DELETED(4),
    /**
     * 创建中
     * /
    CREATING(5),
    /**
     * 创建失败
     * /
    CREATE_FAILED(6),
    /**
     * 更新中
     * /
    UPDATING(7),
    /**
     * 更新失败
     * /
    UPDATE_FAILED(8),
    /**
     * 已到期
     * /
    EXPIRED(9);
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 资源包状态描述：保存创建失败，运行异常和更新失败的原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StatusDescription 资源包状态描述：保存创建失败，运行异常和更新失败的原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatusDescription() {
        return this.StatusDescription;
    }

    /**
     * Set 资源包状态描述：保存创建失败，运行异常和更新失败的原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatusDescription 资源包状态描述：保存创建失败，运行异常和更新失败的原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatusDescription(String StatusDescription) {
        this.StatusDescription = StatusDescription;
    }

    /**
     * Get 资源包到期时间，时间戳毫秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpireTime 资源包到期时间，时间戳毫秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 资源包到期时间，时间戳毫秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpireTime 资源包到期时间，时间戳毫秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 资源包额外属性
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtInfo 资源包额外属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ExecutorResourcePackageExtInfo getExtInfo() {
        return this.ExtInfo;
    }

    /**
     * Set 资源包额外属性
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtInfo 资源包额外属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtInfo(ExecutorResourcePackageExtInfo ExtInfo) {
        this.ExtInfo = ExtInfo;
    }

    /**
     * Get 绑定的项目id，可为空
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId 绑定的项目id，可为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 绑定的项目id，可为空
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId 绑定的项目id，可为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 资源组绑定的时间，时间戳毫秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectBindTime 资源组绑定的时间，时间戳毫秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProjectBindTime() {
        return this.ProjectBindTime;
    }

    /**
     * Set 资源组绑定的时间，时间戳毫秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectBindTime 资源组绑定的时间，时间戳毫秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectBindTime(Long ProjectBindTime) {
        this.ProjectBindTime = ProjectBindTime;
    }

    /**
     * Get 资源包使用状态: cpu使用，内存使用及趋势
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourcePackageUsage 资源包使用状态: cpu使用，内存使用及趋势
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ExecutorResourcePackageUsageInfo getResourcePackageUsage() {
        return this.ResourcePackageUsage;
    }

    /**
     * Set 资源包使用状态: cpu使用，内存使用及趋势
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourcePackageUsage 资源包使用状态: cpu使用，内存使用及趋势
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourcePackageUsage(ExecutorResourcePackageUsageInfo ResourcePackageUsage) {
        this.ResourcePackageUsage = ResourcePackageUsage;
    }

    /**
     * Get 计费相关：产品资源id列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductResourceIdList 计费相关：产品资源id列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getProductResourceIdList() {
        return this.ProductResourceIdList;
    }

    /**
     * Set 计费相关：产品资源id列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductResourceIdList 计费相关：产品资源id列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductResourceIdList(Long [] ProductResourceIdList) {
        this.ProductResourceIdList = ProductResourceIdList;
    }

    /**
     * Get 生命周期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LifeTime 生命周期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLifeTime() {
        return this.LifeTime;
    }

    /**
     * Set 生命周期
注意：此字段可能返回 null，表示取不到有效值。
     * @param LifeTime 生命周期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLifeTime(Long LifeTime) {
        this.LifeTime = LifeTime;
    }

    /**
     * Get 私有网络Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcId 私有网络Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcId 私有网络Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 私有网络名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcName 私有网络名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set 私有网络名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcName 私有网络名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get 子网Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetId 子网Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetId 子网Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 子网名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetName 子网名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubnetName() {
        return this.SubnetName;
    }

    /**
     * Set 子网名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetName 子网名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetName(String SubnetName) {
        this.SubnetName = SubnetName;
    }

    /**
     * Get 执行资源相关：资源规格描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceStandard 执行资源相关：资源规格描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceStandard() {
        return this.ResourceStandard;
    }

    /**
     * Set 执行资源相关：资源规格描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceStandard 执行资源相关：资源规格描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceStandard(String ResourceStandard) {
        this.ResourceStandard = ResourceStandard;
    }

    /**
     * Get 内存总数 
     * @return TotalMemory 内存总数
     */
    public Long getTotalMemory() {
        return this.TotalMemory;
    }

    /**
     * Set 内存总数
     * @param TotalMemory 内存总数
     */
    public void setTotalMemory(Long TotalMemory) {
        this.TotalMemory = TotalMemory;
    }

    public ExecutorResourcePackageInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExecutorResourcePackageInfo(ExecutorResourcePackageInfo source) {
        if (source.ResourcePackageNum != null) {
            this.ResourcePackageNum = new Long(source.ResourcePackageNum);
        }
        if (source.CpuNum != null) {
            this.CpuNum = new Long(source.CpuNum);
        }
        if (source.ExecutorResourcePackageId != null) {
            this.ExecutorResourcePackageId = new String(source.ExecutorResourcePackageId);
        }
        if (source.MemSize != null) {
            this.MemSize = new Long(source.MemSize);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.StatusDescription != null) {
            this.StatusDescription = new String(source.StatusDescription);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
        if (source.ExtInfo != null) {
            this.ExtInfo = new ExecutorResourcePackageExtInfo(source.ExtInfo);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ProjectBindTime != null) {
            this.ProjectBindTime = new Long(source.ProjectBindTime);
        }
        if (source.ResourcePackageUsage != null) {
            this.ResourcePackageUsage = new ExecutorResourcePackageUsageInfo(source.ResourcePackageUsage);
        }
        if (source.ProductResourceIdList != null) {
            this.ProductResourceIdList = new Long[source.ProductResourceIdList.length];
            for (int i = 0; i < source.ProductResourceIdList.length; i++) {
                this.ProductResourceIdList[i] = new Long(source.ProductResourceIdList[i]);
            }
        }
        if (source.LifeTime != null) {
            this.LifeTime = new Long(source.LifeTime);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.VpcName != null) {
            this.VpcName = new String(source.VpcName);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.SubnetName != null) {
            this.SubnetName = new String(source.SubnetName);
        }
        if (source.ResourceStandard != null) {
            this.ResourceStandard = new String(source.ResourceStandard);
        }
        if (source.TotalMemory != null) {
            this.TotalMemory = new Long(source.TotalMemory);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourcePackageNum", this.ResourcePackageNum);
        this.setParamSimple(map, prefix + "CpuNum", this.CpuNum);
        this.setParamSimple(map, prefix + "ExecutorResourcePackageId", this.ExecutorResourcePackageId);
        this.setParamSimple(map, prefix + "MemSize", this.MemSize);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusDescription", this.StatusDescription);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamObj(map, prefix + "ExtInfo.", this.ExtInfo);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProjectBindTime", this.ProjectBindTime);
        this.setParamObj(map, prefix + "ResourcePackageUsage.", this.ResourcePackageUsage);
        this.setParamArraySimple(map, prefix + "ProductResourceIdList.", this.ProductResourceIdList);
        this.setParamSimple(map, prefix + "LifeTime", this.LifeTime);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "SubnetName", this.SubnetName);
        this.setParamSimple(map, prefix + "ResourceStandard", this.ResourceStandard);
        this.setParamSimple(map, prefix + "TotalMemory", this.TotalMemory);

    }
}

