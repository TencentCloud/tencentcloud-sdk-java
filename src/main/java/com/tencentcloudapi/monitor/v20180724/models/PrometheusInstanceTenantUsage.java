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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PrometheusInstanceTenantUsage extends AbstractModel{

    /**
    * 实例ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 计费周期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CalcDate")
    @Expose
    private String CalcDate;

    /**
    * 总用量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Total")
    @Expose
    private Float Total;

    /**
    * 基础指标用量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Basic")
    @Expose
    private Float Basic;

    /**
    * 付费指标用量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Fee")
    @Expose
    private Float Fee;

    /**
     * Get 实例ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 计费周期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CalcDate 计费周期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCalcDate() {
        return this.CalcDate;
    }

    /**
     * Set 计费周期
注意：此字段可能返回 null，表示取不到有效值。
     * @param CalcDate 计费周期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCalcDate(String CalcDate) {
        this.CalcDate = CalcDate;
    }

    /**
     * Get 总用量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Total 总用量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getTotal() {
        return this.Total;
    }

    /**
     * Set 总用量
注意：此字段可能返回 null，表示取不到有效值。
     * @param Total 总用量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotal(Float Total) {
        this.Total = Total;
    }

    /**
     * Get 基础指标用量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Basic 基础指标用量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getBasic() {
        return this.Basic;
    }

    /**
     * Set 基础指标用量
注意：此字段可能返回 null，表示取不到有效值。
     * @param Basic 基础指标用量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBasic(Float Basic) {
        this.Basic = Basic;
    }

    /**
     * Get 付费指标用量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Fee 付费指标用量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getFee() {
        return this.Fee;
    }

    /**
     * Set 付费指标用量
注意：此字段可能返回 null，表示取不到有效值。
     * @param Fee 付费指标用量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFee(Float Fee) {
        this.Fee = Fee;
    }

    public PrometheusInstanceTenantUsage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrometheusInstanceTenantUsage(PrometheusInstanceTenantUsage source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.CalcDate != null) {
            this.CalcDate = new String(source.CalcDate);
        }
        if (source.Total != null) {
            this.Total = new Float(source.Total);
        }
        if (source.Basic != null) {
            this.Basic = new Float(source.Basic);
        }
        if (source.Fee != null) {
            this.Fee = new Float(source.Fee);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "CalcDate", this.CalcDate);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "Basic", this.Basic);
        this.setParamSimple(map, prefix + "Fee", this.Fee);

    }
}

