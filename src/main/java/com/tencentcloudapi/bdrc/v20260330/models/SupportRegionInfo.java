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
package com.tencentcloudapi.bdrc.v20260330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SupportRegionInfo extends AbstractModel {

    /**
    * 生产地域。
    */
    @SerializedName("SourceRegion")
    @Expose
    private String SourceRegion;

    /**
    * 支持类型：REGION（地域级，整个生产地域均支持容灾）；ZONE（可用区级，按 SupportZoneRules 控制粒度）。
    */
    @SerializedName("SupportType")
    @Expose
    private String SupportType;

    /**
    * 配置状态：valid（生效）/ invalid（停用）。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 可用区级容灾规则列表。仅当 SupportType=ZONE 时有效；REGION 类型时该字段返回空数组。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SupportZoneRules")
    @Expose
    private SupportZoneRule [] SupportZoneRules;

    /**
     * Get 生产地域。 
     * @return SourceRegion 生产地域。
     */
    public String getSourceRegion() {
        return this.SourceRegion;
    }

    /**
     * Set 生产地域。
     * @param SourceRegion 生产地域。
     */
    public void setSourceRegion(String SourceRegion) {
        this.SourceRegion = SourceRegion;
    }

    /**
     * Get 支持类型：REGION（地域级，整个生产地域均支持容灾）；ZONE（可用区级，按 SupportZoneRules 控制粒度）。 
     * @return SupportType 支持类型：REGION（地域级，整个生产地域均支持容灾）；ZONE（可用区级，按 SupportZoneRules 控制粒度）。
     */
    public String getSupportType() {
        return this.SupportType;
    }

    /**
     * Set 支持类型：REGION（地域级，整个生产地域均支持容灾）；ZONE（可用区级，按 SupportZoneRules 控制粒度）。
     * @param SupportType 支持类型：REGION（地域级，整个生产地域均支持容灾）；ZONE（可用区级，按 SupportZoneRules 控制粒度）。
     */
    public void setSupportType(String SupportType) {
        this.SupportType = SupportType;
    }

    /**
     * Get 配置状态：valid（生效）/ invalid（停用）。 
     * @return Status 配置状态：valid（生效）/ invalid（停用）。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 配置状态：valid（生效）/ invalid（停用）。
     * @param Status 配置状态：valid（生效）/ invalid（停用）。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 可用区级容灾规则列表。仅当 SupportType=ZONE 时有效；REGION 类型时该字段返回空数组。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SupportZoneRules 可用区级容灾规则列表。仅当 SupportType=ZONE 时有效；REGION 类型时该字段返回空数组。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SupportZoneRule [] getSupportZoneRules() {
        return this.SupportZoneRules;
    }

    /**
     * Set 可用区级容灾规则列表。仅当 SupportType=ZONE 时有效；REGION 类型时该字段返回空数组。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SupportZoneRules 可用区级容灾规则列表。仅当 SupportType=ZONE 时有效；REGION 类型时该字段返回空数组。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSupportZoneRules(SupportZoneRule [] SupportZoneRules) {
        this.SupportZoneRules = SupportZoneRules;
    }

    public SupportRegionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SupportRegionInfo(SupportRegionInfo source) {
        if (source.SourceRegion != null) {
            this.SourceRegion = new String(source.SourceRegion);
        }
        if (source.SupportType != null) {
            this.SupportType = new String(source.SupportType);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.SupportZoneRules != null) {
            this.SupportZoneRules = new SupportZoneRule[source.SupportZoneRules.length];
            for (int i = 0; i < source.SupportZoneRules.length; i++) {
                this.SupportZoneRules[i] = new SupportZoneRule(source.SupportZoneRules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceRegion", this.SourceRegion);
        this.setParamSimple(map, prefix + "SupportType", this.SupportType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "SupportZoneRules.", this.SupportZoneRules);

    }
}

