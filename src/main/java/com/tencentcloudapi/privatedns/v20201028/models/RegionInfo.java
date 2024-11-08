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
package com.tencentcloudapi.privatedns.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegionInfo extends AbstractModel {

    /**
    * 地域编码
    */
    @SerializedName("RegionCode")
    @Expose
    private String RegionCode;

    /**
    * 地域中文名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CnName")
    @Expose
    private String CnName;

    /**
    * 地域英文名
    */
    @SerializedName("EnName")
    @Expose
    private String EnName;

    /**
    * 地域ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * 可用区数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AvailableZoneNum")
    @Expose
    private Long AvailableZoneNum;

    /**
     * Get 地域编码 
     * @return RegionCode 地域编码
     */
    public String getRegionCode() {
        return this.RegionCode;
    }

    /**
     * Set 地域编码
     * @param RegionCode 地域编码
     */
    public void setRegionCode(String RegionCode) {
        this.RegionCode = RegionCode;
    }

    /**
     * Get 地域中文名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CnName 地域中文名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCnName() {
        return this.CnName;
    }

    /**
     * Set 地域中文名
注意：此字段可能返回 null，表示取不到有效值。
     * @param CnName 地域中文名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCnName(String CnName) {
        this.CnName = CnName;
    }

    /**
     * Get 地域英文名 
     * @return EnName 地域英文名
     */
    public String getEnName() {
        return this.EnName;
    }

    /**
     * Set 地域英文名
     * @param EnName 地域英文名
     */
    public void setEnName(String EnName) {
        this.EnName = EnName;
    }

    /**
     * Get 地域ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegionId 地域ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 地域ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegionId 地域ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 可用区数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AvailableZoneNum 可用区数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAvailableZoneNum() {
        return this.AvailableZoneNum;
    }

    /**
     * Set 可用区数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param AvailableZoneNum 可用区数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAvailableZoneNum(Long AvailableZoneNum) {
        this.AvailableZoneNum = AvailableZoneNum;
    }

    public RegionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegionInfo(RegionInfo source) {
        if (source.RegionCode != null) {
            this.RegionCode = new String(source.RegionCode);
        }
        if (source.CnName != null) {
            this.CnName = new String(source.CnName);
        }
        if (source.EnName != null) {
            this.EnName = new String(source.EnName);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.AvailableZoneNum != null) {
            this.AvailableZoneNum = new Long(source.AvailableZoneNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegionCode", this.RegionCode);
        this.setParamSimple(map, prefix + "CnName", this.CnName);
        this.setParamSimple(map, prefix + "EnName", this.EnName);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "AvailableZoneNum", this.AvailableZoneNum);

    }
}

