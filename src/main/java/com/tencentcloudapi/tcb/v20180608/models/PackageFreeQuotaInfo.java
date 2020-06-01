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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PackageFreeQuotaInfo extends AbstractModel{

    /**
    * 资源类型
<li>COS</li>
<li>CDN</li>
<li>FLEXDB</li>
<li>SCF</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * 资源指标名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceMetric")
    @Expose
    private String ResourceMetric;

    /**
    * 资源指标免费量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FreeQuota")
    @Expose
    private Long FreeQuota;

    /**
    * 指标单位
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MetricUnit")
    @Expose
    private String MetricUnit;

    /**
    * 免费量抵扣周期
<li>sum-month:以月为单位抵扣</li>
<li>sum-day:以天为单位抵扣</li>
<li>totalize:总容量抵扣</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeductType")
    @Expose
    private String DeductType;

    /**
    * 免费量类型
<li>basic:通用量抵扣</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FreeQuotaType")
    @Expose
    private String FreeQuotaType;

    /**
     * Get 资源类型
<li>COS</li>
<li>CDN</li>
<li>FLEXDB</li>
<li>SCF</li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceType 资源类型
<li>COS</li>
<li>CDN</li>
<li>FLEXDB</li>
<li>SCF</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 资源类型
<li>COS</li>
<li>CDN</li>
<li>FLEXDB</li>
<li>SCF</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceType 资源类型
<li>COS</li>
<li>CDN</li>
<li>FLEXDB</li>
<li>SCF</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 资源指标名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceMetric 资源指标名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceMetric() {
        return this.ResourceMetric;
    }

    /**
     * Set 资源指标名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceMetric 资源指标名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceMetric(String ResourceMetric) {
        this.ResourceMetric = ResourceMetric;
    }

    /**
     * Get 资源指标免费量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FreeQuota 资源指标免费量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFreeQuota() {
        return this.FreeQuota;
    }

    /**
     * Set 资源指标免费量
注意：此字段可能返回 null，表示取不到有效值。
     * @param FreeQuota 资源指标免费量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFreeQuota(Long FreeQuota) {
        this.FreeQuota = FreeQuota;
    }

    /**
     * Get 指标单位
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MetricUnit 指标单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMetricUnit() {
        return this.MetricUnit;
    }

    /**
     * Set 指标单位
注意：此字段可能返回 null，表示取不到有效值。
     * @param MetricUnit 指标单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetricUnit(String MetricUnit) {
        this.MetricUnit = MetricUnit;
    }

    /**
     * Get 免费量抵扣周期
<li>sum-month:以月为单位抵扣</li>
<li>sum-day:以天为单位抵扣</li>
<li>totalize:总容量抵扣</li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeductType 免费量抵扣周期
<li>sum-month:以月为单位抵扣</li>
<li>sum-day:以天为单位抵扣</li>
<li>totalize:总容量抵扣</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeductType() {
        return this.DeductType;
    }

    /**
     * Set 免费量抵扣周期
<li>sum-month:以月为单位抵扣</li>
<li>sum-day:以天为单位抵扣</li>
<li>totalize:总容量抵扣</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeductType 免费量抵扣周期
<li>sum-month:以月为单位抵扣</li>
<li>sum-day:以天为单位抵扣</li>
<li>totalize:总容量抵扣</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeductType(String DeductType) {
        this.DeductType = DeductType;
    }

    /**
     * Get 免费量类型
<li>basic:通用量抵扣</li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FreeQuotaType 免费量类型
<li>basic:通用量抵扣</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFreeQuotaType() {
        return this.FreeQuotaType;
    }

    /**
     * Set 免费量类型
<li>basic:通用量抵扣</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FreeQuotaType 免费量类型
<li>basic:通用量抵扣</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFreeQuotaType(String FreeQuotaType) {
        this.FreeQuotaType = FreeQuotaType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "ResourceMetric", this.ResourceMetric);
        this.setParamSimple(map, prefix + "FreeQuota", this.FreeQuota);
        this.setParamSimple(map, prefix + "MetricUnit", this.MetricUnit);
        this.setParamSimple(map, prefix + "DeductType", this.DeductType);
        this.setParamSimple(map, prefix + "FreeQuotaType", this.FreeQuotaType);

    }
}

