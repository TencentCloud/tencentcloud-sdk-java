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

public class QueryContractRelateShopResult extends AbstractModel{

    /**
    * 省份
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Province")
    @Expose
    private String Province;

    /**
    * 城市编码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CityId")
    @Expose
    private String CityId;

    /**
    * 门店简称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShopName")
    @Expose
    private String ShopName;

    /**
    * 终端数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TerminalCount")
    @Expose
    private String TerminalCount;

    /**
    * 城市
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * 门店状态（0未审核，1已审核，2审核未通过，3待审核，4已删除，5初审通过）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShopStatus")
    @Expose
    private String ShopStatus;

    /**
    * 若是支付宝合同，支付宝上线状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AliPayOnline")
    @Expose
    private String AliPayOnline;

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
    @SerializedName("Country")
    @Expose
    private String Country;

    /**
    * 若是支付宝合同，支付宝审核状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AliPayStatus")
    @Expose
    private String AliPayStatus;

    /**
    * 为空或者0表示未关联，大于0表示已关联
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsChecked")
    @Expose
    private String IsChecked;

    /**
    * 详细地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * 若是支付宝合同，支付宝审核描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AliPayDesc")
    @Expose
    private String AliPayDesc;

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
     * Get 终端数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TerminalCount 终端数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTerminalCount() {
        return this.TerminalCount;
    }

    /**
     * Set 终端数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param TerminalCount 终端数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTerminalCount(String TerminalCount) {
        this.TerminalCount = TerminalCount;
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
     * Get 门店状态（0未审核，1已审核，2审核未通过，3待审核，4已删除，5初审通过）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShopStatus 门店状态（0未审核，1已审核，2审核未通过，3待审核，4已删除，5初审通过）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getShopStatus() {
        return this.ShopStatus;
    }

    /**
     * Set 门店状态（0未审核，1已审核，2审核未通过，3待审核，4已删除，5初审通过）
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShopStatus 门店状态（0未审核，1已审核，2审核未通过，3待审核，4已删除，5初审通过）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShopStatus(String ShopStatus) {
        this.ShopStatus = ShopStatus;
    }

    /**
     * Get 若是支付宝合同，支付宝上线状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AliPayOnline 若是支付宝合同，支付宝上线状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAliPayOnline() {
        return this.AliPayOnline;
    }

    /**
     * Set 若是支付宝合同，支付宝上线状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param AliPayOnline 若是支付宝合同，支付宝上线状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAliPayOnline(String AliPayOnline) {
        this.AliPayOnline = AliPayOnline;
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
     * @return Country 县/区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCountry() {
        return this.Country;
    }

    /**
     * Set 县/区
注意：此字段可能返回 null，表示取不到有效值。
     * @param Country 县/区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCountry(String Country) {
        this.Country = Country;
    }

    /**
     * Get 若是支付宝合同，支付宝审核状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AliPayStatus 若是支付宝合同，支付宝审核状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAliPayStatus() {
        return this.AliPayStatus;
    }

    /**
     * Set 若是支付宝合同，支付宝审核状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param AliPayStatus 若是支付宝合同，支付宝审核状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAliPayStatus(String AliPayStatus) {
        this.AliPayStatus = AliPayStatus;
    }

    /**
     * Get 为空或者0表示未关联，大于0表示已关联
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsChecked 为空或者0表示未关联，大于0表示已关联
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIsChecked() {
        return this.IsChecked;
    }

    /**
     * Set 为空或者0表示未关联，大于0表示已关联
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsChecked 为空或者0表示未关联，大于0表示已关联
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsChecked(String IsChecked) {
        this.IsChecked = IsChecked;
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
     * Get 若是支付宝合同，支付宝审核描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AliPayDesc 若是支付宝合同，支付宝审核描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAliPayDesc() {
        return this.AliPayDesc;
    }

    /**
     * Set 若是支付宝合同，支付宝审核描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param AliPayDesc 若是支付宝合同，支付宝审核描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAliPayDesc(String AliPayDesc) {
        this.AliPayDesc = AliPayDesc;
    }

    public QueryContractRelateShopResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryContractRelateShopResult(QueryContractRelateShopResult source) {
        if (source.Province != null) {
            this.Province = new String(source.Province);
        }
        if (source.CityId != null) {
            this.CityId = new String(source.CityId);
        }
        if (source.ShopName != null) {
            this.ShopName = new String(source.ShopName);
        }
        if (source.TerminalCount != null) {
            this.TerminalCount = new String(source.TerminalCount);
        }
        if (source.City != null) {
            this.City = new String(source.City);
        }
        if (source.ShopStatus != null) {
            this.ShopStatus = new String(source.ShopStatus);
        }
        if (source.AliPayOnline != null) {
            this.AliPayOnline = new String(source.AliPayOnline);
        }
        if (source.ShopNo != null) {
            this.ShopNo = new String(source.ShopNo);
        }
        if (source.Country != null) {
            this.Country = new String(source.Country);
        }
        if (source.AliPayStatus != null) {
            this.AliPayStatus = new String(source.AliPayStatus);
        }
        if (source.IsChecked != null) {
            this.IsChecked = new String(source.IsChecked);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.AliPayDesc != null) {
            this.AliPayDesc = new String(source.AliPayDesc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "CityId", this.CityId);
        this.setParamSimple(map, prefix + "ShopName", this.ShopName);
        this.setParamSimple(map, prefix + "TerminalCount", this.TerminalCount);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "ShopStatus", this.ShopStatus);
        this.setParamSimple(map, prefix + "AliPayOnline", this.AliPayOnline);
        this.setParamSimple(map, prefix + "ShopNo", this.ShopNo);
        this.setParamSimple(map, prefix + "Country", this.Country);
        this.setParamSimple(map, prefix + "AliPayStatus", this.AliPayStatus);
        this.setParamSimple(map, prefix + "IsChecked", this.IsChecked);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "AliPayDesc", this.AliPayDesc);

    }
}

