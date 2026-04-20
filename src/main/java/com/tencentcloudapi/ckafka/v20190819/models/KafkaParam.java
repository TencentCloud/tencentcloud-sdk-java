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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KafkaParam extends AbstractModel {

    /**
    * <p>是否为自建集群</p>
    */
    @SerializedName("SelfBuilt")
    @Expose
    private Boolean SelfBuilt;

    /**
    * <p>ckafka集群实例Id</p>
    */
    @SerializedName("Resource")
    @Expose
    private String Resource;

    /**
    * <p>主题名，多个以“,”分隔</p>
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * <p>Offset类型，最开始位置earliest，最新位置latest，时间点位置timestamp</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OffsetType")
    @Expose
    private String OffsetType;

    /**
    * <p>Offset类型为timestamp时必传，传时间戳，精确到秒</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>实例资源名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * <p>可用区</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * <p>主题Id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * <p>Topic的分区数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PartitionNum")
    @Expose
    private Long PartitionNum;

    /**
    * <p>启用容错实例/开启死信队列</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableToleration")
    @Expose
    private Boolean EnableToleration;

    /**
    * <p>Qps 限制</p>
    */
    @SerializedName("QpsLimit")
    @Expose
    private Long QpsLimit;

    /**
    * <p>Table到Topic的路由，「分发到多个topic」开关打开时必传</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableMappings")
    @Expose
    private TableMapping [] TableMappings;

    /**
    * <p>「分发到多个topic」开关，默认为false</p>
    */
    @SerializedName("UseTableMapping")
    @Expose
    private Boolean UseTableMapping;

    /**
    * <p>使用的Topic是否需要自动创建（目前只支持SOURCE流入任务，如果不使用分发到多个topic，需要在Topic字段填写需要自动创建的topic名）</p>
    */
    @SerializedName("UseAutoCreateTopic")
    @Expose
    private Boolean UseAutoCreateTopic;

    /**
    * <p>写入Topic时是否进行压缩，不开启填&quot;none&quot;，开启的话，填写&quot;open&quot;。</p>
    */
    @SerializedName("CompressionType")
    @Expose
    private String CompressionType;

    /**
    * <p>源topic消息1条扩增成msgMultiple条写入目标topic(该参数目前只有ckafka流入ckafka适用)</p>
    */
    @SerializedName("MsgMultiple")
    @Expose
    private Long MsgMultiple;

    /**
    * <p>数据同步专用参数, 正常数据处理可为空, 实例级别同步: 仅同步元数据填写&quot;META_SYNC_INSTANCE_TYPE&quot;, 同步元数据及全部topic内消息的填写&quot;META_AND_DATA_SYNC_INSTANCE_TYPE&quot;; topic级别同步: 选中的源和目标topic中的消息(需要目标实例也包含该topic)填写&quot;DATA_SYNC_TYPE&quot;</p>
    */
    @SerializedName("ConnectorSyncType")
    @Expose
    private String ConnectorSyncType;

    /**
    * <p>数据同步专用参数, 当通过时,希望下游的消息写入分区与上游的一致,则填true,但下游分区小于上游时,会报错; 不需要一致则为false, 默认为false</p>
    */
    @SerializedName("KeepPartition")
    @Expose
    private Boolean KeepPartition;

    /**
    * <p>正则匹配Topic列表</p>
    */
    @SerializedName("TopicRegularExpression")
    @Expose
    private String TopicRegularExpression;

    /**
    * <p>Topic 前缀</p>
    */
    @SerializedName("Prefix")
    @Expose
    private String Prefix;

    /**
    * <p>Topic前缀分隔符</p>
    */
    @SerializedName("Separator")
    @Expose
    private String Separator;

    /**
    * <p>多选topic列表</p>
    */
    @SerializedName("TopicList")
    @Expose
    private String [] TopicList;

    /**
     * Get <p>是否为自建集群</p> 
     * @return SelfBuilt <p>是否为自建集群</p>
     */
    public Boolean getSelfBuilt() {
        return this.SelfBuilt;
    }

    /**
     * Set <p>是否为自建集群</p>
     * @param SelfBuilt <p>是否为自建集群</p>
     */
    public void setSelfBuilt(Boolean SelfBuilt) {
        this.SelfBuilt = SelfBuilt;
    }

    /**
     * Get <p>ckafka集群实例Id</p> 
     * @return Resource <p>ckafka集群实例Id</p>
     */
    public String getResource() {
        return this.Resource;
    }

    /**
     * Set <p>ckafka集群实例Id</p>
     * @param Resource <p>ckafka集群实例Id</p>
     */
    public void setResource(String Resource) {
        this.Resource = Resource;
    }

    /**
     * Get <p>主题名，多个以“,”分隔</p> 
     * @return Topic <p>主题名，多个以“,”分隔</p>
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set <p>主题名，多个以“,”分隔</p>
     * @param Topic <p>主题名，多个以“,”分隔</p>
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get <p>Offset类型，最开始位置earliest，最新位置latest，时间点位置timestamp</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OffsetType <p>Offset类型，最开始位置earliest，最新位置latest，时间点位置timestamp</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOffsetType() {
        return this.OffsetType;
    }

    /**
     * Set <p>Offset类型，最开始位置earliest，最新位置latest，时间点位置timestamp</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OffsetType <p>Offset类型，最开始位置earliest，最新位置latest，时间点位置timestamp</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOffsetType(String OffsetType) {
        this.OffsetType = OffsetType;
    }

    /**
     * Get <p>Offset类型为timestamp时必传，传时间戳，精确到秒</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime <p>Offset类型为timestamp时必传，传时间戳，精确到秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>Offset类型为timestamp时必传，传时间戳，精确到秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime <p>Offset类型为timestamp时必传，传时间戳，精确到秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>实例资源名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceName <p>实例资源名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set <p>实例资源名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceName <p>实例资源名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get <p>可用区</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ZoneId <p>可用区</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>可用区</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ZoneId <p>可用区</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>主题Id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopicId <p>主题Id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set <p>主题Id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopicId <p>主题Id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get <p>Topic的分区数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PartitionNum <p>Topic的分区数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPartitionNum() {
        return this.PartitionNum;
    }

    /**
     * Set <p>Topic的分区数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PartitionNum <p>Topic的分区数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPartitionNum(Long PartitionNum) {
        this.PartitionNum = PartitionNum;
    }

    /**
     * Get <p>启用容错实例/开启死信队列</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableToleration <p>启用容错实例/开启死信队列</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEnableToleration() {
        return this.EnableToleration;
    }

    /**
     * Set <p>启用容错实例/开启死信队列</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableToleration <p>启用容错实例/开启死信队列</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableToleration(Boolean EnableToleration) {
        this.EnableToleration = EnableToleration;
    }

    /**
     * Get <p>Qps 限制</p> 
     * @return QpsLimit <p>Qps 限制</p>
     */
    public Long getQpsLimit() {
        return this.QpsLimit;
    }

    /**
     * Set <p>Qps 限制</p>
     * @param QpsLimit <p>Qps 限制</p>
     */
    public void setQpsLimit(Long QpsLimit) {
        this.QpsLimit = QpsLimit;
    }

    /**
     * Get <p>Table到Topic的路由，「分发到多个topic」开关打开时必传</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableMappings <p>Table到Topic的路由，「分发到多个topic」开关打开时必传</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TableMapping [] getTableMappings() {
        return this.TableMappings;
    }

    /**
     * Set <p>Table到Topic的路由，「分发到多个topic」开关打开时必传</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableMappings <p>Table到Topic的路由，「分发到多个topic」开关打开时必传</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableMappings(TableMapping [] TableMappings) {
        this.TableMappings = TableMappings;
    }

    /**
     * Get <p>「分发到多个topic」开关，默认为false</p> 
     * @return UseTableMapping <p>「分发到多个topic」开关，默认为false</p>
     */
    public Boolean getUseTableMapping() {
        return this.UseTableMapping;
    }

    /**
     * Set <p>「分发到多个topic」开关，默认为false</p>
     * @param UseTableMapping <p>「分发到多个topic」开关，默认为false</p>
     */
    public void setUseTableMapping(Boolean UseTableMapping) {
        this.UseTableMapping = UseTableMapping;
    }

    /**
     * Get <p>使用的Topic是否需要自动创建（目前只支持SOURCE流入任务，如果不使用分发到多个topic，需要在Topic字段填写需要自动创建的topic名）</p> 
     * @return UseAutoCreateTopic <p>使用的Topic是否需要自动创建（目前只支持SOURCE流入任务，如果不使用分发到多个topic，需要在Topic字段填写需要自动创建的topic名）</p>
     */
    public Boolean getUseAutoCreateTopic() {
        return this.UseAutoCreateTopic;
    }

    /**
     * Set <p>使用的Topic是否需要自动创建（目前只支持SOURCE流入任务，如果不使用分发到多个topic，需要在Topic字段填写需要自动创建的topic名）</p>
     * @param UseAutoCreateTopic <p>使用的Topic是否需要自动创建（目前只支持SOURCE流入任务，如果不使用分发到多个topic，需要在Topic字段填写需要自动创建的topic名）</p>
     */
    public void setUseAutoCreateTopic(Boolean UseAutoCreateTopic) {
        this.UseAutoCreateTopic = UseAutoCreateTopic;
    }

    /**
     * Get <p>写入Topic时是否进行压缩，不开启填&quot;none&quot;，开启的话，填写&quot;open&quot;。</p> 
     * @return CompressionType <p>写入Topic时是否进行压缩，不开启填&quot;none&quot;，开启的话，填写&quot;open&quot;。</p>
     */
    public String getCompressionType() {
        return this.CompressionType;
    }

    /**
     * Set <p>写入Topic时是否进行压缩，不开启填&quot;none&quot;，开启的话，填写&quot;open&quot;。</p>
     * @param CompressionType <p>写入Topic时是否进行压缩，不开启填&quot;none&quot;，开启的话，填写&quot;open&quot;。</p>
     */
    public void setCompressionType(String CompressionType) {
        this.CompressionType = CompressionType;
    }

    /**
     * Get <p>源topic消息1条扩增成msgMultiple条写入目标topic(该参数目前只有ckafka流入ckafka适用)</p> 
     * @return MsgMultiple <p>源topic消息1条扩增成msgMultiple条写入目标topic(该参数目前只有ckafka流入ckafka适用)</p>
     */
    public Long getMsgMultiple() {
        return this.MsgMultiple;
    }

    /**
     * Set <p>源topic消息1条扩增成msgMultiple条写入目标topic(该参数目前只有ckafka流入ckafka适用)</p>
     * @param MsgMultiple <p>源topic消息1条扩增成msgMultiple条写入目标topic(该参数目前只有ckafka流入ckafka适用)</p>
     */
    public void setMsgMultiple(Long MsgMultiple) {
        this.MsgMultiple = MsgMultiple;
    }

    /**
     * Get <p>数据同步专用参数, 正常数据处理可为空, 实例级别同步: 仅同步元数据填写&quot;META_SYNC_INSTANCE_TYPE&quot;, 同步元数据及全部topic内消息的填写&quot;META_AND_DATA_SYNC_INSTANCE_TYPE&quot;; topic级别同步: 选中的源和目标topic中的消息(需要目标实例也包含该topic)填写&quot;DATA_SYNC_TYPE&quot;</p> 
     * @return ConnectorSyncType <p>数据同步专用参数, 正常数据处理可为空, 实例级别同步: 仅同步元数据填写&quot;META_SYNC_INSTANCE_TYPE&quot;, 同步元数据及全部topic内消息的填写&quot;META_AND_DATA_SYNC_INSTANCE_TYPE&quot;; topic级别同步: 选中的源和目标topic中的消息(需要目标实例也包含该topic)填写&quot;DATA_SYNC_TYPE&quot;</p>
     */
    public String getConnectorSyncType() {
        return this.ConnectorSyncType;
    }

    /**
     * Set <p>数据同步专用参数, 正常数据处理可为空, 实例级别同步: 仅同步元数据填写&quot;META_SYNC_INSTANCE_TYPE&quot;, 同步元数据及全部topic内消息的填写&quot;META_AND_DATA_SYNC_INSTANCE_TYPE&quot;; topic级别同步: 选中的源和目标topic中的消息(需要目标实例也包含该topic)填写&quot;DATA_SYNC_TYPE&quot;</p>
     * @param ConnectorSyncType <p>数据同步专用参数, 正常数据处理可为空, 实例级别同步: 仅同步元数据填写&quot;META_SYNC_INSTANCE_TYPE&quot;, 同步元数据及全部topic内消息的填写&quot;META_AND_DATA_SYNC_INSTANCE_TYPE&quot;; topic级别同步: 选中的源和目标topic中的消息(需要目标实例也包含该topic)填写&quot;DATA_SYNC_TYPE&quot;</p>
     */
    public void setConnectorSyncType(String ConnectorSyncType) {
        this.ConnectorSyncType = ConnectorSyncType;
    }

    /**
     * Get <p>数据同步专用参数, 当通过时,希望下游的消息写入分区与上游的一致,则填true,但下游分区小于上游时,会报错; 不需要一致则为false, 默认为false</p> 
     * @return KeepPartition <p>数据同步专用参数, 当通过时,希望下游的消息写入分区与上游的一致,则填true,但下游分区小于上游时,会报错; 不需要一致则为false, 默认为false</p>
     */
    public Boolean getKeepPartition() {
        return this.KeepPartition;
    }

    /**
     * Set <p>数据同步专用参数, 当通过时,希望下游的消息写入分区与上游的一致,则填true,但下游分区小于上游时,会报错; 不需要一致则为false, 默认为false</p>
     * @param KeepPartition <p>数据同步专用参数, 当通过时,希望下游的消息写入分区与上游的一致,则填true,但下游分区小于上游时,会报错; 不需要一致则为false, 默认为false</p>
     */
    public void setKeepPartition(Boolean KeepPartition) {
        this.KeepPartition = KeepPartition;
    }

    /**
     * Get <p>正则匹配Topic列表</p> 
     * @return TopicRegularExpression <p>正则匹配Topic列表</p>
     */
    public String getTopicRegularExpression() {
        return this.TopicRegularExpression;
    }

    /**
     * Set <p>正则匹配Topic列表</p>
     * @param TopicRegularExpression <p>正则匹配Topic列表</p>
     */
    public void setTopicRegularExpression(String TopicRegularExpression) {
        this.TopicRegularExpression = TopicRegularExpression;
    }

    /**
     * Get <p>Topic 前缀</p> 
     * @return Prefix <p>Topic 前缀</p>
     */
    public String getPrefix() {
        return this.Prefix;
    }

    /**
     * Set <p>Topic 前缀</p>
     * @param Prefix <p>Topic 前缀</p>
     */
    public void setPrefix(String Prefix) {
        this.Prefix = Prefix;
    }

    /**
     * Get <p>Topic前缀分隔符</p> 
     * @return Separator <p>Topic前缀分隔符</p>
     */
    public String getSeparator() {
        return this.Separator;
    }

    /**
     * Set <p>Topic前缀分隔符</p>
     * @param Separator <p>Topic前缀分隔符</p>
     */
    public void setSeparator(String Separator) {
        this.Separator = Separator;
    }

    /**
     * Get <p>多选topic列表</p> 
     * @return TopicList <p>多选topic列表</p>
     */
    public String [] getTopicList() {
        return this.TopicList;
    }

    /**
     * Set <p>多选topic列表</p>
     * @param TopicList <p>多选topic列表</p>
     */
    public void setTopicList(String [] TopicList) {
        this.TopicList = TopicList;
    }

    public KafkaParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KafkaParam(KafkaParam source) {
        if (source.SelfBuilt != null) {
            this.SelfBuilt = new Boolean(source.SelfBuilt);
        }
        if (source.Resource != null) {
            this.Resource = new String(source.Resource);
        }
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
        }
        if (source.OffsetType != null) {
            this.OffsetType = new String(source.OffsetType);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.ResourceName != null) {
            this.ResourceName = new String(source.ResourceName);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.PartitionNum != null) {
            this.PartitionNum = new Long(source.PartitionNum);
        }
        if (source.EnableToleration != null) {
            this.EnableToleration = new Boolean(source.EnableToleration);
        }
        if (source.QpsLimit != null) {
            this.QpsLimit = new Long(source.QpsLimit);
        }
        if (source.TableMappings != null) {
            this.TableMappings = new TableMapping[source.TableMappings.length];
            for (int i = 0; i < source.TableMappings.length; i++) {
                this.TableMappings[i] = new TableMapping(source.TableMappings[i]);
            }
        }
        if (source.UseTableMapping != null) {
            this.UseTableMapping = new Boolean(source.UseTableMapping);
        }
        if (source.UseAutoCreateTopic != null) {
            this.UseAutoCreateTopic = new Boolean(source.UseAutoCreateTopic);
        }
        if (source.CompressionType != null) {
            this.CompressionType = new String(source.CompressionType);
        }
        if (source.MsgMultiple != null) {
            this.MsgMultiple = new Long(source.MsgMultiple);
        }
        if (source.ConnectorSyncType != null) {
            this.ConnectorSyncType = new String(source.ConnectorSyncType);
        }
        if (source.KeepPartition != null) {
            this.KeepPartition = new Boolean(source.KeepPartition);
        }
        if (source.TopicRegularExpression != null) {
            this.TopicRegularExpression = new String(source.TopicRegularExpression);
        }
        if (source.Prefix != null) {
            this.Prefix = new String(source.Prefix);
        }
        if (source.Separator != null) {
            this.Separator = new String(source.Separator);
        }
        if (source.TopicList != null) {
            this.TopicList = new String[source.TopicList.length];
            for (int i = 0; i < source.TopicList.length; i++) {
                this.TopicList[i] = new String(source.TopicList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SelfBuilt", this.SelfBuilt);
        this.setParamSimple(map, prefix + "Resource", this.Resource);
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "OffsetType", this.OffsetType);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "PartitionNum", this.PartitionNum);
        this.setParamSimple(map, prefix + "EnableToleration", this.EnableToleration);
        this.setParamSimple(map, prefix + "QpsLimit", this.QpsLimit);
        this.setParamArrayObj(map, prefix + "TableMappings.", this.TableMappings);
        this.setParamSimple(map, prefix + "UseTableMapping", this.UseTableMapping);
        this.setParamSimple(map, prefix + "UseAutoCreateTopic", this.UseAutoCreateTopic);
        this.setParamSimple(map, prefix + "CompressionType", this.CompressionType);
        this.setParamSimple(map, prefix + "MsgMultiple", this.MsgMultiple);
        this.setParamSimple(map, prefix + "ConnectorSyncType", this.ConnectorSyncType);
        this.setParamSimple(map, prefix + "KeepPartition", this.KeepPartition);
        this.setParamSimple(map, prefix + "TopicRegularExpression", this.TopicRegularExpression);
        this.setParamSimple(map, prefix + "Prefix", this.Prefix);
        this.setParamSimple(map, prefix + "Separator", this.Separator);
        this.setParamArraySimple(map, prefix + "TopicList.", this.TopicList);

    }
}

