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
    * 任务id
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 日志主题id
- 通过[获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志主题Id。
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 投递任务名称
name有以下限制：
- 不能为空
- 长度不大于64
- 只能包含aA-zZ、下划线、-、0-9
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 投递任务启用状态；0:禁用；1:启用
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * splunk投递任务-目标配置
    */
    @SerializedName("NetInfo")
    @Expose
    private NetInfo NetInfo;

    /**
    * splunk投递任务元信息
    */
    @SerializedName("MetadataInfo")
    @Expose
    private MetadataInfo MetadataInfo;

    /**
    * 是否启用服务日志；1:关闭；2:开启
    */
    @SerializedName("HasServiceLog")
    @Expose
    private Long HasServiceLog;

    /**
    * 高级配置-是否启用索引器;
1-不开启；2-开启；默认为：1
    */
    @SerializedName("IndexAck")
    @Expose
    private Long IndexAck;

    /**
    * 高级配置-数据来源；不超过64个字符
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 高级配置-数据来源类型；不超过64个字符
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * 高级配置-Splunk写入的索引；不超过64个字符
    */
    @SerializedName("Index")
    @Expose
    private String Index;

    /**
    * 高级配置-通道。
需满足限制：如果启用索引器，该值不能为空
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
     * Get 日志主题id
- 通过[获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志主题Id。 
     * @return TopicId 日志主题id
- 通过[获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志主题Id。
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 日志主题id
- 通过[获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志主题Id。
     * @param TopicId 日志主题id
- 通过[获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志主题Id。
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get 投递任务名称
name有以下限制：
- 不能为空
- 长度不大于64
- 只能包含aA-zZ、下划线、-、0-9 
     * @return Name 投递任务名称
name有以下限制：
- 不能为空
- 长度不大于64
- 只能包含aA-zZ、下划线、-、0-9
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 投递任务名称
name有以下限制：
- 不能为空
- 长度不大于64
- 只能包含aA-zZ、下划线、-、0-9
     * @param Name 投递任务名称
name有以下限制：
- 不能为空
- 长度不大于64
- 只能包含aA-zZ、下划线、-、0-9
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 投递任务启用状态；0:禁用；1:启用 
     * @return Enable 投递任务启用状态；0:禁用；1:启用
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set 投递任务启用状态；0:禁用；1:启用
     * @param Enable 投递任务启用状态；0:禁用；1:启用
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
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
     * @return MetadataInfo splunk投递任务元信息
     */
    public MetadataInfo getMetadataInfo() {
        return this.MetadataInfo;
    }

    /**
     * Set splunk投递任务元信息
     * @param MetadataInfo splunk投递任务元信息
     */
    public void setMetadataInfo(MetadataInfo MetadataInfo) {
        this.MetadataInfo = MetadataInfo;
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
     * Get 高级配置-是否启用索引器;
1-不开启；2-开启；默认为：1 
     * @return IndexAck 高级配置-是否启用索引器;
1-不开启；2-开启；默认为：1
     */
    public Long getIndexAck() {
        return this.IndexAck;
    }

    /**
     * Set 高级配置-是否启用索引器;
1-不开启；2-开启；默认为：1
     * @param IndexAck 高级配置-是否启用索引器;
1-不开启；2-开启；默认为：1
     */
    public void setIndexAck(Long IndexAck) {
        this.IndexAck = IndexAck;
    }

    /**
     * Get 高级配置-数据来源；不超过64个字符 
     * @return Source 高级配置-数据来源；不超过64个字符
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 高级配置-数据来源；不超过64个字符
     * @param Source 高级配置-数据来源；不超过64个字符
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 高级配置-数据来源类型；不超过64个字符 
     * @return SourceType 高级配置-数据来源类型；不超过64个字符
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set 高级配置-数据来源类型；不超过64个字符
     * @param SourceType 高级配置-数据来源类型；不超过64个字符
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get 高级配置-Splunk写入的索引；不超过64个字符 
     * @return Index 高级配置-Splunk写入的索引；不超过64个字符
     */
    public String getIndex() {
        return this.Index;
    }

    /**
     * Set 高级配置-Splunk写入的索引；不超过64个字符
     * @param Index 高级配置-Splunk写入的索引；不超过64个字符
     */
    public void setIndex(String Index) {
        this.Index = Index;
    }

    /**
     * Get 高级配置-通道。
需满足限制：如果启用索引器，该值不能为空 
     * @return Channel 高级配置-通道。
需满足限制：如果启用索引器，该值不能为空
     */
    public String getChannel() {
        return this.Channel;
    }

    /**
     * Set 高级配置-通道。
需满足限制：如果启用索引器，该值不能为空
     * @param Channel 高级配置-通道。
需满足限制：如果启用索引器，该值不能为空
     */
    public void setChannel(String Channel) {
        this.Channel = Channel;
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

    }
}

