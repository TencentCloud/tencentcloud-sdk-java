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

public class CreateSplunkDeliverRequest extends AbstractModel {

    /**
    * 日志主题id
- 通过[获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志主题Id。
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * splunk投递任务名称；
name有如下限制：
- 不能为空
- 长度不大于64
- 只能包含aA-zZ、下划线、-、0-9
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Splunk投递任务-目标配置-网络信息
    */
    @SerializedName("NetInfo")
    @Expose
    private NetInfo NetInfo;

    /**
    * Splunk投递任务元信息
    */
    @SerializedName("MetadataInfo")
    @Expose
    private MetadataInfo MetadataInfo;

    /**
    * 是否开启服务日志 1:关闭；2:开启 ;默认开启
    */
    @SerializedName("HasServiceLog")
    @Expose
    private Long HasServiceLog;

    /**
    * 高级配置-是否启用索引器；1-不启用；2-启用；
默认：1
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
    * 高级配置-通道
需满足限制：如果启用索引器，那么Channel必填
    */
    @SerializedName("Channel")
    @Expose
    private String Channel;

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
     * Get splunk投递任务名称；
name有如下限制：
- 不能为空
- 长度不大于64
- 只能包含aA-zZ、下划线、-、0-9 
     * @return Name splunk投递任务名称；
name有如下限制：
- 不能为空
- 长度不大于64
- 只能包含aA-zZ、下划线、-、0-9
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set splunk投递任务名称；
name有如下限制：
- 不能为空
- 长度不大于64
- 只能包含aA-zZ、下划线、-、0-9
     * @param Name splunk投递任务名称；
name有如下限制：
- 不能为空
- 长度不大于64
- 只能包含aA-zZ、下划线、-、0-9
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Splunk投递任务-目标配置-网络信息 
     * @return NetInfo Splunk投递任务-目标配置-网络信息
     */
    public NetInfo getNetInfo() {
        return this.NetInfo;
    }

    /**
     * Set Splunk投递任务-目标配置-网络信息
     * @param NetInfo Splunk投递任务-目标配置-网络信息
     */
    public void setNetInfo(NetInfo NetInfo) {
        this.NetInfo = NetInfo;
    }

    /**
     * Get Splunk投递任务元信息 
     * @return MetadataInfo Splunk投递任务元信息
     */
    public MetadataInfo getMetadataInfo() {
        return this.MetadataInfo;
    }

    /**
     * Set Splunk投递任务元信息
     * @param MetadataInfo Splunk投递任务元信息
     */
    public void setMetadataInfo(MetadataInfo MetadataInfo) {
        this.MetadataInfo = MetadataInfo;
    }

    /**
     * Get 是否开启服务日志 1:关闭；2:开启 ;默认开启 
     * @return HasServiceLog 是否开启服务日志 1:关闭；2:开启 ;默认开启
     */
    public Long getHasServiceLog() {
        return this.HasServiceLog;
    }

    /**
     * Set 是否开启服务日志 1:关闭；2:开启 ;默认开启
     * @param HasServiceLog 是否开启服务日志 1:关闭；2:开启 ;默认开启
     */
    public void setHasServiceLog(Long HasServiceLog) {
        this.HasServiceLog = HasServiceLog;
    }

    /**
     * Get 高级配置-是否启用索引器；1-不启用；2-启用；
默认：1 
     * @return IndexAck 高级配置-是否启用索引器；1-不启用；2-启用；
默认：1
     */
    public Long getIndexAck() {
        return this.IndexAck;
    }

    /**
     * Set 高级配置-是否启用索引器；1-不启用；2-启用；
默认：1
     * @param IndexAck 高级配置-是否启用索引器；1-不启用；2-启用；
默认：1
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
     * Get 高级配置-通道
需满足限制：如果启用索引器，那么Channel必填 
     * @return Channel 高级配置-通道
需满足限制：如果启用索引器，那么Channel必填
     */
    public String getChannel() {
        return this.Channel;
    }

    /**
     * Set 高级配置-通道
需满足限制：如果启用索引器，那么Channel必填
     * @param Channel 高级配置-通道
需满足限制：如果启用索引器，那么Channel必填
     */
    public void setChannel(String Channel) {
        this.Channel = Channel;
    }

    public CreateSplunkDeliverRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSplunkDeliverRequest(CreateSplunkDeliverRequest source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
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
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Name", this.Name);
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

