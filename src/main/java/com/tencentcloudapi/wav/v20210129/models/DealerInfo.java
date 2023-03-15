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
package com.tencentcloudapi.wav.v20210129.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DealerInfo extends AbstractModel{

    /**
    * 企微SaaS平台经销商id
    */
    @SerializedName("DealerId")
    @Expose
    private Long DealerId;

    /**
    * 经销商名称
    */
    @SerializedName("DealerName")
    @Expose
    private String DealerName;

    /**
    * 所属省份编号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProvinceCode")
    @Expose
    private String ProvinceCode;

    /**
    * 所属城市编号列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CityCodeList")
    @Expose
    private String [] CityCodeList;

    /**
    * 业务覆盖品牌id列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BrandIdList")
    @Expose
    private String [] BrandIdList;

    /**
     * Get 企微SaaS平台经销商id 
     * @return DealerId 企微SaaS平台经销商id
     */
    public Long getDealerId() {
        return this.DealerId;
    }

    /**
     * Set 企微SaaS平台经销商id
     * @param DealerId 企微SaaS平台经销商id
     */
    public void setDealerId(Long DealerId) {
        this.DealerId = DealerId;
    }

    /**
     * Get 经销商名称 
     * @return DealerName 经销商名称
     */
    public String getDealerName() {
        return this.DealerName;
    }

    /**
     * Set 经销商名称
     * @param DealerName 经销商名称
     */
    public void setDealerName(String DealerName) {
        this.DealerName = DealerName;
    }

    /**
     * Get 所属省份编号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProvinceCode 所属省份编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProvinceCode() {
        return this.ProvinceCode;
    }

    /**
     * Set 所属省份编号
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProvinceCode 所属省份编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProvinceCode(String ProvinceCode) {
        this.ProvinceCode = ProvinceCode;
    }

    /**
     * Get 所属城市编号列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CityCodeList 所属城市编号列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getCityCodeList() {
        return this.CityCodeList;
    }

    /**
     * Set 所属城市编号列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param CityCodeList 所属城市编号列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCityCodeList(String [] CityCodeList) {
        this.CityCodeList = CityCodeList;
    }

    /**
     * Get 业务覆盖品牌id列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BrandIdList 业务覆盖品牌id列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getBrandIdList() {
        return this.BrandIdList;
    }

    /**
     * Set 业务覆盖品牌id列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param BrandIdList 业务覆盖品牌id列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBrandIdList(String [] BrandIdList) {
        this.BrandIdList = BrandIdList;
    }

    public DealerInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DealerInfo(DealerInfo source) {
        if (source.DealerId != null) {
            this.DealerId = new Long(source.DealerId);
        }
        if (source.DealerName != null) {
            this.DealerName = new String(source.DealerName);
        }
        if (source.ProvinceCode != null) {
            this.ProvinceCode = new String(source.ProvinceCode);
        }
        if (source.CityCodeList != null) {
            this.CityCodeList = new String[source.CityCodeList.length];
            for (int i = 0; i < source.CityCodeList.length; i++) {
                this.CityCodeList[i] = new String(source.CityCodeList[i]);
            }
        }
        if (source.BrandIdList != null) {
            this.BrandIdList = new String[source.BrandIdList.length];
            for (int i = 0; i < source.BrandIdList.length; i++) {
                this.BrandIdList[i] = new String(source.BrandIdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DealerId", this.DealerId);
        this.setParamSimple(map, prefix + "DealerName", this.DealerName);
        this.setParamSimple(map, prefix + "ProvinceCode", this.ProvinceCode);
        this.setParamArraySimple(map, prefix + "CityCodeList.", this.CityCodeList);
        this.setParamArraySimple(map, prefix + "BrandIdList.", this.BrandIdList);

    }
}

