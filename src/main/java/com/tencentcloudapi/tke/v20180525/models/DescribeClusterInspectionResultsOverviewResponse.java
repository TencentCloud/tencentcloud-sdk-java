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

public class DescribeClusterInspectionResultsOverviewResponse extends AbstractModel{

    /**
    * 诊断结果统计
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Statistics")
    @Expose
    private KubeJarvisStateStatistic [] Statistics;

    /**
    * 诊断结果概览
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Diagnostics")
    @Expose
    private KubeJarvisStateDiagnosticOverview [] Diagnostics;

    /**
    * 集群诊断结果概览
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InspectionOverview")
    @Expose
    private KubeJarvisStateInspectionOverview [] InspectionOverview;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

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
     * Get 诊断结果概览
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Diagnostics 诊断结果概览
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KubeJarvisStateDiagnosticOverview [] getDiagnostics() {
        return this.Diagnostics;
    }

    /**
     * Set 诊断结果概览
注意：此字段可能返回 null，表示取不到有效值。
     * @param Diagnostics 诊断结果概览
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiagnostics(KubeJarvisStateDiagnosticOverview [] Diagnostics) {
        this.Diagnostics = Diagnostics;
    }

    /**
     * Get 集群诊断结果概览
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InspectionOverview 集群诊断结果概览
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KubeJarvisStateInspectionOverview [] getInspectionOverview() {
        return this.InspectionOverview;
    }

    /**
     * Set 集群诊断结果概览
注意：此字段可能返回 null，表示取不到有效值。
     * @param InspectionOverview 集群诊断结果概览
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInspectionOverview(KubeJarvisStateInspectionOverview [] InspectionOverview) {
        this.InspectionOverview = InspectionOverview;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeClusterInspectionResultsOverviewResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterInspectionResultsOverviewResponse(DescribeClusterInspectionResultsOverviewResponse source) {
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
        if (source.InspectionOverview != null) {
            this.InspectionOverview = new KubeJarvisStateInspectionOverview[source.InspectionOverview.length];
            for (int i = 0; i < source.InspectionOverview.length; i++) {
                this.InspectionOverview[i] = new KubeJarvisStateInspectionOverview(source.InspectionOverview[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Statistics.", this.Statistics);
        this.setParamArrayObj(map, prefix + "Diagnostics.", this.Diagnostics);
        this.setParamArrayObj(map, prefix + "InspectionOverview.", this.InspectionOverview);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

