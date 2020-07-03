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
package com.tencentcloudapi.dts.v20180330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubscribeRegionConf extends AbstractModel{

    /**
    * 地域名称，如广州
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * 地区标识，如ap-guangzhou
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 地域名称，如华南地区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * 是否为默认地域，0 - 不是，1 - 是的
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsDefaultRegion")
    @Expose
    private Long IsDefaultRegion;

    /**
    * 当前地域的售卖情况，1 - 正常， 2-灰度，3 - 停售
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 地域名称，如广州
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegionName 地域名称，如广州
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set 地域名称，如广州
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegionName 地域名称，如广州
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get 地区标识，如ap-guangzhou
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region 地区标识，如ap-guangzhou
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地区标识，如ap-guangzhou
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region 地区标识，如ap-guangzhou
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 地域名称，如华南地区
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Area 地域名称，如华南地区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 地域名称，如华南地区
注意：此字段可能返回 null，表示取不到有效值。
     * @param Area 地域名称，如华南地区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get 是否为默认地域，0 - 不是，1 - 是的
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsDefaultRegion 是否为默认地域，0 - 不是，1 - 是的
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsDefaultRegion() {
        return this.IsDefaultRegion;
    }

    /**
     * Set 是否为默认地域，0 - 不是，1 - 是的
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsDefaultRegion 是否为默认地域，0 - 不是，1 - 是的
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsDefaultRegion(Long IsDefaultRegion) {
        this.IsDefaultRegion = IsDefaultRegion;
    }

    /**
     * Get 当前地域的售卖情况，1 - 正常， 2-灰度，3 - 停售
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 当前地域的售卖情况，1 - 正常， 2-灰度，3 - 停售
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 当前地域的售卖情况，1 - 正常， 2-灰度，3 - 停售
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 当前地域的售卖情况，1 - 正常， 2-灰度，3 - 停售
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "IsDefaultRegion", this.IsDefaultRegion);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

