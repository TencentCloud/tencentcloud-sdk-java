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
package com.tencentcloudapi.region.v20220627.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegionInfo extends AbstractModel{

    /**
    * 地域名称，例如，ap-guangzhou
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 地域描述，例如，华南地区(广州)
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * 地域是否可用状态
    */
    @SerializedName("RegionState")
    @Expose
    private String RegionState;

    /**
    * 控制台类型，api调用时默认null
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegionTypeMC")
    @Expose
    private Long RegionTypeMC;

    /**
    * 不同语言的地区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LocationMC")
    @Expose
    private String LocationMC;

    /**
    * 控制台展示的地域描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegionNameMC")
    @Expose
    private String RegionNameMC;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegionIdMC")
    @Expose
    private String RegionIdMC;

    /**
     * Get 地域名称，例如，ap-guangzhou 
     * @return Region 地域名称，例如，ap-guangzhou
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域名称，例如，ap-guangzhou
     * @param Region 地域名称，例如，ap-guangzhou
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 地域描述，例如，华南地区(广州) 
     * @return RegionName 地域描述，例如，华南地区(广州)
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set 地域描述，例如，华南地区(广州)
     * @param RegionName 地域描述，例如，华南地区(广州)
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get 地域是否可用状态 
     * @return RegionState 地域是否可用状态
     */
    public String getRegionState() {
        return this.RegionState;
    }

    /**
     * Set 地域是否可用状态
     * @param RegionState 地域是否可用状态
     */
    public void setRegionState(String RegionState) {
        this.RegionState = RegionState;
    }

    /**
     * Get 控制台类型，api调用时默认null
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegionTypeMC 控制台类型，api调用时默认null
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRegionTypeMC() {
        return this.RegionTypeMC;
    }

    /**
     * Set 控制台类型，api调用时默认null
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegionTypeMC 控制台类型，api调用时默认null
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegionTypeMC(Long RegionTypeMC) {
        this.RegionTypeMC = RegionTypeMC;
    }

    /**
     * Get 不同语言的地区
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LocationMC 不同语言的地区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLocationMC() {
        return this.LocationMC;
    }

    /**
     * Set 不同语言的地区
注意：此字段可能返回 null，表示取不到有效值。
     * @param LocationMC 不同语言的地区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLocationMC(String LocationMC) {
        this.LocationMC = LocationMC;
    }

    /**
     * Get 控制台展示的地域描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegionNameMC 控制台展示的地域描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegionNameMC() {
        return this.RegionNameMC;
    }

    /**
     * Set 控制台展示的地域描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegionNameMC 控制台展示的地域描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegionNameMC(String RegionNameMC) {
        this.RegionNameMC = RegionNameMC;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegionIdMC 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegionIdMC() {
        return this.RegionIdMC;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegionIdMC 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegionIdMC(String RegionIdMC) {
        this.RegionIdMC = RegionIdMC;
    }

    public RegionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegionInfo(RegionInfo source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
        if (source.RegionState != null) {
            this.RegionState = new String(source.RegionState);
        }
        if (source.RegionTypeMC != null) {
            this.RegionTypeMC = new Long(source.RegionTypeMC);
        }
        if (source.LocationMC != null) {
            this.LocationMC = new String(source.LocationMC);
        }
        if (source.RegionNameMC != null) {
            this.RegionNameMC = new String(source.RegionNameMC);
        }
        if (source.RegionIdMC != null) {
            this.RegionIdMC = new String(source.RegionIdMC);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "RegionState", this.RegionState);
        this.setParamSimple(map, prefix + "RegionTypeMC", this.RegionTypeMC);
        this.setParamSimple(map, prefix + "LocationMC", this.LocationMC);
        this.setParamSimple(map, prefix + "RegionNameMC", this.RegionNameMC);
        this.setParamSimple(map, prefix + "RegionIdMC", this.RegionIdMC);

    }
}

