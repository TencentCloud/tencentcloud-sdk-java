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

public class PostPaidEnvDeductInfo extends AbstractModel{

    /**
    * 资源方
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * 指标名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * 按量计费详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResQuota")
    @Expose
    private Float ResQuota;

    /**
    * 资源包抵扣详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PkgQuota")
    @Expose
    private Float PkgQuota;

    /**
    * 免费额度抵扣详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FreeQuota")
    @Expose
    private Float FreeQuota;

    /**
    * 环境id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
     * Get 资源方
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceType 资源方
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 资源方
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceType 资源方
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 指标名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MetricName 指标名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set 指标名
注意：此字段可能返回 null，表示取不到有效值。
     * @param MetricName 指标名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get 按量计费详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResQuota 按量计费详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getResQuota() {
        return this.ResQuota;
    }

    /**
     * Set 按量计费详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResQuota 按量计费详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResQuota(Float ResQuota) {
        this.ResQuota = ResQuota;
    }

    /**
     * Get 资源包抵扣详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PkgQuota 资源包抵扣详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getPkgQuota() {
        return this.PkgQuota;
    }

    /**
     * Set 资源包抵扣详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param PkgQuota 资源包抵扣详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPkgQuota(Float PkgQuota) {
        this.PkgQuota = PkgQuota;
    }

    /**
     * Get 免费额度抵扣详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FreeQuota 免费额度抵扣详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getFreeQuota() {
        return this.FreeQuota;
    }

    /**
     * Set 免费额度抵扣详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param FreeQuota 免费额度抵扣详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFreeQuota(Float FreeQuota) {
        this.FreeQuota = FreeQuota;
    }

    /**
     * Get 环境id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnvId 环境id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 环境id
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnvId 环境id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    public PostPaidEnvDeductInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PostPaidEnvDeductInfo(PostPaidEnvDeductInfo source) {
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.ResQuota != null) {
            this.ResQuota = new Float(source.ResQuota);
        }
        if (source.PkgQuota != null) {
            this.PkgQuota = new Float(source.PkgQuota);
        }
        if (source.FreeQuota != null) {
            this.FreeQuota = new Float(source.FreeQuota);
        }
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "ResQuota", this.ResQuota);
        this.setParamSimple(map, prefix + "PkgQuota", this.PkgQuota);
        this.setParamSimple(map, prefix + "FreeQuota", this.FreeQuota);
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);

    }
}

