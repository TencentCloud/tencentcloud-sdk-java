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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CityCodeResult extends AbstractModel{

    /**
    * 城市编码cityid，数字与字母的结合
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CityId")
    @Expose
    private String CityId;

    /**
    * 省份
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Province")
    @Expose
    private String Province;

    /**
    * 县区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("District")
    @Expose
    private String District;

    /**
    * 城市
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
     * Get 城市编码cityid，数字与字母的结合
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CityId 城市编码cityid，数字与字母的结合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCityId() {
        return this.CityId;
    }

    /**
     * Set 城市编码cityid，数字与字母的结合
注意：此字段可能返回 null，表示取不到有效值。
     * @param CityId 城市编码cityid，数字与字母的结合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCityId(String CityId) {
        this.CityId = CityId;
    }

    /**
     * Get 省份
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Province 省份
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProvince() {
        return this.Province;
    }

    /**
     * Set 省份
注意：此字段可能返回 null，表示取不到有效值。
     * @param Province 省份
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProvince(String Province) {
        this.Province = Province;
    }

    /**
     * Get 县区
注意：此字段可能返回 null，表示取不到有效值。 
     * @return District 县区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDistrict() {
        return this.District;
    }

    /**
     * Set 县区
注意：此字段可能返回 null，表示取不到有效值。
     * @param District 县区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDistrict(String District) {
        this.District = District;
    }

    /**
     * Get 城市
注意：此字段可能返回 null，表示取不到有效值。 
     * @return City 城市
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set 城市
注意：此字段可能返回 null，表示取不到有效值。
     * @param City 城市
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCity(String City) {
        this.City = City;
    }

    public CityCodeResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CityCodeResult(CityCodeResult source) {
        if (source.CityId != null) {
            this.CityId = new String(source.CityId);
        }
        if (source.Province != null) {
            this.Province = new String(source.Province);
        }
        if (source.District != null) {
            this.District = new String(source.District);
        }
        if (source.City != null) {
            this.City = new String(source.City);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CityId", this.CityId);
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "District", this.District);
        this.setParamSimple(map, prefix + "City", this.City);

    }
}

