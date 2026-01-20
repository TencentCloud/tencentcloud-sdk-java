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

public class ModifySplunkDeliverRequest extends AbstractModel {

    /**
    * <p>任务id</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>日志主题id- 通过<a href="https://cloud.tencent.com/document/product/614/56454">获取日志主题列表</a>获取日志主题Id。</p>
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * <p>投递任务名称name有以下限制：- 不能为空- 长度不大于64- 只能包含aA-zZ、下划线、-、0-9</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>投递任务启用状态；0:禁用；1:启用</p>
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * <p>splunk投递任务-目标配置</p>
    */
    @SerializedName("NetInfo")
    @Expose
    private NetInfo NetInfo;

    /**
    * <p>splunk投递任务元信息</p>
    */
    @SerializedName("MetadataInfo")
    @Expose
    private MetadataInfo MetadataInfo;

    /**
    * <p>是否启用服务日志；1:关闭；2:开启</p>
    */
    @SerializedName("HasServiceLog")
    @Expose
    private Long HasServiceLog;

    /**
    * <p>高级配置-是否启用索引器;1-不开启；2-开启；默认为：1</p>
    */
    @SerializedName("IndexAck")
    @Expose
    private Long IndexAck;

    /**
    * <p>高级配置-数据来源；不超过64个字符</p>
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * <p>高级配置-数据来源类型；不超过64个字符</p>
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * <p>高级配置-Splunk写入的索引；不超过64个字符</p>
    */
    @SerializedName("Index")
    @Expose
    private String Index;

    /**
    * <p>高级配置-通道。需满足限制：如果启用索引器，该值不能为空</p>
    */
    @SerializedName("Channel")
    @Expose
    private String Channel;

    /**
    * <p>预过滤处理-对写入 Splunk 原始数据进行预过滤处理</p>
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
     * Get <p>日志主题id- 通过<a href="https://cloud.tencent.com/document/product/614/56454">获取日志主题列表</a>获取日志主题Id。</p> 
     * @return TopicId <p>日志主题id- 通过<a href="https://cloud.tencent.com/document/product/614/56454">获取日志主题列表</a>获取日志主题Id。</p>
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set <p>日志主题id- 通过<a href="https://cloud.tencent.com/document/product/614/56454">获取日志主题列表</a>获取日志主题Id。</p>
     * @param TopicId <p>日志主题id- 通过<a href="https://cloud.tencent.com/document/product/614/56454">获取日志主题列表</a>获取日志主题Id。</p>
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get <p>投递任务名称name有以下限制：- 不能为空- 长度不大于64- 只能包含aA-zZ、下划线、-、0-9</p> 
     * @return Name <p>投递任务名称name有以下限制：- 不能为空- 长度不大于64- 只能包含aA-zZ、下划线、-、0-9</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>投递任务名称name有以下限制：- 不能为空- 长度不大于64- 只能包含aA-zZ、下划线、-、0-9</p>
     * @param Name <p>投递任务名称name有以下限制：- 不能为空- 长度不大于64- 只能包含aA-zZ、下划线、-、0-9</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>投递任务启用状态；0:禁用；1:启用</p> 
     * @return Enable <p>投递任务启用状态；0:禁用；1:启用</p>
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set <p>投递任务启用状态；0:禁用；1:启用</p>
     * @param Enable <p>投递任务启用状态；0:禁用；1:启用</p>
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
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
     * @return MetadataInfo <p>splunk投递任务元信息</p>
     */
    public MetadataInfo getMetadataInfo() {
        return this.MetadataInfo;
    }

    /**
     * Set <p>splunk投递任务元信息</p>
     * @param MetadataInfo <p>splunk投递任务元信息</p>
     */
    public void setMetadataInfo(MetadataInfo MetadataInfo) {
        this.MetadataInfo = MetadataInfo;
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
     * Get <p>高级配置-是否启用索引器;1-不开启；2-开启；默认为：1</p> 
     * @return IndexAck <p>高级配置-是否启用索引器;1-不开启；2-开启；默认为：1</p>
     */
    public Long getIndexAck() {
        return this.IndexAck;
    }

    /**
     * Set <p>高级配置-是否启用索引器;1-不开启；2-开启；默认为：1</p>
     * @param IndexAck <p>高级配置-是否启用索引器;1-不开启；2-开启；默认为：1</p>
     */
    public void setIndexAck(Long IndexAck) {
        this.IndexAck = IndexAck;
    }

    /**
     * Get <p>高级配置-数据来源；不超过64个字符</p> 
     * @return Source <p>高级配置-数据来源；不超过64个字符</p>
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set <p>高级配置-数据来源；不超过64个字符</p>
     * @param Source <p>高级配置-数据来源；不超过64个字符</p>
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get <p>高级配置-数据来源类型；不超过64个字符</p> 
     * @return SourceType <p>高级配置-数据来源类型；不超过64个字符</p>
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set <p>高级配置-数据来源类型；不超过64个字符</p>
     * @param SourceType <p>高级配置-数据来源类型；不超过64个字符</p>
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get <p>高级配置-Splunk写入的索引；不超过64个字符</p> 
     * @return Index <p>高级配置-Splunk写入的索引；不超过64个字符</p>
     */
    public String getIndex() {
        return this.Index;
    }

    /**
     * Set <p>高级配置-Splunk写入的索引；不超过64个字符</p>
     * @param Index <p>高级配置-Splunk写入的索引；不超过64个字符</p>
     */
    public void setIndex(String Index) {
        this.Index = Index;
    }

    /**
     * Get <p>高级配置-通道。需满足限制：如果启用索引器，该值不能为空</p> 
     * @return Channel <p>高级配置-通道。需满足限制：如果启用索引器，该值不能为空</p>
     */
    public String getChannel() {
        return this.Channel;
    }

    /**
     * Set <p>高级配置-通道。需满足限制：如果启用索引器，该值不能为空</p>
     * @param Channel <p>高级配置-通道。需满足限制：如果启用索引器，该值不能为空</p>
     */
    public void setChannel(String Channel) {
        this.Channel = Channel;
    }

    /**
     * Get <p>预过滤处理-对写入 Splunk 原始数据进行预过滤处理</p> 
     * @return DSLFilter <p>预过滤处理-对写入 Splunk 原始数据进行预过滤处理</p>
     */
    public String getDSLFilter() {
        return this.DSLFilter;
    }

    /**
     * Set <p>预过滤处理-对写入 Splunk 原始数据进行预过滤处理</p>
     * @param DSLFilter <p>预过滤处理-对写入 Splunk 原始数据进行预过滤处理</p>
     */
    public void setDSLFilter(String DSLFilter) {
        this.DSLFilter = DSLFilter;
    }

    public ModifySplunkDeliverRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySplunkDeliverRequest(ModifySplunkDeliverRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.NetInfo != null) {
            this.NetInfo = new NetInfo(source.NetInfo);
        }
        if (source.MetadataInfo != null) {
            this.MetadataInfo = new MetadataInfo(source.MetadataInfo);
        }
        if (source.HasServiceLog != null) {
            this.HasServiceLog = new Long(source.HasServiceLog);
        }
        if (source.IndexAck != null) {
            this.IndexAck = new Long(source.IndexAck);
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
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamObj(map, prefix + "NetInfo.", this.NetInfo);
        this.setParamObj(map, prefix + "MetadataInfo.", this.MetadataInfo);
        this.setParamSimple(map, prefix + "HasServiceLog", this.HasServiceLog);
        this.setParamSimple(map, prefix + "IndexAck", this.IndexAck);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamSimple(map, prefix + "Channel", this.Channel);
        this.setParamSimple(map, prefix + "DSLFilter", this.DSLFilter);

    }
}

