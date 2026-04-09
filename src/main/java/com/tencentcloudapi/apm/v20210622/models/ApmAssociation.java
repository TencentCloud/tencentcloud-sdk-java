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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApmAssociation extends AbstractModel {

    /**
    * <p>关联产品的实例ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PeerId")
    @Expose
    private String PeerId;

    /**
    * <p>关联关系状态：1（启用）、2（不启用）、3（已失效）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>CKafka消息主题</p>
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * <p>Ckafka消费主题</p><p>用于Kafka指标投递</p>
    */
    @SerializedName("MetricTopic")
    @Expose
    private String MetricTopic;

    /**
     * Get <p>关联产品的实例ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PeerId <p>关联产品的实例ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPeerId() {
        return this.PeerId;
    }

    /**
     * Set <p>关联产品的实例ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PeerId <p>关联产品的实例ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPeerId(String PeerId) {
        this.PeerId = PeerId;
    }

    /**
     * Get <p>关联关系状态：1（启用）、2（不启用）、3（已失效）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status <p>关联关系状态：1（启用）、2（不启用）、3（已失效）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>关联关系状态：1（启用）、2（不启用）、3（已失效）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status <p>关联关系状态：1（启用）、2（不启用）、3（已失效）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>CKafka消息主题</p> 
     * @return Topic <p>CKafka消息主题</p>
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set <p>CKafka消息主题</p>
     * @param Topic <p>CKafka消息主题</p>
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get <p>Ckafka消费主题</p><p>用于Kafka指标投递</p> 
     * @return MetricTopic <p>Ckafka消费主题</p><p>用于Kafka指标投递</p>
     */
    public String getMetricTopic() {
        return this.MetricTopic;
    }

    /**
     * Set <p>Ckafka消费主题</p><p>用于Kafka指标投递</p>
     * @param MetricTopic <p>Ckafka消费主题</p><p>用于Kafka指标投递</p>
     */
    public void setMetricTopic(String MetricTopic) {
        this.MetricTopic = MetricTopic;
    }

    public ApmAssociation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApmAssociation(ApmAssociation source) {
        if (source.PeerId != null) {
            this.PeerId = new String(source.PeerId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
        }
        if (source.MetricTopic != null) {
            this.MetricTopic = new String(source.MetricTopic);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PeerId", this.PeerId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "MetricTopic", this.MetricTopic);

    }
}

