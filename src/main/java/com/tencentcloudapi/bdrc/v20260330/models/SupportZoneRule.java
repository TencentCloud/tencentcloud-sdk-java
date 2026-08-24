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

public class SupportZoneRule extends AbstractModel {

    /**
    * 生产可用区。
    */
    @SerializedName("SourceZone")
    @Expose
    private String SourceZone;

    /**
    * 是否支持容灾到生产地域内的全部可用区。true 时 TargetZones 可忽略。
    */
    @SerializedName("IsAllZoneSupport")
    @Expose
    private Boolean IsAllZoneSupport;

    /**
    * 目标可用区列表。当 IsAllZoneSupport=false 时枚举具体可容灾到的可用区。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetZones")
    @Expose
    private String [] TargetZones;

    /**
     * Get 生产可用区。 
     * @return SourceZone 生产可用区。
     */
    public String getSourceZone() {
        return this.SourceZone;
    }

    /**
     * Set 生产可用区。
     * @param SourceZone 生产可用区。
     */
    public void setSourceZone(String SourceZone) {
        this.SourceZone = SourceZone;
    }

    /**
     * Get 是否支持容灾到生产地域内的全部可用区。true 时 TargetZones 可忽略。 
     * @return IsAllZoneSupport 是否支持容灾到生产地域内的全部可用区。true 时 TargetZones 可忽略。
     */
    public Boolean getIsAllZoneSupport() {
        return this.IsAllZoneSupport;
    }

    /**
     * Set 是否支持容灾到生产地域内的全部可用区。true 时 TargetZones 可忽略。
     * @param IsAllZoneSupport 是否支持容灾到生产地域内的全部可用区。true 时 TargetZones 可忽略。
     */
    public void setIsAllZoneSupport(Boolean IsAllZoneSupport) {
        this.IsAllZoneSupport = IsAllZoneSupport;
    }

    /**
     * Get 目标可用区列表。当 IsAllZoneSupport=false 时枚举具体可容灾到的可用区。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetZones 目标可用区列表。当 IsAllZoneSupport=false 时枚举具体可容灾到的可用区。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getTargetZones() {
        return this.TargetZones;
    }

    /**
     * Set 目标可用区列表。当 IsAllZoneSupport=false 时枚举具体可容灾到的可用区。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetZones 目标可用区列表。当 IsAllZoneSupport=false 时枚举具体可容灾到的可用区。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetZones(String [] TargetZones) {
        this.TargetZones = TargetZones;
    }

    public SupportZoneRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SupportZoneRule(SupportZoneRule source) {
        if (source.SourceZone != null) {
            this.SourceZone = new String(source.SourceZone);
        }
        if (source.IsAllZoneSupport != null) {
            this.IsAllZoneSupport = new Boolean(source.IsAllZoneSupport);
        }
        if (source.TargetZones != null) {
            this.TargetZones = new String[source.TargetZones.length];
            for (int i = 0; i < source.TargetZones.length; i++) {
                this.TargetZones[i] = new String(source.TargetZones[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceZone", this.SourceZone);
        this.setParamSimple(map, prefix + "IsAllZoneSupport", this.IsAllZoneSupport);
        this.setParamArraySimple(map, prefix + "TargetZones.", this.TargetZones);

    }
}

