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
    * <p>集群ID</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>状态</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>调度器</p>
    */
    @SerializedName("Scheduler")
    @Expose
    private String Scheduler;

    /**
    * <p>VPC ID</p>
    */
    @SerializedName("VPCId")
    @Expose
    private String VPCId;

    /**
    * <p>节点数量</p>
    */
    @SerializedName("NodeCount")
    @Expose
    private Long NodeCount;

    /**
    * <p>标签</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>集群类型</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>系统名称</p>
    */
    @SerializedName("OsName")
    @Expose
    private String OsName;

    /**
    * <p>调度器版本</p>
    */
    @SerializedName("SchedulerVersion")
    @Expose
    private String SchedulerVersion;

    /**
    * <p>集群VPC CIDR</p>
    */
    @SerializedName("VPCCIDRBlock")
    @Expose
    private String VPCCIDRBlock;

    /**
    * <p>集群确认交付截止日期</p>
    */
    @SerializedName("ConfirmDeadline")
    @Expose
    private String ConfirmDeadline;

    /**
    * <p>状态原因</p>
    */
    @SerializedName("StatusReason")
    @Expose
    private String StatusReason;

    /**
    * <p>隔离时间</p>
    */
    @SerializedName("IsolateTime")
    @Expose
    private String IsolateTime;

    /**
    * <p>消息</p>
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get <p>集群ID</p> 
     * @return ClusterId <p>集群ID</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群ID</p>
     * @param ClusterId <p>集群ID</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>名称</p> 
     * @return Name <p>名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>名称</p>
     * @param Name <p>名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>描述</p> 
     * @return Description <p>描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述</p>
     * @param Description <p>描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>状态</p> 
     * @return Status <p>状态</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态</p>
     * @param Status <p>状态</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>调度器</p> 
     * @return Scheduler <p>调度器</p>
     */
    public String getScheduler() {
        return this.Scheduler;
    }

    /**
     * Set <p>调度器</p>
     * @param Scheduler <p>调度器</p>
     */
    public void setScheduler(String Scheduler) {
        this.Scheduler = Scheduler;
    }

    /**
     * Get <p>VPC ID</p> 
     * @return VPCId <p>VPC ID</p>
     */
    public String getVPCId() {
        return this.VPCId;
    }

    /**
     * Set <p>VPC ID</p>
     * @param VPCId <p>VPC ID</p>
     */
    public void setVPCId(String VPCId) {
        this.VPCId = VPCId;
    }

    /**
     * Get <p>节点数量</p> 
     * @return NodeCount <p>节点数量</p>
     */
    public Long getNodeCount() {
        return this.NodeCount;
    }

    /**
     * Set <p>节点数量</p>
     * @param NodeCount <p>节点数量</p>
     */
    public void setNodeCount(Long NodeCount) {
        this.NodeCount = NodeCount;
    }

    /**
     * Get <p>标签</p> 
     * @return Tags <p>标签</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签</p>
     * @param Tags <p>标签</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateTime <p>创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateTime <p>创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>集群类型</p> 
     * @return Type <p>集群类型</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>集群类型</p>
     * @param Type <p>集群类型</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>系统名称</p> 
     * @return OsName <p>系统名称</p>
     */
    public String getOsName() {
        return this.OsName;
    }

    /**
     * Set <p>系统名称</p>
     * @param OsName <p>系统名称</p>
     */
    public void setOsName(String OsName) {
        this.OsName = OsName;
    }

    /**
     * Get <p>调度器版本</p> 
     * @return SchedulerVersion <p>调度器版本</p>
     */
    public String getSchedulerVersion() {
        return this.SchedulerVersion;
    }

    /**
     * Set <p>调度器版本</p>
     * @param SchedulerVersion <p>调度器版本</p>
     */
    public void setSchedulerVersion(String SchedulerVersion) {
        this.SchedulerVersion = SchedulerVersion;
    }

    /**
     * Get <p>集群VPC CIDR</p> 
     * @return VPCCIDRBlock <p>集群VPC CIDR</p>
     */
    public String getVPCCIDRBlock() {
        return this.VPCCIDRBlock;
    }

    /**
     * Set <p>集群VPC CIDR</p>
     * @param VPCCIDRBlock <p>集群VPC CIDR</p>
     */
    public void setVPCCIDRBlock(String VPCCIDRBlock) {
        this.VPCCIDRBlock = VPCCIDRBlock;
    }

    /**
     * Get <p>集群确认交付截止日期</p> 
     * @return ConfirmDeadline <p>集群确认交付截止日期</p>
     */
    public String getConfirmDeadline() {
        return this.ConfirmDeadline;
    }

    /**
     * Set <p>集群确认交付截止日期</p>
     * @param ConfirmDeadline <p>集群确认交付截止日期</p>
     */
    public void setConfirmDeadline(String ConfirmDeadline) {
        this.ConfirmDeadline = ConfirmDeadline;
    }

    /**
     * Get <p>状态原因</p> 
     * @return StatusReason <p>状态原因</p>
     */
    public String getStatusReason() {
        return this.StatusReason;
    }

    /**
     * Set <p>状态原因</p>
     * @param StatusReason <p>状态原因</p>
     */
    public void setStatusReason(String StatusReason) {
        this.StatusReason = StatusReason;
    }

    /**
     * Get <p>隔离时间</p> 
     * @return IsolateTime <p>隔离时间</p>
     */
    public String getIsolateTime() {
        return this.IsolateTime;
    }

    /**
     * Set <p>隔离时间</p>
     * @param IsolateTime <p>隔离时间</p>
     */
    public void setIsolateTime(String IsolateTime) {
        this.IsolateTime = IsolateTime;
    }

    /**
     * Get <p>消息</p> 
     * @return Message <p>消息</p>
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set <p>消息</p>
     * @param Message <p>消息</p>
     */
    public void setMessage(String Message) {
        this.Message = Message;
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
        if (source.StatusReason != null) {
            this.StatusReason = new String(source.StatusReason);
        }
        if (source.IsolateTime != null) {
            this.IsolateTime = new String(source.IsolateTime);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
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
        this.setParamSimple(map, prefix + "StatusReason", this.StatusReason);
        this.setParamSimple(map, prefix + "IsolateTime", this.IsolateTime);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}

