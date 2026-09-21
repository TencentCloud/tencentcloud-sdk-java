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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConsumerLabelRouteItem extends AbstractModel {

    /**
    * <p>Topic 名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * <p>匹配条件</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MatchCondition")
    @Expose
    private String MatchCondition;

    /**
    * <p>目标消费组灰度标签名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetConsumerLabel")
    @Expose
    private String TargetConsumerLabel;

    /**
     * Get <p>Topic 名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Topic <p>Topic 名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set <p>Topic 名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Topic <p>Topic 名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get <p>匹配条件</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MatchCondition <p>匹配条件</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMatchCondition() {
        return this.MatchCondition;
    }

    /**
     * Set <p>匹配条件</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MatchCondition <p>匹配条件</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMatchCondition(String MatchCondition) {
        this.MatchCondition = MatchCondition;
    }

    /**
     * Get <p>目标消费组灰度标签名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetConsumerLabel <p>目标消费组灰度标签名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetConsumerLabel() {
        return this.TargetConsumerLabel;
    }

    /**
     * Set <p>目标消费组灰度标签名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetConsumerLabel <p>目标消费组灰度标签名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetConsumerLabel(String TargetConsumerLabel) {
        this.TargetConsumerLabel = TargetConsumerLabel;
    }

    public ConsumerLabelRouteItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConsumerLabelRouteItem(ConsumerLabelRouteItem source) {
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
        }
        if (source.MatchCondition != null) {
            this.MatchCondition = new String(source.MatchCondition);
        }
        if (source.TargetConsumerLabel != null) {
            this.TargetConsumerLabel = new String(source.TargetConsumerLabel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "MatchCondition", this.MatchCondition);
        this.setParamSimple(map, prefix + "TargetConsumerLabel", this.TargetConsumerLabel);

    }
}

