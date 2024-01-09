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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubscribeKafkaConfig extends AbstractModel {

    /**
    * kafka分区数量，枚举值为1，4，8
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NumberOfPartitions")
    @Expose
    private Long NumberOfPartitions;

    /**
    * 分区规则。当NumberOfPartitions > 1时，该项必填。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DistributeRules")
    @Expose
    private DistributeRule [] DistributeRules;

    /**
    * 默认分区策略。当NumberOfPartitions > 1时，该项必填。不满足DistributeRules中正则表达式的数据，将按照默认分区策略计算分区。
非mongo产品的枚举值为: table-按表名分区，pk-按表名+主键分区。mongo的枚举值为：collection-按集合名分区。
该字段与DistributeRules搭配使用，如果配置了该字段，视为配置了一条DistributeRules。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DefaultRuleType")
    @Expose
    private String DefaultRuleType;

    /**
     * Get kafka分区数量，枚举值为1，4，8
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NumberOfPartitions kafka分区数量，枚举值为1，4，8
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNumberOfPartitions() {
        return this.NumberOfPartitions;
    }

    /**
     * Set kafka分区数量，枚举值为1，4，8
注意：此字段可能返回 null，表示取不到有效值。
     * @param NumberOfPartitions kafka分区数量，枚举值为1，4，8
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNumberOfPartitions(Long NumberOfPartitions) {
        this.NumberOfPartitions = NumberOfPartitions;
    }

    /**
     * Get 分区规则。当NumberOfPartitions > 1时，该项必填。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DistributeRules 分区规则。当NumberOfPartitions > 1时，该项必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DistributeRule [] getDistributeRules() {
        return this.DistributeRules;
    }

    /**
     * Set 分区规则。当NumberOfPartitions > 1时，该项必填。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DistributeRules 分区规则。当NumberOfPartitions > 1时，该项必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDistributeRules(DistributeRule [] DistributeRules) {
        this.DistributeRules = DistributeRules;
    }

    /**
     * Get 默认分区策略。当NumberOfPartitions > 1时，该项必填。不满足DistributeRules中正则表达式的数据，将按照默认分区策略计算分区。
非mongo产品的枚举值为: table-按表名分区，pk-按表名+主键分区。mongo的枚举值为：collection-按集合名分区。
该字段与DistributeRules搭配使用，如果配置了该字段，视为配置了一条DistributeRules。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DefaultRuleType 默认分区策略。当NumberOfPartitions > 1时，该项必填。不满足DistributeRules中正则表达式的数据，将按照默认分区策略计算分区。
非mongo产品的枚举值为: table-按表名分区，pk-按表名+主键分区。mongo的枚举值为：collection-按集合名分区。
该字段与DistributeRules搭配使用，如果配置了该字段，视为配置了一条DistributeRules。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDefaultRuleType() {
        return this.DefaultRuleType;
    }

    /**
     * Set 默认分区策略。当NumberOfPartitions > 1时，该项必填。不满足DistributeRules中正则表达式的数据，将按照默认分区策略计算分区。
非mongo产品的枚举值为: table-按表名分区，pk-按表名+主键分区。mongo的枚举值为：collection-按集合名分区。
该字段与DistributeRules搭配使用，如果配置了该字段，视为配置了一条DistributeRules。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DefaultRuleType 默认分区策略。当NumberOfPartitions > 1时，该项必填。不满足DistributeRules中正则表达式的数据，将按照默认分区策略计算分区。
非mongo产品的枚举值为: table-按表名分区，pk-按表名+主键分区。mongo的枚举值为：collection-按集合名分区。
该字段与DistributeRules搭配使用，如果配置了该字段，视为配置了一条DistributeRules。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDefaultRuleType(String DefaultRuleType) {
        this.DefaultRuleType = DefaultRuleType;
    }

    public SubscribeKafkaConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubscribeKafkaConfig(SubscribeKafkaConfig source) {
        if (source.NumberOfPartitions != null) {
            this.NumberOfPartitions = new Long(source.NumberOfPartitions);
        }
        if (source.DistributeRules != null) {
            this.DistributeRules = new DistributeRule[source.DistributeRules.length];
            for (int i = 0; i < source.DistributeRules.length; i++) {
                this.DistributeRules[i] = new DistributeRule(source.DistributeRules[i]);
            }
        }
        if (source.DefaultRuleType != null) {
            this.DefaultRuleType = new String(source.DefaultRuleType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NumberOfPartitions", this.NumberOfPartitions);
        this.setParamArrayObj(map, prefix + "DistributeRules.", this.DistributeRules);
        this.setParamSimple(map, prefix + "DefaultRuleType", this.DefaultRuleType);

    }
}

