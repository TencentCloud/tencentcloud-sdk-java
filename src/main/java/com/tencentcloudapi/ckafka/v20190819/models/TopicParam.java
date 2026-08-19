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

public class TopicParam extends AbstractModel {

    /**
    * <p>单独售卖Topic的Topic名称</p>
    */
    @SerializedName("Resource")
    @Expose
    private String Resource;

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
    * <p>Topic的TopicId【出参】</p>
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * <p>写入Topic时是否进行压缩，不开启填&quot;none&quot;，开启的话，可选择&quot;gzip&quot;, &quot;snappy&quot;, &quot;lz4&quot;中的一个进行填写。</p>
    */
    @SerializedName("CompressionType")
    @Expose
    private String CompressionType;

    /**
    * <p>使用的Topic是否需要自动创建（目前只支持SOURCE流入任务）</p>
    */
    @SerializedName("UseAutoCreateTopic")
    @Expose
    private Boolean UseAutoCreateTopic;

    /**
    * <p>源topic消息1条扩增成msgMultiple条写入目标topic(该参数目前只有ckafka流入ckafka适用)</p>
    */
    @SerializedName("MsgMultiple")
    @Expose
    private Long MsgMultiple;

    /**
     * Get <p>单独售卖Topic的Topic名称</p> 
     * @return Resource <p>单独售卖Topic的Topic名称</p>
     */
    public String getResource() {
        return this.Resource;
    }

    /**
     * Set <p>单独售卖Topic的Topic名称</p>
     * @param Resource <p>单独售卖Topic的Topic名称</p>
     */
    public void setResource(String Resource) {
        this.Resource = Resource;
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
     * Get <p>Topic的TopicId【出参】</p> 
     * @return TopicId <p>Topic的TopicId【出参】</p>
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set <p>Topic的TopicId【出参】</p>
     * @param TopicId <p>Topic的TopicId【出参】</p>
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get <p>写入Topic时是否进行压缩，不开启填&quot;none&quot;，开启的话，可选择&quot;gzip&quot;, &quot;snappy&quot;, &quot;lz4&quot;中的一个进行填写。</p> 
     * @return CompressionType <p>写入Topic时是否进行压缩，不开启填&quot;none&quot;，开启的话，可选择&quot;gzip&quot;, &quot;snappy&quot;, &quot;lz4&quot;中的一个进行填写。</p>
     */
    public String getCompressionType() {
        return this.CompressionType;
    }

    /**
     * Set <p>写入Topic时是否进行压缩，不开启填&quot;none&quot;，开启的话，可选择&quot;gzip&quot;, &quot;snappy&quot;, &quot;lz4&quot;中的一个进行填写。</p>
     * @param CompressionType <p>写入Topic时是否进行压缩，不开启填&quot;none&quot;，开启的话，可选择&quot;gzip&quot;, &quot;snappy&quot;, &quot;lz4&quot;中的一个进行填写。</p>
     */
    public void setCompressionType(String CompressionType) {
        this.CompressionType = CompressionType;
    }

    /**
     * Get <p>使用的Topic是否需要自动创建（目前只支持SOURCE流入任务）</p> 
     * @return UseAutoCreateTopic <p>使用的Topic是否需要自动创建（目前只支持SOURCE流入任务）</p>
     */
    public Boolean getUseAutoCreateTopic() {
        return this.UseAutoCreateTopic;
    }

    /**
     * Set <p>使用的Topic是否需要自动创建（目前只支持SOURCE流入任务）</p>
     * @param UseAutoCreateTopic <p>使用的Topic是否需要自动创建（目前只支持SOURCE流入任务）</p>
     */
    public void setUseAutoCreateTopic(Boolean UseAutoCreateTopic) {
        this.UseAutoCreateTopic = UseAutoCreateTopic;
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

