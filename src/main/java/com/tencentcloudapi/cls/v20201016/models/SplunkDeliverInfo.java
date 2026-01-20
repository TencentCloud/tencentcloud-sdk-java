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
    * <p>任务id</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>任务名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>用户id</p>
    */
    @SerializedName("Uin")
    @Expose
    private Long Uin;

    /**
    * <p>日志主题id</p>
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * <p>任务状态；1.运行中；2:暂停；3：异常</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>启用状态；0:禁用；1:启用</p>
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * <p>创建时间；单位：秒</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * <p>更新时间；单位：秒</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * <p>splunk投递任务-目标配置</p>
    */
    @SerializedName("NetInfo")
    @Expose
    private NetInfo NetInfo;

    /**
    * <p>splunk投递任务元信息</p>
    */
    @SerializedName("Metadata")
    @Expose
    private MetadataInfo Metadata;

    /**
    * <p>是否启用服务日志；1:关闭；2:开启</p>
    */
    @SerializedName("HasServiceLog")
    @Expose
    private Long HasServiceLog;

    /**
    * <p>高级配置-数据来源；</p>
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * <p>高级配置-数据来源类型；</p>
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * <p>高级配置-Splunk写入的索引</p>
    */
    @SerializedName("Index")
    @Expose
    private String Index;

    /**
    * <p>高级配置-是否启用索引器；1-不开启；2-开启；</p>
    */
    @SerializedName("IndexAck")
    @Expose
    private Long IndexAck;

    /**
    * <p>高级配置-通道</p>
    */
    @SerializedName("Channel")
    @Expose
    private String Channel;

    /**
    * <p>预过滤处理-对写入 Splunk 原始数据进行预过滤处理语句</p>
    */
    @SerializedName("DSLFilter")
    @Expose
    private String DSLFilter;

    /**
     * Get <p>任务id</p> 
     * @return TaskId <p>任务id</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>任务id</p>
     * @param TaskId <p>任务id</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>任务名称</p> 
     * @return Name <p>任务名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>任务名称</p>
     * @param Name <p>任务名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>用户id</p> 
     * @return Uin <p>用户id</p>
     */
    public Long getUin() {
        return this.Uin;
    }

    /**
     * Set <p>用户id</p>
     * @param Uin <p>用户id</p>
     */
    public void setUin(Long Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>日志主题id</p> 
     * @return TopicId <p>日志主题id</p>
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set <p>日志主题id</p>
     * @param TopicId <p>日志主题id</p>
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get <p>任务状态；1.运行中；2:暂停；3：异常</p> 
     * @return Status <p>任务状态；1.运行中；2:暂停；3：异常</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>任务状态；1.运行中；2:暂停；3：异常</p>
     * @param Status <p>任务状态；1.运行中；2:暂停；3：异常</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>启用状态；0:禁用；1:启用</p> 
     * @return Enable <p>启用状态；0:禁用；1:启用</p>
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set <p>启用状态；0:禁用；1:启用</p>
     * @param Enable <p>启用状态；0:禁用；1:启用</p>
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get <p>创建时间；单位：秒</p> 
     * @return CreateTime <p>创建时间；单位：秒</p>
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间；单位：秒</p>
     * @param CreateTime <p>创建时间；单位：秒</p>
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>更新时间；单位：秒</p> 
     * @return UpdateTime <p>更新时间；单位：秒</p>
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间；单位：秒</p>
     * @param UpdateTime <p>更新时间；单位：秒</p>
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>splunk投递任务-目标配置</p> 
     * @return NetInfo <p>splunk投递任务-目标配置</p>
     */
    public NetInfo getNetInfo() {
        return this.NetInfo;
    }

    /**
     * Set <p>splunk投递任务-目标配置</p>
     * @param NetInfo <p>splunk投递任务-目标配置</p>
     */
    public void setNetInfo(NetInfo NetInfo) {
        this.NetInfo = NetInfo;
    }

    /**
     * Get <p>splunk投递任务元信息</p> 
     * @return Metadata <p>splunk投递任务元信息</p>
     */
    public MetadataInfo getMetadata() {
        return this.Metadata;
    }

    /**
     * Set <p>splunk投递任务元信息</p>
     * @param Metadata <p>splunk投递任务元信息</p>
     */
    public void setMetadata(MetadataInfo Metadata) {
        this.Metadata = Metadata;
    }

    /**
     * Get <p>是否启用服务日志；1:关闭；2:开启</p> 
     * @return HasServiceLog <p>是否启用服务日志；1:关闭；2:开启</p>
     */
    public Long getHasServiceLog() {
        return this.HasServiceLog;
    }

    /**
     * Set <p>是否启用服务日志；1:关闭；2:开启</p>
     * @param HasServiceLog <p>是否启用服务日志；1:关闭；2:开启</p>
     */
    public void setHasServiceLog(Long HasServiceLog) {
        this.HasServiceLog = HasServiceLog;
    }

    /**
     * Get <p>高级配置-数据来源；</p> 
     * @return Source <p>高级配置-数据来源；</p>
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set <p>高级配置-数据来源；</p>
     * @param Source <p>高级配置-数据来源；</p>
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get <p>高级配置-数据来源类型；</p> 
     * @return SourceType <p>高级配置-数据来源类型；</p>
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set <p>高级配置-数据来源类型；</p>
     * @param SourceType <p>高级配置-数据来源类型；</p>
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get <p>高级配置-Splunk写入的索引</p> 
     * @return Index <p>高级配置-Splunk写入的索引</p>
     */
    public String getIndex() {
        return this.Index;
    }

    /**
     * Set <p>高级配置-Splunk写入的索引</p>
     * @param Index <p>高级配置-Splunk写入的索引</p>
     */
    public void setIndex(String Index) {
        this.Index = Index;
    }

    /**
     * Get <p>高级配置-是否启用索引器；1-不开启；2-开启；</p> 
     * @return IndexAck <p>高级配置-是否启用索引器；1-不开启；2-开启；</p>
     */
    public Long getIndexAck() {
        return this.IndexAck;
    }

    /**
     * Set <p>高级配置-是否启用索引器；1-不开启；2-开启；</p>
     * @param IndexAck <p>高级配置-是否启用索引器；1-不开启；2-开启；</p>
     */
    public void setIndexAck(Long IndexAck) {
        this.IndexAck = IndexAck;
    }

    /**
     * Get <p>高级配置-通道</p> 
     * @return Channel <p>高级配置-通道</p>
     */
    public String getChannel() {
        return this.Channel;
    }

    /**
     * Set <p>高级配置-通道</p>
     * @param Channel <p>高级配置-通道</p>
     */
    public void setChannel(String Channel) {
        this.Channel = Channel;
    }

    /**
     * Get <p>预过滤处理-对写入 Splunk 原始数据进行预过滤处理语句</p> 
     * @return DSLFilter <p>预过滤处理-对写入 Splunk 原始数据进行预过滤处理语句</p>
     */
    public String getDSLFilter() {
        return this.DSLFilter;
    }

    /**
     * Set <p>预过滤处理-对写入 Splunk 原始数据进行预过滤处理语句</p>
     * @param DSLFilter <p>预过滤处理-对写入 Splunk 原始数据进行预过滤处理语句</p>
     */
    public void setDSLFilter(String DSLFilter) {
        this.DSLFilter = DSLFilter;
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
        if (source.DSLFilter != null) {
            this.DSLFilter = new String(source.DSLFilter);
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
        this.setParamSimple(map, prefix + "DSLFilter", this.DSLFilter);

    }
}

