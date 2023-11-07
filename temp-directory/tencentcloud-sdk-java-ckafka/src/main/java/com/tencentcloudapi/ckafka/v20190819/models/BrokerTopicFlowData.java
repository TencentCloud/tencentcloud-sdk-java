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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BrokerTopicFlowData extends AbstractModel {

    /**
    * Topic 名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * Topic Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * Topic 流量(MB)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopicTraffic")
    @Expose
    private String TopicTraffic;

    /**
     * Get Topic 名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopicName Topic 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set Topic 名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopicName Topic 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get Topic Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopicId Topic Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set Topic Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopicId Topic Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get Topic 流量(MB)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopicTraffic Topic 流量(MB)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTopicTraffic() {
        return this.TopicTraffic;
    }

    /**
     * Set Topic 流量(MB)
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopicTraffic Topic 流量(MB)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopicTraffic(String TopicTraffic) {
        this.TopicTraffic = TopicTraffic;
    }

    public BrokerTopicFlowData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BrokerTopicFlowData(BrokerTopicFlowData source) {
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.TopicTraffic != null) {
            this.TopicTraffic = new String(source.TopicTraffic);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "TopicTraffic", this.TopicTraffic);

    }
}

