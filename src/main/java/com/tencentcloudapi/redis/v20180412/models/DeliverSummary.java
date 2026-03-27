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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeliverSummary extends AbstractModel {

    /**
    * <p>投递类型，store（存储类），mq（消息通道）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeliverType")
    @Expose
    private String DeliverType;

    /**
    * <p>投递子类型：cls，ckafka。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeliverSubType")
    @Expose
    private String DeliverSubType;

    /**
    * <p>投递订阅者</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeliverConsumer")
    @Expose
    private String DeliverConsumer;

    /**
    * <p>投递订阅者名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeliverConsumerName")
    @Expose
    private String DeliverConsumerName;

    /**
    * <p>投递</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeliverError")
    @Expose
    private String DeliverError;

    /**
     * Get <p>投递类型，store（存储类），mq（消息通道）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeliverType <p>投递类型，store（存储类），mq（消息通道）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeliverType() {
        return this.DeliverType;
    }

    /**
     * Set <p>投递类型，store（存储类），mq（消息通道）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeliverType <p>投递类型，store（存储类），mq（消息通道）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeliverType(String DeliverType) {
        this.DeliverType = DeliverType;
    }

    /**
     * Get <p>投递子类型：cls，ckafka。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeliverSubType <p>投递子类型：cls，ckafka。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeliverSubType() {
        return this.DeliverSubType;
    }

    /**
     * Set <p>投递子类型：cls，ckafka。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeliverSubType <p>投递子类型：cls，ckafka。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeliverSubType(String DeliverSubType) {
        this.DeliverSubType = DeliverSubType;
    }

    /**
     * Get <p>投递订阅者</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeliverConsumer <p>投递订阅者</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeliverConsumer() {
        return this.DeliverConsumer;
    }

    /**
     * Set <p>投递订阅者</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeliverConsumer <p>投递订阅者</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeliverConsumer(String DeliverConsumer) {
        this.DeliverConsumer = DeliverConsumer;
    }

    /**
     * Get <p>投递订阅者名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeliverConsumerName <p>投递订阅者名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeliverConsumerName() {
        return this.DeliverConsumerName;
    }

    /**
     * Set <p>投递订阅者名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeliverConsumerName <p>投递订阅者名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeliverConsumerName(String DeliverConsumerName) {
        this.DeliverConsumerName = DeliverConsumerName;
    }

    /**
     * Get <p>投递</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeliverError <p>投递</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeliverError() {
        return this.DeliverError;
    }

    /**
     * Set <p>投递</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeliverError <p>投递</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeliverError(String DeliverError) {
        this.DeliverError = DeliverError;
    }

    public DeliverSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeliverSummary(DeliverSummary source) {
        if (source.DeliverType != null) {
            this.DeliverType = new String(source.DeliverType);
        }
        if (source.DeliverSubType != null) {
            this.DeliverSubType = new String(source.DeliverSubType);
        }
        if (source.DeliverConsumer != null) {
            this.DeliverConsumer = new String(source.DeliverConsumer);
        }
        if (source.DeliverConsumerName != null) {
            this.DeliverConsumerName = new String(source.DeliverConsumerName);
        }
        if (source.DeliverError != null) {
            this.DeliverError = new String(source.DeliverError);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeliverType", this.DeliverType);
        this.setParamSimple(map, prefix + "DeliverSubType", this.DeliverSubType);
        this.setParamSimple(map, prefix + "DeliverConsumer", this.DeliverConsumer);
        this.setParamSimple(map, prefix + "DeliverConsumerName", this.DeliverConsumerName);
        this.setParamSimple(map, prefix + "DeliverError", this.DeliverError);

    }
}

