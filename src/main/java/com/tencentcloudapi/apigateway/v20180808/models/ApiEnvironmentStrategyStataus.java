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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApiEnvironmentStrategyStataus extends AbstractModel{

    /**
    * API绑定的限流策略数量。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * API绑定的限流策略列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApiEnvironmentStrategySet")
    @Expose
    private ApiEnvironmentStrategy [] ApiEnvironmentStrategySet;

    /**
     * Get API绑定的限流策略数量。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalCount API绑定的限流策略数量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set API绑定的限流策略数量。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCount API绑定的限流策略数量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get API绑定的限流策略列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApiEnvironmentStrategySet API绑定的限流策略列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ApiEnvironmentStrategy [] getApiEnvironmentStrategySet() {
        return this.ApiEnvironmentStrategySet;
    }

    /**
     * Set API绑定的限流策略列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApiEnvironmentStrategySet API绑定的限流策略列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApiEnvironmentStrategySet(ApiEnvironmentStrategy [] ApiEnvironmentStrategySet) {
        this.ApiEnvironmentStrategySet = ApiEnvironmentStrategySet;
    }

    public ApiEnvironmentStrategyStataus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApiEnvironmentStrategyStataus(ApiEnvironmentStrategyStataus source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.ApiEnvironmentStrategySet != null) {
            this.ApiEnvironmentStrategySet = new ApiEnvironmentStrategy[source.ApiEnvironmentStrategySet.length];
            for (int i = 0; i < source.ApiEnvironmentStrategySet.length; i++) {
                this.ApiEnvironmentStrategySet[i] = new ApiEnvironmentStrategy(source.ApiEnvironmentStrategySet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "ApiEnvironmentStrategySet.", this.ApiEnvironmentStrategySet);

    }
}

