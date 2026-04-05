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
package com.tencentcloudapi.omics.v20221128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HPCCluster extends AbstractModel {

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 调度器
    */
    @SerializedName("Scheduler")
    @Expose
    private String Scheduler;

    /**
    * VPC ID
    */
    @SerializedName("VPCId")
    @Expose
    private String VPCId;

    /**
    * 节点数量
    */
    @SerializedName("NodeCount")
    @Expose
    private Long NodeCount;

    /**
    * 标签
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 集群类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 系统名称
    */
    @SerializedName("OsName")
    @Expose
    private String OsName;

    /**
    * 调度器版本
    */
    @SerializedName("SchedulerVersion")
    @Expose
    private String SchedulerVersion;

    /**
    * 集群VPC CIDR
    */
    @SerializedName("VPCCIDRBlock")
    @Expose
    private String VPCCIDRBlock;

    /**
    * 集群确认交付截止日期
    */
    @SerializedName("ConfirmDeadline")
    @Expose
    private String ConfirmDeadline;

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
     * Get 名称 
     * @return Name 名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称
     * @param Name 名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 描述 
     * @return Description 描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
     * @param Description 描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
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
     * Get 调度器 
     * @return Scheduler 调度器
     */
    public String getScheduler() {
        return this.Scheduler;
    }

    /**
     * Set 调度器
     * @param Scheduler 调度器
     */
    public void setScheduler(String Scheduler) {
        this.Scheduler = Scheduler;
    }

    /**
     * Get VPC ID 
     * @return VPCId VPC ID
     */
    public String getVPCId() {
        return this.VPCId;
    }

    /**
     * Set VPC ID
     * @param VPCId VPC ID
     */
    public void setVPCId(String VPCId) {
        this.VPCId = VPCId;
    }

    /**
     * Get 节点数量 
     * @return NodeCount 节点数量
     */
    public Long getNodeCount() {
        return this.NodeCount;
    }

    /**
     * Set 节点数量
     * @param NodeCount 节点数量
     */
    public void setNodeCount(Long NodeCount) {
        this.NodeCount = NodeCount;
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
     * Get 集群类型 
     * @return Type 集群类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 集群类型
     * @param Type 集群类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 系统名称 
     * @return OsName 系统名称
     */
    public String getOsName() {
        return this.OsName;
    }

    /**
     * Set 系统名称
     * @param OsName 系统名称
     */
    public void setOsName(String OsName) {
        this.OsName = OsName;
    }

    /**
     * Get 调度器版本 
     * @return SchedulerVersion 调度器版本
     */
    public String getSchedulerVersion() {
        return this.SchedulerVersion;
    }

    /**
     * Set 调度器版本
     * @param SchedulerVersion 调度器版本
     */
    public void setSchedulerVersion(String SchedulerVersion) {
        this.SchedulerVersion = SchedulerVersion;
    }

    /**
     * Get 集群VPC CIDR 
     * @return VPCCIDRBlock 集群VPC CIDR
     */
    public String getVPCCIDRBlock() {
        return this.VPCCIDRBlock;
    }

    /**
     * Set 集群VPC CIDR
     * @param VPCCIDRBlock 集群VPC CIDR
     */
    public void setVPCCIDRBlock(String VPCCIDRBlock) {
        this.VPCCIDRBlock = VPCCIDRBlock;
    }

    /**
     * Get 集群确认交付截止日期 
     * @return ConfirmDeadline 集群确认交付截止日期
     */
    public String getConfirmDeadline() {
        return this.ConfirmDeadline;
    }

    /**
     * Set 集群确认交付截止日期
     * @param ConfirmDeadline 集群确认交付截止日期
     */
    public void setConfirmDeadline(String ConfirmDeadline) {
        this.ConfirmDeadline = ConfirmDeadline;
    }

    public HPCCluster() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HPCCluster(HPCCluster source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Scheduler != null) {
            this.Scheduler = new String(source.Scheduler);
        }
        if (source.VPCId != null) {
            this.VPCId = new String(source.VPCId);
        }
        if (source.NodeCount != null) {
            this.NodeCount = new Long(source.NodeCount);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.OsName != null) {
            this.OsName = new String(source.OsName);
        }
        if (source.SchedulerVersion != null) {
            this.SchedulerVersion = new String(source.SchedulerVersion);
        }
        if (source.VPCCIDRBlock != null) {
            this.VPCCIDRBlock = new String(source.VPCCIDRBlock);
        }
        if (source.ConfirmDeadline != null) {
            this.ConfirmDeadline = new String(source.ConfirmDeadline);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Scheduler", this.Scheduler);
        this.setParamSimple(map, prefix + "VPCId", this.VPCId);
        this.setParamSimple(map, prefix + "NodeCount", this.NodeCount);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "OsName", this.OsName);
        this.setParamSimple(map, prefix + "SchedulerVersion", this.SchedulerVersion);
        this.setParamSimple(map, prefix + "VPCCIDRBlock", this.VPCCIDRBlock);
        this.setParamSimple(map, prefix + "ConfirmDeadline", this.ConfirmDeadline);

    }
}

