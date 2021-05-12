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

public class ServiceEnvironmentStrategyStatus extends AbstractModel{

    /**
    * 限流策略数量。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 限流策略列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnvironmentList")
    @Expose
    private ServiceEnvironmentStrategy [] EnvironmentList;

    /**
     * Get 限流策略数量。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalCount 限流策略数量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 限流策略数量。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCount 限流策略数量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 限流策略列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnvironmentList 限流策略列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ServiceEnvironmentStrategy [] getEnvironmentList() {
        return this.EnvironmentList;
    }

    /**
     * Set 限流策略列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnvironmentList 限流策略列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnvironmentList(ServiceEnvironmentStrategy [] EnvironmentList) {
        this.EnvironmentList = EnvironmentList;
    }

    public ServiceEnvironmentStrategyStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServiceEnvironmentStrategyStatus(ServiceEnvironmentStrategyStatus source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.EnvironmentList != null) {
            this.EnvironmentList = new ServiceEnvironmentStrategy[source.EnvironmentList.length];
            for (int i = 0; i < source.EnvironmentList.length; i++) {
                this.EnvironmentList[i] = new ServiceEnvironmentStrategy(source.EnvironmentList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "EnvironmentList.", this.EnvironmentList);

    }
}

