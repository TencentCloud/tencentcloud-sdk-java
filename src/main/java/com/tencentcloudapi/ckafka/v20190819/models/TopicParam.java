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

public class TopicParam extends AbstractModel{

    /**
    * 单独售卖Topic的Topic名称
    */
    @SerializedName("Resource")
    @Expose
    private String Resource;

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
    * Topic的TopicId【出参】
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 写入Topic时是否进行压缩，不开启填"none"，开启的话，可选择"gzip", "snappy", "lz4"中的一个进行填写。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CompressionType")
    @Expose
    private String CompressionType;

    /**
    * 使用的Topic是否需要自动创建（目前只支持SOURCE流入任务）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UseAutoCreateTopic")
    @Expose
    private Boolean UseAutoCreateTopic;

    /**
    * 源topic消息1条扩增成msgMultiple条写入目标topic(该参数目前只有ckafka流入ckafka适用)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MsgMultiple")
    @Expose
    private Long MsgMultiple;

    /**
     * Get 单独售卖Topic的Topic名称 
     * @return Resource 单独售卖Topic的Topic名称
     */
    public String getResource() {
        return this.Resource;
    }

    /**
     * Set 单独售卖Topic的Topic名称
     * @param Resource 单独售卖Topic的Topic名称
     */
    public void setResource(String Resource) {
        this.Resource = Resource;
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
     * Get Topic的TopicId【出参】
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopicId Topic的TopicId【出参】
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set Topic的TopicId【出参】
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopicId Topic的TopicId【出参】
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get 写入Topic时是否进行压缩，不开启填"none"，开启的话，可选择"gzip", "snappy", "lz4"中的一个进行填写。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CompressionType 写入Topic时是否进行压缩，不开启填"none"，开启的话，可选择"gzip", "snappy", "lz4"中的一个进行填写。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCompressionType() {
        return this.CompressionType;
    }

    /**
     * Set 写入Topic时是否进行压缩，不开启填"none"，开启的话，可选择"gzip", "snappy", "lz4"中的一个进行填写。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CompressionType 写入Topic时是否进行压缩，不开启填"none"，开启的话，可选择"gzip", "snappy", "lz4"中的一个进行填写。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompressionType(String CompressionType) {
        this.CompressionType = CompressionType;
    }

    /**
     * Get 使用的Topic是否需要自动创建（目前只支持SOURCE流入任务）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UseAutoCreateTopic 使用的Topic是否需要自动创建（目前只支持SOURCE流入任务）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getUseAutoCreateTopic() {
        return this.UseAutoCreateTopic;
    }

    /**
     * Set 使用的Topic是否需要自动创建（目前只支持SOURCE流入任务）
注意：此字段可能返回 null，表示取不到有效值。
     * @param UseAutoCreateTopic 使用的Topic是否需要自动创建（目前只支持SOURCE流入任务）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUseAutoCreateTopic(Boolean UseAutoCreateTopic) {
        this.UseAutoCreateTopic = UseAutoCreateTopic;
    }

    /**
     * Get 源topic消息1条扩增成msgMultiple条写入目标topic(该参数目前只有ckafka流入ckafka适用)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MsgMultiple 源topic消息1条扩增成msgMultiple条写入目标topic(该参数目前只有ckafka流入ckafka适用)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMsgMultiple() {
        return this.MsgMultiple;
    }

    /**
     * Set 源topic消息1条扩增成msgMultiple条写入目标topic(该参数目前只有ckafka流入ckafka适用)
注意：此字段可能返回 null，表示取不到有效值。
     * @param MsgMultiple 源topic消息1条扩增成msgMultiple条写入目标topic(该参数目前只有ckafka流入ckafka适用)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMsgMultiple(Long MsgMultiple) {
        this.MsgMultiple = MsgMultiple;
    }

    public TopicParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TopicParam(TopicParam source) {
        if (source.Resource != null) {
            this.Resource = new String(source.Resource);
        }
        if (source.OffsetType != null) {
            this.OffsetType = new String(source.OffsetType);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.CompressionType != null) {
            this.CompressionType = new String(source.CompressionType);
        }
        if (source.UseAutoCreateTopic != null) {
            this.UseAutoCreateTopic = new Boolean(source.UseAutoCreateTopic);
        }
        if (source.MsgMultiple != null) {
            this.MsgMultiple = new Long(source.MsgMultiple);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Resource", this.Resource);
        this.setParamSimple(map, prefix + "OffsetType", this.OffsetType);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "CompressionType", this.CompressionType);
        this.setParamSimple(map, prefix + "UseAutoCreateTopic", this.UseAutoCreateTopic);
        this.setParamSimple(map, prefix + "MsgMultiple", this.MsgMultiple);

    }
}

