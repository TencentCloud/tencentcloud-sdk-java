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

public class KubeJarvisStateInspectionOverview extends AbstractModel{

    /**
    * 集群ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 诊断结果统计
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Statistics")
    @Expose
    private KubeJarvisStateStatistic [] Statistics;

    /**
    * 诊断结果详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Diagnostics")
    @Expose
    private KubeJarvisStateDiagnosticOverview [] Diagnostics;

    /**
     * Get 集群ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterId 集群ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterId 集群ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 诊断结果统计
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Statistics 诊断结果统计
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KubeJarvisStateStatistic [] getStatistics() {
        return this.Statistics;
    }

    /**
     * Set 诊断结果统计
注意：此字段可能返回 null，表示取不到有效值。
     * @param Statistics 诊断结果统计
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatistics(KubeJarvisStateStatistic [] Statistics) {
        this.Statistics = Statistics;
    }

    /**
     * Get 诊断结果详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Diagnostics 诊断结果详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KubeJarvisStateDiagnosticOverview [] getDiagnostics() {
        return this.Diagnostics;
    }

    /**
     * Set 诊断结果详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param Diagnostics 诊断结果详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiagnostics(KubeJarvisStateDiagnosticOverview [] Diagnostics) {
        this.Diagnostics = Diagnostics;
    }

    public KubeJarvisStateInspectionOverview() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KubeJarvisStateInspectionOverview(KubeJarvisStateInspectionOverview source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Statistics != null) {
            this.Statistics = new KubeJarvisStateStatistic[source.Statistics.length];
            for (int i = 0; i < source.Statistics.length; i++) {
                this.Statistics[i] = new KubeJarvisStateStatistic(source.Statistics[i]);
            }
        }
        if (source.Diagnostics != null) {
            this.Diagnostics = new KubeJarvisStateDiagnosticOverview[source.Diagnostics.length];
            for (int i = 0; i < source.Diagnostics.length; i++) {
                this.Diagnostics[i] = new KubeJarvisStateDiagnosticOverview(source.Diagnostics[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArrayObj(map, prefix + "Statistics.", this.Statistics);
        this.setParamArrayObj(map, prefix + "Diagnostics.", this.Diagnostics);

    }
}

