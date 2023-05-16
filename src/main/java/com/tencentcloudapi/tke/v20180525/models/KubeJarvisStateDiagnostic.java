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

public class KubeJarvisStateDiagnostic extends AbstractModel{

    /**
    * 诊断开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 诊断结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 诊断目录
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Catalogues")
    @Expose
    private KubeJarvisStateCatalogue [] Catalogues;

    /**
    * 诊断类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 诊断名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 诊断描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * 诊断结果列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Results")
    @Expose
    private KubeJarvisStateResultsItem [] Results;

    /**
    * 诊断结果统计
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Statistics")
    @Expose
    private KubeJarvisStateStatistic [] Statistics;

    /**
     * Get 诊断开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 诊断开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 诊断开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 诊断开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 诊断结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 诊断结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 诊断结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 诊断结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 诊断目录
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Catalogues 诊断目录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KubeJarvisStateCatalogue [] getCatalogues() {
        return this.Catalogues;
    }

    /**
     * Set 诊断目录
注意：此字段可能返回 null，表示取不到有效值。
     * @param Catalogues 诊断目录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCatalogues(KubeJarvisStateCatalogue [] Catalogues) {
        this.Catalogues = Catalogues;
    }

    /**
     * Get 诊断类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 诊断类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 诊断类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 诊断类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 诊断名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 诊断名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 诊断名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 诊断名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 诊断描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Desc 诊断描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set 诊断描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Desc 诊断描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get 诊断结果列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Results 诊断结果列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KubeJarvisStateResultsItem [] getResults() {
        return this.Results;
    }

    /**
     * Set 诊断结果列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Results 诊断结果列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResults(KubeJarvisStateResultsItem [] Results) {
        this.Results = Results;
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

    public KubeJarvisStateDiagnostic() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KubeJarvisStateDiagnostic(KubeJarvisStateDiagnostic source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Catalogues != null) {
            this.Catalogues = new KubeJarvisStateCatalogue[source.Catalogues.length];
            for (int i = 0; i < source.Catalogues.length; i++) {
                this.Catalogues[i] = new KubeJarvisStateCatalogue(source.Catalogues[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.Results != null) {
            this.Results = new KubeJarvisStateResultsItem[source.Results.length];
            for (int i = 0; i < source.Results.length; i++) {
                this.Results[i] = new KubeJarvisStateResultsItem(source.Results[i]);
            }
        }
        if (source.Statistics != null) {
            this.Statistics = new KubeJarvisStateStatistic[source.Statistics.length];
            for (int i = 0; i < source.Statistics.length; i++) {
                this.Statistics[i] = new KubeJarvisStateStatistic(source.Statistics[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArrayObj(map, prefix + "Catalogues.", this.Catalogues);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamArrayObj(map, prefix + "Results.", this.Results);
        this.setParamArrayObj(map, prefix + "Statistics.", this.Statistics);

    }
}

