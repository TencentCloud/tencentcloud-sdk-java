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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KafkaParam extends AbstractModel{

    /**
    * 是否为自建集群
    */
    @SerializedName("SelfBuilt")
    @Expose
    private Boolean SelfBuilt;

    /**
    * 实例资源
    */
    @SerializedName("Resource")
    @Expose
    private String Resource;

    /**
    * Topic名称，多个以“,”分隔
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
    * Zone ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * Topic的Id
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
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UseTableMapping")
    @Expose
    private Boolean UseTableMapping;

    /**
    * 使用的Topic是否需要自动创建（目前只支持SOURCE流入任务，如果不使用分发到多个topic，需要在Topic字段填写需要自动创建的topic名）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UseAutoCreateTopic")
    @Expose
    private Boolean UseAutoCreateTopic;

    /**
    * 写入Topic时是否进行压缩，不开启填"none"，开启的话，填写"open"。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CompressionType")
    @Expose
    private String CompressionType;

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
     * Get 实例资源 
     * @return Resource 实例资源
     */
    public String getResource() {
        return this.Resource;
    }

    /**
     * Set 实例资源
     * @param Resource 实例资源
     */
    public void setResource(String Resource) {
        this.Resource = Resource;
    }

    /**
     * Get Topic名称，多个以“,”分隔 
     * @return Topic Topic名称，多个以“,”分隔
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set Topic名称，多个以“,”分隔
     * @param Topic Topic名称，多个以“,”分隔
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
     * Get Zone ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ZoneId Zone ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Zone ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ZoneId Zone ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Topic的Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopicId Topic的Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set Topic的Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopicId Topic的Id
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
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QpsLimit Qps 限制
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getQpsLimit() {
        return this.QpsLimit;
    }

    /**
     * Set Qps 限制
注意：此字段可能返回 null，表示取不到有效值。
     * @param QpsLimit Qps 限制
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UseTableMapping 「分发到多个topic」开关，默认为false
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getUseTableMapping() {
        return this.UseTableMapping;
    }

    /**
     * Set 「分发到多个topic」开关，默认为false
注意：此字段可能返回 null，表示取不到有效值。
     * @param UseTableMapping 「分发到多个topic」开关，默认为false
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUseTableMapping(Boolean UseTableMapping) {
        this.UseTableMapping = UseTableMapping;
    }

    /**
     * Get 使用的Topic是否需要自动创建（目前只支持SOURCE流入任务，如果不使用分发到多个topic，需要在Topic字段填写需要自动创建的topic名）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UseAutoCreateTopic 使用的Topic是否需要自动创建（目前只支持SOURCE流入任务，如果不使用分发到多个topic，需要在Topic字段填写需要自动创建的topic名）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getUseAutoCreateTopic() {
        return this.UseAutoCreateTopic;
    }

    /**
     * Set 使用的Topic是否需要自动创建（目前只支持SOURCE流入任务，如果不使用分发到多个topic，需要在Topic字段填写需要自动创建的topic名）
注意：此字段可能返回 null，表示取不到有效值。
     * @param UseAutoCreateTopic 使用的Topic是否需要自动创建（目前只支持SOURCE流入任务，如果不使用分发到多个topic，需要在Topic字段填写需要自动创建的topic名）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUseAutoCreateTopic(Boolean UseAutoCreateTopic) {
        this.UseAutoCreateTopic = UseAutoCreateTopic;
    }

    /**
     * Get 写入Topic时是否进行压缩，不开启填"none"，开启的话，填写"open"。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CompressionType 写入Topic时是否进行压缩，不开启填"none"，开启的话，填写"open"。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCompressionType() {
        return this.CompressionType;
    }

    /**
     * Set 写入Topic时是否进行压缩，不开启填"none"，开启的话，填写"open"。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CompressionType 写入Topic时是否进行压缩，不开启填"none"，开启的话，填写"open"。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompressionType(String CompressionType) {
        this.CompressionType = CompressionType;
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

    }
}

