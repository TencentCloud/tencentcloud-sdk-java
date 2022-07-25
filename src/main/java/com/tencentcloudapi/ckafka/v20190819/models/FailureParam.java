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

public class FailureParam extends AbstractModel{

    /**
    * 类型，DLQ死信队列，IGNORE_ERROR保留，DROP废弃
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Ckafka类型死信队列
    */
    @SerializedName("KafkaParam")
    @Expose
    private KafkaParam KafkaParam;

    /**
    * 重试间隔
    */
    @SerializedName("RetryInterval")
    @Expose
    private Long RetryInterval;

    /**
    * 重试次数
    */
    @SerializedName("MaxRetryAttempts")
    @Expose
    private Long MaxRetryAttempts;

    /**
    * DIP Topic类型死信队列
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopicParam")
    @Expose
    private TopicParam TopicParam;

    /**
    * 死信队列类型，CKAFKA，TOPIC
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DlqType")
    @Expose
    private String DlqType;

    /**
     * Get 类型，DLQ死信队列，IGNORE_ERROR保留，DROP废弃 
     * @return Type 类型，DLQ死信队列，IGNORE_ERROR保留，DROP废弃
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 类型，DLQ死信队列，IGNORE_ERROR保留，DROP废弃
     * @param Type 类型，DLQ死信队列，IGNORE_ERROR保留，DROP废弃
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Ckafka类型死信队列 
     * @return KafkaParam Ckafka类型死信队列
     */
    public KafkaParam getKafkaParam() {
        return this.KafkaParam;
    }

    /**
     * Set Ckafka类型死信队列
     * @param KafkaParam Ckafka类型死信队列
     */
    public void setKafkaParam(KafkaParam KafkaParam) {
        this.KafkaParam = KafkaParam;
    }

    /**
     * Get 重试间隔 
     * @return RetryInterval 重试间隔
     */
    public Long getRetryInterval() {
        return this.RetryInterval;
    }

    /**
     * Set 重试间隔
     * @param RetryInterval 重试间隔
     */
    public void setRetryInterval(Long RetryInterval) {
        this.RetryInterval = RetryInterval;
    }

    /**
     * Get 重试次数 
     * @return MaxRetryAttempts 重试次数
     */
    public Long getMaxRetryAttempts() {
        return this.MaxRetryAttempts;
    }

    /**
     * Set 重试次数
     * @param MaxRetryAttempts 重试次数
     */
    public void setMaxRetryAttempts(Long MaxRetryAttempts) {
        this.MaxRetryAttempts = MaxRetryAttempts;
    }

    /**
     * Get DIP Topic类型死信队列
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopicParam DIP Topic类型死信队列
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TopicParam getTopicParam() {
        return this.TopicParam;
    }

    /**
     * Set DIP Topic类型死信队列
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopicParam DIP Topic类型死信队列
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopicParam(TopicParam TopicParam) {
        this.TopicParam = TopicParam;
    }

    /**
     * Get 死信队列类型，CKAFKA，TOPIC
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DlqType 死信队列类型，CKAFKA，TOPIC
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDlqType() {
        return this.DlqType;
    }

    /**
     * Set 死信队列类型，CKAFKA，TOPIC
注意：此字段可能返回 null，表示取不到有效值。
     * @param DlqType 死信队列类型，CKAFKA，TOPIC
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDlqType(String DlqType) {
        this.DlqType = DlqType;
    }

    public FailureParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FailureParam(FailureParam source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.KafkaParam != null) {
            this.KafkaParam = new KafkaParam(source.KafkaParam);
        }
        if (source.RetryInterval != null) {
            this.RetryInterval = new Long(source.RetryInterval);
        }
        if (source.MaxRetryAttempts != null) {
            this.MaxRetryAttempts = new Long(source.MaxRetryAttempts);
        }
        if (source.TopicParam != null) {
            this.TopicParam = new TopicParam(source.TopicParam);
        }
        if (source.DlqType != null) {
            this.DlqType = new String(source.DlqType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "KafkaParam.", this.KafkaParam);
        this.setParamSimple(map, prefix + "RetryInterval", this.RetryInterval);
        this.setParamSimple(map, prefix + "MaxRetryAttempts", this.MaxRetryAttempts);
        this.setParamObj(map, prefix + "TopicParam.", this.TopicParam);
        this.setParamSimple(map, prefix + "DlqType", this.DlqType);

    }
}

