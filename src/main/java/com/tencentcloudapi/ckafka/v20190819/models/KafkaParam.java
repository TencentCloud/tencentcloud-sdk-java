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
    * 是否为自建集群
    */
    @SerializedName("SelfBuilt")
    @Expose
    private Boolean SelfBuilt;

    /**
    * ckafka集群实例Id
    */
    @SerializedName("Resource")
    @Expose
    private String Resource;

    /**
    * 主题名，多个以“,”分隔
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * Offset类型，最开始位置earliest，最新位置latest，时间点位置timestamp
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OffsetType")
    @Expose
    private String OffsetType;

    /**
    * Offset类型为timestamp时必传，传时间戳，精确到秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 实例资源名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * 可用区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * 主题Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * Topic的分区数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PartitionNum")
    @Expose
    private Long PartitionNum;

    /**
    * 启用容错实例/开启死信队列
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableToleration")
    @Expose
    private Boolean EnableToleration;

    /**
    * Qps 限制
    */
    @SerializedName("QpsLimit")
    @Expose
    private Long QpsLimit;

    /**
    * Table到Topic的路由，「分发到多个topic」开关打开时必传
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableMappings")
    @Expose
    private TableMapping [] TableMappings;

    /**
    * 「分发到多个topic」开关，默认为false
    */
    @SerializedName("UseTableMapping")
    @Expose
    private Boolean UseTableMapping;

    /**
    * 使用的Topic是否需要自动创建（目前只支持SOURCE流入任务，如果不使用分发到多个topic，需要在Topic字段填写需要自动创建的topic名）
    */
    @SerializedName("UseAutoCreateTopic")
    @Expose
    private Boolean UseAutoCreateTopic;

    /**
    * 写入Topic时是否进行压缩，不开启填"none"，开启的话，填写"open"。
    */
    @SerializedName("CompressionType")
    @Expose
    private String CompressionType;

    /**
    * 源topic消息1条扩增成msgMultiple条写入目标topic(该参数目前只有ckafka流入ckafka适用)
    */
    @SerializedName("MsgMultiple")
    @Expose
    private Long MsgMultiple;

    /**
    * 数据同步专用参数, 正常数据处理可为空, 实例级别同步: 仅同步元数据填写"META_SYNC_INSTANCE_TYPE", 同步元数据及全部topic内消息的填写"META_AND_DATA_SYNC_INSTANCE_TYPE"; topic级别同步: 选中的源和目标topic中的消息(需要目标实例也包含该topic)填写"DATA_SYNC_TYPE"
    */
    @SerializedName("ConnectorSyncType")
    @Expose
    private String ConnectorSyncType;

    /**
    * 数据同步专用参数, 当通过时,希望下游的消息写入分区与上游的一致,则填true,但下游分区小于上游时,会报错; 不需要一致则为false, 默认为false
    */
    @SerializedName("KeepPartition")
    @Expose
    private Boolean KeepPartition;

    /**
    * 正则匹配Topic列表
    */
    @SerializedName("TopicRegularExpression")
    @Expose
    private String TopicRegularExpression;

    /**
     * Get 是否为自建集群 
     * @return SelfBuilt 是否为自建集群
     */
    public Boolean getSelfBuilt() {
        return this.SelfBuilt;
    }

    /**
     * Set 是否为自建集群
     * @param SelfBuilt 是否为自建集群
     */
    public void setSelfBuilt(Boolean SelfBuilt) {
        this.SelfBuilt = SelfBuilt;
    }

    /**
     * Get ckafka集群实例Id 
     * @return Resource ckafka集群实例Id
     */
    public String getResource() {
        return this.Resource;
    }

    /**
     * Set ckafka集群实例Id
     * @param Resource ckafka集群实例Id
     */
    public void setResource(String Resource) {
        this.Resource = Resource;
    }

    /**
     * Get 主题名，多个以“,”分隔 
     * @return Topic 主题名，多个以“,”分隔
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set 主题名，多个以“,”分隔
     * @param Topic 主题名，多个以“,”分隔
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get Offset类型，最开始位置earliest，最新位置latest，时间点位置timestamp
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OffsetType Offset类型，最开始位置earliest，最新位置latest，时间点位置timestamp
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOffsetType() {
        return this.OffsetType;
    }

    /**
     * Set Offset类型，最开始位置earliest，最新位置latest，时间点位置timestamp
注意：此字段可能返回 null，表示取不到有效值。
     * @param OffsetType Offset类型，最开始位置earliest，最新位置latest，时间点位置timestamp
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOffsetType(String OffsetType) {
        this.OffsetType = OffsetType;
    }

    /**
     * Get Offset类型为timestamp时必传，传时间戳，精确到秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime Offset类型为timestamp时必传，传时间戳，精确到秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Offset类型为timestamp时必传，传时间戳，精确到秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime Offset类型为timestamp时必传，传时间戳，精确到秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 实例资源名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceName 实例资源名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set 实例资源名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceName 实例资源名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get 可用区
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ZoneId 可用区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 可用区
注意：此字段可能返回 null，表示取不到有效值。
     * @param ZoneId 可用区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 主题Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopicId 主题Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 主题Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopicId 主题Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get Topic的分区数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PartitionNum Topic的分区数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPartitionNum() {
        return this.PartitionNum;
    }

    /**
     * Set Topic的分区数
注意：此字段可能返回 null，表示取不到有效值。
     * @param PartitionNum Topic的分区数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPartitionNum(Long PartitionNum) {
        this.PartitionNum = PartitionNum;
    }

    /**
     * Get 启用容错实例/开启死信队列
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableToleration 启用容错实例/开启死信队列
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEnableToleration() {
        return this.EnableToleration;
    }

    /**
     * Set 启用容错实例/开启死信队列
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableToleration 启用容错实例/开启死信队列
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableToleration(Boolean EnableToleration) {
        this.EnableToleration = EnableToleration;
    }

    /**
     * Get Qps 限制 
     * @return QpsLimit Qps 限制
     */
    public Long getQpsLimit() {
        return this.QpsLimit;
    }

    /**
     * Set Qps 限制
     * @param QpsLimit Qps 限制
     */
    public void setQpsLimit(Long QpsLimit) {
        this.QpsLimit = QpsLimit;
    }

    /**
     * Get Table到Topic的路由，「分发到多个topic」开关打开时必传
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableMappings Table到Topic的路由，「分发到多个topic」开关打开时必传
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TableMapping [] getTableMappings() {
        return this.TableMappings;
    }

    /**
     * Set Table到Topic的路由，「分发到多个topic」开关打开时必传
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableMappings Table到Topic的路由，「分发到多个topic」开关打开时必传
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableMappings(TableMapping [] TableMappings) {
        this.TableMappings = TableMappings;
    }

    /**
     * Get 「分发到多个topic」开关，默认为false 
     * @return UseTableMapping 「分发到多个topic」开关，默认为false
     */
    public Boolean getUseTableMapping() {
        return this.UseTableMapping;
    }

    /**
     * Set 「分发到多个topic」开关，默认为false
     * @param UseTableMapping 「分发到多个topic」开关，默认为false
     */
    public void setUseTableMapping(Boolean UseTableMapping) {
        this.UseTableMapping = UseTableMapping;
    }

    /**
     * Get 使用的Topic是否需要自动创建（目前只支持SOURCE流入任务，如果不使用分发到多个topic，需要在Topic字段填写需要自动创建的topic名） 
     * @return UseAutoCreateTopic 使用的Topic是否需要自动创建（目前只支持SOURCE流入任务，如果不使用分发到多个topic，需要在Topic字段填写需要自动创建的topic名）
     */
    public Boolean getUseAutoCreateTopic() {
        return this.UseAutoCreateTopic;
    }

    /**
     * Set 使用的Topic是否需要自动创建（目前只支持SOURCE流入任务，如果不使用分发到多个topic，需要在Topic字段填写需要自动创建的topic名）
     * @param UseAutoCreateTopic 使用的Topic是否需要自动创建（目前只支持SOURCE流入任务，如果不使用分发到多个topic，需要在Topic字段填写需要自动创建的topic名）
     */
    public void setUseAutoCreateTopic(Boolean UseAutoCreateTopic) {
        this.UseAutoCreateTopic = UseAutoCreateTopic;
    }

    /**
     * Get 写入Topic时是否进行压缩，不开启填"none"，开启的话，填写"open"。 
     * @return CompressionType 写入Topic时是否进行压缩，不开启填"none"，开启的话，填写"open"。
     */
    public String getCompressionType() {
        return this.CompressionType;
    }

    /**
     * Set 写入Topic时是否进行压缩，不开启填"none"，开启的话，填写"open"。
     * @param CompressionType 写入Topic时是否进行压缩，不开启填"none"，开启的话，填写"open"。
     */
    public void setCompressionType(String CompressionType) {
        this.CompressionType = CompressionType;
    }

    /**
     * Get 源topic消息1条扩增成msgMultiple条写入目标topic(该参数目前只有ckafka流入ckafka适用) 
     * @return MsgMultiple 源topic消息1条扩增成msgMultiple条写入目标topic(该参数目前只有ckafka流入ckafka适用)
     */
    public Long getMsgMultiple() {
        return this.MsgMultiple;
    }

    /**
     * Set 源topic消息1条扩增成msgMultiple条写入目标topic(该参数目前只有ckafka流入ckafka适用)
     * @param MsgMultiple 源topic消息1条扩增成msgMultiple条写入目标topic(该参数目前只有ckafka流入ckafka适用)
     */
    public void setMsgMultiple(Long MsgMultiple) {
        this.MsgMultiple = MsgMultiple;
    }

    /**
     * Get 数据同步专用参数, 正常数据处理可为空, 实例级别同步: 仅同步元数据填写"META_SYNC_INSTANCE_TYPE", 同步元数据及全部topic内消息的填写"META_AND_DATA_SYNC_INSTANCE_TYPE"; topic级别同步: 选中的源和目标topic中的消息(需要目标实例也包含该topic)填写"DATA_SYNC_TYPE" 
     * @return ConnectorSyncType 数据同步专用参数, 正常数据处理可为空, 实例级别同步: 仅同步元数据填写"META_SYNC_INSTANCE_TYPE", 同步元数据及全部topic内消息的填写"META_AND_DATA_SYNC_INSTANCE_TYPE"; topic级别同步: 选中的源和目标topic中的消息(需要目标实例也包含该topic)填写"DATA_SYNC_TYPE"
     */
    public String getConnectorSyncType() {
        return this.ConnectorSyncType;
    }

    /**
     * Set 数据同步专用参数, 正常数据处理可为空, 实例级别同步: 仅同步元数据填写"META_SYNC_INSTANCE_TYPE", 同步元数据及全部topic内消息的填写"META_AND_DATA_SYNC_INSTANCE_TYPE"; topic级别同步: 选中的源和目标topic中的消息(需要目标实例也包含该topic)填写"DATA_SYNC_TYPE"
     * @param ConnectorSyncType 数据同步专用参数, 正常数据处理可为空, 实例级别同步: 仅同步元数据填写"META_SYNC_INSTANCE_TYPE", 同步元数据及全部topic内消息的填写"META_AND_DATA_SYNC_INSTANCE_TYPE"; topic级别同步: 选中的源和目标topic中的消息(需要目标实例也包含该topic)填写"DATA_SYNC_TYPE"
     */
    public void setConnectorSyncType(String ConnectorSyncType) {
        this.ConnectorSyncType = ConnectorSyncType;
    }

    /**
     * Get 数据同步专用参数, 当通过时,希望下游的消息写入分区与上游的一致,则填true,但下游分区小于上游时,会报错; 不需要一致则为false, 默认为false 
     * @return KeepPartition 数据同步专用参数, 当通过时,希望下游的消息写入分区与上游的一致,则填true,但下游分区小于上游时,会报错; 不需要一致则为false, 默认为false
     */
    public Boolean getKeepPartition() {
        return this.KeepPartition;
    }

    /**
     * Set 数据同步专用参数, 当通过时,希望下游的消息写入分区与上游的一致,则填true,但下游分区小于上游时,会报错; 不需要一致则为false, 默认为false
     * @param KeepPartition 数据同步专用参数, 当通过时,希望下游的消息写入分区与上游的一致,则填true,但下游分区小于上游时,会报错; 不需要一致则为false, 默认为false
     */
    public void setKeepPartition(Boolean KeepPartition) {
        this.KeepPartition = KeepPartition;
    }

    /**
     * Get 正则匹配Topic列表 
     * @return TopicRegularExpression 正则匹配Topic列表
     */
    public String getTopicRegularExpression() {
        return this.TopicRegularExpression;
    }

    /**
     * Set 正则匹配Topic列表
     * @param TopicRegularExpression 正则匹配Topic列表
     */
    public void setTopicRegularExpression(String TopicRegularExpression) {
        this.TopicRegularExpression = TopicRegularExpression;
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

    }
}

