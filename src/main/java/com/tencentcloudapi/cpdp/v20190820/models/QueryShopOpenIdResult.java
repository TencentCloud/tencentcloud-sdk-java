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

public class QueryShopOpenIdResult extends AbstractModel{

    /**
    * 省份
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Province")
    @Expose
    private String Province;

    /**
    * 城市
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * 门店简称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShopName")
    @Expose
    private String ShopName;

    /**
    * 商户编号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MerchantNo")
    @Expose
    private String MerchantNo;

    /**
    * 城市编码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CityId")
    @Expose
    private String CityId;

    /**
    * open_id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OpenId")
    @Expose
    private String OpenId;

    /**
    * 门店电话
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Telephone")
    @Expose
    private String Telephone;

    /**
    * 门店编号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShopNo")
    @Expose
    private String ShopNo;

    /**
    * 县/区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("County")
    @Expose
    private String County;

    /**
    * 门店全称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShopFullName")
    @Expose
    private String ShopFullName;

    /**
    * 品牌名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BrandName")
    @Expose
    private String BrandName;

    /**
    * 详细地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * open_key
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OpenKey")
    @Expose
    private String OpenKey;

    /**
    * 商户名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MerchantName")
    @Expose
    private String MerchantName;

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

    /**
     * Get 门店简称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShopName 门店简称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getShopName() {
        return this.ShopName;
    }

    /**
     * Set 门店简称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShopName 门店简称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShopName(String ShopName) {
        this.ShopName = ShopName;
    }

    /**
     * Get 商户编号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MerchantNo 商户编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMerchantNo() {
        return this.MerchantNo;
    }

    /**
     * Set 商户编号
注意：此字段可能返回 null，表示取不到有效值。
     * @param MerchantNo 商户编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMerchantNo(String MerchantNo) {
        this.MerchantNo = MerchantNo;
    }

    /**
     * Get 城市编码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CityId 城市编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCityId() {
        return this.CityId;
    }

    /**
     * Set 城市编码
注意：此字段可能返回 null，表示取不到有效值。
     * @param CityId 城市编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCityId(String CityId) {
        this.CityId = CityId;
    }

    /**
     * Get open_id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OpenId open_id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOpenId() {
        return this.OpenId;
    }

    /**
     * Set open_id
注意：此字段可能返回 null，表示取不到有效值。
     * @param OpenId open_id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
    }

    /**
     * Get 门店电话
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Telephone 门店电话
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTelephone() {
        return this.Telephone;
    }

    /**
     * Set 门店电话
注意：此字段可能返回 null，表示取不到有效值。
     * @param Telephone 门店电话
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTelephone(String Telephone) {
        this.Telephone = Telephone;
    }

    /**
     * Get 门店编号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShopNo 门店编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getShopNo() {
        return this.ShopNo;
    }

    /**
     * Set 门店编号
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShopNo 门店编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShopNo(String ShopNo) {
        this.ShopNo = ShopNo;
    }

    /**
     * Get 县/区
注意：此字段可能返回 null，表示取不到有效值。 
     * @return County 县/区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCounty() {
        return this.County;
    }

    /**
     * Set 县/区
注意：此字段可能返回 null，表示取不到有效值。
     * @param County 县/区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCounty(String County) {
        this.County = County;
    }

    /**
     * Get 门店全称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShopFullName 门店全称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getShopFullName() {
        return this.ShopFullName;
    }

    /**
     * Set 门店全称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShopFullName 门店全称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShopFullName(String ShopFullName) {
        this.ShopFullName = ShopFullName;
    }

    /**
     * Get 品牌名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BrandName 品牌名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBrandName() {
        return this.BrandName;
    }

    /**
     * Set 品牌名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param BrandName 品牌名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBrandName(String BrandName) {
        this.BrandName = BrandName;
    }

    /**
     * Get 详细地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Address 详细地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set 详细地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param Address 详细地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get open_key
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OpenKey open_key
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOpenKey() {
        return this.OpenKey;
    }

    /**
     * Set open_key
注意：此字段可能返回 null，表示取不到有效值。
     * @param OpenKey open_key
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOpenKey(String OpenKey) {
        this.OpenKey = OpenKey;
    }

    /**
     * Get 商户名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MerchantName 商户名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMerchantName() {
        return this.MerchantName;
    }

    /**
     * Set 商户名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param MerchantName 商户名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMerchantName(String MerchantName) {
        this.MerchantName = MerchantName;
    }

    public QueryShopOpenIdResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryShopOpenIdResult(QueryShopOpenIdResult source) {
        if (source.Province != null) {
            this.Province = new String(source.Province);
        }
        if (source.City != null) {
            this.City = new String(source.City);
        }
        if (source.ShopName != null) {
            this.ShopName = new String(source.ShopName);
        }
        if (source.MerchantNo != null) {
            this.MerchantNo = new String(source.MerchantNo);
        }
        if (source.CityId != null) {
            this.CityId = new String(source.CityId);
        }
        if (source.OpenId != null) {
            this.OpenId = new String(source.OpenId);
        }
        if (source.Telephone != null) {
            this.Telephone = new String(source.Telephone);
        }
        if (source.ShopNo != null) {
            this.ShopNo = new String(source.ShopNo);
        }
        if (source.County != null) {
            this.County = new String(source.County);
        }
        if (source.ShopFullName != null) {
            this.ShopFullName = new String(source.ShopFullName);
        }
        if (source.BrandName != null) {
            this.BrandName = new String(source.BrandName);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.OpenKey != null) {
            this.OpenKey = new String(source.OpenKey);
        }
        if (source.MerchantName != null) {
            this.MerchantName = new String(source.MerchantName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "ShopName", this.ShopName);
        this.setParamSimple(map, prefix + "MerchantNo", this.MerchantNo);
        this.setParamSimple(map, prefix + "CityId", this.CityId);
        this.setParamSimple(map, prefix + "OpenId", this.OpenId);
        this.setParamSimple(map, prefix + "Telephone", this.Telephone);
        this.setParamSimple(map, prefix + "ShopNo", this.ShopNo);
        this.setParamSimple(map, prefix + "County", this.County);
        this.setParamSimple(map, prefix + "ShopFullName", this.ShopFullName);
        this.setParamSimple(map, prefix + "BrandName", this.BrandName);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "OpenKey", this.OpenKey);
        this.setParamSimple(map, prefix + "MerchantName", this.MerchantName);

    }
}

