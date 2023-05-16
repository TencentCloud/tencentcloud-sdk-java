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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KubeJarvisStateStatistic extends AbstractModel{

    /**
    * 诊断结果的健康水平
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HealthyLevel")
    @Expose
    private String HealthyLevel;

    /**
    * 诊断结果的统计
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get 诊断结果的健康水平
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HealthyLevel 诊断结果的健康水平
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHealthyLevel() {
        return this.HealthyLevel;
    }

    /**
     * Set 诊断结果的健康水平
注意：此字段可能返回 null，表示取不到有效值。
     * @param HealthyLevel 诊断结果的健康水平
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHealthyLevel(String HealthyLevel) {
        this.HealthyLevel = HealthyLevel;
    }

    /**
     * Get 诊断结果的统计
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Count 诊断结果的统计
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 诊断结果的统计
注意：此字段可能返回 null，表示取不到有效值。
     * @param Count 诊断结果的统计
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    public KubeJarvisStateStatistic() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KubeJarvisStateStatistic(KubeJarvisStateStatistic source) {
        if (source.HealthyLevel != null) {
            this.HealthyLevel = new String(source.HealthyLevel);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HealthyLevel", this.HealthyLevel);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

