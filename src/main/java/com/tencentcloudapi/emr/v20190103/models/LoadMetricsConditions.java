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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LoadMetricsConditions extends AbstractModel {

    /**
    * 触发规则条件
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LoadMetrics")
    @Expose
    private LoadMetricsCondition [] LoadMetrics;

    /**
     * Get 触发规则条件
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LoadMetrics 触发规则条件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LoadMetricsCondition [] getLoadMetrics() {
        return this.LoadMetrics;
    }

    /**
     * Set 触发规则条件
注意：此字段可能返回 null，表示取不到有效值。
     * @param LoadMetrics 触发规则条件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLoadMetrics(LoadMetricsCondition [] LoadMetrics) {
        this.LoadMetrics = LoadMetrics;
    }

    public LoadMetricsConditions() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LoadMetricsConditions(LoadMetricsConditions source) {
        if (source.LoadMetrics != null) {
            this.LoadMetrics = new LoadMetricsCondition[source.LoadMetrics.length];
            for (int i = 0; i < source.LoadMetrics.length; i++) {
                this.LoadMetrics[i] = new LoadMetricsCondition(source.LoadMetrics[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "LoadMetrics.", this.LoadMetrics);

    }
}

