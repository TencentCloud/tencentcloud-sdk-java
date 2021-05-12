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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Region extends AbstractModel{

    /**
    * 地域ID
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * 地域名称
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * 区域名称
    */
    @SerializedName("AreaName")
    @Expose
    private String AreaName;

    /**
    * 地域代码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegionCode")
    @Expose
    private String RegionCode;

    /**
    * 地域代码（V3版本）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegionCodeV3")
    @Expose
    private String RegionCodeV3;

    /**
    * NONE:默认值不支持任何特殊机型\nCVM:支持CVM类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Support")
    @Expose
    private String Support;

    /**
    * 是否支持ipv6, 0：表示不支持，1：表示支持
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ipv6")
    @Expose
    private Long Ipv6;

    /**
    * 是否支持跨可用区, 0：表示不支持，1：表示支持
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MultiZone")
    @Expose
    private Long MultiZone;

    /**
     * Get 地域ID 
     * @return RegionId 地域ID
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 地域ID
     * @param RegionId 地域ID
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 地域名称 
     * @return RegionName 地域名称
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set 地域名称
     * @param RegionName 地域名称
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get 区域名称 
     * @return AreaName 区域名称
     */
    public String getAreaName() {
        return this.AreaName;
    }

    /**
     * Set 区域名称
     * @param AreaName 区域名称
     */
    public void setAreaName(String AreaName) {
        this.AreaName = AreaName;
    }

    /**
     * Get 地域代码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegionCode 地域代码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegionCode() {
        return this.RegionCode;
    }

    /**
     * Set 地域代码
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegionCode 地域代码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegionCode(String RegionCode) {
        this.RegionCode = RegionCode;
    }

    /**
     * Get 地域代码（V3版本）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegionCodeV3 地域代码（V3版本）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegionCodeV3() {
        return this.RegionCodeV3;
    }

    /**
     * Set 地域代码（V3版本）
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegionCodeV3 地域代码（V3版本）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegionCodeV3(String RegionCodeV3) {
        this.RegionCodeV3 = RegionCodeV3;
    }

    /**
     * Get NONE:默认值不支持任何特殊机型\nCVM:支持CVM类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Support NONE:默认值不支持任何特殊机型\nCVM:支持CVM类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSupport() {
        return this.Support;
    }

    /**
     * Set NONE:默认值不支持任何特殊机型\nCVM:支持CVM类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Support NONE:默认值不支持任何特殊机型\nCVM:支持CVM类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSupport(String Support) {
        this.Support = Support;
    }

    /**
     * Get 是否支持ipv6, 0：表示不支持，1：表示支持
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ipv6 是否支持ipv6, 0：表示不支持，1：表示支持
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIpv6() {
        return this.Ipv6;
    }

    /**
     * Set 是否支持ipv6, 0：表示不支持，1：表示支持
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ipv6 是否支持ipv6, 0：表示不支持，1：表示支持
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpv6(Long Ipv6) {
        this.Ipv6 = Ipv6;
    }

    /**
     * Get 是否支持跨可用区, 0：表示不支持，1：表示支持
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MultiZone 是否支持跨可用区, 0：表示不支持，1：表示支持
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMultiZone() {
        return this.MultiZone;
    }

    /**
     * Set 是否支持跨可用区, 0：表示不支持，1：表示支持
注意：此字段可能返回 null，表示取不到有效值。
     * @param MultiZone 是否支持跨可用区, 0：表示不支持，1：表示支持
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMultiZone(Long MultiZone) {
        this.MultiZone = MultiZone;
    }

    public Region() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Region(Region source) {
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
        if (source.AreaName != null) {
            this.AreaName = new String(source.AreaName);
        }
        if (source.RegionCode != null) {
            this.RegionCode = new String(source.RegionCode);
        }
        if (source.RegionCodeV3 != null) {
            this.RegionCodeV3 = new String(source.RegionCodeV3);
        }
        if (source.Support != null) {
            this.Support = new String(source.Support);
        }
        if (source.Ipv6 != null) {
            this.Ipv6 = new Long(source.Ipv6);
        }
        if (source.MultiZone != null) {
            this.MultiZone = new Long(source.MultiZone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "AreaName", this.AreaName);
        this.setParamSimple(map, prefix + "RegionCode", this.RegionCode);
        this.setParamSimple(map, prefix + "RegionCodeV3", this.RegionCodeV3);
        this.setParamSimple(map, prefix + "Support", this.Support);
        this.setParamSimple(map, prefix + "Ipv6", this.Ipv6);
        this.setParamSimple(map, prefix + "MultiZone", this.MultiZone);

    }
}

