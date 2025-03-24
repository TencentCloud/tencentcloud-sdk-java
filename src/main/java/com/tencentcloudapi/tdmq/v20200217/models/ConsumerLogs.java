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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConsumerLogs extends AbstractModel {

    /**
    * 记录数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 消费日志。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConsumerLogSets")
    @Expose
    private ConsumerLog [] ConsumerLogSets;

    /**
     * Get 记录数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalCount 记录数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 记录数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCount 记录数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 消费日志。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConsumerLogSets 消费日志。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ConsumerLog [] getConsumerLogSets() {
        return this.ConsumerLogSets;
    }

    /**
     * Set 消费日志。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConsumerLogSets 消费日志。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConsumerLogSets(ConsumerLog [] ConsumerLogSets) {
        this.ConsumerLogSets = ConsumerLogSets;
    }

    public ConsumerLogs() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConsumerLogs(ConsumerLogs source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.ConsumerLogSets != null) {
            this.ConsumerLogSets = new ConsumerLog[source.ConsumerLogSets.length];
            for (int i = 0; i < source.ConsumerLogSets.length; i++) {
                this.ConsumerLogSets[i] = new ConsumerLog(source.ConsumerLogSets[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "ConsumerLogSets.", this.ConsumerLogSets);

    }
}

