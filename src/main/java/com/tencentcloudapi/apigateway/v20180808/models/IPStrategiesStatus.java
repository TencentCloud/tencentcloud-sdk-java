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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IPStrategiesStatus extends AbstractModel {

    /**
    * 策略数量。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 策略列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StrategySet")
    @Expose
    private IPStrategy [] StrategySet;

    /**
     * Get 策略数量。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalCount 策略数量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 策略数量。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCount 策略数量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 策略列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StrategySet 策略列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IPStrategy [] getStrategySet() {
        return this.StrategySet;
    }

    /**
     * Set 策略列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param StrategySet 策略列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStrategySet(IPStrategy [] StrategySet) {
        this.StrategySet = StrategySet;
    }

    public IPStrategiesStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IPStrategiesStatus(IPStrategiesStatus source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.StrategySet != null) {
            this.StrategySet = new IPStrategy[source.StrategySet.length];
            for (int i = 0; i < source.StrategySet.length; i++) {
                this.StrategySet[i] = new IPStrategy(source.StrategySet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "StrategySet.", this.StrategySet);

    }
}

