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

public class ConsumerRecord extends AbstractModel{

    /**
    * 主题名
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * 分区id
    */
    @SerializedName("Partition")
    @Expose
    private Long Partition;

    /**
    * 位点
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 消息key
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 消息value
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 消息时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
     * Get 主题名 
     * @return Topic 主题名
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set 主题名
     * @param Topic 主题名
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get 分区id 
     * @return Partition 分区id
     */
    public Long getPartition() {
        return this.Partition;
    }

    /**
     * Set 分区id
     * @param Partition 分区id
     */
    public void setPartition(Long Partition) {
        this.Partition = Partition;
    }

    /**
     * Get 位点 
     * @return Offset 位点
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 位点
     * @param Offset 位点
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 消息key
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Key 消息key
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 消息key
注意：此字段可能返回 null，表示取不到有效值。
     * @param Key 消息key
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 消息value
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Value 消息value
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 消息value
注意：此字段可能返回 null，表示取不到有效值。
     * @param Value 消息value
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get 消息时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Timestamp 消息时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set 消息时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param Timestamp 消息时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    public ConsumerRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConsumerRecord(ConsumerRecord source) {
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
        }
        if (source.Partition != null) {
            this.Partition = new Long(source.Partition);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Timestamp != null) {
            this.Timestamp = new Long(source.Timestamp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "Partition", this.Partition);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);

    }
}

