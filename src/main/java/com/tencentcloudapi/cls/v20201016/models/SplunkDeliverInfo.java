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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SplunkDeliverInfo extends AbstractModel {

    /**
    * 任务id
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 任务名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 用户id
    */
    @SerializedName("Uin")
    @Expose
    private Long Uin;

    /**
    * 日志主题id
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 任务状态；1.运行中；2:暂停；3：异常
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 启用状态；0:禁用；1:启用
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * 创建时间；单位：秒
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 更新时间；单位：秒
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * splunk投递任务-目标配置
    */
    @SerializedName("NetInfo")
    @Expose
    private NetInfo NetInfo;

    /**
    * splunk投递任务元信息
    */
    @SerializedName("Metadata")
    @Expose
    private MetadataInfo Metadata;

    /**
    * 是否启用服务日志；1:关闭；2:开启
    */
    @SerializedName("HasServiceLog")
    @Expose
    private Long HasServiceLog;

    /**
    * 高级配置-数据来源；
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 高级配置-数据来源类型；
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * 高级配置-Splunk写入的索引
    */
    @SerializedName("Index")
    @Expose
    private String Index;

    /**
    * 高级配置-是否启用索引器；1-不开启；2-开启；
    */
    @SerializedName("IndexAck")
    @Expose
    private Long IndexAck;

    /**
    * 高级配置-通道
    */
    @SerializedName("Channel")
    @Expose
    private String Channel;

    /**
     * Get 任务id 
     * @return TaskId 任务id
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务id
     * @param TaskId 任务id
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 任务名称 
     * @return Name 任务名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 任务名称
     * @param Name 任务名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 用户id 
     * @return Uin 用户id
     */
    public Long getUin() {
        return this.Uin;
    }

    /**
     * Set 用户id
     * @param Uin 用户id
     */
    public void setUin(Long Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 日志主题id 
     * @return TopicId 日志主题id
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 日志主题id
     * @param TopicId 日志主题id
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get 任务状态；1.运行中；2:暂停；3：异常 
     * @return Status 任务状态；1.运行中；2:暂停；3：异常
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态；1.运行中；2:暂停；3：异常
     * @param Status 任务状态；1.运行中；2:暂停；3：异常
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 启用状态；0:禁用；1:启用 
     * @return Enable 启用状态；0:禁用；1:启用
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set 启用状态；0:禁用；1:启用
     * @param Enable 启用状态；0:禁用；1:启用
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 创建时间；单位：秒 
     * @return CreateTime 创建时间；单位：秒
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间；单位：秒
     * @param CreateTime 创建时间；单位：秒
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间；单位：秒 
     * @return UpdateTime 更新时间；单位：秒
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间；单位：秒
     * @param UpdateTime 更新时间；单位：秒
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get splunk投递任务-目标配置 
     * @return NetInfo splunk投递任务-目标配置
     */
    public NetInfo getNetInfo() {
        return this.NetInfo;
    }

    /**
     * Set splunk投递任务-目标配置
     * @param NetInfo splunk投递任务-目标配置
     */
    public void setNetInfo(NetInfo NetInfo) {
        this.NetInfo = NetInfo;
    }

    /**
     * Get splunk投递任务元信息 
     * @return Metadata splunk投递任务元信息
     */
    public MetadataInfo getMetadata() {
        return this.Metadata;
    }

    /**
     * Set splunk投递任务元信息
     * @param Metadata splunk投递任务元信息
     */
    public void setMetadata(MetadataInfo Metadata) {
        this.Metadata = Metadata;
    }

    /**
     * Get 是否启用服务日志；1:关闭；2:开启 
     * @return HasServiceLog 是否启用服务日志；1:关闭；2:开启
     */
    public Long getHasServiceLog() {
        return this.HasServiceLog;
    }

    /**
     * Set 是否启用服务日志；1:关闭；2:开启
     * @param HasServiceLog 是否启用服务日志；1:关闭；2:开启
     */
    public void setHasServiceLog(Long HasServiceLog) {
        this.HasServiceLog = HasServiceLog;
    }

    /**
     * Get 高级配置-数据来源； 
     * @return Source 高级配置-数据来源；
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 高级配置-数据来源；
     * @param Source 高级配置-数据来源；
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 高级配置-数据来源类型； 
     * @return SourceType 高级配置-数据来源类型；
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set 高级配置-数据来源类型；
     * @param SourceType 高级配置-数据来源类型；
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get 高级配置-Splunk写入的索引 
     * @return Index 高级配置-Splunk写入的索引
     */
    public String getIndex() {
        return this.Index;
    }

    /**
     * Set 高级配置-Splunk写入的索引
     * @param Index 高级配置-Splunk写入的索引
     */
    public void setIndex(String Index) {
        this.Index = Index;
    }

    /**
     * Get 高级配置-是否启用索引器；1-不开启；2-开启； 
     * @return IndexAck 高级配置-是否启用索引器；1-不开启；2-开启；
     */
    public Long getIndexAck() {
        return this.IndexAck;
    }

    /**
     * Set 高级配置-是否启用索引器；1-不开启；2-开启；
     * @param IndexAck 高级配置-是否启用索引器；1-不开启；2-开启；
     */
    public void setIndexAck(Long IndexAck) {
        this.IndexAck = IndexAck;
    }

    /**
     * Get 高级配置-通道 
     * @return Channel 高级配置-通道
     */
    public String getChannel() {
        return this.Channel;
    }

    /**
     * Set 高级配置-通道
     * @param Channel 高级配置-通道
     */
    public void setChannel(String Channel) {
        this.Channel = Channel;
    }

    public SplunkDeliverInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SplunkDeliverInfo(SplunkDeliverInfo source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Uin != null) {
            this.Uin = new Long(source.Uin);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.NetInfo != null) {
            this.NetInfo = new NetInfo(source.NetInfo);
        }
        if (source.Metadata != null) {
            this.Metadata = new MetadataInfo(source.Metadata);
        }
        if (source.HasServiceLog != null) {
            this.HasServiceLog = new Long(source.HasServiceLog);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.SourceType != null) {
            this.SourceType = new String(source.SourceType);
        }
        if (source.Index != null) {
            this.Index = new String(source.Index);
        }
        if (source.IndexAck != null) {
            this.IndexAck = new Long(source.IndexAck);
        }
        if (source.Channel != null) {
            this.Channel = new String(source.Channel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamObj(map, prefix + "NetInfo.", this.NetInfo);
        this.setParamObj(map, prefix + "Metadata.", this.Metadata);
        this.setParamSimple(map, prefix + "HasServiceLog", this.HasServiceLog);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamSimple(map, prefix + "IndexAck", this.IndexAck);
        this.setParamSimple(map, prefix + "Channel", this.Channel);

    }
}

