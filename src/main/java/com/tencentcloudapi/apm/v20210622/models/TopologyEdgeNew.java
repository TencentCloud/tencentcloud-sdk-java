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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TopologyEdgeNew extends AbstractModel {

    /**
    * 源节点
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 边ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 边权重
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Weight")
    @Expose
    private Float Weight;

    /**
    * 目标节点
    */
    @SerializedName("Target")
    @Expose
    private String Target;

    /**
    * 响应时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Duration")
    @Expose
    private Float Duration;

    /**
    * 错误率
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrRate")
    @Expose
    private Float ErrRate;

    /**
    * 吞吐量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Qps")
    @Expose
    private Float Qps;

    /**
    * 边类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 边颜色
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Color")
    @Expose
    private String Color;

    /**
    * Sql调用数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SqlRequestCount")
    @Expose
    private Float SqlRequestCount;

    /**
    * Sql调用错误数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SqlErrorRequestCount")
    @Expose
    private Float SqlErrorRequestCount;

    /**
    * 边上源节点类型 应用/MQ/DB
    */
    @SerializedName("SourceComp")
    @Expose
    private String SourceComp;

    /**
    * 边上目标节点类型 应用/MQ/DB
    */
    @SerializedName("TargetComp")
    @Expose
    private String TargetComp;

    /**
     * Get 源节点 
     * @return Source 源节点
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 源节点
     * @param Source 源节点
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 边ID 
     * @return Id 边ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 边ID
     * @param Id 边ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 边权重
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Weight 边权重
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getWeight() {
        return this.Weight;
    }

    /**
     * Set 边权重
注意：此字段可能返回 null，表示取不到有效值。
     * @param Weight 边权重
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWeight(Float Weight) {
        this.Weight = Weight;
    }

    /**
     * Get 目标节点 
     * @return Target 目标节点
     */
    public String getTarget() {
        return this.Target;
    }

    /**
     * Set 目标节点
     * @param Target 目标节点
     */
    public void setTarget(String Target) {
        this.Target = Target;
    }

    /**
     * Get 响应时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Duration 响应时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getDuration() {
        return this.Duration;
    }

    /**
     * Set 响应时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param Duration 响应时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDuration(Float Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 错误率
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrRate 错误率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getErrRate() {
        return this.ErrRate;
    }

    /**
     * Set 错误率
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrRate 错误率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrRate(Float ErrRate) {
        this.ErrRate = ErrRate;
    }

    /**
     * Get 吞吐量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Qps 吞吐量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getQps() {
        return this.Qps;
    }

    /**
     * Set 吞吐量
注意：此字段可能返回 null，表示取不到有效值。
     * @param Qps 吞吐量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQps(Float Qps) {
        this.Qps = Qps;
    }

    /**
     * Get 边类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 边类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 边类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 边类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 边颜色
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Color 边颜色
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getColor() {
        return this.Color;
    }

    /**
     * Set 边颜色
注意：此字段可能返回 null，表示取不到有效值。
     * @param Color 边颜色
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColor(String Color) {
        this.Color = Color;
    }

    /**
     * Get Sql调用数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SqlRequestCount Sql调用数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getSqlRequestCount() {
        return this.SqlRequestCount;
    }

    /**
     * Set Sql调用数
注意：此字段可能返回 null，表示取不到有效值。
     * @param SqlRequestCount Sql调用数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSqlRequestCount(Float SqlRequestCount) {
        this.SqlRequestCount = SqlRequestCount;
    }

    /**
     * Get Sql调用错误数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SqlErrorRequestCount Sql调用错误数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getSqlErrorRequestCount() {
        return this.SqlErrorRequestCount;
    }

    /**
     * Set Sql调用错误数
注意：此字段可能返回 null，表示取不到有效值。
     * @param SqlErrorRequestCount Sql调用错误数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSqlErrorRequestCount(Float SqlErrorRequestCount) {
        this.SqlErrorRequestCount = SqlErrorRequestCount;
    }

    /**
     * Get 边上源节点类型 应用/MQ/DB 
     * @return SourceComp 边上源节点类型 应用/MQ/DB
     */
    public String getSourceComp() {
        return this.SourceComp;
    }

    /**
     * Set 边上源节点类型 应用/MQ/DB
     * @param SourceComp 边上源节点类型 应用/MQ/DB
     */
    public void setSourceComp(String SourceComp) {
        this.SourceComp = SourceComp;
    }

    /**
     * Get 边上目标节点类型 应用/MQ/DB 
     * @return TargetComp 边上目标节点类型 应用/MQ/DB
     */
    public String getTargetComp() {
        return this.TargetComp;
    }

    /**
     * Set 边上目标节点类型 应用/MQ/DB
     * @param TargetComp 边上目标节点类型 应用/MQ/DB
     */
    public void setTargetComp(String TargetComp) {
        this.TargetComp = TargetComp;
    }

    public TopologyEdgeNew() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TopologyEdgeNew(TopologyEdgeNew source) {
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Weight != null) {
            this.Weight = new Float(source.Weight);
        }
        if (source.Target != null) {
            this.Target = new String(source.Target);
        }
        if (source.Duration != null) {
            this.Duration = new Float(source.Duration);
        }
        if (source.ErrRate != null) {
            this.ErrRate = new Float(source.ErrRate);
        }
        if (source.Qps != null) {
            this.Qps = new Float(source.Qps);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Color != null) {
            this.Color = new String(source.Color);
        }
        if (source.SqlRequestCount != null) {
            this.SqlRequestCount = new Float(source.SqlRequestCount);
        }
        if (source.SqlErrorRequestCount != null) {
            this.SqlErrorRequestCount = new Float(source.SqlErrorRequestCount);
        }
        if (source.SourceComp != null) {
            this.SourceComp = new String(source.SourceComp);
        }
        if (source.TargetComp != null) {
            this.TargetComp = new String(source.TargetComp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "Target", this.Target);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "ErrRate", this.ErrRate);
        this.setParamSimple(map, prefix + "Qps", this.Qps);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Color", this.Color);
        this.setParamSimple(map, prefix + "SqlRequestCount", this.SqlRequestCount);
        this.setParamSimple(map, prefix + "SqlErrorRequestCount", this.SqlErrorRequestCount);
        this.setParamSimple(map, prefix + "SourceComp", this.SourceComp);
        this.setParamSimple(map, prefix + "TargetComp", this.TargetComp);

    }
}

