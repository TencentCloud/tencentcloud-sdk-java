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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogstashPipeline extends AbstractModel{

    /**
    * 管道ID
    */
    @SerializedName("PipelineId")
    @Expose
    private String PipelineId;

    /**
    * 管道描述信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PipelineDesc")
    @Expose
    private String PipelineDesc;

    /**
    * 管道配置内容
    */
    @SerializedName("Config")
    @Expose
    private String Config;

    /**
    * 管道的Worker数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Workers")
    @Expose
    private Long Workers;

    /**
    * 管道批处理大小
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BatchSize")
    @Expose
    private Long BatchSize;

    /**
    * 管道批处理延迟
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BatchDelay")
    @Expose
    private Long BatchDelay;

    /**
    * 管道缓冲队列类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QueueType")
    @Expose
    private String QueueType;

    /**
    * 管道缓冲队列大小
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QueueMaxBytes")
    @Expose
    private String QueueMaxBytes;

    /**
    * 管道缓冲队列检查点写入数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QueueCheckPointWrites")
    @Expose
    private Long QueueCheckPointWrites;

    /**
     * Get 管道ID 
     * @return PipelineId 管道ID
     */
    public String getPipelineId() {
        return this.PipelineId;
    }

    /**
     * Set 管道ID
     * @param PipelineId 管道ID
     */
    public void setPipelineId(String PipelineId) {
        this.PipelineId = PipelineId;
    }

    /**
     * Get 管道描述信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PipelineDesc 管道描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPipelineDesc() {
        return this.PipelineDesc;
    }

    /**
     * Set 管道描述信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param PipelineDesc 管道描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPipelineDesc(String PipelineDesc) {
        this.PipelineDesc = PipelineDesc;
    }

    /**
     * Get 管道配置内容 
     * @return Config 管道配置内容
     */
    public String getConfig() {
        return this.Config;
    }

    /**
     * Set 管道配置内容
     * @param Config 管道配置内容
     */
    public void setConfig(String Config) {
        this.Config = Config;
    }

    /**
     * Get 管道的Worker数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Workers 管道的Worker数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWorkers() {
        return this.Workers;
    }

    /**
     * Set 管道的Worker数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param Workers 管道的Worker数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkers(Long Workers) {
        this.Workers = Workers;
    }

    /**
     * Get 管道批处理大小
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BatchSize 管道批处理大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBatchSize() {
        return this.BatchSize;
    }

    /**
     * Set 管道批处理大小
注意：此字段可能返回 null，表示取不到有效值。
     * @param BatchSize 管道批处理大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBatchSize(Long BatchSize) {
        this.BatchSize = BatchSize;
    }

    /**
     * Get 管道批处理延迟
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BatchDelay 管道批处理延迟
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBatchDelay() {
        return this.BatchDelay;
    }

    /**
     * Set 管道批处理延迟
注意：此字段可能返回 null，表示取不到有效值。
     * @param BatchDelay 管道批处理延迟
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBatchDelay(Long BatchDelay) {
        this.BatchDelay = BatchDelay;
    }

    /**
     * Get 管道缓冲队列类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QueueType 管道缓冲队列类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getQueueType() {
        return this.QueueType;
    }

    /**
     * Set 管道缓冲队列类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param QueueType 管道缓冲队列类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQueueType(String QueueType) {
        this.QueueType = QueueType;
    }

    /**
     * Get 管道缓冲队列大小
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QueueMaxBytes 管道缓冲队列大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getQueueMaxBytes() {
        return this.QueueMaxBytes;
    }

    /**
     * Set 管道缓冲队列大小
注意：此字段可能返回 null，表示取不到有效值。
     * @param QueueMaxBytes 管道缓冲队列大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQueueMaxBytes(String QueueMaxBytes) {
        this.QueueMaxBytes = QueueMaxBytes;
    }

    /**
     * Get 管道缓冲队列检查点写入数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QueueCheckPointWrites 管道缓冲队列检查点写入数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getQueueCheckPointWrites() {
        return this.QueueCheckPointWrites;
    }

    /**
     * Set 管道缓冲队列检查点写入数
注意：此字段可能返回 null，表示取不到有效值。
     * @param QueueCheckPointWrites 管道缓冲队列检查点写入数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQueueCheckPointWrites(Long QueueCheckPointWrites) {
        this.QueueCheckPointWrites = QueueCheckPointWrites;
    }

    public LogstashPipeline() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogstashPipeline(LogstashPipeline source) {
        if (source.PipelineId != null) {
            this.PipelineId = new String(source.PipelineId);
        }
        if (source.PipelineDesc != null) {
            this.PipelineDesc = new String(source.PipelineDesc);
        }
        if (source.Config != null) {
            this.Config = new String(source.Config);
        }
        if (source.Workers != null) {
            this.Workers = new Long(source.Workers);
        }
        if (source.BatchSize != null) {
            this.BatchSize = new Long(source.BatchSize);
        }
        if (source.BatchDelay != null) {
            this.BatchDelay = new Long(source.BatchDelay);
        }
        if (source.QueueType != null) {
            this.QueueType = new String(source.QueueType);
        }
        if (source.QueueMaxBytes != null) {
            this.QueueMaxBytes = new String(source.QueueMaxBytes);
        }
        if (source.QueueCheckPointWrites != null) {
            this.QueueCheckPointWrites = new Long(source.QueueCheckPointWrites);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PipelineId", this.PipelineId);
        this.setParamSimple(map, prefix + "PipelineDesc", this.PipelineDesc);
        this.setParamSimple(map, prefix + "Config", this.Config);
        this.setParamSimple(map, prefix + "Workers", this.Workers);
        this.setParamSimple(map, prefix + "BatchSize", this.BatchSize);
        this.setParamSimple(map, prefix + "BatchDelay", this.BatchDelay);
        this.setParamSimple(map, prefix + "QueueType", this.QueueType);
        this.setParamSimple(map, prefix + "QueueMaxBytes", this.QueueMaxBytes);
        this.setParamSimple(map, prefix + "QueueCheckPointWrites", this.QueueCheckPointWrites);

    }
}

