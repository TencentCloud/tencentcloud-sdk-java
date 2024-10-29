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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Place extends AbstractModel {

    /**
    * 城市 ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CityId")
    @Expose
    private Long CityId;

    /**
    * 省份 ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProvinceId")
    @Expose
    private Long ProvinceId;

    /**
    * 国家ID，暂只支持国内：1。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CountryId")
    @Expose
    private Long CountryId;

    /**
    * 位置名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
     * Get 城市 ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CityId 城市 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCityId() {
        return this.CityId;
    }

    /**
     * Set 城市 ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CityId 城市 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCityId(Long CityId) {
        this.CityId = CityId;
    }

    /**
     * Get 省份 ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProvinceId 省份 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProvinceId() {
        return this.ProvinceId;
    }

    /**
     * Set 省份 ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProvinceId 省份 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProvinceId(Long ProvinceId) {
        this.ProvinceId = ProvinceId;
    }

    /**
     * Get 国家ID，暂只支持国内：1。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CountryId 国家ID，暂只支持国内：1。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCountryId() {
        return this.CountryId;
    }

    /**
     * Set 国家ID，暂只支持国内：1。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CountryId 国家ID，暂只支持国内：1。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCountryId(Long CountryId) {
        this.CountryId = CountryId;
    }

    /**
     * Get 位置名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Location 位置名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * Set 位置名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Location 位置名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    public Place() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Place(Place source) {
        if (source.CityId != null) {
            this.CityId = new Long(source.CityId);
        }
        if (source.ProvinceId != null) {
            this.ProvinceId = new Long(source.ProvinceId);
        }
        if (source.CountryId != null) {
            this.CountryId = new Long(source.CountryId);
        }
        if (source.Location != null) {
            this.Location = new String(source.Location);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CityId", this.CityId);
        this.setParamSimple(map, prefix + "ProvinceId", this.ProvinceId);
        this.setParamSimple(map, prefix + "CountryId", this.CountryId);
        this.setParamSimple(map, prefix + "Location", this.Location);

    }
}

